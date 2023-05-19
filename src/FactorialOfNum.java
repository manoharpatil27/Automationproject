

public class FactorialOfNum {
	
	public static void main(String[] args) {
		int a =123;
		int fact=1;
		
		int rem =0;
		
		while(a>0) {
			
			rem =a%10;
			fact =fact * rem;
			
			a=a/10;
			
		}
		
		System.out.println(fact);
	}
	
	
		
		
		
		
		
		
		
	}

