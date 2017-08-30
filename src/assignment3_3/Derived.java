package assignment3_3;

public class Derived extends Base {          //subclass definition  
	
	public Derived() {                     //default subclass constructor 
		System.out.println("Inside default constructor of Derived class");
	}
	
	
	public Derived(String name)              //one parameter subclass constructor
	{
		super(name);                         //calling one parameter superclass constructor
		
		System.out.println("Inside one parameter constructor of Derived class");
	}
	
	public Derived(String name,int r)         //two parameter subclass constructor
	{
		super(name,r);             //calling  two parameter constructor of suerclass
		System.out.println("Inside two parameters constructor of Derived class");
		
	}

}//class ends
