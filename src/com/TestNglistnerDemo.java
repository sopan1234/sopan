package com;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNglistnerDemo implements ITestListener{

	@Override
	public void onFinish(ITestContext result) {
		
		System.out.println("Test cases failed and details are" +result.getName());
	}

	@Override
	public void onStart(ITestContext result) {
		
		System.out.println("Test cases start and details are" +result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test cases FailedButWithinSuccess and details are" +result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		System.out.println("Test cases failure" +result.getName());

		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test cases skipped" +result.getName());

		
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		
		
	}

}
