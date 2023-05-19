package staticnonstatic.org;

public class Ex1 {

	public static void addition() {
		int a =20;
		int b=40;
		int sum =a+b;

		System.out.println("sum="+sum);
	}

	public static void main(String[] args) {
		int k =10000;
		Ex1 obj = new Ex1();
		Ex1.m =k;
		System.out.println(k);
		obj.subtraction();    // calling by object ref

		Ex1.addition();      // calling by class name 
		addition();          // calling by method name
		//		l=Ex1.l;                   no need for static
		System.out.println(l);   // static globle veriable ko  direct call kr sakte hai
		int n;
		n=obj.n;
		//        n=this.n;     this la static method madhe nahi use kru shakat
		System.out.println(n);
	}
	public  void subtraction() {
		int a =100;
		int b=50;
		int sub =a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("subs="+sub);
	}

	static int m;

	static int l=500;
	int n;


}
