package test.dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependency {

	@Test(priority=1,dependsOnMethods={"openLoginPage"})
	public void signIn(){
		System.out.println("Sign In");
	}
	@Test(priority=0)
	public void openLoginPage(){
		System.out.println("Open Login Page");
		//Assert.assertTrue(true);
		//Assert.assertTrue(false);
	}
	@Test(priority=2,dependsOnMethods={"signIn"})
	public void logOut(){
		System.out.println("Log Out");
	}
}
