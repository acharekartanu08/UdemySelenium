package testscripts;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxSample {
public static void main(String[] args) {
		
		
		//Invoke .exe files E:\\Selenium\\chromedriver_win32\\chromedriver.exe
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		
		//Create driver object for Chrome Browser
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}
}
