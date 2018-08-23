package Testcases;

import org.testng.annotations.Test;

public class ClassD extends WebElementUtils {

	@Test(groups = { "demo" })

	public void method8() {
		System.out.println(" method8 class D test");
	}

	@Test(alwaysRun=false)
	public void method7() {
		System.out.println(" method7 class D test");
	}
}
