package Automation.IAQ.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Automation.IAQ.testBase.TestBase;

public class Portfolio extends TestBase {
	
	public static final Logger log = Logger.getLogger(Portfolio.class.getName());
	
	WebDriver driver;
	
	@FindBy(xpath="//span[@class='money']")//Text Field
	WebElement totalprem;
	
	@FindBy(xpath="//span[@class='money-green']")//Text Field
	WebElement packagesavings;
	
	@FindBy(xpath="//span[@class='fw400' and contains(text(),'POINT OF SALE')]")//Submission Button
	WebElement submit;	
	
	@FindBy(xpath="//span[contains(text(),'Options')]")//Button
	WebElement options;
		
	@FindBy(xpath="//span[contains(text(),'Save & Exit')]")//Button
	WebElement save;

	//Constructor
	public Portfolio(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Returns the value in the "Total Premium" text field
	public String ReturnTotalPremium(String log) {
		if(log.toUpperCase().equals("Y") || log.toUpperCase().equals("YES")) {
			Log("Total Premium is: " + totalprem.getText());
		}
		return totalprem.getText();		
	}
	
	//Returns the value in the "Package Savings" text field
	public String ReturnPackageSavings() {
			Log("Package Savings is: " + packagesavings.getText());
		return packagesavings.getText();		
	}	
	
	//Clicks the "Point of Sale ->" submission button
	public void ClickPointofSale() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", submit);
			Log("Clicked the \"Point of Sale ->\" button on the Portfolio page");
	}
	
	//Saves Quote
	public void SaveQuote() {
		Actions action = new Actions(driver);
		action.moveToElement(options).moveToElement(save).click().build().perform();
			Log("Saved Quote");
	}	
}
