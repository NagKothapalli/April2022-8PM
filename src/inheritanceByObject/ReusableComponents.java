package inheritanceByObject;

import org.junit.Test;

public class ReusableComponents
{
	
	public ReusableComponents(String browser)
	{
		System.out.println("Clear the Data Base");
		if(browser.equalsIgnoreCase("CHROME"))
		{
			System.out.println("Open Browser : CHROME");
		}
		else if(browser.equalsIgnoreCase("FIREFOX"))
		{
			System.out.println("Open Browser : FIREFOX");
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		
	}
	public ReusableComponents(String browser,int version)
	{
		System.out.println("Clear the Data Base");
		if(browser.equalsIgnoreCase("CHROME"))
		{
			System.out.println("Open Browser : CHROME"  + " , with Version NUmber :" + version);
		}
		else if(browser.equalsIgnoreCase("FIREFOX"))
		{
			System.out.println("Open Browser : FIREFOX"  + " , with Version NUmber :" + version);
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		
	}
	//********************************************
	void launchApplication()
	{
		System.out.println("RC : Launch Application from RC");
		//We have to write the required selenium code to launch the application
	}
	void loginToApplication() //default
	{
		System.out.println("RC : Login To Application");
	}
	public void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
	}
	protected void closeApplication()
	{
		System.out.println("RC : Close Application");
	}
	protected void compose()
	{
		System.out.println("RC : Compose Mail");
	}
	public void send()
	{
		System.out.println("RC : Send Mail");
	}
	void open()
	{
		System.out.println("RC : Open Mail");
	}
	public void reply()
	{
		System.out.println("RC : Reply Mail");
	}
	protected void forward()
	{
		System.out.println("RC : Forward Mail");
	}
	public void delete()
	{
		System.out.println("RC : Delete Mail");
	}

}
