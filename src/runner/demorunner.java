package runner;





import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class demorunner {
	
	public static void main(String[] args) {
		
	
	
	
	
		TestNG runner=new TestNG();
		
		
		List<String> list=new ArrayList<>();
		
		
		list.add("D:\\sopan\\TestNgDemo\\test-output\\Suitetestcasefailed\\testng-failed.xml");
		
		runner.setTestSuites(list);
		
		runner.run();
		
	
	}
}
