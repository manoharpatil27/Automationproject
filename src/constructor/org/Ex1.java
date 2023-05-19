package constructor.org;

public class Ex1 {
		
	Ex1(){
		this(10,20);
		System.out.println("zero parameter cons");
	}
	
	Ex1(int a){
		this(12,15.15);
		System.out.println("int parameter cons");
	}
	
	Ex1(int a, int b){
		this(10);
		System.out.println("int int parameter cons");
}
	
	
	Ex1(int a,double d){
		this('A',50);
		System.out.println("int double parameter cons");
		
}
	Ex1(char c, int a){
		System.out.println("char int parameter cons");
}	
	


	public static void main(String[] args) {
		System.out.println("Program Starts*********");
		Ex1 obj =new Ex1();
		
	System.out.println("Program ends*********");
	}
	
	

}
