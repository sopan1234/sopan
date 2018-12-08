package Listner;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
		
		String parentwindow=driver.getWindowHandle();
		
		
		Set<String> childwindow=driver.getWindowHandles();
		
		Iterator it=childwindow.iterator(); 
		
		while (it.hasNext())
		{
			
			String handle=(String) it.next();
			
			if(!parentwindow.equals(childwindow))
			{
				driver.switchTo().window(parentwindow);
			}
		
			
			driver.close();
			
		}
		
	}
}
