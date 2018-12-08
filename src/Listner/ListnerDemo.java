package Listner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ListnerDemo {

	
	
	@Test
	public void testlistner() throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.firefox.marionette","D:\\java by kiran\\gecodriver.exe");

		driver.get("http://demo.guru99.com/test/newtours/");
		
		
		WebElement link_Home=driver.findElement(By.linkText("Home"));
		
		WebElement td_home=driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a"));
		
		Actions builder=new Actions(driver);
		
		Action mousehover=builder.moveToElement(link_Home).build();
		
		String bg_colour=td_home.getCssValue("background_colour");
		
		System.out.println("before hour" +bg_colour);
		
		
		
		mousehover.perform();
		
		Thread.sleep(5000);
		
		bg_colour=td_home.getCssValue("background_colour");
		
		
		
		System.out.println("after hour" +bg_colour);
		
		driver.quit();
		
		
		
		
	}
}
