package com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class headingPage {
	public static WebDriver driver;
  @Test
  public void PlaceHolderusername() {
	  String EmailActual=driver.findElement(By.xpath(".//*[@id='email']")).getAttribute("placeholder");
	  String EmailExpected="Email";
	  assertEquals(EmailActual,EmailExpected);
	  System.out.println("placeholder Email verifiled");
	  System.out.println("************");
  }
  @BeforeMethod
  public void headingOfpage() {
	 String ActualHeading= driver.findElement(By.xpath("html/body/div[1]/div[2]/p")).getText();
	 String ExpectedHeading="sign in start your session";
	 assertEquals(ActualHeading, ExpectedHeading);
	 System.out.println("+ExpectedHeading");
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
  }

}
