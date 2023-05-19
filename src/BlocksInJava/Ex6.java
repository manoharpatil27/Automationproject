package BlocksInJava;

public class Ex6 {
	final static int age; 
	// using SIB we can initialize Final static globle variable
	
	final double salary;   
//	 using NSIB we can initialize Final non-static globle variable
	static { //  static block 
		age=30;
	}
	{ // non  static block 
		salary =50000.45;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main method Starts ");
		System.out.println("age:" + Ex6.age);
		
		System.out.println("----------------------------------");
		
		Ex6 obj = new Ex6();
		System.out.println("salary:" + obj.salary);
		
		System.out.println("Main method ends ");

	}
	
	} 

