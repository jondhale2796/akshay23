import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Resources\\\\\\\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://testautomationpractice.blogspot.com/");
		  driver.manage().window().maximize();
		  Actions act=new Actions(driver);
		  WebElement dest=driver.findElement(By.xpath("//div[@id='draggable']//p[text()='Drag me to my target']"));
			WebElement sou=	driver.findElement(By.xpath("//p[text()='Drop here']"));
			
			//Thread.sleep(2000);
			act.dragAndDrop(dest,sou).build().perform();
			 WebElement dest1=driver.findElement(By.xpath("//li//h5[text()='Mr John']"));
			 WebElement sou1=driver.findElement(By.xpath("//div[@id='trash']"));
			 act.dragAndDrop(dest1,sou1).build().perform();
			 WebElement dest12=driver.findElement(By.xpath("//li//h5[text()='Mary']"));
			 WebElement sou13=driver.findElement(By.xpath("//div[@id='trash']")); 
			 act.dragAndDrop(dest12,sou13).build().perform();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//h5[text()='Mr John']"));
		 WebElement click= driver.findElement(By.xpath("//a[text()='Recycle image'][1]"));
		 act.moveToElement(click).build().perform();
		 click.click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//h5[text()='Mary']"));
		 WebElement click1= driver.findElement(By.xpath("//a[text()='Recycle image'][1]"));
		 act.moveToElement(click1).build().perform();
		 click1.click();
		 Thread.sleep(2000);
		 driver.close();		 			
}
}