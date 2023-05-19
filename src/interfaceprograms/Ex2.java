package interfaceprograms;

class Country1  {
	
	Country1(int i){
		System.out.println("I am int param  of class country1");
	}
	
	void display() {
		System.out.println("I am display method from class country1");
	}

}

class state1 extends Country1 {
	
	state1(){
		super(10);
		System.out.println("I am zero param  of class state1");
	}
	
	void calling () {
		System.out.println("I am calling method from class state1");
	}

}
class city  extends state1 {
	city(){
		System.out.println("I am zero param  of class city");
	}
	
	void printing () {
		System.out.println("I am print method from class city");
	}
}

public class Ex2 {
	
	public static void main(String[] args) {
	
		city s1 = new city();
		
		s1.display();
		s1.calling();
		s1.printing();
		
	}


	
}
	