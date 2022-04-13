package inheritanceByObject;

import org.junit.Test;
//            Base/child       parent/super -> Simple Inheritance
public class TestCases //extends ReusableComponents
{
	//Modifier  DataType name = value;
	public int stdNum = 22;
	//Modifier ClassName   objName = new Constructor();
	//public ReusableComponents rc  = new ReusableComponents();
	public ReusableComponents rc  = new ReusableComponents("chrome");
	//public ReusableComponents rc  = new ReusableComponents("chrome",100);

	/*
	 * void launchApplication() {
	 * System.out.println("RC : Launch Application from TC"); //We have to write the
	 * required selenium code to launch the application }
	 */
	//launch , login , compose , send , logout , close
	@Test
	public void composeAndSendAnEmail()
	{
		System.out.println("Test Case : ComposeAndSendAnEmail");
		rc.launchApplication();
		rc.loginToApplication();
		rc.compose();
		rc.send();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void replyToAnEmail()
	{
		System.out.println("Test Case : replyToAnEmail");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.reply();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void forwardAnEmail()
	{
		System.out.println("Test Case : forwardAnEmail");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.forward();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void deleteAnEmail()
	{
		System.out.println("Test Case : deleteAnEmail");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.delete();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	

}
