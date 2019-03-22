package Automation.IAQ.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.IAQ.testBase.TestBase;

public class StartQuote extends TestBase {
	
	WebDriver driver;
	String splashurl = "https://t-external.quoting.foragentsonly.com/Slot151/AQ";
	
	@FindBy(xpath="//input[@id='FormModel_QuoteType' and @value='new']")//Radio Button
	WebElement newqtype;
	
	@FindBy(xpath="//input[@id='FormModel_QuoteType' and @value='retrieve']")//Radio Button
	WebElement retrieve;
	
	@FindBy(id="open-quote-in-new-window")//Check Box
	WebElement openwindow;
	
	@FindBy(id="FormModel_WalkMeDisabled")//Check Box
	WebElement disablewalkme;
	
	@FindBy(id="FormModel_State")//Drop down
	WebElement state;
	
	@FindBy(id="FormModel_AgentCode")//Drop down
	WebElement agentcode;
	
	@FindBy(id="FormModel_QuoteNumberToRetrieve")//Text Box
	WebElement quotenum;
	
	@FindBy(xpath="//button[@type='submit']")//Submission Button
	WebElement submit;

	//Constructor
	public StartQuote(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Handles starting the quote on the Start Quote page
	public void StartSplash(String state, String planid, String pgragentid) {
		GoToSplash();
		ClickNewQuote();
		CheckDisableWalkMe();
		SelectState(state);
		CheckOfferings(planid);
		TypeAgentCode(pgragentid);
		ClickStartQuote();		
	}
	
	//Handles retrieving the quote on the Start Quote page
	public void RetrieveSplash(String state, String quoteid, String pgragentid) {
		GoToSplash();
		ClickRetrieve();
		UncheckOpenNewWindow();
		CheckDisableWalkMe();
		TypeQuoteNumber(quoteid);
		TypeAgentCode(pgragentid);
		ClickStartQuote();		
	}
	
	//Goes to IAQ site
	public void GoToSplash() {
		driver.get(splashurl);
			Log("Navigated to " + splashurl);
	}
	
	//Clicks the "new" Quote Type radio button
	public void ClickNewQuote() {
		newqtype.click();
			Log("Clicked the \"new\" radio button on the Start Quote page");
	}
	
	//Clicks the "retrieve" Quote Type radio button
	public void ClickRetrieve() {
		retrieve.click();
			Log("Clicked the \"retrieve\" radio button on the Start Quote page");
	}
	
	//Unchecks the "open new window" check box
	public void UncheckOpenNewWindow() {
		openwindow.click();
			Log("\"open new window\" check box unmarked");
	}
	
	//Checks the "disable WalkMe" check box
	public void CheckDisableWalkMe() {
		disablewalkme.click();
			Log("\"disable WalkMe\" check box unmarked");
	}
	
	//Selects "State" from drop down
	public void SelectState(String SelectState) {
		new Select(state).selectByVisibleText(SelectState);
			Log("Entered State: " + SelectState);
	}
		
	//Checks "Offerings" check box
	public void CheckOfferings(String CheckOfferings)  {
		switch(CheckOfferings) {
			case "AA":				driver.findElement(By.xpath("//input[contains(@id,'FormModel_Offerings_AA') and contains(@id, '" + new Select(state).getFirstSelectedOption().getText() + "')]")).click();
									break;
						
			case "BT": 				driver.findElement(By.xpath("//input[contains(@id,'FormModel_Offerings_BT') and contains(@id, '" + new Select(state).getFirstSelectedOption().getText() + "')]")).click();
									break;
						
			case "CO": case "HO6":	driver.findElement(By.xpath("//input[contains(@id,'FormModel_Offerings_CO') and contains(@id, '" + new Select(state).getFirstSelectedOption().getText() + "')]")).click();
									break;
						
			case "HO": case "HO3":	driver.findElement(By.xpath("//input[contains(@id,'FormModel_Offerings_HO') and contains(@id, '" + new Select(state).getFirstSelectedOption().getText() + "')]")).click();
									break;
						
			case "MC":				driver.findElement(By.xpath("//input[contains(@id,'FormModel_Offerings_MC') and contains(@id, '" + new Select(state).getFirstSelectedOption().getText() + "')]")).click();
									break;
						
			case "MT": 				driver.findElement(By.xpath("//input[contains(@id,'FormModel_Offerings_MT') and contains(@id, '" + new Select(state).getFirstSelectedOption().getText() + "')]")).click();
									break;
						
			case "RT": case "HO4":	driver.findElement(By.xpath("//input[contains(@id,'FormModel_Offerings_RT') and contains(@id, '" + new Select(state).getFirstSelectedOption().getText() + "')]")).click();
									break;
						
			case "SM": 				driver.findElement(By.xpath("//input[contains(@id,'FormModel_Offerings_SM') and contains(@id, '" + new Select(state).getFirstSelectedOption().getText() + "')]")).click();
									break;
						
			case "TT":				driver.findElement(By.xpath("//input[contains(@id,'FormModel_Offerings_TT') and contains(@id, '" + new Select(state).getFirstSelectedOption().getText() + "')]")).click();
									break;
		}
			Log(CheckOfferings + " check box marked");
	}
	
	//Types "Agent Code" into text box
	public void TypeAgentCode(String TypeAgentCode) {
		agentcode.clear();
		agentcode.sendKeys(TypeAgentCode);
			Log("Entered Agent Code: " + TypeAgentCode);
	}
	
	//Types "Quote Number" into text box
	public void TypeQuoteNumber(String TypeQuoteNumber) {
		quotenum.clear();
		quotenum.sendKeys(TypeQuoteNumber);
			Log("Entered Quote Number: " + TypeQuoteNumber);
	}
	
	//Clicks the "Start Quote" submission button
	public void ClickStartQuote() {
		submit.submit();
			Log("Clicked the \"Start Quote\" button on the Start Quote page");
	}
}
