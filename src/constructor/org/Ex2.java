package constructor.org;

public class Ex2 {

	Ex2(){
		this(10,20);
		System.out.println("zero parameter cons");
	}

	Ex2(int a){
		this(12,15.15);
		System.out.println("int parameter cons");
	}

	Ex2(int a, int b){
		this(10);
		System.out.println("int int parameter cons");
	}


	Ex2(int a,double d){
		this('A',50);
		System.out.println("int double parameter cons");

	}
	Ex2(char c, int a){
		System.out.println("char int parameter cons");
	}	



	public static void main(String[] args) {
		System.out.println("Program Starts*********");
		Ex2 obj =new Ex2();

		System.out.println("Program ends*********");
	}



}
