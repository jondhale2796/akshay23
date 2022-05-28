package seleniumproject1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyfileRead {

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\Akshay(AJ)\\eclipse-workspace123\\seleniumproject1\\Akshayprop\\automationdemo.property");
	Properties prop=new Properties();
	prop.load(fis);
	System.setProperty(prop.getProperty("chromedriverkey"), prop.getProperty("chromedrivervalue"));
	String url=prop.getProperty("appurl");
//	System.out.println("application url:"+url);
//	System.out.println(prop.getProperty("username"));
//	System.out.println(prop.getProperty("password"));
//
	
	

	}

}
