package Automation.IAQ.Regression.DataCalls;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
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

import Automation.IAQ.pages.NamedInsured;
import Automation.IAQ.pages.Products;
import Automation.IAQ.pages.ForAgentsOnly;
import Automation.IAQ.testBase.TestBase;

@SuppressWarnings("unused")
@Listeners(Automation.IAQ.customListeners.CustomListeners.class)
public class BF_DataCall extends TestBase {
	
	public static final Logger log = Logger.getLogger(BF_DataCall.class.getName());
	
	ForAgentsOnly FAO;
	NamedInsured NI;
	Products P;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\IAQ\\Regression\\DataCalls\\BF_DataCall\\BF_DataCall-" + GetDateTime() + ".html");
	
	@DataProvider(name="BF_DataCall")
	public String[][] GetBF_DataCall() {
		String[][] data = GetData("Data", "BF_DataCall", "Regression", "datacalls");
		return data;
	}
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("=========================================== Starting BF_DataCall Batch ===========================================");	
	}
	
	@Test(dataProvider="BF_DataCall")
	public void RunBF_DataCall(String casenum, String pgragentid, String state, String asiagentcode, String mailaddy1, String city, String zip,
		String expyrroofinstalled) throws InterruptedException {	
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("BF_DataCall");
		try {
				Log("============================== Starting " + casenum + " ==============================");
			
			//FAO Login
			InitIAQ("Chrome", pgragentid);		
			
			//Initialize Drivers
			FAO = new ForAgentsOnly(driver);
			NI = new NamedInsured(driver);
			P = new Products(driver);
			
			//FAO Page
			FAO.SelectState(state);
			FAO.ClickSelectProduct();
			FAO.ClickPlanType("HO3");
			FAO.ClickStartQuote();
	
			//Switches to tab that contains IAQ
			SwitchTab("1");
	
			//Named Insured Page
			NI.SelectASIAgentCode(asiagentcode);
			NI.TypeFirstName("TestFirst");
			NI.TypeLastName("TestLast");
			NI.TypeDOB("01011980");
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
				Pause(1000);
			P.SelectResidenceType("Single Family");
				Pause(1000);
			if(driver.getPageSource().contains("Exclude Wind")) {
				P.SelectExcludeWind("No");
					Pause(1000);
			}
			P.CheckBothVerifications();
				Pause(1000);
			P.ContinueToQuoteType();
				Pause(700);
			//Retrieve Quote
			String iaqquoteid = P.ReturnQuoteID("N");
			P.TypeDwellingCoverage("200000");
				Pause(700);
			P.ClickQuoteType("FULL");
				Pause(500);	
				Log("======================= Start BuildFax Results ========================");
			//Confirm Year Roof Installed
			if(P.ReturnYearRoofInstalled().equals("N/A")) {
					Log(casenum + "-" + iaqquoteid + "-NO VALUE: Year Roof Installed");
					logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-NO VALUE: Year Roof Installed");
			}
			else {
				if(P.ReturnYearRoofInstalled().equals(expyrroofinstalled)) {
						Log(casenum + "-" + iaqquoteid + "-MATCHES:  Year Roof Installed value of " + P.ReturnYearRoofInstalled() + " matches expected value");
						logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-MATCHES:  Year Roof Installed value of " + P.ReturnYearRoofInstalled() + " matches expected value");
				}
				else {
						Log(casenum + "-" + iaqquoteid + "-NO MATCH: Year Roof Installed value of " + P.ReturnYearRoofInstalled() + " does not match expected value of " + expyrroofinstalled);
						logger.log(Status.FAIL, casenum + "-" + iaqquoteid + "-NO MATCH: Year Roof Installed value of " + P.ReturnYearRoofInstalled() + " does not match expected value of " + expyrroofinstalled);
				}
			}		
				Log("======================= End BuildFax Results ==========================");				
				Log("============================== End " + casenum + " ==============================");
		}
		catch(Exception e) {
			e.printStackTrace();
			GetFailScreenShot(casenum +  "-" + state + "-BF_Error");
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
			Log("=========================================== End BF_DataCall Batch ===========================================");
	}
}