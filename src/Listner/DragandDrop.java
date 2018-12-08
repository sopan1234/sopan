package Listner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {
	
	 WebDriver driver;
	 
	 @Test
	
	public void draganddropdemo() {
		
		driver=new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement source=driver.findElement(By.id("draggable"));
		
		WebElement target=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		
		action.clickAndHold(source).moveToElement(target).release().build().perform();
		
		/*action.dragAndDrop(source, target).build().perform();*/
		
		
		driver.close();
		
		
		
	}

}
