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
	
	//Write a program to read two numbers and perform addition if they are equal , subtraction a>b , product a < b
	@Test   //Unit Testing / Glass Box / White Box as the code is transparent
	public void multipleDecisions_Test()
	{
		multipleDecisions(22,22); // 5/15 *100 = 33.333333
		multipleDecisions(32,22); // 5/15 *100 = 33.333333
		multipleDecisions(22,32); // 5/15 *100 = 33.333333
	}
	public void multipleDecisions(int a,int b)
	{
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		if(a==b) //22==22
		{ //true
			int sum = a+b;
			System.out.println("Sum of two numbers :" + sum);
		}
		else if(a>b)
		{ //true
			int diff = a-b;
			System.out.println("Difference of two numbers :" + diff);
		}
		else if(a<b)
		{ //true
			int prod = a*b;
			System.out.println("Product of two numbers :" + prod);
		}
	}
	
	//Write a program to read two numbers and do the below task if and only if both inputs are above 10
	  //Task : perform addition if they are equal , subtraction a>b , product a < b
	@Test
	public void logicalOperators_test()
	{
		logicalOperators(8,4);
		logicalOperators(18,4);
		logicalOperators(8,44);
		logicalOperators(88,88);
		logicalOperators(88,48);
		logicalOperators(28,88);
	}
	public void logicalOperators(int a,int b)
	{
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		//   T          T    - >  T
		if((a>10) && (b>10)) //Outer if  // && - logical   
		{ //true  //Task
			if(a==b) //22==22 //Inner if  //Nested if condition   // > , < , ==  - Relational
			{ //true
				int sum = a+b;  // = -Assignment
				System.out.println("Sum of two numbers :" + sum);
			}
			else if(a>b)
			{ //true
				int diff = a-b;  // + , - , *  - Arithmetic
				System.out.println("Difference of two numbers :" + diff);
			}
			else if(a<b)
			{ //true
				int prod = a*b;
				System.out.println("Product of two numbers :" + prod);
			}
		}
		else
		{
			System.out.println("Both A and B or any one of them might be below 10");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
