package Listner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actionclassfacebookdemo {
	@Test
	
	public void demo() {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		
		WebElement wb=driver.findElement(By.id("email"));
		
		Actions builder=new Actions(driver);
		
		Action seriesofaction=builder.moveToElement(wb).
				click()
				.keyDown(wb,Keys.SHIFT)
				.keyUp(wb,Keys.SHIFT)
				.sendKeys(wb,"hello")
				.doubleClick(wb)
				.contextClick()
				.build();
				
				seriesofaction.perform();
		
		
		
	}

}
