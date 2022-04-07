package coreConcepts;

import java.util.Arrays;

import org.junit.Test;

public class MyArrays
{
	
	//fixed array
	  //Modifier  DataType   name = value;
		public String stdName = "Ram";
		public int stdNumber = 22;
	  //Modifier  DataType[] name = {values.....};
		//public String[] stdNames = {"Ram","Ravi","Raj","Ramesh"};
		//public int[]  stdNumbers = {22,24,12,23,25,36,67,78,98};
	//Declaration , Assignment , Length , Read , Write
	//java.lang.ArrayIndexOutOfBoundsException: if you try to read/write a value in to mem location whose index is greater the max index value
	@Test
	public void fixedArray_integer()
	{
		//index values        0   1 2  3  4   5  6  7 8
		int[]  stdNumbers = {22,24,12,23,25,36,67,78,98};
		int len = stdNumbers.length;
		System.out.println("Length of array :" + len);
		int val = stdNumbers[0]; //reading
		stdNumbers[0] = 55; //writing
		for(int i=0;i<len;i++) // i = 0 .......8  8<9
		{
			//read the roll number give a pen
			val = stdNumbers[i]; // 0 1 2 3 4 5 6 ....
			System.out.println("Give Pen to Roll Number :" + val);
		}
		//val = stdNumbers[9];
		for(int i=0;i<len;i++) // i = 0 .......8   8<=9  9<=9
		{
			stdNumbers[i] = 55+i;
			System.out.println("Elements after writing :"+ stdNumbers[i]);
		}
		
	}
	@Test
	public void fixedArray_integer_sort()
	{
		//index values        0   1 2  3  4   5  6  7 8
		int[]  stdNumbers = {22,24,12,23,25,36,67,78,98};
		for(int i=0;i<stdNumbers.length;i++) // i = 0 .......8   8<=9  9<=9
		{			
			System.out.println("Elements before sorting :"+ stdNumbers[i]);
		}
		Arrays.sort(stdNumbers);
		for(int i=0;i<stdNumbers.length;i++) // i = 0 .......8   8<=9  9<=9
		{
			System.out.println("Elements after sorting :"+ stdNumbers[i]);
		}
	}
	//Write a program to arrange given array in ascending and in descending order ?
	@Test
	public void dynamicArray_integer()
	{
		//index values        0   1 2  3  4   5  6  7 8
		//int[]  stdNumbers = {22,24,12,23,25,36,67,78,98};
		int[]  stdNumbers = new int[10];
		int len = stdNumbers.length;
		System.out.println("Length of array :" + len);
		int val = stdNumbers[0]; //reading
		//stdNumbers[0] = 55; //writing
		for(int i=0;i<len;i++) // i = 0 .......8  8<9
		{
			val = stdNumbers[i]; // 0 1 2 3 4 5 6 ....
			System.out.println("Elements Before :"+ val);
		}
		//val = stdNumbers[9];
		for(int i=0;i<len;i++) // i = 0 .......8   8<=9  9<=9
		{
			stdNumbers[i] = 55+i;
			System.out.println("Elements after writing :"+ stdNumbers[i]);
		}
	}

}
