package testNG;

import org.testng.annotations.*;

public class NewTest {
  @Test
  public void f1() {
	  System.out.println("methond inside f1 ;");
  }

  @Test
  public void f2() {
	  System.out.println("methond inside f2");
  }
  @BeforeTest
  public void beforeanytest() {
	  System.out.println("methond before any test");
  }
  @AfterTest
  public void atfteranytest() {
	  System.out.println("methond after all test");
  }
  @BeforeMethod
  public void beforeanymethond() {
	  System.out.println("methond before every test method ");
  }
  @AfterMethod
  public void AfterallMethod() {
	  System.out.println("methond after all test method ");
  }
  
  @BeforeClass
  public void BeforegetClass() {
	  System.out.println("before claas");
  }
  @AfterClass
  public void AftergetClass() {
	  System.out.println("after claas");
  }
}
