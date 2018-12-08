package Listner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Rightclickdemo {
	
	WebDriver driver;
	
	@Test
	
	public void rightclick() {
		
		driver =new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions action=new Actions(driver);
		
		WebElement rightclick=driver.findElement(By.cssSelector(".context-menu-one"));
		
		action.contextClick(rightclick).build().perform();
		
		WebElement copy=driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		
		
		String coytext=copy.getText();
		
		System.out.println(coytext);
		
		driver.close();
		
	}

}
