package seleniumproject1;
//import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshottake {
static ChromeDriver driver;
	//public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
//	 driver=new ChromeDriver();
//	 driver.get("https://www.makemytrip.com/flights");
//		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		 //  FileUtils.copyFile(file,new File("./lib/src.jpg"));
//				
		
		
	 static public void  main(String []a) throws IOException {
			System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
			 driver=new ChromeDriver();
		 driver.get("https://www.makemytrip.com/flights");
		 
		 TakesScreenshot ts= (TakesScreenshot)driver;
	//	 File temp=ts.getScreenshotAs(OutputType.FILE);
		// File dest=new File(System.getProperty("user.dir")+"\\screenshot\\pic.png");
		// FileHandler.copy(temp,dest);
		 System.out.println("screenshot capture !");
		 
		FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File(System.getProperty("user.dir")+"\\screenshot\\pic.png"));
	}
	
}	

			
			
		
	
	

