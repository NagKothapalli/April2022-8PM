package seleniumPractice;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

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
	public void bookTicket()
	{
		System.out.println("Test Case : Book Ticket");
		driver.findElement(By.xpath("//div[@class='search']//input[@name='source']")).sendKeys("HYDERABAD");
	}

}
