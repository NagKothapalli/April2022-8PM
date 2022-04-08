package heirachialInheritance;

import org.junit.Test;
//             child1                 parent
public class Gmail_Module_A extends ReusableComponents
{
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

}
