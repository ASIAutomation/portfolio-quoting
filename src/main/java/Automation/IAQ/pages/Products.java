package Automation.IAQ.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Automation.IAQ.testBase.TestBase;

public class Products extends TestBase {
	
	public static final Logger log = Logger.getLogger(Products.class.getName());
	
	WebDriver driver;
	
	@FindBy(xpath="//input[contains(@id,'PolicyEffectiveDate')]")//Text/Date Box - Date(MMDDYYYY)
	WebElement poleffdate;
	
	@FindBy(xpath="//input[@type='radio' and @value='Y']")//Radio Button
	WebElement riskclosingy;
	
	@FindBy(xpath="//input[@type='radio' and @value='N']")//Radio Button
	WebElement riskclosingn;
	
	@FindBy(xpath="//input[contains(@id,'PropertyMailingAddress')]")//Text Box
	WebElement locaddy1;
	
	@FindBy(xpath="//input[contains(@id,'PropertyApartmentUnit')]")//Text Box
	WebElement locaddy2;
	
	@FindBy(xpath="//input[contains(@id,'PropertyCity')]")//Text Box
	WebElement city;
	
	@FindBy(xpath="//input[contains(@id,'PropertyZipCode')]")//Text Box
	WebElement zip;

	@FindBy(xpath="//select[contains(@id,'ResidenceType')]")//Drop down
	WebElement residenttype;
	
	@FindBy(xpath="//input[@name='NewConstructionFlag']")//Check Box
	WebElement newconstruction;
	
	@FindBy(xpath="//input[contains(@id,'ExcludeWindFlag_Y')]")//Check Box
	WebElement xwindy;
	
	@FindBy(xpath="//input[contains(@id,'ExcludeWindFlag_N')]")//Check Box
	WebElement xwindn;
	
	@FindBy(xpath="//input[@name='PriorLiabilityFlag']")//Check Box
	WebElement priorliabilityflag;
	
	@FindBy(xpath="//input[@name='UndergroundTankFlag']")//Check Box
	WebElement undergroundtankflag;
	
	@FindBy(xpath="//input[@name='SinkholeFlag']")//Check Box
	WebElement sinkholeflag;
	
	@FindBy(xpath="//input[@name='ConstructionFlag']")//Check Box
	WebElement constructionflag;
	
	@FindBy(xpath="//input[@name='BusinessAtLocationFlag']")//Check Box
	WebElement businessatlocationflag;
	
	@FindBy(xpath="//input[@name='IneligibleDogFlag']")//Check Box
	WebElement ineligibledogflag;
	
	@FindBy(xpath="//input[@name='PoolFenceFlag']")//Check Box
	WebElement poolfenceflag;
	
	@FindBy(xpath="//input[@name='TrampolineFlag']")//Check Box
	WebElement trampolineflag;
	
	@FindBy(xpath="//input[@name='RoofOverlayFlag']")//Check Box
	WebElement roofoverlayflag;
	
	@FindBy(xpath="//input[@name='UnrepairedFlag']")//Check Box
	WebElement unrepairedflag;
	
	@FindBy(xpath="//input[@name='VerifyNoInelCond']")//Check Box
	WebElement verifynoinelcond;

	@FindBy(xpath="//input[@name='ResidentEmployeeFlag']")//Check Box
	WebElement residentemployeeflag;
	
	@FindBy(xpath="//input[@name='FiveAcresPlusFlag']")//Check Box
	WebElement fiveacresplusflag;
	
	@FindBy(xpath="//input[@name='HomeDaycareFlag']")//Check Box
	WebElement homedaycareflag;
	
	@FindBy(xpath="//input[@name='TwoPlusClaimsFlag']")//Check Box
	WebElement twoplusclaimsflag;

	@FindBy(xpath="//input[@name='VerifyNoUwCond']")//Check Box
	WebElement verifynouwcond;

	@FindBy(xpath="//span[contains(text(),'Continue to Quote Type')]")//Submission Button
	WebElement continuetoquotetype;

	@FindBy(xpath="//div[contains(@class, 'addr-inline error')]")//Submission Button
	WebElement addresserror;

	@FindBy(xpath="//input[contains(@id,'DwellingCoverageValue')]")//Text Box
	WebElement dwellingcovg;
	
	@FindBy(xpath="//span[contains(text(),'Select Full Quote')]")//Submission Button
	WebElement selectfullquote;
	
	@FindBy(xpath="//span[contains(text(),'Select Fast Quote')]")//Submission Button
	WebElement selectfastquote;
	
	@FindBy(xpath="//input[contains(@id,'PurchaseDate')]")//Text/Date Box - Date(MMDDYYYY)
	WebElement purchdate;
	
	@FindBy(xpath="//input[contains(@id,'PurchasePrice')]")//Text Box
	WebElement purchprice;
	
	@FindBy(xpath="//input[contains(@id,'PersonalProperty')]")//Text Box
	WebElement personalprop;

	@FindBy(xpath="//input[contains(@id,'YearBuilt')]")//Text Box
	WebElement yearhomebuilt;
	
	@FindBy(xpath="//select[contains(@id,'FireHydrant1000Feet')]")//Drop Down
	WebElement firehydrant;
	
	@FindBy(xpath="//select[contains(@id,'ProtectionClass')]")//Drop down
	WebElement protectionclass;
	
	@FindBy(xpath="//select[contains(@id,'TypeOfConstruction')]")//Drop down
	WebElement typeconstruction;

	@FindBy(xpath="//select[contains(@id,'ExteriorWalls')]")//Drop down
	WebElement exteriorwalls;
	
	@FindBy(xpath="//select[contains(@id,'NumberOfStories')]")//Drop down
	WebElement numberofstories;

	@FindBy(xpath="//input[contains(@id,'YearRoofInstalled')]")//Drop down
	WebElement yearroofinstalled;

	@FindBy(xpath="//select[contains(@id,'RoofDesign')]")//Drop down
	WebElement roofdesign;
	
	@FindBy(xpath="//select[contains(@id,'RoofMaterial')]")//Drop down
	WebElement roofmaterial;
	
	@FindBy(xpath="//input[contains(@id,'LivingArea')]")//Text box
	WebElement livingarea;
	
	@FindBy(xpath="//select[contains(@id,'GarageType')]")//Drop down
	WebElement garage;
	
	@FindBy(xpath="//select[contains(@id,'Substructure')]")//Drop down
	WebElement substructure;
	
	@FindBy(xpath="//input[contains(@id,'PctBasement')]")//Drop down
	WebElement baseperct;
	
	@FindBy(xpath="//input[contains(@id,'PctFinishedBasement')]")//Drop down
	WebElement finbaseperct;
	
	@FindBy(xpath="//select[contains(@id,'BathroomGrade')]")//Drop down
	WebElement bathroomgrade;
	
	@FindBy(xpath="//select[contains(@id,'NumberOfFullBaths')]")//Drop down
	WebElement numfullbaths;
	
	@FindBy(xpath="//select[contains(@id,'NumberOfHalfBaths')]")//Drop down
	WebElement numhalfbaths;
	
	@FindBy(xpath="//select[contains(@id,'KitchenGrade')]")//Drop down
	WebElement kitchengrade;
	
	@FindBy(xpath="//select[contains(@id,'CoolingType')]")//Drop down
	WebElement coolingair;
	
	@FindBy(xpath="//input[contains(@id,'YearCoolingReplaced')]")//Text Box
	WebElement yearcoolingreplc;	
	
	@FindBy(xpath="//select[contains(@id,'HeatingType')]")//Drop down
	WebElement permheatsource;
	
	@FindBy(xpath="//input[contains(@id,'YearHeatingReplaced')]")//Text Box
	WebElement yearheatingreplc;
	
