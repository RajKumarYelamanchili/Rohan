package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserFeb16\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
	//	driver.findElement(By.id("email")).sendKeys("Raj@pqr.com");//by using id
	//	driver.findElement(By.name("email")).sendKeys("Virat@abc.com");//by using name
		
	//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rohit@Sharma.com");//by using xpath
	//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shubman@Gill.com");//by using xpath
	//  driver.findElement(By.linkText("Create a Page")).click();//by using linkText
		
		driver.findElement(By.partialLinkText("ate a Pag")).click();//by using partial LinkText
		
		
		Thread.sleep(2000);
		
		
		
		
	
		
		

	}

}
