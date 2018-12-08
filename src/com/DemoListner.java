package com;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.TestNglistnerDemo.class)

public class DemoListner {
	@Test
	public void Myclass()
	{
		WebDriver wb=new FirefoxDriver();
		wb.manage().window().maximize();
		wb.get("http://WWW.google.com");
		System.out.println(wb.getTitle());
		wb.quit();
	}
	@Test
	public void Dummylistner()
	{
		System.out.println("test2 Dummy listner");
		Assert.assertFalse(false);
	}

}
