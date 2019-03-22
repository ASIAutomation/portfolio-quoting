package Automation.IAQ.PS.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.IAQ.testBase.TestBase;

public class PolicyRatingPage2 extends TestBase {
	
public static final Logger log = Logger.getLogger(PolicyRatingPage2.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="Covg_24D")//Drop Down
	WebElement maritalstatus;
	
	@FindBy(id="Covg_24E")//Drop Down
	WebElement numberofchildreninhousehold;

	@FindBy(id="Covg_47B")//Drop Down
	WebElement priorliabilitylimit;

	@FindBy(id="Covg_47A")//Drop Down
	WebElement reportedclaims;

	@FindBy(id="Covg_03")//Drop Down
	WebElement otherstructures;

	@FindBy(id="Covg_04")//Drop Down
	WebElement personalproperty;

	@FindBy(id="Covg_05")//Drop Down
	WebElement lossofuse;

	@FindBy(id="Covg_06")//Drop Down
	WebElement liability;

	@FindBy(id="Covg_06B")//Drop Down
	WebElement hobbyfarm;

	@FindBy(id="Covg_08")//Drop Down
	WebElement medicalpaymentslimit;
	
	@FindBy(id="Covg_38")//Check Box
	WebElement accreditedbuilder;
	
	@FindBy(id="Covg_11B")//Check Box
	WebElement buildingcode;
	
	@FindBy(id="Covg_43D")//Check Box
	WebElement windowandotheropeningprotection;
	
	@FindBy(id="Covg_60B")//Check Box
	WebElement earthquakeinsurance;

	@FindBy(id="Covg_57")//Check Box
	WebElement epolicypaperless;

	@FindBy(id="Covg_57C")//Check Box
	WebElement esignature;

	@FindBy(id="Covg_75")//Check Box
	WebElement newpurchasediscount;

	@FindBy(id="Covg_22")//Check Box
	WebElement securedsubdivision;

	@FindBy(id="Covg_37E")//Check Box
	WebElement umbrelladiscount;
	
	@FindBy(id="Covg_11L")//Check Box
	WebElement wildlifeareabuildcode;

	@FindBy(id="Covg_25")//Check Box
	WebElement woodburningstove;
	
	@FindBy(id="Covg_32B")//Drop Down
	WebElement acvlosssettlement;

	@FindBy(id="Covg_20B")//Drop Down
	WebElement burglarprotection;
	
	@FindBy(id="Covg_29E")//Drop Down
	WebElement renteroccupied;
	
	@FindBy(id="Covg_37B")//Drop Down
	WebElement floorAboveUnit;

	@FindBy(id="Covg_12")//Drop Down
	WebElement doanyresidentssmoke;

	@FindBy(id="Covg_20A")//Drop Down
	WebElement fireprotection;

	@FindBy(id="Covg_29")//Drop Down
	WebElement occupancy;

	@FindBy(id="Covg_24I")//Drop Down
	WebElement paidinfulldiscount;

	@FindBy(id="Covg_13C")//Drop Down
	WebElement waterleakprotection;

	@FindBy(id="Covg_15J")//Drop Down
	WebElement homeupdatediscount;

	@FindBy(id="Form_PLDwelling_LatestPremitDate")//Text Box
	WebElement latestpermitdate;
	
	@FindBy(id="Covg_32C")//Text Box
	WebElement matchingundamagedsidingroofing;
	
	@FindBy(id="Covg_37D")//Drop Down
	WebElement ppd37D;
	
	@FindBy(id="Covg_37K")//Drop Down
	WebElement ppd37K;
	
	@FindBy(id="Covg_37")//Drop Down
	WebElement cp37;

	@FindBy(id="Covg_44N")//Drop Down
	WebElement allotherperilsdeductible;

	@FindBy(id="Covg_44H")//Drop Down
	WebElement windhaildeductible;

	@FindBy(id="Covg_20E")//Drop Down
	WebElement eqcoverage;

	@FindBy(id="Covg_44D")//Drop Down
	WebElement eqdeductible;

	@FindBy(id="Covg_31")//Check Box
	WebElement openfoundation;

	@FindBy(id="Covg_31B")//Check Box
	WebElement limitedfoundationandslabbuyback;

	@FindBy(id="Covg_31C")//Drop Down
	WebElement eqfoundationtype;
	
	@FindBy(id="Covg_61C")//Check Box
	WebElement eqsecuredwaterheater;
	
	@FindBy(id="Covg_04K")//Drop Down
	WebElement eqpersonalproperty;
	
	@FindBy(id="Covg_05L")//Drop Down
	WebElement eqlossofuse;
	
	@FindBy(id="Covg_07L")//Drop Down
	WebElement eqol;
	
	@FindBy(id="Covg_61E")//Drop Down
	WebElement eqhazardreduction;
	
	@FindBy(id="Covg_44M")//Drop Down
	WebElement eqcontents;
	
	@FindBy(id="Covg_76B")//Check Box
	WebElement eqmasonaryveneerexterior;
	
	@FindBy(id="Covg_42B")//Drop Down
	WebElement eqbreakables;
	
	@FindBy(id="Covg_66A")//Drop Down
	WebElement preexistingeqdmg;
	
	@FindBy(id="Covg_66B")//Drop Down
	WebElement dwellingsecured;
	
	@FindBy(id="Covg_66C")//Drop Down
	WebElement dwellinghavecripplewalls;
	
	@FindBy(id="Covg_66D")//Drop Down
	WebElement cripplewallsbraced;
	
	@FindBy(id="Covg_66E")//Drop Down
	WebElement waterheatersecured;
	
	@FindBy(id="Covg_66F")//Drop Down
	WebElement dwellinghavepost;
	
	@FindBy(id="Covg_66G")//Drop Down
	WebElement postfoundationmodified;
	
	@FindBy(id="Covg_66H")//Drop Down
	WebElement chimneys;
	
	@FindBy(id="Covg_49D")//Drop Down
	WebElement inservants;
	
	@FindBy(id="Covg_49G")//Drop Down
	WebElement occasional;
	
	@FindBy(id="Covg_49F")//Drop Down
	WebElement outservants;
	
	@FindBy(id="Covg_34")//Check Box
	WebElement nshl;
	
	@FindBy(id="Covg_33C")//Check Box
	WebElement homeshieldpackage;
	
	@FindBy(id="Covg_33D")//Check Box
	WebElement homeshieldpluspackage;
	
	@FindBy(id="Covg_33E")//Check Box
	WebElement platinumpackage;
	
	@FindBy(id="Covg_13A")//Check Box
	WebElement limitedwaterdamagecov;

	@FindBy(id="Covg_48")//Check Box
	WebElement personalinjurycoverage;

	@FindBy(id="Covg_09")//Check Box
	WebElement personalpropreplmntcost;

	@FindBy(id="Covg_40")//Check Box
	WebElement specialpersonalpropertycoverage;

	@FindBy(id="Covg_35B")//Check Box
	WebElement sinkhole;
	
	@FindBy(id="Covg_47")//Field
	WebElement homecomputercoverage;

	@FindBy(id="Covg_26A")//Drop Down
	WebElement animalliability;

	@FindBy(id="Covg_60")//Drop Down
	WebElement golfcart;

	@FindBy(id="Covg_70")//Drop Down
	WebElement increasejewelrywatchesandfurs;

	@FindBy(id="Covg_10A")//Drop Down
	WebElement increasedreplcostondwelling;

	@FindBy(id="Covg_46")//Drop Down
	WebElement lossassessment;

	@FindBy(id="Covg_35")//Drop Down
	WebElement moldbuyback;
	
	@FindBy(id= "Covg_35D")// Drop Down
	WebElement minesubsidencecoveragea;
	
	@FindBy(id= "Covg_35G")// Drop Down
	WebElement minesubsidencecoverageamandatory;
	
	@FindBy(id="Covg_35N")// Check Box
	WebElement minesubsidencecoverageb;
	
	@FindBy(id="Covg_07")//Drop Down
	WebElement ol;

	@FindBy(id="Covg_61A")//Drop Down
	WebElement waterbackupbasement;
	
	@FindBy(id="Covg_61")//Drop Down
	WebElement waterbackup;
	
	@FindBy(id="Covg_PLScheduled_70A")//Drop Down	
	WebElement qtyantiques;

	@FindBy(id="Covg_70A")//Text Box	
	WebElement antiques;

	@FindBy(id="Covg_PLScheduled_70B")//Drop Down	
	WebElement qtybicycles;

	@FindBy(id="Covg_70B")//Text Box	
	WebElement bicycles;

	@FindBy(id="Covg_PLScheduled_70C")//Drop Down	
	WebElement qtycamerasandprojectionequip;

	@FindBy(id="Covg_70C")//Text Box	
	WebElement camerasandprojectionequip;

	@FindBy(id="Covg_PLScheduled_70D")//Drop Down	
	WebElement qtycoins;

	@FindBy(id="Covg_70D")//Text Box	
	WebElement coins;

	@FindBy(id="Covg_PLScheduled_70E")//Drop Down	
	WebElement qtyfineartsbreakage;

	@FindBy(id="Covg_70E")//Text Box	
	WebElement fineartsbreakage;

	@FindBy(id="Covg_PLScheduled_70F")//Drop Down	
	WebElement qtyfineartsnobreakage;

	@FindBy(id="Covg_70F")//Text Box	
	WebElement fineartsnobreakage;

	@FindBy(id="Covg_PLScheduled_70G")//Drop Down	
	WebElement qtyfurs;

	@FindBy(id="Covg_70G")//Text Box	
	WebElement furs;

	@FindBy(id="Covg_PLScheduled_70H")//Drop Down	
	WebElement qtygolfersequipment;

	@FindBy(id="Covg_70H")//Text Box	
	WebElement golfersequipment;

	@FindBy(id="Covg_PLScheduled_70I")//Drop Down	
	WebElement qtygunscollectible;

	@FindBy(id="Covg_70I")//Text Box	
	WebElement gunscollectible;

	@FindBy(id="Covg_PLScheduled_70J")//Drop Down	
	WebElement qtygunsfired;

	@FindBy(id="Covg_70J")//Text Box	
	WebElement gunsfired;

	@FindBy(id="Covg_PLScheduled_70K")//Drop Down	
	WebElement qtyjewelry;

	@FindBy(id="Covg_70K")//Text Box	
	WebElement jewelry;

	@FindBy(id="Covg_PLScheduled_70L")//Drop Down	
	WebElement qtymiscpersonalproperty;

	@FindBy(id="Covg_70L")//Text Box	
	WebElement miscpersonalproperty;

	@FindBy(id="Covg_PLScheduled_70M")//Drop Down	
	WebElement qtymusicalinstruments;

	@FindBy(id="Covg_70M")//Text Box	
	WebElement musicalinstruments;

	@FindBy(id="Covg_PLScheduled_70N")//Drop Down	
	WebElement qtyothersportsequip;

	@FindBy(id="Covg_70N")//Text Box	
	WebElement othersportsequip;

	@FindBy(id="Covg_PLScheduled_70Q")//Drop Down	
	WebElement qtysilverware;

	@FindBy(id="Covg_70Q")//Text Box	
	WebElement silverware;

	@FindBy(id="Covg_PLScheduled_70P")//Drop Down	
	WebElement qtystamps;

	@FindBy(id="Covg_70P")//Text Box	
	WebElement stamps;
	
	@FindBy(id="tblErrorMessages")//Text
	WebElement edits;
	
	@FindBy(id="btnBack")//Button
	WebElement back;

	@FindBy(id="btnNext")//Button
	WebElement next;

	@FindBy(id="btnSave")//Button
	WebElement save;

	@FindBy(id="btnOverride")//Button
	WebElement override;
	
	@FindBy(id="lblPolicyID")//Text
	WebElement policyid;
	
