package Automation.IAQ.Testing.DataCalls.HO3;

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
import Automation.IAQ.pages.StartQuote;
import Automation.IAQ.pages.ForAgentsOnly;
import Automation.IAQ.testBase.TestBase;

@SuppressWarnings("unused")
@Listeners(Automation.IAQ.customListeners.CustomListeners.class)
public class DP_DataCall extends TestBase {
	
	public static final Logger log = Logger.getLogger(DP_DataCall.class.getName());
	
	ForAgentsOnly FAO;
	NamedInsured NI;
	Products P;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\IAQ\\Testing\\DataCalls\\HO3\\DP_DataCall\\DP_DataCall-" + GetDateTime() + ".html");
	
	@DataProvider(name="DP_DataCall")
	public String[][] GetDP_DataCall() {
		String[][] data = GetData("Data", "DP_DataCall", "Testing", "datacalls/HO3");
		return data;
	}
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting DP_DataCall Batch ======================================");		
	}
	
	@Test(dataProvider="DP_DataCall")
	public void RunDP_DataCall(String casenum, String pgragentid, String state, String asiagentcode, String fname, String lname, String mailaddy1,
		String city, String zip, String expyrhomebuilt, String exptypeconstr, String expextwalls, String explivingarea, String expgarage, String exproofmaterial, 
		String expsubstructure, String expfullbaths, String expheatsource, String expdeck) throws InterruptedException {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("DP_DataCall");
		try {
				Log("========================= Starting " + casenum + " =========================");
			
			//FAO Login
			InitIAQ("Chrome", pgragentid);		
			
			//Initialize Drivers
			FAO = new ForAgentsOnly(driver);
			NI = new NamedInsured(driver);
			P = new Products(driver);
			
			//FAO Page
			FAO.StartFAO(state, "HO3");
	
			//Switches to tab that contains IAQ
			SwitchTab("1");	
			
			//Named Insured Page
			NI.SelectASIAgentCode(asiagentcode);
			NI.TypeFirstName(fname);
			NI.TypeLastName(lname);
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
				Log(casenum + "-" + iaqquoteid + "-" + P.ReturnQuoteID("N"));
			P.TypeDwellingCoverage("200000");
				Pause(700);
			P.ClickQuoteType("FULL");
				Pause(500);		
				Log("================= Start DataPrefill Results ==================");			
			//Confirm Year Built
			if(P.ReturnYearHomeBuilt().equals("N/A")) {
					Log(casenum + "-" + iaqquoteid + "-NO VALUE: Year Home Built");
					logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-NO VALUE: Year Home Built");
			}
			else {
				if(P.ReturnYearHomeBuilt().equalsIgnoreCase(expyrhomebuilt)) {
						Log(casenum + "-" + iaqquoteid + "-MATCHES:  Year Home Built value of " + P.ReturnYearHomeBuilt() + " matches expected value");
						logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-MATCHES:  Year Home Built value of " + P.ReturnYearHomeBuilt() + " matches expected value");
				}
				else {
						Log(casenum + "-" + iaqquoteid + "-NO MATCH: Year Home Built value of " + P.ReturnYearHomeBuilt() + " does not match expected value of " + expyrhomebuilt);
						logger.log(Status.FAIL, casenum + "-" + iaqquoteid + "-NO MATCH: Year Home Built value of " + P.ReturnYearHomeBuilt() + " does not match expected value of " + expyrhomebuilt);
				}
			}
			
			//Confirm Type of Construction
			if(P.ReturnTypeofConstruction().equals("N/A")) {
					Log(casenum + "-" + iaqquoteid + "-NO VALUE: Type of Construction");
					logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-NO VALUE: Type of Construction");
			}
			else {
				if(P.ReturnTypeofConstruction().equalsIgnoreCase(exptypeconstr)) {
						Log(casenum + "-" + iaqquoteid + "-MATCHES:  Type of Construction value of " + P.ReturnTypeofConstruction() + " matches expected value");
						logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-MATCHES:  Type of Construction value of " + P.ReturnTypeofConstruction() + " matches expected value");
				}
				else {
						Log(casenum + "-" + iaqquoteid + "-NO MATCH: Type of Construction value of " + P.ReturnTypeofConstruction() + " does not match expected value of " + exptypeconstr);
						logger.log(Status.FAIL, casenum + "-" + iaqquoteid + "-NO MATCH: Type of Construction value of " + P.ReturnTypeofConstruction() + " does not match expected value of " + exptypeconstr);
				}
			}
			
			//Confirm Exterior Walls
			if(P.ReturnExteriorWalls().equals("N/A")) {
					Log(casenum + "-" + iaqquoteid + "-NO VALUE: Exterior Walls");
					logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-NO VALUE: Exterior Walls");
			}
			else {
				if(P.ReturnExteriorWalls().equalsIgnoreCase(expextwalls)) {
						Log(casenum + "-" + iaqquoteid + "-MATCHES:  Exterior Walls value of " + P.ReturnExteriorWalls() + " matches expected value");
						logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-MATCHES:  Exterior Walls value of " + P.ReturnExteriorWalls() + " matches expected value");
				}
				else {
						Log(casenum + "-" + iaqquoteid + "-NO MATCH: Exterior Walls value of " + P.ReturnExteriorWalls() + " does not match expected value of " + expextwalls);
						logger.log(Status.FAIL, casenum + "-" + iaqquoteid + "-NO MATCH: Exterior Walls value of " + P.ReturnExteriorWalls() + " does not match expected value of " + expextwalls);
				}
			}
			
			//Confirm Living Area (Square Feet)
			if(P.ReturnLivingAreaSquareFeet().equals("N/A")) {
					Log(casenum + "-" + iaqquoteid + "-NO VALUE: Living Area (Square Feet)");
					logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-NO VALUE: Living Area (Square Feet)");
			}
			else {
				if(P.ReturnLivingAreaSquareFeet().equalsIgnoreCase(explivingarea)) {
						Log(casenum + "-" + iaqquoteid + "-MATCHES:  Living Area (Square Feet) value of " + P.ReturnLivingAreaSquareFeet() + " matches expected value");
						logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-MATCHES:  Living Area (Square Feet) value of " + P.ReturnLivingAreaSquareFeet() + " matches expected value");
				}
				else {
						Log(casenum + "-" + iaqquoteid + "-NO MATCH: Living Area (Square Feet) value of " + P.ReturnLivingAreaSquareFeet() + " does not match expected value of " + explivingarea);
						logger.log(Status.FAIL, casenum + "-" + iaqquoteid + "-NO MATCH: Living Area (Square Feet) value of " + P.ReturnLivingAreaSquareFeet() + " does not match expected value of " + explivingarea);
				}
			}
			
			//Confirm Garage
			if(P.ReturnGarage().equals("N/A")) {
					Log(casenum + "-" + iaqquoteid + "-NO VALUE: Garage");
					logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-NO VALUE: Garage");
			}
			else {
				if(P.ReturnGarage().equalsIgnoreCase(expgarage)) {
						Log(casenum + "-" + iaqquoteid + "-MATCHES:  Garage value of " + P.ReturnGarage() + " matches expected value");
						logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-MATCHES:  Garage value of " + P.ReturnGarage() + " matches expected value");
				}
				else {
						Log(casenum + "-" + iaqquoteid + "-NO MATCH: Garage value of " + P.ReturnGarage() + " does not match expected value of " + expgarage);
						logger.log(Status.FAIL, casenum + "-" + iaqquoteid + "-NO MATCH: Garage value of " + P.ReturnGarage() + " does not match expected value of " + expgarage);
				}
			}
			
			//Confirm Roof Material
			if(P.ReturnRoofMaterial().equals("N/A")) {
					Log(casenum + "-" + iaqquoteid + "-NO VALUE: Roof Material");
					logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-NO VALUE: Roof Material");
			}
			else {
				if(P.ReturnRoofMaterial().equalsIgnoreCase(exproofmaterial)) {
						Log(casenum + "-" + iaqquoteid + "-MATCHES:  Roof Material value of " + P.ReturnRoofMaterial() + " matches expected value");
						logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-MATCHES:  Roof Material value of " + P.ReturnRoofMaterial() + " matches expected value");
				}
				else {
						Log(casenum + "-" + iaqquoteid + "-NO MATCH: Roof Material value of " + P.ReturnRoofMaterial() + " does not match expected value of " + exproofmaterial);
						logger.log(Status.FAIL, casenum + "-" + iaqquoteid + "-NO MATCH: Roof Material value of " + P.ReturnRoofMaterial() + " does not match expected value of " + exproofmaterial);
				}
			}
			
			//Confirm Substructure
			if(P.ReturnSubstructure().equals("N/A")) {
					Log(casenum + "-" + iaqquoteid + "-NO VALUE: Substructure");
					logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-NO VALUE: Substructure");
			}
			else {
				if(P.ReturnSubstructure().equalsIgnoreCase(expsubstructure)) {
						Log(casenum + "-" + iaqquoteid + "-MATCHES:  Substructure value of " + P.ReturnSubstructure() + " matches expected value");
						logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-MATCHES:  Substructure value of " + P.ReturnSubstructure() + " matches expected value");
				}
				else {
						Log(casenum + "-" + iaqquoteid + "-NO MATCH: Substructure value of " + P.ReturnSubstructure() + " does not match expected value of " + expsubstructure);
						logger.log(Status.FAIL, casenum + "-" + iaqquoteid + "-NO MATCH: Substructure value of " + P.ReturnSubstructure() + " does not match expected value of " + expsubstructure);
				}
			}
			
			//Confirm Number of Full Baths
			if(P.ReturnNumberFullBaths().equals("N/A")) {
					Log(casenum + "-" + iaqquoteid + "-NO VALUE: Number of Full Baths");
					logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-NO VALUE: Number of Full Baths");
			}
			else {
				if(P.ReturnNumberFullBaths().equalsIgnoreCase(expfullbaths)) {
						Log(casenum + "-" + iaqquoteid + "-MATCHES:  Number of Full Baths value of " + P.ReturnNumberFullBaths() + " matches expected value");
						logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-MATCHES:  Number of Full Baths value of " + P.ReturnNumberFullBaths() + " matches expected value");
				}
				else {
						Log(casenum + "-" + iaqquoteid + "-NO MATCH: Number of Full Baths value of " + P.ReturnNumberFullBaths() + " does not match expected value of " + expfullbaths);
						logger.log(Status.FAIL, casenum + "-" + iaqquoteid + "-NO MATCH: Number of Full Baths value of " + P.ReturnNumberFullBaths() + " does not match expected value of " + expfullbaths);
				}
			}
			
			//Confirm Permanent Heat Source
			if(P.ReturnPermanentHeatSource().equals("N/A")) {
					Log(casenum + "-" + iaqquoteid + "-NO VALUE: Permanent Heat Source");
					logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-NO VALUE: Permanent Heat Source");
			}
			else {
				if(P.ReturnPermanentHeatSource().equalsIgnoreCase(expheatsource)) {
						Log(casenum + "-" + iaqquoteid + "-MATCHES:  Permanent Heat Source value of " + P.ReturnPermanentHeatSource() + " matches expected value");
						logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-MATCHES:  Permanent Heat Source value of " + P.ReturnPermanentHeatSource() + " matches expected value");
				}
				else {
						Log(casenum + "-" + iaqquoteid + "-NO MATCH: Permanent Heat Source value of " + P.ReturnPermanentHeatSource() + " does not match expected value of " + expheatsource);
						logger.log(Status.FAIL, casenum + "-" + iaqquoteid + "-NO MATCH: Permanent Heat Source value of " + P.ReturnPermanentHeatSource() + " does not match expected value of " + expheatsource);
				}
			}
			
			//Confirm Deck
			if(P.ReturnDeck().equals("N/A")) {
					Log(casenum + "-" + iaqquoteid + "-NO VALUE: Deck");
					logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-NO VALUE: Deck");
			}
			else {
				if(P.ReturnDeck().equalsIgnoreCase(expdeck)) {
						Log(casenum + "-" + iaqquoteid + "-MATCHES:  Deck value of " + P.ReturnDeck() + " matches expected value");
						logger.log(Status.PASS, casenum + "-" + iaqquoteid + "-MATCHES:  Deck value of " + P.ReturnDeck() + " matches expected value");
				}
				else {
						Log(casenum + "-" + iaqquoteid + "-NO MATCH: Deck value of " + P.ReturnDeck() + " does not match expected value of " + expdeck);
						logger.log(Status.FAIL, casenum + "-" + iaqquoteid + "-NO MATCH: Deck value of " + P.ReturnDeck() + " does not match expected value of " + expdeck);
				}
			}
			P.SaveQuote();
				Log("================= End DataPrefill Results ====================");				
				Log("========================= End " + casenum + " =========================");
		}
		
		catch(Exception e) {
			e.printStackTrace();
			GetFailScreenShot(casenum +  "-" + state + "-DP_Error");
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
			Log("====================================== End DP_DataCall Batch ======================================");
	}
}