package collectionframework;

import java.util.ArrayList;

class Manohar{
	
}
public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.isEmpty());  // true
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar);
		System.out.println(ar.size()); // return size 
		
		ar.add(1, 15); // add element on index basis
		System.out.println(ar);
		
		ArrayList ar1 = new ArrayList();
		ar1.add(100);
		ar1.add(200);
		
		System.out.println(ar1);
		ar.addAll(ar1);   // ar me ar1 ke all element add honge 
		System.out.println(ar); 
		
		ar.addAll(0, ar1);    //ar1 ke element 0 index se add honge
		System.out.println(ar);
		
		System.out.println(ar.isEmpty());   //false
		
	 System.out.println(ar.get(1));  // get index position 1 element
	
	// for getting all elements in list we use for loop
	 for(int i=0; i<ar1.size(); i++) {
		 System.out.println("element at  " + i +" : " +ar1.get(i));
	 }
	
	}

}
