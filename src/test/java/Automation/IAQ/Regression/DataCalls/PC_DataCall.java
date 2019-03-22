package Automation.IAQ.Regression.DataCalls;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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
import Automation.IAQ.PS.pages.PolicyPremiums;
import Automation.IAQ.PS.pages.PolicyRatingPage1;
import Automation.IAQ.PS.pages.PolicyRatingPage2;
import Automation.IAQ.PS.pages.RatingAndPolicyLookup;
import Automation.IAQ.pages.AdditionalDetails;
import Automation.IAQ.pages.CoverageBillPlans;
import Automation.IAQ.pages.ForAgentsOnly;
import Automation.IAQ.pages.HouseholdMembers;
import Automation.IAQ.pages.NamedInsured;
import Automation.IAQ.pages.Products;
import Automation.IAQ.testBase.TestBase;

//@SuppressWarnings("unused")
@Listeners(Automation.IAQ.customListeners.CustomListeners.class)
public class PC_DataCall extends TestBase {
	
	public static final Logger log = Logger.getLogger(PC_DataCall.class.getName());
	
	ForAgentsOnly FAO;
	NamedInsured NI;
	Products P;
	HouseholdMembers HM;
	AdditionalDetails AD;
	CoverageBillPlans CBP;
	RatingAndPolicyLookup RPL;
	PlanAndResidenceType PRT;
	PolicyRatingPage1 PRP1;
	PolicyRatingPage2 PRP2;
	PolicyPremiums PP;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\IAQ\\Regression\\DataCalls\\PC_DataCall\\PC_DataCall-" + GetDateTime() + ".html");
	
