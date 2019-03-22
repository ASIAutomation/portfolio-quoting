package Automation.IAQ.PS.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.IAQ.testBase.TestBase;

public class PolicyRatingPage1 extends TestBase {
	
public static final Logger log = Logger.getLogger(PolicyRatingPage1.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="lblAgentID")//Text
	WebElement agentid;
	
	@FindBy(id="Form_PLMaster_EffectiveDate")//Text Box
	WebElement effdate;
	
	@FindBy(id="Form_PLInsured_LastName")//Text Box
	WebElement lname;
	
	@FindBy(id="Form_PLInsured_FirstName")//Text Box
	WebElement fname;
	
	@FindBy(id="Form_PLInsured_MiddleInit")//Text Box
	WebElement mname;	
	
	@FindBy(id="Form_PLInsured_Occupation")//Drop Down
	WebElement occupation;
	
	@FindBy(id="Form_PLMaster_BirthDate")//Text Box
	WebElement dob;
	
	@FindBy(id="Form_PLInsured_HomePhone")//Text Box
	WebElement hphone;
	
	@FindBy(id="Form_PLInsured_WorkPhone")//Text Box
	WebElement mphone;
	
	@FindBy(id="Form_PLLocation_locAddress")//Text Box
	WebElement addy1;
	
	@FindBy(id="Form_PLLocation_locApartmentNumber")//Text Box
	WebElement addy2;
	
	@FindBy(id="Form_PLLocation_locCity")//Text Box
	WebElement city;
	
	@FindBy(id="Form_PLLocation_locState")//Text Box
	WebElement state;
	
	@FindBy(id="Form_PLLocation_locZipCode")//Text Box
	WebElement zip;
	
	@FindBy(id="Form_PLMaster_ExcludeWind")//Drop Down
	WebElement excludewind;
	
	@FindBy(id="Form_PLDwelling_YearBuilt")//Text Box
	WebElement yearhomebuilt;
	
	@FindBy(id="Form_PLDwelling_TypeConstruction")//Drop Down
	WebElement typeofconstruction;
	
	@FindBy(id="Form_PLCostestimator_ExteriorWalls")//Drop Down
	WebElement extwalls;
	
	@FindBy(id="Form_PLCostestimator_numStories")//Drop Down
	WebElement numofstories;
	
	@FindBy(id="Form_PLMaster_CovgA")//Text Box
	WebElement covga;
	
	@FindBy(id="Form_PLMaster_CovgC")//Text Box
	WebElement covgc;	
	
	@FindBy(id="Form_PLMaster_ProtectionClass")//Drop Down
	WebElement protectionclass;
	
	@FindBy(id="Form_PLDwelling_YearRoofInstalled")//Text Box
	WebElement yearroofinstalled;	
	
	@FindBy(id="Form_PLCostestimator_RoofDesign")//Drop Down
	WebElement roofdesign;	
	
	@FindBy(id="Form_PLCostestimator_RoofingMaterial")//Drop Down
	WebElement roofmat;
	
	@FindBy(id="Form_PLInsured_PurchaseDate")//Text Box
	WebElement purchdate;
	
	@FindBy(id="Form_PLMaster_PurchasePrice")//Text Box
	WebElement purchprice;		
	
	@FindBy(id="Form_PLInsured_NewPurchase")//Check Box
	WebElement riskhforahomeclosing;		
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_RiskIsDeclind")//Check Box
	WebElement overridedeclinerisk;
	
	@FindBy(xpath="//select[contains(@id, 'Master_ClaimsCount')]")//Drop Down
	WebElement overrideclaimcount;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_DwellingCvgCode")//Check Box
	WebElement overridedwellingcoverage;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_GenUW")//Check Box
	WebElement overridegeneralunderwriting;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_SocialSecNum")//Check Box
	WebElement overridesocialsecurity;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_WaterDamageExc")//Check Box
	WebElement overridewaterdamageexclusion;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_AnimalLiability")//Check Box
	WebElement overrideanimalliability;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_PurchasePrice")//Check Box
	WebElement overridepurchaseprice;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_ShortSaleOrForeclosure")//Check Box
	WebElement overrideshortsaleorforeclosure;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_WindowsAndOpenings")//Check Box
	WebElement overridewindowsandopeningprotection;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_FireLine")//Check Box
	WebElement overridebrushfire;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_EligibilityRefer")//Check Box
	WebElement overrideeligibilityreferral;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_FloodZone")//Check Box
	WebElement overridefloodzone;
	
