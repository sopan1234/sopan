package autoitdemo;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class autoitdemo1 {
	@Test
	
	public void demo() throws Exception {
		
	WebDriver driver=new FirefoxDriver();
	
	driver.get("file:///C:/Users/Dinesh/Desktop/fileupload.html");
	
	
	driver.manage().window().maximize();
	
	
	
	driver.findElement(By.xpath(".//*[@id='1']")).click();
	
	Thread.sleep(5000);
	
	Runtime.getRuntime().exec("C:\\Users\\Dinesh\\Desktop\\auto\\fileupload.exe");
	
	driver.quit();
		
	}

}
