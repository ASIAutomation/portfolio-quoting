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

public class AdditionalDetails extends TestBase {
	
	public static final Logger log = Logger.getLogger(AdditionalDetails.class.getName());
	
	String applypaperless;
	WebDriver driver;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_PriorLiabilityLimitsType")//Drop Down
	WebElement priorliab;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_FloorsAboveUnit")//Drop Down
	WebElement floorsabove;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_RenterOccupied")//Drop Down
	WebElement rentoccup;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_ReportedClaimsCount")//Drop Down
	WebElement reportedclaims;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_ChildrenResidentCount")//Drop Down
	WebElement numchildinhouse;	
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_OccupancyType")//Drop Down
	WebElement occupancy;	
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_MonthsOwnerOccupied")//Drop Down
	WebElement monthsowneroccuppied;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_WoodburningStoveFlag")//Drop down
	WebElement woodburningstove;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_OpenFoundation")//Drop down
	WebElement openfoundation;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_IntendEsign")//Drop Down
	WebElement esign;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_AnimalResidentCount")//Drop Down
	WebElement howmanydoganimals;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_AnimalType")//Drop Down
	WebElement anyofthefollowinganimalsownedorkept;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_AccreditedBuilder")//Drop Down
	WebElement accreditedbuilder;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_BuilderWarranty")//Drop Down
	WebElement builderwarrenty;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_AcvLossSettlement")//Drop Down
	WebElement acvlostsettlement;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_IsRetired")//Drop Down
	WebElement retired;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_AnyResidentsSmoke")//Drop Down
	WebElement residentsmoke;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_NewPurchase")//Drop Down
	WebElement newpurch;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_AgencyUmbrellaPolicy")//Drop Down
	WebElement umbrella;	
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_PackagePolicy")//Drop Down
	WebElement packagepolicy;	
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_SecuredSubdivision")//Drop Down
	WebElement securedsub;	
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_BurglarProtection")//Drop Down
	WebElement burglar;	
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_FireProtection")//Drop Down
	WebElement fire;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_WindowAndOpeningProtection")//Drop Down
	WebElement windowandotheropeningprotection;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_BuildingCode")//Drop Down
	WebElement buildingcode;	
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_WaterLeakProtection")//Drop Down
	WebElement waterleak;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_HomeUpdate")//Drop down
	WebElement homeupdate;
	
	@FindBy(id="AdditionalDetails_ProductSpecificInformation_List_0_Embedded_Questions_List_LatestPermitDate")//Text Box
	WebElement latestpermitdate;
	
	@FindBy(id="AdditionalDetails_Embedded_Questions_List_PaperlessPreference")//Drop Down
	WebElement paperless;
	
	@FindBy(xpath="//span[@class='fw400' and contains(text(),'COVERAGES/BILL PLANS')]")//Submission Button
	WebElement submit;
	
	@FindBy(xpath="//span[contains(text(),'Options')]")//Button
	WebElement options;
		
	@FindBy(xpath="//span[contains(text(),'Save & Exit')]")//Button
	WebElement save;
	