	@FindBy(id="Form_PLOverrideNotes_Note")//Text Box
	WebElement overridenotes;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_CreditScore")//Text Box
	WebElement overridecreditscore;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_GeoLocationCode")//Check Box
	WebElement overridegeolocation;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_AddressCode")//Check Box
	WebElement overrideaddress;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_ContentsCovg")//Check Box
	WebElement overridecovgc;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_ClosedZipCode")//Check Box
	WebElement overrideclosedzipcode;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_LeadLiability")//Check Box
	WebElement overrideremoveleadliabilityexclusion;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_LWD")//Check Box
	WebElement overridelimitedwaterdamage;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_HomeShieldPackage")//Check Box
	WebElement overridehomeshieldpackage;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_HomeShieldPlusPackage")//Check Box
	WebElement overridehomeshieldpluspackage;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_FunctionalRC")//Check Box
	WebElement overridefunctionalreplacementcost;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_UpdatedHome")//Check Box
	WebElement overrideupdatedhomediscount;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_ASIClueCount")//Text Box
	WebElement overrideasiclaimsurcharge;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_PreviousClaimsCode")//Check Box
	WebElement overridepreviousclaims;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_FlatRoofCode")//Check Box
	WebElement overrideflatroof;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_AddressStandardization")//Check Box
	WebElement overrideaddressstandardization;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_CLUECode")//Check Box
	WebElement overrideclue;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_PremisesLiability")//Check Box
	WebElement overridepremisesliab;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_ContractorLicense#")//Check Box
	WebElement overridecontractlicnum;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_AgeOfDwelling")//Check Box
	WebElement overrideageofdwelling;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_LossAssessment")//Check Box
	WebElement overridelossassessment;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_PriorLiabilityLimit")//Check Box
	WebElement overridepriorliabilitylimit;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_Acreage")//Check Box
	WebElement overrideacreage;
	
	@FindBy(id="Form_PLOverrideVert_OverrideName_SPP")//Check Box
	WebElement overridescheduledpersonalproperty;
	
	@FindBy(id="tblErrorMessages")//Text
	WebElement edits;

	@FindBy(id="btnNext")//Button
	WebElement next;

	@FindBy(id="btnSave")//Button
	WebElement save;

	@FindBy(id="btnOverride")//Button
	WebElement override;
	
	@FindBy(id="lblPolicyID")//Text
	WebElement policyid;
	
