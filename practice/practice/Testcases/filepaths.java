package Testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class filepaths {
public static void main(String[] args) throws Exception, IOException {
	String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
	String appConfigPath = rootPath + "test2.properties";
//	String catalogConfigPath = rootPath + "catalog";
	 
	Properties appProps = new Properties();
	 appProps.setProperty("user", "123");
	 appProps.store(new FileWriter(appConfigPath),"Javatpoint Properties Example");  
	String defaultConfigPath = rootPath + "test2.properties";
	appProps.load(new FileInputStream(defaultConfigPath));
	System.out.println(appProps.getProperty("name"));
	System.out.println(appProps.getProperty("version"));
	System.out.println(appProps.getProperty("site"));
}
}
