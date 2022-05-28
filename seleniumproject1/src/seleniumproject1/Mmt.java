package seleniumproject1;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mmt {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/flights");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys("Pune");
		WebElement element=driver.findElement(By.xpath("//p[text()='Pune, India']"));
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bangaluru");
		WebElement element1=driver.findElement(By.xpath("//p[text()='Bengaluru, India']"));
		element1.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[4]/div/p[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'widgetSearchBtn')]")).click();
		Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
//	List<WebElement>flight=driver.findElements(By.xpath("//div[@class='makeFlex simpleow']"));
//	System.out.println(flight.size());
//	for(int i=0;i<flight.size();i++) 
//	
		
		
		
		driver.findElement(By.xpath("//div[@class='filtersOuter'][1]"));
		driver.findElement(By.xpath("//label[@class='makeFlex spaceBtwCenter appendBottom12 pointer '][3][1]/div/span[1][1]/span[1]")).click();
		
		List<WebElement>flight=driver.findElements(By.xpath("//div[@class='makeFlex simpleow']"));
		System.out.println(flight.size());
		for(int i=0;i<flight.size();i++) {
			
			System.out.print(flight.get(i).getText());
			System.out.println();
			
		}
		//driver.close();
	//	driver.findElement(By.xpath("//label[@class='makeFlex spaceBtwCenter appendBottom12 pointer checked']")).click();
	}
}
//span[text()='Morning Departures']
