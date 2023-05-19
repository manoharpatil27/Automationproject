package BlocksInJava;

public class Ex4 {
	static{ // static block 1
		System.out.println(" static block Print 1 ");
	}
	
	
	{ // non static block 1
		System.out.println("non static block Print 1 ");
	}

	
	
	public static void main(String[] args) {
		System.out.println("Main method Starts ");
		Ex4 obj1 = new Ex4();

		System.out.println("------------------------------------------ ");
		
		Ex4 obj2 = new Ex4();
		System.out.println("Main method ends ");

	}
	
	static{ // static block 2
		System.out.println(" static block Print 1 ");
	}
	
	{ // non static block 2
		System.out.println("non static block Print 2");
	}

}
