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

public class HouseholdMembers extends TestBase {
	
	public static final Logger log = Logger.getLogger(HouseholdMembers.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="People_Drivers_List_0_Embedded_Questions_List_FirstName")//Text Box
	WebElement fname;
	
	@FindBy(id="People_Drivers_List_0_Embedded_Questions_List_MiddleInitial")//Text Box
	WebElement minitial;
	
	@FindBy(id="People_Drivers_List_0_Embedded_Questions_List_LastName")//Text Box
	WebElement lname;
	
	@FindBy(id="People_Drivers_List_0_Embedded_Questions_List_Suffix")//Drop Down
	WebElement suffix;
	
	@FindBy(id="People_Drivers_List_0_Embedded_Questions_List_MaritalStatus")//Drop Down
	WebElement marital;
	
	@FindBy(id="People_Drivers_List_0_Embedded_Questions_List_Relationship_Label")//Drop Down
	WebElement relationship;
	
	@FindBy(id="People_Drivers_List_0_Embedded_Questions_List_DateOfBirth")//Text Box
	WebElement dob;
	
	@FindBy(id="People_Drivers_List_0_Embedded_Questions_List_SocialSecurityNumber")//Text Box
	WebElement ssn;
	
	@FindBy(id="People_Drivers_List_0_Embedded_Questions_List_Gender")//Drop Down
	WebElement gender;
	
	@FindBy(xpath="//span[@class='fw900' and contains(text(),'PRODUCTS')]")//Submission Button
	WebElement back;
	
	@FindBy(xpath="//span[@class='fw400' and contains(text(),'ADDITIONAL DETAILS')]")//Submission Button
	WebElement submit;
	
	@FindBy(xpath="//span[contains(text(),'Options')]")//Button
	WebElement options;
		
	@FindBy(xpath="//span[contains(text(),'Save & Exit')]")//Button
	WebElement save;
	
	//Constructor
	public HouseholdMembers(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;		
	}

	//Types into "First Name" text box
	public void TypeFirstname(String TypeFirstname) {
		fname.clear();
		fname.sendKeys(TypeFirstname);
			Log("Entered First Name: " + TypeFirstname);
	}
	
	//Types into "Middle Initial" text box
	public void TypeMiddleInitial(String TypeMiddleInitial) {
		minitial.clear();
		minitial.sendKeys(TypeMiddleInitial);
			Log("Entered Middle Initial: " + TypeMiddleInitial);
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
	
	//Selects "Marital Status" from drop down
	public void SelectMarital(String SelectMarital) {
		switch(SelectMarital.toUpperCase()) {
			case "S": case "SINGLE":		new Select(marital).selectByVisibleText("Single");
												Log("Entered Marital Status: Single");
											break;
							
			case "M": case "MARRIED":		new Select(marital).selectByVisibleText("Married");
												Log("Entered Marital Status: Married");
											break;
										
			case "W": case "WIDOWED":		new Select(marital).selectByVisibleText("Widowed");
												Log("Entered Marital Status: Widowed");
											break;
										
			case "SEP": case "SEPARATED":	new Select(marital).selectByVisibleText("Separated");
												Log("Entered Marital Status: Separated");
											break;
											
			case "D": case "DIVORCED":		new Select(marital).selectByVisibleText("Divorced");
												Log("Entered Marital Status: Divorced");
											break;
		}
	}
	
	//Selects "Relationship" from drop down
	public void SelectRelationship(String SelectRelationship) {
		new Select(relationship).selectByVisibleText(SelectRelationship);
			Log("Entered Relationship: " + SelectRelationship);
	}
	
	//Types into "Date of Birth" text box
	public void TypeDOB(String TypeDOB) {
		dob.clear();
		dob.sendKeys(TypeDOB);
			Log("Entered Date of Birth: " + TypeDOB);
	}
	
	//Types into "Social Security Number" text box
	public void TypeSSN(String TypeSSN) {
		ssn.clear();
		ssn.sendKeys(TypeSSN);
			Log("Entered Social Security Number: " + TypeSSN);
	}
	
	//Selects "Gender" from drop down
	public void SelectGender(String SelectGender) {
		new Select(gender).selectByVisibleText(SelectGender);
			Log("Entered Gender: " + SelectGender);
	}
	
	//Clicks the "<- Products" submission button
	public void ClickProducts() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", back);
			Log("Clicked the \"<- Products\" button on the Household Members page");
	}
	
	//Clicks the "Additional Details ->" submission button
	public void ClickAdditionalDetails() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", submit);
			Log("Clicked the \"Additional Details ->\" button on the Household Members page");
	}
	
	//Saves Quote
	public void SaveQuote() {
		Actions action = new Actions(driver);
		action.moveToElement(options).moveToElement(save).click().build().perform();
			Log("Saved Quote");
	}
}