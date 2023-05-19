package stringclassPractice;

public class StringMethods2 {

	public static void main(String[] args) {
		String s ="Manohar Patil   ";
		
		String sp = "Manohar Patil";
		String p = new String("Manohar");
		
		System.out.println(s.toString()); // Manohar Patil   (return refrence)
		
		System.out.println(s.trim()); // remove spacess before & after the string
		
		 int a =s.indexOf("M"); 
		System.out.println(a); // 0
		
		 int b =s.lastIndexOf("a"); 
			System.out.println(b); // 9
		
	String sb=  s.replace("a", "p");
		System.out.println(sb);      //  Mpnohpr Pptil   
		
		String ssb=	s.replaceFirst("a","p");
		System.out.println(ssb);               //  Mpnohar Patil 
	}	
	}	