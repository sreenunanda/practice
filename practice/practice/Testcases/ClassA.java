package Testcases;

import org.testng.annotations.Test;

public class ClassA extends WebElementUtils{
	
	@Test(groups = {"demo","demo01"})
	public void method1() {
		str="123";
		map.put("key1", "12345");
		System.out.println("independent method1 of ClassA");
//		System.out.println(Class1.email_id);
	}

	@Test(dependsOnGroups= {"demo"})
	public void method2() {
		System.out.println("dependent method2 of ClassA");
		System.out.println(getkey());
	}

}
