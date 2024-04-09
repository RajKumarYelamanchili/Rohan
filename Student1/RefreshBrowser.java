package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserMarch\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		driver.get("https://www.google.com");
		Thread.sleep(2000);	
		driver.navigate().refresh();
		Thread.sleep(2000);	
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);	
		driver.navigate().to(driver.getCurrentUrl());
		Thread.sleep(2000);	
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);	
		JavascriptExecutor   js    =   (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
		Thread.sleep(2000);	
		js.executeScript("location.reload()");*/
		
		

	}

}
