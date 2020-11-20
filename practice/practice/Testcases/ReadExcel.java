package Testcases;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String setFormatter(Cell cell) {
		DataFormatter formatter = new DataFormatter();
		String cellValue = formatter.formatCellValue(cell);
		return cellValue;
	}

	public List<LinkedHashMap<String, String>> readExcel(String fileName) throws Exception {
		List<LinkedHashMap<String, String>> linkedHashMaps = new ArrayList<LinkedHashMap<String, String>>();
		FileInputStream fileInputStream = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowsCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		workbook.close();

		for (int i = 1; i <= rowsCount; i++) {
			LinkedHashMap<String, String> datamap = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				datamap.put(setFormatter(sheet.getRow(0).getCell(j)), setFormatter(sheet.getRow(i).getCell(j)));
			}
			linkedHashMaps.add(datamap);
		}
		return linkedHashMaps;
	}

	public static void main(String[] args) throws Exception {
		ReadExcel readExcel = new ReadExcel();
		List<LinkedHashMap<String, String>> excelData = readExcel
				.readExcel("C:\\Users\\Technumen53\\git\\practice\\practice\\ExcelData.xlsx");
		for (LinkedHashMap<String, String> linkedHashMap : excelData) {
			System.out.println("username :" + linkedHashMap.get("username"));
			System.out.println("password :" + linkedHashMap.get("password"));
		}
	}

}
