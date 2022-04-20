package seleniumPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GmailAutomation
{
	String expectedValue = "Gmail";
	ChromeDriver driver; //null
	public GmailAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver();//It will open an empty google chrome browser  ,SessionID = 1234
	}
	@Test
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");		
		driver.get("https://gmail.com"); //1234.
		String actualValue = driver.getTitle();
		System.out.println("Title of the application :" + actualValue);
		System.out.println("Current URL :" + driver.getCurrentUrl());
		String sessionID = driver.getWindowHandle();
		System.out.println("Session ID of the window : " + sessionID);
		Assert.assertEquals(expectedValue, actualValue);
	}
	@Test
	public void loginToApplication()
	{
		launchApplication();
		System.out.println("RC : Login To Application");
		WebElement emailObj = driver.findElement(By.name("identifier")); //1234.
		emailObj.click();
		emailObj.sendKeys("dfdsfdfsfdsfsd");
		emailObj.clear();
		emailObj.sendKeys("nag022@gmail.com");		
	}

}
