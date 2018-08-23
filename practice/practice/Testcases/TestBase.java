package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	protected WebDriver webDriver=null;
	public void launchBrowser() {
		WebDriverManager.chromedriver().version("2.36").setup();
		webDriver=new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://dev.ipsidy.net/issuance-agent");
	}
	
	public void tearDown() {
		webDriver.close();
	}
}
