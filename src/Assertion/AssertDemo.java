package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo
{
	@Test
	public void SoftAssertDemo()
	{
		SoftAssert assertion=new SoftAssert();
		System.out.println("Test assert");
		assertion.assertEquals(12, 13,"Count doesn't match'");
		System.out.println("Assert tested");
		assertion.assertAll();
		System.out.println("Assert");
	}
	@Test
	public void HardAssertDemo()
	{
		
		System.out.println("Test assert");
	 Assert.assertEquals(12, 13);
		System.out.println("Assert tested");
		
		
	}
	}
