package seleniumPractice;

import java.util.List;

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
		emailObj.clear();
		driver.findElement(By.id("identifierId")).sendKeys("nag022");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	}
	//org.openqa.selenium.NoSuchElementException
	@Test
	public void forgotEmail()
	{
		System.out.println("Test Case : Forgot Email");
		launchApplication();
		driver.findElement(By.tagName("button")).click();
	}
	@Test
	public void learnMore()
	{
		System.out.println("Test Case : Learn More");
		launchApplication();
		driver.findElement(By.tagName("a")).click();
	}
	@Test
	public void createAccount()
	{
		System.out.println("Test Case : Create Account");
		launchApplication();
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));		
		for(int i=0;i<elements.size();i++)
		{
			WebElement element = elements.get(i);
			String txt = element.getText();
			System.out.println("Text on the element :" + txt);
			if(txt.equals("Create account"))
			{
				element.click();
				break;
			}
		}
	}
	@Test
	public void clickOnTerms()
	{
		System.out.println("Test Case : Click on Terms");
		launchApplication();
		List<WebElement> elements = driver.findElements(By.tagName("a"));		
		for(int i=0;i<elements.size();i++)
		{
			WebElement element = elements.get(i);
			String txt = element.getText();
			System.out.println("Text on the element :" + txt);
			if(txt.equals("Terms"))
			{
				element.click();
				break;
			}
		}
	}
	@Test
	public void clickOnPrivacy()
	{
		System.out.println("Test Case : Click on Privacy");
		launchApplication();
		List<WebElement> elements = driver.findElements(By.tagName("a"));		
		for(int i=0;i<elements.size();i++)
		{
			WebElement element = elements.get(i);
			String txt = element.getText();
			System.out.println("Text on the element :" + txt);
			if(txt.equals("Privacy"))
			{
				element.click();
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
