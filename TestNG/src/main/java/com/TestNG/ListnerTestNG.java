package com.TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerTestNG implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("All Test Finished");
		Reporter.log("All Test Finished");
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("All Test Started");
		Reporter.log("All Test Started");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test is passed based on %  " + getMethodName(arg0));
		Reporter.log("Test is passed based on %  " + getMethodName(arg0));
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Case Failed  "+ getMethodName(arg0));
		Reporter.log("Test Case Failed  "+ getMethodName(arg0));
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Case Skipped  "+ getMethodName(arg0));
		Reporter.log("Test Case Skipped  "+ getMethodName(arg0));
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Case Started  "+ getMethodName(arg0));
		Reporter.log("Test Case Started  "+ getMethodName(arg0));
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Case Passed  "+ getMethodName(arg0));
		Reporter.log("Test Case Passed  "+ getMethodName(arg0));
	}

	private static String getMethodName(ITestResult arg0){
		return arg0.getMethod().getConstructorOrMethod().getName();
	}
}
