package errormassage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ErrorMassageDemo {
	
	@Test
	
	public void ErrorMassage() throws Exception {
		
		
		WebDriver wb=new FirefoxDriver();
		
		wb.get("http://gmail.com");
		
		wb.manage().window().maximize();
		
		wb.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
		
		Thread.sleep(5000);
		
		String actual =wb.findElement(By.xpath(".//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[2]/div[2]")).getText();
		
		String expected="Enter an email or phone number";
		
		Assert.assertEquals(actual, expected);
		
		Assert.assertTrue(actual.contains("Enter an email or phone number"));
		
		System.out.println("Test completed");
		
		wb.quit();
		
		 
		
	}

}
