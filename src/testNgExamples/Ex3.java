package testNgExamples;

import org.testng.annotations.Test;

public class Ex3 {
  @Test(invocationCount=2)
  public void test1() {
	  System.out.println("test1");  
  }
  
  
  @Test
  public void test2() {

	  System.out.println("test2"); 
	
  }
  @Test
  public  void test3() {

	  System.out.println("test3"); 
	  
  }
  
}
