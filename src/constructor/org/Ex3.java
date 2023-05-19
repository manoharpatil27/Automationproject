package constructor.org;
class A{
	A(){
		this(10,12);
		System.out.println(" Default cons frome A");
	}
	A(int a){
		this();
		System.out.println(" int cons frome A");
	}
	A(int a,int b){
		System.out.println(" int-int cons frome A");
	}
}

class B  extends A{
	B(int a){
		super(10);
		System.out.println(" int cons frome B");
	}
}

class C extends B{
	C(int a){
		super(10);
		System.out.println(" int cons frome c");
	}

}
class D extends C{
	D(int a){
		super(10);
		System.out.println(" int cons frome d");
	}
}
public class Ex3 {
		
	public static void main(String[]args) {
		
		D obj = new D(10);
		
		
	}
	

}
