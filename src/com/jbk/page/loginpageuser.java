package com.jbk.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpageuser {
	
	@FindBy(xpath="html/body/div[1]/aside[1]/section/ul/li[3]/a")
	WebElement users;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")
	WebElement addusers;
	
	@FindBy(how=How.ID,using="username")
	WebElement uname;
	
	@FindBy(how=How.XPATH,using=".//*[@id='mobile']")
	WebElement mobil;
	
	@FindBy(how=How.ID,using="email")
	WebElement email;
	
	@FindBy(how=How.XPATH,using=".//*[@id='Male']")
	WebElement gender;
	
	
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select")
	WebElement state;
	
	@FindBy(how=How.ID,using="password")
	WebElement pass;
	
	
	public void getuserdata() throws Exception {
		
		
		users.click();
		
		addusers.click();
		
		uname.sendKeys("sopan");
		
		mobil.sendKeys("123456789");
		
		email.sendKeys("sopanrane@gmail.com");
		
		gender.click();
		
		Thread.sleep(5000);
		
		
		state.click();
		
		Thread.sleep(5000);
		
		pass.sendKeys("1234556");
	}
	

}
