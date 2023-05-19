package interfaceprograms;

class Country2 {
	
	void display() {
		System.out.println("I am display method from class country2");
	}

}

class state2 extends Country {
	
	void display () {
		System.out.println("I am display  method from class state2");
	}

}
public class Ex1 {
	
	public static void main(String[] args) {
	
		state2 obj = new state2();
		
		obj.display();
		
	}


	
}
	