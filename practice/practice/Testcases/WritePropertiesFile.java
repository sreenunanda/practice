package Testcases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class WritePropertiesFile {
	public static void main(String[] args) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("ddyyyymss");
			String getdate  = dateFormat.format(new Date());
			Properties properties = new Properties();
			properties.setProperty("Date", getdate);
			properties.setProperty("email", getdate+"@girmiti.com");
			properties.setProperty("phonenumber", getdate);
			properties.setProperty("modelname", getdate);
			
			//trail
			System.out.println(properties.getProperty("Date"));
			
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
