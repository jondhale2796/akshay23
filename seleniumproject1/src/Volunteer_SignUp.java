import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Volunteer_SignUp {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","Resources\\\\chromedriver.exe" );
     WebDriver driver=new ChromeDriver();
     driver.get("https://testautomationpractice.blogspot.com/");
     driver.manage().window().maximize();
     Thread.sleep(2000);
     driver.switchTo().frame(0);
     driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("akshay");
     driver.findElement(By.id("RESULT_TextField-2")).sendKeys("jondhale");
        driver.findElement(By.id("RESULT_TextField-3")).sendKeys("8888509867");
        driver.findElement(By.id("RESULT_TextField-4")).sendKeys("india");
        driver.findElement(By.id("RESULT_TextField-5")).sendKeys("pune");
        driver.findElement(By.id("RESULT_TextField-6")).sendKeys("akshayjondhale2796@gmail.com");
        WebElement button=  driver.findElement(By.xpath("//*[@id=\"q26\"]//tr[1]/td/label"));
        button.click();
    
        WebElement checkbox1=driver.findElement(By.xpath("//label[text()='Sunday']"));
        checkbox1.click();
      WebElement ele=  driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']"));
        Select s=new Select(ele);
        s.selectByIndex(2);
      WebElement file=  driver.findElement(By.xpath("//div//input[@id='RESULT_FileUpload-10']"));
        file.sendKeys("C://Users//Akshay(AJ)//OneDrive//Desktop");
        Thread.sleep(2000);
       WebElement error= driver.findElement(By.xpath("//div[@id='content']"));
      System.out.println(error.getText());
        
      Thread.sleep(2000);
   driver.close();
	}

}
