package com;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test(priority=1,description="check bank balance")
  public void checkBlankuser() {
	  System.out.println("test case1");
	  Assert.assertEquals(2, 2);
	  Assert.assertEquals(3, 3);
	  Assert.assertEquals(2, 3);
	  Assert.assertEquals(4	, 3);
	  Assert.assertEquals(4, 4);
	  
  }
  @Test(priority=-1,description="checkings Special user")
  public void checkspcuser() {
	  System.out.println("test case3");
  }
  @Test(priority=2,description="This is test cases")
  public void testcase3() {
	  System.out.println("test case3");
  }
 /* @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }*/

}
