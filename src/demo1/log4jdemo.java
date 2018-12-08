package demo1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class log4jdemo {
	@Test
	
	public void demo() throws Exception {
		
	Logger logger=Logger.getLogger("log4jdemo");
	
	PropertyConfigurator.configure("log4j.properties");
	
	WebDriver wb=new FirefoxDriver();
	wb.get("https://www.google.com/");
	wb.findElement(By.id(".//*[@id='gs_htif0']")).sendKeys("testing");
	wb.findElement(By.xpath("//ul"));

	
		
		
	}

}
