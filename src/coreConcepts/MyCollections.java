package coreConcepts;

import java.util.ArrayList;

import org.junit.Test;

public class MyCollections
{
	//ArrayList<GenericType>  objName = new ArrayList<Generic>();
	@Test
	public void arrayList_Integer()
	{
		ArrayList<Integer>  stdNumbers = new ArrayList<Integer>();
		int count = stdNumbers.size();
		System.out.println("Length of the list -1 :" + count);
		stdNumbers.add(56);
		stdNumbers.add(66);
		stdNumbers.add(576);
		stdNumbers.add(564);  //0  1   2  3   4
		stdNumbers.add(526);  //56,66,576,564,526
		System.out.println("Lenght of the list - 2 :" + stdNumbers.size());
		stdNumbers.get(0); // 56
		for(int i=0;i<stdNumbers.size();i++)
		{
			System.out.println("My Elements :" + stdNumbers.get(i)); // i = 0 1 2 3
		}
		stdNumbers.add(2,246);
		System.out.println("Lenght of the list - 3 :" + stdNumbers.size());
		for(int i=0;i<stdNumbers.size();i++)
		{
			System.out.println("My Elements after insert :" + stdNumbers.get(i)); // i = 0 1 2 3
		}
		stdNumbers.remove(2);
		System.out.println("Lenght of the list - 4 :" + stdNumbers.size());
		for(int i=0;i<stdNumbers.size();i++)
		{
			System.out.println("My Elements after deletion :" + stdNumbers.get(i)); // i = 0 1 2 3
		}
	}

}
