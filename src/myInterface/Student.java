package myInterface;

import org.junit.Test;

public class Student
{
	MiniCalculator mCalc = new MiniCalculator();
	ArithmeticOperations  calc = new MiniCalculator();
	//WebDriver driver = new ChromeDriver();
	@Test
	public void doAdditions()
	{		
		mCalc.displayLogo();
		int sum = mCalc.addition(34,67);
		System.out.println("Sum1 :" + sum);
		sum = mCalc.addition(34,67);
		System.out.println("Sum2 :" + sum);
		sum = mCalc.subtraction(354,67);
		System.out.println("Sum3 :" + sum);
		sum = mCalc.addition(34,687);
		System.out.println("Sum4 :" + sum);
		sum = mCalc.multiplication(314,687);
		System.out.println("Sum5 :" + sum);
		
	}
	

}
