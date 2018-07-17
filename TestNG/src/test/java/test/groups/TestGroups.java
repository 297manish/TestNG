package test.groups;

import org.testng.annotations.Test;

public class TestGroups {

	@Test(groups={"smoke"})
	public void a(){
		System.out.println("Smoke Test");
	}
	@Test(groups={"regression", "sanity"})
	public void b(){
		System.out.println("Regression Test");
	}
	@Test(groups={"sanity"})
	public void c(){
		System.out.println("Sanity Test");
	}
}
