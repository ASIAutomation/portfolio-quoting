package Automation.IAQ.Regression.DataCalls;

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
import Automation.IAQ.pages.PointOfSale;
import Automation.IAQ.pages.Portfolio;
import Automation.IAQ.pages.Products;
import Automation.IAQ.pages.QuoteSearch;
import Automation.IAQ.testBase.TestBase;

//@SuppressWarnings("unused")
@Listeners(Automation.IAQ.customListeners.CustomListeners.class)
public class CL_DataCall extends TestBase {
	
	public static final Logger log = Logger.getLogger(CL_DataCall.class.getName());
	
	ForAgentsOnly FAO;
	QuoteSearch Q;
	NamedInsured NI;
	Products P;
	HouseholdMembers HM;
	AdditionalDetails AD;
	CoverageBillPlans CBP;
	Portfolio PF;
	PointOfSale POS;
	RatingAndPolicyLookup RPL;
	PlanAndResidenceType PRT;
	PolicyRatingPage1 PRP1;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\IAQ\\Regression\\DataCalls\\CL_DataCall\\CL_DataCall-" + GetDateTime() + ".html");
	
	@DataProvider(name="CL_DataCall")
	public String[][] GetCL_DataCall() {
		String[][] data = GetData("Data", "CL_DataCall", "Regression", "datacalls");
		return data;
	}
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting CL_DataCall Batch ======================================");
	}
	
	@Test(dataProvider="CL_DataCall")
	public void RunCL_DataCall(String casenum, String pgragentid, String state, String asiagentcode, String fname, String lname,
		String dob, String mailaddy1, String city, String zip, String ssn) throws InterruptedException {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("CL_DataCall");
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
			PF = new Portfolio(driver);
			POS = new PointOfSale(driver);
			RPL = new RatingAndPolicyLookup(driver);
			PRT = new PlanAndResidenceType(driver);
			PRP1 = new PolicyRatingPage1(driver);
			
			//FAO Page
			FAO.StartFAO(state, "HO3");
	
			//Switches to tab that contains IAQ
			SwitchTab("1");	
			
			//Named Insured Page
			NI.SelectASIAgentCode(asiagentcode);
			NI.TypeFirstName(fname);
			NI.TypeLastName(lname);
			NI.TypeDOB(dob);
			NI.SelectGender("Male");
			NI.TypeMailingAddress1(mailaddy1);
			NI.TypeCity(city);
			NI.TypeZip(zip);
			NI.SelectDisclosure("Yes");
			NI.SelectLengthofCurrAddress("1 year or more");
			NI.ClickProducts();
			
			//Products Page
			P.TypePolicyEffDate(new SimpleDateFormat("MMddyyyy").format(new Date()));
				Pause(1000);
			P.SelectRiskHomeClosing("N");
				Pause(2000);
			P.SelectResidenceType("Single Family");
				Pause(2000);
			if(driver.getPageSource().contains("Exclude Wind")) {
				P.SelectExcludeWind("No");
					Pause(1000);
			}
			P.CheckBothVerifications();
				Pause(1000);
			P.ContinueToQuoteType();
				Pause(700);
			P.TypeDwellingCoverage("200000");
				Pause(700);
			P.ClickQuoteType("FULL");
				Pause(500);
			String quoteid = P.ReturnQuoteID("Y");
			P.TypePurchaseDate("01012015");
				Pause(1000);
			P.SelectIsAFireHydrantWithin1000Feet("No","N");
			P.SelectIsAFireHydrantWithin1000Feet("No","Y");
			P.ForceTypeYearHomeBuilt("2012");
			P.ForceSelectTypeofConstruction("Frame");
			P.ForceSelectExteriorWalls("Concrete Block");
			P.ForceSelectNumberofStories("1 Story / Ranch");
			P.ForceTypeYearRoofInstalled("2012");
			P.ForceSelectRoofDesign("Gable");
			P.ForceSelectRoofMaterial("Concrete Tile");
			P.SelectProtectionClass("3");
			//Confirms all fields are populated
			P.TypeYearHomeBuilt("2012");
			P.SelectProtectionClass("3");
			P.SelectTypeofConstruction("Frame");
			P.SelectExteriorWalls("Concrete Block");
			P.SelectNumberofStories("1 Story / Ranch");
			P.TypeYearRoofInstalled("2012");
			P.SelectRoofDesign("Gable");
			P.SelectRoofMaterial("Concrete Tile");
			P.SaveQuote();
				Pause(3000);
		
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
			PRP1.CheckDwellingCoverageOverride();
			PRP1.CheckCLUEOverride();
			PRP1.TypeNotesOverride("CLUE Testing");
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
			LogintoFAO(pgragentid);
			FAO.FindExistingQuote(lname, fname, new SimpleDateFormat("MMddyyyy").format(new Date()), new SimpleDateFormat("MMddyyyy").format(new Date()));
			Q.ClickQuote(lname, fname);
		
			//Switches to tab that contains IAQ
			SwitchTab("1");
			
			//Named Insured Page
			NI.ClickProducts();
			
			//Products Page
			P.ForceTypeLivingAreaSquareFeet("1000");
			P.ForceSelectGarage("None");
			P.ForceSelectSubstructure("Slab-on-ground");
				Pause(500);
			P.SelectBathroomGrade("Builder's Grade");
				Pause(1500);
			P.ForceSelectNumberFullBaths("2");
			P.ForceSelectNumberHalfBaths("0");
			P.SelectKitchenGrade("Builder's Grade");
				Pause(1000);
			P.SelectCoolingAir("Central Air Conditioning");
			P.SelectPermanentHeatSource("Electric");
			P.SelectDeck("None");
			P.SelectElectricalSystem("Circuit Breakers");
				Pause(1000);
			P.SelectPlumbingSystem("Copper");
				Pause(1000);
			P.SelectAluminumWiring("No");
				Pause(1000);
			P.ClickHouseholdMembers();
			
			//Household Members Page
			HM.TypeSSN(ssn);
			HM.SelectMarital("Married");
			HM.ClickAdditionalDetails();
			
			//Additional Details page
			if(driver.getPageSource().contains("Prior Liability Limit")) {
				AD.SelectPriorLiabilityLimit("$300,000");
					Pause(500);
			}
			if(driver.getPageSource().contains("Reported claims excluding wind, hail, or lightning in the past 3 years")) {
				AD.SelectReportedClaims("0 Claims");
					Pause(500);
			}
			if(driver.getPageSource().contains("Number of children in household under 18")) {
				AD.SelectNumberOfChildren("0");
					Pause(500);
			}
			if(driver.getPageSource().contains("Occupancy")) {
				AD.SelectOccupancy("Primary Residence");
					Pause(500);
			}
			if(driver.getPageSource().contains("Months Owner Occupied")) {
				AD.SelectMonthsOwnerOccupied("9 months or more");
					Pause(500);
			}
			if(driver.getPageSource().contains("Woodburning Stove")) {
				AD.SelectWoodburningStove("No");
					Pause(500);
			}
			if(driver.getPageSource().contains("Open Foundation")) {
				AD.SelectOpenFoundation("No");
					Pause(500);
			}
			if(driver.getPageSource().contains("E-Signature")) {
				AD.SelectESign("No");
					Pause(1000);
			}
			if(driver.getPageSource().contains("How many dogs/animals owned or kept?")) {
				AD.SelectHowManyDogsAnimalsOwnedorKept("None");
					Pause(1000);
			}
			if(driver.getPageSource().contains("Accredited Builder")) {
				AD.SelectAccreditedBuilder("No");
					Pause(500);
			}
			if(driver.getPageSource().contains("ACV Loss Settlement-Wind/Hail Losses to Roof")) {
				AD.SelectACVLossSettlement("Replacement Cost");
					Pause(500);
			}
			if(driver.getPageSource().contains("Do any residents smoke?")) {
				AD.SelectResidentsSmoke("No");
					Pause(500);
			}
			if(driver.getPageSource().contains("New Purchase")) {
				AD.SelectNewPurchase("No");
					Pause(500);
			}
			if(driver.getPageSource().contains("Does Insured have an Umbrella Policy?")) {
				AD.SelectUmbrella("No");
					Pause(500);
			}
			if(driver.getPageSource().contains("Package Policy")) {
				AD.SelectPackagePolicy("None");
					Pause(500);
			}
			if(driver.getPageSource().contains("Secured Subdivision")) {
				AD.SelectSecuredSubdivision("No");
					Pause(500);
			}
			if(driver.getPageSource().contains("Fire Protection")) {
				AD.SelectFireProtection("Smoke Alarm");
					Pause(500);
			}
			if(driver.getPageSource().contains("Window and Other Opening Protection")) {
				AD.SelectWindowandOtherOpeningProtection("No");
					Pause(500);
			}
			if(driver.getPageSource().contains("Building Code")) {
				AD.SelectBuildingCode("No");
					Pause(500);
			}
			if(driver.getPageSource().contains("Home Update")) {
				AD.SelectHomeUpdate("No");
					Pause(500);
			}
			if(driver.getPageSource().contains("Apply Paperless and accept documents and bills delivered through e-mail?")) {
				AD.SelectPaperless("No");
					Pause(500);
			}
			AD.ClickCoverageBillPlans();
			
			//Coverage/Bill Plans Page
			CBP.ClickPortfolio();
			
			//Portfolio Page
			PF.ClickPointofSale();
			
			//Point of Sale Page
			POS.ClickOrderPointofSale();
			POS.ClickAdditionalDetails();
			
			//Additional Details Page
				Log("================== Start CLUE Results ===================");
				Log(casenum + "-" + quoteid + "-" + fname + "-" + lname + ": Reported Claims value entered is " + AD.ReturnReportedClaims());
				logger.log(Status.PASS, casenum + "-" + quoteid + "-" + fname + "-" + lname + ": Reported Claims value entered is " + AD.ReturnReportedClaims());
				Log("================== End CLUE Results ===================");						
				Log("========================= End " + casenum + " =========================");
		}
		catch(Exception e) {
			e.printStackTrace();
			GetFailScreenShot(casenum +  "-" + state + "-CL_Error");
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
			Log("====================================== End CL_DataCall Batch ======================================");
	}
}