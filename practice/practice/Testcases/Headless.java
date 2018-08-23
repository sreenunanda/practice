package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class Headless {

	@Test
	public void HeadlessTest() {
		HtmlUnitDriver unitDriver = new HtmlUnitDriver();
		unitDriver.get("https://dev.ipsidy.net/issuance-admin/admin/login#no-back-button");
		System.out.println("testing");
		System.out.println("page Title: "+unitDriver.getTitle());
		unitDriver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		System.out.println("current URL:" +unitDriver.getCurrentUrl());
	}
}
