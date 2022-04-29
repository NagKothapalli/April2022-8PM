package seleniumPractice;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusAutomation
{
	String expectedValue = "Gmail";
	ChromeDriver driver; //null
	public RedBusAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver();//It will open an empty google chrome browser  ,SessionID = 1234
		driver.manage().window().maximize();
	}
	//Relative Xpath with parent child relationship	
		//div[@class='search']//input[@name='source']
	@Before
	public void launchApplication()
	{
		driver.get("https://www.redbus.in/");
	}
	@Test
	public void loginToApplication()
	{
		driver.findElement(By.xpath("//div[@id='sign-in-icon-down']")).click();
		//li[@id='signInLink']     //li[text()='Sign In/Sign Up']
		driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']")).click();
		//div[@class='mobileInput clearfix']//input[@placeholder='Enter your mobile number'  ]
		WebElement loginFrame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(loginFrame);
		driver.findElement(By.xpath("//div[@class='mobileInput clearfix']//input[@placeholder='Enter your mobile number']")).sendKeys("9959775757");
	}

}
