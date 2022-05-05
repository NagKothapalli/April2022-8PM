package seleniumPractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApplicationUtilities
{
	//click Enter , Click Tab  , Double Click , Right Click , MouseHover etc.....
	WebDriver driver;
	Actions actions;
	public ApplicationUtilities(WebDriver driver) //1234
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		//driver = new ChromeDriver(); //5678
		actions = new Actions(driver); //1234
	}
	
	public void clickEnter()
	{
		actions.sendKeys(Keys.ENTER).build().perform();
	}
	
	

}
