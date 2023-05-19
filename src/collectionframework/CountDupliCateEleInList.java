package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class CountDupliCateEleInList {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		arr.add(10);
		arr.add(30);
		arr.add(20);
		System.out.println("arr="+arr);
		
	Iterator itr = arr.iterator();
	
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
