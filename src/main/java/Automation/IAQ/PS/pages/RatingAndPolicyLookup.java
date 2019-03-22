package Automation.IAQ.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Automation.IAQ.testBase.TestBase;

public class RatingAndPolicyLookup extends TestBase {
	
public static final Logger log = Logger.getLogger(RatingAndPolicyLookup.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="ddlNewStateList")//Drop Down
	WebElement selectstate;
	
	@FindBy(id="btnCreateNewQuote")//Button
	WebElement createnewquote;
	
	@FindBy(id="txtPolicyID")//Text Box
	WebElement quoteid;
	
	@FindBy(id="btnLookup")//Button
	WebElement submit;
	
	//Constructor
	public RatingAndPolicyLookup(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;		
	}
	
	//Selects "State" from drop down
	public void SelectState(String SelectState) {
		new Select(selectstate).selectByValue(SelectState);
			Log("Entered State: " + new Select(selectstate).getFirstSelectedOption().getText());
	}
	
	//Types into "Quote / Policy #:" text box
	public void TypeQuotePolicyID(String TypeQuotePolicyID) {
		quoteid.clear();
		quoteid.sendKeys(TypeQuotePolicyID);
			Log("Entered Quote / Policy #: " + TypeQuotePolicyID);
	}
	
	//Clicks the "Create New Quote" button
	public void ClickCreateNewQuote() {
		createnewquote.click();
			Log("Clicked the \"Create New Quote\" button on the Rating & Policy Lookup page");
	}
	
	//Clicks the "Lookup Quote/Policy" button
	public void ClickLookup() {
		submit.click();
			Log("Clicked the \"Lookup Quote/Policy\" button on the Rating and Policy Lookup page");
	}
}