	@DataProvider(name="PC_DataCall")
	public String[][] GetPC_DataCall() {
		String[][] data = GetData("Data", "PC_DataCall", "Regression", "datacalls");
		return data;
	}
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting PC_DataCall Batch ======================================");
	}
	
	@Test(dataProvider="PC_DataCall")
	public void RunPC_DataCall(String casenum, String pgragentid, String state, String asiagentcode, String addy1, String city, String zip, String within1000ft, String exppc) throws InterruptedException {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("PC_DataCall");
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
			RPL = new RatingAndPolicyLookup(driver);
			PRT = new PlanAndResidenceType(driver);
			PRP1 = new PolicyRatingPage1(driver);
			PRP2 = new PolicyRatingPage2(driver);
			PP = new PolicyPremiums(driver);
			
			//FAO
			FAO.StartFAO(state, "HO3");
			
			//Switches to tab that contains IAQ
			SwitchTab("1");
			
			//Named Insured Page
			NI.SelectASIAgentCode(asiagentcode);
			NI.TypeFirstName("TestFirst");
			NI.TypeLastName("TestLast");
			NI.TypeDOB("01011980");
			NI.SelectGender("Male");
			NI.TypeMailingAddress1(addy1);
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
			//P.SelectExcludeWind("NO");	
			P.ContinueToQuoteType();
				Pause(700);
			//Retrieve Quote
			String iaqquoteid = P.ReturnQuoteID("N");
			if(!driver.getPageSource().contains("Begin with Dwelling Coverage:")){
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				try {
						Log(casenum + "-" + iaqquoteid + ": " + P.ReturnAddressError());
						logger.log(Status.SKIP, casenum + "-" + iaqquoteid + ": " + P.ReturnAddressError());
				}
				catch(Exception e) {
						Log(casenum + "-" + iaqquoteid + ": unable to proceed further");
						logger.log(Status.SKIP, casenum + "-" + iaqquoteid + ": unable to proceed further");
				}
					Log("=========================== End " + casenum + " ===========================");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				return;
			}
			P.TypeDwellingCoverage("200000");
				Pause(700);
			P.ClickQuoteType("FULL");
				Pause(2000);
			if(driver.getPageSource().contains("Is a fire hydrant within 1000 feet")) {
				P.SelectIsAFireHydrantWithin1000Feet(within1000ft, "Yes");
			}
			else {
					Log(casenum + "-" + iaqquoteid + ": This address does not have a Split PC");
					logger.log(Status.SKIP, casenum + "-" + iaqquoteid + ": This address does not have a Split PC");
					Log("=========================== End " + casenum + " ===========================");
				return;
			}
			P.TypeYearHomeBuilt("2012");
			P.ClickCustomerTextHeader();
				Pause(1000);
				Log("======================= Start Split PC Results ========================");
			if(P.ReturnProtectionClass().equals(exppc)) {
					Log(casenum + "-" + iaqquoteid + "-MATCHES: IAQ Protection Class value of " + P.ReturnProtectionClass() + " matches expected value");
			}
			else {
					Log(casenum + "-" + iaqquoteid + "-NO MATCH: IAQ Protection Class value of " + P.ReturnProtectionClass() + " does not match expected value of " + exppc);
			}
			P.SaveQuote();
				Pause(3000);
			
			//Switches to tab that contains PS
			SwitchTab("0");
			
			//Policy System
			LoginPS("Live");
			
				
			SelectBrowser("chrome");
			LoginPS("LIVE");
			
			//Initialize Drivers
			FAO = new ForAgentsOnly(driver);
			NI = new NamedInsured(driver);
			P = new Products(driver);
			HM = new HouseholdMembers(driver);
			AD = new AdditionalDetails(driver);
			CBP = new CoverageBillPlans(driver);
			RPL = new RatingAndPolicyLookup(driver);
			PRT = new PlanAndResidenceType(driver);
			PRP1 = new PolicyRatingPage1(driver);
			PRP2 = new PolicyRatingPage2(driver);
			PP = new PolicyPremiums(driver);
			
			//Rating And Policy Lookup
			RPL.SelectState(state + "|");
			RPL.ClickCreateNewQuote();
			
			//Plan And Residence Type
			PRT.TypeFirstName("TestFirst");
			PRT.TypeLastName("TestLast");
			PRT.TypeLocationAddress(addy1);
			PRT.TypeCity(city);
			PRT.TypeZip(zip);
			PRT.SelectPlanTypeByPlan("HO3", "ASI");
			//PRT.SelectExcludeWind("N");
			PRT.SelectResidenceType("Single Family");
			PRT.CheckKnockouts();
			PRT.ClickNext();
			PRT.CheckOverrides();
			if(driver.getPageSource().contains("This address has a split protection class")) {
				if(within1000ft.toUpperCase().equals("Y")) {
					PRT.SelectSplitPCByIndex(1, casenum);
				}
				else {
					PRT.SelectSplitPCByIndex(2, casenum);
				}
			}
			else {
					Log(casenum +  ": This address does not have a Split PC in PS");
					logger.log(Status.SKIP, casenum +  ": This address does not have a Split PC in PS");
					Log("=========================== End " + casenum + " ===========================");
				return;
			}		
			
			//Policy Rating Page 1
			String psquoteid = PRP1.ReturnPolicyID();
			if(PRP1.ReturnProtectionClass().equals(exppc)) {
					Log(casenum + "-" + psquoteid + "-MATCHES: PS Protection Class value of " + PRP1.ReturnProtectionClass() + " matches expected value");
					logger.log(Status.PASS, casenum + "-" + psquoteid + "-MATCHES: PS Protection Class value of " + PRP1.ReturnProtectionClass() + " matches expected value");
			}
			else {
					Log(casenum + "-" + psquoteid + "-NO MATCH: PS Protection Class value of " + PRP1.ReturnProtectionClass() + " does not match expected value of " + exppc);
					logger.log(Status.FAIL, casenum + "-" + psquoteid + "-NO MATCH: PS Protection Class value of " + PRP1.ReturnProtectionClass() + " does not match expected value of " + exppc);
			}		
				Log("======================= End Split PC Results ========================");
				Log("=========================== End " + casenum + " ===========================");
		}
		catch(Exception e) {
			e.printStackTrace();
			GetFailScreenShot(casenum +  "-" + state + "-PC_Error");
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
			Log("====================================== End PC_DataCall Batch ===========================================");
	}
}