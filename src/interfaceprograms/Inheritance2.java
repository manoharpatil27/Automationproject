package interfaceprograms;

class FourWheelar  {
	// default constructor
	public void wheels() {
		System.out.println("i have four wheels");
	}
	
}

class Car extends FourWheelar {
	// default constructor
	public void type() {
		System.out.println("i am a car");
	}
}
class Marurti extends Car{
	// default constructor
	public void company() {
		System.out.println("i am a maruti");
	}
	
}

public class Inheritance2 {
	
	public static void main(String[] args) {
		Marurti m1 = new Marurti();
		m1.wheels();
		m1.type();
		m1.company();
}
}