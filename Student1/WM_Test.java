package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WM_Test {

	WebDriver driver;
	@Test
	public void testWM() throws InterruptedException
	{
	
//	driver = WebDriverManager.chromedriver().create();
		driver=WebDriverManager.iedriver().create();
		driver= new InternetExplorerDriver();
	//driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com");
		driver.close();
			
	}
}
