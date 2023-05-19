

import java.util.ArrayList;

class Manohar{
	
}
public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
		Manohar ma = new Manohar();
		Manohar m = new Manohar();
		ar.add(ma);
		ar.add(m);
		System.out.println(ar);
		 int  a =ma.hashCode();
		 System.out.println(a);
		boolean b= ma.equals(m);
		System.out.println(b);
	}

}
