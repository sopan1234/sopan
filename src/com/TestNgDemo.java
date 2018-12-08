package com;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNgDemo {
	WebDriver wb;
	
	@BeforeClass
	public void BrowserStarted()
	{
		wb=new FirefoxDriver();
		System.out.println("driver Started");
		
	}
	@Test(dependsOnMethods="BrowserStarted")
	public void Login()
	{
		wb.findElement(By.xpath(".//*[@id='email']")).sendKeys("kiran@gmail.com");
		wb.findElement(By.xpath(".//*[@id='password']")).sendKeys("123456");
		wb.findElement(By.xpath(".//*[@id='form']/div[3]/div/button")).click();
		boolean status=wb.findElement(By.xpath("html/body/div[1]/header/a/span[2]")).isDisplayed();
		Assert.assertTrue(status);
}
	/*@Test(dependsOnMethods="Login")
	public void logout() throws Exception
	
	{
		wb.findElement(By.xpath("html/body/div[1]/header/nav/div/ul/li/a")).click();
		Thread.sleep(2000);
		Assert.assertTrue(wb.findElement(By.xpath("html/body/div[1]/div[1]/a/b")).isDisplayed());
	}
	@AfterMethod(dependsOnMethods="logout")
	public void Close()
	{
		wb.quit();
		System.out.println("driver Closed");
	}*/
	
	}



111111