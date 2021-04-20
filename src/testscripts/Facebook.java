package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("acharekartanu08");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345"); -- Customized xpath
		driver.findElement(By.xpath("//button[@type='submit']")).click();*/
		
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("acharekartanu08");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("12345");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[contains(@id,'u_0')]")).click(); -- Xpath Regular expression
		driver.findElement(By.cssSelector("button[id*='u_0']")).click(); //CSS Regular Expression
		//driver.findElement(By.cssSelector("button[type='submit']")).click();//Customized CSS
	}

}
