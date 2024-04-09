package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserFeb16\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
	WebElement  dropdown2= 	driver.findElement(By.xpath("//select[@name='Month']"));
	
	if (dropdown2.isEnabled()  && dropdown2.isDisplayed())
	{
		System.out.println("drop down is enabled and displayed");
	}
	else
	{
		System.out.println("drop down is NOT enabled and displayed");
	}
		
	Select sel = new Select(dropdown2);
	 if (sel.isMultiple())
	 {
		 
		 System.out.println("Drop down allows multiple selections");
	 }
	 else
	 {
		 System.out.println("Drop down does not allow multiple selections");
	 }
	 
	 sel.selectByIndex(3);
	 sel.selectByValue("Aug");
	 sel.selectByVisibleText("December");
	 
	 if (sel.getAllSelectedOptions().size()==3)
	 {
		 System.out.println(" 3 options were chosen");
	 }
	 else
	 {
		 System.out.println("3 options were not chosen");
	 }
	

	}

}
