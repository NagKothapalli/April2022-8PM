package seleniumPractice;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ApsrtcAutomation
{
	String expectedValue = "Gmail";
	ChromeDriver driver; //null
	public ApsrtcAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver();//It will open an empty google chrome browser  ,SessionID = 1234
	}
	//Relative Xpath with parent child relationship
	
		//div[@class='search']//input[@name='source']
	@Before
	public void launchApplication()
	{
		driver.get("https://www.apsrtconline.in/");
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
	@Test
	public void bookTicket() throws InterruptedException
	{
		System.out.println("Test Case : Book Ticket");
		driver.findElement(By.xpath("//div[@class='search']//input[@name='source']")).sendKeys("HYDERABAD");
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@value='Check Availability']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).build().perform();	
		//select date
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		selectDate("4");
		driver.findElement(By.xpath("//input[@value='Check Availability']")).click();
	}
	//Dynamic Xpath
	public void selectDate(String jDate)
	{
		driver.findElement(By.xpath("//a[text()='"+jDate+"']")).click();
	}

}
