package Testcases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStampGenerator {
public static void main(String[] args) {
	SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMMyyyy_mss");
	String getdate  = dateFormat.format(new Date());
	System.out.println(getdate+"\n");
	try{
		File filepath=new File("../practice/FileLocation");
//		File filepath=new File(classpath, "/FileLocation");
		File newfile=new File(filepath, "MyFile.xls");
//	    String filename= "C:\\Users\\Sreenu\\eclipse-workspace\\myproject\\practice\\FileLocation\\MyFile.xls";
	    FileWriter fw = new FileWriter(newfile, true); //the true will append the new data
	    fw.write(getdate+"\n");//appends the string to the file
	    fw.close();
	}
	catch(IOException ioe){
	    System.err.println("IOException: " + ioe);
	}
	 
}
}
