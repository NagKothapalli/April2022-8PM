package heirachialInheritance;

import org.junit.Test;

public class ReusableComponents
{
	//********************************************
	void launchApplication()
	{
		System.out.println("RC : Launch Application");
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
