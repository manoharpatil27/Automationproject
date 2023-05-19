package BlocksInJava;

public class Ex2 {
	
	{ // non static block 1
		System.out.println("non static block Print 1 ");
	}

	
	
	public static void main(String[] args) {
		Ex2 obj = new Ex2();
		System.out.println("Main method Starts ");
		
		Ex2 obj2 = new Ex2();
		System.out.println("Main method ends ");

	}
	{ // non static block 2
		System.out.println("non static block Print 2");
	}

}
