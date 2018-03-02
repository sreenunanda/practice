/**
 * 
 */
package Testcases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * << Add Comments Here >>
 *
 * @author Girmiti Software
 * @date 09 May 2017 11:41:43
 * @version 1.0
 */
public class PropertyHandler {

	static String fileName = "test2.properties";
	private static Properties properties;

	public PropertyHandler(){
	}

	public void finalize() throws Throwable {
	}

	public static String getProperty(String key){
		try{        

		//	String filePath = new File(fileName).getCanonicalPath();
			InputStream is = PropertyHandler.class.getResourceAsStream("/"+fileName);
		//	InputStream is =new FileInputStream(fileName);
			if(is==null)
			{
				throw new FileNotFoundException("path mentioned is wrong");
			}
			properties=new Properties();
			properties.load(is);
		}catch(FileNotFoundException fnfe){

		}catch(IOException ie){

		}
		String value=properties.getProperty(key);
		if(value==null ){
			return null;
		}else{
			return value.trim();
		}
	}   

}
