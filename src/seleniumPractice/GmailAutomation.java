package seleniumPractice;

import java.util.List;

import org.junit.Before;
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
	@Before
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
	//Locators/Selectors in Selenium : ID , NAME , CLASS , CSS , LINKTEXT , PARTIALLINKTEXT , TAGNAME , XPATH
	//XPATH : 
			//Absolute / Fixed / Static 
			//Relative
			//Dynamic
	@Test  //1
	public void loginToApplication()
	{
		//launchApplication();
		System.out.println("RC : Login To Application");
		WebElement emailObj = driver.findElement(By.name("identifier")); //1234.
		emailObj.click();
		emailObj.sendKeys("dfdsfdfsfdsfsd");
		emailObj.clear();
		emailObj.sendKeys("nag022@gmail.com");
		emailObj.clear();
		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("compoundclassname@abc.com");
		driver.findElement(By.cssSelector(".whsOnd")).sendKeys("compoundclassname@abc.com");
		//driver.findElement(By.id("identifierId")).sendKeys("nag022");
		driver.findElement(By.xpath("//input[@type='email' and @name='identifier']")).sendKeys("nag022");
		emailObj.clear();
		driver.findElement(By.xpath("//input[@type='email' or @name='identifier']")).sendKeys("nag02234");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	}
	//org.openqa.selenium.NoSuchElementException
	//InvalidSelectorException: Compound class names not permitted
	//Relative Xpath
	  //tagName[@attribute = 'value123']       //tagName[contains(@attribute,' partial value')]
	  //tagName[text()='1123value']            //tagName[contains(text(),'partial value')]
	 //*[@attribute = 'value123']       //*[contains(@attribute,' partial value')]
	  //*[text()='1123value']            //*[contains(text(),'partial value')]
	
	 //tagName[@attribute = 'value123' and @att2='value']       //tagName[contains(@attribute,' partial value') and contains(@attribute2,' partial value')]
	  //tagName[text()='1123value' and contains(@attribute,' partial value')]            //tagName[contains(text(),'partial value')]
	 //*[@attribute = 'value123' and contains(@attribute,' partial value')]       //*[contains(@attribute1,' partial value') and @attribute2 = 'value123']
	
	 //tagName[@attribute = 'value123' or @att2='value']       //tagName[contains(@attribute,' partial value') or contains(@attribute2,' partial value')]
	  //tagName[text()='1123value' or contains(@attribute,' partial value')]           
	 //*[@attribute = 'value123' or contains(@attribute,' partial value')]       //*[contains(@attribute1,' partial value') or @attribute2 = 'value123']
	 
	@Test  //2
	public void forgotEmail()
	{
		System.out.println("Test Case : Forgot Email");
		//launchApplication();
		//driver.findElement(By.tagName("button")).click();
		//Absolute / static / full xpath :
		// /html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button")).click();
		driver.findElement(By.xpath("//button[@jsname='Cuz2Ue']")).click();
	}
	@Test  //3
	public void learnMore()
	{
		System.out.println("Test Case : Learn More");
		//launchApplication();
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.linkText("Learn more")).click();
		driver.findElement(By.partialLinkText("Learn")).click();
	}
	@Test //4
	public void getAllLinksInThePage()
	{
		System.out.println("Test Case : GetAllLinksInThePage");
		//launchApplication();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Links :" + allLinks.size());
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
			System.out.println("All Link URLs :" + allLinks.get(i).getAttribute("href"));
		}
	}
	@Test
	public void getAllImagesInThePage() throws InterruptedException
	{
		System.out.println("Test Case : GetAllImagesInThePage");
		//launchApplication();
		driver.get("https://www.apsrtconline.in/");
		List<WebElement> allLinks = driver.findElements(By.tagName("img"));
		System.out.println("Total Links :" + allLinks.size());
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
			System.out.println("All Image URLs :" + allLinks.get(i).getAttribute("src"));
			//driver.get(allLinks.get(i).getAttribute("src"));
			Thread.sleep(2000);
		}
	}
	@Test  //5
	public void createAccount()
	{
		System.out.println("Test Case : Create Account");
		//launchApplication();
		//driver.findElement(By.xpath("//span[text()='Create account']")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("//*[text()='Create account']")).click();
		/*
		 * List<WebElement> elements =
		 * driver.findElements(By.className("VfPpkd-vQzf8d")); for(int
		 * i=0;i<elements.size();i++) { WebElement element = elements.get(i); String txt
		 * = element.getText(); System.out.println("Text on the element :" + txt);
		 * if(txt.equals("Create account")) { element.click(); break; } }
		 */
	}
	@Test  //6
	public void clickOnTerms()
	{
		System.out.println("Test Case : Click on Terms");
		//launchApplication();
		driver.findElement(By.xpath("//a[text()='Terms']")).click();
		/*
		 * List<WebElement> elements = driver.findElements(By.tagName("a")); for(int
		 * i=0;i<elements.size();i++) { WebElement element = elements.get(i); String txt
		 * = element.getText(); System.out.println("Text on the element :" + txt);
		 * if(txt.equals("Terms")) { element.click(); break; } }
		 */
	}
	@Test  //7
	public void clickOnPrivacy()
	{
		System.out.println("Test Case : Click on Privacy");
		//launchApplication();
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
