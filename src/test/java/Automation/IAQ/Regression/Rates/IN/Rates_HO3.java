package Automation.IAQ.Regression.Rates.IN;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import Automation.IAQ.PS.pages.PlanAndResidenceType;
import Automation.IAQ.PS.pages.PolicyRatingPage1;
import Automation.IAQ.PS.pages.RatingAndPolicyLookup;
import Automation.IAQ.pages.AdditionalDetails;
import Automation.IAQ.pages.CoverageBillPlans;
import Automation.IAQ.pages.ForAgentsOnly;
import Automation.IAQ.pages.HouseholdMembers;
import Automation.IAQ.pages.NamedInsured;
import Automation.IAQ.pages.Products;
import Automation.IAQ.pages.QuoteSearch;
import Automation.IAQ.testBase.TestBase;

//@SuppressWarnings("unused")
@Listeners(Automation.IAQ.customListeners.CustomListeners.class)
public class Rates_HO3 extends TestBase {

	public static final Logger log = Logger.getLogger(Rates_HO3.class.getName());

	String quoteid;
	ForAgentsOnly FAO;
	QuoteSearch Q;
	NamedInsured NI;
	Products P;
	HouseholdMembers HM;
	AdditionalDetails AD;
	CoverageBillPlans CBP;
	RatingAndPolicyLookup RPL;
	PlanAndResidenceType PRT;
	PolicyRatingPage1 PRP1;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\IAQ\\Regression\\Rates\\IN\\Rates_HO3\\Rates_HO3-" + GetDateTime() + ".html");

