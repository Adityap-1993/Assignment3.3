package assignment3_3;

/*  Constructor chaining can be done by use of 'this' and 'super' keyword .
 * within same class constructors are called by this and within base and derived class constructors are called by super*/

public class Base {            //superclass definition
	
	protected String name;     
	   
	
	public Base() {        //default constructor
		this("");             //calling one parameter constructor 
		
		System.out.println("Inside defalut constructor of Base class");
	}
	
	public Base(String name)      //one parameter constructor
	{
		this("",5);               //calling two parameter constructor
		System.out.println("Inside paramterized constructor of Base class");
	}
	
	public Base(String name,int r) {           //two parameter constructor
		System.out.println("Inside parameterized constructor of Base class with two parameters");
	}

}//class ends
