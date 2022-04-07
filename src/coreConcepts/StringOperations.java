package coreConcepts;

import org.junit.Test;

public class StringOperations
{
	String a = "           Selenium With Java       ";
	String b = "JAVA";
	String c= "Selenium With JAVA                    ";
	@Test
	public void basicOperations()
	{
		int len = a.length();
		System.out.println("Length of the string :" + len);
		String aT = a.trim();
		System.out.println("String a after trim :" + aT);
		System.out.println("String length after trim :" + aT.length());
		String aL = a.trim().toLowerCase();
		System.out.println("String a after lower case :" + aL);
		String aU = a.trim().toUpperCase();
		System.out.println("String a after upper case :" + aU);
	}
	@Test
	public void stringEqualsOperation()
	{
		//if(a.trim().toLowerCase().equals(c.trim().toLowerCase()))
		if(a.trim().equalsIgnoreCase(c.trim()))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
	}
	@Test
	public void subStringOperation()
	{
		String a8 = a.trim().substring(8);
		System.out.println(" From 8th :" + a8);
		String a08 = a.trim().substring(0, 8);
		System.out.println("0 to 8th :" + a08);
	}
	@Test
	public void stringContainsOperation()
	{
		//if(a.trim().toLowerCase().contains(b.toLowerCase()))
		if(a.trim().toUpperCase().contains(b.toUpperCase()))
		{
			//true
			System.out.println("String A contains B");
		}
		else
		{
			System.out.println("String B is not there in string A");
		}
	}

}
