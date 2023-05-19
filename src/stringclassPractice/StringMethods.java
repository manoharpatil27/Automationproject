package stringclassPractice;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Manohar Patil";
		
		String sp = "Manohar Patil";
		String p = new String("Manohar");
		
	boolean b=	s.isEmpty();
		System.out.println(b); //false
		
	int	length= s.length();
	System.out.println(length);  //13
	
	char c = s.charAt(5);
		System.out.println(c);  //a
		
		boolean b1= s.equals(sp);
		System.out.println(b1);   // true 
		
		boolean b2= s.equals(p);
		System.out.println(b2);   // false 
		
		boolean b3= (s== sp);
		System.out.println(b3);    //true
		
		boolean b4 = (s== p);
		System.out.println(b4);    //false
		
	String sc =	s.concat(" From jalgaon");
	System.out.println(sc);
	
	
	String ss =	s + (" From jalgaon");
	System.out.println(ss);
	}
}
// isEmpty,length,charAt,equals =>compare value , == -> compare object Address
//concat , + operator.