	@DataProvider(name="Rates_HO3")
	public String[][] GetRates_HO3DataCall() {
		String[][] data = GetData("IAQPoldata", "Rates_HO3", "Regression", "IN");
		return data;
	}

	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting Rates_HO3 Batch ======================================");
	}

	@Test(dataProvider="Rates_HO3")
	public void RunRates_HO3(String casenum, String state, String planid, String pgragentid, String asiagentid, String fname, String lname,
		String addy1, String addy2, String city, String zip, String effdate, String purchdate, String pc, String constype, String yearroof, String roofmaterial,
		String roofdesign, String numofstories, String yearhomebuilt, String maritalstatus, String numofchild, String dob, String paidinfull, String covga,
		String otherstructures, String personalprop, String lossofuse, String liability, String medpayment, String increpcost, String ordlaw, String limwaterdmg,
		String acvlosssettlement, String pprc, String specialpp, String reportedclaims, String priorliab, String creditscore, String allotherperils, String windhaildeduct,
		String eqdeduct, String packagepol, String newpurch, String accbuilder, String residentsmoke, String fireprot, String burglarprot, String waterleakprot,
		String securedsub, String wbstove, String umbrella, String claimsurcharge, String hud, String latestpermit, String occupancy, String esign, String hspackage,
		String waterbackup, String basement, String personalinj, String animalliab, String lossassessment, String incjwf, String hcc, String eqcovg, String substruct,
		String golfcart, String jewelryvalue, String numoffloors, String renterocc, String retired, String hobbyfarming, String nshl, String excludewind,
		String windowandotheropeningprotection, String buildingcode, String openfoundation, String fungi, String limitedfoundation, String antiques, String bicycles,
		String cameras, String coins, String fineartsnobreakage, String fineartsbreakage, String furs,  String golfequip, String gunscollectable, String gunsfired,
		String musicinstruments, String othersportsequip, String silverware, String stamps, String premium) throws InterruptedException {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("Rates_HO3");
		try {
				Log("========================= Starting " + casenum + " =========================");
	
			//FAO Login
			InitIAQ("Chrome", pgragentid);
	
			//Initialize Drivers
			FAO = new ForAgentsOnly(driver);
			Q = new QuoteSearch(driver);
			NI = new NamedInsured(driver);
			P = new Products(driver);
			HM = new HouseholdMembers(driver);
			AD = new AdditionalDetails(driver);
			CBP = new CoverageBillPlans(driver);
			RPL = new RatingAndPolicyLookup(driver);
			PRT = new PlanAndResidenceType(driver);
			PRP1 = new PolicyRatingPage1(driver);
					
			//FAO Page
			FAO.StartFAO(state, planid);
	
			//Switches to tab that contains IAQ
			SwitchTab("1");	
			
			//Named Insured Page
			NI.SelectASIAgentCode(asiagentid);
			NI.TypeFirstName(fname);
			NI.TypeLastName(lname);
			NI.TypeDOB(dob);
			NI.SelectGender("Male");
			NI.TypeMailingAddress1(addy1);
			NI.TypeMailingAddress2(addy2);
			NI.TypeCity(city);
			NI.TypeZip(zip);
			NI.SelectLengthofCurrAddress("1 year or more");
			NI.SelectDisclosure("Yes");
			NI.ClickProducts();
					
			//Products Page
			P.TypePolicyEffDate(effdate);
				Pause(1000);
			if(newpurch.toUpperCase().equals("Y") || newpurch.toUpperCase().equals("YES") || newpurch.toUpperCase().equals("1")) {
				P.SelectRiskHomeClosing("Y");
			}
			else {
				P.SelectRiskHomeClosing("N");
			}
				Pause(2500);
			P.SelectResidenceType("Single Family");
				Pause(2500);
			P.CheckBothVerifications();
				Pause(2000);
			P.ContinueToQuoteType();
				Pause(700);		
			P.TypeDwellingCoverage("200000");
				Pause(700);
			P.ClickQuoteType("FULL");
				Pause(500);
			if(newpurch.toUpperCase().equals("Y") || newpurch.toUpperCase().equals("YES") || newpurch.toUpperCase().equals("1")) {
				P.TypePurchaseDate(effdate);
			}
			else {
				P.TypePurchaseDate(new SimpleDateFormat("MMddyyyy").format(new Date()));
			}
				Pause(500);
			if(accbuilder.toUpperCase().equals("Y") || accbuilder.toUpperCase().equals("YES")) {
				P.ForceTypeYearHomeBuilt(new SimpleDateFormat("yyyy").format(new Date()));
			}
			else {
				P.ForceTypeYearHomeBuilt(yearhomebuilt);
			}
			P.SelectIsAFireHydrantWithin1000Feet("Y","N");
			P.SelectIsAFireHydrantWithin1000Feet("Y","Y");
			P.ForceSelectTypeofConstruction(constype);
			P.ForceSelectExteriorWalls("Concrete Block");
			P.ForceSelectNumberofStories(numofstories);
				Pause(1000);
			if(accbuilder.toUpperCase().equals("Y") || accbuilder.toUpperCase().equals("YES")) {
				P.ForceTypeYearRoofInstalled(new SimpleDateFormat("yyyy").format(new Date()));
			}
			else {
				P.ForceTypeYearRoofInstalled(yearroof);
			}
			P.ForceSelectRoofDesign("Gable");
			P.ForceSelectRoofMaterial(roofmaterial);
			quoteid = P.ReturnQuoteID("Y");
		
			//Confirm values are all populated
			if(newpurch.toUpperCase().equals("Y") || newpurch.toUpperCase().equals("YES") || newpurch.toUpperCase().equals("1")) {
				P.TypePurchaseDate(effdate);
			}
			else {
				P.TypePurchaseDate(new SimpleDateFormat("MMddyyyy").format(new Date()));
			}
			if(accbuilder.toUpperCase().equals("Y") || accbuilder.toUpperCase().equals("YES")) {
				P.TypeYearHomeBuilt(new SimpleDateFormat("yyyy").format(new Date()));
			}
			else {
				P.TypeYearHomeBuilt(yearhomebuilt);
			}
			P.SelectTypeofConstruction(constype);
			P.SelectExteriorWalls("Concrete Block");
			P.SelectNumberofStories(numofstories);
			if(accbuilder.toUpperCase().equals("Y") || accbuilder.toUpperCase().equals("YES")) {
				P.TypeYearRoofInstalled(new SimpleDateFormat("yyyy").format(new Date()));
			}
			else {
				P.TypeYearRoofInstalled(yearroof);
			}
			P.SelectRoofDesign("Gable");
			P.SelectRoofMaterial(roofmaterial);
			P.SaveQuote();
				Pause(1500);
			
			//Switches to tab that contains PS
			SwitchTab("0");
			
			//Policy System
			LoginPS("Staging");
			RPL.TypeQuotePolicyID(quoteid);
			RPL.ClickLookup();
				
			//Plan and Residence Type Page
			PRT.ClickNext();
			PRT.SelectSplitPCByIndex(1, casenum);
				
			//Policy Rating Page 1
			PRP1.SelectOccupation("Other");
			PRP1.SelectProtectionClass(pc);
			PRP1.ApplyAllOverridesHO3(reportedclaims, creditscore, claimsurcharge, "Rates Testing");
			PRP1.ClickSave();
			if(driver.getPageSource().contains("Policy Documents") && driver.getPageSource().contains("Policy Processing Page")) {
					Log(casenum + "-" + quoteid + ": Overrides were able to be saved");
			}
			else {
					Log(casenum + "-" + quoteid + ": Overrides were NOT able to be saved");
					logger.log(Status.SKIP, casenum + "-" + quoteid + ": Overrides were NOT able to be saved");
					Log("========================= End " + casenum + " =========================");
				return;
			}
			
			//FAO
			GoToFAO();
			FAO.FindExistingQuote(lname, fname, effdate, effdate);
			Q.ClickQuote(lname, fname);
	
			//Switches to tab that contains IAQ
			SwitchTab("1");
			
			//Named Insured Page
			NI.ClickProducts();
	
			//Products Page
			P.TypeDwellingCoverage(covga);
				Pause(1000);
			P.SelectProtectionClass(pc);
				Pause(1000);
			if(driver.getPageSource().contains("Purchase Price")) {
				P.ForceTypePurchasePrice("300000");
					Pause(1000);
			}
			P.ForceSelectRoofDesign(roofdesign);
			P.ForceTypeLivingAreaSquareFeet("2000");
			P.ForceSelectGarage("None");
			switch(basement.toUpperCase()) {
				case "NONE": case "NO": case "N":		if(substruct.toUpperCase().equals("B") || substruct.toUpperCase().equals("BASEMENT")) {
																Log("This quote can't have a subtructure of basement when " + basement + "  is selected for basement");
																logger.log(Status.SKIP, casenum + "-" + quoteid + ": This quote can't have a subtructure of basement when " + basement + "  is selected for basement");
																Log("========================= End " + casenum + " =========================");
															return;
														}
														P.ForceSelectSubstructure("S");
														break;
					
					
				case "UNF": case "UNFINISHED":			P.ForceSelectSubstructure("B");
														P.TypeBasementPerct("100");
														P.TypeFinishedBasementPerct("0");
														break;
					
					
				case "PART": case "PARTIALLY FINISHED":	P.ForceSelectSubstructure("B");
														P.TypeBasementPerct("100");
														P.TypeFinishedBasementPerct("50");
														break;
					
					
				case "FIN": case "FINISHED":			P.ForceSelectSubstructure("B");
														P.TypeBasementPerct("100");
														P.TypeFinishedBasementPerct("100");
														break;
			}
			P.SelectBathroomGrade("Builder's Grade");
			P.ForceSelectNumberFullBaths("2");
			P.SelectNumberHalfBaths("0");
			P.SelectKitchenGrade("Builder's Grade");
			P.SelectCoolingAir("Central Air Conditioning");
			P.ForceSelectPermanentHeatSource("Electric");
			P.ForceSelectDeck("None");
				Pause(1500);
			P.ClickHouseholdMembers();
	
			//Household Members Page
			HM.TypeSSN("111001111");
			HM.SelectMarital(maritalstatus);
			HM.ClickAdditionalDetails();
	
			//Additional Details page
			AD.SelectPriorLiabilityLimit(priorliab);
			AD.SelectReportedClaims(reportedclaims);
			AD.SelectNumberOfChildren(numofchild);
			AD.SelectOccupancy(occupancy);
			AD.SelectWoodburningStove(wbstove);
			AD.SelectOpenFoundation(openfoundation);
			AD.SelectESign(esign);
			if(driver.getPageSource().contains("Accredited Builder")) {
				AD.SelectAccreditedBuilder(accbuilder);
			}
			AD.SelectACVLossSettlement(acvlosssettlement);
			AD.SelectResidentsSmoke(residentsmoke);
			AD.SelectUmbrella(umbrella);
			if(driver.getPageSource().contains("New Purchase")) {
				AD.SelectNewPurchase(newpurch);
			}
			AD.SelectPackagePolicy(packagepol);
			AD.SelectSecuredSubdivision(securedsub);
			AD.SelectBurglarProtection(burglarprot);
			AD.SelectFireProtection(fireprot);
			AD.SelectWaterLeakProtection(waterleakprot);
			if(driver.getPageSource().contains("Home Update")) {
				if(hud.toUpperCase().equals("N/A")) {
					Log("Action: Used Prefilled HUD");
				}
				else {
					AD.ForceSelectHomeUpdate(hud);
					if(hud.toUpperCase().equals("Y") || hud.toUpperCase().equals("YES")) {
						AD.ForceTypeLatestPermitDate(latestpermit);
					}
				}
			}
			AD.SelectPaperless(esign);
			AD.ClickCoverageBillPlans();
	
			//Coverage/Bill Plans Page
			CBP.CheckPackage(hspackage);
			CBP.SelectOtherStructures(otherstructures);
				Pause(3000);
			CBP.SelectPersonalProperty(personalprop);
				Pause(3000);
			CBP.SelectLossofUse(lossofuse);
				Pause(3000);
			CBP.SelectAllOtherPerils(allotherperils);
				Pause(3000);
			CBP.SelectWindHailDeductible(windhaildeduct);
				Pause(3000);
			CBP.SelectPersonalLiability(liability);
				Pause(3000);
			CBP.SelectMedicalPaymentsLimit(medpayment);
				Pause(3000);
			CBP.SelectGolfCartPhysicalDamageLiability(golfcart);
				Pause(3000);
			CBP.SelectIncreaseJewelryWatchesFurs(incjwf);
				Pause(3000);
			CBP.SelectIncreasedReplacementCostOnDwelling(increpcost);
				Pause(3000);
			CBP.SelectAnimalBuyback(animalliab);
				Pause(3000);
			CBP.TypeHomeComputerCoverage(hcc);
				Pause(1000);
			if(!CBP.ReturnTypeHomeComputerCoverage().equals(hcc)) {
				CBP.TypeHomeComputerCoverage(hcc);
					Pause(1000);
			}
			CBP.SelectLossAssessment(lossassessment);
				Pause(3000);
			CBP.SelectOrdinanceOrLaw(ordlaw);
				Pause(3000);
			if(hspackage.toUpperCase().equals("N") || (hspackage.toUpperCase().equals("NO"))) {
				CBP.SelectWaterBackupBasement(waterbackup, basement);
			}
			else{
				CBP.SelectAdditionalWaterBackupBasement(waterbackup, basement);
			}
				Pause(3000);
			CBP.SelectMoldBuyback(fungi);
				Pause(3000);
			CBP.CheckLimitedWaterDamage(limwaterdmg);
			CBP.CheckPersonalInjury(personalinj);
			CBP.CheckPersonalPropertyReplacementCost(pprc);
			CBP.CheckSpecialPersonalProperty(specialpp);
			CBP.CheckLimitedFoundationandSlabBuyback(limitedfoundation);
			CoverageBillPlans.sppi = 0;
			CBP.ScheduledPersonalPropertyMultiple("Antiques", antiques);
			CBP.ScheduledPersonalPropertyMultiple("Bicycles", bicycles);
			CBP.ScheduledPersonalPropertyMultiple("Cameras and Projection Equip", cameras);
			CBP.ScheduledPersonalPropertyMultiple("Coins", coins);
			CBP.ScheduledPersonalPropertyMultiple("Fine Arts (Breakage)", fineartsbreakage);
			CBP.ScheduledPersonalPropertyMultiple("Fine Arts (No Breakage)", fineartsnobreakage);
			CBP.ScheduledPersonalPropertyMultiple("Furs", furs);
			CBP.ScheduledPersonalPropertyMultiple("Golfers Equipment", golfequip);
			CBP.ScheduledPersonalPropertyMultiple("Guns (Collectible)", gunscollectable);
			CBP.ScheduledPersonalPropertyMultiple("Guns (Fired)", gunsfired);
			CBP.ScheduledPersonalPropertyMultiple("Jewelry", jewelryvalue);
			CBP.ScheduledPersonalPropertyMultiple("Musical Instruments (Non Prof)", musicinstruments);
			CBP.ScheduledPersonalPropertyMultiple("Other Sports Equip", othersportsequip);
			CBP.ScheduledPersonalPropertyMultiple("Silverware", silverware);
			CBP.ScheduledPersonalPropertyMultiple("Stamps", stamps);
			CBP.ClickBillPlan(paidinfull);
				Pause(5000);
			CBP.ClickCustomerTextHeader();
			CBP.ClickRecalculate();	
				Pause(20000);
				Log(asiagentid + "-" + effdate + "-" + quoteid + "-" + fname + "-" + lname + "-" + CBP.ReturnPremium("N"));
			CBP.SaveQuote();
				Log(casenum + "-" + quoteid + ": Script has completed");
				logger.log(Status.PASS, casenum + "-" + quoteid + ": Script has completed");
				Log("========================= End " + casenum + " =========================");
		}
		catch(Exception e) {
				e.printStackTrace();
				GetFailScreenShot(casenum + "-IN_HO3_Error");
				Log(casenum + ": Script has failed. Please rerun.");
				logger.log(Status.FAIL, casenum + ": Script has failed. Please rerun.");
				Log("============================== End " + casenum + " ===================================");
		}
	}
	
	@AfterMethod
	public void AfterEachTest() {
		QuitBrowser();
	}

	@AfterTest
	public void EndBatch() {
		extent.flush();
			Log("====================================== End Rates_HO3 Batch ======================================");
	}
}