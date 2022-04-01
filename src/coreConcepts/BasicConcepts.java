package coreConcepts;

//Class , Variables , Functions 
//Signature of Class : Modifier   class   Name{   Body - Members : variables / functions  }
public class BasicConcepts 
{
	public BasicConcepts()
	{
		
	}
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
		addition(55,88);
		addition(66,998,68);
		addition(66,98);
		addition(565,88);
		addition(66,998);
		subtraction();
		int result = addition(66,998,68,58);
		System.out.println("My Result :" + result);
		System.out.println("Final Output :" + (result+100));
	}
	//Naming conventions for a member of a class : 
		// it can start with _ , $ , a-z , A-Z , 
		// should follow camelCasing
		// no special chars are allowed in the beginning , middle , end 
	    // no spaces are allowed 
	 // Can't start with numeric 
	
	//valid variable names
	
	int _stdNum; int $stdNum; int std_Num;  int std$Num; int stdNum_;  int stdNum$; int StdNum;
	
	int std1Number;  int stdNumber1;
	
	public static void addition() //no output , no inputs , //Ravi
	{
		//body
		int sum = 22+25;
		System.out.println("Sum of two numbers :" + sum);
		//syso  Ctrl+SPACE 
	}
	//Duplicate Functions : if the name of the functions and input parameters are same then they are duplicate functions
	public static void addition(int a,int b)
	{
		int sum = a+b;
		System.out.println("Sum of two numbers :" + sum);
	}
	public static void addition(int a,int b,int c)
	{
		int sum = a+b+c;
		System.out.println("Sum of three numbers :" + sum);
	}
	public static int addition(int a,int b,int c,int d)
	{
		int sum = a+b+c+d;
		//System.out.println("Sum of three numbers :" + sum);
		return sum;
		//sum = sum+10;
	}
	public static void addition(int a,String b)
	{
		String sum = a+b; //int+int = int , int+string/string+int/string+string = string[concatenation]
		System.out.println("Sum of two numbers :" + sum);
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
