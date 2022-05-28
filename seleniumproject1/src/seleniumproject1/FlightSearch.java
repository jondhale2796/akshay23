package seleniumproject1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightSearch {

	
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/flights");
	driver.manage().window().maximize();
//	System.out.println(driver.getTitle());
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
Thread.sleep(2000);
//	//driver.findElement(By.className("menu_Flights"));
//	Thread.sleep(2000);
//	
//	//WebElement from= driver.findElement(By.xpath("//input[@placeholder='From']"));
//	//from.click();
//	driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget activeWidget']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin ']/div/input")).sendKeys("Pune");
//	Thread.sleep(2000);
//	List<WebElement>dynamiclist=driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));
//	for(int i=0;i<dynamiclist.size();i++)
//	{
//		String text=dynamiclist.get(i).getText();
//		System.out.println("text is ;"+text);
//		if(text.contains("Pune"))
//		{
//			dynamiclist.get(i).click();
//			break;
//	driver.findElement(By.className("fsw widgetOpen")).click();
	driver.findElement(By.className("fsw_inputBox searchCity inactiveWidget activeWidget")).click();
	driver.findElement(By.id("fromCity")).click(); 
	driver.findElement(By.cssSelector("input[placeholder=From']")).sendKeys("Pune");
	driver.findElement(By.xpath("//div[text()='PNQ']")).click();
	
	}
	//from.sendKeys("Pune",Keys.TAB);
	//from.sendKeys("pune",Keys.ENTER);
	//from.click();
	//*[@id="root"]/div/div[3]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input
	//driver.findElement(By.className("fsw"));
	
	//div[@class='fsw_inputBox searchCity inactiveWidget activeWidget']/label
	
	//div[@class='hsw_autocomplePopup autoSuggestPlugin ']/div/input
	
	
	}


