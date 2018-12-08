package Listner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class keypressesDemo {
	
	WebDriver driver;
	@Test
	
	public void keydemo() {
		

		driver =new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/key_presses");
		
		Actions action=new Actions(driver);
		
		action.sendKeys(Keys.SPACE).build().perform();
		
		
		
		
		/*driver.findElement(By.id("content")).sendKeys(Keys.SPACE);*/
		
		
		String text=driver.findElement(By.id("result")).getText();
		
		System.out.println(text);
		
		Assert.assertEquals(text, "You entered: SPACE");
		
		
		
		
		
		
	}
	
}
