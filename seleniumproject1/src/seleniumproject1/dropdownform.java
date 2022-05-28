package seleniumproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownform {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/form-3");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.name("country_1507714747"));
		Select select=new Select(drop);
		select.selectByIndex(8);
	}

}
