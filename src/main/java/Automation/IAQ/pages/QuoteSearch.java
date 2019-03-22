package Automation.IAQ.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Automation.IAQ.testBase.TestBase;

public class QuoteSearch extends TestBase {
	
	public static final Logger log = Logger.getLogger(QuoteSearch.class.getName());
	
	WebDriver driver;
	
	//Constructor
	public QuoteSearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;		
	}
	
	//Clicks the appropriate quote link
	public void ClickQuote(String lname, String fname)  {
		driver.findElement(By.xpath("(//a[text()='" + lname + ", " + fname + "'])[last()]")).click();
			Log("Clicked the appropriate quote: " + driver.findElement(By.xpath("(//a[text()='" + lname + ", " + fname + "'])[last()]")).getText() + " on the Quote Screen");
	}
}