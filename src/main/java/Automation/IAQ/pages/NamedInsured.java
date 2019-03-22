package Automation.IAQ.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.IAQ.testBase.TestBase;

public class NamedInsured extends TestBase {
	
	public static final Logger log = Logger.getLogger(NamedInsured.class.getName());
	
	WebDriver driver;	
	
	@FindBy(id="NamedInsured_Embedded_Questions_List_AsiAgentCode")//Drop down
	WebElement asiagentcode;
	
	@FindBy(id="NamedInsured_Embedded_Questions_List_FirstName")//Text Box
	WebElement fname;
	
	@FindBy(id="NamedInsured_Embedded_Questions_List_MiddleInitial")//Text Box
	WebElement mintial;
	
	@FindBy(id="NamedInsured_Embedded_Questions_List_LastName")//Text Box
	WebElement lname;
	
	@FindBy(id="NamedInsured_Embedded_Questions_List_Suffix")//Drop down
	WebElement suffix;
	
	@FindBy(id="NamedInsured_Embedded_Questions_List_DateOfBirth")//Text Box - Date(MMDDYYYY)
	WebElement dob;
	
	@FindBy(id="NamedInsured_Embedded_Questions_List_Gender")//Drop down
	WebElement gender;
	
	@FindBy(id="NamedInsured_Embedded_Questions_List_PrimaryEmailAddress")//Text Box
	WebElement customeremail;
	
	@FindBy(id="NamedInsured_PhoneNumbers_List_0_Embedded_Questions_List_PhoneType")//Drop down
	WebElement phonetype;
	
	@FindBy(id="NamedInsured_PhoneNumbers_List_0_Embedded_Questions_List_PhoneNumber")//Text Box - PHNum(XXXXXXXXX)
	WebElement phonenum;
	
	@FindBy(id="NamedInsured_Embedded_Questions_List_HasInternationalAddress")//Check Box
	WebElement intaddy;
	
	@FindBy(id="NamedInsured_Embedded_Questions_List_MailingAddress")//Text Box
	WebElement mailaddy1;
	
	@FindBy(id="NamedInsured_Embedded_Questions_List_ApartmentUnit")//Text Box
	WebElement mailaddy2;
	
	@FindBy(id="NamedInsured_Embedded_Questions_List_City")//Text Box
	WebElement city;
	
	@FindBy(id="NamedInsured_Embedded_Questions_List_State")//Drop down
	WebElement state;

	@FindBy(id="NamedInsured_Embedded_Questions_List_ZipCode")//Text Box
	WebElement zip;

	@FindBy(id="NamedInsured_Embedded_Questions_List_MailingZipType")//Check Box
	WebElement poboxmil;
	
	@FindBy(id="NamedInsured_Embedded_Questions_List_CurrentResidence")//Drop down
	WebElement curraddress;
	
	@FindBy(id="NamedInsured_Embedded_Questions_List_DisclosureProvided")//Drop down
	WebElement disclosure;
	
	@FindBy(xpath="//span[@class='fw400' and contains(text(),'PRODUCTS')]")//Submission Button
	WebElement submit;
	
	@FindBy(xpath="//span[contains(text(),'Options')]")//Button
	WebElement options;
	
	@FindBy(xpath="//span[contains(text(),'Save & Exit')]")//Button
	WebElement save;
	
	@FindBy(xpath="//*[@id='walkme-balloon-825566']/div/div[1]/div[2]/div/div[1]")//Button
	WebElement closepopup;

	//Constructor
	public NamedInsured(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}	
	
	//Clicks the X on the pop-up
	public void ClosePopUp() throws InterruptedException {
			Pause(500);
		closepopup.click();
			Log("Closed the Welcome Pop-up");
	}
	
	//Selects "ASI Agent Code" from drop down
	public void SelectASIAgentCode(String SelectASIAgentCode) {
		if(driver.getPageSource().contains("ASI Agent Code:")) {
			if(asiagentcode.isEnabled()) {
				new Select(asiagentcode).selectByVisibleText(SelectASIAgentCode);
					Log("Entered ASI Agent Code: " + SelectASIAgentCode);
			}
			else {
				Log("ASI Agent Code Prefilled with : " + new Select(asiagentcode).getFirstSelectedOption().getText());
			}
		}
	}
	
	//Types into "First Name text box
	public void TypeFirstName(String TypeFirstName) {
		fname.clear();
		fname.sendKeys(TypeFirstName);
			Log("Entered First Name: " + TypeFirstName);
	}
	
	//Types into "Middle Initial" text box
	public void TypeMiddleInitial(String TypeMiddleInitial) {
		if(TypeMiddleInitial.equals("N/A")) {
				Log("Entered Middle Initial: None");
		}
		else {
			mintial.clear();
			mintial.sendKeys(TypeMiddleInitial);
				Log("Entered Middle Initial: " + TypeMiddleInitial);
		}
	}
	
	//Types into "Last Name" text box
	public void TypeLastName(String TypeLastName) {
		lname.clear();
		lname.sendKeys(TypeLastName);
			Log("Entered Last Name: " + TypeLastName);
	}
	
