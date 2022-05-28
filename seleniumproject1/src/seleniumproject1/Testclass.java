package seleniumproject1;

import org.openqa.selenium.chrome.ChromeDriver;


public class Testclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
			driver.navigate().to("http://www.myntry.com/login");
		System.out.println(driver.getTitle());

	}

}
