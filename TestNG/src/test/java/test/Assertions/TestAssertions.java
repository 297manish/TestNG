package test.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssertions {

	
	@Test
	public void a(){
		System.out.println("1");
		Assert.assertEquals("hello", "yhello");
		System.out.println("2");
	}
	@Test
	public void b(){
		Assert.assertEquals("hello", "Hello");
	}
	@Test
	public void c(){
		Assert.assertTrue(false);
	}
	
	
}
