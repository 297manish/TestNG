package test.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestAnnotation {

	@BeforeSuite
	public void befSuite(){
		System.out.println("before suite");
	}
	@AfterSuite
	public void aftSuite(){
		System.out.println("after suite");
	}
	@BeforeClass
	public void befClass(){
		System.out.println("before class");
	}
	@AfterClass
	public void aftClass(){
		System.out.println("after class");
	}
	@BeforeMethod
	public void befmethod(){
		System.out.println("before method");
	}
	@AfterMethod
	public void aftMethod(){
		System.out.println("after method");
	}
	@Test
	public void a(){
		System.out.println("test case 1");
	}
	
}
