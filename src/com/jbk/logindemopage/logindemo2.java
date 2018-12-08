package com.jbk.logindemopage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.jbk.page.BrowserLogin;
import com.jbk.page.loginpagefactory;
import com.jbk.page.loginpageuser;

public class logindemo2 {
	
	@Test
	public void demo() throws Exception {
		
		WebDriver driver=BrowserLogin.Browserlogindemo("firefox", "file:///D:/sopan/Selenium%20Software/Offline%20Website/index.html");
		
		
		loginpagefactory login=PageFactory.initElements(driver, loginpagefactory.class);
		
		login.name111("kiran@gmail.com", "123456");
		
		
		
		
		loginpageuser log=PageFactory.initElements(driver, loginpageuser.class);
		
		log.getuserdata();
		
		driver.quit();
		
	}

}
