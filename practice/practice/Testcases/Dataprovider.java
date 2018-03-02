package Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	WebDriver driver;
	private static String filepath=null;
	@BeforeClass
	public void beforeclass() throws Throwable {
		System.setProperty("webdriver.gecko.driver", PropertyHandler.getProperty("geckodriver"));
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://192.168.0.122:9012/mifare-web/admin/login#no-back-button");
	}
	
	@Test(dataProvider="testData")
	public void loginpage(Map<String, String> loginTestData) throws Exception {

		driver.findElement(By.id("loginUser")).clear();
		driver.findElement(By.id("loginUser")).sendKeys(loginTestData.get("username"));
		driver.findElement(By.id("loginPass")).click();
		driver.findElement(By.id("loginPass")).clear();
		driver.findElement(By.id("loginPass")).sendKeys(loginTestData.get("password"));

		if(loginTestData.get("action").equalsIgnoreCase("submit")) {
			driver.findElement(By.id("loginSubmit")).click();
			System.out.println("test case id: **"+loginTestData.get("TC ID")+"** is executed");
		}
		else {
			System.out.println("test case id: **"+loginTestData.get("TC ID")+"** is not executed");
		}
		Thread.sleep(500);
	}
	
	@AfterClass
	public void afterclass() {
		driver.quit();
	}
	
	
	@DataProvider(name="testData")
	public Object[][] getData() throws IOException{
		filepath="./testdata.xls";
		File file=new File(filepath);
		FileInputStream fileInputStream=new FileInputStream(file);
//		FileInputStream filepath = new FileInputStream("C:\\Users\\Sreenu\\Downloads\\practice\\testdata.xls");

		HSSFWorkbook wb = new HSSFWorkbook(fileInputStream);
		HSSFSheet sheet = wb.getSheet("Sheet1");
		int rowsCount=sheet.getLastRowNum();
		int colCount=sheet.getRow(0).getLastCellNum();
		wb.close();
		Object[][] data=new Object[rowsCount][1];

		for(int i=0;i<rowsCount;i++) {
			Map<Object, Object>datamap=new HashMap<Object, Object>();
			for(int j=0;j<colCount;j++) {
				datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
			}
			data[i][0]=datamap;
		}
		return data;
	}

}