	//Constructor
	public PolicyRatingPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;		
	}	
	
	//Selects "Marital Status" drop down 
	public void SelectMaritalStatus(String SelectMaritalStatus) {
		switch(SelectMaritalStatus.toUpperCase()) {
			case "S": case "SINGLE":	new Select(maritalstatus).selectByVisibleText("Single");
											Log("Entered Marital Status: Single");
										break;
										
			case "M": case "MARRIED":	new Select(maritalstatus).selectByVisibleText("Married");
											Log("Entered Marital Status: Married");
										break;
		}
	}
	
	//Returns the value in the "Marital Status" drop down
	public String ReturnMaritalStatus() {
		if(new Select(maritalstatus).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(maritalstatus).getFirstSelectedOption().getText();	
		}
	}

	//Selects "Number Of Children In Household" drop down 
	public void SelectNumberOfChildrenInHousehold(String SelectNumberOfChildrenInHousehold) {
		switch(SelectNumberOfChildrenInHousehold.toUpperCase()) {
			case "9": case "9 OR MORE":	new Select(numberofchildreninhousehold).selectByVisibleText("9 or more");
											Log("Entered Number Of Children In Household: 9 or more");
										break;
								
			default:					new Select(numberofchildreninhousehold).selectByVisibleText(SelectNumberOfChildrenInHousehold);
											Log("Entered Number Of Children In Household: " + SelectNumberOfChildrenInHousehold);
										break;					
		}
	}
	
	//Returns the value in the "Number Of Children In Household" drop down
	public String ReturnNumberOfChildrenInHousehold() {
		if(new Select(numberofchildreninhousehold).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(numberofchildreninhousehold).getFirstSelectedOption().getText();	
		}
	}

	//Selects "Prior Liability Limit" drop down 
	public void SelectPriorLiabilityLimit(String SelectPriorLiabilityLimit) {
		switch(SelectPriorLiabilityLimit.toUpperCase()) {
			case "300": case "$300,000": case "300000": case "$300000": case "300,000":	new Select(priorliabilitylimit).selectByVisibleText("$300,000");
																							Log("Entered Prior Liability Limit: $300,000");
																						break;
		
			case "<300": case "LESS THAN $300,000":										new Select(priorliabilitylimit).selectByVisibleText("Less than $300,000");
																							Log("Entered Prior Liability Limit: Less than $300,000");
																						break;
														
			case ">300": case "GREATER THAN $300,000":									new Select(priorliabilitylimit).selectByVisibleText("Greater than $300,000");
																							Log("Entered Prior Liability Limit: Greater than $300,000");
																						break;
		
			case "LP": case "LAPSE IN COVERAGE":										new Select(priorliabilitylimit).selectByVisibleText("Lapse in Coverage");
																							Log("Entered Prior Liability Limit: Lapse in Coverage");
																						break;
										
			case "NP": case "NO PRIOR LIABILITY LIMIT":									new Select(priorliabilitylimit).selectByVisibleText("No Prior Liability Limit");
																							Log("Entered Prior Liability Limit: No Prior Liability Limit");
																						break;
		
			case "NA": case "FIRST TIME HOME BUYER":									new Select(priorliabilitylimit).selectByVisibleText("First Time Home Buyer");
																							Log("Entered Prior Liability Limit: First Time Home Buyer");
																						break;
		}
	}
	
	//Returns the value in the "Prior Liability Limit" field
	public String ReturnPriorLiabilityLimit() {
		if(new Select(priorliabilitylimit).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(priorliabilitylimit).getFirstSelectedOption().getText();	
		}
	}

	//Selects "Reported Claims drop down 
	public void SelectReportClaims(String SelectReportClaims) {
		switch (SelectReportClaims.toUpperCase()) {		
			case "0": case "0 CLAIMS":						driver.findElement(By.xpath("//select[@id='Covg_47A']//option[contains(text(),'0')]")).click();
															break;
		
			case "1": case "1 CLAIM":						driver.findElement(By.xpath("//select[@id='Covg_47A']//option[contains(text(),'1')]")).click();
															break;
			
			case "2": case "2 OR MORE": case "2 CLAIMS":	driver.findElement(By.xpath("//select[@id='Covg_47A']//option[contains(text(),'2')]")).click();
															break;
										
			case "3": case "3 CLAIMS":						driver.findElement(By.xpath("//select[@id='Covg_47A']//option[contains(text(),'3')]")).click();
															break;
		
			case "4": case "4 CLAIMS":						driver.findElement(By.xpath("//select[@id='Covg_47A']//option[contains(text(),'4')]")).click();
															break;
		
			case "5": case "5 CLAIMS":						driver.findElement(By.xpath("//select[@id='Covg_47A']//option[contains(text(),'5')]")).click();
															break;
		}
			Log("Entered Reported Claims: " + new Select(reportedclaims).getFirstSelectedOption().getText());
	}
	
	//Returns the value in the "Reported Claims" drop down
	public String ReturnReportedClaims() {
		if(new Select(reportedclaims).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(reportedclaims).getFirstSelectedOption().getText();	
		}
	}

	//Selects "Other Structures" drop down 
	public void SelectOtherStructures(String SelectOtherStructures) {
		if(!SelectOtherStructures.toUpperCase().equals("N/A")) {
			switch(SelectOtherStructures.toUpperCase()) {
				case "0.02": case "2% COV A (INCLUDED)": case "2": case "2%":	new Select(otherstructures).selectByVisibleText("2% Cov A (Included)");
																					Log("Entered Other Structures: 2% Cov A (Included)");
																				break;
			
				case "0.1": case "10% COV A": case "10": case "10%":			new Select(otherstructures).selectByVisibleText("10% Cov A");
																					Log("Entered Other Structures: 10% Cov A");
																				break;
															
				case "0.2": case "20% COV A": case "20": case "20%":			new Select(otherstructures).selectByVisibleText("20% Cov A");
																					Log("Entered Other Structures: 20% Cov A");
																				break;
			
				case "0.3": case "30% COV A": case "30": case "30%":			new Select(otherstructures).selectByVisibleText("30% Cov A");
																					Log("Entered Other Structures: 30% Cov A");
																				break;
			
				case "0.4": case "40% COV A": case "40": case "40%":			new Select(otherstructures).selectByVisibleText("40% Cov A");
																					Log("Entered Other Structures: 40% Cov A");
																				break;
			
				case "0.5": case "50% COV A": case "50": case "50%":			new Select(otherstructures).selectByVisibleText("50% Cov A");
																					Log("Entered Other Structures: 50% Cov A");
																				break;
			}
		}
	}
	
	//Returns the value in the "Other Structures" drop down
	public String ReturnOtherStructures() {
		if(new Select(otherstructures).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(otherstructures).getFirstSelectedOption().getText();	
		}
	}

	//Selects "Personal Property" drop down 
	public void SelectPersonalProperty(String SelectPersonalProperty) {
		if(!SelectPersonalProperty.toUpperCase().equals("N/A")) {
			switch(SelectPersonalProperty.toUpperCase()) {
				case "0.5": case "50% COV A (INCLUDED)": case "50": case "50%":	new Select(personalproperty).selectByVisibleText("50% Cov A (Included)");
																					Log("Entered Personal Property: 50% Cov A (Included)");
																				break;
			
				case "0": case "0% COV A": case "0%":							new Select(personalproperty).selectByVisibleText("0% Cov A");
																					Log("Entered Personal Property: 0% Cov A");
																				break;
															
				case "0.25": case "25% COV A": case "25": case "25%":			new Select(personalproperty).selectByVisibleText("25% Cov A");
																					Log("Entered Personal Property: 25% Cov A");
																				break;
														
				case "0.7": case "70% COV A": case "70": case "70%":			new Select(personalproperty).selectByVisibleText("70% Cov A");
																					Log("Entered Personal Property: 70% Cov A");
																				break;
			}
		}
	}
	
	//Returns the value in the "Personal Property" drop down
	public String ReturnPersonalProperty() {
		if(new Select(personalproperty).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(personalproperty).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Loss Of Use" drop down 
	public void SelectLossOfUse(String SelectLossOfUse) {
		if(!SelectLossOfUse.toUpperCase().equals("N/A")) {
			switch(SelectLossOfUse.toUpperCase()) {
				case "0.1": case "10% COV A": case "10": case "10%":	new Select(lossofuse).selectByVisibleText("10% Cov A");
																			Log("Entered Loss Of Use: 10% Cov A");
																		break;
			
				case "0.2": case "20% COV A": case "20": case "20%":	new Select(lossofuse).selectByVisibleText("20% Cov A");
																			Log("Entered Loss Of Use: 20% Cov A");
																		break;
												
				case "0.3": case "30% COV A": case "30": case "30%":	new Select(lossofuse).selectByVisibleText("30% Cov A");
																			Log("Entered Loss Of Use: 30% Cov A");
																		break;
			}
		}
	}
	
	//Returns the value in the "Loss Of Use" drop down
	public String ReturnLossOfUse() {
		if(new Select(lossofuse).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(lossofuse).getFirstSelectedOption().getText();	
		}
	}

	//Selects "Liability" drop down 
	public void SelectLiability(String SelectLiability) {
		if(!SelectLiability.toUpperCase().equals("N/A")) {
			switch(SelectLiability.toUpperCase()) {
				case "100": case "$100,000": case "100000": case "100,000":	new Select(liability).selectByVisibleText("$100,000");
																				Log("Entered Liability: $100,000");
																			break;
			
				case "300": case "$300,000": case "300000": case "300,000":	new Select(liability).selectByVisibleText("$300,000");
																				Log("Entered Liability: $300,000");
																			break;
															
				case "500": case "$500,000": case "500000": case "500,000":	new Select(liability).selectByVisibleText("$500,000");
																				Log("Entered Liability: $500,000");
																			break;
			}
		}
	}
	
	//Returns the value in the "Liability" field
	public String ReturnLiability() {
		if(new Select(liability).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(liability).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Medical Payments Limit" drop down 
	public void SelectMedicalPaymentsLimit(String SelectMedicalPaymentsLimit) {
		if(!SelectMedicalPaymentsLimit.toUpperCase().equals("N/A")) {
			switch(SelectMedicalPaymentsLimit.toUpperCase()) {
				case "1000": case "$1,000": case "1,000": case "$1000":	new Select(medicalpaymentslimit).selectByVisibleText("$1,000");
																			Log("Entered Medical Payments Limit: $1,000");
																		break;
			
				case "2500": case "$2,500": case "2,500": case "$2500":	new Select(medicalpaymentslimit).selectByVisibleText("$2,500");
																			Log("Entered Medical Payments Limit: $2,500");
																		break;
															
				case "5000": case "$5,000": case "5,000": case "$5000":	new Select(medicalpaymentslimit).selectByVisibleText("$5,000");
																			Log("Entered Medical Payments Limit: $5,000");
																		break;
			}
		}
	}
	
	//Returns the value in the "Medical Payments Limit" drop down
	public String ReturnMedicalPaymentsLimit() {
		if(new Select(medicalpaymentslimit).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(medicalpaymentslimit).getFirstSelectedOption().getText();	
		}
	}

	//Checks "Accredited Builder" check box 
	public void CheckAccreditedBuilder(String CheckAccreditedBuilder) {
		if(!CheckAccreditedBuilder.toUpperCase().equals("N/A")) {
			if(accreditedbuilder.isSelected()) {
				switch(CheckAccreditedBuilder.toUpperCase()) {
					case "Y": case "YES":		Log("\"Accredited Builder\" check box marked");
											break;
											
					case "N": case "NO":	accreditedbuilder.click();
												Log("\"Accredited Builder\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckAccreditedBuilder.toUpperCase()) {
					case "Y": case "YES":	accreditedbuilder.click();
												Log("\"Accredited Builder\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Accredited Builder\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Returns whether "Accredited Builder" check box is populated
	public String ReturnAccreditedBuilder() {
		if(accreditedbuilder.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}

	//Checks "Building Code" check box 
	public void CheckBuildingCode(String CheckBuildingCode) {
		if(!CheckBuildingCode.toUpperCase().equals("N/A")) {
			if(buildingcode.isSelected()) {
				switch(CheckBuildingCode.toUpperCase()) {
					case "Y": case "YES":		Log("\"Building Code\" check box marked");
											break;
											
					case "N": case "NO":	buildingcode.click();
												Log("\"Building Code\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckBuildingCode.toUpperCase()) {
					case "Y": case "YES":	buildingcode.click();
												Log("\"Building Code\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Building Code\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Returns whether "Building Code" check box is populated
	public String ReturnBuildingCode() {
		if(buildingcode.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}

	//Checks "Window and Other Opening Protection" check box 
	public void CheckWindowandOtherOpeningProtection(String CheckWindowandOtherOpeningProtection) {
		if(!CheckWindowandOtherOpeningProtection.toUpperCase().equals("N/A")) {
			if(buildingcode.isSelected()) {
				switch(CheckWindowandOtherOpeningProtection.toUpperCase()) {
					case "Y": case "YES":		Log("\"Window and Other Opening Protection\" check box marked");
											break;
											
					case "N": case "NO":	windowandotheropeningprotection.click();
												Log("\"Window and Other Opening Protection\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckWindowandOtherOpeningProtection.toUpperCase()) {
					case "Y": case "YES":	windowandotheropeningprotection.click();
												Log("\"Window and Other Opening Protection\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Window and Other Opening Protection\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Returns whether "Window and Other Opening Protection" check box is populated
	public String ReturnWindowandOtherOpeningProtection() {
		if(windowandotheropeningprotection.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}


	//Checks "Earthquake Insurance" check box 
	public void CheckEarthquakeInsurance(String CheckEarthquakeInsurance) {
		if(!CheckEarthquakeInsurance.toUpperCase().equals("N/A")) {
			if(earthquakeinsurance.isSelected()) {
				switch(CheckEarthquakeInsurance.toUpperCase()) {
					case "Y": case "YES":		Log("\"Earthquake Insurance\" check box marked");
											break;
											
					case "N": case "NO":	earthquakeinsurance.click();
												Log("\"Earthquake Insurance\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckEarthquakeInsurance.toUpperCase()) {
					case "Y": case "YES":	earthquakeinsurance.click();
												Log("\"Earthquake Insurance\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Earthquake Insurance\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Returns whether "Earthquake Insurance" check box is populated
	public String ReturnEarthquakeInsurance() {
		if(earthquakeinsurance.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}

	//Checks "E-Policy Paperless" check box 
	public void CheckEPolicyPaperless(String CheckEPolicyPaperless) {
		if(!CheckEPolicyPaperless.toUpperCase().equals("N/A")) {
			if(epolicypaperless.isSelected()) {
				switch(CheckEPolicyPaperless.toUpperCase()) {
					case "Y": case "YES":		Log("\"E-Policy Paperless\" check box marked");
											break;
											
					case "N": case "NO":	epolicypaperless.click();
												Log("\"E-Policy Paperless\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckEPolicyPaperless.toUpperCase()) {
					case "Y": case "YES":	epolicypaperless.click();
												Log("\"E-Policy Paperless\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"E-Policy Paperless\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Returns whether "E-Policy Paperless" check box is populated
	public String ReturnEPolicyPaperless() {
		if(epolicypaperless.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}

	//Checks "E-Signature" check box 
	public void CheckESignature(String CheckESignature) {
		if(!CheckESignature.toUpperCase().equals("N/A")) {
			if(esignature.isSelected()) {
				switch(CheckESignature.toUpperCase()) {
					case "Y": case "YES":		Log("\"E-Signature\" check box marked");
											break;
											
					case "N": case "NO":	esignature.click();
												Log("\"E-Signature\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckESignature.toUpperCase()) {
					case "Y": case "YES":	esignature.click();
												Log("\"E-Signature\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"E-Signature\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Returns whether "E-Signature" check box is populated
	public String ReturnESignature() {
		if(esignature.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}
	
	//Checks "New Purchase Discount" check box 
	public void CheckNewPurchaseDiscount(String CheckNewPurchaseDiscount) {
		if(!CheckNewPurchaseDiscount.toUpperCase().equals("N/A")) {
			if(newpurchasediscount.isSelected()) {
				switch(CheckNewPurchaseDiscount.toUpperCase()) {
					case "Y": case "YES": case "1":		Log("\"New Purchase Discount\" check box marked");
													break;
											
					case "N": case "NO":			newpurchasediscount.click();
														Log("\"New Purchase Discount\" check box NOT marked");
													break;
				}
			}
			else {
				switch(CheckNewPurchaseDiscount.toUpperCase()) {
					case "Y": case "YES": case "1":	newpurchasediscount.click();
														Log("\"New Purchase Discount\" check box marked");
													break;
											
					case "N": case "NO":				Log("\"New Purchase Discount\" check box NOT marked");
													break;
				}
			}
		}
	}
	
	//Returns whether "New Purchase Discount" check box is populated
	public String ReturnNewPurchaseDiscount() {
		if(newpurchasediscount.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}

	//Checks "Secured Subdivision" check box 
	public void CheckSecuredSubdivision(String CheckSecuredSubdivision) {
		if(!CheckSecuredSubdivision.toUpperCase().equals("N/A")) {
			if(securedsubdivision.isSelected()) {
				switch(CheckSecuredSubdivision.toUpperCase()) {
					case "Y": case "YES":		Log("\"Secured Subdivision\" check box marked");
											break;
											
					case "N": case "NO":	securedsubdivision.click();
												Log("\"Secured Subdivision\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckSecuredSubdivision.toUpperCase()) {
					case "Y": case "YES":	securedsubdivision.click();
												Log("\"Secured Subdivision\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Secured Subdivision\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Returns whether "Secured Subdivision" check box is populated
	public String ReturnSecuredSubdivision() {
		if(securedsubdivision.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}

	//Checks "Umbrella Discount" check box 
	public void CheckUmbrellaDiscount(String CheckUmbrellaDiscount) {
		if(!CheckUmbrellaDiscount.toUpperCase().equals("N/A")) {
			if(umbrelladiscount.isSelected()) {
				switch(CheckUmbrellaDiscount.toUpperCase()) {
					case "Y": case "YES":		Log("\"Umbrella Discount\" check box marked");
											break;
											
					case "N": case "NO":	umbrelladiscount.click();
												Log("\"Umbrella Discount\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckUmbrellaDiscount.toUpperCase()) {
					case "Y": case "YES":	umbrelladiscount.click();
												Log("\"Umbrella Discount\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Umbrella Discount\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Returns whether "Umbrella Discount" check box is populated
	public String ReturnUmbrellaDiscount() {
		if(umbrelladiscount.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}
	
	//Checks "Wildfire Area Building Code" check box 
	public void CheckWildfireAreaBuildingCode(String CheckWildfireAreaBuildingCode) {
		if(!CheckWildfireAreaBuildingCode.toUpperCase().equals("N/A")) {
			if(wildlifeareabuildcode.isSelected()) {
				switch(CheckWildfireAreaBuildingCode.toUpperCase()) {
					case "Y": case "YES":		Log("\"Wildfire Area Building Code\" check box marked");
											break;
											
					case "N": case "NO":	wildlifeareabuildcode.click();
												Log("\"Wildfire Area Building Code\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckWildfireAreaBuildingCode.toUpperCase()) {
					case "Y": case "YES":	wildlifeareabuildcode.click();
												Log("\"Wildfire Area Building Code\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Wildfire Area Building Code\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Returns whether "Wildfire Area Building Code" check box is populated
	public String ReturnWildfireAreaBuildingCode() {
		if(wildlifeareabuildcode.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}
	
	//Checks "Wood Burning Stove" check box 
	public void CheckWoodBurningStove(String CheckWoodBurningStove) {
		if(!CheckWoodBurningStove.toUpperCase().equals("N/A")) {
			if(woodburningstove.isSelected()) {
				switch(CheckWoodBurningStove.toUpperCase()) {
					case "Y": case "YES":		Log("\"Wood Burning Stove\" check box marked");
											break;
											
					case "N": case "NO":	woodburningstove.click();
												Log("\"Wood Burning Stove\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckWoodBurningStove.toUpperCase()) {
					case "Y": case "YES":	woodburningstove.click();
												Log("\"Wood Burning Stove\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Wood Burning Stove\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Returns whether "Wood Burning Stove" check box is populated
	public String ReturnWoodBurningStove() {
		if(woodburningstove.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}
	
	//Selects "ACV Loss Settlement-Wind/Hail Losses to Roof" drop down 
	public void SelectACVLossSettlement(String SelectACVLossSettlement) {
		switch(SelectACVLossSettlement.toUpperCase()) {
			case "RC": case "REPLACEMENT COST": case "N": case "NO":	driver.findElement(By.xpath("//select[@id='Covg_32B']//option[contains(text(),'Replacement Cost')]")).click();
																		break;
		
			case "ACV": case "ACTUAL CASH VALUE": case "Y": case "YES":	driver.findElement(By.xpath("//select[@id='Covg_32B']//option[contains(text(),'ACV')]")).click();
																		break;
		}
			Log("Entered ACV Loss Settlement-Wind/Hail Losses to Roof: " + new Select(acvlosssettlement).getFirstSelectedOption().getText());
	}
	
	//Returns whether "ACV Loss Settlement" drop down is populated
	public String ReturnACVLossSettlement() {
		if(new Select(acvlosssettlement).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			if(new Select(acvlosssettlement).getFirstSelectedOption().getText().contains("Replacement Cost")) {
				return "Replacement Cost";
			}
			else {
				return "ACV";
			}
		}
	}
	
	//Selects "Burglar Protection" drop down 
	public void SelectBurglarProtection(String SelectBurglarProtection) {
		if(!SelectBurglarProtection.toUpperCase().equals("N/A")) {
			switch(SelectBurglarProtection.toUpperCase()) {
				case "0":  case "NONE": case "N":								Log("Entered Burglar Protection: None");
																			break;
			
				case "1": case "LOCAL BURGLAR ALARM":						new Select(burglarprotection).selectByVisibleText("Local Burglar Alarm");
																				Log("Entered Burglar Protection: Local Burglar Alarm");
																			break;
															
				case "2": case "REP TO CENTRAL STATION":					new Select(burglarprotection).selectByVisibleText("Rep to Central Station");
																				Log("Entered Burglar Protection: Rep to Central Station");
																			break;
												
				case "3": case "REP TO CENTRAL STATION WITH DATA SHARING":	new Select(burglarprotection).selectByVisibleText("Rep to Central Station with data-sharing");
																				Log("Entered Burglar Protection: Rep to Central Station with data-sharing");
																			break;
		
				case "4": case "MOTION DETECTING CAMERA":					new Select(burglarprotection).selectByVisibleText("Motion Detecting Camera");
																				Log("Entered Burglar Protection: Motion Detecting Camera");
																			break;
								
				case "5": case "MOTION DETECTING CAMERA WITH DATA SHARING":	new Select(burglarprotection).selectByVisibleText("Motion Detecting Camera with data-sharing");
																				Log("Entered Burglar Protection: Motion Detecting Camera with data-sharing");
																			break;
												
				case "6": case "SMART BURGLAR ALARM":						new Select(burglarprotection).selectByVisibleText("Smart Burglar Alarm");
																				Log("Entered Burglar Protection: Smart Burglar Alarm");
																			break;
	
				case "7": case "SMART BURGLAR ALARM WITH DATA SHARING":		new Select(burglarprotection).selectByVisibleText("Smart Burglar Alarm with data-sharing");
																				Log("Entered Burglar Protection: Smart Burglar Alarm with data-sharing");
																			break;
			}
		}
	}
	
	//Returns whether "Burglar Protection" drop down is populated
	public String ReturnBurglarProtection() {
		if(new Select(burglarprotection).getFirstSelectedOption().getText().isEmpty()) {
			return "N";
		}
		else {
			return new Select(burglarprotection).getFirstSelectedOption().getText().replaceAll("-", " ");	
		}
	}
	
	//Selects "Do Any Residents Smoke" drop down 
	public void SelectDoAnyResidentsSmoke(String SelectDoAnyResidentsSmoke) {
		switch(SelectDoAnyResidentsSmoke.toUpperCase()) {
			case "Y": case "YES":	new Select(doanyresidentssmoke).selectByVisibleText("Yes");
										Log("Entered Do Any Residents Smoke: Yes");
									break;
		
			case "N": case "NO":	new Select(doanyresidentssmoke).selectByVisibleText("No");
										Log("Entered Do Any Residents Smoke: No");
									break;
		}
	}
	
	//Returns whether "Do Any Residents Smoke" drop down is populated
	public String ReturnDoAnyResidentsSmoke() {
		if(new Select(doanyresidentssmoke).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(doanyresidentssmoke).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Renter Occupied" drop down 
	public void SelectRenterOcupied(String SelectRenterOcc) {
		if(!SelectRenterOcc.toUpperCase().equals("N/A")) {
			switch(SelectRenterOcc.toUpperCase()) {
				case "0":  case "NONE": case "N":	new Select(renteroccupied).selectByVisibleText("No");
														Log("Entered Renter Occupied: None");
													break;
													
				case "1": case "ANNUAL CONTRACT":	new Select(renteroccupied).selectByVisibleText("Annual Contract");
														Log("Entered Renter Occupied: Annual Contract");
													break;
																			
				case "2": case "SHORT TERM":		new Select(renteroccupied).selectByVisibleText("Short Term");
														Log("Entered Renter Occupied: Short Term");
													break;
				}
			}
		}
	
	//Returns whether "Renter Occupied" drop down is populated
	public String ReturnRenterOcupied() {
		if(new Select(renteroccupied).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(renteroccupied).getFirstSelectedOption().getText();	
		}
	}
		
	//Selects "Floor Above Unit" drop down 
	public void SelectFloorAboveUnit(String SelectFloorAboveUnit) {
		if(!SelectFloorAboveUnit.toUpperCase().equals("N/A")) {
			switch(SelectFloorAboveUnit.toUpperCase()) {
				case "0":  case "NONE": case "N" : case "NO FLOORS" :	new Select(floorAboveUnit).selectByVisibleText("No Floors Above");
																			Log("Entered Floor Above Unit: No Floors Above");
																		break;

				case "1": case "1 FLOOR":								new Select(floorAboveUnit).selectByVisibleText("1 Floor");
																			Log("Entered Floor Above Unit: 1 Floor");
																		break;
																						
				case "2": case "2 FLOORS":								new Select(floorAboveUnit).selectByVisibleText("2 Floor");
																			Log("Entered Floor Above Unit: 2 Floor");
																		break;
																					
				case "3": case "3 FLOORS": case "3 OR MORE FLOORS":		new Select(floorAboveUnit).selectByVisibleText("3 or more Floors");
																			Log("Entered Floor Above Unit: 3 or more Floors");
																		break;
					}
				}
			}
			
	//Returns whether "Floor Above Unit" drop down is populated
	public String ReturnFloorAboveUnit() {
		if(new Select(floorAboveUnit).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(floorAboveUnit).getFirstSelectedOption().getText();	
		}
	}

	//Selects "Fire Protection" drop down 
	public void SelectFireProtection(String SelectFireProtection) {
		if(!SelectFireProtection.toUpperCase().equals("N/A")) {
			switch(SelectFireProtection.toUpperCase()) {
				case "N": case "NO": case "NONE":								Log("Entered Fire Protection: None");
																			break;
																			
				case "0": case "SMOKE ALARM":								new Select(fireprotection).selectByVisibleText("Smoke Alarm");
																				Log("Entered Fire Protection: Smoke Alarm");
																			break;
															
				case "1": case "REP TO CENTRAL STATION":					new Select(fireprotection).selectByVisibleText("Rep to Central Station");
																				Log("Entered Fire Protection: Rep to Central Station");
																			break;
												
				case "2": case "SPRINKLER SYSTEM":							new Select(fireprotection).selectByVisibleText("Sprinkler System");
																				Log("Entered Fire Protection: Sprinkler System");
																			break;
		
				case "3": case "REP TO CENTRAL STATION WITH DATA SHARING":	new Select(fireprotection).selectByVisibleText("Rep to Central Station with data-sharing");
																				Log("Entered Fire Protection: Rep to Central Station with data-sharing");
																			break;
								
				case "4": case "SMART SMOKE DETECTOR":						new Select(fireprotection).selectByVisibleText("Smart Smoke Detector");
																				Log("Entered Fire Protection: Smart Smoke Detector");
																			break;
												
				case "5": case "SMART SMOKE DETECTOR WITH DATA SHARING":	new Select(fireprotection).selectByVisibleText("Smart Smoke Detector with data-sharing");
																				Log("Entered Fire Protection: Smart Smoke Detector with data-sharing");
																			break;
			}
		}
	}
	
	//Returns whether "Fire Protection" drop down is populated
	public String ReturnFireProtection() {
		if(new Select(fireprotection).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(fireprotection).getFirstSelectedOption().getText().replaceAll("-", " ");	
		}
	}

	//Selects "Occupancy" drop down 
	public void SelectOccupancy(String SelectOccupancy) {
		switch(SelectOccupancy.toUpperCase()) {
			case "P": case "PRIMARY RESIDENCE":				new Select(occupancy).selectByVisibleText("Primary Residence");
																Log("Entered Occupancy: Primary Residence");
															break;
		
			case "S": case "SECONDARY/SEASONAL RESIDENCE":	new Select(occupancy).selectByVisibleText("Secondary/Seasonal Residence");
																Log("Entered Occupancy: Secondary/Seasonal Residence");
															break;
															
			case "9 MONTHS OR MORE": case "9":				new Select(occupancy).selectByVisibleText("9 months or more");
																Log("Entered Months Owner Occupied: 9 months or more");
															break;
															
			case "4 - 8 MONTHS": case "4":					new Select(occupancy).selectByVisibleText("4 - 8 months");
																Log("Entered Months Owner Occupied: 4 - 8 months");
															break;
															
			case "0 - 3 MONTHS": case "0":					new Select(occupancy).selectByVisibleText("0 - 3 months");
																Log("Entered Months Owner Occupied: 0 - 3 months");
															break;
		}
	}	
	
	//Returns whether "Occupancy" drop down is populated
	public String ReturnOccupancy() {
		if(new Select(occupancy).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(occupancy).getFirstSelectedOption().getText();	
		}
	}

	//Selects "Paid In Full Discount" drop down 
	public void SelectPaidInFullDiscount(String SelectPaidInFullDiscount) {
		switch(SelectPaidInFullDiscount.toUpperCase()) {
			case "MB": case "MORTGAGE BILLED":		new Select(paidinfulldiscount).selectByVisibleText("Mortgage Billed");
														Log("Entered Paid In Full Discount: Mortgage Billed");
													break;
		
			case "IPP": case "INSURED PAY PLAN":	new Select(paidinfulldiscount).selectByVisibleText("Insured Pay Plan");
														Log("Entered Paid In Full Discount: Insured Pay Plan");
													break;
						
			case "IFP": case "INSURED FULL PAY":	new Select(paidinfulldiscount).selectByVisibleText("Insured Full Pay");
														Log("Entered Paid In Full Discount: Insured Full Pay");
													break;
		}
	}
	
	//Returns whether "Paid In Full Discount" drop down is populated
	public String ReturnPaidInFullDiscount() {
		if(new Select(paidinfulldiscount).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(paidinfulldiscount).getFirstSelectedOption().getText();	
		}
	}

	//Selects "Water Leak Protection" drop down 
	public void SelectWaterLeakProtection(String SelectWaterLeakProtection) {
		if(!SelectWaterLeakProtection.toUpperCase().equals("N/A")) {
			switch(SelectWaterLeakProtection.toUpperCase()) {
				case "0": case "NONE": case "N":												Log("Entered Water Leak Protection: None");
																							break;
			
				case "1": case "WATER LEAK SENSORS":										new Select(waterleakprotection).selectByVisibleText("Water Leak Sensors");
																								Log("Entered Water Leak Protection: Water Leak Sensors");
																							break;
															
				case "2": case "WATER LEAK SENSORS WITH DATA-SHARING":						new Select(waterleakprotection).selectByVisibleText("Water Leak Sensors with data-sharing");
																								Log("Entered Water Leak Protection: Water Leak Sensors with data-sharing");
																							break;
												
				case "3": case "WATER LEAK SENSORS WITH AUTOMATIC SHUT-OFF":				new Select(waterleakprotection).selectByVisibleText("Water Leak Sensors with automatic shut-off");
																								Log("Entered Water Leak Protection: Water Leak Sensors with automatic shut-off");
																							break;
		
				case "4": case "WATER LEAK SENSORS WITH AUTOMATIC SHUT-OFF & DATA-SHARING":	new Select(waterleakprotection).selectByVisibleText("Water Leak Sensors with automatic shut-off & data-sharing");
																								Log("Entered Water Leak Protection: Water Leak Sensors with automatic shut-off & data-sharing");
																							break;
								
				case "5": case "WATER FLOW MONITOR WITH AUTOMATIC SHUT-OFF":				new Select(waterleakprotection).selectByVisibleText("Water flow Monitor with automatic shut-off");
																								Log("Entered Water Leak Protection: Water flow Monitor with automatic shut-off");
																							break;
																					
				case "6": case "WATER FLOW MONITOR WITH AUTOMATIC SHUT-OFF & DATA-SHARING":	new Select(waterleakprotection).selectByVisibleText("Water Flow Monitor with automatic shut-off & data-sharing");
																								Log("Entered Water Leak Protection: Water Flow Monitor with automatic shut-off & data-sharing");
																							break;
			}
		}
	}	
	
	//Returns whether "Water Leak Protection" drop down is populated
	public String ReturnWaterLeakProtection() {
		if(new Select(waterleakprotection).getFirstSelectedOption().getText().isEmpty()) {
			return "N";
		}
		else {
			return new Select(waterleakprotection).getFirstSelectedOption().getText().replaceAll("-", " ");	
		}
	}


	//Selects "Home Update Discount" drop down 
	public void SelectHomeUpdateDiscount(String SelectHomeUpdateDiscount) {
		if(!SelectHomeUpdateDiscount.toUpperCase().equals("N/A")) {
			switch(SelectHomeUpdateDiscount.toUpperCase()) {
				case "Y": case "YES":	new Select(homeupdatediscount).selectByVisibleText("Yes");
											Log("Entered Home Update Discount: Yes");
										break;
			
				case "N": case "NO":	new Select(homeupdatediscount).selectByVisibleText("No");
											Log("Entered Home Update Discount: No");
										break;
			}
		}
	}
	
	//Returns whether "Home Update Discount" drop down is populated
	public String ReturnHomeUpdateDiscount() {
		if(new Select(homeupdatediscount).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(homeupdatediscount).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Latest Permit Date" text box 
	public void TypeLatestPermitDate(String TypeLatestPermitDate) {
		if(TypeLatestPermitDate.toUpperCase().equals("BLANK")) {
			latestpermitdate.clear();
				Log("Entered Latest Permit Date: Cleared out");
		}
		else if(!TypeLatestPermitDate.toUpperCase().equals("N/A")) {
			latestpermitdate.clear();
			latestpermitdate.sendKeys(TypeLatestPermitDate);
				Log("Entered Latest Permit Date: " + TypeLatestPermitDate);
		}
	}
	
	//Returns the value in the "Latest Permit Date" text box 
	public String ReturnLatestPermitDate() throws ParseException {
		if(latestpermitdate.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return new SimpleDateFormat("MM/dd/yyyy").format(new SimpleDateFormat("MM/dd/yyyy").parse(latestpermitdate.getAttribute("value"))).replaceAll("/", "");	
		}
	}
	
	//Selects "Matching of Undamaged Siding and/or Roofing" from drop down
	public void SelectUndamagedSidingRoofing(String SelectUndamagedSidingRoofing) {
		switch(SelectUndamagedSidingRoofing.toUpperCase()) {
			case "0": case "N": case "NONE": case "NO":				Log("Entered Matching of Undamaged Siding and/or Roofing: None");
																break;
											
			case "0.02": case "2% COV A": case "2": case "2%":	new Select(matchingundamagedsidingroofing).selectByVisibleText("2% Cov A");
																	Log("Entered Matching of Undamaged Siding and/or Roofing: 2% Cov A");
																break;
																						
			case "0.04": case "4% COV A": case "4": case "4%":	new Select(matchingundamagedsidingroofing).selectByVisibleText("4% Cov A");
																	Log("Entered Matching of Undamaged Siding and/or Roofing: 4% Cov A");
																break;
																						
			case "0.06": case "6% COV A": case "6": case "6%":	new Select(matchingundamagedsidingroofing).selectByVisibleText("6% Cov A");
																	Log("Entered Matching of Undamaged Siding and/or Roofing: 6% Cov A");
																break;
		}
	}
		
	//Returns whether "Matching of Undamaged Siding and/or Roofing" drop down is populated
	public String ReturnMatchingofUndamagedSidingRoofing() {
		if(new Select(matchingundamagedsidingroofing).getFirstSelectedOption().getText().isEmpty()) {
			return "N";
		}
		else {
			return new Select(matchingundamagedsidingroofing).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Package Policy Discount" from drop down
	public void SelectPackagePolicyDiscount(String SelectPackagePolicyDiscount) {
		if(driver.getPageSource().contains("Covg_37D")) {
			switch(SelectPackagePolicyDiscount.toUpperCase()) {
				case "N": case "NONE": case "NO":									new Select(ppd37D).selectByVisibleText("None");
																						Log("Entered Package Policy Discount: None");
																					break;
										
				case "A": case "OTHER COMPANY AUTO":								new Select(ppd37D).selectByVisibleText("Other Company Auto");
																						Log("Entered Package Policy Discount: Other Company Auto");
																					break;
																					
				case "C": case "COMPANTION AUTO":									new Select(ppd37D).selectByVisibleText("Companion Auto");
																						Log("Entered Package Policy Discount: Companion Auto");
																					break;
																					
				case "PA": case "PROGRESSIVE AUTO":									new Select(ppd37D).selectByVisibleText("Progressive Auto");
																						Log("Entered Package Policy Discount: Progressive Auto");
																					break;
														
				case "F": case "FLOOD":												new Select(ppd37D).selectByVisibleText("Flood");
																						Log("Entered Package Policy Discount: Flood");
																					break;
														
				case "P": case "PREFERRED":											driver.findElement(By.xpath("//select[@id='Covg_37D']//option[contains(text(),'Preferred Partner')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37D).getFirstSelectedOption().getText());
																					break;
														
				case "P25": case "PP25": case "PROGRESSIVE AUTO LESS THAN 50/100":	driver.findElement(By.xpath("//select[@id='Covg_37D']//option[contains(text(),'ess t')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37D).getFirstSelectedOption().getText());
																					break;
																					
				case "P50": case "PP50": case "PROGRESSIVE AUTO 50/100":			driver.findElement(By.xpath("//select[@id='Covg_37D']//option[contains(text(),'Auto 50/100')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37D).getFirstSelectedOption().getText());
																					break;
																			
				case "P100": case "PP100": case "PROGRESSIVE AUTO 100/300":			driver.findElement(By.xpath("//select[@id='Covg_37D']//option[contains(text(),'100/300')]")).click();
																					Log("Entered Package Policy Discount: " + new Select(ppd37D).getFirstSelectedOption().getText());
																					break;
																					
				case "P250": case "PP250": case "PROGRESSIVE AUTO 250/500":			driver.findElement(By.xpath("//select[@id='Covg_37D']//option[contains(text(),'250/500')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37D).getFirstSelectedOption().getText());
																					break;
																					
				default:																Log("Invalid value for package Policy Discount: " + SelectPackagePolicyDiscount);
																					break;
			}
		}
		else if(driver.getPageSource().contains("Covg_37K")) {
			switch(SelectPackagePolicyDiscount.toUpperCase()) {
				case "N": case "NONE": case "NO":									new Select(ppd37K).selectByVisibleText("None");
																						Log("Entered Package Policy Discount: None");
																					break;
										
				case "A": case "OTHER COMPANY AUTO":								new Select(ppd37K).selectByVisibleText("Other Company Auto");
																						Log("Entered Package Policy Discount: Other Company Auto");
																					break;
																					
				case "C": case "COMPANTION AUTO":									new Select(ppd37K).selectByVisibleText("Companion Auto");
																						Log("Entered Package Policy Discount: Companion Auto");
																					break;
																					
				case "PA": case "PROGRESSIVE AUTO":									new Select(ppd37D).selectByVisibleText("Progressive Auto");
																						Log("Entered Package Policy Discount: Progressive Auto");
																					break;
														
				case "F": case "FLOOD":												new Select(ppd37K).selectByVisibleText("Flood");
																						Log("Entered Package Policy Discount: Flood");
																					break;
														
				case "P": case "PREFERRED PARTNER":									driver.findElement(By.xpath("//select[@id='Covg_37K']//option[contains(text(),'Preferred Partner')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37K).getFirstSelectedOption().getText());
																					break;
														
				case "P25": case "PP25": case "PROGRESSIVE AUTO LESS THAN 50/100":	driver.findElement(By.xpath("//select[@id='Covg_37K']//option[contains(text(),'ess t')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37K).getFirstSelectedOption().getText());
																					break;
																					
				case "P50": case "PP50": case "PROGRESSIVE AUTO 50/100":			driver.findElement(By.xpath("//select[@id='Covg_37K']//option[contains(text(),'Auto 50/100')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37K).getFirstSelectedOption().getText());
																					break;
																			
				case "P100": case "PP100": case "PROGRESSIVE AUTO 100/300":			driver.findElement(By.xpath("//select[@id='Covg_37K']//option[contains(text(),'100/300')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37K).getFirstSelectedOption().getText());
																					break;
																					
				case "P250": case "PP250": case "PROGRESSIVE AUTO 250/500":			driver.findElement(By.xpath("//select[@id='Covg_37K']//option[contains(text(),'250/500')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37K).getFirstSelectedOption().getText());
																					break;
																					
				default:																Log("Invalid value for package Policy Discount: " + SelectPackagePolicyDiscount);
																					break;
			}			
		}
		else {
			new Select(cp37).selectByVisibleText(SelectPackagePolicyDiscount);
				Log("Entered Package Policy Discount: " + new Select(cp37).getFirstSelectedOption().getText());
		}
	}
	
	//Returns whether "Package Policy Discount" drop down is populated
	public String ReturnPackagePolicyDiscount() {
		if(driver.getPageSource().contains("Covg_37D")) {
			if(new Select(ppd37D).getFirstSelectedOption().getText().isEmpty()) {
				return "N/A";
			}
			else {
				return new Select(ppd37D).getFirstSelectedOption().getText();	
			}
		}
		else if(driver.getPageSource().contains("Covg_37K")) {
			if(new Select(ppd37K).getFirstSelectedOption().getText().isEmpty()) {
				return "N/A";
			}
			else {
				return new Select(ppd37K).getFirstSelectedOption().getText();	
			}
		}
		else {
			if(new Select(cp37).getFirstSelectedOption().getText().isEmpty()) {
				return "N/A";
			}
			else {
				return new Select(cp37).getFirstSelectedOption().getText();	
			}
		}
	}
	
	//Selects "Package Policy Discount" from drop down
	public void SelectPackagePolicyDiscount_PPD_ENDORSE(String SelectPackagePolicyDiscount) {
		if(driver.getPageSource().contains("Covg_37D")) {
			if(SelectPackagePolicyDiscount.toUpperCase().contains("LESS")) {
				new Select(ppd37D).selectByValue("C0");
			}
			else {
				new Select(ppd37D).selectByVisibleText(SelectPackagePolicyDiscount);
			}
				Log("Entered Package Policy Discount: " + new Select(ppd37D).getFirstSelectedOption().getText());
		}
		else if(driver.getPageSource().contains("Covg_37K")) {
			if(SelectPackagePolicyDiscount.toUpperCase().contains("LESS")) {
				new Select(ppd37K).selectByValue("C0");
			}
			else {
				new Select(ppd37K).selectByVisibleText(SelectPackagePolicyDiscount);	
			}
				Log("Entered Package Policy Discount: " + new Select(ppd37K).getFirstSelectedOption().getText());
		}
		else {
			new Select(cp37).selectByVisibleText(SelectPackagePolicyDiscount);
				Log("Entered Package Policy Discount: " + new Select(cp37).getFirstSelectedOption().getText());
		}
	}
	
	//Selects "All Other Perils Deductible" drop down 
	public void SelectAllOtherPerilsDeductible(String SelectAllOtherPerilsDeductible) {
		switch(SelectAllOtherPerilsDeductible.toUpperCase()) {
			case "500": case "$500":								driver.findElement(By.xpath("//select[@id='Covg_44N']//option[contains(text(),'500') and not(contains(text(),'Cov'))]")).click();
																	break;
														
			case "1000": case "$1000": case "$1,000": case "1,000":	driver.findElement(By.xpath("//select[@id='Covg_44N']//option[contains(text(),'1') and not(contains(text(),'Cov'))]")).click();
																	break;
																		
			case "2500": case "$2500": case "$2,500": case "2,500":	driver.findElement(By.xpath("//select[@id='Covg_44N']//option[contains(text(),'2') and not(contains(text(),'Cov'))]")).click();
																	break;
										
			case "0.01": case "1": case "1% COV A":					driver.findElement(By.xpath("//select[@id='Covg_44N']//option[contains(text(),'1%')]")).click();
																	break;
														
			case "0.02": case "2": case "2% COV A":					driver.findElement(By.xpath("//select[@id='Covg_44N']//option[contains(text(),'2%')]")).click();
																	break;
														
			case "0.05": case "5": case "5% COV A":					driver.findElement(By.xpath("//select[@id='Covg_44N']//option[contains(text(),'5%')]")).click();
																	break;
		}
			Log("Entered All Other Perils Deductible: " + new Select(allotherperilsdeductible).getFirstSelectedOption().getText());
	}
	
	//Returns whether "All Other Perils Deductible" drop down is populated
	public String ReturnAllOtherPerilsDeductible() {
		if(new Select(allotherperilsdeductible).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			if(new Select(allotherperilsdeductible).getFirstSelectedOption().getText().contains("Included")) {
				return "$500 (Included)";
			}
			else if(new Select(allotherperilsdeductible).getFirstSelectedOption().getText().contains("$") && new Select(allotherperilsdeductible).getFirstSelectedOption().getText().contains("250") && !new Select(allotherperilsdeductible).getFirstSelectedOption().getText().contains("500")) {
				return "$250";				
			}
			else if(new Select(allotherperilsdeductible).getFirstSelectedOption().getText().contains("$") && new Select(allotherperilsdeductible).getFirstSelectedOption().getText().contains("1") && !new Select(allotherperilsdeductible).getFirstSelectedOption().getText().contains("500")) {
				return "$1,000";
			}
			else if(new Select(allotherperilsdeductible).getFirstSelectedOption().getText().contains("$") && new Select(allotherperilsdeductible).getFirstSelectedOption().getText().contains("1") && new Select(allotherperilsdeductible).getFirstSelectedOption().getText().contains("500")) {
				return "$1,500";
			}
			else if(new Select(allotherperilsdeductible).getFirstSelectedOption().getText().contains("$") && new Select(allotherperilsdeductible).getFirstSelectedOption().getText().contains("2") && new Select(allotherperilsdeductible).getFirstSelectedOption().getText().contains("500")) {
				return "$2,500";
			}
			else {
				return new Select(allotherperilsdeductible).getFirstSelectedOption().getText();
			}
		}
	}

	//Selects "Wind Hail Deductible" drop down 
	public void SelectWindHailDeductible(String SelectWindHailDeductible) {
		switch(SelectWindHailDeductible.toUpperCase()) {
			case "500": case "$500":					driver.findElement(By.xpath("//select[@id='Covg_44H']//option[contains(text(),'500') and not(contains(text(),'2'))]")).click();
														break;
														
			case "1000": case "$1000": case "$1,000":	driver.findElement(By.xpath("//select[@id='Covg_44H']//option[contains(text(),'1') and not(contains(text(),'Cov'))]")).click();
														break;
																		
			case "2500": case "$2500": case "$2,500":	driver.findElement(By.xpath("//select[@id='Covg_44H']//option[contains(text(),'2') and not(contains(text(),'Cov'))]")).click();
														break;
										
			case "1": case "1% COV A":					driver.findElement(By.xpath("//select[@id='Covg_44H']//option[contains(text(),'1%')]")).click();
														break;
										
			case "2": case "2% COV A":					driver.findElement(By.xpath("//select[@id='Covg_44H']//option[contains(text(),'2%')]")).click();
														break;
														
			case "3": case "3% COV A":					driver.findElement(By.xpath("//select[@id='Covg_44H']//option[contains(text(),'3%')]")).click();
														break;
				
			case "5": case "5% COV A":					driver.findElement(By.xpath("//select[@id='Covg_44H']//option[contains(text(),'5%')]")).click();
														break;
		}
			Log("Entered Wind Hail Deductible: " + new Select(windhaildeductible).getFirstSelectedOption().getText());
	}
	
	//Returns whether "Wind Hail Deductible" drop down is populated
	public String ReturnWindHailDeductible() {
		if(new Select(windhaildeductible).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			if(new Select(windhaildeductible).getFirstSelectedOption().getText().contains("$") && new Select(windhaildeductible).getFirstSelectedOption().getText().contains("1") && new Select(windhaildeductible).getFirstSelectedOption().getText().contains("000")) {
				return "$1,000";
			}
			else if(new Select(windhaildeductible).getFirstSelectedOption().getText().contains("$") && new Select(windhaildeductible).getFirstSelectedOption().getText().contains("1") && new Select(windhaildeductible).getFirstSelectedOption().getText().contains("500")) {
				return "$1,500";
			}
			else if(new Select(windhaildeductible).getFirstSelectedOption().getText().contains("$") && new Select(windhaildeductible).getFirstSelectedOption().getText().contains("2")) {
				return "$2,500";
			}
			else {
				return new Select(windhaildeductible).getFirstSelectedOption().getText();
			}
		}
	}
			
	//Selects "Earthquake Coverage" drop down 
	public void SelectEarthquakeCoverage(String SelectEarthquakeCoverage) {
		if(!SelectEarthquakeCoverage.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakeCoverage.toUpperCase()) {
				case "Y": case "YES":				new Select(eqcoverage).selectByVisibleText("Yes");
														Log("Entered Earthquake Coverage: Yes");
													break;
			
				case "N": case "NO": case "NONE":	new Select(eqcoverage).selectByVisibleText("No");
														Log("Entered Earthquake Coverage: No");
													break;
										
				case "B": case "BASIC":				new Select(eqcoverage).selectByVisibleText("Basic");
														Log("Entered Earthquake Coverage: Basic");
													break;
	
				case "C": case "CHOICE":			new Select(eqcoverage).selectByVisibleText("Choice");
														Log("Entered Earthquake Coverage: Choice");
													break;
			}
		}
	}

	//Returns whether "Earthquake Coverage" drop down is populated
	public String ReturnEarthquakeCoverage() {
		if(new Select(eqcoverage).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(eqcoverage).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Earthquake Deductible" drop down 
	public void SelectEarthquakeDeductible(String SelectEarthquakeDeductible) {
		if(!SelectEarthquakeDeductible.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakeDeductible.toUpperCase()) {
				case "0.05": case "5% COV A":case "5% COV A AND B CSL": case "5%": case "5":		driver.findElement(By.xpath("//select[@id='Covg_44D']//option[contains(text(),'5') and not(contains(text(),'1')) and not(contains(text(),'2'))]")).click();
																									break;
												
				case "0.1": case "10% COV A":case "10% COV A AND B CSL": case "10%": case "10":		driver.findElement(By.xpath("//select[@id='Covg_44D']//option[contains(text(),'10')]")).click();
																									break;
			
				case "0.15": case "15% COV A":case "15% COV A AND B CSL": case "15%": case "15":	driver.findElement(By.xpath("//select[@id='Covg_44D']//option[contains(text(),'15')]")).click();
																									break;
				
				case "0.2": case "20% COV A": case "20% COV A AND B CSL": case "20%": case "20":	driver.findElement(By.xpath("//select[@id='Covg_44D']//option[contains(text(),'20')]")).click();
																									break;
												
				case "0.25": case "25% COV A": case "25% COV A AND B CSL": case "25%": case "25":	driver.findElement(By.xpath("//select[@id='Covg_44D']//option[contains(text(),'25')]")).click();
																									break;
			}
				Log("Entered Earthquake Deductible: " + new Select(eqdeductible).getFirstSelectedOption().getText());
		}
	}
	
	//Returns whether "Earthquake Deductible" drop down is populated
	public String ReturnEarthquakeDeductible() {
		if(new Select(eqdeductible).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(eqdeductible).getFirstSelectedOption().getText();	
		}
	}
				
	//Selects "Earthquake Foundation Type" drop down 
	public void SelectEarthquakeFoundationType(String SelectEarthquakeFoundationType) {
		int randeqfoundation = RandomNum(1,3);
		if(!SelectEarthquakeFoundationType.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakeFoundationType.toUpperCase()) {
				case "B": case "BASEMENT":						if(randeqfoundation==1) {
																	new Select(eqfoundationtype).selectByVisibleText("Basement, Daylight");				
																}
																else if(randeqfoundation==2){
																	new Select(eqfoundationtype).selectByVisibleText("Basement, Below Grade");
																}
																else if(randeqfoundation==3) {
																	new Select(eqfoundationtype).selectByVisibleText("Basement, Walkout");				
																}
																	Log("Entered Earthquake Foundation Type: " + new Select(eqfoundationtype).getFirstSelectedOption().getText());
																break;
															
				case "C": case "CRAWL SPACE":					new Select(eqfoundationtype).selectByVisibleText("Crawl Space");
																	Log("Entered Earthquake Foundation Type: Crawl Space");
																break;
				
				case "P": case "PIERS (ELEVATED)":				new Select(eqfoundationtype).selectByVisibleText("Piers (elevated)");
																	Log("Entered Earthquake Foundation Type: Piers (elevated)");
																break;
												
				case "OF": case "OPEN FOUNDATION":				new Select(eqfoundationtype).selectByVisibleText("Open Foundation");
																	Log("Entered Earthquake Foundation Type: Open Foundation");
																break;								
												
				case "P/C": case "PIERS/CRAWL SPACE":			new Select(eqfoundationtype).selectByVisibleText("Piers/Crawl space");
																	Log("Entered Earthquake Foundation Type: Piers/Crawl space");
																break;
										
				case "P/O": case "PIERS/OPEN FOUNDATION":		new Select(eqfoundationtype).selectByVisibleText("Piers/Open Foundation");
																	Log("Entered Earthquake Foundation Type: Piers/Open Foundation");
																break;
										
				case "PL": case "PILINGS 8-12 FT":				new Select(eqfoundationtype).selectByVisibleText("Pilings 8-12 ft");
																	Log("Entered Earthquake Foundation Type: Pilings 8-12 ft");
																break;
															
				case "R": case "RAISED":						new Select(eqfoundationtype).selectByVisibleText("Raised");
																	Log("Entered Earthquake Foundation Type: Raised");
																break;
															
				case "OT": case "OTHER":						new Select(eqfoundationtype).selectByVisibleText("Other");
																	Log("Entered Earthquake Foundation Type: Other");
																break;
												
				case "S": case "SLAB-ON-GROUND": case "SLAB":	new Select(eqfoundationtype).selectByVisibleText("Slab-on-ground");
																	Log("Entered Earthquake Foundation Type: Slab-on-ground");
																break;
			}
		}
	}

	//Returns whether "Earthquake Foundation Type" drop down is populated
	public String ReturnEarthquakeFoundationType() {
		if(new Select(eqfoundationtype).getFirstSelectedOption().getText().isEmpty()) {
			return "N";
		}
		else if(new Select(eqfoundationtype).getFirstSelectedOption().getText().contains("basement")) {
			return "Basement";
		}
		else {
			return new Select(eqfoundationtype).getFirstSelectedOption().getText();	
		}
	}
	
	//Checks "Open Foundation" check box 
	public void CheckOpenFoundation(String CheckOpenFoundation) {
		if(!CheckOpenFoundation.toUpperCase().equals("N/A")) {
			if(openfoundation.isSelected()) {
				switch(CheckOpenFoundation.toUpperCase()) {
					case "Y": case "YES":		Log("\"Open Foundation\" check box marked");
											break;
											
					case "N": case "NO":	openfoundation.click();
												Log("\"Open Foundation\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckOpenFoundation.toUpperCase()) {
					case "Y": case "YES":	openfoundation.click();
												Log("\"Open Foundation\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Open Foundation\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Returns whether "Open Foundation" check box is populated
	public String ReturnOpenFoundation() {
		if(openfoundation.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}
	
	//Checks "Limited Foundation and Slab Buyback" check box 
	public void CheckLimitedFoundationandSlabBuyback(String CheckimitedFoundationandSlabBuyback) {
		if(!CheckimitedFoundationandSlabBuyback.toUpperCase().equals("N/A")) {
			if(limitedfoundationandslabbuyback.isSelected()) {
				switch(CheckimitedFoundationandSlabBuyback.toUpperCase()) {
					case "Y": case "YES":		Log("\"Limited Foundation and Slab Buyback\" check box marked");
											break;
											
					case "N": case "NO":	limitedfoundationandslabbuyback.click();
												Log("\"Limited Foundation and Slab Buyback\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckimitedFoundationandSlabBuyback.toUpperCase()) {
					case "Y": case "YES":	limitedfoundationandslabbuyback.click();
												Log("\"Limited Foundation and Slab Buyback\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Limited Foundation and Slab Buyback\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Returns whether "Limited Foundation and Slab Buyback" check box is populated
	public String ReturnLimitedFoundationandSlabBuyback() {
		if(limitedfoundationandslabbuyback.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}
			
	//Checks "Earthquake Secured Water Heater" check box 
	public void CheckEarthquakeSecuredWaterHeater(String CheckEarthquakeSecuredWaterHeater) {
		if(!CheckEarthquakeSecuredWaterHeater.toUpperCase().equals("N/A")) {
			if(eqsecuredwaterheater.isSelected()) {
				switch(CheckEarthquakeSecuredWaterHeater.toUpperCase()) {
					case "Y": case "YES":		Log("\"Earthquake Secured Water Heater\" check box marked");
											break;
											
					case "N": case "NO":	eqsecuredwaterheater.click();
												Log("\"Earthquake Secured Water Heater\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckEarthquakeSecuredWaterHeater.toUpperCase()) {
					case "Y": case "YES":	eqsecuredwaterheater.click();
												Log("\"Earthquake Secured Water Heater\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Earthquake Secured Water Heater\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Returns whether "Earthquake Secured Water Heater" check box is populated
	public String ReturnEarthquakeSecuredWaterHeater() {
		if(eqsecuredwaterheater.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}
			
	//Selects "Earthquake Personal Property Increased Limit" drop down 
	public void SelectEarthquakePersonalPropertyIncreasedLimit(String SelectEarthquakePersonalPropertyIncreasedLimit) {
		if(!SelectEarthquakePersonalPropertyIncreasedLimit.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakePersonalPropertyIncreasedLimit.toUpperCase()) {
				case "5000": case "5,000": case "$5000": case "$5,000":			new Select(eqpersonalproperty).selectByVisibleText("$5,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $5,000");
																				break;
			
				case "25000": case "25,000": case "$25000": case "$25,000":		new Select(eqpersonalproperty).selectByVisibleText("$25,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $25,000");
																				break;
										
				case "50000": case "50,000": case "$50000": case "$50,000":		new Select(eqpersonalproperty).selectByVisibleText("$50,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $50,000");
																				break;
	
				case "75000": case "75,000": case "$75000": case "$75,000":		new Select(eqpersonalproperty).selectByVisibleText("$75,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $75,000");
																				break;
																				
				case "100000": case "100,000": case "$100000": case "$100,000":	new Select(eqpersonalproperty).selectByVisibleText("$100,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $100,000");
																				break;
			
				case "150000": case "150,000": case "$150000": case "$150,000":	new Select(eqpersonalproperty).selectByVisibleText("$150,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $150,000");
																				break;
										
				case "200000": case "200,000": case "$200000": case "$200,000":	new Select(eqpersonalproperty).selectByVisibleText("$200,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $200,000");
																				break;
			}
		}
	}
	
	//Returns whether "Earthquake Personal Property Increased Limit" drop down is populated
	public String ReturnEarthquakePersonalPropertyIncreasedLimit() {
		if(new Select(eqpersonalproperty).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(eqpersonalproperty).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Earthquake Loss of Use Increased Limit" drop down 
	public void SelectEarthquakeLossofUse(String SelectEarthquakeLossofUse) {
		if(!SelectEarthquakeLossofUse.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakeLossofUse.toUpperCase()) {
				case "1500": case "1,500": case "$1500": case "$1,500":			new Select(eqlossofuse).selectByVisibleText("$1,500");
																					Log("Entered Earthquake Personal Property Increased Limit: $1,500");
																				break;
			
				case "10000": case "10,000": case "$10000": case "$10,000":		new Select(eqlossofuse).selectByVisibleText("$10,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $10,000");
																				break;
										
				case "15000": case "15,000": case "$15000": case "$15,000":		new Select(eqlossofuse).selectByVisibleText("$15,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $15,000");
																				break;
	
				case "25000": case "25,000": case "$25000": case "$25,000":		new Select(eqlossofuse).selectByVisibleText("$25,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $25,000");
																				break;
																				
				case "50000": case "50,000": case "$50000": case "$50,000":		new Select(eqlossofuse).selectByVisibleText("$50,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $50,000");
																				break;
			
				case "75000": case "75,000": case "$75000": case "$75,000":		new Select(eqlossofuse).selectByVisibleText("$75,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $75,000");
																				break;
										
				case "100000": case "100,000": case "$100000": case "$100,000":	new Select(eqlossofuse).selectByVisibleText("$100,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $100,000");
																				break;
			}
		}
	}
	
	//Returns whether "Earthquake Loss of Use Increased Limit" drop down is populated
	public String ReturnEarthquakeLossofUse() {
		if(new Select(eqlossofuse).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(eqlossofuse).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Earthquake Ordinance or Law" drop down 
	public void SelectEarthquakeOrdinanceOrLaw(String SelectEarthquakeOrdinanceOrLaw) {
		if(!SelectEarthquakeOrdinanceOrLaw.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakeOrdinanceOrLaw.toUpperCase()) {
				case "10000": case "10,000": case "$10000": case "$10,000":		new Select(eqol).selectByVisibleText("$10,000");
																					Log("Entered Earthquake Ordinance or Law: $10,000");
																				break;
			
				case "20000": case "20,000": case "$20000": case "$20,000":		new Select(eqol).selectByVisibleText("$20,000");
																					Log("Entered Earthquake Ordinance or Law: $20,000");
																				break;
										
				case "30000": case "30,000": case "$30000": case "$30,000":		new Select(eqol).selectByVisibleText("$30,000");
																					Log("Entered Earthquake Ordinance or Law: $30,000");
																				break;
			}
		}
	}
	
	//Returns whether "Earthquake Ordinance or Law" drop down is populated
	public String ReturnEarthquakeOrdinanceOrLaw() {
		if(new Select(eqol).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(eqol).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Earthquake Hazard Reduction Discount" drop down 
	public void SelectEarthquakeHazardReductionDiscount(String SelectEarthquakeHazardReductionDiscount) {
		if(!SelectEarthquakeHazardReductionDiscount.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakeHazardReductionDiscount.toUpperCase()) {
				case "V": case "VERIFIED":					new Select(eqhazardreduction).selectByVisibleText("Verified");
																Log("Entered Earthquake Hazard Reduction Discount: Verified");
															break;
			
				case "SV": case "S": case "SELF-VERIFIED":	new Select(eqhazardreduction).selectByVisibleText("Self-Verified");
																Log("Entered Earthquake Hazard Reduction Discount: Self-Verified");
															break;
			}
		}
	}
	
	//Returns whether "Earthquake Hazard Reduction Discount" drop down is populated
	public String ReturnEarthquakeHazardReductionDiscount() {
		if(new Select(eqhazardreduction).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(eqhazardreduction).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Earthquake Contents Deductible (Choice Only)" drop down 
	public void SelectEarthquakeContentsDeductible(String SelectEarthquakeContentsDeductible) {
		if(!SelectEarthquakeContentsDeductible.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakeContentsDeductible.toUpperCase()) {
				case ".05": case "5% COV C": case "5%":		new Select(eqpersonalproperty).selectByVisibleText("5% Cov C");
																Log("Entered Earthquake Contents Deductible (Choice Only): 5% Cov C");
															break;

				case ".10": case "10% COV C": case "10%":	new Select(eqpersonalproperty).selectByVisibleText("10% Cov C");
																Log("Entered Earthquake Contents Deductible (Choice Only): 10% Cov C");
															break;

				case ".15": case "15% COV C": case "15%":	new Select(eqpersonalproperty).selectByVisibleText("15% Cov C");
																Log("Entered Earthquake Contents Deductible (Choice Only): 15% Cov C");
															break;

				case ".20": case "20% COV C": case "20%":	new Select(eqpersonalproperty).selectByVisibleText("20% Cov C");
																Log("Entered Earthquake Contents Deductible (Choice Only): 20% Cov C");
															break;
		
				case ".25": case "25% COV C": case "25%":	new Select(eqpersonalproperty).selectByVisibleText("25% Cov C");
																Log("Entered Earthquake Contents Deductible (Choice Only): 25% Cov C");
															break;		
			}
		}
	}
	
	//Returns whether "Earthquake Contents Deductible (Choice Only)" drop down is populated
	public String ReturnEarthquakeContentsDeductible() {
		if(new Select(eqpersonalproperty).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(eqpersonalproperty).getFirstSelectedOption().getText();	
		}
	}

	//Checks "Earthquake Masonry Veneer Exterior Coverage" check box 
	public void CheckEarthquakeMasonryVeneerExteriorCoverage(String CheckEarthquakeMasonryVeneerExteriorCoverage) {
		if(!CheckEarthquakeMasonryVeneerExteriorCoverage.toUpperCase().equals("N/A")) {
			if(eqmasonaryveneerexterior.isSelected()) {
				switch(CheckEarthquakeMasonryVeneerExteriorCoverage.toUpperCase()) {
					case "Y": case "YES":		Log("\"Earthquake Masonry Veneer Exterior Coverage\" check box marked");
											break;
											
					case "N": case "NO":	eqmasonaryveneerexterior.click();
												Log("\"Earthquake Masonry Veneer Exterior Coverage\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckEarthquakeMasonryVeneerExteriorCoverage.toUpperCase()) {
					case "Y": case "YES":	eqmasonaryveneerexterior.click();
												Log("\"Earthquake Masonry Veneer Exterior Coverage\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Earthquake Masonry Veneer Exterior Coverage\" check box NOT marked");
											break;
				}			
			}
		}
	}
	
	//Returns whether "Earthquake Masonry Veneer Exterior Coverage" check box is populated
	public String ReturnEarthquakeMasonryVeneerExteriorCoverage() {
		if(eqmasonaryveneerexterior.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}

	//Checks "Earthquake Breakables Coverage" check box 
	public void CheckEarthquakeBreakablesCoverage(String CheckEarthquakeBreakablesCoverage) {
		if(!CheckEarthquakeBreakablesCoverage.toUpperCase().equals("N/A")) {
			if(eqbreakables.isSelected()) {
				switch(CheckEarthquakeBreakablesCoverage.toUpperCase()) {
					case "Y": case "YES":		Log("\"Earthquake Breakables Coverage\" check box marked");
											break;
											
					case "N": case "NO":	eqbreakables.click();
												Log("\"Earthquake Breakables Coverage\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckEarthquakeBreakablesCoverage.toUpperCase()) {
					case "Y": case "YES":	eqbreakables.click();
												Log("\"Earthquake Breakables Coverage\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Earthquake Breakables Coverage\" check box NOT marked");
											break;
				}			
			}
		}
	}
	
	//Returns whether "Earthquake Breakables Coverage" check box is populated
	public String ReturnEarthquakeBreakablesCoverage() {
		if(eqbreakables.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}
			
	//Selects "Pre-Existing Earthquake Damage" drop down 
	public void SelectPreExistingEarthquakeDamage(String SelectPreExistingEarthquakeDamage) {
		if(!SelectPreExistingEarthquakeDamage.toUpperCase().equals("N/A")) {
			switch(SelectPreExistingEarthquakeDamage.toUpperCase()) {
				case "Y": case "YES":	new Select(preexistingeqdmg).selectByVisibleText("Yes");
											Log("Entered Pre-Existing Earthquake Damage: Yes");
										break;

				case "N": case "NO":	new Select(preexistingeqdmg).selectByVisibleText("No");
											Log("Entered Pre-Existing Earthquake Damage: No");
										break;	
			}
		}
	}
	
	//Returns whether "Pre-Existing Earthquake Damage" drop down is populated
	public String ReturnPreExistingEarthquakeDamage() {
		if(new Select(preexistingeqdmg).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(preexistingeqdmg).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Dwelling secured to foundation in accordance with California Building Code?" drop down 
	public void SelectDwellingSecured(String SelectDwellingSecured) {
		if(!SelectDwellingSecured.toUpperCase().equals("N/A")) {
			switch(SelectDwellingSecured.toUpperCase()) {
				case "Y": case "YES":	new Select(dwellingsecured).selectByVisibleText("Yes");
											Log("Entered Dwelling secured to foundation in accordance with California Building Code?: Yes");
										break;

				case "N": case "NO":	new Select(dwellingsecured).selectByVisibleText("No");
											Log("Entered Dwelling secured to foundation in accordance with California Building Code?: No");
										break;
			}
		}
	}
	
	//Returns whether "Dwelling secured to foundation in accordance with California Building Code?" drop down is populated
	public String ReturnDwellingSecured() {
		if(new Select(dwellingsecured).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(dwellingsecured).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Does the dwelling have cripple walls?" drop down 
	public void SelectDoesTheDwellingHaveCrippleWalls(String SelectDoesTheDwellingHaveCrippleWalls) {
		if(!SelectDoesTheDwellingHaveCrippleWalls.toUpperCase().equals("N/A")) {
			switch(SelectDoesTheDwellingHaveCrippleWalls.toUpperCase()) {
				case "Y": case "YES":	new Select(dwellinghavecripplewalls).selectByVisibleText("Yes");
											Log("Entered Does the dwelling have cripple walls?: Yes");
										break;

				case "N": case "NO":	new Select(dwellinghavecripplewalls).selectByVisibleText("No");
											Log("Entered Does the dwelling have cripple walls?: No");
										break;
			}
		}
	}
	
	//Returns whether "Does the dwelling have cripple walls?" drop down is populated
	public String ReturnDoesTheDwellingHaveCrippleWalls() {
		if(new Select(dwellinghavecripplewalls).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(dwellinghavecripplewalls).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Cripple walls braced with plywood or equivalent in accordance with California Building Code?" drop down 
	public void SelectCrippleWallsBraced(String SelectCrippleWallsBraced) {
		if(!SelectCrippleWallsBraced.toUpperCase().equals("N/A")) {
			switch(SelectCrippleWallsBraced.toUpperCase()) {
				case "Y": case "YES":							new Select(cripplewallsbraced).selectByVisibleText("Yes");
																	Log("Entered Cripple walls braced with plywood or equivalent in accordance with California Building Code?: Yes");
																break;

				case "N": case "NO":							new Select(cripplewallsbraced).selectByVisibleText("No");
																	Log("Entered Cripple walls braced with plywood or equivalent in accordance with California Building Code?: No");
																break;


				case "NA": case "N-A": case "NOT APPLICABLE":	new Select(cripplewallsbraced).selectByVisibleText("Not applicable");
																	Log("Entered Cripple walls braced with plywood or equivalent in accordance with California Building Code?: Not applicable");
																break;
			}
		}
	}
	
	//Returns whether "Cripple walls braced with plywood or equivalent in accordance with California Building Code?" drop down is populated
	public String ReturnCrippleWallsBraced() {
		if(new Select(cripplewallsbraced).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(cripplewallsbraced).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Water heater secured to building frame in accordance with guidelines?" drop down 
	public void SelectWaterHeaterSecured(String SelectWaterHeaterSecured) {
		if(!SelectWaterHeaterSecured.toUpperCase().equals("N/A")) {
			switch(SelectWaterHeaterSecured.toUpperCase()) {
				case "Y": case "YES":	new Select(waterheatersecured).selectByVisibleText("Yes");
											Log("Entered Water heater secured to building frame in accordance with guidelines?: Yes");
										break;

				case "N": case "NO":	new Select(waterheatersecured).selectByVisibleText("No");
											Log("Entered Water heater secured to building frame in accordance with guidelines?: No");
										break;
			}
		}
	}
	
	//Returns whether "Water heater secured to building frame in accordance with guidelines?" drop down is populated
	public String ReturnWaterHeaterSecured() {
		if(new Select(waterheatersecured).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(waterheatersecured).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Does the dwelling have a post-and-pier or post-and-beam foundation?" drop down 
	public void SelectDwellingHavePost(String SelectDwellingHavePost) {
		if(!SelectDwellingHavePost.toUpperCase().equals("N/A")) {
			switch(SelectDwellingHavePost.toUpperCase()) {
				case "Y": case "YES":	new Select(dwellinghavepost).selectByVisibleText("Yes");
											Log("Entered Does the dwelling have a post-and-pier or post-and-beam foundation?: Yes");
										break;

				case "N": case "NO":	new Select(dwellinghavepost).selectByVisibleText("No");
											Log("Entered Does the dwelling have a post-and-pier or post-and-beam foundation?: No");
										break;
			}
		}
	}
	
	//Returns whether "Does the dwelling have a post-and-pier or post-and-beam foundation?" drop down is populated
	public String ReturnDwellingHavePost() {
		if(new Select(dwellinghavepost).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(dwellinghavepost).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Has the post-and-pier or post-and-beam foundation been modified in accordance with CA Building Code?" drop down 
	public void SelectPostFoundationModified(String SelectPostFoundationModified) {
		if(!SelectPostFoundationModified.toUpperCase().equals("N/A")) {
			switch(SelectPostFoundationModified.toUpperCase()) {
				case "Y": case "YES":	new Select(postfoundationmodified).selectByVisibleText("Yes");
											Log("Entered Has the post-and-pier or post-and-beam foundation been modified in accordance with CA Building Code?: Yes");
										break;

				case "N": case "NO":	new Select(postfoundationmodified).selectByVisibleText("No");
											Log("Entered Has the post-and-pier or post-and-beam foundation been modified in accordance with CA Building Code?: No");
										break;
			}
		}
	}
	
	//Returns whether "Has the post-and-pier or post-and-beam foundation been modified in accordance with CA Building Code?" drop down is populated
	public String ReturnPostFoundationModified() {
		if(new Select(postfoundationmodified).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(postfoundationmodified).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Number of Chimneys" drop down 
	public void SelectNumberOfChimneys(String SelectNumberOfChimneys) {
		if(!SelectNumberOfChimneys.toUpperCase().equals("N/A")) {
			new Select(chimneys).selectByVisibleText(SelectNumberOfChimneys);
				Log("Entered Number of Chimneys: " + SelectNumberOfChimneys);
		}
	}
	
	//Returns whether "Number of Chimneys" drop down is populated
	public String ReturnNumberOfChimneys() {
		if(new Select(chimneys).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(chimneys).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Inservants" drop down 
	public void SelectInservants(String SelectInservants) {
		if(!SelectInservants.toUpperCase().equals("N/A")) {
			switch(SelectInservants.toUpperCase()) {
				case "0": case "N": case "NONE": case "NO":		Log("Entered Inservants: None");
															break;
			
				case "1": case "1 INSERVANT":				new Select(inservants).selectByVisibleText("1 Inservant");
																Log("Entered Inservants: 1 Inservant");
															break;
				
				case "2": case "2 INSERVANTS":				new Select(inservants).selectByVisibleText("2 Inservant");
																Log("Entered Inservants: 2 Inservant");
															break;
															
				case "3": case "3 INSERVANTS":				new Select(inservants).selectByVisibleText("3 Inservant");
																Log("Entered Inservants: 3 Inservant");
															break;
													
				case "4": case "4 INSERVANTS":				new Select(inservants).selectByVisibleText("4 Inservant");
																Log("Entered Inservants: 4 Inservant");
															break;
			
				case "5": case "5 INSERVANTS":				new Select(inservants).selectByVisibleText("5 Inservant");
																Log("Entered Inservants: 5 Inservant");
															break;
			}
		}
	}
	
	//Returns whether "Inservants" drop down is populated
	public String ReturnInservants() {
		if(new Select(inservants).getFirstSelectedOption().getText().isEmpty()) {
			return "N";
		}
		else {
			return new Select(inservants).getFirstSelectedOption().getText();	
		}
	}

	//Selects "Occasional/Incidental" drop down 
	public void SelectOccasionalIncidental(String SelectOccasionalIncidental) {
		if(!SelectOccasionalIncidental.toUpperCase().equals("N/A")) {
			switch(SelectOccasionalIncidental.toUpperCase()) {
				case "0": case "N": case "NONE": case "NO":		Log("Entered Occasional/Incidental: None");
															break;
			
				case "1": case "1 OCCASIONAL/INCIDENTAL":	new Select(occasional).selectByVisibleText("1 Occasional/Incidental");
																Log("Entered Occasional/Incidental: 1 Occasional/Incidental");
															break;
				
				case "2": case "2 OCCASIONAL/INCIDENTAL":	new Select(occasional).selectByVisibleText("2 Occasional/Incidental");
																Log("Entered Occasional/Incidental: 2 Occasional/Incidental");
															break;
															
				case "3": case "3 OCCASIONAL/INCIDENTAL":	new Select(occasional).selectByVisibleText("3 Occasional/Incidental");
																Log("Entered Occasional/Incidental: 3 Occasional/Incidental");
															break;
													
				case "4": case "4 OCCASIONAL/INCIDENTAL":	new Select(occasional).selectByVisibleText("4 Occasional/Incidental");
																Log("Entered Occasional/Incidental: 4 Occasional/Incidental");
															break;
			
				case "5": case "5 OCCASIONAL/INCIDENTAL":	new Select(occasional).selectByVisibleText("5 Occasional/Incidental");
																Log("Entered Occasional/Incidental: 5 Occasional/Incidental");
															break;
			}
		}
	}
	
	//Returns whether "Occasional/Incidental" drop down is populated
	public String ReturnOccasionalIncidental() {
		if(new Select(occasional).getFirstSelectedOption().getText().isEmpty()) {
			return "N";
		}
		else {
			return new Select(occasional).getFirstSelectedOption().getText();	
		}
	}

	//Selects "Outservants" drop down 
	public void SelectOutservants(String SelectOutservants) {
		if(!SelectOutservants.toUpperCase().equals("N/A")) {
			switch(SelectOutservants.toUpperCase()) {
				case "0": case "N": case "NONE": case "NO":		Log("Entered Outservants: None");
															break;
			
				case "1": case "1 OUTSERVANT":				new Select(outservants).selectByVisibleText("1 Outservant");
																Log("Entered Outservants: 1 Outservant");
															break;
				
				case "2": case "2 OUTSERVANTS":				new Select(outservants).selectByVisibleText("2 Outservants");
																Log("Entered Outservants: 2 Outservants");
															break;
															
				case "3": case "3 OUTSERVANTS":				new Select(outservants).selectByVisibleText("3 Outservants");
																Log("Entered Outservants: 3 Outservants");
															break;
													
				case "4": case "4 OUTSERVANTS":				new Select(outservants).selectByVisibleText("4 Outservants");
																Log("Entered Outservants: 4 Outservants");
															break;
			
				case "5": case "5 OUTSERVANTS":				new Select(outservants).selectByVisibleText("5 Outservants");
																Log("Entered Outservants: 5 Outservants");
															break;
			}
		}
	}
	
	//Returns whether "Outservants" drop down is populated
	public String ReturnOutservants() {
		if(new Select(outservants).getFirstSelectedOption().getText().isEmpty()) {
			return "N";
		}
		else {
			return new Select(outservants).getFirstSelectedOption().getText();	
		}
	}
	
	//Checks "Non Structural Hail Loss Limitation" check box 
	public void CheckNonStructuralHailLossLimitation(String CheckNonStructuralHailLossLimitation) {
		if(!CheckNonStructuralHailLossLimitation.toUpperCase().equals("N/A")) {
			if(nshl.isSelected()) {
				switch(CheckNonStructuralHailLossLimitation.toUpperCase()) {
					case "Y": case "YES":		Log("\"Non Structural Hail Loss Limitation\" check box marked");
											break;
											
					case "N": case "NO":	nshl.click();
												Log("\"Non Structural Hail Loss Limitation\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckNonStructuralHailLossLimitation.toUpperCase()) {
					case "Y": case "YES":	nshl.click();
												Log("\"Non Structural Hail Loss Limitation\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Non Structural Hail Loss Limitation\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Returns whether "Non Structural Hail Loss Limitation" check box is populated
	public String ReturnNonStructuralHailLossLimitation() {
		if(nshl.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}

	//Checks "Home Shield Package" check box 
	public void CheckHomeShieldPackage(String CheckHomeShieldPackage) {
		if(!CheckHomeShieldPackage.toUpperCase().equals("N/A")) {
			if(homeshieldpackage.isSelected()) {
				switch(CheckHomeShieldPackage.toUpperCase()) {
					case "Y": case "YES":		Log("\"Home Shield Package\" check box marked");
											break;
											
					case "N": case "NO": 	homeshieldpackage.click();
												Log("\"Home Shield Package\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckHomeShieldPackage.toUpperCase()) {
					case "Y": case "YES":	homeshieldpackage.click();
												Log("\"Home Shield Package\" check box marked");
											break;
											
					case "N": case "NO": 		Log("\"Home Shield Package\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Checks "Home Shield Plus Package" check box 
	public void CheckHomeShieldPlusPackage(String CheckHomeShieldPlusPackage) {
		if(!CheckHomeShieldPlusPackage.toUpperCase().equals("N/A")) {
			if(homeshieldpluspackage.isSelected()) {
				switch(CheckHomeShieldPlusPackage.toUpperCase()) {
					case "Y": case "YES":		Log("\"Home Shield Plus Package\" check box marked");
											break;
											
					case "N": case "NO":	homeshieldpluspackage.click();
												Log("\"Home Shield Plus Package\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckHomeShieldPlusPackage.toUpperCase()) {
					case "Y": case "YES":	homeshieldpluspackage.click();
												Log("\"Home Shield Plus Package\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Home Shield Plus Package\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Checks "Platinum Package" check box 
	public void CheckPlatinumPackage(String CheckPlatinumPackage) {
		if(!CheckPlatinumPackage.toUpperCase().equals("N/A")) {
			if(platinumpackage.isSelected()) {
				switch(CheckPlatinumPackage.toUpperCase()) {
					case "Y": case "YES":		Log("\"Platinum Package\" check box marked");
											break;
											
					case "N": case "NO":	platinumpackage.click();
												Log("\"Platinum Package\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckPlatinumPackage.toUpperCase()) {
					case "Y": case "YES":	platinumpackage.click();
												Log("\"Platinum Package\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Platinum Package\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Checks appropriate package check box 
	public void CheckPackage(String CheckPackage) {
		if(!CheckPackage.toUpperCase().equals("N/A")) {
			switch(CheckPackage.toUpperCase()) {
				case "N": case "NONE": case "0":					Log("No packages have been selected");
																break;		
			
				case "HS": case "A": case "HOMESHEILD":			if(homeshieldpackage.isSelected()) {
																		Log("\"Home Shield Package\" check box marked");
																}
																else {
																	homeshieldpackage.click();
																		Log("\"Home Shield Package\" check box marked");
																}
																break;
										
				case "HSP": case "B": case "HOMESHIELD PLUS":	if(homeshieldpluspackage.isSelected()) {
																		Log("\"Home Shield Package\" check box marked");
																}
																else {
																	homeshieldpluspackage.click();
																		Log("\"Home Shield Package\" check box marked");
																}
																break;
										
				case "PLAT": case "P": case "PLATINUM":			if(platinumpackage.isSelected()) {
																		Log("\"Platinum Package\" check box marked");
																}
																else {
																	platinumpackage.click();
																		Log("\"Platinum Package\" check box marked");
																}
																break;
			}
		}
	}
	
	//Returns whether "Package" check box is populated
	public String ReturnPackage() {
		if(driver.getPageSource().contains("HomeShield-R Package") && homeshieldpackage.isSelected()) {
			return "HSR";
		}
		else if(driver.getPageSource().contains("HomeShield Package") && homeshieldpackage.isSelected()) {
			return "HS";
		}
		else if(driver.getPageSource().contains("HomeShield Plus Package") && homeshieldpluspackage.isSelected()) {
			 return "HSP";
		}
		else if(driver.getPageSource().contains("Platinum Package") && platinumpackage.isSelected()) {
			return "PLAT";
		}
		else {
			return "N";
		}
	}
	
	//Checks "Limited Water Damage Coverage" check box 
	public void CheckLimitedWaterDamageCoverage(String CheckLimitedWaterDamageCoverage) {
		if(!CheckLimitedWaterDamageCoverage.toUpperCase().equals("N/A")) {
			if(limitedwaterdamagecov.isSelected()) {
				switch(CheckLimitedWaterDamageCoverage.toUpperCase()) {
					case "Y": case "YES":		Log("\"Limited Water Damage Coverage\" check box marked");
											break;
											
					case "N": case "NO":	limitedwaterdamagecov.click();
												Log("\"Limited Water Damage Coverage\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckLimitedWaterDamageCoverage.toUpperCase()) {
					case "Y": case "YES":	limitedwaterdamagecov.click();
												Log("\"Limited Water Damage Coverage\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Limited Water Damage Coverage\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Returns whether "Limited Water Damage Coverage" check box is populated
	public String ReturnLimitedWaterDamageCoverage() {
		if(limitedwaterdamagecov.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}

	//Checks "Personal Injury Coverage" check box 
	public void CheckPersonalInjuryCoverage(String CheckPersonalInjuryCoverage) {
		if(!CheckPersonalInjuryCoverage.toUpperCase().equals("N/A")) {
			if(personalinjurycoverage.isSelected()) {
				switch(CheckPersonalInjuryCoverage.toUpperCase()) {
					case "Y": case "YES":		Log("\"Personal Injury Coverage\" check box marked");
											break;
											
					case "N": case "NO":	personalinjurycoverage.click();	
												Log("\"Personal Injury Coverage\" check box NOT marked");
											break;
				}
			}
			else{
				switch(CheckPersonalInjuryCoverage.toUpperCase()) {
					case "Y": case "YES":	personalinjurycoverage.click();
												Log("\"Personal Injury Coverage\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Personal Injury Coverage\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Returns whether "Personal Injury Coverage" check box is populated
	public String ReturnPersonalInjuryCoverage() {
		if(personalinjurycoverage.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}

	//Checks "Personal Property Replacement Cost" check box 
	public void CheckPersonalPropertyReplacementCost(String CheckPersonalPropertyReplacementCost) {
		if(!CheckPersonalPropertyReplacementCost.toUpperCase().equals("N/A")) {
			if(personalpropreplmntcost.isSelected()) {
				switch(CheckPersonalPropertyReplacementCost.toUpperCase()) {
					case "Y": case "YES":		Log("\"Personal Property Replacement Cost\" check box marked");
											break;
											
					case "N": case "NO":	personalpropreplmntcost.click();
												Log("\"Personal Property Replacement Cost\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckPersonalPropertyReplacementCost.toUpperCase()) {
					case "Y": case "YES":	personalpropreplmntcost.click();
												Log("\"Personal Property Replacement Cost\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Personal Property Replacement Cost\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Returns whether "Personal Property Replacement Cost" check box is populated
	public String ReturnPersonalPropertyReplacementCost() {
		if(personalpropreplmntcost.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}

	//Checks "Special Personal Property Coverage" check box 
	public void CheckSpecialPersonalPropertyCoverage(String CheckSpecialPersonalPropertyCoverage) {
		if(!CheckSpecialPersonalPropertyCoverage.toUpperCase().equals("N/A")) {
			if(specialpersonalpropertycoverage.isSelected()) {
				switch(CheckSpecialPersonalPropertyCoverage.toUpperCase()) {
					case "Y": case "YES":		Log("\"Special Personal Property Coverage\" check box marked");
											break;
											
					case "N": case "NO":	specialpersonalpropertycoverage.click();
												Log("\"Special Personal Property Coverage\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckSpecialPersonalPropertyCoverage.toUpperCase()) {
					case "Y": case "YES":	specialpersonalpropertycoverage.click();
												Log("\"Special Personal Property Coverage\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Special Personal Property Coverage\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Returns whether "Special Personal Property Coverage" check box is populated
	public String ReturnSpecialPersonalPropertyCoverage() {
		if(specialpersonalpropertycoverage.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}

	//Checks "Sinkhole" check box 
	public void CheckSinkhole(String CheckSinkhole) {
		if(!CheckSinkhole.toUpperCase().equals("N/A")) {
			if(sinkhole.isSelected()) {
				switch(CheckSinkhole.toUpperCase()) {
					case "Y": case "YES":		Log("\"Sinkhole\" check box marked");
											break;
											
					case "N": case "NO":	sinkhole.click();
												Log("\"Sinkhole\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckSinkhole.toUpperCase()) {
					case "Y": case "YES":	sinkhole.click();
												Log("\"Sinkhole\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"SSinkhole\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Returns whether "Sinkhole" check box is populated
	public String ReturnSinkhole() {
		if(sinkhole.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}

	//Types into "Home Computer Coverage" text box 
	public void TypeHomeComputerCoverage(String TypeHomeComputerCoverage) {
		if(TypeHomeComputerCoverage.toUpperCase().equals("N/A") || TypeHomeComputerCoverage.toUpperCase().equals("N") || TypeHomeComputerCoverage.toUpperCase().equals("NONE") || TypeHomeComputerCoverage.toUpperCase().equals("NO")) {
		}
		else {
			homecomputercoverage.clear();
			homecomputercoverage.sendKeys(TypeHomeComputerCoverage);
				Log("Entered Home Computer Coverage: " + TypeHomeComputerCoverage);
		}
	}
	
	//Returns the value in the "Home Computer Coverage" text box 
	public String ReturnHomeComputerCoverage() {
		if(homecomputercoverage.getTagName().contains("select")) {
			if(new Select(homecomputercoverage).getFirstSelectedOption().getText().isEmpty()) {
				return "0";
			}
			else {
				return new Select(homecomputercoverage).getFirstSelectedOption().getText().replace("$", "").replace(",", "");
			}
		}
		else {
			if(homecomputercoverage.getAttribute("value").isEmpty()) {
				return "0";
			}
			else {
				return homecomputercoverage.getAttribute("value").replace("$", "").replace(",", "");	
			}			
		}
	}

	//Selects "Animal Liability" drop down 
	public void SelectAnimalLiability(String SelectAnimalLiability) {
		if(!SelectAnimalLiability.toUpperCase().equals("N/A")) {
			switch(SelectAnimalLiability.toUpperCase()) {
				case "N": case "NONE": case "NO":								Log("Entered Animal Liability: None");
																			break;
			
				case "50": case "$50,000": case "50000": case "$50000":		new Select(animalliability).selectByVisibleText("$50,000");
																				Log("Entered Animal Liability: $50,000");
																			break;
				
				case "300": case "$300,000": case "300000":	case "$300000":	new Select(animalliability).selectByVisibleText("$300,000");
																				Log("Entered Animal Liability: $300,000");
																			break;
															
				case "500": case "$500,000": case "500000": case "$500000":	new Select(animalliability).selectByVisibleText("$500,000");
																				Log("Entered Animal Liability: $500,000");
																			break;
			}
		}
	}
	
	//Returns whether "Animal Liability" drop down is populated
	public String ReturnAnimalLiability() {
		if(new Select(animalliability).getFirstSelectedOption().getText().isEmpty()) {
			return "None";
		}
		else {
			return new Select(animalliability).getFirstSelectedOption().getText();	
		}
	}

	//Selects "Golf Cart Physical Damage & Liability" drop down 
	public void SelectGolfCart(String SelectGolfCart) {
		if(!SelectGolfCart.toUpperCase().equals("N/A")) {
			switch(SelectGolfCart.toUpperCase()) {
				case "N": case "NONE": case "NO":								Log("Entered Golf Cart Physical Damage & Liability: None");
																			break;
			
				case "50-1": case "$50,000 - 1 CART":						new Select(golfcart).selectByValue("A");
																				Log("Entered Golf Cart Physical Damage & Liability: " + new Select(golfcart).getFirstSelectedOption().getText());
																			break;
				
				case "50-2": case "$50,000 - 2 CARTS":						new Select(golfcart).selectByValue("B");
																				Log("Entered Golf Cart Physical Damage & Liability: "  + new Select(golfcart).getFirstSelectedOption().getText());
																			break;
															
				case "100/300-1": case "$100,000 / $300,000  - 1 CART":		new Select(golfcart).selectByValue("C");
																				Log("Entered Golf Cart Physical Damage & Liability: "  + new Select(golfcart).getFirstSelectedOption().getText());
																			break;
												
				case "100/300-2": case "$100,000 / $300,000  - 2 CARTS":	new Select(golfcart).selectByValue("D");
																				Log("Entered Golf Cart Physical Damage & Liability: "  + new Select(golfcart).getFirstSelectedOption().getText());
																			break;
			}
		}
	}
	
	//Returns whether "Golf Cart Physical Damage & Liability" drop down is populated
	public String ReturnGolfCart() {
		if(new Select(golfcart).getFirstSelectedOption().getText().isEmpty()) {
			return "None";
		}
		else {
			return new Select(golfcart).getFirstSelectedOption().getText();	
		}
	}

	//Selects "Increase Jewelry Watches And Furs" drop down 
	public void SelectIncreaseJewelryWatchesAndFurs(String SelectIncreaseJewelryWatchesAndFurs) {
		if(!SelectIncreaseJewelryWatchesAndFurs.toUpperCase().equals("N/A")) {
			switch(SelectIncreaseJewelryWatchesAndFurs.toUpperCase()) {
				case "0": case "N": case "NONE": case "NO":		Log("Entered Increase Jewelry Watches And Furs: None");
															break;
			
				case "1000": case "$1000":					new Select(increasejewelrywatchesandfurs).selectByVisibleText("$1000");
																Log("Entered Increase Jewelry Watches And Furs: $1000");
															break;
				
				case "2000": case "$2000":					new Select(increasejewelrywatchesandfurs).selectByVisibleText("$2000");
																Log("Entered Increase Jewelry Watches And Furs: $2000");
															break;
															
				case "3000": case "$3000":					new Select(increasejewelrywatchesandfurs).selectByVisibleText("$3000");
																Log("Entered Increase Jewelry Watches And Furs: $3000");
															break;
												
				case "4000": case "$4000":					new Select(increasejewelrywatchesandfurs).selectByVisibleText("$4000");
																Log("Entered Increase Jewelry Watches And Furs: $4000");
															break;
			}
		}
	}
	
	//Returns whether "Increase Jewelry Watches And Furs" drop down is populated
	public String ReturnIncreaseJewelryWatchesAndFurs() {
		if(new Select(increasejewelrywatchesandfurs).getFirstSelectedOption().getText().isEmpty()) {
			return "N";
		}
		else {
			if(new Select(increasejewelrywatchesandfurs).getFirstSelectedOption().getText().contains("$") && new Select(increasejewelrywatchesandfurs).getFirstSelectedOption().getText().contains("1")) {
				return "$1,000";
			}
			else if(new Select(increasejewelrywatchesandfurs).getFirstSelectedOption().getText().contains("$") && new Select(increasejewelrywatchesandfurs).getFirstSelectedOption().getText().contains("2")) {
				return "$2,000";
			}
			else if(new Select(increasejewelrywatchesandfurs).getFirstSelectedOption().getText().contains("$") && new Select(increasejewelrywatchesandfurs).getFirstSelectedOption().getText().contains("3")) {
				return "$3,000";
			}
			else if(new Select(increasejewelrywatchesandfurs).getFirstSelectedOption().getText().contains("$") && new Select(increasejewelrywatchesandfurs).getFirstSelectedOption().getText().contains("4")) {
				return "$4,000";
			}
			else if(new Select(increasejewelrywatchesandfurs).getFirstSelectedOption().getText().contains("$") && new Select(increasejewelrywatchesandfurs).getFirstSelectedOption().getText().contains("5")) {
				return "$5,000";
			}
			else {
				return new Select(increasejewelrywatchesandfurs).getFirstSelectedOption().getText();
			}
		}
	}

	//Selects "Increased Replacement Cost On Dwelling" drop down 
	public void SelectIncreasedReplacementCostOnDwelling(String SelectIncreasedReplacementCostOnDwelling) {
		if(!SelectIncreasedReplacementCostOnDwelling.toUpperCase().equals("N/A")) {
			switch(SelectIncreasedReplacementCostOnDwelling.toUpperCase()) {
				case "N": case "NONE": case "NO":							Log("Entered Increased Replacement Cost On Dwelling: None");
																		break;
			
				case "0.25": case "25% COV A": case "25%": case "25":	driver.findElement(By.xpath("//select[@id='Covg_10A']//option[contains(text(),'25')]")).click();
																			Log("Entered Increased Replacement Cost On Dwelling: " + new Select(increasedreplcostondwelling).getFirstSelectedOption().getText());
																		break;
				
				case "0.5": case "50% COV A": case "50%": case "50":	driver.findElement(By.xpath("//select[@id='Covg_10A']//option[contains(text(),'50')]")).click();
																			Log("Entered Increased Replacement Cost On Dwelling: " + new Select(increasedreplcostondwelling).getFirstSelectedOption().getText());
																		break;
			}
		}
	}
	
	//Returns whether "Increased Replacement Cost On Dwelling" drop down is populated
	public String ReturnSelectIncreasedReplacementCostOnDwelling() {
		if(new Select(increasedreplcostondwelling).getFirstSelectedOption().getText().isEmpty()) {
			return "N";
		}
		else {
			return new Select(increasedreplcostondwelling).getFirstSelectedOption().getText();	
		}
	}

	//Checks "Increased Repl Cost on Dwelling" check box 
	public void CheckIncreasedReplCostonDwelling(String CheckIncreasedReplCostonDwelling) {
		if(!CheckIncreasedReplCostonDwelling.toUpperCase().equals("N/A")) {
			if(increasedreplcostondwelling.isSelected()) {
				switch(CheckIncreasedReplCostonDwelling.toUpperCase()) {
					case "Y": case "YES":		Log("\"Increased Repl Cost on Dwelling\" check box marked");
											break;
											
					case "N": case "NO":	increasedreplcostondwelling.click();
												Log("\"Increased Repl Cost on Dwelling\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckIncreasedReplCostonDwelling.toUpperCase()) {
					case "Y": case "YES":	increasedreplcostondwelling.click();
												Log("\"Increased Repl Cost on Dwelling\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Increased Repl Cost on Dwelling\" check box NOT marked");
											break;
				}			
			}
		}
	}
	
	//Returns whether "Increased Repl Cost on Dwelling" check box is populated
	public String ReturnCheckIncreasedReplCostonDwelling() {
		if(increasedreplcostondwelling.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}
	
	//Selects or checks "Increased Replacement Cost On Dwelling" from drop down or Check Box
	public void SelectOrCheckIncreasedReplacementCostOnDwelling(String SelectIncreasedReplacementCostOnDwelling, String CheckIncreasedReplCostonDwelling) {
		if(!SelectIncreasedReplacementCostOnDwelling.toUpperCase().equals("N/A") || !CheckIncreasedReplCostonDwelling.toUpperCase().equals("N/A")) {
			if(driver.getPageSource().contains("Increased Replacement Cost On Dwelling:") || driver.getPageSource().contains("Increased Repl Cost on Dwelling:")) {
				switch(SelectIncreasedReplacementCostOnDwelling.toUpperCase()) {
					case "N": case "NONE": case "NO":							Log("Entered Increased Replacement Cost On Dwelling: None");
																				break;

					case "0.25": case "25% COV A": case "25%": case "25":	driver.findElement(By.xpath("//select[@id='Covg_10A']//option[contains(text(),'25')]")).click();
																				Log("Entered Increased Replacement Cost On Dwelling: " + new Select(increasedreplcostondwelling).getFirstSelectedOption().getText());
																			break;

					case "0.5": case "50% COV A": case "50%": case "50":	driver.findElement(By.xpath("//select[@id='Covg_10A']//option[contains(text(),'50')]")).click();
																				Log("Entered Increased Replacement Cost On Dwelling: " + new Select(increasedreplcostondwelling).getFirstSelectedOption().getText());
																			break;
				}
					Log("Entered Increased Replacement Cost On Dwelling: " + new Select(increasedreplcostondwelling).getFirstSelectedOption().getText());
			}
			else {
				if(increasedreplcostondwelling.isSelected()) {
					switch(CheckIncreasedReplCostonDwelling.toUpperCase()) {
						case "Y": case "YES":		Log("\"Increased Repl Cost on Dwelling\" check box marked");
												break;
												
						case "N": case "NO":	increasedreplcostondwelling.click();
													Log("\"Increased Repl Cost on Dwelling\" check box NOT marked");
												break;			
					}
				}
				else {
					switch(CheckIncreasedReplCostonDwelling.toUpperCase()) {
						case "Y": case "YES":	increasedreplcostondwelling.click();
													Log("\"Increased Repl Cost on Dwelling\" check box marked");
												break;
												
						case "N": case "NO":		Log("\"Increased Repl Cost on Dwelling\" check box NOT marked");
												break;
					}
				}
			}
		}
	}
	
	//Returns whether "Increased Replacement Cost On Dwelling" from drop down or Check Box
	public String ReturnIncreasedReplacementCostOnDwelling() {
		if(driver.getPageSource().contains("Increased Replacement Cost On Dwelling:") || driver.getPageSource().contains("Increased Repl Cost on Dwelling:")) {
			if(new Select(increasedreplcostondwelling).getFirstSelectedOption().getText().isEmpty()) {
				return "None";
			}
			else {
				return new Select(increasedreplcostondwelling).getFirstSelectedOption().getText();	
			}
		}
		else {
			if(increasedreplcostondwelling.isSelected()) {
				return "Y";
			}
			else {
				return "N";
			}	
		}
	}
		
	//Selects "Loss Assessment" drop down 
	public void SelectLossAssessment(String SelectLossAssessment) {
		if(!SelectLossAssessment.toUpperCase().equals("N/A")) {
			switch(SelectLossAssessment.toUpperCase()) {
				case "0": case "N": case "NONE": case "NO":						Log("Entered Loss Assessment: None");
																			break;
			
				case "5000": case "$5000": case "5,000": case "$5,000":		new Select(lossassessment).selectByVisibleText("$5000");
																				Log("Entered Loss Assessment: $5000");
																			break;
			
				case "10000": case "$10000": case "10,000": case "$10,000":	new Select(lossassessment).selectByVisibleText("$10,000");
																				Log("Entered Loss Assessment: $10,000");
																			break;
			}
		}
	}
	
	//Returns whether "Loss Assessment" drop down is populated
	public String ReturnLossAssessment() {
		if(new Select(lossassessment).getFirstSelectedOption().getText().isEmpty()) {
			return "None";
		}
		else {
			if(new Select(lossassessment).getFirstSelectedOption().getText().contains("Included")) {
				return "$1,000 (Included)";
			}
			else if(new Select(lossassessment).getFirstSelectedOption().getText().contains("$") && new Select(lossassessment).getFirstSelectedOption().getText().contains("5")) {
				return "$5,000";
			}
			else if(new Select(lossassessment).getFirstSelectedOption().getText().contains("$") && new Select(lossassessment).getFirstSelectedOption().getText().contains("10") && !(new Select(lossassessment).getFirstSelectedOption().getText().contains("Included"))) {
				return "$10,000";
			}
			else {
				return new Select(lossassessment).getFirstSelectedOption().getText();	
			}
		}
	}
	
	//Selects "Mold Buyback" from drop down
	public void SelectMoldBuyback(String SelectMoldBuyback) {
		if(!SelectMoldBuyback.toUpperCase().equals("N/A")) {
			switch(SelectMoldBuyback.toUpperCase()) {
				case "0": case "$0": case "N": case "NO": case "NONE":				new Select(moldbuyback).selectByVisibleText("None");
																						Log("Entered Mold Buyback: None");
																					break;
			
				case "0.25": case "25": case "25%": case "25% MOLD REMEDIATION":	new Select(moldbuyback).selectByValue("25");
																						Log("Entered Mold Buyback: " + new Select(moldbuyback).getFirstSelectedOption().getText());
																					break;
												
				case "0.5": case "50": case "50%": case "50% MOLD REMEDIATION":		new Select(moldbuyback).selectByValue("50");
																						Log("Entered Mold Buyback: " + new Select(moldbuyback).getFirstSelectedOption().getText());
																					break;

																							
				case "1": case "100": case "100%": case "100% MOLD REMEDIATION":	new Select(moldbuyback).selectByValue("100");
																						Log("Entered Mold Buyback: " + new Select(moldbuyback).getFirstSelectedOption().getText());
																					break;
																					
				default:																Log("Invalid value for SelectMoldBuyback()");
																					break;
			}
		}
	}
	
	//Returns whether "Mold Buyback" drop down is populated
	public String ReturnMoldBuyback() {
		if(new Select(moldbuyback).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(moldbuyback).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Mine Subsidence Coverage" drop down
	public void SelectMineSubsidenceCoverage(String SelectMineSubsidenceCoverage) {
		if(!SelectMineSubsidenceCoverage.toUpperCase().equals("N/A")) {
			if(driver.getPageSource().contains("Covg_35D")) {
				switch(SelectMineSubsidenceCoverage.toUpperCase()) {
					case "Y": case "YES":				new Select(minesubsidencecoveragea).selectByVisibleText("Yes");
															Log("Entered Earthquake Coverage: Yes");
														break;
														
					case "Y W/ALE": case "YES W/ALE":	new Select(minesubsidencecoveragea).selectByVisibleText("Yes w/ALE");
															Log("Entered Earthquake Coverage: Yes w/ALE");
														break;
		
					case "N": case "NO": case "NONE":	new Select(minesubsidencecoveragea).selectByVisibleText("No");
															Log("Entered Earthquake Coverage: No");
														break;
				}
			}
			else if(driver.getPageSource().contains("Covg_35G")) {
					Log("Mine Subsidence Coverage already entered: " + new Select(minesubsidencecoverageamandatory).getFirstSelectedOption().getText());				
			}
		}
	}
	
	//Returns whether "Mine Subsidence Coverage" drop down is populated
	public String ReturnMineSubsidenceCoverage() {
		if(driver.getPageSource().contains("Covg_35D")) {
			if(new Select(minesubsidencecoveragea).getFirstSelectedOption().getText().isEmpty()) {
				return "N/A";
			}
			else {
				return new Select(minesubsidencecoveragea).getFirstSelectedOption().getText();	
			}
		}
		else if(driver.getPageSource().contains("Covg_35G")) {
			if(new Select(minesubsidencecoverageamandatory).getFirstSelectedOption().getText().isEmpty()) {
				return "N/A";
			}
			else {
				return new Select(minesubsidencecoverageamandatory).getFirstSelectedOption().getText();
			}
		}
		return null;
	}
		
	//Checks "Mine Subsidence Coverage B" check box 
	public void CheckMineSubsidenceCoverageB(String CheckMineSubsidenceCoverageB) {
		if(!CheckMineSubsidenceCoverageB.toUpperCase().equals("N/A")) {
			if(minesubsidencecoverageb.isSelected()) {
				switch(CheckMineSubsidenceCoverageB.toUpperCase()) {
					case "Y": case "YES":		Log("\"Mine Subsidence Coverage B\" check box marked");
											break;
											
					case "N": case "NO":	minesubsidencecoverageb.click();
												Log("\"Mine Subsidence Coverage B\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckMineSubsidenceCoverageB.toUpperCase()) {
					case "Y": case "YES":	minesubsidencecoverageb.click();
												Log("\"Mine Subsidence Coverage B\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Mine Subsidence Coverage B\" check box NOT marked");
											break;
				}
			}
		}
	}
		
	//Returns whether "Mine Subsidence Coverage B" check box is populated
	public String ReturnMineSubsidenceCoverageB() {
		if(minesubsidencecoverageb.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}
	
	//Selects "Ordinance or Law" drop down 
	public void SelectOrdinanceOrLaw(String SelectOrdinanceOrLaw) {
		if(!SelectOrdinanceOrLaw.toUpperCase().equals("N/A")) {
			switch(SelectOrdinanceOrLaw.toUpperCase()) {
				case "0": case "NONE": case "N": case "NO":					driver.findElement(By.xpath("//select[@id='Covg_07']//option[contains(text(),'None')]")).click();
																			break;

				case "0.1": case "10%": case "10% (INCLUDED)": case "10":	driver.findElement(By.xpath("//select[@id='Covg_07']//option[contains(text(),'10')]")).click();
																			break;

				case "0.25": case "25%": case "25":							driver.findElement(By.xpath("//select[@id='Covg_07']//option[contains(text(),'25')]")).click();
																			break;

				case "0.50": case "50%": case "50":							driver.findElement(By.xpath("//select[@id='Covg_07']//option[contains(text(),'50')]")).click();
																			break;
			}
				Log("Entered Ordinance or Law: " + new Select(ol).getFirstSelectedOption().getText());
		}
	}
	
	//Returns whether "Ordinance or Law" drop down is populated
	public String ReturnSelectOrdinanceOrLaw() {
		if(new Select(ol).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			if(new Select(ol).getFirstSelectedOption().getText().contains("10")) {
				return "10% (Included)";
			}
			else {
				return new Select(ol).getFirstSelectedOption().getText();	
			}
		}
	}

	//Checks "Ordinance or Law" check box 
	public void CheckOrdinanceOrLaw(String CheckOrdinanceOrLaw) {
		if(!CheckOrdinanceOrLaw.toUpperCase().equals("N/A")) {
			if(ol.isSelected()) {
				switch(CheckOrdinanceOrLaw.toUpperCase()) {
					case "Y": case "YES":		Log("\"Ordinance or Law\" check box marked");
											break;
											
					case "N": case "NO":	ol.click();
												Log("\"Ordinance or Law\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckOrdinanceOrLaw.toUpperCase()) {
					case "Y": case "YES":	ol.click();
												Log("\"Ordinance or Law\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Ordinance or Law\" check box NOT marked");
											break;
				}			
			}
		}
	}
	
	//Returns whether "Ordinance or Law" check box is populated
	public String ReturnCheckOrdinanceOrLawCheckBox() {
		if(ol.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}
	
	//Selects or checks "Ordinance or Law" from drop down or Check Box
	public void SelectOrCheckOrdinanceOrLaw(String SelectOrdinanceOrLaw, String CheckOrdinanceOrLaw) {
		if(!SelectOrdinanceOrLaw.toUpperCase().equals("N/A") || !CheckOrdinanceOrLaw.toUpperCase().equals("N/A")) {
			if(driver.getPageSource().contains("Ordinance or Law:")) {
				switch(SelectOrdinanceOrLaw.toUpperCase()) {
					case "0": case "NONE": case "N": case "NO":					driver.findElement(By.xpath("//select[@id='Covg_07']//option[contains(text(),'None')]")).click();
																				break;
	
					case "0.1": case "10%": case "10% (INCLUDED)": case "10":	driver.findElement(By.xpath("//select[@id='Covg_07']//option[contains(text(),'10')]")).click();
																				break;
	
					case "0.25": case "25%": case "25":							driver.findElement(By.xpath("//select[@id='Covg_07']//option[contains(text(),'25')]")).click();
																				break;
							
					case "0.50": case "50%": case "50":							driver.findElement(By.xpath("//select[@id='Covg_07']//option[contains(text(),'50')]")).click();
																				break;
				}
					Log("Entered Ordinance or Law: " + new Select(ol).getFirstSelectedOption().getText());
			}
			else {
				if(ol.isSelected()) {
					switch(CheckOrdinanceOrLaw.toUpperCase()) {
						case "Y": case "YES":		Log("\"Ordinance or Law\" check box marked");
												break;
												
						case "N": case "NO":	ol.click();
													Log("\"Ordinance or Law\" check box NOT marked");
												break;			
					}
				}
				else {
					switch(CheckOrdinanceOrLaw.toUpperCase()) {
						case "Y": case "YES":	ol.click();
													Log("\"Ordinance or Law\" check box marked");
												break;
												
						case "N": case "NO":		Log("\"Ordinance or Law\" check box NOT marked");
												break;
					}
				}
			}
		}
	}
	
	//Returns whether "Ordinance or Law" from drop down or Check Box
	public String ReturnOrdinanceOrLaw() {
		if(driver.getPageSource().contains("Ordinance or Law:")) {
			if(new Select(ol).getFirstSelectedOption().getText().isEmpty()) {
				return "N/A";
			}
			else {
				if(new Select(ol).getFirstSelectedOption().getText().contains("10")) {
					return "10% (Included)";
				}
				else {
					return new Select(ol).getFirstSelectedOption().getText();
				}
			}
		}
		else {
			if(ol.isSelected()) {
				return "Y";
			}
			else {
				return "N";
			}	
		}
	}
	
	//Selects "Water Backup Basement" drop down 
	public void SelectWaterBackupBasement(String SelectWaterBackupBasement, String SelectBasement) {
		if(!SelectWaterBackupBasement.toUpperCase().equals("N/A")) {
			switch(SelectWaterBackupBasement.toUpperCase()) {
				case "N": case "NONE":										Log("Entered Water Backup - Basement: None");
																		break;
			
				case "5000": case "$5,000": case "5,000": case "$5000":		if(SelectBasement.toUpperCase().equals("NONE") || SelectBasement.toUpperCase().equals("N")) {
																				new Select(waterbackupbasement).selectByVisibleText("$5,000 - None");			
																			}
																			else if(SelectBasement.toUpperCase().equals("UNF") || SelectBasement.toUpperCase().equals("UNFINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$5,000 - Unfinished");												
																			}
																			else if(SelectBasement.toUpperCase().equals("PART") || SelectBasement.toUpperCase().equals("PARTIALLY FINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$5,000 - Partially Finished");
																			}
																			else if(SelectBasement.toUpperCase().equals("FIN") || SelectBasement.toUpperCase().equals("FINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$5,000 - Finished");												
																			}
																				Log("Entered Water Backup - Basement: " + new Select(waterbackupbasement).getFirstSelectedOption().getText());
																			break;
												
				case "10000": case "$10,000": case "10,000": case "$10000":	if(SelectBasement.toUpperCase().equals("NONE") || SelectBasement.toUpperCase().equals("N")) {
																				new Select(waterbackupbasement).selectByVisibleText("$10,000 - None");					
																			}
																			else if(SelectBasement.toUpperCase().equals("UNF") || SelectBasement.toUpperCase().equals("UNFINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$10,000 - Unfinished");													
																			}
																			else if(SelectBasement.toUpperCase().equals("PART") || SelectBasement.toUpperCase().equals("PARTIALLY FINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$10,000 - Partially Finished");
																			}
																			else if(SelectBasement.toUpperCase().equals("FIN") || SelectBasement.toUpperCase().equals("FINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$10,000 - Finished");												
																			}
																				Log("Entered Water Backup - Basement: " + new Select(waterbackupbasement).getFirstSelectedOption().getText());
																			break;
					
				case "25000": case "$25,000": case "25,000": case "$25000":	if(SelectBasement.toUpperCase().equals("NONE") || SelectBasement.toUpperCase().equals("N")) {
																				new Select(waterbackupbasement).selectByVisibleText("$25,000 - None");				
																			}
																			else if(SelectBasement.toUpperCase().equals("UNF") || SelectBasement.toUpperCase().equals("UNFINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$25,000 - Unfinished");													
																			}
																			else if(SelectBasement.toUpperCase().equals("PART") || SelectBasement.toUpperCase().equals("PARTIALLY FINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$25,000 - Partially Finished");
																			}
																			else if(SelectBasement.toUpperCase().equals("FIN") || SelectBasement.toUpperCase().equals("FINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$25,000 - Finished");												
																			}
																				Log("Entered Water Backup - Basement: " + new Select(waterbackupbasement).getFirstSelectedOption().getText());
																			break;		
												
				case "50000": case "$50,000": case "50,000": case "$50000":	if(SelectBasement.toUpperCase().equals("NONE") || SelectBasement.toUpperCase().equals("N")) {
																				new Select(waterbackupbasement).selectByVisibleText("$50,000 - None");				
																			}
																			else if(SelectBasement.toUpperCase().equals("UNF") || SelectBasement.toUpperCase().equals("UNFINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$50,000 - Unfinished");													
																			}
																			else if(SelectBasement.toUpperCase().equals("PART") || SelectBasement.toUpperCase().equals("PARTIALLY FINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$50,000 - Partially Finished");
																			}
																			else if(SelectBasement.toUpperCase().equals("FIN") || SelectBasement.toUpperCase().equals("FINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$50,000 - Finished");												
																			}
																				Log("Entered Water Backup - Basement: " + new Select(waterbackupbasement).getFirstSelectedOption().getText());
																			break;
			}
		}
	}
	
	//Returns whether "Water Backup Basement" drop down is populated
	public String ReturnWaterBackupBasement() {
		if(new Select(waterbackupbasement).getFirstSelectedOption().getText().isEmpty()) {
			return "None";
		}
		else {
			return new Select(waterbackupbasement).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Water Backup/Sump Pump" drop down 
	public void SelectWaterBackupSumpPump(String SelectWaterBackupSumpPump) {
		if(!SelectWaterBackupSumpPump.toUpperCase().equals("N/A")) {
			switch(SelectWaterBackupSumpPump.toUpperCase()) {
				case "N": case "NONE": case "NO":								Log("Entered Water Backup/Sump Pump: None");
																			break;
			
				case "5000": case "5,000": case "$5000": case "$5,000":		new Select(waterbackup).selectByVisibleText("$5,000");
																				Log("Entered Water Backup/Sump Pump: $5,000");
																			break;
											
												
				case "10000": case "10,000":case "$10000": case "$10,000":	new Select(waterbackup).selectByVisibleText("$10,000");
																				Log("Entered Water Backup/Sump Pump: $10,000");
																			break;
												
					
				case "25000": case "25,000":case "$25000": case "$25,000":	new Select(waterbackup).selectByVisibleText("$25,000");
																				Log("Entered Water Backup/Sump Pump: $25,000");
																			break;
			}
		}
	}
	
	//Returns whether "Water Backup/Sump Pump" drop down is populated
	public String ReturnSelectWaterBackupSumpPump() {
		if(new Select(waterbackup).getFirstSelectedOption().getText().isEmpty()) {
			return "N";
		}
		else {
			return new Select(waterbackup).getFirstSelectedOption().getText();	
		}
	}
	
	//Checks "Water Backup/Sump Pump" check box 
	public void CheckWaterBackupSumpPump(String CheckWaterBackupSumpPump) {
		if(!CheckWaterBackupSumpPump.toUpperCase().equals("N/A")) {
			if(waterbackup.isSelected()) {
				switch(CheckWaterBackupSumpPump.toUpperCase()) {
					case "Y": case "YES":		Log("\"Water Backup/Sump Pump\" check box marked");
											break;
											
					case "N": case "NO":	waterbackup.click();
												Log("\"Water Backup/Sump Pump\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckWaterBackupSumpPump.toUpperCase()) {
					case "Y": case "YES":	waterbackup.click();
												Log("\"Water Backup/Sump Pump\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Water Backup/Sump Pump\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Returns whether "Water Backup/Sump Pump" check box is populated
	public String ReturnCheckWaterBackupSumpPump() {
		if(waterbackup.isSelected()) {
			return "Y";
		}
		else {
			return "N";
		}
	}
	
	//Returns whether "Water Backup/Sump Pump" from drop down or Check Box
	public String ReturnWaterBackupSumpPump() {
		if(driver.getPageSource().contains("Water Backup/Sump Pump:")) {
			if(new Select(waterbackup).getFirstSelectedOption().getText().isEmpty()) {
				return "N/A";
			}
			else {
				return new Select(waterbackup).getFirstSelectedOption().getText();	
			}
		}
		else {
			if(waterbackup.isSelected()) {
				return "Y";
			}
			else {
				return "N";
			}	
		}
	}

	//Selects "Hobby Farm Endorsement" drop down 
	public void SelectHobbyFarmEndorsement(String SelectHobbyFarmEndorsement) {
		if(!SelectHobbyFarmEndorsement.toUpperCase().equals("N/A")) {
			switch(SelectHobbyFarmEndorsement.toUpperCase()) {
				case "N": case "NONE": case "NO":								Log("Entered Hobby Farm Endorsement: None");
																			break;
			
				case "100": case "$100,000": case "100000": case "$100000":		new Select(hobbyfarm).selectByVisibleText("$100,000");
																				Log("Entered Hobby Farm Endorsement: $100,000");
																			break;
				
				case "300": case "$300,000": case "300000":	case "$300000":	new Select(hobbyfarm).selectByVisibleText("$300,000");
																				Log("Entered Hobby Farm Endorsement: $300,000");
																			break;
															
				case "500": case "$500,000": case "500000": case "$500000":	new Select(hobbyfarm).selectByVisibleText("$500,000");
																				Log("Entered Hobby Farm Endorsement: $500,000");
																			break;
			}
		}
	}
	
	//Returns whether "Hobby Farm Endorsement" drop down is populated
	public String ReturnHobbyFarmEndorsement() {
		if(new Select(hobbyfarm).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(hobbyfarm).getFirstSelectedOption().getText();	
		}
	}

	//Selects "Qty Antiques" drop down 
	public void SelectQtyAntiques(String SelectQtyAntiques) {
		if(!SelectQtyAntiques.toUpperCase().equals("N/A")) {
			new Select(qtyantiques).selectByVisibleText(SelectQtyAntiques);
				Log("Entered Qty Antiques: " + SelectQtyAntiques);
		}
	}
	
	//Returns whether "Qty Antiques" drop down is populated
	public String ReturnQtyAntiques() {
		if(new Select(qtyantiques).getFirstSelectedOption().getText().equals("Qty")) {
			return "N/A";
		}
		else {
			return new Select(qtyantiques).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Antiques" text box 
	public void TypeAntiques(String TypeAntiques) {
		if(!TypeAntiques.toUpperCase().equals("N/A")) {
			antiques.clear();
			antiques.sendKeys(TypeAntiques);
				Log("Entered Antiques: " + TypeAntiques);
		}
	}
	
	//Returns the value in the "Antiques" text box 
	public String ReturnAntiques() {
		if(antiques.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return antiques.getAttribute("value");	
		}
	}

	//Populates "Antiques" section of SPP
	public void SPPAntiques(String SelectQtyAntiques, String TypeAntiques) {
		if(TypeAntiques.toUpperCase().equals("N/A") || TypeAntiques.toUpperCase().equals("N") || TypeAntiques.toUpperCase().equals("NONE") || TypeAntiques.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyAntiques(SelectQtyAntiques);
			TypeAntiques(TypeAntiques);
		}
	}
	
	//Selects "Qty Bicycles" drop down 
	public void SelectQtyBicycles(String SelectQtyBicycles) {
		if(!SelectQtyBicycles.toUpperCase().equals("N/A")) {
			new Select(qtybicycles).selectByVisibleText(SelectQtyBicycles);
				Log("Entered Qty Bicycles: " + SelectQtyBicycles);
		}
	}
	
	//Returns whether "Qty Bicycles" drop down is populated
	public String ReturnQtyBicycles() {
		if(new Select(qtybicycles).getFirstSelectedOption().getText().equals("Qty")) {
			return "N/A";
		}
		else {
			return new Select(qtybicycles).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Bicycles" text box 
	public void TypeBicycles(String TypeBicycles) {
		if(!TypeBicycles.toUpperCase().equals("N/A")) {
			bicycles.clear();
			bicycles.sendKeys(TypeBicycles);
				Log("Entered Bicycles: " + TypeBicycles);
		}
	}
	
	//Returns the value in the "Bicycles" text box 
	public String ReturnBicycles() {
		if(bicycles.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return bicycles.getAttribute("value");	
		}
	}
	
	//Populates "Bicycles" section of SPP
	public void SPPBicycles(String SelectQtyBicycles, String TypeBicycles) {
		if(TypeBicycles.toUpperCase().equals("N/A") || TypeBicycles.toUpperCase().equals("N") || TypeBicycles.toUpperCase().equals("NONE") || TypeBicycles.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyBicycles(SelectQtyBicycles);
			TypeBicycles(TypeBicycles);
		}
	}

	//Selects "Qty Cameras And Projection Equipment" drop down 
	public void SelectQtyCamerasAndProjectionEquipment(String SelectQtyCamerasAndProjectionEquipment) {
		if(!SelectQtyCamerasAndProjectionEquipment.toUpperCase().equals("N/A")) {
			new Select(qtycamerasandprojectionequip).selectByVisibleText(SelectQtyCamerasAndProjectionEquipment);
				Log("Entered Qty Cameras And Projection Equipment: " + SelectQtyCamerasAndProjectionEquipment);
		}
	}
	
	//Returns whether "Qty Cameras And Projection Equipment" drop down is populated
	public String ReturnQtyCamerasAndProjectionEquipment() {
		if(new Select(qtycamerasandprojectionequip).getFirstSelectedOption().getText().equals("Qty")) {
			return "N/A";
		}
		else {
			return new Select(qtycamerasandprojectionequip).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Cameras and Projection Equipment" text box 
	public void TypeCamerasandProjectionEquipment(String TypeCamerasandProjectionEquipment) {
		if(!TypeCamerasandProjectionEquipment.toUpperCase().equals("N/A")) {
			camerasandprojectionequip.clear();
			camerasandprojectionequip.sendKeys(TypeCamerasandProjectionEquipment);
				Log("Entered Cameras and Projection Equipment: " + TypeCamerasandProjectionEquipment);
		}
	}
	
	//Returns the value in the "Cameras and Projection Equipment" text box 
	public String ReturnCamerasandProjectionEquipment() {
		if(camerasandprojectionequip.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return camerasandprojectionequip.getAttribute("value");	
		}
	}
	
	//Populates "Cameras and Projection Equipment" section of SPP
	public void SPPCamerasAndProjectionEquipment(String SelectQtyCamerasAndProjectionEquipment, String TypeCamerasandProjectionEquipment) {
		if(TypeCamerasandProjectionEquipment.toUpperCase().equals("N/A") || TypeCamerasandProjectionEquipment.toUpperCase().equals("N") || TypeCamerasandProjectionEquipment.toUpperCase().equals("NONE") || TypeCamerasandProjectionEquipment.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyCamerasAndProjectionEquipment(SelectQtyCamerasAndProjectionEquipment);
			TypeCamerasandProjectionEquipment(TypeCamerasandProjectionEquipment);
		}
	}

	//Selects "Qty Coins" drop down 
	public void SelectQtyCoins(String SelectQtyCoins) {
		if(!SelectQtyCoins.toUpperCase().equals("N/A")) {
			new Select(qtycoins).selectByVisibleText(SelectQtyCoins);
				Log("Entered Qty Coins: " + SelectQtyCoins);
		}
	}
	
	//Returns whether "Qty Coins" drop down is populated
	public String ReturnQtyCoins() {
		if(new Select(qtycoins).getFirstSelectedOption().getText().equals("Qty")) {
			return "N/A";
		}
		else {
			return new Select(qtycoins).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Coins" text box 
	public void TypeCoins(String TypeCoins) {
		if(!TypeCoins.toUpperCase().equals("N/A")) {
			coins.clear();
			coins.sendKeys(TypeCoins);
				Log("Entered Coins: " + TypeCoins);
		}
	}
	
	//Returns the value in the "Coins" text box 
	public String ReturnCoins() {
		if(coins.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return coins.getAttribute("value");	
		}
	}
	
	//Populates "Coins" section of SPP
	public void SPPCoins(String SelectQtyCoins, String TypeCoins) {
		if(TypeCoins.toUpperCase().equals("N/A") || TypeCoins.toUpperCase().equals("N") || TypeCoins.toUpperCase().equals("NONE") || TypeCoins.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyCoins(SelectQtyCoins);
			TypeCoins(TypeCoins);
		}
	}

	//Selects "Qty Fine Arts Breakage" drop down 
	public void SelectQtyFineArtsBreakage(String SelectQtyFineArtsBreakage) {
		if(!SelectQtyFineArtsBreakage.toUpperCase().equals("N/A")) {
			new Select(qtyfineartsbreakage).selectByVisibleText(SelectQtyFineArtsBreakage);
				Log("Entered Qty Fine Arts Breakage: " + SelectQtyFineArtsBreakage);
		}
	}
	
	//Returns whether "Qty Fine Arts Breakage" drop down is populated
	public String ReturnQtyFineArtsBreakage() {
		if(new Select(qtyfineartsbreakage).getFirstSelectedOption().getText().equals("Qty")) {
			return "N/A";
		}
		else {
			return new Select(qtyfineartsbreakage).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Fine Arts Breakage" text box 
	public void TypeFineArtsBreakage(String TypeFineArtsBreakage) {
		if(!TypeFineArtsBreakage.toUpperCase().equals("N/A")) {
			fineartsbreakage.clear();
			fineartsbreakage.sendKeys(TypeFineArtsBreakage);
				Log("Entered Fine Arts Breakage: " + TypeFineArtsBreakage);
		}
	}
	
	//Returns the value in the "Fine Arts Breakage" text box 
	public String ReturnFineArtsBreakage() {
		if(fineartsbreakage.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return fineartsbreakage.getAttribute("value");	
		}
	}
	
	//Populates "Fine Arts Breakage" section of SPP
	public void SPPFineArtsBreakage(String SelectQtyFineArtsBreakage, String TypeFineArtsBreakage) {
		if(TypeFineArtsBreakage.toUpperCase().equals("N/A") || TypeFineArtsBreakage.toUpperCase().equals("N") || TypeFineArtsBreakage.toUpperCase().equals("NONE") || TypeFineArtsBreakage.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyFineArtsBreakage(SelectQtyFineArtsBreakage);
			TypeFineArtsBreakage(TypeFineArtsBreakage);
		}
	}

	//Selects "Qty Fine Arts No Breakage" drop down 
	public void SelectQtyFineArtsNoBreakage(String SelectQtyFineArtsNoBreakage) {
		if(!SelectQtyFineArtsNoBreakage.toUpperCase().equals("N/A")) {
			new Select(qtyfineartsnobreakage).selectByVisibleText(SelectQtyFineArtsNoBreakage);
				Log("Entered Qty Fine Arts No Breakage: " + SelectQtyFineArtsNoBreakage);
		}
	}
	
	//Returns whether "Qty Fine Arts No Breakage" drop down is populated
	public String ReturnQtyFineArtsNoBreakage() {
		if(new Select(qtyfineartsnobreakage).getFirstSelectedOption().getText().equals("Qty")) {
			return "N/A";
		}
		else {
			return new Select(qtyfineartsnobreakage).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Fine Arts No Breakage" text box 
	public void TypeFineArtsNoBreakage(String TypeFineArtsNoBreakage) {
		if(!TypeFineArtsNoBreakage.toUpperCase().equals("N/A")) {
			fineartsnobreakage.clear();
			fineartsnobreakage.sendKeys(TypeFineArtsNoBreakage);
				Log("Entered Fine Arts No Breakage: " + TypeFineArtsNoBreakage);
		}
	}
	
	//Returns the value in the "Fine Arts No Breakage" text box 
	public String ReturnFineArtsNoBreakage() {
		if(fineartsnobreakage.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return fineartsnobreakage.getAttribute("value");	
		}
	}
	
	//Populates "Fine Arts No Breakage" section of SPP
	public void SPPFineArtsNoBreakage(String SelectQtyFineArtsNoBreakage, String TypeFineArtsNoBreakage) {
		if(TypeFineArtsNoBreakage.toUpperCase().equals("N/A") || TypeFineArtsNoBreakage.toUpperCase().equals("N") || TypeFineArtsNoBreakage.toUpperCase().equals("NONE") || TypeFineArtsNoBreakage.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyFineArtsNoBreakage(SelectQtyFineArtsNoBreakage);
			TypeFineArtsNoBreakage(TypeFineArtsNoBreakage);
		}
	}

	//Selects "Qty Furs" drop down 
	public void SelectQtyFurs(String SelectQtyFurs) {
		if(!SelectQtyFurs.toUpperCase().equals("N/A")) {
			new Select(qtyfurs).selectByVisibleText(SelectQtyFurs);
				Log("Entered Qty Furs: " + SelectQtyFurs);
		}
	}
	
	//Returns whether "Qty Furs" drop down is populated
	public String ReturnQtyFurs() {
		if(new Select(qtyfurs).getFirstSelectedOption().getText().equals("Qty")) {
			return "N/A";
		}
		else {
			return new Select(qtyfurs).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Furs" text box 
	public void TypeFurs(String TypeFurs) {
		if(!TypeFurs.toUpperCase().equals("N/A")) {
			furs.clear();
			furs.sendKeys(TypeFurs);
				Log("Entered Furs: " + TypeFurs);
		}
	}
	
	//Returns the value in the "Furs" text box 
	public String ReturnFurs() {
		if(furs.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return furs.getAttribute("value");	
		}
	}
	
	//Populates "Furs" section of SPP
	public void SPPFurs(String SelectQtyFurs, String TypeFurs) {
		if(TypeFurs.toUpperCase().equals("N/A") || TypeFurs.toUpperCase().equals("N") || TypeFurs.toUpperCase().equals("NONE") || TypeFurs.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyFurs(SelectQtyFurs);
			TypeFurs(TypeFurs);
		}
	}

	//Selects "Qty Golfers Equipment" drop down 
	public void SelectQtyGolfersEquipment(String SelectQtyGolfersEquipment) {
		if(!SelectQtyGolfersEquipment.toUpperCase().equals("N/A")) {
			new Select(qtygolfersequipment).selectByVisibleText(SelectQtyGolfersEquipment);
				Log("Entered Qty Golfers Equipment: " + SelectQtyGolfersEquipment);
		}
	}
	
	//Returns whether "Qty Golfers Equipment" drop down is populated
	public String ReturnQtyGolfersEquipment() {
		if(new Select(qtygolfersequipment).getFirstSelectedOption().getText().equals("Qty")) {
			return "N/A";
		}
		else {
			return new Select(qtygolfersequipment).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Golfers Equipment" text box 
	public void TypeGolfersEquipment(String TypeGolfersEquipment) {
		if(!TypeGolfersEquipment.toUpperCase().equals("N/A")) {
			golfersequipment.clear();
			golfersequipment.sendKeys(TypeGolfersEquipment);
				Log("Entered Golfers Equipment: " + TypeGolfersEquipment);
		}
	}
	
	//Returns the value in the "Golfers Equipment" text box 
	public String ReturnGolfersEquipment() {
		if(golfersequipment.getAttribute("value").isEmpty()) {
				return "N/A";
		}
		else {
			return golfersequipment.getAttribute("value");	
		}
	}
	
	//Populates "Golfers Equipment" section of SPP
	public void SPPGolfersEquipment(String SelectQtyGolfersEquipment, String TypeGolfersEquipment) {
		if(TypeGolfersEquipment.toUpperCase().equals("N/A") || TypeGolfersEquipment.toUpperCase().equals("N") || TypeGolfersEquipment.toUpperCase().equals("NONE") || TypeGolfersEquipment.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyGolfersEquipment(SelectQtyGolfersEquipment);
			TypeGolfersEquipment(TypeGolfersEquipment);
		}
	}

	//Selects "Qty Guns Collectible" drop down 
	public void SelectQtyGunsCollectible(String SelectQtyGunsCollectible) {
		if(!SelectQtyGunsCollectible.toUpperCase().equals("N/A")) {
			new Select(qtygunscollectible).selectByVisibleText(SelectQtyGunsCollectible);
				Log("Entered Qty Guns Collectible: " + SelectQtyGunsCollectible);
		}
	}
	
	//Returns whether "Qty Guns Collectible" drop down is populated
	public String ReturnQtyGunsCollectible() {
		if(new Select(qtygunscollectible).getFirstSelectedOption().getText().equals("Qty")) {
			return "N/A";
		}
		else {
			return new Select(qtygunscollectible).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Guns Collectible" text box 
	public void TypeGunsCollectible(String TypeGunsCollectible) {
		if(!TypeGunsCollectible.toUpperCase().equals("N/A")) {
			gunscollectible.clear();
			gunscollectible.sendKeys(TypeGunsCollectible);
				Log("Entered Guns Collectible: " + TypeGunsCollectible);
		}
	}
	
	//Returns the value in the "Guns Collectible" text box 
	public String ReturnGunsCollectible() {
		if(gunscollectible.getAttribute("value").isEmpty()) {
				return "N/A";
		}
		else {
			return gunscollectible.getAttribute("value");	
		}
	}
	
	//Populates "Guns Collectible" section of SPP
	public void SPPGunsCollectible(String SelectQtyGunsCollectible, String TypeGunsCollectible) {
		if(TypeGunsCollectible.toUpperCase().equals("N/A") || TypeGunsCollectible.toUpperCase().equals("N") || TypeGunsCollectible.toUpperCase().equals("NONE") || TypeGunsCollectible.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyGunsCollectible(SelectQtyGunsCollectible);
			TypeGunsCollectible(TypeGunsCollectible);
		}
	}

	//Selects "Qty Guns Fired" drop down 
	public void SelectQtyGunsFired(String SelectQtyGunsFired) {
		if(!SelectQtyGunsFired.toUpperCase().equals("N/A")) {
			new Select(qtygunsfired).selectByVisibleText(SelectQtyGunsFired);
				Log("Entered Qty Guns Fired: " + SelectQtyGunsFired);
		}
	}
	
	//Returns whether "Qty Guns Fired" drop down is populated
	public String ReturnQtyGunsFired() {
		if(new Select(qtygunsfired).getFirstSelectedOption().getText().equals("Qty")) {
			return "N/A";
		}
		else {
			return new Select(qtygunsfired).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Guns Fired" text box 
	public void TypeGunsFired(String TypeGunsFired) {
		if(!TypeGunsFired.toUpperCase().equals("N/A")) {
			gunsfired.clear();
			gunsfired.sendKeys(TypeGunsFired);
				Log("Entered Guns Fired: " + TypeGunsFired);
		}
	}
	
	//Returns the value in the "Guns Fired" text box 
	public String ReturnGunsFired() {
		if(gunsfired.getAttribute("value").isEmpty()) {
				return "N/A";
		}
		else {
			return gunsfired.getAttribute("value");	
		}
	}
	
	//Populates "Guns Fired" section of SPP
	public void SPPGunsFired(String SelectQtyGunsFired, String TypeGunsFired) {
		if(TypeGunsFired.toUpperCase().equals("N/A") || TypeGunsFired.toUpperCase().equals("N") || TypeGunsFired.toUpperCase().equals("NONE") || TypeGunsFired.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyGunsFired(SelectQtyGunsFired);
			TypeGunsFired(TypeGunsFired);
		}
	}

	//Selects "Qty Jewelry" drop down 
	public void SelectQtyJewelry(String SelectQtyJewelry) {
		if(!SelectQtyJewelry.toUpperCase().equals("N/A")) {
			new Select(qtyjewelry).selectByVisibleText(SelectQtyJewelry);
				Log("Entered Qty Jewelry: " + SelectQtyJewelry);
		}
	}
	
	//Returns whether "Qty Jewelry" drop down is populated
	public String ReturnQtyJewelry() {
		if(new Select(qtyjewelry).getFirstSelectedOption().getText().equals("Qty")) {
			return "N/A";
		}
		else {
			return new Select(qtyjewelry).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Jewelry" text box 
	public void TypeJewelry(String TypeJewelry) {
		if(!TypeJewelry.toUpperCase().equals("N/A")) {
			jewelry.clear();
			jewelry.sendKeys(TypeJewelry);
				Log("Entered Jewelry: " + TypeJewelry);
		}
	}
	
	//Returns the value in the "Jewelry" text box 
	public String ReturnJewelry() {
		if(jewelry.getAttribute("value").isEmpty()) {
			return "0";
			}
		else {
			return jewelry.getAttribute("value");	
			}
	}
	
	//Populates "Jewelry" section of SPP
	public void SPPJewelry(String SelectQtyJewelry, String TypeJewelry) {
		if(TypeJewelry.toUpperCase().equals("N/A") || TypeJewelry.toUpperCase().equals("N") || TypeJewelry.toUpperCase().equals("NONE") || TypeJewelry.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyJewelry(SelectQtyJewelry);
			TypeJewelry(TypeJewelry);
		}
	}

	//Selects "Qty Misc Personal Property" drop down 
	public void SelectQtyMiscPersonalProperty(String SelectQtyMiscPersonalProperty) {
		if(!SelectQtyMiscPersonalProperty.toUpperCase().equals("N/A")) {
			new Select(qtymiscpersonalproperty).selectByVisibleText(SelectQtyMiscPersonalProperty);
				Log("Entered Qty Misc Personal Property: " + SelectQtyMiscPersonalProperty);
		}
	}
	
	//Returns whether "Qty Misc Personal Property" drop down is populated
	public String ReturnQtyMiscPersonalProperty() {
		if(new Select(qtymiscpersonalproperty).getFirstSelectedOption().getText().equals("Qty")) {
			return "N/A";
		}
		else {
			return new Select(qtymiscpersonalproperty).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Misc Personal Property" text box 
	public void TypeMiscPersonalProperty(String TypeMiscPersonalProperty) {
		if(!TypeMiscPersonalProperty.toUpperCase().equals("N/A")) {
			miscpersonalproperty.clear();
			miscpersonalproperty.sendKeys(TypeMiscPersonalProperty);
				Log("Entered Misc Personal Property: " + TypeMiscPersonalProperty);
		}
	}
	
	//Returns the value in the "Misc Personal Property" text box 
	public String ReturnMiscPersonalProperty() {
		if(miscpersonalproperty.getAttribute("value").isEmpty()) {
				return "N/A";
		}
		else {
			return miscpersonalproperty.getAttribute("value");	
		}
	}
	
	//Populates "Misc Personal Property" section of SPP
	public void SPPMiscPersonalProperty(String SelectQtyMiscPersonalProperty, String TypeMiscPersonalProperty) {
		if(TypeMiscPersonalProperty.toUpperCase().equals("N/A") || TypeMiscPersonalProperty.toUpperCase().equals("N") || TypeMiscPersonalProperty.toUpperCase().equals("NONE") || TypeMiscPersonalProperty.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyMiscPersonalProperty(SelectQtyMiscPersonalProperty);
			TypeMiscPersonalProperty(TypeMiscPersonalProperty);
		}
	}

	//Selects "Qty Musical Instruments" drop down 
	public void SelectQtyMusicalInstruments(String SelectQtyMusicalInstruments) {
		if(!SelectQtyMusicalInstruments.toUpperCase().equals("N/A")) {
			new Select(qtymusicalinstruments).selectByVisibleText(SelectQtyMusicalInstruments);
				Log("Entered Qty Musical Instruments: " + SelectQtyMusicalInstruments);
		}
	}
	
	//Returns whether "Qty Musical Instruments" drop down is populated
	public String ReturnQtyMusicalInstruments() {
		if(new Select(qtymusicalinstruments).getFirstSelectedOption().getText().equals("Qty")) {
			return "N/A";
		}
		else {
			return new Select(qtymusicalinstruments).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Musical Instruments" text box 
	public void TypeMusicalInstruments(String TypeMusicalInstruments) {
		if(!TypeMusicalInstruments.toUpperCase().equals("N/A")) {
			musicalinstruments.clear();
			musicalinstruments.sendKeys(TypeMusicalInstruments);
				Log("Entered Musical Instruments: " + TypeMusicalInstruments);
		}
	}
	
	//Returns the value in the "Musical Instruments" text box 
	public String ReturnMusicalInstruments() {
		if(musicalinstruments.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return musicalinstruments.getAttribute("value");	
		}
	}
	
	//Populates "Musical Instruments" section of SPP
	public void SPPMusicalInstruments(String SelectQtyMusicalInstruments, String TypeMusicalInstruments) {
		if(TypeMusicalInstruments.toUpperCase().equals("N/A") || TypeMusicalInstruments.toUpperCase().equals("N") || TypeMusicalInstruments.toUpperCase().equals("NONE") || TypeMusicalInstruments.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyMusicalInstruments(SelectQtyMusicalInstruments);
			TypeMusicalInstruments(TypeMusicalInstruments);
		}
	}

	//Selects "Qty Other Sports Equipment" drop down 
	public void SelectQtyOtherSportsEquipment(String SelectQtyOtherSportsEquipment) {
		if(!SelectQtyOtherSportsEquipment.toUpperCase().equals("N/A")) {
			new Select(qtyothersportsequip).selectByVisibleText(SelectQtyOtherSportsEquipment);
				Log("Entered Qty Other Sports Equipment: " + SelectQtyOtherSportsEquipment);
		}
	}
	
	//Returns whether "Qty Other Sports Equipment" drop down is populated
	public String ReturnQtyOtherSportsEquipment() {
		if(new Select(qtyothersportsequip).getFirstSelectedOption().getText().equals("Qty")) {
			return "N/A";
		}
		else {
			return new Select(qtyothersportsequip).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Other Sports Equipment" text box 
	public void TypeOtherSportsEquipment(String TypeOtherSportsEquipment) {
		if(!TypeOtherSportsEquipment.toUpperCase().equals("N/A")) {
			othersportsequip.clear();
			othersportsequip.sendKeys(TypeOtherSportsEquipment);
				Log("Entered Other Sports Equipment: " + TypeOtherSportsEquipment);
		}
	}
	
	//Returns the value in the "Other Sports Equipment" text box 
	public String ReturnOtherSportsEquipment() {
		if(othersportsequip.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return othersportsequip.getAttribute("value");	
		}
	}
	
	//Populates "Other Sports Equipment" section of SPP
	public void SPPOtherSportsEquipment(String SelectQtyOtherSportsEquipment, String TypeOtherSportsEquipment) {
		if(TypeOtherSportsEquipment.toUpperCase().equals("N/A") || TypeOtherSportsEquipment.toUpperCase().equals("N") || TypeOtherSportsEquipment.toUpperCase().equals("NONE") || TypeOtherSportsEquipment.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyOtherSportsEquipment(SelectQtyOtherSportsEquipment);
			TypeOtherSportsEquipment(TypeOtherSportsEquipment);
		}
	}

	//Selects "Qty Silverware" drop down 
	public void SelectQtySilverware(String SelectQtySilverware) {
		if(!SelectQtySilverware.toUpperCase().equals("N/A")) {
			new Select(qtysilverware).selectByVisibleText(SelectQtySilverware);
				Log("Entered Qty Silverware: " + SelectQtySilverware);
		}
	}
	
	//Returns whether "Qty Silverware" drop down is populated
	public String ReturnQtySilverware() {
		if(new Select(qtysilverware).getFirstSelectedOption().getText().equals("Qty")) {
			return "N/A";
		}
		else {
			return new Select(qtysilverware).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Silverware" text box 
	public void TypeSilverware(String TypeSilverware) {
		if(!TypeSilverware.toUpperCase().equals("N/A")) {
			silverware.clear();
			silverware.sendKeys(TypeSilverware);
				Log("Entered Silverware: " + TypeSilverware);
		}
	}
	
	//Returns the value in the "Silverware" text box 
	public String ReturnSilverware() {
		if(silverware.getAttribute("value").isEmpty()) {
				return "N/A";
		}
		else {
			return silverware.getAttribute("value");	
		}
	}
	
	//Populates "Silverware" section of SPP
	public void SPPSilverware(String SelectQtySilverware, String TypeSilverware) {
		if(TypeSilverware.toUpperCase().equals("N/A") || TypeSilverware.toUpperCase().equals("N") || TypeSilverware.toUpperCase().equals("NONE") || TypeSilverware.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtySilverware(SelectQtySilverware);
			TypeSilverware(TypeSilverware);
		}
	}

	//Selects "Qty Stamps" drop down 
	public void SelectQtyStamps(String SelectQtyStamps) {
		if(!SelectQtyStamps.toUpperCase().equals("N/A")) {
			new Select(qtystamps).selectByVisibleText(SelectQtyStamps);
				Log("Entered Qty Stamps: " + SelectQtyStamps);
		}
	}
	
	//Returns whether "Qty Stamps" drop down is populated
	public String ReturnQtyStamps() {
		if(new Select(qtystamps).getFirstSelectedOption().getText().equals("Qty")) {
			return "N/A";
		}
		else {
			return new Select(qtystamps).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Stamps" text box 
	public void TypeStamps(String TypeStamps) {
		if(!TypeStamps.toUpperCase().equals("N/A")) {
			stamps.clear();
			stamps.sendKeys(TypeStamps);
				Log("Entered Stamps: " + TypeStamps);
		}
	}
	
	//Returns the value in the "Stamps" text box 
	public String ReturnStamps() {
		if(stamps.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return stamps.getAttribute("value");	
		}
	}
	
	//Populates "Stamps" section of SPP
	public void SPPStamps(String SelectQtyStamps, String TypeStamps) {
		if(TypeStamps.toUpperCase().equals("N/A") || TypeStamps.toUpperCase().equals("N") || TypeStamps.toUpperCase().equals("NONE") || TypeStamps.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyStamps(SelectQtyStamps);
			TypeStamps(TypeStamps);
		}
	}

	//Clicks the "Back" button
	public void ClickBack() {
		back.click();
			Log("Clicked the \"Back\" button on the Policy Rating 2 page");
	}

	//Clicks the "Next" button
	public void ClickNext() {
		next.click();
			Log("Clicked the \"Next\" button on the Policy Rating 2 page");
	}

	//Clicks the "Save" button
	public void ClickSave() {
		save.click();
			Log("Clicked the \"Save\" button on the Policy Rating 2 page");
	}

	//Clicks the "Override" button
	public void ClickOverride() {
		override.click();
			Log("Clicked the \"Override\" button on the Policy Rating 2 page");
	}

	//Checks to make sure if on same page after hitting next to apply override
	public String ClickNextAndConfirmEdits(String casenum, String identifier) {
		ClickNext();
		if(driver.getPageSource().contains("Policy Rating Page 2")) {
				Log(casenum + "-" + identifier + ": edits on page read as \"" + edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," ") + "\"");
			ClickOverride();
			if(driver.getPageSource().contains("Policy Rating Page 2")) {
					Log(casenum + "-" + identifier + ": There were edits that could not be overridden through on Policy Rating Page 2." + edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," "));
				return "edits";
			}
			else {
					Log("Overrode through Rating Page 2");
				return "override";
			}
		}
		else {
			return "nooverride";
		}
	}
	
	//Returns Edits
	public String ReturnEdits(String log) {
		String edittext = edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," ") + "\"";	
		if(log.toUpperCase().equals("Y") || log.toUpperCase().equals("YES")) {
			Log("Policy Rating Page 2 edits read: " + edittext);
		}
		return edittext;
	}

	//Returns the PolicyID
	public String ReturnPolicyID() {
		String id = policyid.getText().substring(0, policyid.getText().indexOf(" "));		
			Log("PolicyID is " + id);
		return id;
	}
}