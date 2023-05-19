package localandgloble.org;

public class Ex2 {

	static int b ;
	int age ;


	//		void test(int a){
	//
	//			
	//			System.out.println(b);
	//			this.age=a;
	//			System.out.println(age);
	//		}

	public static void main(String[] args) {
		//		int age =12;
		Ex2 objj = new Ex2();
		objj.test2();
		Ex2.test3();;
		//		int b;
		//		Ex2 obj =new Ex2();
		//		obj.test(10);


	}
	void test2(){
		int c=10 ;
		this.b=c;   //this.hum static method me nhi likh sakate
		System.out.println(b);
	}
	static void test3(){
		int c=50 ;
		Ex2.b=c;   //this.hum static method me nhi likh sakate
		System.out.println(b);
	}
}
