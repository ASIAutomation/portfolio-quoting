package Automation.IAQ.pages;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.IAQ.testBase.TestBase;

public class CoverageBillPlans extends TestBase {
	
	public static final Logger log = Logger.getLogger(CoverageBillPlans.class.getName());
	
	WebDriver driver;
	String homeshieldtype;
	public static int sppi;
	
	@FindBy(xpath="//a[@role='button' and @packageid='hs']")//Check Box
	WebElement hs;
	
	@FindBy(xpath="//a[@role='button' and @packageid='hsp']")//Check Box
	WebElement hsp;
	
	@FindBy(xpath="//a[@role='button' and @packageid='pla']")//Check Box
	WebElement plat;
	
	@FindBy(xpath="//a[@role='button' and @packageid='hsr']")//Check Box
	WebElement hsr;
	
	@FindBy(xpath="//input[contains(@id,'DwellingCoverage')]")//Text Box
	WebElement dwellcovg;
	
	@FindBy(xpath="//input[contains(@id,'ReplacementCostEstimate')]")//Text Box
	WebElement rpc;
	
	@FindBy(xpath="//select[contains(@id,'OtherStructures')]")//Drop Down
	WebElement otherstructures;
	
	@FindBy(xpath="//select[contains(@id,'PersonalProperty')]")//Drop Down
	WebElement selectpersonalprop;
	
	@FindBy(xpath="//input[contains(@id,'PersonalProperty')]")//Drop Down
	WebElement typepersonalprop;
	
	@FindBy(xpath="//select[contains(@id,'LossOfUse')]")//Drop Down
	WebElement lossofuse;
	
	@FindBy(xpath="//select[contains(@id,'PersonalLiability')]")//Drop Down
	WebElement personalliab;
	
	@FindBy(xpath="//select[contains(@id,'MedicalPaymentsLimit')]")//Drop Down
	WebElement medicalpay;
	
	@FindBy(xpath="//select[contains(@id,'AllOtherPerils')]")//Drop Down
	WebElement allotherperils;
	
	@FindBy(xpath="//select[contains(@id,'WindHailDeductible')]")//Drop Down
	WebElement windhaildeduct;
	
	@FindBy(xpath="//select[contains(@id,'EarthquakeCoverage')]")//Drop Down
	WebElement eqcovg;
	
	@FindBy(xpath="//select[contains(@id,'EarthquakeDeductible')]")//Drop Down
	WebElement eqdeduct;
	
	@FindBy(xpath="//select[contains(@id,'EarthquakeFoundationType')]")//Drop Down
	WebElement eqfoundationtype;
	
	@FindBy(xpath="//select[contains(@id,'EarthquakeSecuredWaterHeater')]")//Drop Down
	WebElement eqsecurewaterheater;
	
	@FindBy(xpath="//select[contains(@id,'GolfCartPhysicalDamageLiability')]")//Drop Down
	WebElement golfcart;
	
	@FindBy(xpath="//select[contains(@id,'IncreaseJewelryWatchesFur')]")//Drop Down
	WebElement increasejwf;
	
	@FindBy(xpath="//select[contains(@id,'IncreasedReplacementCost')]")//Drop Down
	WebElement selectincreasereplccost;
	
	@FindBy(xpath="//input[contains(@id,'IncreasedReplacementCost')]")//Drop Down
	WebElement checkincreasereplccost;
	
	@FindBy(xpath="//select[contains(@id,'AnimalLiability')]")//Drop Down
	WebElement animalliab;
	
	@FindBy(xpath="//input[contains(@id,'HomeComputerCoverage')]")//Text Box
	WebElement typehomecomputer;
	
	@FindBy(xpath="//select[contains(@id,'HomeComputerCoverage')]")//Drop Down
	WebElement selecthomecomputer;
	
	@FindBy(xpath="//select[contains(@id,'LossAssessment')]")//Drop Down
	WebElement lossassessment;
	
	@FindBy(xpath="//select[contains(@id,'OrdinanceLaw')]")//Drop Down
	WebElement ordlaw;
	
	@FindBy(xpath="//select[contains(@id,'WaterBackupBasement')]")//Drop Down
	WebElement selectwaterbackupbasement;
	
	@FindBy(xpath="//select[contains(@id,'AddWaterBackupBasement')]")//Drop Down
	WebElement additionalwaterbackupbasement;
	
	@FindBy(xpath="//select[contains(@id,'WaterBackupSumpPumpFlag')]")//Check Box
	WebElement selectwaterbackupsumppump;
	
	@FindBy(xpath="//select[contains(@id,'WaterBackupSumpLimit')]")//Check Box
	WebElement selectwaterbackupsumppumplimit;
	
	@FindBy(xpath="//select[contains(@id,'MatchUndamagedSidingRoofing')]")//Drop Down
	WebElement matchundamagedsidingroofing;
	
	@FindBy(xpath="//select[contains(@id,'MineSubsidenceA')]")//Drop Down
	WebElement minesubsidencea;
	
	@FindBy(xpath="//select[contains(@id,'MineSubsidenceB')]")//Drop Down
	WebElement minesubsidenceb;
	
	@FindBy(xpath="//select[contains(@id,'MoldBuyBack')]")//Drop Down
	WebElement moldbuyback;
	
	@FindBy(xpath="//select[contains(@id,'HobbyFarming')]")//Drop Down
	WebElement hobbyfarming;
	
	@FindBy(xpath="//input[contains(@id,'LimitedWaterDamage')]")//Check Box
	WebElement limitedwaterdamg;
	
	@FindBy(xpath="//input[contains(@id,'PersonalInjury')]")//Check Box
	WebElement personalinjury;
	
	@FindBy(xpath="//input[contains(@id,'PersonalPropertyReplacementCost')]")//Check Box
	WebElement personalpropreplccost;
	
	@FindBy(xpath="//input[contains(@id,'SpecialPersonalProperty')]")//Check Box
	WebElement specialpersonalprop;
	
	@FindBy(xpath="//input[contains(@id,'SinkholeCoverage')]")//Check Box
	WebElement sinkhole;
	
	@FindBy(xpath="//input[contains(@id,'LimitedFoundationAndSlabBuyback')]")//Check Box
	WebElement limitedfoundationandslabbuyback;
	
	@FindBy(xpath="//input[contains(@id,'NonStructuralHailLossLimitationFlag')]")//Check Box
	WebElement nshl;
	
	@FindBy(xpath="//select[contains(@id,'Embedded_Questions_List_Item')]")//Drop Down
	WebElement sppitem;
	
	@FindBy(xpath="//select[contains(@id,'Embedded_Questions_List_Quantity')]")//Drop Down
	WebElement sppquantity;
	
	@FindBy(xpath="//input[contains(@id,'Embedded_Questions_List_Value')]")//Drop Down
	WebElement sppvalue;
	
	@FindBy(xpath="//span[contains(text(),'Add New Item')]")//Button
	WebElement addnewitem;
	
	@FindBy(name="M01N")//Radio Button
	WebElement mb;
	
	@FindBy(name="M02N")//Radio Button
	WebElement ipp;
	
	@FindBy(name="M03N")//Radio Button
	WebElement ifp;
	
	@FindBy(xpath="//span[contains(text(),'Recalculate')]/parent::*")//Submission Button 
	WebElement recalculate;
	
	@FindBy(xpath="//div[@class='pif-total-wrapper']")//Text
	WebElement premium;
	
	@FindBy(xpath="//span[@class='fw400' and contains(text(),'PORTFOLIO')]")//Submission Button
	WebElement submit;
	
	@FindBy(xpath="//div[contains(text(),'Customer')]")//Text
	WebElement customertextheader;
	
	@FindBy(xpath="//span[contains(text(),'Home Computer Coverage')]")//Text
	WebElement hcctext;
	
	@FindBy(xpath="//span[contains(text(),'Options')]")//Button
	WebElement options;
	
	@FindBy(xpath="//span[contains(text(),'Save & Exit')]")//Button
	WebElement save;
	
	@FindBy(xpath="//span[@class='quote-number-text']")//Button
	WebElement quoteid;

	//Constructor
	public CoverageBillPlans(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}	
	
