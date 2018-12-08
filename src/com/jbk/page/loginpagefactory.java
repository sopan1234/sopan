package com.jbk.page;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpagefactory {
	
	  WebDriver driver;
	
	public loginpagefactory(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	@FindBy(id="email")
	
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.ID,using="password")
	
	@CacheLookup
	WebElement passs;
	
	@FindBy(how=How.XPATH,using=".//*[@id='form']/div[3]/div/button")
	@CacheLookup
	WebElement sbutton;
	
	public void name111(String uname,String pas) {
		
		
		username.sendKeys(uname);
		
		passs.sendKeys(pas);
		
		sbutton.click();
	}
	
	

}
