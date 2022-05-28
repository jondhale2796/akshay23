package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserutility
{
	WebDriver driver;
	public WebDriver getbrowser(String bname)
	{
		if(bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver","C:\Users\Akshay(AJ)\eclipse-workspace123\seleniumproject1\resources\chromedriver.exe");
		 driver=new ChromeDriver();
		
	   }else if (bname.equalsIgnoreCase("edge"))
	   {
		   
	   }else
	   {
		   System.out.println("please provide correct browser");
	   }
	return driver;
	
	}
	public void getApplication(String url) 
	{
		driver.get(url);
	}
public void gettitle()
{
	System.out.println(driver.getTitle());
}
public void fromcity() {
	
}
}
