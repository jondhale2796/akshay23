package seleniumproject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownbyusingselect {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		List<WebElement>mainmenu=driver.findElements(By.xpath("//div[@class='InyRMC _3Il5oO']"));
		System.out.println(mainmenu.size());
		for(int i=0;i<mainmenu.size();i++) {
			System.out.println("mainmenu print :"+mainmenu.get(i).getText());
		}
			
		}

}