	//Clicks the "CUSTOMER" header at top of the page.
	public void ClickCustomerTextHeader() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", customertextheader);
			Log("Clicked the \"CUSTOMER\" text header");
	}	
	
	//Clicks the "Home Computer Coverage" header at top of the page.
	public void ClickHomeComputerCoverageTextHeader() {		 	
		hcctext.click();
			Log("Clicked the \"Home Computer Coverage\" text header");
	}
	
	//Checks the correct package check box
	public void CheckPackage(String CheckPackage) throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		homeshieldtype = CheckPackage;
		if(!CheckPackage.toUpperCase().equals("N/A")) {
			switch(homeshieldtype.toUpperCase()) {
				case "HS": 				homeshieldtype = "HomeShield";
										break;
				
				case "HSP": 			homeshieldtype = "HomeShield Plus";
										break;
				
				case "PLAT": case "P":	homeshieldtype = "Platinum";
										break;
				
				case "HSR":				homeshieldtype = "HomeShield R";
										break;
				
			}
			switch(CheckPackage.toUpperCase()) {		 	
				case "HS":							executor.executeScript("arguments[0].click()", hs);
														Log("\"HomeShield\" check box marked");
														Pause(18000);
												  	break;
				  		  	
				case "HSP":							executor.executeScript("arguments[0].click()", hsp);
														Log("\"HomeShield Plus\" check box marked");
														Pause(18000);
													break;
							
				case "PLAT": case "P":				executor.executeScript("arguments[0].click()", plat);
														Log("\"Platinum\" check box marked");
														Pause(18000);
													break;
				
				case "HSR":							executor.executeScript("arguments[0].click()", hsr);
														Log("\"HomeShield R\" check box marked");
														Pause(18000);
													break;
				  		  	
				case "N": case "NO": case "NONE":		Log("No packages selected");
													break;
				
				default:								Log("Invalid value for CheckPackage()");
													break;
			}
		}
	}
	
	//Types into "Dwelling Coverage" text box
	public void TypeDwellingCoverage(String TypeDwellingCoverage) {
		if(!TypeDwellingCoverage.toUpperCase().equals("N/A")) {
			String dwellcovgvalue = TypeDwellingCoverage.replace("$", "").replace(",", "");
			dwellcovg.clear();
			dwellcovg.sendKeys(dwellcovgvalue);
				Log("Entered Dwelling Coverage: " + TypeDwellingCoverage);
		}
	}
	
	//Returns the value in the typed "Replacement Cost" field
	public String ReturnReplacementCost() {
		if(rpc.getAttribute("ng-reflect-model").isEmpty()) {
			return "N/A";
		}
		else {
			return rpc.getAttribute("ng-reflect-model");	
		}
	}
	
	//Selects "Other Structures" from drop down
	public void SelectOtherStructures(String SelectOtherStructures) {
		if(!SelectOtherStructures.toUpperCase().equals("N/A")) {
			switch(SelectOtherStructures.toUpperCase()) {
				case "0.02": case "2% COV A": case "2% COV A (INCLUDED)": case "2": case "2%":		driver.findElement(By.xpath("//select[contains(@id,'OtherStructures')]//option[contains(text(),'2') and not(contains(text(),'20'))]")).click();
																										Log("Entered Other Structures: " + new Select(otherstructures).getFirstSelectedOption().getText());
																									break;
															
				case "0.1": case "10% COV A": case "10": case "10%": case "10% COV A (INCLUDED)":	driver.findElement(By.xpath("//select[contains(@id,'OtherStructures')]//option[contains(text(),'10')]")).click();
																										Log("Entered Other Structures: " + new Select(otherstructures).getFirstSelectedOption().getText());
																									break;
																				
				case "0.15": case "15% COV A": case "15": case "15%":								driver.findElement(By.xpath("//select[contains(@id,'OtherStructures')]//option[contains(text(),'15')]")).click();
																										Log("Entered Other Structures: " + new Select(otherstructures).getFirstSelectedOption().getText());
																									break;
															
				case "0.2": case "20% COV A": case "20": case "20%":								driver.findElement(By.xpath("//select[contains(@id,'OtherStructures')]//option[contains(text(),'20')]")).click();
																										Log("Entered Other Structures: " + new Select(otherstructures).getFirstSelectedOption().getText());
																									break;
				
				case "0.3": case "30% COV A": case "30": case "30%":            					driver.findElement(By.xpath("//select[contains(@id,'OtherStructures')]//option[contains(text(),'30')]")).click();
																										Log("Entered Other Structures: " + new Select(otherstructures).getFirstSelectedOption().getText());
																									break;
				
				case "0.4": case "40% COV A": case "40": case "40%":            					driver.findElement(By.xpath("//select[contains(@id,'OtherStructures')]//option[contains(text(),'40')]")).click();
																										Log("Entered Other Structures: " + new Select(otherstructures).getFirstSelectedOption().getText());
																									break;
				
				case "0.5": case "50% COV A": case "50": case "50%":            					driver.findElement(By.xpath("//select[contains(@id,'OtherStructures')]//option[contains(text(),'50')]")).click();
																										Log("Entered Other Structures: " + new Select(otherstructures).getFirstSelectedOption().getText());
																									break;
			    																					
				default:																				Log("Invalid value for SelectOtherStructures()");
																									break;
			}
		}
	}
	
	//Selects "Personal Property" from drop down
	public void SelectPersonalProperty(String SelectPersonalProperty) throws InterruptedException {
		if(!SelectPersonalProperty.toUpperCase().equals("N/A")) {
			if(selectpersonalprop.isEnabled()) {
				switch(SelectPersonalProperty.toUpperCase()) {
					case "0": case "0% COV A": case "0%":							new Select(selectpersonalprop).selectByVisibleText("0% Cov A");
																						Log("Entered Personal Property: 0% Cov A");
																					break;
																					
					case "0.05": case "5% COV A": case "5": case "5%":				new Select(selectpersonalprop).selectByVisibleText("5% Cov A");
																						Log("Entered Personal Property: 5% Cov A");
																					break;
																					
					case "0.10": case "10% COV A": case "10": case "10%":			new Select(selectpersonalprop).selectByVisibleText("10% Cov A");
																						Log("Entered Personal Property: 10% Cov A");
																					break;
																					
					case "0.15": case "15% COV A": case "15": case "15%":			new Select(selectpersonalprop).selectByVisibleText("15% Cov A");
																						Log("Entered Personal Property: 15% Cov A");
																					break;
																					
					case "0.20": case "20% COV A": case "20": case "20%":			new Select(selectpersonalprop).selectByVisibleText("20% Cov A");
																						Log("Entered Personal Property: 20% Cov A");
																					break;
												
					case "0.25": case "25% COV A": case "25": case "25%":			new Select(selectpersonalprop).selectByVisibleText("25% Cov A");
																						Log("Entered Personal Property: 25% Cov A");
																					break;
																					
					case "0.30": case "30% COV A": case "30": case "30%":			new Select(selectpersonalprop).selectByVisibleText("30% Cov A");
																						Log("Entered Personal Property: 30% Cov A");
																					break;
																					
					case "0.35": case "35% COV A": case "35": case "35%":			new Select(selectpersonalprop).selectByVisibleText("35% Cov A");
																						Log("Entered Personal Property: 35% Cov A");
																					break;
																					
					case "0.40": case "40% COV A": case "40": case "40%":			new Select(selectpersonalprop).selectByVisibleText("40% Cov A");
																						Log("Entered Personal Property: 40% Cov A");
																					break;
																					
					case "0.45": case "45% COV A": case "45": case "45%":			new Select(selectpersonalprop).selectByVisibleText("45% Cov A");
																						Log("Entered Personal Property: 45% Cov A");
																					break;
																
					case "0.5": case "50% COV A (INCLUDED)": case "50": case "50%":	new Select(selectpersonalprop).selectByVisibleText("50% Cov A (Included)");
																						Log("Entered Personal Property: 50% Cov A (Included)");
																					break;
																					
					case "0.55": case "55% COV A": case "55": case "55%":			new Select(selectpersonalprop).selectByVisibleText("55% Cov A");
																						Log("Entered Personal Property: 55% Cov A");
																					break;
																					
					case "0.60": case "60% COV A": case "60": case "60%":			new Select(selectpersonalprop).selectByVisibleText("60% Cov A");
																						Log("Entered Personal Property: 60% Cov A");
																					break;
																					
					case "0.65": case "65% COV A": case "65": case "65%":			new Select(selectpersonalprop).selectByVisibleText("65% Cov A");
																						Log("Entered Personal Property: 65% Cov A");
																					break;
													
					case "0.7": case "70% COV A": case "70": case "70%":			new Select(selectpersonalprop).selectByVisibleText("70% Cov A");
																						Log("Entered Personal Property: 70% Cov A");
																					break;
																					
					default:															Log("Invalid value for SelectPersonalProperty()");
																					break;
				}
			}
			else {
					Log("Personal Property Prefilled with: " + new Select(selectpersonalprop).getFirstSelectedOption().getText() + ". This is included with the " + homeshieldtype + " package");			
			}
		}
	}

	//Types into "Personal Property" text box
	public void TypePersonalProperty(String TypePersonalProperty) {
		if(!TypePersonalProperty.toUpperCase().equals("N/A")) {
			String typepersonalpropvalue = TypePersonalProperty.replace("$", "").replace(",", "");
			typepersonalprop.clear();
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].value='" + typepersonalpropvalue + "';", typepersonalprop);
				Log("Entered Personal Property: " + TypePersonalProperty);
		}
	}
	
	//Selects "Loss of Use" from drop down
	public void SelectLossofUse(String SelectLossofUse) {
		if(!SelectLossofUse.toUpperCase().equals("N/A")) {
			switch(SelectLossofUse.toUpperCase()) {
				case "0.1": case "10% COV A (INCLUDED)": case "10% COV A": case "10": case "10%":	driver.findElement(By.xpath("//select[contains(@id,'LossOfUse')]//option[contains(text(),'10')]")).click();
																										Log("Loss of Use Prefilled with: " + new Select(lossofuse).getFirstSelectedOption().getText());
																									break;
																									
				case "0.15": case "15% COV A": case "15": case "15%":								driver.findElement(By.xpath("//select[contains(@id,'LossOfUse')]//option[contains(text(),'15')]")).click();
																										Log("Loss of Use Prefilled with: " + new Select(lossofuse).getFirstSelectedOption().getText());
																									break;				
																									
				case "0.2": case "20% COV A (INCLUDED)": case "20% COV A": case "20": case "20%":	driver.findElement(By.xpath("//select[contains(@id,'LossOfUse')]//option[contains(text(),'20')]")).click();
																										Log("Loss of Use Prefilled with: " + new Select(lossofuse).getFirstSelectedOption().getText());
																									break;
																									
				case "0.25": case "25% COV A": case "25": case "25%":								driver.findElement(By.xpath("//select[contains(@id,'LossOfUse')]//option[contains(text(),'25')]")).click();
																										Log("Loss of Use Prefilled with: " + new Select(lossofuse).getFirstSelectedOption().getText());
																									break;
																									
				case "0.30": case "30% COV A": case "30": case "30%":								driver.findElement(By.xpath("//select[contains(@id,'LossOfUse')]//option[contains(text(),'30')]")).click();
																										Log("Loss of Use Prefilled with: " + new Select(lossofuse).getFirstSelectedOption().getText());
																									break;
																									
				default:																				Log("Invalid value for SelectLossofUse()");
																									break;
			}
		}
	}
	
	//Selects "All Other Perils" from drop down
	public void SelectAllOtherPerils(String SelectAllOtherPerils) {
		if(!SelectAllOtherPerils.toUpperCase().equals("N/A")) {
			switch(SelectAllOtherPerils.toUpperCase()) {
			 	case "0.01": case "1": case "1% COV A": case "1%":						new Select(allotherperils).selectByValue("1%");
																							Log("Entered All Other Perils: " + new Select(allotherperils).getFirstSelectedOption().getText());
																						break;
																						
			 	case "0.02": case "2": case "2% COV A": case "2%":						new Select(allotherperils).selectByValue("2%");
																							Log("Entered All Other Perils: " + new Select(allotherperils).getFirstSelectedOption().getText());
																						break;
																						
			 	case "0.03": case "3": case "3% COV A": case "3%":						new Select(allotherperils).selectByValue("3%");
																							Log("Entered All Other Perils: " + new Select(allotherperils).getFirstSelectedOption().getText());
																						break;
																						
			 	case "0.05": case "5": case "5% COV A": case "5%":						new Select(allotherperils).selectByValue("5%");
																							Log("Entered All Other Perils: " + new Select(allotherperils).getFirstSelectedOption().getText());
																						break;
														
				case "250": case "$250":												new Select(allotherperils).selectByValue("250");
																							Log("Entered All Other Perils: " + new Select(allotherperils).getFirstSelectedOption().getText());
																						break;						
														
				case "500": case "$500": case "$500 INCLUDED": case "$500 (INCLUDED)":	new Select(allotherperils).selectByValue("500");
																							Log("Entered All Other Perils: " +  new Select(allotherperils).getFirstSelectedOption().getText());
																						break;
																		
				case "1000": case "$1,000": case "1,000": case "$1000":					new Select(allotherperils).selectByValue("1000");
																							Log("Entered All Other Perils: " + new Select(allotherperils).getFirstSelectedOption().getText());
																						break;
			
				case "1500": case "$1,500":	case "1,500": case "$1500":					new Select(allotherperils).selectByValue("1500");
																							Log("Entered All Other Perils: " + new Select(allotherperils).getFirstSelectedOption().getText());
																						break;
														
				case "2500": case "$2,500": case "2,500": case "$2500":					new Select(allotherperils).selectByValue("2500");
																							Log("Entered All Other Perils: " + new Select(allotherperils).getFirstSelectedOption().getText());
																						break;
																						
				default:																	Log("Invalid value for SelectAllOtherPerils()");
																						break;
			}
		}
	}
	
	//Selects "Wind/Hail Deductible" from drop down
	public void SelectWindHailDeductible(String SelectWindHailDeductible) {
		if(!SelectWindHailDeductible.toUpperCase().equals("N/A")) {
			switch(SelectWindHailDeductible.toUpperCase()) {
				case "0.01": case "1": case "1%": case "1% COV A":		new Select(windhaildeduct).selectByValue("1%");
																			Log("Entered Wind/Hail Deductible: " + new Select(windhaildeduct).getFirstSelectedOption().getText());
																		break;
											
				case "0.02": case "2": case "2%": case "2% COV A":		new Select(windhaildeduct).selectByValue("2%");
																			Log("Entered Wind/Hail Deductible: " + new Select(windhaildeduct).getFirstSelectedOption().getText());
																		break;

																		
			 	case "0.03": case "3": case "3% COV A": case "3%":		new Select(windhaildeduct).selectByValue("3%");
																			Log("Entered Wind/Hail Deductible: " + new Select(windhaildeduct).getFirstSelectedOption().getText());
																		break;
											
				case "0.05": case "5": case "5%": case "5% COV A":		new Select(windhaildeduct).selectByValue("5%");
																			Log("Entered Wind/Hail Deductible: " + new Select(windhaildeduct).getFirstSelectedOption().getText());
																		break;
											
				case "500": case "$500":								new Select(windhaildeduct).selectByValue("500");
																			Log("Entered Wind/Hail Deductible: " + new Select(windhaildeduct).getFirstSelectedOption().getText());
																		break;
			
				case "1000": case "$1,000":	case "1,000": case "$1000":	new Select(windhaildeduct).selectByValue("1000");
																			Log("Entered Wind/Hail Deductible: " + new Select(windhaildeduct).getFirstSelectedOption().getText());
																		break;
			
				case "1500": case "$1,500":	case "1,500": case "$1500":	new Select(windhaildeduct).selectByValue("1500");
																			Log("Entered Wind/Hail Deductible: " + new Select(windhaildeduct).getFirstSelectedOption().getText());
																		break;
							
				case "2500": case "$2,500":	case "2,500": case "$2500":	new Select(windhaildeduct).selectByValue("2500");
																			Log("Entered Wind/Hail Deductible: " + new Select(windhaildeduct).getFirstSelectedOption().getText());
																		break;
																		
				default:													Log("Invalid value for SelectWindHailDeductible()");
																		break;
			}
		}
	}
	
	//Selects "Earthquake Coverage" from drop down
	public void SelectEarthquakeCoverage(String SelectEarthquakeCoverage) {
		if(!SelectEarthquakeCoverage.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakeCoverage.toUpperCase()) {
				case "N": case "NO":	new Select(eqcovg).selectByVisibleText("No");
											Log("Entered Earthquake Coverage: No");
										break;
			
				case "Y": case "YES":	new Select(eqcovg).selectByVisibleText("Yes");
											Log("Entered Earthquake Coverage: Yes");
										break;	
			}
		}
	}
	
	//Selects "Earthquake Deductible" from drop down
	public void SelectEarthquakeDeductible(String SelectEarthquakeDeductible) {
		if(!SelectEarthquakeDeductible.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakeDeductible.toUpperCase()) {
				case "0.1": case "10": case "10%": case "10% COV A":	new Select(eqdeduct).selectByVisibleText("10% Cov A");
																			Log("Entered Earthquake Deductible: 10% Cov A");
																		break;
					
				case "0.15": case "15": case "15%": case "15% COV A":	new Select(eqdeduct).selectByVisibleText("15% Cov A");
																			Log("Entered Earthquake Deductible: 15% Cov A");
																		break;
					
				case "0.2": case "20": case "20%": case "20% COV A":	new Select(eqdeduct).selectByVisibleText("20% Cov A");
																			Log("Entered Earthquake Deductible: 20% Cov A");
																		break;
																		
				default:													Log("Invalid value for SelectEarthquakeDeductible()");
																		break;		
			}
		}
	}
	
	//Selects "Earthquake Foundation Type" from drop down
	public void SelectEarthquakeFoundationType(String SelectEarthquakeFoundationType) throws InterruptedException {
		if(!SelectEarthquakeFoundationType.toUpperCase().equals("N/A")) {
			if(eqfoundationtype.isEnabled()) {
				new Select(eqfoundationtype).selectByVisibleText(SelectEarthquakeFoundationType);
					Log("Entered Earthquake Foundation Type: " + SelectEarthquakeFoundationType);
				Pause(3000);
			}
			else {	
					Log("Earthquake Foundation Type already entered: " + new Select(eqfoundationtype).getFirstSelectedOption().getText());
			}
		}
	}
	
	//Selects "Earthquake Secured Water Heater" from drop down
	public void SelectEarthquakeSecuredWaterHeater(String SelectEarthquakeSecuredWaterHeater) {
		if(!SelectEarthquakeSecuredWaterHeater.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakeSecuredWaterHeater.toUpperCase()) {
				case "N": case "NO":	new Select(eqsecurewaterheater).selectByVisibleText("No");
											Log("Entered Earthquake Secured Water Heater: No");
										break;
			
				case "Y": case "YES":	new Select(eqsecurewaterheater).selectByVisibleText("Yes");
											Log("Entered Earthquake Secured Water Heater: Yes");
										break;	
			}
		}
	}
	
	//Selects "Personal Liability" from drop down
	public void SelectPersonalLiability(String SelectPersonalLiability) {
		if(!SelectPersonalLiability.toUpperCase().equals("N/A")) {
			switch(SelectPersonalLiability.toUpperCase()) {
				case "25": case "$25,000": case "25000": case "$25000": case "25,000": case "$25,000 (INCLUDED)":	new Select(personalliab).selectByVisibleText("$25,000 (Included)");
																														Log("Entered Personal Liability: $25,000 (Included)");
																													break;
																													
				case "50": case "$50,000": case "50000": case "$50000": case "50,000":								new Select(personalliab).selectByVisibleText("$50,000");
																														Log("Entered Personal Liability: $50,000");
																													break;
																													
				case "100": case "$100,000": case "100000": case "$100000": case "100,000":							new Select(personalliab).selectByVisibleText("$100,000");
																														Log("Entered Personal Liability: $100,000");
																													break;
												
				case "300": case "$300,000": case "300000": case "$300000": case "300,000":							new Select(personalliab).selectByVisibleText("$300,000");
																														Log("Entered Personal Liability: $300,000");
																													break;
												
				case "500": case "$500,000": case "500000": case "$500000": case "500,000":							new Select(personalliab).selectByVisibleText("$500,000");
																														Log("Entered Personal Liability: $500,000");
																													break;
																													
				default:																								Log("Invalid value for SelectPersonalLiability()");
																													break;	
			}
		}
	}
	
	//Selects "Medical Payments Limit" from drop down
	public void SelectMedicalPaymentsLimit(String SelectMedicalPaymentsLimit) {
		if(!SelectMedicalPaymentsLimit.toUpperCase().equals("N/A")) {
			switch(SelectMedicalPaymentsLimit.toUpperCase()) {
				case "500": case "$500": case "$500 (INCLUDED)":		new Select(medicalpay).selectByVisibleText("$500 (Included)");
																			Log("Entered Medical Payments Limit: $500 (Included)");
																		break;
																		
				case "1000": case "$1,000": case "1,000": case "$1000":	new Select(medicalpay).selectByVisibleText("$1,000");
																			Log("Entered Medical Payments Limit: $1,000");
																		break;
											
				case "2500": case "$2,500": case "2,500": case "$2500":	new Select(medicalpay).selectByVisibleText("$2,500");
																			Log("Entered Medical Payments Limit: $2,500");
																		break;
											
				case "5000": case "$5,000": case "5,000": case "$5000":	new Select(medicalpay).selectByVisibleText("$5,000");
																			Log("Entered Medical Payments Limit: $5,000");
																		break;
																		
				default:													Log("Invalid value for SelectMedicalPaymentsLimit()");
																		break;			
			}
		}
	}
	
	//Selects "Golf Cart Physical Damage & Liability" from drop down
	public void SelectGolfCartPhysicalDamageLiability(String SelectGolfCartPhysicalDamageLiability) throws InterruptedException {
		if(!SelectGolfCartPhysicalDamageLiability.toUpperCase().equals("N/A")) {
			switch(SelectGolfCartPhysicalDamageLiability.toUpperCase()) {
				case "N": case "NONE": case "NO":						new Select(golfcart).selectByVisibleText("None");
																			Log("Entered Golf Cart Physical Damage & Liability: None");											
																		break;
											
				case "50-1": case "$50,000 - 1 CART":					new Select(golfcart).selectByVisibleText("$50,000 - 1 Cart");
																			Log("Entered Golf Cart Physical Damage & Liability: $50,000 - 1 Cart");	
																		break;
															
				case "50-2": case "$50,000 - 2 CARTS":					new Select(golfcart).selectByVisibleText("$50,000 - 2 Carts");
																			Log("Entered Golf Cart Physical Damage & Liability: $50,000 - 2 Carts");
																		break;
															
				case "100/300-1": case "$100,000 / $300,000 - 1 CART":	new Select(golfcart).selectByVisibleText("$100,000 / $300,000 - 1 Cart");
																			Log("Entered Golf Cart Physical Damage & Liability: $100,000 / $300,000 - 1 Cart");
																		break;
																			
				case "100/300-2": case "$100,000 / $300,000 - 2 CARTS":	new Select(golfcart).selectByVisibleText("$100,000 / $300,000 - 2 Carts");
																			Log("Entered Golf Cart Physical Damage & Liability: $100,000 / $300,000 - 2 Carts");
																		break;
																		
				default:													Log("Invalid value for SelectGolfCartPhysicalDamageLiability()");
																		break;	
			}	
		}
	}
	
	//Selects "Increase Jewelry, Watches & Furs" from drop down
	public void SelectIncreaseJewelryWatchesFurs(String SelectIncreaseJewelryWatchesFurs) throws InterruptedException {
		if(!SelectIncreaseJewelryWatchesFurs.toUpperCase().equals("N/A")) {
			if(increasejwf.isEnabled()) {
				switch(SelectIncreaseJewelryWatchesFurs.toUpperCase()) {
					case "N": case "NONE": case "0": case "NO":				new Select(increasejwf).selectByVisibleText("None");
																				Log("Entered Increase Jewelry, Watches & Furs: None");
																			break;
												
					case "1000": case "$1,000":case "1,000": case "$1000":	new Select(increasejwf).selectByVisibleText("$1,000");
																				Log("Entered Increase Jewelry, Watches & Furs: $1,000");
																			break;
																	
					case "2000": case "$2,000":	case "2,000": case "$2000":	new Select(increasejwf).selectByVisibleText("$2,000");
																				Log("Entered Increase Jewelry, Watches & Furs: $2,000");
																			break;
													
					case "3000": case "$3,000":	case "3,000": case "$3000":	new Select(increasejwf).selectByVisibleText("$3,000");
																				Log("Entered Increase Jewelry, Watches & Furs: $3,000");
																			break;
													
					case "4000": case "$4,000":case "4,000": case "$4000":	new Select(increasejwf).selectByVisibleText("$4,000");
																				Log("Entered Increase Jewelry, Watches & Furs: $4,000");
																			break;
													
					case "5000": case "$5,000":case "5,000": case "$5000":	new Select(increasejwf).selectByVisibleText("$5,000");
																				Log("Entered Increase Jewelry, Watches & Furs: $5,000");
																			break;
																			
					default:													Log("Invalid value for SelectIncreaseJewelryWatchesFurs()");
																			break;
				}
			}
			else {
					Log("Increase Jewelry, Watches & Furs Prefilled with: " + new Select(increasejwf).getFirstSelectedOption().getText() + ". This is included with the " + homeshieldtype + " package");	
			}
		}
	}
	
	//Selects "Increased Replacement Cost on Dwelling" from drop down
	public void SelectIncreasedReplacementCostOnDwelling(String SelectIncreasedReplacementCostOnDwelling) throws InterruptedException {
		if(!SelectIncreasedReplacementCostOnDwelling.toUpperCase().equals("N/A")) {
			if(selectincreasereplccost.isEnabled()) {
				switch(SelectIncreasedReplacementCostOnDwelling.toUpperCase()) {
					case "N": case "NONE": case "NO":						new Select(selectincreasereplccost).selectByVisibleText("None");	
																				Log("Entered Increased Replacement Cost on Dwelling: None");
																			break;
													
					case "0.25": case "25% COV A": case "25": case "25%":	new Select(selectincreasereplccost).selectByVisibleText("25% Cov A");
																				Log("Entered Increased Replacement Cost on Dwelling: 25% Cov A");
																			break;
													
					case "0.5": case "50% COV A": case "50": case "50%":	new Select(selectincreasereplccost).selectByVisibleText("50% Cov A");
																				Log("Entered Increased Replacement Cost on Dwelling: 50% Cov A");
																			break;
																			
					default:													Log("Invalid value for SelectIncreasedReplacementCostOnDwelling()");
																			break;
				}
			}
			else {
					Log("Increased Replacement Cost on Dwelling Prefilled with: " + new Select(selectincreasereplccost).getFirstSelectedOption().getText() + ". This is included with the " + homeshieldtype + " package");
			}
		}
	}
	
	//Checks "Increased Replacement Cost on Dwelling" check box
	public void CheckIncreasedReplacementCostonDwelling(String CheckIncreasedReplacementCostonDwelling) throws InterruptedException {
		if(!CheckIncreasedReplacementCostonDwelling.toUpperCase().equals("N/A")) {
			if(checkincreasereplccost.isEnabled()) {
				if(checkincreasereplccost.isSelected()) {
					switch(CheckIncreasedReplacementCostonDwelling.toUpperCase()) {
						case "Y": case "YES":		Log("\"Increased Replacement Cost on Dwelling\" check box marked");
												break;
												
						case "N": case "NO":	checkincreasereplccost.click();
													Log("\"Increased Replacement Cost on Dwelling\" check box NOT marked");
													Pause(3000);
												break;
					}
				}
				else {
					switch(CheckIncreasedReplacementCostonDwelling.toUpperCase()) {
						case "Y": case "YES":	checkincreasereplccost.click();
													Log("\"Increased Replacement Cost on Dwelling\" check box marked");
													Pause(3000);
												break;
												
						case "N": case "NO":		Log("\"Increased Replacement Cost on Dwelling\" check box NOT marked");
												break;
					}
				}
			}
			else if(checkincreasereplccost.isSelected()) {
				 	Log("Increased Replacement Cost on Dwelling is included");
		 	}
		 	else {
		 			Log("Increased Replacement Cost on Dwelling is not enabled");
		 	}
		}
	}
	
	//Selects "Animal Liability" from drop down
	public void SelectAnimalLiability(String SelectAnimalLiability) throws InterruptedException {
		if(!SelectAnimalLiability.toUpperCase().equals("N/A")) {
			if(animalliab.isEnabled()) {
				switch(SelectAnimalLiability.toUpperCase()) {
				case "N": case "NONE": case "0": case "NO":									new Select(animalliab).selectByVisibleText("None");
																								Log("Entered Animal Liability: None");
																							break;			
				
				case "50": case "$50,000": case "50000": case "$50000": case "50,000":		new Select(animalliab).selectByVisibleText("$50,000");
																								Log("Entered Animal Liability: $50,000");
																							break;
											
				case "300": case "$300,000": case "300000": case "$300000": case "300,000":	new Select(animalliab).selectByVisibleText("$300,000");
																								Log("Entered Animal Liability: $300,000");
																							break;
												
				case "500": case "$500,000": case "500000": case "$500000": case "500,000":	new Select(animalliab).selectByVisibleText("$500,000");
																								Log("Entered Animal Liability: $500,000");
																							break;
																							
				default:																		Log("Invalid value for SelectAnimalLiability()");
																							break;
				}
			}
			else {
					Log("Animal Liability Prefilled with: " + new Select(animalliab).getFirstSelectedOption().getText() + ". This is included with the " + homeshieldtype + " package");
			}
		}
	}
	
	//Selects "Animal Buyback" from drop down
	public void SelectAnimalBuyback(String SelectAnimalBuyback) throws InterruptedException {
		if(!SelectAnimalBuyback.toUpperCase().equals("N/A")) {
			if(animalliab.isEnabled()) {
				switch(SelectAnimalBuyback.toUpperCase()) {
				case "N": case "NONE": case "0": case "NO":									new Select(animalliab).selectByVisibleText("None");
																								Log("Entered Animal Buyback: None");
																							break;																							
																							
				case "25": case "$25,000": case "25000": case "$25000": case "25,000":		new Select(animalliab).selectByVisibleText("$25,000");
																								Log("Entered Animal Buyback: $25,000");
																							break;
				
				case "50": case "$50,000": case "50000": case "$50000": case "50,000":		new Select(animalliab).selectByVisibleText("$50,000");
																								Log("Entered Animal Buyback: $50,000");
																							break;
											
				case "300": case "$300,000": case "300000": case "$300000": case "300,000":	new Select(animalliab).selectByVisibleText("$300,000");
																								Log("Entered Animal Buyback: $300,000");
																							break;
												
				case "500": case "$500,000": case "500000": case "$500000": case "500,000":	new Select(animalliab).selectByVisibleText("$500,000");
																								Log("Entered Animal Buyback: $500,000");
																							break;
																							
				default:																		Log("Invalid value for SelectAnimalBuyback()");
																							break;
				}
			}
			else {
					Log("Animal Buyback Prefilled with: " + new Select(animalliab).getFirstSelectedOption().getText() + ". This is included with the " + homeshieldtype + " package");
			}
		}
	}
	
	//Types into "Home Computer Coverage" text box
	public void TypeHomeComputerCoverage(String TypeHomeComputerCoverage) throws InterruptedException {
		if(!TypeHomeComputerCoverage.toUpperCase().equals("N/A")) {
			switch(TypeHomeComputerCoverage.toUpperCase()) {
				case "0": case "N": case "NONE": case "NO":		Log("Entered Home Computer Coverage: None");
															break;				
				
				default:									String hccvalue = TypeHomeComputerCoverage.replace("$", "").replace(",", "");
															typehomecomputer.clear();
																Pause(2000);
															typehomecomputer.sendKeys(hccvalue);
															typehomecomputer.sendKeys(Keys.TAB);
																Pause(2000);
																Log("Entered Home Computer Coverage: " + TypeHomeComputerCoverage);
															break;
			}
		}
	}
	
	//Returns the value in the typed "Home Computer Coverage" field
	public String ReturnTypeHomeComputerCoverage() throws InterruptedException {
		if(typehomecomputer.getAttribute("ng-reflect-model").isEmpty()) {
			return "N/A";
		}
		else {
			return typehomecomputer.getAttribute("ng-reflect-model").replaceAll(",", "");	
		}
	}
	
	//Selects "Home Computer Coverage" from drop down
	public void SelectHomeComputerCoverage(String SelectHomeComputerCoverage) {
		if(!SelectHomeComputerCoverage.toUpperCase().equals("N/A")) {
			switch(SelectHomeComputerCoverage.toUpperCase()) {
				case "$0": case "0": case "N": case "NONE": case "NO":		new Select(selecthomecomputer).selectByVisibleText("$0");
																				Log("Entered Home Computer Coverage: $0");
																			break;
													
				case "3000": case "$3,000":	case "3,000": case "$3000":		new Select(selecthomecomputer).selectByVisibleText("$3,000");
																				Log("Entered Home Computer Coverage: $3,000");
																			break;
												
				case "4000": case "$4,000":	case "4,000": case "$4000":		new Select(selecthomecomputer).selectByVisibleText("$4,000");
																				Log("Entered Home Computer Coverage: $4,000");
																			break;
			
				case "5000": case "$5,000":	case "5,000": case "$5000":		new Select(selecthomecomputer).selectByVisibleText("$5,000");
																				Log("Entered Home Computer Coverage: $5,000");
																			break;
			
				case "6000": case "$6,000":	case "6,000": case "$6000":		new Select(selecthomecomputer).selectByVisibleText("$6,000");
																				Log("Entered Home Computer Coverage: $6,000");
																			break;
			
				case "7000": case "$7,000":	case "7,000": case "$7000":		new Select(selecthomecomputer).selectByVisibleText("$7,000");
																				Log("Entered Home Computer Coverage: $7,000");
																			break;
			
				case "8000": case "$8,000":case "8,000": case "$8000":		new Select(selecthomecomputer).selectByVisibleText("$8,000");
																				Log("Entered Home Computer Coverage: $8,000");
																			break;
			
				case "9000": case "$9,000":case "9,000": case "$9000":		new Select(selecthomecomputer).selectByVisibleText("$9,000");
																				Log("Entered Home Computer Coverage: $9,000");
																			break;
			
				case "10000": case "$10,000":case "10,000": case "$10000":	new Select(selecthomecomputer).selectByVisibleText("$10,000");
																				Log("Entered Home Computer Coverage: $10,000");
																			break;
																			
				default:														Log("Invalid value for SelectHomeComputerCoverage()");
																			break;	
			}
		}
	}
	
	//Selects "Loss Assessment" from drop down
	public void SelectLossAssessment(String SelectLossAssessment) throws InterruptedException {
		if(!SelectLossAssessment.toUpperCase().equals("N/A")) {
			if(lossassessment.isEnabled()) {
				switch(SelectLossAssessment.toUpperCase()) {
					case "0": case "N": case "NONE": case "NO":											new Select(lossassessment).selectByVisibleText("None");
																											Log("Entered Loss Assessment: None");
																										break;
																				
					case "1000": case "$1,000":	case "1,000": case "$1000": case "$1,000 (INCLUDED)": 	new Select(lossassessment).selectByValue("1000");
																											Log("Entered Loss Assessment: " + new Select(lossassessment).getFirstSelectedOption().getText());
																										break;
														
					case "2500": case "$2,500":	case "2,500": case "$2500":								new Select(lossassessment).selectByValue("2500");
																											Log("Entered Loss Assessment: $2,500");
																										break;
														
					case "5000": case "$5,000":	case "5,000": case "$5000":								new Select(lossassessment).selectByValue("5000");
																											Log("Entered Loss Assessment: $5,000");
																										break;
														
					case "10000": case "$10,000":case "10,000": case "$10000":							new Select(lossassessment).selectByValue("10000");
																											Log("Entered Loss Assessment: $10,000");
																										break;
																										
					default:																				Log("Invalid value for SelectLossAssessment()");
																										break;
				}
			}
			else {
					Log("Loss Assessment Prefilled with: " + new Select(lossassessment).getFirstSelectedOption().getText() + ". This is included with the " + homeshieldtype + " package");
			}
		}
	}
	
	//Selects "Ordinance or Law" from drop down
	public void SelectOrdinanceOrLaw(String SelectOrdinanceOrLaw) throws InterruptedException {
		if(!SelectOrdinanceOrLaw.toUpperCase().equals("N/A")) {
			if(ordlaw.isEnabled()) {
				switch(SelectOrdinanceOrLaw.toUpperCase()) {
					case "N": case "NO": case "NONE": case "0": case "$0":							new Select(ordlaw).selectByValue("None");
																										Log("Entered Ordinance or Law: None");
																									break;
																									
					case "0.1": case "10": case "10%": case "10% INCLUDED": case "10% (INCLUDED)":	new Select(ordlaw).selectByValue("10");
																										Log("Entered Ordinance or Law: " + new Select(ordlaw).getFirstSelectedOption().getText());
																									break;
																				
					case "0.25": case "25": case "25%": case "25% INCLUDED": case "25% (INCLUDED)":	new Select(ordlaw).selectByValue("25");
																										Log("Entered Ordinance or Law: " + new Select(ordlaw).getFirstSelectedOption().getText());
																									break;
																									
					default:																			Log("Invalid value for SelectOrdinanceOrLaw()");
																									break;																
				}
			}
			else {
					Log("Ordinance or Law Prefilled with: " + new Select(ordlaw).getFirstSelectedOption().getText() + ". This is included with the " + homeshieldtype + " package");
			}
		}
	}
	
	//Selects "Water Backup - Basement" from drop down
	public void SelectWaterBackupBasement(String SelectWaterBackup, String SelectBasement) throws InterruptedException {
		if(!SelectWaterBackup.toUpperCase().equals("N/A")) {
			if(selectwaterbackupbasement.isEnabled()) {
				switch(SelectWaterBackup.toUpperCase()) {
					case "N": case "NONE": case "NO":							new Select(selectwaterbackupbasement).selectByVisibleText("None");	
																					Log("Entered Water Backup - Basement: None");
																				break;
				
					case "5000": case "$5,000":case "5,000": case "$5000":		if(SelectBasement.toUpperCase().equals("NONE") || SelectBasement.toUpperCase().equals("N")) {
																					new Select(selectwaterbackupbasement).selectByVisibleText("$5,000 - None");
																						Log("Entered Water Backup - Basement: " + new Select(selectwaterbackupbasement).getFirstSelectedOption().getText());
																				}
																				else if(SelectBasement.toUpperCase().equals("UNF") || SelectBasement.toUpperCase().equals("UNFINISHED")) {
																					new Select(selectwaterbackupbasement).selectByVisibleText("$5,000 - Unfinished");
																						Log("Entered Water Backup - Basement: " + new Select(selectwaterbackupbasement).getFirstSelectedOption().getText());
																				}
																				else if(SelectBasement.toUpperCase().equals("PART") || SelectBasement.toUpperCase().equals("PARTIALLY FINISHED")) {
																					new Select(selectwaterbackupbasement).selectByVisibleText("$5,000 - Partially Finished");
																						Log("Entered Water Backup - Basement: " + new Select(selectwaterbackupbasement).getFirstSelectedOption().getText());
																				}
																				else if(SelectBasement.toUpperCase().equals("FIN") || SelectBasement.toUpperCase().equals("FINISHED")) {
																					new Select(selectwaterbackupbasement).selectByVisibleText("$5,000 - Finished");
																						Log("Entered Water Backup - Basement: " + new Select(selectwaterbackupbasement).getFirstSelectedOption().getText());
																				}
																				else {
																						Log("Invalid value for SelectBasement()");
																				}												
																				break;
													
					case "10000": case "$10,000":case "10,000": case "$10000":	if(SelectBasement.toUpperCase().equals("NONE") || SelectBasement.toUpperCase().equals("N")) {
																					new Select(selectwaterbackupbasement).selectByVisibleText("$10,000 - None");
																						Log("Entered Water Backup - Basement: " + new Select(selectwaterbackupbasement).getFirstSelectedOption().getText());
																				}
																				else if(SelectBasement.toUpperCase().equals("UNF") || SelectBasement.toUpperCase().equals("UNFINISHED")) {
																					new Select(selectwaterbackupbasement).selectByVisibleText("$10,000 - Unfinished");
																						Log("Entered Water Backup - Basement: " + new Select(selectwaterbackupbasement).getFirstSelectedOption().getText());
																				}
																				else if(SelectBasement.toUpperCase().equals("PART") || SelectBasement.toUpperCase().equals("PARTIALLY FINISHED")) {
																					new Select(selectwaterbackupbasement).selectByVisibleText("$10,000 - Partially Finished");
																						Log("Entered Water Backup - Basement: " + new Select(selectwaterbackupbasement).getFirstSelectedOption().getText());
																				}
																				else if(SelectBasement.toUpperCase().equals("FIN") || SelectBasement.toUpperCase().equals("FINISHED")) {
																					new Select(selectwaterbackupbasement).selectByVisibleText("$10,000 - Finished");
																						Log("Entered Water Backup - Basement: " + new Select(selectwaterbackupbasement).getFirstSelectedOption().getText());
																				}
																				else {
																						Log("Invalid value for SelectBasement()");
																				}
																				break;
						
					case "25000": case "$25,000":case "25,000": case "$25000":	if(SelectBasement.toUpperCase().equals("NONE") || SelectBasement.toUpperCase().equals("N")) {
																					new Select(selectwaterbackupbasement).selectByVisibleText("$25,000 - None");
																						Log("Entered Water Backup - Basement: " + new Select(selectwaterbackupbasement).getFirstSelectedOption().getText());
																				}
																				else if(SelectBasement.toUpperCase().equals("UNF") || SelectBasement.toUpperCase().equals("UNFINISHED")) {
																					new Select(selectwaterbackupbasement).selectByVisibleText("$25,000 - Unfinished");
																						Log("Entered Water Backup - Basement: " + new Select(selectwaterbackupbasement).getFirstSelectedOption().getText());
																				}
																				else if(SelectBasement.toUpperCase().equals("PART") || SelectBasement.toUpperCase().equals("PARTIALLY FINISHED")) {
																					new Select(selectwaterbackupbasement).selectByVisibleText("$25,000 - Partially Finished");
																						Log("Entered Water Backup - Basement: " + new Select(selectwaterbackupbasement).getFirstSelectedOption().getText());
																				}
																				else if(SelectBasement.toUpperCase().equals("FIN") || SelectBasement.toUpperCase().equals("FINISHED")) {
																					new Select(selectwaterbackupbasement).selectByVisibleText("$25,000 - Finished");
																						Log("Entered Water Backup - Basement: " + new Select(selectwaterbackupbasement).getFirstSelectedOption().getText());
																				}
																				else {
																						Log("Invalid value for SelectBasement()");
																				}
																				break;
																				
					case "50000": case "$50,000":case "50,000": case "$50000":	if(SelectBasement.toUpperCase().equals("NONE") || SelectBasement.toUpperCase().equals("N")) {
																					new Select(selectwaterbackupbasement).selectByVisibleText("$50,000 - None");
																						Log("Entered Water Backup - Basement: " + new Select(selectwaterbackupbasement).getFirstSelectedOption().getText());
																				}
																				else if(SelectBasement.toUpperCase().equals("UNF") || SelectBasement.toUpperCase().equals("UNFINISHED")) {
																					new Select(selectwaterbackupbasement).selectByVisibleText("$50,000 - Unfinished");
																						Log("Entered Water Backup - Basement: " + new Select(selectwaterbackupbasement).getFirstSelectedOption().getText());
																				}
																				else if(SelectBasement.toUpperCase().equals("PART") || SelectBasement.toUpperCase().equals("PARTIALLY FINISHED")) {
																					new Select(selectwaterbackupbasement).selectByVisibleText("$50,000 - Partially Finished");
																						Log("Entered Water Backup - Basement: " + new Select(selectwaterbackupbasement).getFirstSelectedOption().getText());
																				}
																				else if(SelectBasement.toUpperCase().equals("FIN") || SelectBasement.toUpperCase().equals("FINISHED")) {
																					new Select(selectwaterbackupbasement).selectByVisibleText("$50,000 - Finished");
																						Log("Entered Water Backup - Basement: " + new Select(selectwaterbackupbasement).getFirstSelectedOption().getText());
																				}
																				else {
																						Log("Invalid value for SelectBasement()");
																				}
																				break;
																				
					default:														Log("Invalid value for SelectWaterBackup()");
																				break;			
				}
			}
			else {
					Log("Water Backup - Basement Prefilled with: " + new Select(selectwaterbackupbasement).getFirstSelectedOption().getText() + ". This is included with the " + homeshieldtype + " package");
			}
		}
	}
	
	//Selects "Additional Water Backup - Basement" from drop down
	public void SelectAdditionalWaterBackupBasement(String SelectAdditionalWaterBackup, String SelectAdditionalBasement) throws InterruptedException {
		if(!SelectAdditionalWaterBackup.toUpperCase().equals("N/A")) {
			switch(SelectAdditionalWaterBackup.toUpperCase()) {
				case "N": case "NONE": case "NO":							new Select(additionalwaterbackupbasement).selectByVisibleText("None");		
																				Log("Entered Additional Water Backup - Basement: None");
																			break;
	
				case "5000": case "$5,000":case "5,000": case "$5000":		if(SelectAdditionalBasement.toUpperCase().equals("NONE") || SelectAdditionalBasement.toUpperCase().equals("N")) {
																				new Select(additionalwaterbackupbasement).selectByVisibleText("$5,000 - None");
																					Log("Entered Additional Water Backup - Basement: " + new Select(additionalwaterbackupbasement).getFirstSelectedOption().getText());	
																			}
																			else if(SelectAdditionalBasement.toUpperCase().equals("UNF") || SelectAdditionalBasement.toUpperCase().equals("UNFINISHED")) {
																				new Select(additionalwaterbackupbasement).selectByVisibleText("$5,000 - Unfinished");
																					Log("Entered Additional Water Backup - Basement: " + new Select(additionalwaterbackupbasement).getFirstSelectedOption().getText());	
																			}
																			else if(SelectAdditionalBasement.toUpperCase().equals("PART") || SelectAdditionalBasement.toUpperCase().equals("PARTIALLY FINISHED")) {
																				new Select(additionalwaterbackupbasement).selectByVisibleText("$5,000 - Partially Finished");
																					Log("Entered Additional Water Backup - Basement: " + new Select(additionalwaterbackupbasement).getFirstSelectedOption().getText());	
																			}
																			else if(SelectAdditionalBasement.toUpperCase().equals("FIN") || SelectAdditionalBasement.toUpperCase().equals("FINISHED")) {
																				new Select(additionalwaterbackupbasement).selectByVisibleText("$5,000 - Finished");	
																					Log("Entered Additional Water Backup - Basement: " + new Select(additionalwaterbackupbasement).getFirstSelectedOption().getText());	
																			}
																			else {
																					Log("Invalid value for SelectAdditionalBasement()");
																			}
																			break;
			
				case "10000": case "$10,000":case "10,000": case "$10000":	if(SelectAdditionalBasement.toUpperCase().equals("NONE") || SelectAdditionalBasement.toUpperCase().equals("N")) {
																				new Select(additionalwaterbackupbasement).selectByVisibleText("$10,000 - None");
																					Log("Entered Additional Water Backup - Basement: " + new Select(additionalwaterbackupbasement).getFirstSelectedOption().getText());	
																			}
																			else if(SelectAdditionalBasement.toUpperCase().equals("UNF") || SelectAdditionalBasement.toUpperCase().equals("UNFINISHED")) {
																				new Select(additionalwaterbackupbasement).selectByVisibleText("$10,000 - Unfinished");
																					Log("Entered Additional Water Backup - Basement: " + new Select(additionalwaterbackupbasement).getFirstSelectedOption().getText());	
																			}
																			else if(SelectAdditionalBasement.toUpperCase().equals("PART") || SelectAdditionalBasement.toUpperCase().equals("PARTIALLY FINISHED")) {
																				new Select(additionalwaterbackupbasement).selectByVisibleText("$10,000 - Partially Finished");
																					Log("Entered Additional Water Backup - Basement: " + new Select(additionalwaterbackupbasement).getFirstSelectedOption().getText());	
																			}
																			else if(SelectAdditionalBasement.toUpperCase().equals("FIN") || SelectAdditionalBasement.toUpperCase().equals("FINISHED")) {
																				new Select(additionalwaterbackupbasement).selectByVisibleText("$10,000 - Finished");
																					Log("Entered Additional Water Backup - Basement: " + new Select(additionalwaterbackupbasement).getFirstSelectedOption().getText());	
																			}
																			else {
																					Log("Invalid value for SelectAdditionalBasement()");
																			}
																			break;
	
				case "25000": case "$25,000":case "25,000": case "$25000":	if(SelectAdditionalBasement.toUpperCase().equals("NONE") || SelectAdditionalBasement.toUpperCase().equals("N")) {
																				new Select(additionalwaterbackupbasement).selectByVisibleText("$25,000 - None");
																					Log("Entered Additional Water Backup - Basement: " + new Select(additionalwaterbackupbasement).getFirstSelectedOption().getText());	
																			}
																			else if(SelectAdditionalBasement.toUpperCase().equals("UNF") || SelectAdditionalBasement.toUpperCase().equals("UNFINISHED")) {
																				new Select(additionalwaterbackupbasement).selectByVisibleText("$25,000 - Unfinished");	
																					Log("Entered Additional Water Backup - Basement: " + new Select(additionalwaterbackupbasement).getFirstSelectedOption().getText());	
																			}
																			else if(SelectAdditionalBasement.toUpperCase().equals("PART") || SelectAdditionalBasement.toUpperCase().equals("PARTIALLY FINISHED")) {
																				new Select(additionalwaterbackupbasement).selectByVisibleText("$25,000 - Partially Finished");
																					Log("Entered Additional Water Backup - Basement: " + new Select(additionalwaterbackupbasement).getFirstSelectedOption().getText());	
																			}
																			else if(SelectAdditionalBasement.toUpperCase().equals("FIN") || SelectAdditionalBasement.toUpperCase().equals("FINISHED")) {
																				new Select(additionalwaterbackupbasement).selectByVisibleText("$25,000 - Finished");
																					Log("Entered Additional Water Backup - Basement: " + new Select(additionalwaterbackupbasement).getFirstSelectedOption().getText());	
																			}
																			else {
																					Log("Invalid value for SelectAdditionalBasement()");
																			}
																			break;
																			
				case "50000": case "$50,000":case "50,000": case "$50000":	if(SelectAdditionalBasement.toUpperCase().equals("NONE") || SelectAdditionalBasement.toUpperCase().equals("N")) {
																				new Select(additionalwaterbackupbasement).selectByVisibleText("$50,000 - None");
																					Log("Entered Additional Water Backup - Basement: " + new Select(additionalwaterbackupbasement).getFirstSelectedOption().getText());	
																			}
																			else if(SelectAdditionalBasement.toUpperCase().equals("UNF") || SelectAdditionalBasement.toUpperCase().equals("UNFINISHED")) {
																				new Select(additionalwaterbackupbasement).selectByVisibleText("$50,000 - Unfinished");	
																					Log("Entered Additional Water Backup - Basement: " + new Select(additionalwaterbackupbasement).getFirstSelectedOption().getText());	
																			}
																			else if(SelectAdditionalBasement.toUpperCase().equals("PART") || SelectAdditionalBasement.toUpperCase().equals("PARTIALLY FINISHED")) {
																				new Select(additionalwaterbackupbasement).selectByVisibleText("$50,000 - Partially Finished");
																					Log("Entered Additional Water Backup - Basement: " + new Select(additionalwaterbackupbasement).getFirstSelectedOption().getText());	
																			}
																			else if(SelectAdditionalBasement.toUpperCase().equals("FIN") || SelectAdditionalBasement.toUpperCase().equals("FINISHED")) {
																				new Select(additionalwaterbackupbasement).selectByVisibleText("$50,000 - Finished");
																					Log("Entered Additional Water Backup - Basement: " + new Select(additionalwaterbackupbasement).getFirstSelectedOption().getText());	
																			}
																			else {
																					Log("Invalid value for SelectAdditionalBasement()");
																			}
																			break;
																			
				default:														Log("Invalid value for SelectAdditionalWaterBackup()");
																			break;	
			}
		}
	}
	
	//Selects "Water Backup / Sump Pump" from drop down
	public void SelectWaterBackupSumpPump(String SelectWaterBackupSumpPump) {
		switch(SelectWaterBackupSumpPump.toUpperCase()) {
			case "NONE": case "N": case "NO": case "0": case "$0":							new Select(selectwaterbackupsumppump).selectByVisibleText("No");
																								Log("Entered Water Backup / Sump Pump: No");
																							break;
	
			case "Y": case "YES": case "$5,000": case "$5000": case "5,000": case "5000":	new Select(selectwaterbackupsumppump).selectByVisibleText("Yes");
																								Log("Entered Water Backup / Sump Pump: Yes");
																							break;
														
			default:																			Log("Invalid value for SelectWaterBackupSumpPump()");
																							break;
		}
	}
	
	//Selects "Water Backup / Sump Pump" from drop down
	public void SelectWaterBackupSumpPumpLimit(String SelectWaterBackupSumpPumpLimit) {
		switch(SelectWaterBackupSumpPumpLimit.toUpperCase()) {
			case "N": case "NO": case "0": case "$0":					new Select(selectwaterbackupsumppumplimit).selectByVisibleText("None");
																			Log("Entered Water Backup / Sump Pump: None");
																		break;
	
			case "5000": case "$5,000":case "5,000": case "$5000": 		new Select(selectwaterbackupsumppumplimit).selectByVisibleText("$5,000");
																			Log("Entered Water Backup / Sump Pump: $5,000");
																		break;	
														
			case "10000": case "$10,000":case "10,000": case "$10000":	new Select(selectwaterbackupsumppumplimit).selectByVisibleText("$10,000");
																			Log("Entered Water Backup / Sump Pump: $10,000");
																		break;
				
			case "25000": case "$25,000":case "25,000": case "$25000":	new Select(selectwaterbackupsumppumplimit).selectByVisibleText("$25,000");
																			Log("Entered Water Backup / Sump Pump: $25,000");
																		break;
																		
			default:														Log("Invalid value for SelectWaterBackupSumpPumpLimit()");
																		break;
		}
	}
	
	//Selects "Matching of Undamaged Siding and/or Roofing" from drop down
	public void SelectUndamagedSidingRoofing(String SelectUndamagedSidingRoofing) {
		switch(SelectUndamagedSidingRoofing.toUpperCase()) {
			case "0": case "N": case "NONE": case "NO":			new Select(matchundamagedsidingroofing).selectByVisibleText("None");
																	Log("Entered Matching of Undamaged Siding and/or Roofing: None");
																break;
											
			case "0.02": case "2% COV A": case "2": case "2%":	new Select(matchundamagedsidingroofing).selectByVisibleText("2% Cov A");
																	Log("Entered Matching of Undamaged Siding and/or Roofing: 2% Cov A");
																break;
																						
			case "0.04": case "4% COV A": case "4": case "4%":	new Select(matchundamagedsidingroofing).selectByVisibleText("4% Cov A");
																	Log("Entered Matching of Undamaged Siding and/or Roofing: 4% Cov A");
																break;
																						
			case "0.06": case "6% COV A": case "6": case "6%":	new Select(matchundamagedsidingroofing).selectByVisibleText("6% Cov A");
																	Log("Entered Matching of Undamaged Siding and/or Roofing: 6% Cov A");
																break;
		}
	}
	
	//Selects "Mine Subsidence Coverage A" from drop down
	public void SelectMineSubsidenceA(String SelectMineSubsidenceA) {
		if(!SelectMineSubsidenceA.toUpperCase().equals("N/A")) {
			if(minesubsidencea.isEnabled()) {
				switch(SelectMineSubsidenceA.toUpperCase()) {
					case "N": case "NO":	new Select(minesubsidencea).selectByVisibleText("No");
												Log("Entered Mine Subsidence: No");
												break;
				
					case "Y": case "YES":		new Select(minesubsidencea).selectByVisibleText("Yes");
												Log("Entered Mine Subsidence: Yes");
												break;
												
					
				}
			}
			else {
					Log("Mine Subsidence already entered: " + new Select(minesubsidencea).getFirstSelectedOption().getText());
			}
		}
	}
	
	//Selects "Mine Subsidence Coverage B" from drop down
	public void SelectMineSubsidenceB(String SelectMineSubsidenceB) {
		if(!SelectMineSubsidenceB.toUpperCase().equals("N/A")) {
			if(minesubsidenceb.isEnabled()) {
				switch(SelectMineSubsidenceB.toUpperCase()) {
					case "N": case "NO":		new Select(minesubsidenceb).selectByVisibleText("No");
												Log("Entered Mine Subsidence Coverage B: No");
												break;
				
					case "Y": case "YES":		new Select(minesubsidenceb).selectByVisibleText("Yes");
												Log("Entered Mine Subsidence Coverage B: Yes");
												
												break;	
					case "ALE": case "Y /ALE":	new Select(minesubsidencea).selectByVisibleText("Yes w/ALE");
				    							Log("Entered Mine Subsidence: Yes w/ALE");
				    							break;	
				}
			}
			else {
					Log("Mine Subsidence Coverage B already entered: " + new Select(minesubsidenceb).getFirstSelectedOption().getText());
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
			
				case "0.25": case "25": case "25%": case "25% Mold Remediation":	new Select(moldbuyback).selectByValue("25");
																						Log("Entered Mold Buyback: " + new Select(moldbuyback).getFirstSelectedOption().getText());
																					break;
												
				case "0.5": case "50": case "50%": case "50% Mold Remediation":		new Select(moldbuyback).selectByValue("50");
																						Log("Entered Mold Buyback: " + new Select(moldbuyback).getFirstSelectedOption().getText());
																					break;

																							
				case "1": case "100": case "100%": case "100% Mold Remediation":	new Select(moldbuyback).selectByValue("75");
																						Log("Entered Mold Buyback: " + new Select(moldbuyback).getFirstSelectedOption().getText());
																					break;
																					
				default:																Log("Invalid value for SelectMoldBuyback()");
																					break;
			}
		}
	}
	
	//Selects "Hobby Farming" from drop down
	public void SelectHobbyFarming(String SelectHobbyFarming) {
		if(!SelectHobbyFarming.toUpperCase().equals("N/A")) {
			switch(SelectHobbyFarming.toUpperCase()) {
				case "0": case "$0": case "N": case "NO": case "NONE":						new Select(hobbyfarming).selectByVisibleText("None");
																								Log("Entered Hobby Farming: None");
																							break;
			
				case "100": case "$100,000": case "100000": case "$100000": case "100,000":	new Select(hobbyfarming).selectByVisibleText("$100,000");
																								Log("Entered Hobby Farming: $100,000");
																							break;
												
				case "300": case "$300,000": case "300000": case "$300000": case "300,000":	new Select(hobbyfarming).selectByVisibleText("$300,000");
																								Log("Entered Hobby Farming: $300,000");
																							break;
												
				case "500": case "$500,000": case "500000": case "$500000": case "500,000":	new Select(hobbyfarming).selectByVisibleText("$500,000");
																								Log("Entered Hobby Farming: $500,000");
																							break;
																							
				default:																		Log("Invalid value for SelectHobbyFarming()");
																							break;
			}
		}
	}
	
	//Checks "Limited Water Damage" check box
	public void CheckLimitedWaterDamage(String CheckLimitedWaterDamage) throws InterruptedException {
		if(!CheckLimitedWaterDamage.toUpperCase().equals("N/A")) {
			if(limitedwaterdamg.isEnabled()) {
				if(limitedwaterdamg.isSelected()) {
					switch(CheckLimitedWaterDamage.toUpperCase()) {
						case "Y": case "YES":		Log("\"Limited Water Damage\" check box marked");
												break;
												
						case "N": case "NO":	limitedwaterdamg.click();
													Log("\"Limited Water Damage\" check box NOT marked");
													Pause(3000);
												break;
					}
				}
				else {
					switch(CheckLimitedWaterDamage.toUpperCase()) {
						case "Y": case "YES":	limitedwaterdamg.click();
													Log("\"Limited Water Damage\" check box marked");
													Pause(3000);
												break;
												
						case "N": case "NO":		Log("\"Limited Water Damage\" check box NOT marked");
												break;
					}
				}
			}
			else if(limitedwaterdamg.isSelected()) {
				Log("Limited Water Damage is included");
		 	}
		 	else {
		 		Log("Limited Water Damage is not enabled");
		 	}
		}
	}
	
	//Checks "Personal Injury" check box
	public void CheckPersonalInjury(String CheckPersonalInjury) throws InterruptedException {
		if(!CheckPersonalInjury.toUpperCase().equals("N/A")) {
			if(personalinjury.isEnabled()) {
				if(personalinjury.isSelected()) {
					switch(CheckPersonalInjury.toUpperCase()) {
						case "Y": case "YES":		Log("\"Personal Injury\" check box marked");
												break;
												
						case "N": case "NO":	personalinjury.click();
													Log("\"Personal Injury\" check box NOT marked");
													Pause(3000);
												break;
					}
				}
				else {
					switch(CheckPersonalInjury.toUpperCase()) {
						case "Y": case "YES":	personalinjury.click();
													Log("\"Personal Injury\" check box marked");
													Pause(3000);
												break;
												
						case "N": case "NO":		Log("\"Personal Injury\" check box NOT marked");
												break;
					}
				}
			}
			else if(personalinjury.isSelected()) {
				 	Log("Personal Injury is included");
		 	}
		 	else {
		 			Log("Personal Injury is not enabled");
		 	}
		}
	}
	
	//Checks "Personal Property Replacement Cost" check box
	public void CheckPersonalPropertyReplacementCost(String CheckPersonalPropertyReplacementCost) throws InterruptedException {
		if(!CheckPersonalPropertyReplacementCost.toUpperCase().equals("N/A")) {
			if(personalpropreplccost.isEnabled()) {
				if(personalpropreplccost.isSelected()) {
					switch(CheckPersonalPropertyReplacementCost.toUpperCase()) {
						case "Y": case "YES":		Log("\"Personal Property Replacement Cost\" check box marked");
												break;
												
						case "N": case "NO":	personalpropreplccost.click();
													Log("\"Personal Property Replacement Cost\" check box NOT marked");
													Pause(3000);
												break;
					}
				}
				else {
					switch(CheckPersonalPropertyReplacementCost.toUpperCase()) {
						case "Y": case "YES":	personalpropreplccost.click();
													Log("\"Personal Property Replacement Cost\" check box marked");
													Pause(3000);
												break;
												
						case "N": case "NO":		Log("\"Personal Property Replacement Cost\" check box NOT marked");
												break;
					}
				}
			}
			else if(personalpropreplccost.isSelected()) {
					Log("Personal Property Replacement Cost is included");
			}
			else {
					Log("Personal Property Replacement Cost is not enabled");
			}
		}
	}
	
	//Checks "Special Personal Property" check box
	public void CheckSpecialPersonalProperty(String CheckSpecialPersonalProperty) throws InterruptedException {
		if(!CheckSpecialPersonalProperty.toUpperCase().equals("N/A")) {
			if(specialpersonalprop.isEnabled()) {
				if(specialpersonalprop.isSelected()) {
					switch(CheckSpecialPersonalProperty.toUpperCase()) {
						case "Y": case "YES":		Log("\"Special Personal Property\" check box marked");
												break;
												
						case "N": case "NO":	specialpersonalprop.click();
													Log("\"Special Personal Property\" check box NOT marked");
													Pause(3000);
												break;
					}
				}
				else {
					switch(CheckSpecialPersonalProperty.toUpperCase()) {
						case "Y": case "YES":	specialpersonalprop.click();
													Log("\"Special Personal Property\" check box marked");
													Pause(3000);
												break;
												
						case "N": case "NO":		Log("\"Special Personal Property\" check box NOT marked");
												break;
					}
				}
			}
			else if(specialpersonalprop.isSelected()) {
					Log("Special Personal Property is included");
			}
			else {
					Log("Special Personal Property is not enabled");
			}
		}
	}
	
	//Checks "Limited Foundation and Slab Buyback" check box
	public void CheckLimitedFoundationandSlabBuyback(String CheckLimitedFoundationandSlabBuyback) throws InterruptedException {
		if(!CheckLimitedFoundationandSlabBuyback.toUpperCase().equals("N/A")) {
			if(limitedfoundationandslabbuyback.isEnabled()) {
				if(limitedfoundationandslabbuyback.isSelected()) {
					switch(CheckLimitedFoundationandSlabBuyback.toUpperCase()) {
						case "Y": case "YES":		Log("\"Limited Foundation and Slab Buyback\" check box marked");
												break;
												
						case "N": case "NO":	limitedfoundationandslabbuyback.click();
													Log("\"Limited Foundation and Slab Buyback\" check box NOT marked");
													Pause(3000);
												break;
					}
				}
				else {
					switch(CheckLimitedFoundationandSlabBuyback.toUpperCase()) {
						case "Y": case "YES":	limitedfoundationandslabbuyback.click();
													Log("\"Limited Foundation and Slab Buyback\" check box marked");
													Pause(3000);
												break;
												
						case "N": case "NO":		Log("\"Limited Foundation and Slab Buyback\" check box NOT marked");
												break;
					}
				}
			}
			else if(limitedfoundationandslabbuyback.isSelected()) {
					Log("Limited Foundation and Slab Buyback is included");
			}
			else {
					Log("Limited Foundation and Slab Buyback is not enabled");
			}
		}
	}
	
	//Checks "Non Structural Hail Loss Limitation" check box
	public void CheckNonStructuralHailLossLimitation(String CheckNonStructuralHailLossLimitation) throws InterruptedException {
		if(driver.getPageSource().contains("Non Structural Hail Loss Limitation")) {
			if(!CheckNonStructuralHailLossLimitation.toUpperCase().equals("N/A")) {
				if(nshl.isEnabled()) {
					if(nshl.isSelected()) {
						switch(CheckNonStructuralHailLossLimitation.toUpperCase()) {
							case "Y": case "YES":		Log("\"Non Structural Hail Loss Limitation\" check box marked");
													break;
													
							case "N": case "NO":	nshl.click();
														Log("\"Non Structural Hail Loss Limitation\" check box NOT marked");
														Pause(3000);
													break;
						}
					}
					else {
						switch(CheckNonStructuralHailLossLimitation.toUpperCase()) {
							case "Y": case "YES":	nshl.click();
														Log("\"Non Structural Hail Loss Limitation\" check box marked");
														Pause(3000);
													break;
													
							case "N": case "NO":		Log("\"Non Structural Hail Loss Limitation\" check box NOT marked");
													break;
						}
					}
				}
				else if(nshl.isSelected()) {
						Log("Non Structural Hail Loss Limitation is included");
				}
				else {
						Log("Non Structural Hail Loss Limitation is not enabled");
				}
			}
		}
	}
	
	//Checks "Sinkhole" check box
	public void CheckSinkhole(String CheckSinkhole) throws InterruptedException {
		if(!CheckSinkhole.toUpperCase().equals("N/A")) {
			if(sinkhole.isEnabled()) {
				if(sinkhole.isSelected()) {
					switch(CheckSinkhole.toUpperCase()) {
						case "Y": case "YES":		Log("\"Sinkhole\" check box marked");
												break;
												
						case "N": case "NO":	sinkhole.click();
													Log("\"Sinkhole\" check box NOT marked");
													Pause(3000);
												break;
					}
				}
				else {
					switch(CheckSinkhole.toUpperCase()) {
						case "Y": case "YES":	sinkhole.click();
													Log("\"Sinkhole\" check box marked");
													Pause(3000);
												break;
												
						case "N": case "NO":		Log("\"Sinkhole\" check box NOT marked");
												break;
					}
				}
			}
			else if(specialpersonalprop.isSelected()) {
					Log("Special Personal Property is included");
			}
			else {
					Log("Special Personal Property is not enabled");
			}
		}
	}
	
	//Clicks the "Add New Item" button
	public void ClickAddNewItem() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", addnewitem);
				Log("Clicked Add New Item");		
	}
	
	//Selects multiple "Scheduled Personal Property" items from drop down
	public void ScheduledPersonalPropertyMultiple(String Item, String Value) throws InterruptedException {
		
		List<String> specialPersonalProp = new ArrayList<String>();

		specialPersonalProp.add("Antiques");
		specialPersonalProp.add("Bicycles");
		specialPersonalProp.add("Cameras and Projection Equip");
		specialPersonalProp.add("Coins");
		specialPersonalProp.add("Fine Arts (Breakage)");
		specialPersonalProp.add("Fine Arts (No Breakage)");
		specialPersonalProp.add("Furs");
		specialPersonalProp.add("Golfers Equipment");
		specialPersonalProp.add("Guns (Collectible)");
		specialPersonalProp.add("Guns (Fired)");
		specialPersonalProp.add("Jewelry");
		specialPersonalProp.add("Musical Instruments (Non Prof)");
		specialPersonalProp.add("Other Sports Equip");
		specialPersonalProp.add("Silverware");
		specialPersonalProp.add("Stamps");
		
		for (String LItem : specialPersonalProp) {
			if(LItem.equals(Item)) {	
				if(!Value.equals("N/A") && !Value.equals("0") && !Value.equals("N")) {
					WebElement SPPItem = driver.findElement(By.xpath("//select[contains(@id, 'List_"+sppi+"_Embedded_Questions_List_Item')]"));
					new Select(SPPItem).selectByVisibleText(Item);
						Log("Selected Scheduled Personal Property item: " + Item);
						Pause(5000);
							
					WebElement SPPQuantity = driver.findElement(By.xpath("//select[contains(@id, 'List_"+sppi+"_Embedded_Questions_List_Quantity')]"));
					new Select(SPPQuantity).selectByVisibleText("1");
						Log("Defaulted Quantity to: 1");
						Pause(5000);
							
					WebElement SPPValue = driver.findElement(By.xpath("//input[contains(@id, 'List_"+sppi+"_Embedded_Questions_List_Value')]"));
					String sppvalue = Value.replace("$", "").replace(",", "");
					SPPValue.sendKeys(sppvalue);
					SPPValue.sendKeys(Keys.TAB);
						Log("Defaulted Value to: " + Value);
						Pause(5000);
					
					ClickAddNewItem();
					sppi++;
				}
			}
		}
	}
	
	//Selects single "Scheduled Personal Property" item from drop downs
	public void ScheduledPersonalPropertySingle(String item, String quantity, String value) throws InterruptedException {
		if(item.toUpperCase().equals("N/A") || item.toUpperCase().equals("0") || item.toUpperCase().equals("N") || item.toUpperCase().equals("NO") || item.toUpperCase().equals("NONE") || item.toUpperCase().equals("0")) {
			Log("Entered Scheduled Personal Property: None");
		}
		else {
			new Select(sppitem).selectByVisibleText(item);
				Log("Selected: " + item);
				Pause(4000);			
			new Select(sppquantity).selectByVisibleText(quantity);
				Log("Defaulted Quantity to: " + quantity);
				Pause(4000);
			String amt = value.replace("$", "").replace(",", "");
			sppvalue.sendKeys(amt);
			sppvalue.sendKeys(Keys.TAB);
				Log("Defaulted Value to: " + value);
				Pause(4000);
		}
	}
	
	//Selects "Scheduled Personal Property - Jewelry" from drop down
	public void ScheduledPersonalPropertyJewelry(String value) throws InterruptedException {
		if(value.toUpperCase().equals("N/A") || value.toUpperCase().equals("0") || value.toUpperCase().equals("N") || value.toUpperCase().equals("NO") || value.toUpperCase().equals("NONE") || value.toUpperCase().equals("0")) {
			Log("Entered Scheduled Personal Property: None");
		}
		else {
			new Select(sppitem).selectByVisibleText("Jewelry");
				Log("Selected: Jewelry");
				Pause(4000);			
			new Select(sppquantity).selectByVisibleText("1");
				Log("Defaulted Quantity to: 1");
				Pause(4000);
			String amt = value.replace("$", "").replace(",", "");
			sppvalue.sendKeys(amt);
			sppvalue.sendKeys(Keys.TAB);
				Log("Defaulted Value to: " + value);
				Pause(4000);
		}
	}
	
	//Clicks the appropriate Bill Plan radio button
	public void ClickBillPlan(String ClickBillPlan) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		if(!ClickBillPlan.toUpperCase().equals("N/A")) {
			switch(ClickBillPlan.toUpperCase()) {		 	
				case "MB": case "MORTGAGE BILLED":			executor.executeScript("arguments[0].click()", mb);
																Log("Clicked the \"Mortgage Billed\" radio button on the Coverage/Bill Plans page");
						  									break;
				  		  	
				case "IPP": case "INSURED PAY PLAN":		executor.executeScript("arguments[0].click()", ipp);
																Log("Clicked the \"Insured Pay Plan\" radio button on the Coverage/Bill Plans page");
															break;
												
				case "IFP": case "INSURED FULL PAY":		executor.executeScript("arguments[0].click()", ifp);
																Log("Clicked the \"Insured Full Pay\" radio button on the Coverage/Bill Plans page");
															break;
				  		  	
				default:										Log("Invalid value for ClickBillPlan()");
															break;
			}
		}
	}

	// Clicks "Recalculate" button before continuing
	public void ClickRecalculate() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", recalculate);
			Log("Clicked on Recalculate");
	}
	
	//Returns Premium
	public String ReturnPremium(String log) throws InterruptedException {
		String prem = premium.getText().replace("$", "").replace(",", "");
		if(log.toUpperCase().equals("Y") || log.toUpperCase().equals("YES")) {
			Log("Total Premium:" + prem);
		}
		return prem;
	}
	
	//Clicks the "Portfolio ->" submission button
	public void ClickPortfolio() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", submit);
			Log("Clicked the \"Portfolio ->\" button on the Coverage/Bill Plans page");
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