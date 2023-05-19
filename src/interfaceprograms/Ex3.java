package interfaceprograms;

class Country  {
	
	void display() {
		System.out.println("I am display method from class country");
	}

}

class state extends Country {
	
	void print () {
		System.out.println("I am print method from class country");
	}

}
public class Ex3 {
	
	public static void main(String[] args) {
	
		state obj = new state();
		
		obj.print();
		obj.display();
		
	}


	
}
	