	//Selects "Suffix" from drop down
	public void SelectSuffix(String SelectSuffix) {
		new Select(suffix).selectByVisibleText(SelectSuffix);
			Log("Entered Suffix: " + SelectSuffix);
	}
	
	//Types into "Date of Birth" text box (MMDDYYYY)
	public void TypeDOB(String TypeDOB) {
		dob.clear();
		dob.sendKeys(TypeDOB);
			Log("Entered Date of Birth: " + TypeDOB);
	}
	
	//Selects "Gender" from drop down
	public void SelectGender(String SelectGender) {
		new Select(gender).selectByVisibleText(SelectGender);
			Log("Entered Gender: " + SelectGender);
	}
	
	//Types into "Customer E-Mail" text box
	public void TypeCustomerEmail(String TypeCustomerEmail) {
		customeremail.clear();
		customeremail.sendKeys(TypeCustomerEmail);
			Log("Entered Customer E-Mail: " + TypeCustomerEmail);
	}
	
	//Selects "Phone Type" from drop down
	public void SelectPhoneType(String SelectPhoneType) {
		new Select(phonetype).selectByVisibleText(SelectPhoneType);
			Log("Entered Phone Type: " + SelectPhoneType);
	}
	
	//Types into "Phone Number" text box (XXXXXXXXXX)
	public void TypePhoneNumber(String TypePhoneNumber) {
		phonenum.clear();
		phonenum.sendKeys(TypePhoneNumber);
			Log("Entered Phone Number: " + TypePhoneNumber);
	}
	
	//Checks the "Is this an international address?" check box
	public void CheckInternationalAddress(String CheckInternationalAddress) {
		switch(CheckInternationalAddress.toUpperCase()) {		 	
			case "Y": case "YES":	intaddy.click();
										Log("\"Is this an international address?\" check box marked");
					  				break;
			  		  	
			case "N": case "NO":		Log("\"Is this an international address?\" check box NOT marked");
									break;						
			  		  	
			default:					Log("Invalid value for CheckInternationalAddress()");
									break;
		}
	}	
	
	//Types into "Mailing Address Line 1" text box
	public void TypeMailingAddress1(String TypeMailingAddress1) {
		mailaddy1.clear();
		mailaddy1.sendKeys(TypeMailingAddress1);
			Log("Entered Mailing Address Line 1: " + TypeMailingAddress1);
	}
	
	//Types into "Mailing Address Line 2" text box
	public void TypeMailingAddress2(String TypeMailingAddress2) {
		if(TypeMailingAddress2.equals("N/A")) {
				Log("No value for Mailing Address Line 2");
		}
		else {
			mailaddy2.clear();
			mailaddy2.sendKeys(TypeMailingAddress2);
				Log("Entered Mailing Address Line 2: " + TypeMailingAddress2);
		}
	}
	
	//Types into "City" text box
	public void TypeCity(String TypeCity) {
		city.clear();
		city.sendKeys(TypeCity);
			Log("Entered City: " + TypeCity);
	}
	
	//Selects "State" from drop down
	public void SelectState(String SelectState) {
		new Select(state).selectByVisibleText(SelectState);
			Log("Entered State: " + SelectState);
	}
	
	//Types into "ZIP Code" text box
	public void TypeZip(String TypeZip) {
		zip.clear();
		zip.sendKeys(TypeZip);
			Log("Entered ZIP Code: " + TypeZip);
	}	
	
	//Checks the "P.O. Box or a Military Address" check box
	public void CheckPOBoxorMil(String CheckPOBoxorMil) {
		switch(CheckPOBoxorMil.toUpperCase()) {		 	
			case "Y": case "YES":	poboxmil.click();
										Log("\"P.O. Box or a Military Address\" check box marked");
					  				break;
			  		  	
			case "N": case "NO":		Log("\"P.O. Box or a Military Address\" check box NOT marked");
									break;						
			  		  	
			default:					Log("Invalid value for CheckPOBoxorMil()");
									break;
		}
	}
	
	//Selects "How long has the insured lived at their current address?" from drop down
	public void SelectLengthofCurrAddress(String SelectLengthofCurrAddress) {
		new Select(curraddress).selectByVisibleText(SelectLengthofCurrAddress);
			Log("Entered \"How long has the insured lived at their current address?\": " + SelectLengthofCurrAddress);
	}
	
	//Selects "Was the above disclosure read or provided to the consumer?" from drop down
	public void SelectDisclosure(String SelectDisclosure) {
		new Select(disclosure).selectByVisibleText(SelectDisclosure);
			Log("Entered \"Was the above disclosure read or provided to the consumer?\": " + SelectDisclosure);
	}
	
	//Clicks the "Products ->" submission button
	public void ClickProducts() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", submit);
			Log("Clicked the \"Products ->\" button on the Named Insured page");
	}
	
	//Saves Quote
	public void SaveQuote() {
		Actions action = new Actions(driver);
		action.moveToElement(options).moveToElement(save).click().build().perform();
			Log("Saved Quote");
	}
}