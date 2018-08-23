package Testcases;

import org.testng.annotations.Test;

public class ClassB extends WebElementUtils{
	@Test(groups = { "Class_B" }, dependsOnGroups = { "demo01" })
	public void method3() {
		System.out.println("In method3 method of ClassB");
		System.out.println(getkey());
	}
}
