package Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TryZip {
	public static void main(String[] args) {
		try {
			SimpleDateFormat dateFormat=new SimpleDateFormat("ddMMyyyymmss");
			String date=dateFormat.format(System.currentTimeMillis());
		
			/**
			 *  let's create a ZIP file to write data
			 */
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Sreenu\\Documents\\"+date+".zip");
			ZipOutputStream zipOS = new ZipOutputStream(fos);
			String file1 = "C:\\Users\\Sreenu\\Downloads\\practice\\test-output\\index.html";
			/***
			 * add multiple reports
			 */
			/*String file2 = "java7.txt";
			String file3 = "targetrr/apache.txt";
			String file4 = "java.txt";*/
			writeToZipFile(file1, zipOS);
			/**
			 * write multiple file to convert as zip file
			 */
			/*writeToZipFile(file2, zipOS);
			writeToZipFile(file3, zipOS);
			writeToZipFile(file4, zipOS);*/
			zipOS.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeToZipFile(String path, ZipOutputStream zipStream)
			throws FileNotFoundException, IOException {
		System.out.println("Writing file : '" + path + "' to zip file");
		File aFile = new File(path);
		FileInputStream fis = new FileInputStream(aFile);
		ZipEntry zipEntry = new ZipEntry(path);
		zipStream.putNextEntry(zipEntry);
		byte[] bytes = new byte[1024];
		int length;
		while ((length = fis.read(bytes)) >= 0) {
			zipStream.write(bytes, 0, length);
		}
		zipStream.closeEntry();
		fis.close();
		System.out.println("done");
	}

}
