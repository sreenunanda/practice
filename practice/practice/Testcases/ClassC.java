package Testcases;

import org.testng.annotations.Test;

import constants.Class1;

public class ClassC extends WebElementUtils{

	@Test(groups = { "demo"})
	public void method4() {
		System.out.println("dependent method4 method of ClassC");
	}

	@Test(dependsOnMethods = "method4")
	public void method5() {
		System.out.println("dependent method5 method of ClassC");
		System.out.println(Class1.email_id);
	}

	@Test(dependsOnGroups = {"demo01"})
	public void method6() {
		System.out.println(getkey());
		System.out.println("independent method6 method of ClassC");
	}
}
