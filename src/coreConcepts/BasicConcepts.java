package coreConcepts;

//Class , Variables , Functions 
//Signature of Class : Modifier   class   Name{   Body - Members : variables / functions  }
public class BasicConcepts 
{
 //Body : Variables , Functions/Methods
	//A variable is a container which will hold some data in run time.
//Signature of variable : Modifier[opt]   DataType   Name ; - Declaration
	//Modifier : Access -> private , default , public , protected
	   //Non-Access : static , final
	//Signature of variable : Modifier   DataType   Name = value ; - Declaration and assignment
	public static String  college ; //null
	public static String  collegeName  = "JNTU";
	public int stdNum = 22;
	protected double marks = 95;
	private boolean stdResult = true;
	
	char stdGrade = 'A'; //default
//Signature of method/function
	//Modifier[opt]  ReturnType  Name(){ Body  }
	//Modifier[opt]  ReturnType  Name(arguments....[opt]){ Body  }   - Concrete function
	//               No - void
	//               Yes - DataType
	//Modifier[opt]  ReturnType  Name(arguments....[opt]);  - Abstract method [ Method without body]
	//psvm
	public static void main(String[] args)  //Ram
	{
		System.out.println("Welcome to Selenium Java");
		addition();
		subtraction();
	}
	
	public static void addition() //no output , no inputs , //Ravi
	{
		//body
		int sum = 22+25;
		System.out.println("Sum of two numbers :" + sum);
		//syso  Ctrl+SPACE 
	}
	private static void subtraction() //no output , no inputs , //Raj
	{
		//body
		int diff = 44-25;
		System.out.println("Difference of two numbers :" + diff);
		//syso  Ctrl+SPACE 
	}


}

class Yahoo  // [Yahoo.java]
{
	
}

class Amazon
{
	
}
