package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		
		//Invoke .exe files E:\\Selenium\\chromedriver_win32\\chromedriver.exe
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//Create driver object for Chrome Browser
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");//hits the url
		System.out.println(driver.getTitle());//validates page title
		System.out.println(driver.getCurrentUrl());//validates url
		//System.out.println(driver.getPageSource());//gets the page source
		
		driver.get("https://www.facebook.com");
		
		
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.close();
	}

}
