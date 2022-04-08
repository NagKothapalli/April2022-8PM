package heirachialInheritance;

import org.junit.Test;
//              child2                 parent
public class Gmail_Module_B extends ReusableComponents
{
	@Test
	public void forwardAnEmail()
	{
		System.out.println("Test Case : forwardAnEmail");
		launchApplication();
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void deleteAnEmail()
	{
		System.out.println("Test Case : deleteAnEmail");
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}

}
