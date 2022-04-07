package testScenarios;

import org.junit.Test;

import rComponents.ReusableComponents;
//            Base/child           parent/super -> Simple Inheritance
public class TestCases extends ReusableComponents
{
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