	@FindBy(xpath="//select[contains(@id,'HomeUpdate')]")//Drop down
	WebElement homeupdate;
	
	@FindBy(xpath="//input[contains(@id,'LatestPermitDate')]")//Text Box
	WebElement latestpermitdate;
	
	@FindBy(xpath="//select[contains(@id,'DeckType')]")//Drop down
	WebElement deck;
	
	@FindBy(xpath="//input[contains(@id,'DeckArea')]")//Text Box
	WebElement deckarea;
	
	@FindBy(xpath="//select[contains(@id,'ElectricalSystem')]")//Drop down
	WebElement electricalsystem;
	
	@FindBy(xpath="//input[contains(@id,'YearElectricalReplaced')]")//Text Box
	WebElement yearelectricalreplc;
	
	@FindBy(xpath="//select[contains(@id,'PlumbingSystem')]")//Drop down
	WebElement plumbingsystem;
	
	@FindBy(xpath="//input[contains(@id,'YearPlumbingReplaced')]")//Text Box
	WebElement yearplumbingreplc;
	
	@FindBy(xpath="//input[contains(@id,'YearWaterHeaterReplaced')]")//Text Box
	WebElement yearwaterheaterreplc;
	
	@FindBy(xpath="//select[contains(@id,'AluminumWiring')]")//Drop down
	WebElement aluminumwiring;
	
	@FindBy(xpath="//span[@class='fw400' and contains(text(),'HOUSEHOLD MEMBERS')]")//Submission Button
	WebElement submit;
	
	@FindBy(xpath="//span[contains(text(),'Options')]")//Button
	WebElement options;
		
	@FindBy(xpath="//span[contains(text(),'Save & Exit')]")//Button
	WebElement save;
	
	@FindBy(xpath="//span[@class='quote-number-text']")//Text
	WebElement quoteid;
	
	@FindBy(xpath="//div[contains(text(),'Email')]")//Text
	WebElement emailtextheader;
	
	@FindBy(xpath="//div[contains(text(),'Customer')]")//Text
	WebElement customertextheader;
	
	@FindBy(xpath="(//div[@class='walkme-click-and-hover walkme-custom-balloon-close-button walkme-action-close walkme-inspect-ignore'])[last()]")//Button
	WebElement closepopup;
	
	@FindBy(xpath="//div[contains(@class,'asi-error-msg')]")//Text
	WebElement edits;
	
	//Constructor
	public Products(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;			
	}	
	
	//Clicks the X on the pop-up
	public void ClosePopUp() throws InterruptedException {
		ClickCustomerTextHeader();
			Pause(2500);
		closepopup.click();
			Pause(1000);
			Log("Closed the FAO Pop-up");			
	}	
	
	//Clicks the "CUSTOMER" header at top of the page.
	public void ClickCustomerTextHeader() {		 	
		customertextheader.click();
			Log("Clicked the \"CUSTOMER\" text header");
	}
	
	//Types into "Policy Effective Date" text/date box (MMDDYYYY)
	public void TypePolicyEffDate(String TypePolicyEffDate) {
		poleffdate.clear();
		poleffdate.sendKeys(TypePolicyEffDate);
		emailtextheader.click();
			Log("Entered Policy Effective Date: " + TypePolicyEffDate);
	}
	
