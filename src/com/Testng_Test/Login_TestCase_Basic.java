package com.Testng_Test;

//import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;
//import org.junit.runners.Parameterized.Parameters;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login_TestCase_Basic{
	public static WebDriver driver;

	@BeforeSuite(groups = "Smoke")
	public static WebDriver setup_Browser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// cookies delete
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///D:/AdminLTE/index.html");
		return driver;

	}

	@Test(priority = 1, groups = "Regression")
	public static void Verify_Url() {
		// Actual url
		String my_url = driver.getCurrentUrl();
		System.out.println("page title is " + my_url);

		// expected url
		String expected_url = "file:///D:/AdminLTE/index.html";
		Assert.assertEquals(my_url, expected_url);
		System.out.println("**************************");

		System.out.println("Test Case One with Thread Id:- "
				+ Thread.currentThread().getId());
	}

	@Test(priority = 2, groups = "Regression")
	public void verifyApplicationTitle() {
		// Actual title
		String my_title = driver.getTitle();
		System.out.println("page title is " + my_title);
		System.out.println("..................");

		// expected title
		String expected_title = "AdminLTE 2 | Log in";
		Assert.assertEquals(my_title, expected_title);
		System.out.println("************************");
		System.out.println("Test Case two with Thread Id:- "
				+ Thread.currentThread().getId());
	}

	@Test(priority = 3, groups = "Regression")
	public void verify_Title() {
		String stitle = driver
				.findElement(By.xpath("//a[@href='index2.html']")).getText();
		String exp = "AdminLTE";
		Assert.assertEquals(stitle, exp);
		System.out.println("Application title verify " + stitle);
		System.out.println("**********************");
	}

	@Test(priority = 4, groups = "Regression")
	public void Check_PlaceHolder_Username() {
		String str = driver.findElement(By.xpath("//input[@id='email']"))
				.getAttribute("placeholder");
		String exp = "Email";
		Assert.assertEquals(str, exp);
		System.out.println("placeholder Email-verified");
		System.out.println("*******************");
	}

		
	@AfterSuite(groups = "Smoke")
	public void close_Browse() {
		driver.quit();
	}

}
