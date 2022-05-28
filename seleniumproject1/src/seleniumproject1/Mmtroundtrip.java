package seleniumproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mmtroundtrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		driver.findElement(By.cssSelector("li[data-cy=roundTrip]")).click();
		
		driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom5']")).click();
		driver.findElement(By.cssSelector("li[data-cy=\"adults-6\"]")).click();
		driver.findElement(By.cssSelector("li[data-cy='children-3']")).click();
		driver.findElement(By.xpath("//button[@class='primaryBtn btnApply pushRight']")).click();
		driver.findElement(By.xpath("//ul/li/p[text()='Student ']")).click();
		driver.findElement(By.cssSelector("p[data-cy='submit']")).click();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		//errormsg reading time nosuch element exception is occur 
		Thread.sleep(2000);
		WebElement errormsg=driver.findElement(By.cssSelector("p#specialFareEorroMessage"));
		System.out.println(errormsg);

	}

}
