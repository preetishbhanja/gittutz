package Demo1;

import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyTest1 {
  @Test
  public void myTest() {
	  int a=10;
	  int b=100;
	  Assert.assertEquals(a, b);
	  System.out.println("+++++Test Done+++++");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("%%%%%%%%Starting the Test%%%%%%%%");
  }
//@AfterClass
  @AfterMethod
  public void afterClass(ITestResult result) throws EmailException {
	  if(result.getStatus()==ITestResult.FAILURE)
	  SimpleEmailJava.sendEmail();
	  System.out.println("Test Failed and Email Sent");
	  
  }

}
