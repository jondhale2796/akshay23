

//import org.openqa.selenium.By;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class demo2 {

	public static void main(String[] args) throws InterruptedException {
	//	WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
//		WebElement ele1=driver.findElement(By.tagName("tr"));
//		System.out.println("table size is      "+ele1.getText());
//	WebElement ele2=driver.findElement(By.tagName("th"));
		WebElement ele5=driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]//th[1]"));
		WebElement ele6=driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]//th[2]"));
		WebElement ele7=driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]//th[3]"));
		WebElement ele8=driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]//th[4]"));

		System.out.println(" "+ele5.getText()+"                "+ele6.getText()+"                "+ele7.getText()+"                "+ele8.getText());
		System.out.println("-------------"+"           "+"-------------"+"           "+"-------------"+"           "+"-------------");
//		WebElement el1=driver.findElement(By.xpath("//tr/th"));
//		System.out.println(el1.getText());
		
		 List<WebElement> tablerow=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		 String Columnfirst= "//table[@name='BookTable']//tr[";
		String Columnlast= "]//td";
		String column;
		
		List<WebElement>tablecolum;
		for(int i=2;i<tablerow.size();i++) {
			column=Columnfirst+i+Columnlast;
			tablecolum=driver.findElements(By.xpath(column));
		//	System.out.println("for row: "+i+" column are: "+tablecolum.size());
			//System.out.print(column);
			for(int j=0;j<tablecolum.size();j++) {
				if(i==5) {
					System.out.print(tablecolum.get(j).getText()+"    "+"         ");
				}
				else {
				System.out.print(tablecolum.get(j).getText()+"                    ");
				}
			}
			System.out.println();
		}
//	 List<WebElement> ele3=driver.findElements(By.xpath("//table[@name='BookTable']//td[1]"));
//	   // System.out.println(""+ele3.getText());
////	    for(int i=0;i<=5;i++) {
////	    	 System.out.println(""+ele3.getText());
//       List <WebElement>ele6= driver.findElements(By.xpath("//table[@name='BookTable']//td[2]"));
//       int count=ele6.size();
////	    }
//		for(WebElement ele4: ele3) {
//			System.out.println(""+ele4.getText());
//		}
//	     	//   for(int i=0;i<count; i++) {
//	     	//	System.out.print("          "+ele6.getText());
//		      // System.out.println();
//		       //break;
//		
//	         System.out.println();
//		
//	Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
		
}
}
