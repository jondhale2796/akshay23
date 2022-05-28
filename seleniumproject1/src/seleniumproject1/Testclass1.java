package seleniumproject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass1 {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
	ChromeDriver t1=new ChromeDriver();
	t1.navigate().to("https://www.flipkart.com/login");
	WebElement Email=t1.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	Email.sendKeys("akshayjondhale2020@gmail.com");
	WebElement Password=t1.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	Password.sendKeys("akshay@@##96");
	WebElement login=t1.findElement(By.xpath("//div[@class='_1Ijv5h']"));
	login.click();
	//System.out.println();
	System.out.println(t1.getTitle());
	
	//System.out.println(t1.manage());
	
	//div[@class='_1Ijv5h']
		
		
		
		
	
	}

}
