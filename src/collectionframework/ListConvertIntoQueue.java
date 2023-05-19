package collectionframework;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ListConvertIntoQueue {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		System.out.println(list);
		
		PriorityQueue que = new PriorityQueue();
		
		que.addAll(list);
		
		System.out.println(list);
		
	}

}
