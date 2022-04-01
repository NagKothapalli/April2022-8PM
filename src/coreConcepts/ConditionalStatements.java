package coreConcepts;

import org.junit.Test;

public class ConditionalStatements
{
	//Decision Making Statements
	int a= 22;
	int b= 28;
	
	//if(expression -> boolean : true / false){ task }
	@Test
	public void compareNumbers_if()
	{
		if(a==b)  //true / false
		{
			System.out.println("Both A and B are equal");
		}
	}
	
	@Test
	public void compareNumbers_ifelse_test() //Unit Test
	{
		compareNumbers_ifelse(44,44);
		compareNumbers_ifelse(44,12);
	}
	public void compareNumbers_ifelse(int a,int b) //Dev code
	{
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		if(a==b)  //true / false
		{
			System.out.println("Both A and B are equal");
		}
		else
		{
			System.out.println("Both A and B are not equal");
		}
	}

}
