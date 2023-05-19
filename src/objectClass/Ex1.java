package objectClass;

class Animal{
	
	
}
public class Ex1 {

	public static void main(String[] args) {
		
		Animal obj =new  Animal();
		Animal obj1 =new  Animal();
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj.equals(obj1));
		
	}

}