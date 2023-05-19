package collectionframework;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		System.out.println("arr is Empty:"  + arr.isEmpty());
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		System.out.println("arr="+arr);
		
		arr.add(0, 5);
		System.out.println("arr="+arr);
		
		ArrayList arr1 = new ArrayList();
		
		arr1.add(100);
		arr1.add(200);
		System.out.println("arr1="+arr1);
		arr.addAll(arr1);
		System.out.println("arr="+arr);
		
		arr.addAll(0, arr1);
		System.out.println("arr="+arr);
		arr1.containsAll(arr);
		System.out.println("arr1="+arr);
		
		
	}

}
