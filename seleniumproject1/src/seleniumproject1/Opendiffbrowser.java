package seleniumproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opendiffbrowser {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
    ChromeDriver obj=new ChromeDriver(); 
    obj.navigate().to("https://demoqa.com/text-box");
    System.out.println(obj.getTitle());
    
   
	 WebElement FullName =obj.findElement(By.id("userName"));
	 FullName.sendKeys("akshay bhausaheb jondhale");
	 WebElement Email=obj.findElement(By.xpath("//input[@placeholder='name@example.com']"));
	 Email.sendKeys("akshay2020@gmail.com");
	 WebElement currentAddress =obj.findElement(By.id("currentAddress"));
	 currentAddress.sendKeys("at-kauthe kamleshwer tal-sangmner dist-a.nagar");
	// WebElement submit =obj.findElement(By.id("submit"));
	// submit.click();
	 System.out.println(obj.getTitle());
	 System.out.println(FullName.getAttribute("id"));
	 System.out.println(FullName.getLocation());
	 
	 
	 
	 
	}

}
