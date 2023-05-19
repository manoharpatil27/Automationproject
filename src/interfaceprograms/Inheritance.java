package interfaceprograms;

class A1  {
	static int a=10;
	int b=20;
	double c=15.15;
}

class B1 extends A1 {
	static int p=100;
	int q=200;
	double r=150.15;
}
class c1 extends B1{
	static int x=1000;
	int y=2000;
	double z=1500.15;
}

public class Inheritance {
	
	public static void main(String[] args) {
//	calling non static variables by class name
		// static member does not participate in inheritance.
		
		System.out.println("class A1 static variable:"+A1.a);

		System.out.println("class B1 static variable:"+B1.p);

		System.out.println("class C1 static variable:"+c1.x);
	//	calling non static variables by C1 class object ref
		
		c1 obj = new c1();
		System.out.println("class A1 non-static variable:"+obj.b);
		System.out.println("class A1 non-static variable:"+obj.c);
		
		System.out.println("class B1 non-static variable:"+obj.q);
		System.out.println("class B1 non-static variable:"+obj.r);
		
		System.out.println("class C1 non-static variable:"+obj.y);
		System.out.println("class C1 non-static variable:"+obj.z);
	}
}
	