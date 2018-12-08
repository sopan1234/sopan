 	 	package com.jbk.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLogin {
	
	 static WebDriver driver;
	
	
	public  static WebDriver Browserlogindemo(String sbrowser,String url) {
		
		if(sbrowser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else if(sbrowser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(sbrowser.equalsIgnoreCase("IE"))
		{
		
			driver=new InternetExplorerDriver();
		}
		
	
		driver.manage().window().maximize();
		
		driver.get(url);
		
		return driver;
	}
	
	

}
