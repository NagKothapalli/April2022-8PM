package coreConcepts;

import org.junit.Test;

public class LoopingStatements
{
	@Test
	public void applyColor()
	{
		System.out.println("Apply Color to step 1");
		System.out.println("Apply Color to step 2");
		System.out.println("Apply Color to step 3");
		System.out.println("Apply Color to step 4");
		System.out.println("Apply Color to step 5");
		System.out.println("Apply Color to step 6");
		System.out.println("Apply Color to step 7");
		System.out.println("Apply Color to step 8"); //.........100
	}
	//for(iterator , condition , step size){ Task }
	//for(iterator=1;iterator<100;iterator = iterator + 1) { Task }
	@Test
	public void applyColorToSteps()
	{
		for( int i=1;i<50;i=i+1)  //i=1 1<50 2<50 3<50 4<50 5<50 .......49<50 50<50
		{ //true
			System.out.println("Apply Color to the Step :"+i);
		}
	}
	@Test
	public void applyColorToAllSteps()
	{
		for( int i=1;i<=50;i=i+1)  //i=1 1<50 2<50 3<50 4<50 5<50 .......49<=50 50<=50 51<=50
		{ //true
			System.out.println("Apply Color to the Step :"+i);
		}
	}
	@Test
	public void applyRedColorToOddSteps()
	{
		for(int i=1;i<=50;i=i+2)
		{
			System.out.println("Apply Red Color to Odd Step:" + i);
		}
	}
	@Test
	public void applyGreenColorToEvenSteps()
	{
		for(int i=2;i<=50;i=i+2)
		{
			System.out.println("Apply Green Color to Even Step:" + i);
		}
	}
	@Test
	public void giveChoclate()
	{
		for(int i=1;i<=60;i++)
		{
			System.out.println("Give Choclate to Student :" + i);
		}
	}
	@Test
	public void findStudent()
	{
		for(int i=1;i<=80;i++)
		{
			System.out.println("Searching student :" + i);
			if(i==22)
			{
				System.out.println("Student found");
				break;
			}
		}
	}
	
	//Write a program to find sum of 10 numbers
	//  sum =0  ,   i=1  0+1+2+3+4....10 
	@Test
	public void sumOfNumbers()
	{
		int sum = 0;
		for(int i=1;i<=10;i++)
		{
			sum = sum + i ; // 1 2 3 4 5 6 7 8 9 10
		}
		System.out.println("Sum of Numbers :" + sum);
	}
	
	//Write a program to find the given number is even or odd
	//Write a program to find factorial of given number 
	
	
	
	
	
}
