package BlocksInJava;

public class Ex8 {
	int age= 50;
	double salary = 60000.58;
	
	void print() {
		System.out.println("age="+ age);
		System.out.println("salary="+ salary);
	}
	

	public static void main(String[] args) {
		System.out.println("Main method Starts ");
		
		Ex8 obj =new Ex8();
		obj.print();
		System.out.println("Main method ends ");

	}
	{ // non static block
		print();
		age =25;
		salary= 40000.22;
		
	}
}