	//Constructor
	public AdditionalDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;		
	}
	
	//Selects "Prior Liability Limit" from drop down
	public void SelectPriorLiabilityLimit(String SelectPriorLiabilityLimit) {
		switch(SelectPriorLiabilityLimit.toUpperCase()) {
			case "<300": case "LESS THAN $300,000":														new Select(priorliab).selectByValue("300K-");
																											Log("Entered Prior Liability Limit: Less than $300,000");
																										break;
													
			case "300": case "$300,000": case "300000": case "300,000":									new Select(priorliab).selectByValue("300K");
																											Log("Entered Prior Liability Limit: $300,000");
																										break;	
													
			case ">300": case "GREATER THAN $300,000":													new Select(priorliab).selectByValue("300K+");
																											Log("Entered Prior Liability Limit: Greater than $300,000");
																										break;
			
			case "LP": case "LAPSE IN COVERAGE": case "LAPSE IN COVERAGE (30 DAYS OR LESS)":			new Select(priorliab).selectByValue("Lapse");
																											Log("Entered Prior Liability Limit: "+ new Select(priorliab).getFirstSelectedOption().getText());
																										break;
														
			case "NP": case "NO PRIOR LIABILITY LIMIT": case "NO PRIOR OR LAPSE GREATER THAN 30 DAYS":	new Select(priorliab).selectByValue("NoPrior");
																											Log("Entered Prior Liability Limit: " + new Select(priorliab).getFirstSelectedOption().getText());
																										break;
														
			case "NA": case "FIRST TIME HOME BUYER":													new Select(priorliab).selectByValue("FirstTime");
																											Log("Entered Prior Liability Limit: First Time Home Buyer");
																										break;
																										
			default:																						Log("Invalid value for SelectPriorLiabilityLimit()");
																										break;
		}
	}
	
	//Selects "Prior Liability Limit" from drop down
	public void SelectPriorLiabilityLimitOld(String SelectPriorLiabilityLimitOld) {
		int randsubbasement = RandomNum(1,2);
		switch(SelectPriorLiabilityLimitOld.toUpperCase()) {
			case "100": case "$10,000 - $100,000": case "$10000 - $100000": case "10,000 - 100,000": case "10000 - 100000":	new Select(priorliab).selectByValue("300K-");
																																Log("Entered Prior Liability Limit: $10,000 - $100,000");
																															break;
													
			case "300": case "$300,000": case "300000": case "300,000":														if(randsubbasement==1) {
																																new Select(priorliab).selectByValue("300K");
																																	Log("Entered Prior Liability Limit: $100,001 - $300,000");
																															}
																															else {
																																new Select(priorliab).selectByValue("300K+");
																																	Log("Entered Prior Liability Limit: $300,001+");	
																																}
																															break;	
														
			case "NA": case "FIRST TIME HOME BUYER":																		new Select(priorliab).selectByValue("FirstTime");
																																Log("Entered Prior Liability Limit: First Time Home Buyer");
																															break;	
																															
			case "NP": case "NO PRIOR LIABILITY LIMIT":																		new Select(priorliab).selectByValue("NoPrior");
																																Log("Entered Prior Liability Limit: No Prior Liability Limit");
																															break;	
																															
			case "LP": case "LAPSE IN COVERAGE":																			new Select(priorliab).selectByValue("Lapse");
																																Log("Entered Prior Lapse in Coverage");
																															break;
																															
			default:																											Log("Invalid value for SelectPriorLiabilityLimitOld()");
																															break;
		}
	}
	
	//Returns the value in the "Prior Liability Limit" drop down
	public String ReturnPriorLiabilityLimit() {
		if(new Select(priorliab).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(priorliab).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Floors Above Unit" from drop down
	public void SelectFloorsAboveUnit(String SelectFloorsAboveUnit) {
		switch(SelectFloorsAboveUnit.toUpperCase()) {
			case "0": case "NO FLOORS ABOVE": case "N": case "NO": case "NONE":	new Select(floorsabove).selectByVisibleText("No Floors Above");
																					Log("Entered Floors Above Unit: No Floors Above");
																				break;
												
			case "1": case "1 FLOOR":											new Select(floorsabove).selectByVisibleText("1 Floor");
																					Log("Entered Floors Above Unit: 1 Floor");
																				break;
			
			case "2": case "2 FLOORS":											new Select(floorsabove).selectByVisibleText("2 Floors");
																					Log("Entered Floors Above Unit: 2 Floors");
																				break;
												
			case "3+": case "3 OR MORE FLOORS":									new Select(floorsabove).selectByVisibleText("3 or more Floors");
																					Log("Entered Floors Above Unit: 3 or more Floors");
																				break;
																				
			default:																Log("Invalid value for SelectFloorsAboveUnit()");
																				break;
		}
	}
	
	//Selects "Reported claims excluding wind, hail, or lightning in the past 3 years" from drop down
	public void SelectReportedClaims(String SelectReportedClaims) {
		switch(SelectReportedClaims.toUpperCase()) {
			case "0": case "0 CLAIMS": case "N": case "NO": case "NONE":	new Select(reportedclaims).selectByVisibleText("0 Claims");
																				Log("Entered Reported claims excluding wind, hail, or lightning in the past 3 years: 0 Claims");
																			break;
										
			case "1": case "1 CLAIM":										new Select(reportedclaims).selectByVisibleText("1 Claim");
																				Log("Entered Reported claims excluding wind, hail, or lightning in the past 3 years: 1 Claim");
																			break;
										
			case "2": case "2 OR MORE": case "2 CLAIMS":					if(reportedclaims.getText().contains("2 Claims")) {
																				new Select(reportedclaims).selectByVisibleText("2 Claims");
																					Log("Entered Reported claims excluding wind, hail, or lightning in the past 3 years: 2 Claims");
																			}
																			else {
																				new Select(reportedclaims).selectByVisibleText("2 or More");
																					Log("Entered Reported claims excluding wind, hail, or lightning in the past 3 years: 2 or More");		
																			}
																			break;

			case "3": case "3 OR MORE CLAIMS":								if(reportedclaims.getText().contains("3 or More Claims")) {
																				new Select(reportedclaims).selectByVisibleText("3 or More Claims");
																					Log("Entered Reported claims excluding wind, hail, or lightning in the past 3 years: 3 or More Claims");
																			}
																			else if(reportedclaims.getText().contains("3 or More")) {
																				new Select(reportedclaims).selectByVisibleText("3 or More");
																					Log("Entered Reported claims excluding wind, hail, or lightning in the past 3 years: 3 or More");
																			}
																			else {
																				new Select(reportedclaims).selectByVisibleText("2 or More");
																					Log("Entered Reported claims excluding wind, hail, or lightning in the past 3 years: 2 or More");
																			}
																			break;
																			
			default:															Log("Invalid value for SelectReportedClaims()");
																			break;
		}
	}
	
	//Returns the value in the "Reported claims excluding wind, hail, or lightning in the past 3 years" field
	public String ReturnReportedClaims() {
		if(new Select(reportedclaims).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(reportedclaims).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Renter Occupied" from drop down
	public void SelectRenterOccupied(String SelectRenterOccupied) {
		switch(SelectRenterOccupied.toUpperCase()) {
			case "N": case "NO": case "NONE":	new Select(rentoccup).selectByVisibleText("No");
													Log("Entered Renter Occupied: No");
												break;
									
			case "L": case "ANNUAL CONTRACT":	new Select(rentoccup).selectByVisibleText("Annual Contract");
													Log("Entered Renter Occupied: Annual Contract");
												break;
												
			case "S": case "SHORT TERM":		new Select(rentoccup).selectByVisibleText("Short Term");
													Log("Entered Renter Occupied: Short Term");
												break;
												
			default:								Log("Invalid value for SelectRenterOccupied()");
												break;
		}
	}
	
	//Selects "Number of children in household under 18" from drop down
	public void SelectNumberOfChildren(String SelectNumberOfChildren) {
		switch(SelectNumberOfChildren.toUpperCase()) {
			case "9": case "9 OR MORE":	new Select(numchildinhouse).selectByVisibleText("9 or more");
											Log("Entered Number of children in household under 18: 9 or more");
										break;
						
			default:					new Select(numchildinhouse).selectByVisibleText(SelectNumberOfChildren);
											Log("Entered Number of children in household under 18: " + SelectNumberOfChildren);
										break;		
		}
	}
	
	//Selects "Occupancy" from drop down
	public void SelectOccupancy(String SelectOccupancy) {
		switch(SelectOccupancy.toUpperCase()) {
			case "P": case "PRIMARY RESIDENCE":				new Select(occupancy).selectByVisibleText("Primary Residence");
																Log("Entered Occupancy: Primary Residence");
															break;
												
			case "S": case "SECONDARY/SEASONAL RESIDENCE":	new Select(occupancy).selectByVisibleText("Secondary/Seasonal Residence");
																Log("Entered Occupancy: Secondary/Seasonal Residence");
															break;
															
			default:											Log("Invalid value for SelectOccupancy()");
															break;
		}
	}
	
	//Selects "Months Owner Occupied" from drop down
	public void SelectMonthsOwnerOccupied(String SelectMonthsOwnerOccupied) {
		switch(SelectMonthsOwnerOccupied.toUpperCase()) {
			case "9": case "9 MONTHS OR MORE":				new Select(monthsowneroccuppied).selectByVisibleText("9 months or more");
																Log("Entered Occupancy: 9 months or more");
															break;
												
			case "4": case "4-8 MONTHS":					new Select(monthsowneroccuppied).selectByVisibleText("4-8 months");
																Log("Entered Occupancy: 4-8 months");
															break;
															
			case "0": case "0-3 MONTHS":					new Select(monthsowneroccuppied).selectByVisibleText("0-3 months");
																Log("Entered Occupancy: 0-3 months");
															break;
															
			default:											Log("Invalid value for SelectMonthsOwnerOccupied()");
															break;
		}
	}
	
	//Selects "Woodburning Stove" from drop down
	public void SelectWoodburningStove(String SelectWoodburningStove) {
		switch(SelectWoodburningStove.toUpperCase()) {
			case "Y": case "YES":	new Select(woodburningstove).selectByVisibleText("Yes");
										Log("Entered Woodburning Stove: Yes");
									break;
				
			case "N": case "NO":	new Select(woodburningstove).selectByVisibleText("No");
										Log("Entered Woodburning Stove: No");
									break;
		}
	}
	
	//Selects "Open Foundation" from drop down
	public void SelectOpenFoundation(String SelectOpenFoundation) {
		switch(SelectOpenFoundation.toUpperCase()) {
			case "Y": case "YES":	new Select(openfoundation).selectByVisibleText("Yes");
										Log("Entered Open Foundation: Yes");
									break;
				
			case "N": case "NO":	new Select(openfoundation).selectByVisibleText("No");
										Log("Entered Open Foundation: No");
									break;
		}
	}
	
	//Selects "E-Signature" from drop down
	public void SelectESign(String SelectESign) {
		switch(SelectESign.toUpperCase()) {
			case "N": case "NO":	new Select(esign).selectByVisibleText("No");
										Log("Entered E-Signature: No");
									break;
									
			case "Y": case "YES":	new Select(esign).selectByVisibleText("Yes");
										Log("Entered E-Signature: Yes");
									break;		
		}
	}
	
	//Selects "How many dogs/animals owned or kept?" from drop down
	public void SelectHowManyDogsAnimalsOwnedorKept(String SelectHowManyDogsAnimalsOwnedorKept) {
		switch(SelectHowManyDogsAnimalsOwnedorKept.toUpperCase()) {
			case "0": case "N": case "NONE":	new Select(howmanydoganimals).selectByVisibleText("None");
													Log("Entered How many dogs/animals owned or kept?: None");
												break;
			case "9": case "9 OR MORE":			new Select(howmanydoganimals).selectByVisibleText("9 or more");
													Log("Entered How many dogs/animals owned or kept?: 9 or more");
												break;
						
			default:							new Select(howmanydoganimals).selectByVisibleText(SelectHowManyDogsAnimalsOwnedorKept);
													Log("Entered How many dogs/animals owned or kept?: " + SelectHowManyDogsAnimalsOwnedorKept);
												break;		
		}
	}
	
	//Selects "Are any of the following animals owned or kept?" from drop down
	public void SelectAreAnyoftheFollowingAnimalsOwnedorKept(String SelectAreAnyoftheFollowingAnimalsOwnedorKept) {
		switch(SelectAreAnyoftheFollowingAnimalsOwnedorKept.toUpperCase()) {
			case "0": case "N": case "NO": case "NONE":	new Select(anyofthefollowinganimalsownedorkept).selectByVisibleText("No");
															Log("Entered Are any of the following animals owned or kept?: None");
														break;

						
			default:									new Select(anyofthefollowinganimalsownedorkept).selectByVisibleText(SelectAreAnyoftheFollowingAnimalsOwnedorKept);
															Log("Entered Are any of the following animals owned or kept?: " + SelectAreAnyoftheFollowingAnimalsOwnedorKept);
														break;		
		}
	}
	
	//Selects "Accredited Builder" from drop down
	public void SelectAccreditedBuilder(String SelectAccreditedBuilder) {
		switch(SelectAccreditedBuilder.toUpperCase()) {
			case "N": case "NO":	new Select(accreditedbuilder).selectByVisibleText("No");
										Log("Entered Accredited Builder: No");
									break;
	
			case "Y": case "YES":	new Select(accreditedbuilder).selectByVisibleText("Yes");
										Log("Entered Accredited Builder: Yes");
									break;	
		}
	}
	
	//Selects "Builder Warrenty" from drop down
	public void SelectBuilderWarrenty(String SelectBuilderWarrenty) {
		switch(SelectBuilderWarrenty.toUpperCase()) {
			case "N": case "NO":	new Select(builderwarrenty).selectByVisibleText("No");
										Log("Entered Builder Warrenty: No");
									break;
	
			case "Y": case "YES":	new Select(builderwarrenty).selectByVisibleText("Yes");
										Log("Entered Builder Warrenty: Yes");
									break;	
		}
	}
	
	//Selects "ACV Loss Settlement-Wind/Hail Losses to Roof" from drop down
	public void SelectACVLossSettlement(String SelectACVLossSettlement) {
		switch(SelectACVLossSettlement.toUpperCase()) {
			case "N": case "NO": case "REPLACEMENT COST": case "RC":			new Select(acvlostsettlement).selectByVisibleText("Replacement Cost");
																					Log("Entered ACV Loss Settlement-Wind/Hail Losses to Roof: Replacement Cost");
																				break;
															
			case "Y": case "YES": case "ACTUAL CASH VALUE (ACV)": case "ACV":	new Select(acvlostsettlement).selectByVisibleText("Actual Cash Value (ACV)");
																					Log("Entered ACV Loss Settlement-Wind/Hail Losses to Roof: Actual Cash Value (ACV)");
																				break;
																				
			default:																Log("Invalid value for SelectACVLossSettlement()");
																				break;
		}
	}
	
	//Selects "Are you retired?" from drop down
	public void SelectAreYouRetired(String SelectAreYouRetired) {
		switch(SelectAreYouRetired.toUpperCase()) {
			case "N": case "NO":	new Select(retired).selectByVisibleText("No");
										Log("Entered Are you retired?: No");
									break;
	
			case "Y": case "YES":	new Select(retired).selectByVisibleText("Yes");
										Log("Entered Are you retired?: Yes");
									break;	
		}
	}
	
	//Selects "Do any residents smoke?" from drop down
	public void SelectResidentsSmoke(String SelectResidentsSmoke) {
		switch(SelectResidentsSmoke.toUpperCase()) {
			case "N": case "NO":	new Select(residentsmoke).selectByVisibleText("No");
										Log("Entered Do any residents smoke?: No");
									break;
	
			case "Y": case "YES":	new Select(residentsmoke).selectByVisibleText("Yes");
										Log("Entered Do any residents smoke?: Yes");
									break;	
		}
	}
	
	//Selects "New Purchase" from drop down
	public void SelectNewPurchase(String SelectNewPurchase) {
		switch(SelectNewPurchase.toUpperCase()) {
			case "N": case "NO":			new Select(newpurch).selectByVisibleText("No");
												Log("Entered New Purchase: No");
											break;
	
			case "Y": case "YES": case "1":	new Select(newpurch).selectByVisibleText("Yes");
												Log("Entered New Purchase: Yes");
											break;	
		}
	}
	
	//Selects "Does Insured have an Umbrella Policy?" from drop down
	public void SelectUmbrella(String SelectUmbrella) {
		switch(SelectUmbrella.toUpperCase()) {
			case "N": case "NO":	new Select(umbrella).selectByVisibleText("No");
										Log("Entered Does Insured have an Umbrella Policy?: No");
									break;
	
			case "Y": case "YES":	new Select(umbrella).selectByVisibleText("Yes");
										Log("Entered Does Insured have an Umbrella Policy?: Yes");
									break;	
		}
	}
	
	//Selects "Package Policy" from drop down
	public void SelectPackagePolicy(String SelectPackagePolicy) {
		switch(SelectPackagePolicy.toUpperCase()) {
			case "A": case "OTHER COMPANY AUTO":											new Select(packagepolicy).selectByVisibleText("Other Company Auto");
																								Log("Entered Package Policy: Other Company Auto");
																							break;
													
			case "F": case "FLOOD":															new Select(packagepolicy).selectByVisibleText("Flood");
																								Log("Entered Package Policy: Flood");
																							break;
													
			case "N": case "NONE":															new Select(packagepolicy).selectByVisibleText("None");
																								Log("Entered Package Policy: None");
																							break;
													
			case "PROGRESSIVE AUTO":														new Select(packagepolicy).selectByVisibleText("Progressive Auto");
																								Log("Entered Package Policy: Progressive Auto");
																							break;
																				
			case "PREFERRED PARTNER AUTO":													new Select(packagepolicy).selectByVisibleText("Preferred Partner Auto");
																								Log("Entered Package Policy: Preferred Partner Auto");
																							break;
																				
			case "COMPANION AUTO":															new Select(packagepolicy).selectByVisibleText("Companion Auto");
																								Log("Entered Package Policy: Companion Auto");
																							break;
																							
			case "P15": case "P25": case "PP25": case "PROGRESSIVE AUTO LESS THAN 50/100":	new Select(packagepolicy).selectByVisibleText("Progressive Auto Less than 50/100");
																								Log("Entered Package Policy: Progressive Auto Less than 50/100");
																							break;
																				
			case "P50": case "PP50": case "PROGRESSIVE AUTO 50/100":						new Select(packagepolicy).selectByVisibleText("Progressive Auto 50/100");
																								Log("Entered Package Policy: Progressive Auto 50/100");
																							break;
																				
			case "P100": case "PP100": case "PROGRESSIVE AUTO 100/300":						new Select(packagepolicy).selectByVisibleText("Progressive Auto 100/300");
																								Log("Entered Package Policy: Progressive Auto 100/300");
																							break;
																				
			case "P250": case "PP250": case "PROGRESSIVE AUTO 250/500":						new Select(packagepolicy).selectByVisibleText("Progressive Auto 250/500");
																								Log("Entered Package Policy: Progressive Auto 250/500");
																							break;
																				
			default:																			Log("Invalid value for SelectPackagePolicy()");
																							break;
		}
	}
	
	//Selects "Secured Subdivision" from drop down
	public void SelectSecuredSubdivision(String SelectSecuredSubdivision) {
		switch(SelectSecuredSubdivision.toUpperCase()) {
			case "N": case "NO":	new Select(securedsub).selectByVisibleText("No");
										Log("Entered Secured Subdivision: No");
									break;
	
			case "Y": case "YES":	new Select(securedsub).selectByVisibleText("Yes");
										Log("Entered Secured Subdivision: Yes");
									break;	
		}
	}
	
	//Selects "Burglar Protection" from drop down
	public void SelectBurglarProtection(String SelectBurglarProtection) throws InterruptedException {
		switch(SelectBurglarProtection.toUpperCase()) {
			case "0": case "NONE": case "N": case "NO":						Log("Entered Burglar Protection: None");
																		break;
						
			case "1": case "LOCAL BURGLAR ALARM":						new Select(burglar).selectByVisibleText("Local Burglar Alarm");
																			Log("Entered Burglar Protection: Local Burglar Alarm");
																		break;
						
			case "2": case "REP TO CENTRAL STATION":					new Select(burglar).selectByVisibleText("Rep to Central Station");
																			Log("Entered Burglar Protection: Rep to Central Station");
																		break;
						
			case "3": case "REP TO CENTRAL STATION WITH DATA SHARING":	new Select(burglar).selectByVisibleText("Rep to Central Station with Data Sharing");
																			Log("Entered Burglar Protection: Rep to Central Station with Data Sharing");
																		break;
		
			case "4": case "MOTION DETECTING CAMERA":					new Select(burglar).selectByVisibleText("Motion Detecting Camera");
																			Log("Entered Burglar Protection: Motion Detecting Camera");
																		break;
		
			case "5": case "MOTION DETECTING CAMERA WITH DATA SHARING":	new Select(burglar).selectByVisibleText("Motion Detecting Camera with Data Sharing");
																			Log("Entered Burglar Protection: Motion Detecting Camera with Data Sharing");
																		break;
		
			case "6": case "SMART BURGLAR ALARM":						new Select(burglar).selectByVisibleText("Smart Burglar Alarm");
																			Log("Entered Burglar Protection: Smart Burglar Alarm");
																		break;
		
			case "7": case "SMART BURGLAR ALARM WITH DATA SHARING":		new Select(burglar).selectByVisibleText("Smart Burglar Alarm with Data Sharing");
																			Log("Entered Burglar Protection: Smart Burglar Alarm with Data Sharing");
																		break;
																		
			default:														Log("Invalid value for SelectBurglarProtection()");
																		break;
		}		
	}
	
	//Selects "Fire Protection" from drop down
	public void SelectFireProtection(String SelectFireProtection) {
		switch(SelectFireProtection.toUpperCase()) {
			case "0": case "SMOKE ALARM":								new Select(fire).selectByVisibleText("Smoke Alarm");
																			Log("Entered Fire Protection: Smoke Alarm");
																		break;
											
			case "1": case "REP TO CENTRAL STATION":					new Select(fire).selectByVisibleText("Rep to Central Station");
																			Log("Entered Fire Protection: Rep to Central Station");
																		break;
														
			case "2": case "SPRINKLER SYSTEM":							new Select(fire).selectByVisibleText("Sprinkler System");
																			Log("Entered Fire Protection: Sprinkler System");
																		break;
												
			case "3": case "REP TO CENTRAL STATION WITH DATA SHARING":	new Select(fire).selectByVisibleText("Rep to Central Station with Data Sharing");
																			Log("Entered Fire Protection: Rep to Central Station with Data Sharing");
																		break;
																		
			case "4": case "SMART SMOKE DETECTOR":						new Select(fire).selectByVisibleText("Smart Smoke Detector");
																			Log("Entered Fire Protection: Smart Smoke Detector");
																		break;
													
			case "5": case "SMART SMOKE DETECTOR WITH DATA SHARING":	new Select(fire).selectByVisibleText("Smart Smoke Detector with Data Sharing");
																			Log("Entered Fire Protection: Smart Smoke Detector with Data Sharing");
																		break;
																		
			default:														Log("Invalid value for SelectFireProtection()");
																		break;
		}
	}
	
	//Selects "Window and Other Opening Protection" from drop down
	public void SelectWindowandOtherOpeningProtection(String SelectWindowandOtherOpeningProtection) {
		switch(SelectWindowandOtherOpeningProtection.toUpperCase()) {
			case "N": case "NO":	new Select(windowandotheropeningprotection).selectByVisibleText("No");
										Log("Entered Window and Other Opening Protection: No");
									break;
	
			case "Y": case "YES":	new Select(windowandotheropeningprotection).selectByVisibleText("Yes");
										Log("Entered Window and Other Opening Protection: Yes");
									break;	
		}
	}
	
	//Selects "Building Code" from drop down
	public void SelectBuildingCode(String SelectBuildingCode) {
		switch(SelectBuildingCode.toUpperCase()) {
			case "N": case "NO":	new Select(buildingcode).selectByVisibleText("No");
										Log("Entered Building Code: No");
									break;
	
			case "Y": case "YES":	new Select(buildingcode).selectByVisibleText("Yes");
										Log("Entered Building Code: Yes");
									break;	
		}
	}
	
	//Selects "Water Leak Protection" from drop down
	public void SelectWaterLeakProtection(String SelectWaterLeakProtection) throws InterruptedException {
		switch(SelectWaterLeakProtection.toUpperCase()) {
			case "0": case "NONE":case "N": case "NO":									Log("Entered Water Leak Protection: None");
																					break;
				
			case "1": case "WATER LEAK SENSORS":									new Select(waterleak).selectByVisibleText("Water Leak Sensors");
																						Log("Entered Water Leak Protection: Water Leak Sensors");
																					break;
			
			case "2": case "WATER LEAK SENSORS WITH DATA SHARING":					new Select(waterleak).selectByVisibleText("Water Leak Sensors with Data Sharing");
																						Log("Entered Water Leak Protection: Water Leak Sensors with Data Sharing");
																					break;
				
			case "3": case "WATER LEAK SENSORS WITH AUTO SHUT OFF":					new Select(waterleak).selectByVisibleText("Water Leak Sensors with Auto Shut Off");
																						Log("Entered Water Leak Protection: Water Leak Sensors with Auto Shut Off");
																					break;
				
			case "4": case "WATER LEAK SENSORS WITH AUTO SHUT OFF & DATA SHARING":	new Select(waterleak).selectByVisibleText("Water Leak Sensors with Auto Shut Off & Data Sharing");
																						Log("Entered Water Leak Protection: Water Leak Sensors with Auto Shut Off & Data Sharing");
																					break;
				
			case "5": case "WATER FLOW MONITOR WITH AUTO SHUT OFF":					new Select(waterleak).selectByVisibleText("Water Flow Monitor with Auto Shut Off");
																						Log("Entered Water Leak Protection: Water Flow Monitor with Auto Shut Off");
																					break;
				
			case "6": case "WATER FLOW MONITOR WITH AUTO SHUT OFF & DATA SHARING":	new Select(waterleak).selectByVisibleText("Water Flow Monitor with Auto Shut Off & Data Sharing");
																						Log("Entered Water Leak Protection: Water Flow Monitor with Auto Shut Off & Data Sharing");
																					break;
																					
			default:																	Log("Invalid value for SelectWaterLeakProtection()");
																					break;
		}
	}
	
	//Selects "Home Update" from drop down
	public void SelectHomeUpdate(String SelectHomeUpdate) throws InterruptedException {
		if(homeupdate.isEnabled()) {
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
		else {
				Log("Home Update Prefilled with: " + new Select(homeupdate).getFirstSelectedOption().getText());
		}
	}
	
	//Force selects "Home Update" from drop down
	public void ForceSelectHomeUpdate(String ForceSelectHomeUpdate) throws InterruptedException {
		if(homeupdate.isEnabled()) {
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
		else {
				Log("Home Update Prefilled with: " + new Select(homeupdate).getFirstSelectedOption().getText());
		}
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
		if(latestpermitdate.isEnabled()) {
			if(latestpermitdate.getAttribute("ng-reflect-model").isEmpty()) {
				latestpermitdate.clear();
				latestpermitdate.sendKeys(TypeLatestPermitDate);
				latestpermitdate.sendKeys(Keys.TAB);
					Log("Entered Latest Permit Date: " + TypeLatestPermitDate);
					Pause(1000);
			}
			else {
					Log("Latest Permit Date already entered: " + latestpermitdate.getAttribute("ng-reflect-model"));
			}
		}
		else {
				Log("Latest Permit Date Prefilled with: " + latestpermitdate.getText());
		}
	}
	
	//Force types into "Latest Permit Date" text box
	public void ForceTypeLatestPermitDate(String ForceTypeLatestPermitDate) throws InterruptedException {
		if(latestpermitdate.isEnabled()) {
			latestpermitdate.clear();
			latestpermitdate.sendKeys(ForceTypeLatestPermitDate);
			latestpermitdate.sendKeys(Keys.TAB);
				Log("Entered Latest Permit Date: " + ForceTypeLatestPermitDate);
				Pause(1000);
		}
		else {
				Log("Latest Permit Date Prefilled with: " + latestpermitdate.getAttribute("ng-reflect-model"));
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
	
	//Selects "Apply Paperless and accept documents and bills delivered through e-mail?" from drop down
	public void SelectPaperless(String SelectPaperless) {
		switch(SelectPaperless.toUpperCase()) {
			case "N": case "NO":	new Select(paperless).selectByVisibleText("No");
										Log("Entered Apply Paperless and accept documents and bills delivered through e-mail?: No");
									break;
	
			case "Y": case "YES":	new Select(paperless).selectByVisibleText("Yes");
										Log("Entered Apply Paperless and accept documents and bills delivered through e-mail?: Yes");
									break;	
		}
	}
	
	//Clicks the "Coverage/Bill Plans ->" submission button
	public void ClickCoverageBillPlans() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", submit);
			Log("Clicked the \"Coverage/Bill Plans ->\" button on the Additional Details page");
	}
	
	//Saves Quote
	public void SaveQuote() {
		Actions action = new Actions(driver);
		action.moveToElement(options).moveToElement(save).click().build().perform();
			Log("Saved Quote");
	}
}