package Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	WebDriver driver;
	private static String filepath=null;
	private DecimalFormat decimalFormat= new DecimalFormat();

	@BeforeClass
	public void beforeclass() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sreenu\\Downloads\\practice\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://192.168.0.122:9012/mifare-web/admin/login#no-back-button");
	}
	
	@Test(dataProvider="testData",enabled =false)
	public void loginpage1(Object[][] loginTestData) throws Exception {

		driver.findElement(By.id("loginUser")).clear();
		driver.findElement(By.id("loginUser")).sendKeys(loginTestData[0][1].toString());
		driver.findElement(By.id("loginPass")).click();
		driver.findElement(By.id("loginPass")).clear();
		driver.findElement(By.id("loginPass")).sendKeys(loginTestData[0][2].toString());

		if(loginTestData[0][3].toString().equalsIgnoreCase("submit")) {
			driver.findElement(By.id("loginSubmit")).click();
			System.out.println("test case id: **"+loginTestData[0][0].toString()+"** is executed");
		}
		else {
			System.out.println("test case id: **"+loginTestData[0][0].toString()+"** is not executed");
		}
		Thread.sleep(500);
	}
	
	
	@Test(dataProvider="testData", enabled =true)
	public void loginpage(Map<String, String> loginTestData) throws Exception {

		driver.findElement(By.id("loginUser")).clear();
		driver.findElement(By.id("loginUser")).sendKeys(loginTestData.get("UserName"));
		driver.findElement(By.id("loginPass")).click();
		driver.findElement(By.id("loginPass")).clear();
		driver.findElement(By.id("loginPass")).sendKeys(loginTestData.get("Password"));

		
		if(loginTestData.get("Action").equalsIgnoreCase("submit")) {
			driver.findElement(By.id("loginSubmit")).click();
			Reporter.log("test case id: **"+loginTestData.get("TCID")+"** is executed",true);
//			System.out.println("test case id: **"+loginTestData.get("TC ID")+"** is executed");
		}
		else {
			System.out.println("test case id: **"+loginTestData.get("TCID")+"** is not executed");
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

		for(int i=1;i<=rowsCount;i++) {
			Map<Object, Object>datamap=new HashMap<Object, Object>();
			for(int j=0;j<colCount;j++) {
				int cell=-1;
				datamap.put(setFormatter(sheet.getRow(0).getCell(j)), setFormatter(sheet.getRow(i).getCell(j)));
				/*datamap.put("TCID", sheet.getRow(i).getCell(++cell).toString());
				datamap.put("UserName", sheet.getRow(i).getCell(++cell).toString());
				datamap.put("Password", sheet.getRow(i).getCell(++cell).toString());
				datamap.put("Action", sheet.getRow(i).getCell(++cell).toString());*/

			}
			data[i-1][0]=datamap;
		}
		return data;
	}
	// *********************************************************************************************************
			private String decimalToString(double d){
				decimalFormat.setMaximumFractionDigits(0);  
				return  decimalFormat.format(d).replace(".", "");
			}
		// *********************************************************************************************************

		public String readExcelCell(Cell cell){

			switch(cell.getCellType()) {

			case Cell.CELL_TYPE_NUMERIC:
				String temps=decimalToString(cell.getNumericCellValue());
				if(temps.trim().equalsIgnoreCase("")){ 
					return null;
				}else{//System.out.println(temps);
					return temps;
				}

			case Cell.CELL_TYPE_STRING: 
				if(cell.getStringCellValue().trim().equalsIgnoreCase("")){  
					return null;
				}else{ //System.out.println(cell.getStringCellValue().trim());
					return  cell.getStringCellValue().trim();
				}
			}
			return null;
		}
	
	public String setFormatter(Cell cell) {
		DataFormatter formatter = new DataFormatter();
		String cellValue = formatter.formatCellValue(cell);
		return cellValue;
	}
}

