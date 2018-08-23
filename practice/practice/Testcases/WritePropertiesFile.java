package Testcases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class WritePropertiesFile {
	public static void main(String[] args) throws Exception {
	/*	Properties p=new Properties();  
		p.setProperty("name","Sonoo Jaiswal");  
		p.setProperty("email","sonoojaiswal@javatpoint.com");  
		  
		p.store(new FileWriter("test2.properties"),"Javatpoint Properties Example");  */
		
		
		/*Properties prop = new Properties();
		OutputStream output = null;

		try {

			output = new FileOutputStream("test2.properties");

			// set the properties value
			prop.setProperty("database", "localhost");
			prop.setProperty("dbuser", "mkyong");
			prop.setProperty("dbpassword", "password");

			// save properties to project root folder
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}*/
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("ddyymss");
			String getdate  = dateFormat.format(new Date());
			Properties properties = new Properties();
			properties.setProperty("Date", getdate);
			properties.setProperty("email", getdate+"@girmiti.com");
			properties.setProperty("phonenumber", getdate);
			properties.setProperty("modelname", getdate);
			
			//trail
//			System.out.println(properties.getProperty("Date"));
			
			File file = new File("testdata.properties");
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
