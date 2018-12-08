package com.jbk.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pagelogin {
	
	WebDriver driver;
	
	public pagelogin(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	By username=By.id("email");
	
	By password=By.xpath(".//*[@id='password']");
	
	By submit=By.xpath(".//*[@id='form']/div[3]/div/button");
	
	
	public void userdata(String uname) {
		
		driver.findElement(username).sendKeys(uname);
		
	}
	
	public void passworddata(String pass) {
		
		driver.findElement(password).sendKeys(pass);
	}
	
	public void	 submitbutton() {
		
		driver.findElement(submit).click();
		
	}

}
