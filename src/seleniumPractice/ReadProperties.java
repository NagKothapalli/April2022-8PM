package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties
{
	String filepath;// null
	public ReadProperties(String myfilepath)
	{
		filepath = myfilepath;
	}
	public String getData(String mykey) throws IOException   
	{
		FileInputStream myfile = new FileInputStream(filepath); //Checked Exception
		Properties myprop = new Properties();
		myprop.load(myfile);
		String myvalue = myprop.getProperty(mykey);
		return myvalue;
	}
}
