package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestTitle {
	@Test
	public void VerifiedTitle()
	{
		WebDriver wb=new FirefoxDriver();
		wb.get("file:///C:/sopan/Selenium%20Software/Offline%20Website/pages/examples/login.html");
		String My_title=wb.getTitle();
		String Expexted="Admin LTE";
		Assert.assertEquals(My_title, Expexted);
		System.out.println("Title verified Succesful");
	}

}
