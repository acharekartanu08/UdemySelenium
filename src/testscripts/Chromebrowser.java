package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		/*driver.findElement(By.id("email")).sendKeys("acharekartanu08@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("tanu890145");
		driver.findElement(By.linkText("Forgotten password?")).click();*/
		
		//driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("acharekartanu08@gmail.com");
		//driver.findElement(By.cssSelector("#pass")).sendKeys("tanu890145");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("acharekartanu08@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@name='login']")).click();//customized xpath
		
		driver.close();
	}

}