	//Clicks Y/N on the "Is this risk for a home closing?" radio button
	public void SelectRiskHomeClosing(String SelectRiskHomeClosing) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		switch(SelectRiskHomeClosing.toUpperCase()) {		
			case "Y": case "YES": 	executor.executeScript("arguments[0].click()", riskclosingy);
										Log("Clicked YES on the \"Is this risk for a home closing?\" radio button on the Products page");
									break;
									
			case "N": case "NO": 	executor.executeScript("arguments[0].click()", riskclosingn);
										Log("Clicked NO on the \"Is this risk for a home closing?\" radio button on the Products page");
									break;
									
			default:					Log("Invalid value for SelectRiskHomeClosing()");
									break;
		}
	}
	
	//Clicks Y/N on the "Exclude Wind" radio button
	public void SelectExcludeWind(String SelectExcludeWind) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		switch(SelectExcludeWind.toUpperCase()) {		
			case "Y": case "YES": 	executor.executeScript("arguments[0].click()", xwindy);
										Log("Clicked YES on the \"Exclude Wind\" radio button on the Products page");
									break;
									
			case "N": case "NO": 	executor.executeScript("arguments[0].click()", xwindn);
										Log("Clicked NO on the \"Exclude Wind\" radio button on the Products page");
									break;
									
			default:					Log("Invalid value for SelectExcludeWind()");
									break;
		}
	}
	
	//Types into "Address Line 1" text box
	public void TypeLocalAddress1(String TypeLocalAddress1) {
		locaddy1.clear();
		locaddy1.sendKeys(TypeLocalAddress1);
			Log("Entered Address Line 1: " + TypeLocalAddress1);
	}
	
	//Types into "Address Line 2" text box
	public void TypeLocalAddress2(String TypeLocalAddress2) {
		locaddy2.clear();
		locaddy2.sendKeys(TypeLocalAddress2);
			Log("Entered Address Line 2: " + TypeLocalAddress2);
	}
	
	//Types into "City" text box
	public void TypeLocalCity(String TypeLocalCity) {
		city.clear();
		city.sendKeys(TypeLocalCity);
			Log("Entered City: " + TypeLocalCity);
	}
	
	//Types into "Zip Code" text box
	public void TypeLocalZip(String TypeLocalZip) {
		zip.clear();
		zip.sendKeys(TypeLocalZip);
			Log("Entered Zip Code: " + TypeLocalZip);
	}
	
	//Selects "Residence Type" from drop down
	public void SelectResidenceType(String SelectResidenceType) {
		new Select(residenttype).selectByVisibleText(SelectResidenceType);
			Log("Entered Residence Type: " + SelectResidenceType);
	}
	
	//Checks the "New Construction" check box
	public void CheckNewConstruction(String CheckNewConstruction) throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		switch(CheckNewConstruction.toUpperCase()) {		
			case "Y": case "YES": 	executor.executeScript("arguments[0].click()", newconstruction);
										Log("\"New Construction\" check box marked");
									Pause(1000);
									break;
									
			case "N": case "NO": 		Log("\"New Construction\" check box NOT marked");
									break;
									
			default:					Log("Invalid value for CheckNewConstruction()");
									break;
		}
	}
	
	//Returns the value in the "New Construction" field
	public String ReturnNewConstruction() {
		if(newconstruction.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}
	
	//Checks the "Prior liability claim" check box
	public void CheckPriorLiabilityClaim() {
		priorliabilityflag.click();
			Log("\"Prior liability claim\" check box marked");
	}
	
	//Checks the "Underground fuel tank on premises" check box
	public void CheckUndergroundFuelTankOnPremises() {
		undergroundtankflag.click();
			Log("\"Underground fuel tank on premises\" check box marked");
	}
	
	//Checks the "Sinkholes, settlement or cracking damage" check box
	public void CheckSinkholesSettlementOrCrackingDamage() {
		sinkholeflag.click();
			Log("\"Sinkholes, settlement or cracking damage\" check box marked");
	}
	
	//Checks the "Dwelling under construction" check box
	public void CheckDwellingUnderConstruction() {
		constructionflag.click();
			Log("\"Dwelling under construction\" check box marked");
	}
	
	//Checks the "Business activity at location" check box
	public void CheckBusinessActivityAtLocation() {
		businessatlocationflag.click();
			Log("\"Business activity at location\" check box marked");
	}
	
	//Checks the "Ineligible dog breed on premises" check box
	public void CheckIneligibleDogBreedOnPremises() {
		ineligibledogflag.click();
			Log("\"Ineligible dog breed on premises\" check box marked");
	}
	
	//Checks the "Unfenced pool or hot tub, diving board or slide at location" check box
	public void CheckUnfencedPoolOrHotTubDivingBoardOrSlideAtLocation() {
		poolfenceflag.click();
			Log("\"Unfenced pool or hot tub, diving board or slide at location\" check box marked");
	}
	
	//Checks the "Trampoline on premises" check box
	public void CheckTrampolineOnPremises() {
		trampolineflag.click();
			Log("\"Trampoline on premises\" check box marked");
	}
	
	//Checks the "More than one roof overlay" check box
	public void CheckMoreThanOneRoofOverlay() {
		roofoverlayflag.click();
			Log("\"More than one roof overlay\" check box marked");
	}
	
	//Checks the "Unrepaired damage to the Insured location" check box
	public void CheckUnrepairedDamageToTheInsuredLocation() {
		unrepairedflag.click();
			Log("\"Unrepaired damage to the Insured location\" check box marked");
	}
	
	//Checks the "Resident employees" check box
	public void CheckResidentEmployees() {
		residentemployeeflag.click();
			Log("\"Resident employees\" check box marked");
	}
	
	//Checks the "2 or more claims in the last 5 years" check box
	public void Check2OrMoreClaimsInTheLast5Years() {
		twoplusclaimsflag.click();
			Log("\"2 or more claims in the last 5 years\" check box marked");
	}
	
	//Checks the "Home daycare" check box
	public void CheckHomeDaycare() {
		homedaycareflag.click();
			Log("\"Home daycare\" check box marked");
	}
	
	//Checks the "Property situated on more than 5 acres" check box
	public void CheckPropertySituatedOnMoreThan5Acres() {
		fiveacresplusflag.click();
			Log("\"Property situated on more than 5 acres\" check box marked");
	}

	//Checks the "Ineligible/Underwriting" verifications
	public void CheckBothVerifications() throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", verifynoinelcond);
			Pause(2000);
		executor.executeScript("arguments[0].click()", verifynouwcond);
			Log("\"I have verified that NONE of these conditions exist\" check boxes marked");
	}
	
	//Checks the "Ineligible" verification
	public void CheckIneligibleVerification() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", verifynoinelcond);
			Log("\"I have verified that NONE of these conditions exist\" Ineligible check box marked");
	}
	
	//Checks the "Underwriting" verification
	public void CheckUnderwritingVerification() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", verifynouwcond);	
			Log("\"I have verified that NONE of these conditions exist\" Underwriting check box marked");
	}
	
	//Clicks the "CONTINUE TO QUOTE TYPE" form submission button
	public void ContinueToQuoteType() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", continuetoquotetype);
			Log("Clicked the \"CONTINUE TO QUOTE TYPE\" button on the Products page");
	}
	
	//Types the "Begin with Dwelling Coverage:" text box
	public void TypeDwellingCoverage(String TypeDwellingCoverage) {
		String dwellingcovgvalue = TypeDwellingCoverage.replace("$", "").replace(",", "");
		dwellingcovg.clear();
		dwellingcovg.sendKeys(dwellingcovgvalue);
		dwellingcovg.sendKeys(Keys.TAB);
			Log("Entered Begin with Dwelling Coverage: " + TypeDwellingCoverage);
	}
	
	//Clicks the appropriate quote type
	public void ClickQuoteType(String ClickQuoteType) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		switch(ClickQuoteType.toUpperCase()) {
			case "FULL":	executor.executeScript("arguments[0].click()", selectfullquote);						 
						 		Log("Clicked the \"FULL QUOTE\" button on the Products page");
						 	break;
						 	
			case "FAST": 	executor.executeScript("arguments[0].click()", selectfastquote);
						 		Log("Clicked the \"FAST QUOTE\" button on the Products page");
						 	break;
		}
	}
	
	//Types into "Purchase Date" text/date box (MMDDYYYY)
	public void TypePurchaseDate(String TypePurchaseDate) {
		if(purchdate.getAttribute("ng-reflect-model").isEmpty()) {
			purchdate.clear();
			purchdate.sendKeys(TypePurchaseDate);
				Log("Entered Purchase Date: " + TypePurchaseDate);
		}
		else {
				Log("Purchase Date already entered: " + purchdate.getAttribute("ng-reflect-model"));
		}
	}
	
	//Types into "Purchase Price" text box
	public void TypePurchasePrice(String TypePurchasePrice) {
		if(purchprice.getAttribute("ng-reflect-model").isEmpty()) {
			String purchpricevalue = TypePurchasePrice.replace("$", "").replace(",", "");
			purchprice.clear();
			purchprice.sendKeys(purchpricevalue);
				Log("Entered Purchase Price: " + TypePurchasePrice);
		}
		else {
				Log("Purchase Price already entered: " + purchprice.getAttribute("ng-reflect-model"));
		}
	}
	
	//Force types into "Purchase Price" text box
	public void ForceTypePurchasePrice(String ForceTypePurchasePrice) {
		String purchpricevalue = ForceTypePurchasePrice.replace("$", "").replace(",", "");
		purchprice.clear();
		purchprice.sendKeys(purchpricevalue);
			Log("Entered Purchase Price: " + purchpricevalue);
	}
	
	//Types into "Personal Property" text box
	public void TypePersonalProperty(String TypePersonalProperty) {
		switch(TypePersonalProperty.toUpperCase()) {
			case "0": case "N": case "NONE":		Log("Entered Personal Property: None");
												break;
												
			default:							String personalpropvalue = TypePersonalProperty.replace("$", "").replace(",", "");
												personalprop.clear();
												personalprop.sendKeys(personalpropvalue);
												personalprop.sendKeys(Keys.TAB);
													Log("Entered Personal Property: " + TypePersonalProperty);
												break;
		}
	}
	
	//Types into "Year Home Built" text box
	public void TypeYearHomeBuilt(String TypeYearHomeBuilt) throws InterruptedException {
		if(yearhomebuilt.getAttribute("ng-reflect-model").equals("0") || yearhomebuilt.getAttribute("ng-reflect-model").isEmpty()) {
			yearhomebuilt.clear();
			yearhomebuilt.sendKeys(TypeYearHomeBuilt);
					Log("Entered Year Home Built: " + TypeYearHomeBuilt);
				Pause(1000);
		}
		else {
			Log("Year Home Built already entered: " + yearhomebuilt.getAttribute("ng-reflect-model"));
		}
	}
	
	//Force types into "Year Home Built" text box
	public void ForceTypeYearHomeBuilt(String ForceTypeYearHomeBuilt) throws InterruptedException {
		yearhomebuilt.clear();
			Pause(3000);
		yearhomebuilt.sendKeys(ForceTypeYearHomeBuilt);
			Log("Entered Year Home Built: " + ForceTypeYearHomeBuilt);
			Pause(2000);
	}	
	
	//Returns the value in the "Year Home Built" field
	public String ReturnYearHomeBuilt() {
		if(yearhomebuilt.getAttribute("ng-reflect-model").isEmpty()) {
			return "N/A";
		}
		else {
			return yearhomebuilt.getAttribute("ng-reflect-model");	
		}
	}
	
	//Selects "Is a fire hydrant within 1000 feet" from drop down
	public String SelectIsAFireHydrantWithin1000Feet(String SelectIsAFireHydrantWithin1000Feet, String Log) throws InterruptedException {
		if(driver.getPageSource().contains("Is a fire hydrant within 1000 feet")) {
			switch(SelectIsAFireHydrantWithin1000Feet.toUpperCase()) {
				case "N": case "NO":	new Select(firehydrant).selectByVisibleText("No");
											if(Log.toUpperCase().equals("Y") || Log.toUpperCase().equals("YES")) {
												Log("Entered Is a fire hydrant within 1000 feet: No");
											}
											Pause(1000);
										break;				
					
				case "Y": case "YES":	new Select(firehydrant).selectByVisibleText("Yes");
											if(Log.toUpperCase().equals("Y") || Log.toUpperCase().equals("YES")) {
												Log("Entered Is a fire hydrant within 1000 feet: Yes");
											}
											Pause(1000);
										break;			
			}
			return "displayed";
		}
		else {
			if(Log.toUpperCase().equals("Y") || Log.toUpperCase().equals("YES")) {
				Log("\"Is a fire hydrant within 1000 feet\" field is not currently displayed");
			}
			return "notdisplayed";
		}		
	}
	
	//Selects "Protection Class" from drop down
	public void SelectProtectionClass(String SelectProtectionClass) throws InterruptedException {
		if(protectionclass.isEnabled()) {
			new Select(protectionclass).selectByVisibleText(SelectProtectionClass);
				Log("Entered Protection Class: " + SelectProtectionClass);
				Pause(1000);
		}
		else {
				Log("Protection Class Prefilled with: " + new Select(protectionclass).getFirstSelectedOption().getText());
		}
	}
	
	//Returns the value in the "Protection Class" field
	public String ReturnProtectionClass() {
		if(new Select(protectionclass).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(protectionclass).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Type of Construction" from drop down
	public void SelectTypeofConstruction(String SelectTypeofConstruction) throws InterruptedException {
		if(new Select(typeconstruction).getFirstSelectedOption().getText().isEmpty()) {
			switch(SelectTypeofConstruction.toUpperCase()) {
				case "F": case "FRAME":				new Select(typeconstruction).selectByVisibleText("Frame");
														Log("Entered Type of Construction: Frame");
													break;
													
				case "S": case "SUPERIOR":			new Select(typeconstruction).selectByVisibleText("Superior");
														Log("Entered Type of Construction: Superior");
													break;
										
				case "M": case "MASONRY":			new Select(typeconstruction).selectByVisibleText("Masonry");
														Log("Entered Type of Construction: Masonry");
													break;
									
				case "V": case "MASONRY/VENEER":	new Select(typeconstruction).selectByVisibleText("Masonry/Veneer");
														Log("Entered Type of Construction: Masonry/Veneer");
													break;
													
				default:								Log("Invalid value for SelectTypeofConstruction()");
													break;							
			}
				Pause(1000);
		}
		else {
				Log("Type of Construction already entered: " + new Select(typeconstruction).getFirstSelectedOption().getText());
		}
	}
	
	//Force selects "Type of Construction" from drop down
	public void ForceSelectTypeofConstruction(String ForceSelectTypeofConstruction) throws InterruptedException {
		switch(ForceSelectTypeofConstruction.toUpperCase()) {
			case "F": case "FRAME":				new Select(typeconstruction).selectByVisibleText("Frame");
													Log("Entered Type of Construction: Frame");
												break;
												
			case "S": case "SUPERIOR":			new Select(typeconstruction).selectByVisibleText("Superior");
													Log("Entered Type of Construction: Superior");
												break;
									
			case "M": case "MASONRY":			new Select(typeconstruction).selectByVisibleText("Masonry");
													Log("Entered Type of Construction: Masonry");
												break;
								
			case "V": case "MASONRY/VENEER":	new Select(typeconstruction).selectByVisibleText("Masonry/Veneer");
													Log("Entered Type of Construction: Masonry/Veneer");
												break;
												
			default:								Log("Invalid value for ForceSelectTypeofConstruction()");
												break;					
		}
			Pause(1000);
	}
	
	//Returns the value in the "Type of Construction" field
	public String ReturnTypeofConstruction() {
		if(new Select(typeconstruction).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(typeconstruction).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Exterior Walls" from drop down
	public void SelectExteriorWalls(String SelectExteriorWalls) throws InterruptedException {
		if(new Select(exteriorwalls).getFirstSelectedOption().getText().isEmpty()) {
			new Select(exteriorwalls).selectByVisibleText(SelectExteriorWalls);
				Log("Entered Exterior Walls: " + SelectExteriorWalls);
				Pause(1000);
		}
		else {
				Log("Exterior Walls already entered: " + new Select(exteriorwalls).getFirstSelectedOption().getText());
		}
	}
	
	//Force selects "Exterior Walls" from drop down
	public void ForceSelectExteriorWalls(String ForceSelectExteriorWalls) throws InterruptedException {
		new Select(exteriorwalls).selectByVisibleText(ForceSelectExteriorWalls);
			Log("Entered Exterior Walls: " + ForceSelectExteriorWalls);
			Pause(1000);		
	}
	
	//Returns the value in the "Exterior Walls" field
	public String ReturnExteriorWalls() {
		if(new Select(exteriorwalls).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(exteriorwalls).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Number of Stories" from drop down
	public void SelectNumberofStories(String SelectNumberofStories) throws InterruptedException {
		if(new Select(numberofstories).getFirstSelectedOption().getText().isEmpty()) {
			switch(SelectNumberofStories.toUpperCase()) {
				case "1": case "1 STORY / RANCH":			new Select(numberofstories).selectByVisibleText("1 Story / Ranch");
																Log("Entered Number of Stories: 1 Story / Ranch");
															break;
					
				case "1.5": case "1.5 STORIES":				new Select(numberofstories).selectByVisibleText("1.5 Stories");
																Log("Entered Number of Stories: 1.5 Stories");
															break;
					
				case "2": case "2 STORIES":					new Select(numberofstories).selectByVisibleText("2 Stories");
																Log("Entered Number of Stories: 2 Stories");
															break;
					
				case "2.5": case "2.5 STORIES":				new Select(numberofstories).selectByVisibleText("2.5 Stories");
																Log("Entered Number of Stories: 2.5 Stories");
															break;
					
				case "3": case "3 STORIES":					new Select(numberofstories).selectByVisibleText("3 Stories");
																Log("Entered Number of Stories: 3 Stories");
															break;
					
				case "BL": case "BI LEVEL / RAISED RANCH":	new Select(numberofstories).selectByVisibleText("Bi Level / Raised Ranch");
																Log("Entered Number of Stories: Bi Level / Raised Ranch");
															break;
					
				case "TL": case "TRI LEVEL":				new Select(numberofstories).selectByVisibleText("Tri Level");
																Log("Entered Number of Stories: Tri Level");
															break;
															
				default:									new Select(numberofstories).selectByVisibleText(SelectNumberofStories);
																Log("Entered Number of Stories: " + SelectNumberofStories);
															break;		
			}
				Pause(1000);
		}
		else {
				Log("Number of Stories already entered: " + new Select(numberofstories).getFirstSelectedOption().getText());
		}
	}
	
	//Force selects "Number of Stories" from drop down
	public void ForceSelectNumberofStories(String ForceSelectNumberofStories) {
		switch(ForceSelectNumberofStories.toUpperCase()) {
			case "1": case "1 STORY / RANCH":			new Select(numberofstories).selectByVisibleText("1 Story / Ranch");
															Log("Entered Number of Stories: 1 Story / Ranch");
														break;
				
			case "1.5": case "1.5 STORIES":				new Select(numberofstories).selectByVisibleText("1.5 Stories");
															Log("Entered Number of Stories: 1.5 Stories");
														break;
				
			case "2": case "2 STORIES":					new Select(numberofstories).selectByVisibleText("2 Stories");
															Log("Entered Number of Stories: 2 Stories");
														break;
				
			case "2.5": case "2.5 STORIES":				new Select(numberofstories).selectByVisibleText("2.5 Stories");
															Log("Entered Number of Stories: 2.5 Stories");
														break;
				
			case "3": case "3 STORIES":					new Select(numberofstories).selectByVisibleText("3 Stories");
															Log("Entered Number of Stories: 3 Stories");
														break;
				
			case "BL": case "BI LEVEL / RAISED RANCH":	new Select(numberofstories).selectByVisibleText("Bi Level / Raised Ranch");
															Log("Entered Number of Stories: Bi Level / Raised Ranch");
														break;
				
			case "TL": case "TRI LEVEL":				new Select(numberofstories).selectByVisibleText("Tri Level");
															Log("Entered Number of Stories: Tri Level");
														break;
														
			default:									new Select(numberofstories).selectByVisibleText(ForceSelectNumberofStories);
															Log("Entered Number of Stories: " + ForceSelectNumberofStories);
														break;		
		}
	}
	
	//Returns the value in the "Number of Stories" field
	public String ReturnNumberofStories() {
		if(new Select(numberofstories).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(numberofstories).getFirstSelectedOption().getText();	
		}
	}
	
	//Types into "Year Roof Installed" text box
	public void TypeYearRoofInstalled(String TypeYearRoofInstalled) throws InterruptedException {
		if(yearroofinstalled.getAttribute("ng-reflect-model").isEmpty()) {
			yearroofinstalled.clear();
			yearroofinstalled.sendKeys(TypeYearRoofInstalled);
				Log("Entered Year Roof Installed: " + TypeYearRoofInstalled);
				Pause(1000);
		}
		else {
				Log("Year Roof Installed already entered: " + yearroofinstalled.getAttribute("ng-reflect-model"));
		}
	}
	
	//Force types into "Year Roof Installed" text box
	public void ForceTypeYearRoofInstalled(String ForceTypeYearRoofInstalled) throws InterruptedException {
		yearroofinstalled.clear();
		yearroofinstalled.sendKeys(ForceTypeYearRoofInstalled);
			Log("Entered Year Roof Installed: " + ForceTypeYearRoofInstalled);
			Pause(1000);		
	}
	
	//Returns the value in the "Year Roof Installed" field
	public String ReturnYearRoofInstalled() {
		if(yearroofinstalled.getAttribute("ng-reflect-model").isEmpty()) {
			return "N/A";
		}
		else {
			return yearroofinstalled.getAttribute("ng-reflect-model");	
		}
	}
	
	//Selects "Roof Design" from drop down
	public void SelectRoofDesign(String SelectRoofDesign) throws InterruptedException {
		if(new Select(roofdesign).getFirstSelectedOption().getText().isEmpty()) {
			new Select(roofdesign).selectByVisibleText(SelectRoofDesign);
				Log("Entered Roof Design: " + SelectRoofDesign);
				Pause(1000);
		}
		else {
			Log("Roof Design already entered: " + new Select(roofdesign).getFirstSelectedOption().getText());
		}
	}
	
	//Force selects "Roof Design" from drop down
	public void ForceSelectRoofDesign(String SelectRoofDesign) throws InterruptedException {
		new Select(roofdesign).selectByVisibleText(SelectRoofDesign);
			Log("Entered Roof Design: " + SelectRoofDesign);
			Pause(1000);
	}
	
	//Returns the value in the "Roof Design" field
	public String ReturnRoofDesign() {
		if(new Select(roofdesign).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(roofdesign).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Roof Material" from drop down
	public void SelectRoofMaterial(String SelectRoofMaterial) throws InterruptedException {
		if(new Select(roofmaterial).getFirstSelectedOption().getText().isEmpty()) {
			switch(SelectRoofMaterial.toUpperCase()) {
				case "AB": case "ASBESTOS":									new Select(roofmaterial).selectByVisibleText("Asbestos");
																				Log("Entered Roof Material: Asbestos");
																			break;
					
				case "AC": case "ALUMINUM, CORRUGATED":						new Select(roofmaterial).selectByVisibleText("Aluminum, Corrugated");
																				Log("Entered Roof Material: Aluminum, Corrugated");
																			break;
					
				case "AS": case "SHINGLES, ARCHITECTURAL":					new Select(roofmaterial).selectByVisibleText("Shingles, Architectural");
																				Log("Entered Roof Material: Shingles, Architectural");
																			break;
					
				case "BT": case "BARREL TILE":								new Select(roofmaterial).selectByVisibleText("Barrel Tile");
																				Log("Entered Roof Material: Barrel Tile");
																			break;
					
				case "CS": case "COMPOSITE SHINGLE":						new Select(roofmaterial).selectByVisibleText("Composite Shingle");
																				Log("Entered Roof Material: Composite Shingle");
																			break;
					
				case "CT": case "CONCRETE TILE":							new Select(roofmaterial).selectByVisibleText("Concrete Tile");
																				Log("Entered Roof Material: Concrete Tile");
																			break;
					
				case "FT": case "FLAT TILE":								new Select(roofmaterial).selectByVisibleText("Flat Tile");
																				Log("Entered Roof Material: Flat Tile");
																			break;
					
				case "M": case "METAL":										new Select(roofmaterial).selectByVisibleText("Metal");
																				Log("Entered Roof Material: Metal");
																			break;
					
				case "O": case "OTHER":										new Select(roofmaterial).selectByVisibleText("Other");
																				Log("Entered Roof Material: Other");
																			break;
					
				case "PC": case "POURED CONCRETE":							new Select(roofmaterial).selectByVisibleText("Poured Concrete");
																				Log("Entered Roof Material: Poured Concrete");
																			break;
					
				case "RB": case "RUBBER":									new Select(roofmaterial).selectByVisibleText("Rubber");
																				Log("Entered Roof Material: Rubber");
																			break;
					
				case "RR": case "ROLLED ROOF":								new Select(roofmaterial).selectByVisibleText("Rolled Roof");
																				Log("Entered Roof Material: Rolled Roof");
																			break;
					
				case "SC": case "SUPERIOR CONSTRUCTION W/POURED CONCRETE":	new Select(roofmaterial).selectByVisibleText("Superior Construction w/Poured Concrete");
																				Log("Entered Roof Material: Superior Construction w/Poured Concrete");
																			break;
					
				case "SL": case "SLATE":									new Select(roofmaterial).selectByVisibleText("Slate");
																				Log("Entered Roof Material: Slate");
																			break;
					
				case "T": case "CLAY TILE":									new Select(roofmaterial).selectByVisibleText("Clay Tile");
																				Log("Entered Roof Material: Clay Tile");
																			break;
					
				case "TG": case "TAR AND GRAVEL":							new Select(roofmaterial).selectByVisibleText("Tar and Gravel");
																				Log("Entered Roof Material: Tar and Gravel");
																			break;
					
				case "WK": case "WOOD SHAKE":								new Select(roofmaterial).selectByVisibleText("Wood Shake");
																				Log("Entered Roof Material: Wood Shake");
																			break;
					
				case "WS": case "WOOD SHINGLE":								new Select(roofmaterial).selectByVisibleText("Wood Shingle");
																				Log("Entered Roof Material: Wood Shingle");
																			break;
																			
				default:														Log("Invalid value for SelectRoofMaterial()");
																			break;
			}
				Pause(1000);
		}
		else {
				Log("Roof Material already entered: " + new Select(roofmaterial).getFirstSelectedOption().getText());
		}
	}
	
	//Force selects "Roof Material" from drop down
	public void ForceSelectRoofMaterial(String ForceSelectRoofMaterial) throws InterruptedException {
		switch(ForceSelectRoofMaterial.toUpperCase()) {
			case "AB": case "ASBESTOS":									new Select(roofmaterial).selectByVisibleText("Asbestos");
																			Log("Entered Roof Material: Asbestos");
																		break;
				
			case "AC": case "ALUMINUM, CORRUGATED":						new Select(roofmaterial).selectByVisibleText("Aluminum, Corrugated");
																			Log("Entered Roof Material: Aluminum, Corrugated");
																		break;
				
			case "AS": case "SHINGLES, ARCHITECTURAL":					new Select(roofmaterial).selectByVisibleText("Shingles, Architectural");
																			Log("Entered Roof Material: Shingles, Architectural");
																		break;
				
			case "BT": case "BARREL TILE":								new Select(roofmaterial).selectByVisibleText("Barrel Tile");
																			Log("Entered Roof Material: Barrel Tile");
																		break;
				
			case "CS": case "COMPOSITE SHINGLE":						new Select(roofmaterial).selectByVisibleText("Composite Shingle");
																			Log("Entered Roof Material: Composite Shingle");
																		break;
				
			case "CT": case "CONCRETE TILE":							new Select(roofmaterial).selectByVisibleText("Concrete Tile");
																			Log("Entered Roof Material: Concrete Tile");
																		break;
				
			case "FT": case "FLAT TILE":								new Select(roofmaterial).selectByVisibleText("Flat Tile");
																			Log("Entered Roof Material: Flat Tile");
																		break;
				
			case "M": case "METAL":										new Select(roofmaterial).selectByVisibleText("Metal");
																			Log("Entered Roof Material: Metal");
																		break;
				
			case "O": case "OTHER":										new Select(roofmaterial).selectByVisibleText("Other");
																			Log("Entered Roof Material: Other");
																		break;
				
			case "PC": case "POURED CONCRETE":							new Select(roofmaterial).selectByVisibleText("Poured Concrete");
																			Log("Entered Roof Material: Poured Concrete");
																		break;
				
			case "RB": case "RUBBER":									new Select(roofmaterial).selectByVisibleText("Rubber");
																			Log("Entered Roof Material: Rubber");
																		break;
				
			case "RR": case "ROLLED ROOF":								new Select(roofmaterial).selectByVisibleText("Rolled Roof");
																			Log("Entered Roof Material: Rolled Roof");
																		break;
				
			case "SC": case "SUPERIOR CONSTRUCTION W/POURED CONCRETE":	new Select(roofmaterial).selectByVisibleText("Superior Construction w/Poured Concrete");
																			Log("Entered Roof Material: Superior Construction w/Poured Concrete");
																		break;
				
			case "SL": case "SLATE":									new Select(roofmaterial).selectByVisibleText("Slate");
																			Log("Entered Roof Material: Slate");
																		break;
				
			case "T": case "CLAY TILE":									new Select(roofmaterial).selectByVisibleText("Clay Tile");
																			Log("Entered Roof Material: Clay Tile");
																		break;
				
			case "TG": case "TAR AND GRAVEL":							new Select(roofmaterial).selectByVisibleText("Tar and Gravel");
																			Log("Entered Roof Material: Tar and Gravel");
																		break;
				
			case "WK": case "WOOD SHAKE":								new Select(roofmaterial).selectByVisibleText("Wood Shake");
																			Log("Entered Roof Material: Wood Shake");
																		break;
				
			case "WS": case "WOOD SHINGLE":								new Select(roofmaterial).selectByVisibleText("Wood Shingle");
																			Log("Entered Roof Material: Wood Shingle");
																		break;
																		
			default:														Log("Invalid value for ForceSelectRoofMaterial()");
																		break;
		}
			Pause(1000);
	}
	
	//Returns the value in the "Roof Material" field
	public String ReturnRoofMaterial() {
		if(new Select(roofmaterial).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(roofmaterial).getFirstSelectedOption().getText();	
		}
	}
	
	//Types into "Living Area (Square Feet)" text box
	public void TypeLivingAreaSquareFeet(String TypeLivingAreaSquareFeet) throws InterruptedException {
		if(livingarea.getAttribute("ng-reflect-model").isEmpty()) {
			livingarea.clear();
			livingarea.sendKeys(TypeLivingAreaSquareFeet);
				Log("Entered Living Area (Square Feet): " + TypeLivingAreaSquareFeet);
				Pause(1000);
		}
		else {
				Log("Living Area (Square Feet) already entered: " + livingarea.getAttribute("ng-reflect-model"));
		}
	}
	
	//Force types into "Living Area (Square Feet)" text box
	public void ForceTypeLivingAreaSquareFeet(String ForceTypeLivingAreaSquareFeet) throws InterruptedException {
		livingarea.clear();
		livingarea.sendKeys(ForceTypeLivingAreaSquareFeet);
			Log("Entered Living Area (Square Feet): " + ForceTypeLivingAreaSquareFeet);
			Pause(1000);
	}
	
	//Returns the value in the "Living Area (Square Feet)" field
	public String ReturnLivingAreaSquareFeet() {
		if(livingarea.getAttribute("ng-reflect-model").isEmpty()) {
			return "N/A";
		}
		else {
			return livingarea.getAttribute("ng-reflect-model");	
		}
	}
	
	//Selects "Garage" from drop down
	public void SelectGarage(String SelectGarage) throws InterruptedException {
		if(new Select(garage).getFirstSelectedOption().getText().isEmpty()) {
			new Select(garage).selectByVisibleText(SelectGarage);
				Log("Entered Garage: " + SelectGarage);
				Pause(1000);
		}
		else {
				Log("Garage already entered: " + new Select(garage).getFirstSelectedOption().getText());
		}
	}
	
	//Force selects "Garage" from drop down
	public void ForceSelectGarage(String ForceSelectGarage) throws InterruptedException {
		new Select(garage).selectByVisibleText(ForceSelectGarage);
			Log("Entered Garage: " + ForceSelectGarage);
			Pause(1000);
	}
	
	//Returns the value in the "Garage" field
	public String ReturnGarage() {
		if(new Select(garage).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(garage).getFirstSelectedOption().getText();	
		}
	}	
	
	//Selects "Substructure" from drop down
	public void SelectSubstructure(String SelectSubstructure) throws InterruptedException {
		int randsubbasement = RandomNum(1,3);
		if(new Select(substructure).getFirstSelectedOption().getText().isEmpty()) {
			switch(SelectSubstructure.toUpperCase()) {
				case "B": case "BASEMENT":											if(randsubbasement==1) {
																						new Select(substructure).selectByVisibleText("Basement, Daylight");				
																					}
																					else if(randsubbasement==2){
																						new Select(substructure).selectByVisibleText("Basement, Below Grade");
																					}
																					else if(randsubbasement==3) {
																						new Select(substructure).selectByVisibleText("Basement, Walkout");				
																					}
																						Log("Entered Substructure: " + new Select(substructure).getFirstSelectedOption().getText());
																					break;
																					
				case "S": case "SLAB-ON-GROUND":									new Select(substructure).selectByVisibleText("Slab-on-ground");
																						Log("Entered Substructure: Slab-on-ground");
																					break;
													
				case "C": case "CRAWL SPACE":										new Select(substructure).selectByVisibleText("Crawl Space");
																						Log("Entered Substructure: Crawl Space");
																					break;
				
				case "P": case "PIERS (ELEVATED)":									new Select(substructure).selectByVisibleText("Piers (Elevated)");
																						Log("Entered Substructure: Piers (Elevated)");
																					break;
													
				case "O": case "OPEN FOUNDATION":									new Select(substructure).selectByVisibleText("Open Foundation");
																						Log("Entered Substructure: Open Foundation");
																					break;
													
				case "P/O": case "PIERS/OPEN FOUNDATION - 2 - 6FT W/ NO ENCLOSURE":	new Select(substructure).selectByVisibleText("Piers/Open Foundation - 2 - 6ft w/ no enclosure");
																						Log("Entered Substructure: Piers/Open Foundation - 2 - 6ft w/ no enclosure");
																					break;
																					
				case "P/C": case "PIERS/CRAWL SPACE - 2 - 6FT W/ PERMENT MATERIAL":	new Select(substructure).selectByVisibleText("Piers/Crawl Space - 2 - 6ft w/ permanent material");
																						Log("Entered Substructure: Piers/Crawl Space - 2 - 6ft w/ permanent material");
																					break;
																					
				case "PL": case "PILINGS 8-12 FT ELEVATION":						new Select(substructure).selectByVisibleText("Pilings 8-12 ft Elevation");
																						Log("Entered Substructure: Pilings 8-12 ft Elevation");
																					break;
																					
				default:																Log("Invalid value for SelectSubstructure()");
																					break;
			}
				Pause(1000);
		}
		else {
				Log("Substructure already entered: " + new Select(substructure).getFirstSelectedOption().getText());
		}
	}	
	
	//Force selects "Substructure" from drop down
	public void ForceSelectSubstructure(String ForceSelectSubstructure) throws InterruptedException {
		if(substructure.isEnabled()) {
			int randsubbasement = RandomNum(1,3);
			switch(ForceSelectSubstructure.toUpperCase()) {
				case "B": case "BASEMENT":												if(randsubbasement==1) {
																							new Select(substructure).selectByVisibleText("Basement, Daylight");				
																						}
																						else if(randsubbasement==2){
																							new Select(substructure).selectByVisibleText("Basement, Below Grade");
																						}
																						else if(randsubbasement==3) {
																							new Select(substructure).selectByVisibleText("Basement, Walkout");				
																						}
																							Log("Entered Substructure: " + new Select(substructure).getFirstSelectedOption().getText());
																							Pause(1000);
																						break;
																					
				case "S": case "SLAB-ON-GROUND":										new Select(substructure).selectByVisibleText("Slab-on-ground");
																							Log("Entered Substructure: Slab-on-ground");
																							Pause(1000);
																						break;
													
				case "C": case "CRAWL SPACE":											new Select(substructure).selectByVisibleText("Crawl Space");
																							Log("Entered Substructure: Crawl Space");
																							Pause(1000);
																						break;
				
				case "P": case "PIERS (ELEVATED)":										new Select(substructure).selectByVisibleText("Piers (Elevated)");
																							Log("Entered Substructure: Piers (Elevated)");
																							Pause(1000);
																						break;
													
				case "O": case "OPEN FOUNDATION":										new Select(substructure).selectByVisibleText("Open Foundation");
																							Log("Entered Substructure: Open Foundation");
																							Pause(1000);
																						break;
													
				case "P/O": case "PIERS/OPEN FOUNDATION - 2 - 6FT W/ NO ENCLOSURE":		new Select(substructure).selectByVisibleText("Piers/Open Foundation - 2 - 6ft w/ no enclosure");
																							Log("Entered Substructure: Piers/Open Foundation - 2 - 6ft w/ no enclosure");
																							Pause(1000);
																						break;
																					
				case "P/C": case "PIERS/CRAWL SPACE - 2 - 6FT W/ PERMANENT MATERIAL":	new Select(substructure).selectByVisibleText("Piers/Crawl Space - 2 - 6ft w/ permanent material");
																							Log("Entered Substructure: Piers/Crawl Space - 2 - 6ft w/ permanent material");
																							Pause(1000);
																						break;
																					
				case "PL": case "PILINGS 8-12 FT ELEVATION":							new Select(substructure).selectByVisibleText("Pilings 8-12 ft Elevation");
																							Log("Entered Substructure: Pilings 8-12 ft Elevation");
																							Pause(1000);
																						break;
																					
				default:																	Log("Invalid value for ForceSelectSubstructure()");
																						break;
			}
		}
		else {
			Log("Substructure already entered: " + new Select(substructure).getFirstSelectedOption().getText());
		}
	}
	
	//Returns the value in the "Substructure" field
	public String ReturnSubstructure() {
		if(new Select(substructure).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(substructure).getFirstSelectedOption().getText();	
		}
	}
	
	//Types into "Basement %" text box
	public void TypeBasementPerct(String TypeBasementPerct) {
		baseperct.clear();
		baseperct.sendKeys(TypeBasementPerct);
			Log("Entered Basement %: " + TypeBasementPerct);
	}
	
	//Types into "Finished Basement %" text box
	public void TypeFinishedBasementPerct(String TypeFinishedBasementPerct) {
		finbaseperct.clear();
		finbaseperct.sendKeys(TypeFinishedBasementPerct);
			Log("Entered Finished Basement %: " + TypeFinishedBasementPerct);
	}
	
	//Selects "Bathroom Grade" from drop down
	public void SelectBathroomGrade(String SelectBathroomGrade) {
		new Select(bathroomgrade).selectByVisibleText(SelectBathroomGrade);
			Log("Entered Bathroom Grade: " + SelectBathroomGrade);
	}
	
	//Selects "Number of Full Baths" from drop down
	public void SelectNumberFullBaths(String SelectNumberFullBaths) throws InterruptedException {
		if(new Select(numfullbaths).getFirstSelectedOption().getText().isEmpty()) {
			new Select(numfullbaths).selectByVisibleText(SelectNumberFullBaths);
				Log("Entered Number of Full Baths: " + SelectNumberFullBaths);
				Pause(1000);
		}
		else {
				Log("Number of Full Baths already entered: " + new Select(numfullbaths).getFirstSelectedOption().getText());
		}
	}
	
	//Force selects "Number of Full Baths" from drop down
	public void ForceSelectNumberFullBaths(String ForceSelectNumberFullBaths) throws InterruptedException {
		new Select(numfullbaths).selectByVisibleText(ForceSelectNumberFullBaths);
			Log("Entered Number of Full Baths: " + ForceSelectNumberFullBaths);
			Pause(1000);
	}
	
	//Returns the value in the "Number of Full Baths" field
	public String ReturnNumberFullBaths() {
		if(new Select(numfullbaths).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(numfullbaths).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Number of 1/2 Baths" from drop down
	public void SelectNumberHalfBaths(String SelectNumberHalfBaths) throws InterruptedException {
		new Select(numhalfbaths).selectByVisibleText(SelectNumberHalfBaths);
			Log("Entered Number of 1/2 Baths: " + SelectNumberHalfBaths);
	}
	
	//Force selects "Number of 1/2 Baths" from drop down
	public void ForceSelectNumberHalfBaths(String SelectNumberHalfBaths) throws InterruptedException {
		new Select(numhalfbaths).selectByVisibleText(SelectNumberHalfBaths);
			Log("Entered Number of 1/2 Baths: " + SelectNumberHalfBaths);
			Pause(1000);
	}	
	
	//Selects "Kitchen Grade" from drop down
	public void SelectKitchenGrade(String SelectKitchenGrade) {
		new Select(kitchengrade).selectByVisibleText(SelectKitchenGrade);
			Log("Entered Kitchen Grade: " + SelectKitchenGrade);
	}
	
	//Selects "Cooling/Air" from drop down
	public void SelectCoolingAir(String SelectCoolingAir) {
		new Select(coolingair).selectByVisibleText(SelectCoolingAir);
			Log("Entered Cooling/Air: " + SelectCoolingAir);
	}
	
	//Types into "Year Cooling Replaced" text box
	public void TypeYearCoolingReplaced(String TypeYearCoolingReplaced) {
		yearcoolingreplc.clear();
		yearcoolingreplc.sendKeys(TypeYearCoolingReplaced);
			Log("Entered Year Cooling Replaced: " + TypeYearCoolingReplaced);
	}
	
	//Selects "Permanent Heat Source" from drop down
	public void SelectPermanentHeatSource(String SelectPermanentHeatSource) throws InterruptedException {
		if(new Select(permheatsource).getFirstSelectedOption().getText().isEmpty()) {
			new Select(permheatsource).selectByVisibleText(SelectPermanentHeatSource);
				Log("Entered Permanent Heat Source: " + SelectPermanentHeatSource);
				Pause(1000);
		}
		else {
				Log("Permanent Heat Source already entered: " + new Select(permheatsource).getFirstSelectedOption().getText());
		}
	}
	
	//Force selects "Permanent Heat Source" from drop down
	public void ForceSelectPermanentHeatSource(String ForceSelectPermanentHeatSource) throws InterruptedException {
		new Select(permheatsource).selectByVisibleText(ForceSelectPermanentHeatSource);
			Log("Entered Permanent Heat Source: " + ForceSelectPermanentHeatSource);
			Pause(1000);
	}
	
	//Returns the value in the "Permanent Heat Source" field
	public String ReturnPermanentHeatSource() {
		if(new Select(permheatsource).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(permheatsource).getFirstSelectedOption().getText();	
		}
	}
	
	//Types into "Year Heating Replaced" text box
	public void TypeYearHeatingReplaced(String TypeYearHeatingReplaced) {
		yearheatingreplc.clear();
		yearheatingreplc.sendKeys(TypeYearHeatingReplaced);
			Log("Entered Year Heating Replaced: " + TypeYearHeatingReplaced);
	}
	
	//Selects "Home Update" from drop down
	public void SelectHomeUpdate(String SelectHomeUpdate) throws InterruptedException {
		if(new Select(homeupdate).getFirstSelectedOption().getText().isEmpty()) {
			switch(SelectHomeUpdate.toUpperCase()) {
				case "Y": case "YES":	new Select(homeupdate).selectByVisibleText("Yes");
											Log("Entered Home Update: Yes");
										break;
										
				case "N": case "NO":	new Select(homeupdate).selectByVisibleText("No");
											Log("Entered Home Update: No");
										break;
			}
				Pause(1000);
		}
		else {
				Log("Home Update already entered: " + new Select(homeupdate).getFirstSelectedOption().getText());			
		}
	}
	
	//Force selects "Home Update" from drop down
	public void ForceSelectHomeUpdate(String ForceSelectHomeUpdate) throws InterruptedException {
		switch(ForceSelectHomeUpdate.toUpperCase()) {
			case "Y": case "YES":	new Select(homeupdate).selectByVisibleText("Yes");
										Log("Entered Home Update: Yes");
									break;
									
			case "N": case "NO":	new Select(homeupdate).selectByVisibleText("No");
										Log("Entered Home Update: No");
									break;
		}
			Pause(1000);
	}
	
	//Returns the value in the "Home Update" field
	public String ReturnHomeUpdate() {
		if(new Select(homeupdate).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(homeupdate).getFirstSelectedOption().getText();	
		}
	}
	
	//Types into "Latest Permit Date" text box
	public void TypeLatestPermitDate(String TypeLatestPermitDate) throws InterruptedException {
		if(latestpermitdate.getAttribute("ng-reflect-model").isEmpty()) {
			latestpermitdate.clear();
			latestpermitdate.sendKeys(TypeLatestPermitDate);
				Log("Entered Latest Permit Date: " + TypeLatestPermitDate);
				Pause(1000);
		}
		else {
				Log("Latest Permit Date already entered: " + latestpermitdate.getAttribute("ng-reflect-model"));
		}
	}
	
	//Force types into "Latest Permit Date" text box
	public void ForceTypeLatestPermitDate(String ForceTypeLatestPermitDate) throws InterruptedException {
		if(!ForceTypeLatestPermitDate.toUpperCase().equals("N/A")) {
			latestpermitdate.clear();
			latestpermitdate.sendKeys(ForceTypeLatestPermitDate);
				Log("Entered Latest Permit Date: " + ForceTypeLatestPermitDate);
				Pause(1000);
		}
	}
	
	//Returns the value in the "Latest Permit Date" field
	public String ReturnLatestPermitDate() {
		if(latestpermitdate.getAttribute("ng-reflect-model").isEmpty()) {
			return "N/A";
		}
		else {
			return latestpermitdate.getAttribute("ng-reflect-model");	
		}
	}
	
	//Selects "Deck" from drop down
	public void SelectDeck(String SelectDeck) throws InterruptedException {
		if(new Select(deck).getFirstSelectedOption().getText().isEmpty()) {
			new Select(deck).selectByVisibleText(SelectDeck);
				Log("Entered Deck: " + SelectDeck);
				Pause(1000);
		}
		else {
				Log("Deck already entered: " + new Select(deck).getFirstSelectedOption().getText());
		}
		
	}
	
	//Force selects "Deck" from drop down
	public void ForceSelectDeck(String ForceSelectDeck) throws InterruptedException {
		new Select(deck).selectByVisibleText(ForceSelectDeck);
			Log("Entered Deck: " + ForceSelectDeck);
			Pause(1000);		
	}
	
	//Returns the value in the "Deck" field
	public String ReturnDeck() {
		if(new Select(deck).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(deck).getFirstSelectedOption().getText();	
		}
	}
	
	//Types into "Deck (Square Feet)" text box
	public void TypeDeckArea(String TypeDeckArea) throws InterruptedException {
		deckarea.clear();
		deckarea.sendKeys(TypeDeckArea);
			Log("Entered Deck (Square Feet): " + TypeDeckArea);				
	}	
	
	//Selects "Electrical System" from drop down
	public void SelectElectricalSystem(String SelectElectricalSystem) {
		new Select(electricalsystem).selectByVisibleText(SelectElectricalSystem);
			Log("Entered Electrical System: " + SelectElectricalSystem);
	}
	
	//Types into "Year Electrical Replaced" text box
	public void TypeYearElectricalReplaced(String TypeYearElectricalReplaced) {
		yearelectricalreplc.clear();
		yearelectricalreplc.sendKeys(TypeYearElectricalReplaced);
			Log("Entered Year Electrical Replaced: " + TypeYearElectricalReplaced);
	}
	
	//Selects "Plumbing System" from drop down
	public void SelectPlumbingSystem(String SelectPlumbingSystem) {
		new Select(plumbingsystem).selectByVisibleText(SelectPlumbingSystem);
			Log("Entered Plumbing System: " + SelectPlumbingSystem);
	}
	
	//Types into "Year Plumbing Replaced" text box
	public void TypeYearPlumbingReplaced(String TypeYearPlumbingReplaced) {
		yearplumbingreplc.clear();
		yearplumbingreplc.sendKeys(TypeYearPlumbingReplaced);
			Log("Entered Year Plumbing Replaced: " + TypeYearPlumbingReplaced);
	}
	
	//Types into "Year Water Heater Replaced" text box
	public void TypeYearWaterHeaterReplaced(String TypeYearWaterHeaterReplaced) {
		yearwaterheaterreplc.clear();
		yearwaterheaterreplc.sendKeys(TypeYearWaterHeaterReplaced);
			Log("Entered Year Water Heater Replaced: " + TypeYearWaterHeaterReplaced);
	}
	
	//Selects "Aluminum Wiring" from drop down
	public void SelectAluminumWiring(String SelectAluminumWiring) {
		new Select(aluminumwiring).selectByVisibleText(SelectAluminumWiring);
			Log("Entered Aluminum System: " + SelectAluminumWiring);
	}		
	
	//Clicks the "Household Members ->" submission button
	public void ClickHouseholdMembers() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", submit);
			Log("Clicked the \"Household Members ->\" button on the Products page");
	}
	
	//Saves Quote
	public void SaveQuote() {
		Actions action = new Actions(driver);
		action.moveToElement(options).moveToElement(save).click().build().perform();
			Log("Saved Quote");
	}
	
	//Returns the value in the "Deck" field
	public String ReturnAddressError() {
		return addresserror.getText();
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
					Log(quoteid.getText().substring(20));
				}
				return quoteid.getText().substring(20);			
			}
			else if(quoteid.getText().contains("Renters")) {
				if(log.toUpperCase().equals("Y") || log.toUpperCase().equals("YES")) {
					Log(quoteid.getText().substring(22));
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