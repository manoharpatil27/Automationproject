package wrapperclasses.org;

public class Boxing {

	public static void main(String[] args) {
		int a =10;
		Integer i = new Integer(a);
		
		Integer m =a;
		
		System.out.println(i);
 		
		System.out.println(m);
		
		Integer h =50;
		
		int b = h.intValue();
		System.out.println(b);
		
		Long p= (long) 10000;
		System.out.println(p.toString());
		
		long l= p.longValue();
		
		System.out.println(l);
		Boolean v = true;
		System.out.println(v);
		boolean mg = v.booleanValue();
		System.out.println(mg);
				
		
	}

}
