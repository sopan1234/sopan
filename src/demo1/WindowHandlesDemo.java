package demo1;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandlesDemo {
	
	public void demo()  {
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://site25-way2sms.com//content//index.html");
		
		ArrayList<String> wins=new ArrayList<>(driver.getWindowHandles());
		
	}

}
