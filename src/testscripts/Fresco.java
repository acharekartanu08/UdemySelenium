package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fresco {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Fresco Play");
		driver.findElement(By.name("q")).submit();
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div[1]/div/div[1]/a/h3")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}
}
