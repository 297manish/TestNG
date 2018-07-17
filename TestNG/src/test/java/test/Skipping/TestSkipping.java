package test.Skipping;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSkipping {

	@BeforeClass
	public void setUp(){
		System.out.println("Before Class");
	}
	@Test
	public void a(){
		System.out.println("Test Case 1");
	}

	@Test(enabled=false)
	public void b(){
		System.out.println("Test Case 2");
	}
	@Test
	public void c(){
		System.out.println("Test Case 3");
		throw new SkipException("Skipped");
	}
}
