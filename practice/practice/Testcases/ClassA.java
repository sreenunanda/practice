package Testcases;

import org.testng.annotations.BeforeTest;

public class ClassA {

	@BeforeTest
	public void beforeTest() {
		System.out.println("--> before test");
	}
}
