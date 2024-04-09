package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserFeb16\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);	
		
		driver.switchTo().alert().accept();// accept() method to click on OK button on alert
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);	
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("welcome");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
		
		

	}

}
