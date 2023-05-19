package testNgExamples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Ex8 {
   @BeforeSuite()
  public void startup() {
	  System.out.println("-----------------Before Suite --------------");  
  }
  
  
  @Test
  public void login() {

	  System.out.println("login"); 
	
  }
  @AfterSuite
  public  void endUp() {

	  System.out.println("***************After Suite************"); 
	  
  }
  
}
