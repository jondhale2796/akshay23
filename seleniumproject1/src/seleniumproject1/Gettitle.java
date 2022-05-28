package seleniumproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeDriver cdriver =new ChromeDriver();
		cdriver.get("https://demoqa.com");
		cdriver.getCurrentUrl();
		cdriver.getPageSource();
		String sname =cdriver.getTitle();
		System.out.println("current page title :"+sname);
		cdriver.findElement(By.name("user"));
		//write in this way it good thing bcoz if u to use multitime then its good 
		//WebElement logoutbutton = cdriver.findElement(By.linkText("logout"));
		//***expected wait 
//		WebDriverWait wait=new WebDriverWait(driver,20);		
//		wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
//		
//		Genric way to lauch browser 
//		WebDriver driver=new ChromeDriver();
//				driver.get("https://demoqa.com/checkbox");
	}

}
