package seleniumproject1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableread {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
    ChromeDriver p1=new ChromeDriver();
    p1.get("https://demoqa.com/webtables");
   WebElement firstname = p1.findElement(By.xpath("//div[@class='rt-thead -header']"));
 //  firstname.getText();
   System.out.println(firstname.getText());
//   WebElement age =p1.findElement(By.xpath("//div[contains(text(),\"Age\")]"));
//   System.out.println(age.getText());
//   
 //*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div
 //*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]
 //*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[3]
   
   String beforeXpath =" //*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[";
   String afterXpath ="1]";
   for (int i=2; i<=4; i++) {
	   String actualXpath =beforeXpath+i+afterXpath;
	   WebElement Element = p1.findElement(By.xpath(actualXpath));
	  System.out.println(Element.getText());
	  
	   
	   
	   
	   
   }
   
   
 	}
}
