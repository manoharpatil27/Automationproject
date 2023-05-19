package BlocksInJava;

public class Ex5 {
	Ex5(){
		System.out.println("zero para cons");
	}
	
	{ // non static block 1
		System.out.println("non static block Print 1 ");
	}

	
	
	public static void main(String[] args) {
		System.out.println("Main method Starts ");
		Ex5 obj = new Ex5();

		System.out.println("-------------------------------------------- ");

		Ex5 obj2 = new Ex5();
		System.out.println("Main method ends ");

	}
	{ // non static block 2
		System.out.println("non static block Print 2");
	}

}
