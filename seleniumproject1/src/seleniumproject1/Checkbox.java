package seleniumproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeDriver check = new ChromeDriver();
		check.get("https://demoqa.com/checkbox");
		System.out.println(check.getTitle());
		WebElement homecheckbox=check.findElement(By.xpath("//span[@class='rct-checkbox']"));
		
		homecheckbox.click();
		
		WebElement result=check.findElement(By.id("result"));
		System.out.println(result.getText());
		//scrolling
		check.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		check.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		
	}

}
