package testNgExamples;

import org.testng.annotations.Test;

public class Ex1 {
  @Test
  public void test1() {
	  System.out.println("test1");  
  }
  
  
  @Test
  public void test2() {

	  System.out.println("test2"); 
	  test3();
  }
  public  void test3() {

	  System.out.println("test3"); 
	  
  }
  // Passed is depends on @Test
}
