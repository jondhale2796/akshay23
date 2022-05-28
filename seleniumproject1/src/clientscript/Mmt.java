package clientscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Browserutility;

public class Mmt {

	public static void main(String[] args) {
		
		Browserutility br=new Browserutility();
		WebDriver driver=br.getbrowser("chrome");
		//br.getApplication("https://www.makemytrip.com/flights");
	br.getApplication("https://www.makemytrip.com/flights");
		br.gettitle();
//        br.getApplication("https://www.amazon.com");
//        br.gettitle();
//		
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
	
		
		
	}

}
