package demo1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DomDemo {
	
	@Test
	
	public void Demo() {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('email').value='loging.123'");
		
		js.executeScript("document.getElementsByName('pass').value='loging.123'");
		
		
		driver.close();
		
	}

}
