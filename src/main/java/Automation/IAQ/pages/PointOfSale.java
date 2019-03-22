package Automation.IAQ.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Automation.IAQ.testBase.TestBase;

public class PointOfSale extends TestBase  {
	
	public static final Logger log = Logger.getLogger(PointOfSale.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="PointOfSale_Embedded_Questions_List_PropertyClueSelectIndicator")//Check Box
	WebElement clue;
	
	@FindBy(xpath="//span[contains(text(),'Order Point of Sale')]")//Submission Button
	WebElement orderclue;
	
	@FindBy(className="fw400")//Submission Button
	WebElement submit;
	
	@FindBy(xpath="//a[@class='navigation-link' and contains(text(),'ADDITIONAL DETAILS')]")//Submission Button
	WebElement additionaldetails;
	
	@FindBy(xpath="//span[contains(text(),'Options')]")//Button
	WebElement options;
		
	@FindBy(xpath="//span[contains(text(),'Save & Exit')]")//Button
	WebElement save;
	
	@FindBy(xpath="//span[@class='quote-number-text']")//Button
	WebElement quoteid;

	//Constructor
	public PointOfSale(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}	
	
	//Checks the "CLUE for Property" check box
	public void CheckCLUE() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", clue);
			Log("\"CLUE for Property\" check box marked");
	}	
	
	//Clicks the "Order Point of Sale" submission button
	public void ClickOrderPointofSale() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", orderclue);
			Log("Clicked the \"Order Point of Sale\" button on the Point of Sale page");
	}	
	
	//Clicks the "Final Sale ->" submission button
	public void ClickFinalSale() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", submit);
			Log("Clicked the \"Final Sale ->\" button on the Point of Sale page");
	}	
	
	//Clicks the "ADDTIONAL DETAILS" submission button
	public void ClickAdditionalDetails() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", additionaldetails);
			Log("Clicked the \"ADDTIONAL DETAILS\" button on the Point of Sale page");
	}
	
	//Saves Quote
	public void SaveQuote() {
		Actions action = new Actions(driver);
		action.moveToElement(options).moveToElement(save).click().build().perform();
			Log("Saved Quote");
	}
	
	//Returns QuoteID
	public String ReturnQuoteID(String log) {
		try {
			if(quoteid.getText().contains("Home")) {
				if(log.toUpperCase().equals("Y") || log.toUpperCase().equals("YES")) {
						Log(quoteid.getText().substring(19));
				}
				return quoteid.getText().substring(19);
			}
			else if(quoteid.getText().contains("Condo")) {
				if(log.toUpperCase().equals("Y") || log.toUpperCase().equals("YES")) {
						Log(quoteid.getText().substring(19));
				}
				return quoteid.getText().substring(20);			
			}
			else if(quoteid.getText().contains("Renters")) {
				if(log.toUpperCase().equals("Y") || log.toUpperCase().equals("YES")) {
						Log(quoteid.getText().substring(19));
				}
				return quoteid.getText().substring(22);
			}
		}
		catch (Exception e) {
			Log("No QuoteID is present on the page");
		}
		return null;
	}
}