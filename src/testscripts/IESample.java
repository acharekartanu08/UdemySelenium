package testscripts;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IESample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoke .exe files E:\\Selenium\\chromedriver_win32\\chromedriver.exe
		
				System.setProperty("webdriver.ie.driver", "E:\\Selenium\\IEDriverServer.exe");
				
				//Create driver object for Chrome Browser
				WebDriver driver = new InternetExplorerDriver();

				driver.get("https://www.google.com");
				System.out.println(driver.getTitle());
	}

}
