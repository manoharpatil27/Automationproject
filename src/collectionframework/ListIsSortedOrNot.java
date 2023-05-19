package collectionframework;

import java.util.ArrayList;
import java.util.Collections;


public class ListIsSortedOrNot {

	public static void main(String[] args) {
		
		ArrayList l4= new ArrayList();
		l4.add(10);
		l4.add(20);
		l4.add(30);
		l4.add(40);
		l4.add(50);
		
		System.out.println(l4);
		
		ArrayList l5= new ArrayList();
	
		l5.addAll(l4);
		
		
		System.out.println(l5);
		
		Collections.sort(l5);
		
		System.out.println(l4==l5);
		
	System.out.println(l4.equals(l5));
	l5.add(25);
	System.out.println(l5);
	System.out.println(l4.equals(l5));
	
	}

}
