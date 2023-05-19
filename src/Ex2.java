
class A{
	void show(int a) {
		System.out.println("i am from show");
		System.out.println(a);
	}
}
public class Ex2 {
	
	public static void main(String[] args) {
	A obj = new A();
		

	obj.show('b');
	char b = 'A';
	int c= b;
	System.out.println(c);
	}
	
}
