package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.LoginpageObjects;

public class Fileupload {
	protected WebDriver webDriver=null;

	@Test
	private void file() {
		try {

		WebDriverManager.chromedriver().version("2.36").setup();
		webDriver=new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://dev.ipsidy.net/issuance-agent");
		
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
