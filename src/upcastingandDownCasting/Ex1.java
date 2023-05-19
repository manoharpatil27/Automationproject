package upcastingandDownCasting;

class A{
	void test1(){
		System.out.println("i am from test1");
	}
}

class B extends A{
	void test2(){
		System.out.println("i am from test2");
	}
}
public class Ex1 {


	public static void main(String[] args) {


		A obj = new B(); // upcasting 
		A obj1 = new B();   
		obj.test1();
		//obj.test2(); // error
		System.out.println("..................");
		B ch = (B)obj; // down casting
		ch.test1();
		ch.test2();
		System.out.println(obj);
		System.out.println(ch);

		System.out.println(obj.toString());    //true
		System.out.println(obj.hashCode());
		System.out.println(obj.equals(obj1));   //false
	}		

}
