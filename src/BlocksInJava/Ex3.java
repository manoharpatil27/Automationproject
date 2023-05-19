package BlocksInJava;

public class Ex3 {
	
	static {
		System.out.println("static blocks no 1");
	}

	
	
	public static void main(String[] args) {
		System.out.println("Main method Starts ");
		
		Ex3 obj = new Ex3();
		System.out.println("Main method ends ");
		Ex3 obj2 = new Ex3();
	}
	static {
		System.out.println("static blocks no 2");
	}
	
	{ // non static block 1
		System.out.println("non static block Print 1 ");
	}
	
		{ // non static block 2
			System.out.println("non static block Print 2 ");
		
		}
	
	
}
