
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
	//	 WebDriverManager.Chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://testautomationpractice.blogspot.com/");              
          Thread.sleep(2000);
          System.out.println("title of the page is:" + driver.getTitle());
        WebElement ele = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
        ele.sendKeys("hello world");
        WebElement ele1 = driver.findElement(By.className("wikipedia-search-button"));
//        WebElement ele3 = driver.findElement(By.linkText("Hello"));
        ele1.click();
        Thread.sleep(2000);
        WebElement ele_parent = driver.findElement(By.id("Wikipedia1_wikipedia-search-results"));
        List<WebElement> coll = ele_parent.findElements(By.partialLinkText("Hello"));
        System.out.println("total links are:" + coll.size());
        //you have to clone the main driver window and store it inside another driver object.
   //  ChromeDriver driver1= driver.clone();
        for(WebElement ele2 : coll)
        {
//        	System.out.println("actual text of the link is:" + ele2.getText());    
        	//clickk the link.
        	ele2.click();
        	String str1 = ele2.getText();
        	Thread.sleep(2000);
        	//window will open
        	Set<String> coll2 = driver.getWindowHandles();
        	//go to the window.
        	//compare the text and window title text.
        	for(String str : coll2)
            {
            	driver.switchTo().window(str);
            	System.out.println("title of the window is:" + driver.getTitle());
            }
            String str2 = driver.getTitle();
            if(str2.contains(str1))
            	System.out.println("matching.");
            else
            	System.out.println("not matching.");
            
            driver.close();
        }
        coll.get(0).click();
        String str1 = coll.get(0).getText();
        Thread.sleep(2000);
        Set<String> coll2 = driver.getWindowHandles();
        System.out.println("total windows available are:" + coll2.size());
        for(String str : coll2)
        {
        	driver.switchTo().window(str);
        	System.out.println("title of the window is:" + driver.getTitle());
        }
        String str2 = driver.getTitle();
        if(str2.contains(str1))
        	System.out.println("matching.");
        else
        	System.out.println("not matching.");
          driver.quit(); //driver.close();
}


	}