	//Constructor
	public PolicyRatingPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;		
	}
	
	//Returns the text of the AgentID
	public String ReturnAgentID() {
		return agentid.getText().substring(0, 6);
	}
	
	//Returns the value in the "Effective Date" field
	public String ReturnEffectiveDate() throws ParseException {
		if(effdate.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return new SimpleDateFormat("MMddyyyy").format(new SimpleDateFormat("MM/dd/yyyy").parse(effdate.getAttribute("value")));
		}
	}
	
	//Returns the value in the "Last Name" field
	public String ReturnLastName() {
		if(lname.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return lname.getAttribute("value");	
		}
	}
	
	//Returns the value in the "First Name" field
	public String ReturnFirstName() {
		if(fname.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return fname.getAttribute("value");	
		}
	}
	
	//Returns the value in the "Middle Name" field
	public String ReturnMiddleName() {
		if(mname.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return mname.getAttribute("value");	
		}
	}
	
	//Selects "Occupation" from drop down
	public void SelectOccupation(String SelectOccupation) {
		new Select(occupation).selectByVisibleText(SelectOccupation);
			Log("Entered Occupation: " + SelectOccupation);		
	}
	
	//Returns the value in the "Occupation" field
	public String ReturnOccupation() {
		if(new Select(occupation).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(occupation).getFirstSelectedOption().getText();	
		}
	}
	
	//Returns the value in the "Date of Birth" field
	public String ReturnDOB() throws ParseException {
		if(dob.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return new SimpleDateFormat("MMddyyyy").format(new SimpleDateFormat("MM/dd/yyyy").parse(dob.getAttribute("value")));
		}
	}
	
	//Returns the value in the "Home Phone" field
	public String ReturnHomePhone() {
		if(hphone.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return hphone.getAttribute("value");	
		}
	}
	
	//Returns the value in the "Mobile Phone" field
	public String ReturnMobilePhone() {
		if(mphone.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return mphone.getAttribute("value");	
		}
	}
	
	//Returns the value in the "Location Address" field
	public String ReturnLocationAddress() {
		if(addy1.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return addy1.getAttribute("value");	
		}
	}
	
	//Returns the value in the "Unit #" field
	public String ReturnUnitNum() {
		if(addy2.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return addy2.getAttribute("value");	
		}
	}
	
	//Returns the value in the "Location City" field
	public String ReturnLocationCity() {
		if(city.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return city.getAttribute("value");	
		}
	}
	
	//Returns the value in the "Location State" field
	public String ReturnLocationState() {
		if(state.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return state.getAttribute("value");	
		}
	}
	
	//Returns the value in the "Location Zip" field
	public String ReturnLocationZip() {
		if(zip.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return zip.getAttribute("value").substring(0, 5);	
		}
	}
	
	//Returns the value in the "Exclude Wind" field
	public String ReturnExcludeWind() {
		if(new Select(excludewind).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(excludewind).getFirstSelectedOption().getText();	
		}
	}
	
	//Returns the value in the "Year Home Built" field
	public String ReturnYearHomeBuilt() {
		if(yearhomebuilt.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return yearhomebuilt.getAttribute("value");	
		}
	}
	
	//Returns the value in the "Type of Construction" field
	public String ReturnTypeofConstruction() {
		if(new Select(typeofconstruction).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(typeofconstruction).getFirstSelectedOption().getText();	
		}
	}
	
	//Returns the value in the "Exterior Walls" field
	public String ReturnExteriorWalls() {
		if(new Select(extwalls).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(extwalls).getFirstSelectedOption().getText();	
		}
	}
	
	//Returns the value in the "# Stories" field
	public String ReturnNumofStories() {
		if(new Select(numofstories).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(numofstories).getFirstSelectedOption().getText();	
		}
	}
	
	//Returns the value in the "Dwelling Coverage" field
	public String ReturnDwellingCoverage() {
		if(covga.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return covga.getAttribute("value");	
		}
	}
	
	//Returns the value in the "Contents" field
	public String ReturnContentsCoverage() {
		if(covgc.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return covgc.getAttribute("value");	
		}
	}
	
	//Selects "Protection Class" from drop down
	public void SelectProtectionClass(String SelectProtectionClass) {
		new Select(protectionclass).selectByVisibleText(SelectProtectionClass);
			Log("Entered Protection Class: " + SelectProtectionClass);	
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
	
	//Returns the value in the "Year Roof Installed" field
	public String ReturnYearRoofInstalled() {
		if(yearroofinstalled.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return yearroofinstalled.getAttribute("value");	
		}
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
	
	//Returns the value in the "Roof Material" field
	public String ReturnRoofMaterial() {
		if(new Select(roofmat).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(roofmat).getFirstSelectedOption().getText();	
		}
	}
	
	//Returns the value in the "Purchase Date" field
	public String ReturnPurchaseDate() throws ParseException {
		if(purchdate.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return new SimpleDateFormat("MMddyyyy").format(new SimpleDateFormat("MM/dd/yyyy").parse(purchdate.getAttribute("value")));
		}
	}

	//Types into "Purchase Price" text box
	public void TypePurchasePrice(String TypePurchasePrice) {
		if(!TypePurchasePrice.toUpperCase().equals("N/A")) {
			purchprice.clear();
			purchprice.sendKeys(TypePurchasePrice);
				Log("Entered Purchase Price: " + TypePurchasePrice);
		}
	}
	
	//Returns the value in the "Purchase Price" field
	public String ReturnPurchasePrice() {
		if(purchprice.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return purchprice.getAttribute("value");	
		}
	}
	
	//Returns the value in the "Is this risk for a home closing?" field
	public String ReturnRiskForAHomeClosing() {
		if(new Select(riskhforahomeclosing).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(riskhforahomeclosing).getFirstSelectedOption().getText();	
		}
	}
	
	//Applies all the overrides
	public void ApplyAllOverridesHO3(String claimcountoverride, String creditoverride, String asiclaimoverride, String Note) throws InterruptedException {
		CheckDwellingCoverageOverride();
		CheckGeneralUnderwritingOverride();
		CheckSocialSecurityOverride();
		CheckWaterDamageExclusionOverride();
		CheckAnimalLiabilityOverride();
		CheckPurchasePriceOverride();
		CheckShortSaleForeclosureOverride();
		CheckWindowsandOpeningsProtectionOverride();
		CheckBrushfireOverride();
		CheckEligibilityReferralOverride();
		CheckFloodZoneOverride();
		CheckGeoLocationOverride();
		CheckAddressOverride();
		CheckClosedZipCodeOverride();
		CheckRemoveLeadLiabilityExclusionOverride();
		CheckHomeShieldPackageOverride();
		CheckFunctionalReplacementCostOverride();
		CheckUpdatedHomeDiscountOverride();
		CheckPreviousClaimsOverride();
		CheckFlatRoofOverride();
		CheckAddressStandardizationOverride();
		CheckCLUEOverride();
		CheckAgeDwellingOverride();
		CheckLossAssessmentOverride();
		CheckHomeShieldPlusPackageOverride();
		CheckPriorLiabilityLimitOverride();
		CheckAcreageOverride();
		CheckScheduledPersonalPropertyOverride();
		TypeNotesOverride(Note);
		TypeCreditScoreOverride(creditoverride);
		TypeASIClaimSurchargeOverride(asiclaimoverride);
		SelectClaimCountOverride(claimcountoverride);
			Log("All overrides have been applied");
	}
	
	//Applies all the overrides
	public void ApplyAllOverridesHO4(String claimcountoverride, String creditoverride, String asiclaimoverride, String Note) throws InterruptedException {
		CheckGeoLocationOverride();
		CheckAddressStandardizationOverride();
		CheckCLUEOverride();
		CheckScheduledPersonalPropertyOverride();
		CheckPreviousClaimsOverride();
		CheckGeneralUnderwritingOverride();
		CheckSocialSecurityOverride();
		CheckLimitedWaterDamageOverride();
		CheckFloodZoneOverride();
		CheckContentsCoverageOverride();
		CheckAddressOverride();
		CheckClosedZipCodeOverride();
		CheckPriorLiabilityLimitOverride();
		TypeNotesOverride(Note);
		TypeCreditScoreOverride(creditoverride);
		TypeASIClaimSurchargeOverride(asiclaimoverride);
		SelectClaimCountOverride(claimcountoverride);
			Log("All overrides have been applied");
	}
	
	//Applies all the overrides
	public void ApplyAllOverridesHO6(String claimcountoverride, String creditoverride, String asiclaimoverride, String Note) throws InterruptedException {
		SelectClaimCountOverride(claimcountoverride);
		CheckDwellingCoverageOverride();
		CheckGeneralUnderwritingOverride();
		CheckSocialSecurityOverride();
		CheckCLUEOverride();
		CheckRemoveLeadLiabilityExclusionOverride();
		CheckShortSaleForeclosureOverride();
		CheckScheduledPersonalPropertyOverride();
		TypeCreditScoreOverride(creditoverride);
		CheckGeoLocationOverride();
		CheckAddressOverride();
		CheckClosedZipCodeOverride();
		CheckAgeDwellingOverride();
		CheckLossAssessmentOverride();
		CheckPriorLiabilityLimitOverride();
		CheckFloodZoneOverride();
		TypeASIClaimSurchargeOverride(asiclaimoverride);
		CheckPreviousClaimsOverride();
		CheckFlatRoofOverride();
		CheckAddressStandardizationOverride();		
		CheckWaterDamageExclusionOverride();
		CheckAnimalLiabilityOverride();
		CheckContractorLicenseNumberOverride();
		CheckPurchasePriceOverride();
		CheckPremisesLiabilityOverride();
		CheckEligibilityReferralOverride();
		TypeNotesOverride(Note);
			Log("All overrides have been applied");
	}
	
	//Checks the "Decline Risk" override check box
	public void CheckDeclineRiskOverride() {
		if(driver.getPageSource().contains("Decline Risk")) {
			overridedeclinerisk.click();
				Log("\"Decline Risk\" override check box marked");
		}
	}
	
	//Selects "Claim Count (Override)" from drop down
	public void SelectClaimCountOverride(String SelectClaimCount) {
		if(driver.getPageSource().contains("Claim Count (Override)")) {
			if(!SelectClaimCount.toUpperCase().equals("N/A")) {
				switch(SelectClaimCount.toUpperCase()) {
					case "0": case "0 CLAIMS":												new Select(overrideclaimcount).selectByVisibleText("None");
																								Log("Entered Claim Count (Override): None");
																							break;
										
					case "1": case "1 CLAIM":												new Select(overrideclaimcount).selectByVisibleText("1");
																								Log("Entered Claim Count (Override): 1");
																							break;
										
					case "2": case "2 OR MORE":	case "2 CLAIMS":							new Select(overrideclaimcount).selectByVisibleText("2");
																								Log("Entered Claim Count (Override): 2");
																							break;
										
					case "3": case "3 CLAIMS": case "3 OR MORE CLAIMS": case "3 OR MORE":	new Select(overrideclaimcount).selectByVisibleText("9 or more");
																								Log("Entered Claim Count (Override): 9 or more");
																							break;
				}
			}
		}
	}
	
	//Checks the "Dwelling Coverage" override check box
	public void CheckDwellingCoverageOverride() {
		if(driver.getPageSource().contains("Dwelling Coverage")) {
			overridedwellingcoverage.click();
				Log("\"Dwelling Coverage\" override check box marked");
		}
	}
	
	//Checks the "General Underwriting" override check box
	public void CheckGeneralUnderwritingOverride() {
		if(driver.getPageSource().contains("General Underwriting")) {
			overridegeneralunderwriting.click();
				Log("\"General Underwriting\" override check box marked");
		}
	}
	
	//Checks the "Social Security" override check box
	public void CheckSocialSecurityOverride() {
		if(driver.getPageSource().contains("Social Security")) {
			overridesocialsecurity.click();
				Log("\"Social Security\" override check box marked");
		}
	}
	
	//Checks the "Water Damage Exclusion" override check box
	public void CheckWaterDamageExclusionOverride() {
		if(driver.getPageSource().contains("Water Damage Exclusion")) {
			overridewaterdamageexclusion.click();
				Log("\"Water Damage Exclusion\" override check box marked");
		}
	}
	
	//Checks the "Animal Liability" override check box
	public void CheckAnimalLiabilityOverride() {
		if(driver.getPageSource().contains("Animal Liability")) {
			overrideanimalliability.click();
				Log("\"Animal Liability\" override check box marked");
		}
	}
	
	//Checks the "Purchase Price" override check box
	public void CheckPurchasePriceOverride() {
		if(driver.getPageSource().contains("Purchase Price")) {
			overridepurchaseprice.click();
				Log("\"Purchase Price\" override check box marked");
		}
	}
	
	//Checks the "Short Sale or Foreclosure" override check box
	public void CheckShortSaleForeclosureOverride() {
		if(driver.getPageSource().contains("Short Sale or Foreclosure")) {
			overrideshortsaleorforeclosure.click();
				Log("\"Short Sale or Foreclosure\" override check box marked");
		}
	}
	
	//Checks the "Brushfire" override check box
	public void CheckBrushfireOverride() {
		if(driver.getPageSource().contains("Brushfire")) {
			overridebrushfire.click();
				Log("\"Brushfire\" override check box marked");
		}
	}
	
	//Checks the "Windows and Openings Protection" override check box
	public void CheckWindowsandOpeningsProtectionOverride() {
		if(driver.getPageSource().contains("Windows and Openings Protection")) {
			overridewindowsandopeningprotection.click();
				Log("\"Windows and Openings Protection\" override check box marked");
		}
	}
	
	//Checks the "Eligibility Referral" override check box
	public void CheckEligibilityReferralOverride() {
		if(driver.getPageSource().contains("Eligibility Referral")) {
			overrideeligibilityreferral.click();
				Log("\"Eligibility Referral\" override check box marked");
		}
	}
	
	//Checks the "Flood Zone" override check box
	public void CheckFloodZoneOverride() {
		if(driver.getPageSource().contains("Flood Zone")) {
			overridefloodzone.click();
				Log("\"Flood Zone\" override check box marked");
		}
	}
	
	//Types into "Notes (FOR OVERRIDE PURPOSE ONLY)" text box
	public void TypeNotesOverride(String TypeNotesOverride) {
		if(driver.getPageSource().contains("Notes (FOR OVERRIDE PURPOSE ONLY)")) {
			overridenotes.clear();
			overridenotes.sendKeys(TypeNotesOverride);
				Log("Entered Notes (FOR OVERRIDE PURPOSE ONLY): " + TypeNotesOverride);
		}
	}
	
	//Types into "Credit Score (Override)" text box
	public void TypeCreditScoreOverride(String TypeCreditScore) {
		if(driver.getPageSource().contains("Credit Score (Override)")) {
			if(!TypeCreditScore.toUpperCase().equals("N/A")) {
				overridecreditscore.clear();
				overridecreditscore.sendKeys(TypeCreditScore);
					Log("Entered Credit Score (Override): " + TypeCreditScore);
			}
		}
	}
	
	//Returns the value in the "Credit Score (Override)" field
	public String ReturnCreditScoreOverride() {
		if(overridecreditscore.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return overridecreditscore.getAttribute("value");	
		}
	}
	
	//Checks the "Geo Location" override check box
	public void CheckGeoLocationOverride() {
		if(driver.getPageSource().contains("Geo Location")) {
			overridegeolocation.click();
				Log("\"Geo Location\" override check box marked");
		}
	}
	
	//Checks the "Address" override check box
	public void CheckAddressOverride() {
		overrideaddress.click();
			Log("\"Address\" override check box marked");
	}
	
	//Checks the "Closed Zip Code" override check box
	public void CheckClosedZipCodeOverride() {
		if(driver.getPageSource().contains("Closed Zip Code")) {
			overrideclosedzipcode.click();
				Log("\"Closed Zip Code\" override check box marked");
		}
	}
	
	//Checks the "Remove Lead Liability Exclusion" override check box
	public void CheckRemoveLeadLiabilityExclusionOverride() {
		if(driver.getPageSource().contains("Remove Lead Liability Exclusion")) {
			overrideremoveleadliabilityexclusion.click();
				Log("\"Remove Lead Liability Exclusion\" override check box marked");
		}
	}
	
	//Checks the "Limited Water Damage" override check box
	public void CheckLimitedWaterDamageOverride() {
		if(driver.getPageSource().contains("Limited Water Damage")) {
			overridelimitedwaterdamage.click();
				Log("\"Limited Water Damage\" override check box marked");
		}
	}
	
	//Checks the "HomeShield Package" override check box
	public void CheckHomeShieldPackageOverride() {
		if(driver.getPageSource().contains("HomeShield Package")) {
			overridehomeshieldpackage.click();
				Log("\"HomeShield Package\" override check box marked");
		}
	}
	
	//Checks the "Functional Replacement Cost" override check box
	public void CheckFunctionalReplacementCostOverride() {
		if(driver.getPageSource().contains("Functional Replacement Cost")) {
			overridefunctionalreplacementcost.click();
				Log("\"Functional Replacement Cost\" override check box marked");
		}
	}
	
	//Checks the "Updated Home Discount" override check box
	public void CheckUpdatedHomeDiscountOverride() {
		if(driver.getPageSource().contains("Updated Home Discount")) {
			overrideupdatedhomediscount.click();
				Log("\"Updated Home Discount\" override check box marked");
		}
	}
	
	//Types into "ASI Claim Surcharge (Override)" text box
	public void TypeASIClaimSurchargeOverride(String TypeASIClaimSurcharge) {
		if(driver.getPageSource().contains("ASI Claim Surcharge (Override)")) {
			if(!TypeASIClaimSurcharge.toUpperCase().equals("N/A")) {
				overrideasiclaimsurcharge.clear();
				overrideasiclaimsurcharge.sendKeys(TypeASIClaimSurcharge);
					Log("Entered ASI Claim Surcharge (Override): " + TypeASIClaimSurcharge);
			}
		}
	}
	
	//Returns the value in the "ASI Claim Surcharge (Override)" field
	public String ReturnASIClaimSurcharge() {
		if(overrideasiclaimsurcharge.getAttribute("value").isEmpty()) {
			return "N/A";
		}
		else {
			return overrideasiclaimsurcharge.getAttribute("value");	
		}
	}
	
	//Checks the "Previous Claims" override check box
	public void CheckPreviousClaimsOverride() {
		if(driver.getPageSource().contains("Previous Claims")) {
			overridepreviousclaims.click();
				Log("\"Previous Claims\" override check box marked");
		}
	}
	
	//Checks the "Flat Roof" override check box
	public void CheckFlatRoofOverride() {
		if(driver.getPageSource().contains("Flat Roof")) {
			overrideflatroof.click();
				Log("\"Flat Roof\" override check box marked");
		}
	}
	
	//Checks the "Address Standardization Override" override check box
	public void CheckAddressStandardizationOverride() {
		overrideaddressstandardization.click();
			Log("\"Address Standardization\" override check box marked");
	}
	
	//Checks the "Contents Coverage" override check box
	public void CheckContentsCoverageOverride() {
		if(driver.getPageSource().contains("Contents Coverage")) {
			overridecovgc.click();
				Log("\"Contents Coverage\" override check box marked");
		}
	}
	
	//Checks the "CLUE" override check box
	public void CheckCLUEOverride() {
		if(driver.getPageSource().contains("CLUE")) {
			overrideclue.click();
				Log("\"CLUE\" override check box marked");
		}
	}
	
	//Checks the "Premises Liability" override check box
	public void CheckPremisesLiabilityOverride() {
		if(driver.getPageSource().contains("Premises Liability")) {
			overridepremisesliab.click();
				Log("\"Premises Liability\" override check box marked");
		}
	}
	
	//Checks the "Contractor License #" override check box
	public void CheckContractorLicenseNumberOverride() {
		if(driver.getPageSource().contains("Contractor License #")) {
			overridecontractlicnum.click();
				Log("\"Contractor License #\" override check box marked");
		}
	}
	
	//Checks the "Age of Dwelling" override check box
	public void CheckAgeDwellingOverride() {
		if(driver.getPageSource().contains("Age of Dwelling")) {
			overrideageofdwelling.click();
				Log("\"Age of Dwelling\" override check box marked");
		}
	}
	
	//Checks the "Loss Assessment" override check box
	public void CheckLossAssessmentOverride() {
		if(driver.getPageSource().contains("Loss Assessment")) {
			overridelossassessment.click();
				Log("\"Loss Assessment\" override check box marked");
		}
	}
	
	//Checks the "HomeShield Plus Package" override check box
	public void CheckHomeShieldPlusPackageOverride() {
		if(driver.getPageSource().contains("HomeShield Plus Package")) {
			overridehomeshieldpluspackage.click();
				Log("\"HomeShield Plus Package\" override check box marked");
		}
	}
	
	//Checks the "Prior Liability Limit" override check box
	public void CheckPriorLiabilityLimitOverride() {
		if(driver.getPageSource().contains("Prior Liability Limit")) {
			overridepriorliabilitylimit.click();
				Log("\"Prior Liability Limit\" override check box marked");
		}
	}
	
	//Checks the "Acreage" override check box
	public void CheckAcreageOverride() {
		if(driver.getPageSource().contains("Acreage")) {
			overrideacreage.click();
				Log("\"Acreage\" override check box marked");
		}
	}
	
	//Checks the "Scheduled Personal Property" override check box
	public void CheckScheduledPersonalPropertyOverride() {
		if(driver.getPageSource().contains("Scheduled Personal Property")) {
			overridescheduledpersonalproperty.click();
				Log("\"Scheduled Personal Property\" override check box marked");
		}
	}

	//Clicks the "Next" button
	public void ClickNext() {
		next.click();
			Log("Clicked the \"Next\" button on the Policy Rating 1 page");
	}

	//Clicks the "Save" button
	public void ClickSave() {
		save.click();
			Log("Clicked the \"Save\" button on the Policy Rating 1 page");
	}

	//Clicks the "Override" button
	public void ClickOverride() {
		override.click();
			Log("Clicked the \"Override\" button on the Policy Rating 1 page");
	}

	//Checks to make sure if on same page after hitting next to apply override
	public String ClickNextAndConfirmEdits(String casenum, String identifier) {
		ClickNext();
		if(driver.getPageSource().contains("Policy Rating Page 1")) {
				Log(casenum + "-" + identifier + ": edits on page read as \"" + edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," ") + "\"");
			ClickOverride();
			if(driver.getPageSource().contains("Policy Rating Page 1")) {
					Log(casenum + "-" + identifier + ": There were edits that could not be overridden through on Policy Rating Page 1." + edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," "));
				return "edits";
			}
			else {
					Log("Overrode through Rating Page 1");
				return "override";
			}
		}
		else {
			return "nooverride";
		}
	}
	
	//Returns the PolicyID
	public String ReturnPolicyID() {
		String id = policyid.getText().substring(0, policyid.getText().indexOf(" "));		
			Log("PolicyID is " + id);
		return id;
	}
}