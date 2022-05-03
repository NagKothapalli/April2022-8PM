package seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ApsrtcAutomation //extends ReadProperties
{
	String expectedValue = "Gmail";
	ChromeDriver driver; //null
	ReadProperties prop;
	public ApsrtcAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver();//It will open an empty google chrome browser  ,SessionID = 1234
		prop = new ReadProperties("TestData/ApsrtcDev.properties");
	}
	//Relative Xpath with parent child relationship
	
		//div[@class='search']//input[@name='source']
	@Before
	public void launchApplication() throws IOException
	{
		//driver.get("https://www.apsrtconline.in/"); //Hard coded URL //Dev , QA , Stage , Prod
		driver.get(prop.getData("URL"));
	}
	String name; //null
	@Test
	public void demonstrateUnCheckedException()
	{
		int ans = 44 / 0; //Run time exception | UnChecked Exception
		String stdName = "Ram";
		if(name.equals(stdName))  //null.equal("Ram") //Run time exception | UnChecked Exception
		{
			System.out.println("Both Names are same");
		}
		else
		{
			System.out.println("Both Names are not same");
		}
	}
	@Test
	public void readTestData() throws IOException   
	{   
		
		FileInputStream myfile = new FileInputStream("TestData/ApsrtcDev.properties"); //Checked Exception
		//myfile is like a news paper
		//properties class in like news reader
		Properties myprop = new Properties();
		myprop.load(myfile);
		System.out.println(myprop.getProperty("URL"));
		System.out.println(myprop.getProperty("FromCity"));
		System.out.println(myprop.getProperty("ToCity"));
		String mydate = myprop.getProperty("JDate");
		System.out.println(mydate);
	}
	
	
	@Test
	public void keyboard() throws InterruptedException
	{
		System.out.println("Test Case : Book Ticket");
		WebElement fromCity = driver.findElement(By.xpath("//div[@class='search']//input[@name='source']"));
		Actions actions = new Actions(driver);
		//actions.moveToElement(fromCity).click().sendKeys("HYDERABAD").pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		actions.moveToElement(fromCity).click().sendKeys("HYDERABAD").pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).pause(Duration.ofSeconds(1)).doubleClick().contextClick().build().perform();
	}
	//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	@Test
	public void multipleWindows() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@title='TimeTable / Track']")).click();
		driver.findElement(By.xpath("//a[text()='All services Time Table & Tracking']")).click();
		Set<String> allwindows = driver.getWindowHandles();
		ArrayList<String>  windows = new ArrayList<String>(allwindows);
		for(int i=0;i<windows.size();i++)
		{
			System.out.println(windows.get(i));
		}
		driver.switchTo().window(windows.get(1));
		String secondTitle = driver.getTitle();
		System.out.println("Second Window :" + secondTitle );
		driver.close();
		//driver.quit(); //after quit method driver = null
		driver.switchTo().window(windows.get(0));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Home']")).click();	
		driver.quit();
	}
	//.properties    , .txt , .doc ,.xls  , .xml , .json
	@Test
	public void bookTicket() throws InterruptedException, IOException
	{
		System.out.println("Test Case : Book Ticket");
		driver.findElement(By.xpath("//div[@class='search']//input[@name='source']")).sendKeys(prop.getData("FromCity")); //Hard coded
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@value='Check Availability']")).click();
		driver.switchTo().alert().accept();
		//driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR"); //Hard coded
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys(prop.getData("ToCity"));
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).build().perform();	
		//select date
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		selectDate(prop.getData("JDate")); //hard coded
		driver.findElement(By.xpath("//input[@value='Check Availability']")).click();
	}
	@Test
	public void bookTicket_DataDriven() throws InterruptedException, IOException
	{
		String cities = prop.getData("FromCities").trim();
		String[] fromcities = cities.split(",");
		String[] tocities = prop.getData("ToCities").trim().split(",");
		String[] jDates = prop.getData("JDates").trim().split(",");
		for(int i=0;i<fromcities.length;i++)
		{
			System.out.println("Iteration :" + (i+1));
			System.out.println("Test Case : Book Ticket");
			driver.findElement(By.xpath("//div[@class='search']//input[@name='source']")).sendKeys(fromcities[i]); //Hard coded
			Actions actions = new Actions(driver);
			Thread.sleep(1000);
			actions.sendKeys(Keys.ENTER).build().perform();
			driver.findElement(By.xpath("//input[@value='Check Availability']")).click();
			driver.switchTo().alert().accept();
			//driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR"); //Hard coded
			driver.findElement(By.xpath("//input[@name='destination']")).sendKeys(tocities[i]);
			Thread.sleep(1000);
			actions.sendKeys(Keys.ENTER).build().perform();	
			//select date
			driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
			selectDate(jDates[i]); //hard coded
			driver.findElement(By.xpath("//input[@value='Check Availability']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@title='Home']")).click();	
		}
		
	}
	//Dynamic Xpath
	public void selectDate(String jDate)
	{
		driver.findElement(By.xpath("//a[text()='"+jDate+"']")).click();
	}

}
