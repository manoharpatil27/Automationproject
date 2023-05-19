package BlocksInJava;

public class Ex7 {
	static int age ;
	
	
	static void print() {
		System.out.println("age="+ age);
		
	}
	static {//static block1

		print();
		System.out.println("static block1");
		age=25;
	}

	public static void main(String[] args) {
		System.out.println("Main method Starts ");
		System.out.println(" i am Main method ");
		
		print();
		System.out.println("Main method ends ");

	}
	
}
