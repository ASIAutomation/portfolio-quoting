package Automation.IAQ.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.IAQ.testBase.TestBase;

public class ForAgentsOnly extends TestBase {
	
	public static final Logger log = Logger.getLogger(ForAgentsOnly.class.getName());
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='wm-close-button walkme-x-button']")//Button
	WebElement closepopup;
	
	@FindBy(id="QuoteStateList")//Drop Down
	WebElement state;
	
	@FindBy(xpath="//h6[contains(text(),'New Quote')]")//Button
	WebElement newquote;
	
	@FindBy(xpath="//h6[contains(text(),'Existing Quote')]")//Button
	WebElement existingquote;
	
	@FindBy(id="LstNm")//Text Box
	WebElement lname;
	
	@FindBy(id="FrstNm")//Text Box
	WebElement fname;
	
	@FindBy(id="StrtDt")//Text Box
	WebElement starteffdate;
	
	@FindBy(id="EndDt")//Text Box
	WebElement endeffdate;
	
	@FindBy(id="EQStart")//Button
	WebElement start;
	
	@FindBy(id="selectProductButton")//Submission Button
	WebElement selectproduct;
	
	@FindBy(xpath="//span[contains(text(),'HO3')]")//Button
	WebElement ho3;
	
	@FindBy(xpath="//span[contains(text(),'HO4')]")//Button
	WebElement ho4;
	
	@FindBy(xpath="//span[contains(text(),'HO6')]")//Button
	WebElement ho6;
	
	@FindBy(xpath="//a[@onclick='return okToLogoff();']")//Drop Down
	WebElement logout;
	
	@FindBy(xpath="//div[@id='ErrorMsg']/following-sibling::input")//Button
	WebElement startquote;
	
	@FindBy(xpath="//a[contains(@class,'survey-banner__close')]")//Button
	WebElement surveyx;
	
	//Constructor
	public ForAgentsOnly(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;		
	}
	
	//Handles all actions on the FAO page
	public void StartFAO(String state, String planid) throws InterruptedException {
		SelectState(state);
		ClickSelectProduct();
		ClickPlanType(planid);
		ClickStartQuote();
	}

	
	//Clicks the X on the pop-up
	public void ClosePopUp() throws InterruptedException {
			Pause(3000);
		closepopup.click();
			Pause(1500);
			Log("Closed the FAO Pop-up");
	}
	
	//Selects "State" from drop down
	public void SelectState(String SelectState) {
		new Select(state).selectByValue(SelectState);
			Log("Entered State: " + SelectState);
	}
	
	//Clicks the "New Quote" button
	public void ClickNewQuote()  {
		newquote.click();
			Log("Clicked the \"New Quote\" button on the FAO Home page");
	}
	
	//Clicks the "Existing Quote" button
	public void ClickExistingQuote()  {
		existingquote.click();
			Log("Clicked the \"Existing Quote\" button on the FAO Home page");
	}
	
	//Types into the "Last Name" Text Box
	public void TypeLastName(String TypeLastName)	{
		lname.clear();
		lname.sendKeys(TypeLastName);
			Log("Entered Last Name: " + TypeLastName);
	}
	
	//Types into the "First Name" Text Box
	public void TypeFirstName(String TypeFirstName)	{
		fname.clear();
		fname.sendKeys(TypeFirstName);
			Log("Entered First Name: " + TypeFirstName);
	}
	
	//Types into the Start Effective Date Text Box
	public void TypeStartEffectiveDate(String TypeStartEffectiveDate) {
		StringBuilder startdate = new StringBuilder(TypeStartEffectiveDate).insert(2, '/').insert(5, '/');
		starteffdate.clear();
		starteffdate.sendKeys(startdate);
			Log("Entered Start Effective Date: " + TypeStartEffectiveDate);
	}
	
	//Types into the End Effective Date Text Box
	public void TypeEndEffectiveDate(String TypeEndEffectiveDate)	{
		StringBuilder enddate = new StringBuilder(TypeEndEffectiveDate).insert(2, '/').insert(5, '/');
		endeffdate.clear();
		endeffdate.sendKeys(enddate);
			Log("Entered End Effective Date: " + TypeEndEffectiveDate);
	}
	
	//Clicks the "START" button
	public void ClickStart()  {
		start.click();
			Log("Clicked the \"START\" button on the FAO Home page");
	}
	
	//Types into the Existing Quote fields to pull up quote
	public void FindExistingQuote(String lname, String fname, String starteffdate, String endeffdate) {
		ClickExistingQuote();
		TypeLastName(lname);
		TypeFirstName(fname);
		TypeStartEffectiveDate(starteffdate);
		TypeEndEffectiveDate(endeffdate);
		//ClickCloseSurvey();
		ClickStart();
	}
	
	//Clicks the "Select Product(s)" submission button
	public void ClickSelectProduct()  {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", selectproduct);
			Log("Clicked the \"Select Product(s)\" button on the FAO Home page");
	}
	
	//Clicks appropriate PlanID button
	public void ClickPlanType(String ClickPlanType)  {
		switch(ClickPlanType) {
			case "HO3": case "HO":	ho3.click();
									break;
						
			case "HO4":	case "RT":	ho4.click();
									break;
						
			case "HO6": case "CO":	ho6.click();
									break;			
		}
			Log(ClickPlanType + " selected as PlanID");
	}
	
	//Clicks the "Start Quote" button
	public void ClickStartQuote()  {
		startquote.click();			
			Log("Clicked the \"Start Quote\" button on the FAO page");
	}
	
	//Clicks the "X" and closes Survey
	public void ClickCloseSurvey()  {
		if(surveyx.isDisplayed()) {
			surveyx.click();
			Log("Clicked the Survey \"X\" button on the FAO Home page");
		}
	}
}
