package Automation.IAQ.Testing.DataCalls.HO3;

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

import Automation.IAQ.pages.AdditionalDetails;
import Automation.IAQ.pages.CoverageBillPlans;
import Automation.IAQ.pages.ForAgentsOnly;
import Automation.IAQ.pages.HouseholdMembers;
import Automation.IAQ.pages.NamedInsured;
import Automation.IAQ.pages.Products;
import Automation.IAQ.testBase.TestBase;

//@SuppressWarnings("unused")
@Listeners(Automation.IAQ.customListeners.CustomListeners.class)
public class CR_DataCall extends TestBase {
	
	public static final Logger log = Logger.getLogger(CR_DataCall.class.getName());
	
	ForAgentsOnly FAO;
	NamedInsured NI;
	Products P;
	HouseholdMembers HM;
	AdditionalDetails AD;
	CoverageBillPlans CBP;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\IAQ\\Testing\\DataCalls\\HO3\\CR_DataCall\\CR_DataCall-" + GetDateTime() + ".html");
	
	@DataProvider(name="CR_DataCall")
	public String[][] GetCR_DataCall() {
		String[][] data = GetData("Data", "CR_DataCall", "Testing", "datacalls/HO3");
		return data;
	}
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting CR_DataCall Batch ======================================");
	}
	
	@Test(dataProvider="CR_DataCall")
	public void RunCR_DataCall(String casenum, String pgragentid, String state, String asiagentcode, String fname, String lname,
		String dob, String mailaddy1, String city, String zip, String ssn) throws InterruptedException {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("CR_DataCall");
		try {
				Log("========================= Starting " + casenum + " =========================");
			
			//FAO Login	
			InitIAQ("Chrome", pgragentid);		
			
			//Initialize Drivers
			FAO = new ForAgentsOnly(driver);
			NI = new NamedInsured(driver);
			P = new Products(driver);
			HM = new HouseholdMembers(driver);
			AD = new AdditionalDetails(driver);
			CBP = new CoverageBillPlans(driver);
			
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
				Pause(2500);
			P.SelectResidenceType("Single Family");
				Pause(2500);
			if(driver.getPageSource().contains("Exclude Wind")) {
				P.SelectExcludeWind("No");
					Pause(1000);
			}
			P.CheckBothVerifications();
				Pause(2000);
			P.ContinueToQuoteType();
				Pause(700);
			P.TypeDwellingCoverage("200000");
				Pause(700);
			P.ClickQuoteType("FAST");
				Pause(700);
			P.TypePurchaseDate("01012015");
				Pause(500);
			P.SelectIsAFireHydrantWithin1000Feet("Y", "N");
			P.SelectIsAFireHydrantWithin1000Feet("Y", "Y");
			P.ForceTypeYearHomeBuilt("2012");
				Pause(1000);
			P.ForceSelectTypeofConstruction("Frame");
				Pause(1000);
			P.ForceSelectExteriorWalls("Concrete Block");
				Pause(1000);
			P.ForceSelectNumberofStories("1 Story / Ranch");
				Pause(1000);
			P.ForceTypeYearRoofInstalled("2012");
			P.ForceSelectRoofDesign("Gable");
				Pause(1000);
			P.ForceSelectRoofMaterial("Slate");
			String quoteid = P.ReturnQuoteID("Y");
			P.ClickHouseholdMembers();
			
			//Household Members Page
			HM.TypeSSN(ssn);
			HM.SelectMarital("Single");
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
				Log("================== Start CREDIT Results ===================");
				Log(casenum + "-" + quoteid + "-IAQ Premium: " + CBP.ReturnPremium("N"));
				logger.log(Status.PASS, casenum + "-" + quoteid + "-IAQ Premium: " + CBP.ReturnPremium("N"));
				Log("================== End CREDIT Results ===================");					
				Log("=========================== End " + casenum + " ===========================");
				Pause(3000);
			CBP.SaveQuote();
		}
		catch(Exception e) {
			e.printStackTrace();
			GetFailScreenShot(casenum + "-CR_DataCall_Error");
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
			Log("====================================== End CR_DataCall Batch ======================================");
	}
}