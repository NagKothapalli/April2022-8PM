package multilevelInheritance;

import org.junit.Test;
//            Base/child       parent/super -> Simple Inheritance
public class TestCases extends ReusableComponents
{
	void launchApplication()
	{
		System.out.println("RC : Launch Application from TC");
		//We have to write the required selenium code to launch the application
	}
	//launch , login , compose , send , logout , close
	@Test
	public void composeAndSendAnEmail()
	{
		System.out.println("Test Case : ComposeAndSendAnEmail");
		launchApplication();
		loginToApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void replyToAnEmail()
	{
		System.out.println("Test Case : replyToAnEmail");
		launchApplication();
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}
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
