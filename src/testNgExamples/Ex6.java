package testNgExamples;

import org.testng.annotations.Test;

public class Ex6 {
  @Test()
  public void test1() {
	  System.out.println("test1");
	  int b=10/0;
  }
  
  
  @Test(dependsOnMethods="test1")
  public void test2() {

	  System.out.println("test2"); 
	
  }
  @Test
  public  void test3() {

	  System.out.println("test3"); 
	  
  }
  
}
