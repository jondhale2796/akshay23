import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nopcommerce {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "Resources\\\\\\\\chromedriver.exe");
			  WebDriver driver=new ChromeDriver();
			  driver.get("https://demo.nopcommerce.com/");
			  driver.manage().window().maximize();
			  Actions action = new Actions(driver);
			  Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//div/ul/li//a[text()='Computers ']"));
		action.moveToElement(ele).build().perform();
		System.out.println(ele.getText()+":");
		List<WebElement>ele2=driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li//ul"));
			for(WebElement  ele3:ele2) {
				System.out.println(ele3.getText());
			}
			WebElement ele3=driver.findElement(By.xpath("//div/ul/li//a[text()='Electronics ']"));
			action.moveToElement(ele3).build().perform();
			System.out.println(ele3.getText()+":");
			List<WebElement>ele4=driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li//ul"));
			for(WebElement ele5 :ele4) {
				System.out.println(ele5.getText());
			}
			WebElement ele5=driver.findElement(By.xpath("//div/ul/li//a[text()='Apparel ']"));
			action.moveToElement(ele5).build().perform();
			System.out.println(ele5.getText()+":");
			List<WebElement>ele6=driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li//ul"));
			for(WebElement ele7 :ele6) {
				System.out.println(ele7.getText());
			}
			System.out.println();
			WebElement ele7=driver.findElement(By.xpath("//div/ul/li//a[text()='Digital downloads ']"));
			action.moveToElement(ele7).build().perform();
			System.out.println(ele7.getText()+":");
			System.out.println();
			WebElement ele8=driver.findElement(By.xpath("//div/ul/li//a[text()='Books ']"));
			action.moveToElement(ele8).build().perform();
			System.out.println(ele8.getText()+":");
	}
	}


