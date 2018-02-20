package Testcases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesFile {
	public static void main(String[] args) {
		try {
			Properties properties = new Properties();
			properties.setProperty("Date", "12Aug2018");
			properties.setProperty("email", "23@gmail.com");
			properties.setProperty("phonenumber", "1234567");

			File file = new File("test2.properties");
			FileOutputStream fileOut = new FileOutputStream(file);
			properties.store(fileOut, "appending values");
			fileOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
