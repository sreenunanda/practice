package Testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelReader {

	@Test
	public void readExcel() throws EncryptedDocumentException, InvalidFormatException, IOException {
		Workbook wb =null;
		FileInputStream excelFileToRead = new FileInputStream("C:\\Users\\Technumen53\\git\\practice\\practice\\testdata2.xlsx");
		wb = WorkbookFactory.create(excelFileToRead); 
		Sheet sheet = wb.getSheet("Sheet1");
		String result=sheet.getRow(1).getCell(1).toString();
		System.out.println(result);
	}
}
