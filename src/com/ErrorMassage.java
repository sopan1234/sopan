package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMassage {
	WebDriver wb;
	@Test
	public void Testerror() throws InterruptedException
	{
		wb=new FirefoxDriver();
		wb.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		wb.findElement(By.xpath(".//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/content/div[1]/div/div[1]")).click();
		System.out.println(1);
		String actual_error =wb.findElement(By.xpath(".//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/content/div[1]/div/div[2]/div[2]")).getText();
		System.out.println(2);
		Thread.sleep(2000);
		String Expexted_error="Enter an email or phone number";
		Assert.assertEquals(actual_error, Expexted_error);
		Assert.assertTrue(actual_error.contains("abcdgffff"));
		System.out.println("String completed");
		
	
	}
	
	
	

}
