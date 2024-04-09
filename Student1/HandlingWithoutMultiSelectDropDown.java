package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWithoutMultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserFeb16\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
	WebElement  dropdown1= 	driver.findElement(By.xpath("//select[@name='country']"));
	
	if (dropdown1.isEnabled()  && dropdown1.isDisplayed())
	{
		System.out.println("drop down is enabled and displayed");
	}
	else
	{
		System.out.println("drop down is NOT enabled and displayed");
	}
		
	Select sel = new Select(dropdown1);
	 if (sel.isMultiple())
	 {
		 System.out.println("Drop down allows multiple selections");
	 }
	 else
	 {
		 System.out.println("Drop down does not allow multiple selections");
	 }
	 
	  int lstSize =  sel.getOptions().size();
	  System.out.println("Number of Countries in the drop down: " + lstSize);
	 
	  sel.selectByVisibleText("Algeria");
	  String txt1= sel.getFirstSelectedOption().getText();
	  System.out.println("Country chosen is : " + txt1);
	  Thread.sleep(2000);
	  
	  sel.selectByIndex(12);
	 String txt2=    sel.getFirstSelectedOption().getText();
	 System.out.println("Country chosen is : " + txt2);
	  Thread.sleep(2000);
	  
	  sel.selectByValue("IN");
	  String txt3= sel.getFirstSelectedOption().getText();
	  System.out.println("Country chosen is : " + txt3);
	  
	  
	}

}
