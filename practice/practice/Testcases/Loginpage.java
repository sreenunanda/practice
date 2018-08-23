package Testcases;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import objects.LoginpageObjects;

public class Loginpage extends TestBase {

	@BeforeClass
	private void before() {
		launchBrowser();
	}

	@Test
	private void testcase1() throws Exception {

		LoginpageObjects loginpageObjects = new LoginpageObjects(webDriver);
		loginpageObjects.getUsername().sendKeys("sreenu01");
		loginpageObjects.getPassword().sendKeys("Girmiti@1234");
		Thread.sleep(1000);
		loginpageObjects.getTransactions().click();
		Thread.sleep(1000);
		loginpageObjects.getLoadCard().click();
		Thread.sleep(1000);
		loginpageObjects.getBulkLoadCard().click();
		loginpageObjects.getDataFile().sendKeys("C:\\Users\\Sreenu\\Downloads\\practice\\resources\\ISS_AGENT_LOADCARDINDV_009_145219.png");
		webDriver.switchTo().alert().accept();
		Thread.sleep(1000);
		loginpageObjects.getLogout().click();
	}

	@AfterClass
	private void after() {
		tearDown();
	}

}
