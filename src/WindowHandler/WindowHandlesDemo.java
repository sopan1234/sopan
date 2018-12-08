package WindowHandler;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowHandlesDemo {
	
	@Test
	
	
	public void	 demo() throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.way2sms.com/");
		
		ArrayList<String> wins=new ArrayList<>(driver.getWindowHandles());
		
		for (int i = 1; i < wins.size(); i++) {
			
			driver.switchTo().window(wins.get(i));
			
			driver.close();
			
			Thread.sleep(5000);
			
		}
		
		driver.switchTo().window(wins.get(0));
		
		driver.findElement(By.xpath(".//*[@id='mobileNo']")).sendKeys("988126565");
		
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("98812");
		
		driver.findElement(By.xpath(".//*[@id='loginform']/div[2]/div[2]/button")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
