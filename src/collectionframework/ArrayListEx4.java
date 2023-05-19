package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

class Patil{
	int rollno; 
	String  name, branch, div;
	
	public  Patil(int rollno, String name, String branch, String div) {
		
		this.rollno= rollno;
		this.name =name;
		this.branch=branch;
		this.div=div;
		System.out.println(10);
			
	}
}
  
public class ArrayListEx4 {

	public static void main(String[] args) {
		ArrayList<Patil> ar = new ArrayList<Patil>();
		
		Patil p1= new Patil(01,"Ajit","mech","B");
		Patil p2= new Patil(02,"Amol","mech","B");
		Patil p3= new Patil(03,"Amar","mech","B");
		
		ar.add(p1);
		ar.add(p2);
		ar.add(p3);
		ar.add(new Patil(04,"Pankaj","mech","B"));
		
		System.out.println(ar);
		
		System.out.println(ar.get(0).rollno);
		System.out.println(ar.get(0).name);
		
		for(Patil p:ar) {
			System.out.println(p.rollno +" "+ p.name+" "+ p.branch +" "+p.div );
			
		}
		
		
		
	}
	}


