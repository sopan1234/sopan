package com.jbk.logindemopage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.jbk.page.BrowserLogin;
import com.jbk.page.pagelogin;

public class logindemo {
	
	
	
	
	@Test
	public void demologin() {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/sopan/Selenium%20Software/Offline%20Website/index.html");
		driver.manage().window().maximize();
		
		pagelogin login=new pagelogin(driver);
		
		login.userdata("kiran@gmail.com");
		
		login.passworddata("123456");
		
		login.submitbutton();
		
		driver.quit();


}
}
