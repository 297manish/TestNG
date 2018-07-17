package com.TestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListnerTestClass {

	int i=0;
	
	@Test(priority=0)
	public void passTest(){
		Assert.assertTrue(true);
	}
	
	@Test(priority=1)
	public void failTest(){
		Assert.assertTrue(false);
	}
	
	@Test(priority=2)
	public void skipTest(){
		throw new SkipException("skipping test");
	}
	
	@Test(priority=3, successPercentage=60, invocationCount=5)
	public void repeatTestBAsesOnPercentage(){
		i++;
		if(i==1 || i==2){
			Assert.assertTrue(false);
		}
	}
	
}
