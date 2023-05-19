package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UniqueElenentFromList {

	public static void main(String[] args) {
		
		ArrayList l1= new ArrayList();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(10);
		l1.add(40);
		l1.add(20);
		l1.add(50);
		l1.add(60);
				
		System.out.println(l1);
		HashSet h = new HashSet(l1);
//		h.addAll(l1);
		System.out.println
		(h);
		
		ArrayList l2= new ArrayList(h);
		System.out.println(l2);
		
		
		Collections.sort(l2);
		System.out.println(l2);
	}

}
