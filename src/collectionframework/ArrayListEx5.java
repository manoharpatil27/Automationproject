package collectionframework;

import java.util.ArrayList;

public class ArrayListEx5 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();

		arr.add(10);
		System.out.println(arr);
		
		ArrayList arr1 = new ArrayList();

		arr1.add(10);
		System.out.println(arr1);
		System.out.println(arr.equals(arr1));
		
		System.out.println(arr==arr1);
	}

}
