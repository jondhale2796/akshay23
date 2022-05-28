package seleniumproject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/flights");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='sc-hiCibw dGZLZw']")).click();
		driver.findElement(By.xpath("//div/input[@type='text']")).sendKeys("Pune");
		
	driver.findElement(By.xpath("//span[text()='Pune, India']")).click();
		
	}

}
