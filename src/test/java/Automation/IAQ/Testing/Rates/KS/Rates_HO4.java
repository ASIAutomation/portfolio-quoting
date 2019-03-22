package Automation.IAQ.Testing.Rates.KS;

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
import Automation.IAQ.PS.pages.PolicyRatingPage2;
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
public class Rates_HO4 extends TestBase {

	public static final Logger log = Logger.getLogger(Rates_HO4.class.getName());

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
	PolicyRatingPage2 PRP2;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\IAQ\\Testing\\Rates\\KS\\Rates_HO4\\Rates_HO4-" + GetDateTime() + ".html");

	@DataProvider(name="Rates_HO4")
	public String[][] GetRates_HO4DataCall() {
		String[][] data = GetData("IAQPoldata", "Rates_HO4", "Testing", "KS");
		return data;
	}

	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting Rates_HO4 Batch ======================================");	
	}

	@Test(dataProvider="Rates_HO4")
	public void RunRates_HO4(String casenum, String state, String planid, String pgragentid, String asiagentid, String fname, String lname,
		String addy1, String addy2, String city, String zip, String effdate, String purchdate, String pc, String constype, String yearroof, String roofmaterial,
		String roofdesign, String numofstories, String yearhomebuilt, String maritalstatus, String numofchild, String dob, String paidinfull, String covga,
		String otherstructures, String personalprop, String lossofuse, String liability, String medpayment, String increpcost, String ordlaw, String limwaterdmg,
		String acvlosssettlement, String pprc, String specialpp, String reportedclaims, String priorliab, String creditscore, String allotherperils, String windhaildeduct,
		String eqdeduct, String packagepol, String newpurch, String accbuilder, String residentsmoke, String fireprot, String burglarprot, String waterleakprot,
		String securedsub, String wbstove, String umbrella, String claimsurcharge, String hud, String latestpermit, String occupancy, String esign, String hspackage,
		String waterbackup, String basement, String personalinj, String animalliab, String lossassessment, String incjwf, String hcc, String eqcovg, String substruct,
		String golfcart, String jewelryvalue, String numoffloors, String renterocc, String retired, String hobbyfarming, String nshl, String excludewind,
		String windowandotheropeningprotection, String buildingcode, String openfoundation, String fungi, String limitedfoundation, String securewaterheater,
		String builderwarrenty, String matchundmgsiding, String minesub, String minesubcovgb, String sinkhole, String antiques, String bicycles, String cameras,
		String coins, String fineartsnobreakage, String fineartsbreakage, String furs, String golfequip, String gunscollectable, String gunsfired, String musicinstruments,
		String othersportsequip, String silverware, String stamps, String premium) throws InterruptedException {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("Rates_HO4");
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
			PRP2= new PolicyRatingPage2(driver);
					
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
			NI.SelectDisclosure("Yes");
			NI.SelectLengthofCurrAddress("1 year or more");
			NI.ClickProducts();
	
			//Products Page
			P.TypePolicyEffDate(effdate);
				Pause(2000);
			P.SelectResidenceType("Single Family");
				Pause(2000);
			P.CheckIneligibleVerification();
				Pause(2000);
			P.TypePersonalProperty("20000");
			P.ClickHouseholdMembers();
	
			//Household Members Page
			HM.ClickProducts();
			
			//Products Page
			quoteid = P.ReturnQuoteID("Y");
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
					
			//Policy Rating Page 1
			PRP1.ApplyAllOverridesHO4(reportedclaims, creditscore, claimsurcharge, "Rates Testing");
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
			NI.SelectLengthofCurrAddress("1 year or more");
			NI.ClickProducts();
			
			//Product Page
			P.TypePersonalProperty(personalprop);
			P.ClickHouseholdMembers();
	
			//Household Members Page		
			HM.TypeSSN("111001111");
			HM.SelectMarital(maritalstatus);
			HM.ClickAdditionalDetails();
	
			//Additional Details page
			AD.SelectPriorLiabilityLimit(priorliab);
			AD.SelectReportedClaims(reportedclaims);
			AD.SelectESign(esign);
			AD.SelectPackagePolicy(packagepol);
			AD.SelectSecuredSubdivision(securedsub);
			AD.SelectPaperless(esign);
			AD.ClickCoverageBillPlans();
	
			//Coverage/Bill Plans Page
			CBP.CheckPackage(hspackage);
			CBP.SelectPersonalLiability(liability);
				Pause(3000);
			CBP.SelectMedicalPaymentsLimit(medpayment);
				Pause(3000);
			CBP.SelectAllOtherPerils(allotherperils);
				Pause(3000);
			CBP.SelectIncreaseJewelryWatchesFurs(incjwf);
				Pause(3000);
			CBP.ScheduledPersonalPropertyJewelry(jewelryvalue);
			CBP.SelectHomeComputerCoverage(hcc);
				Pause(3000);
			CBP.ClickBillPlan(paidinfull);
				Pause(3000);
			CBP.ClickCustomerTextHeader();
			CBP.ClickRecalculate();
				Pause(20000);
				Log(asiagentid + "-" + effdate + "-" + quoteid + "-" + fname + "-" + lname + "-" + CBP.ReturnPremium("N"));
			double raterprem = Double.parseDouble(premium);
			double iaqprem = Double.parseDouble(CBP.ReturnPremium("N"));
			CBP.SaveQuote();
			if(raterprem - iaqprem > 1 || iaqprem-raterprem > 1) {
				Pause(1500);
				
				//Switches to tab that contains PS
				SwitchTab("0");				
				
				//Policy System
				GoToPS("Staging");
				RPL.TypeQuotePolicyID(quoteid);
				RPL.ClickLookup();
					
				//Plan and Residence Type Page
				PRT.ClickNext();
				
				//Policy Rating Page 1
				if(!asiagentid.equalsIgnoreCase(PRP1.ReturnAgentID())) {
						Log("Agent ID:" + asiagentid + "-" + PRP1.ReturnAgentID());
				}
				if(!dob.equalsIgnoreCase(PRP1.ReturnDOB())) {
						Log("Date of Birth:" + dob + "-" + PRP1.ReturnDOB());
				}
				if(!addy1.equalsIgnoreCase(PRP1.ReturnLocationAddress())) {
						Log("Location Address:" + addy1 + "-" + PRP1.ReturnLocationAddress());
				}
				if(!addy2.equalsIgnoreCase(PRP1.ReturnUnitNum())) {
						Log("Unit #:" + addy2 + "-" + PRP1.ReturnUnitNum());
				}
				if(!city.equalsIgnoreCase(PRP1.ReturnLocationCity())) {
						Log("Location City:" + city + "-" + PRP1.ReturnLocationCity());
				}
				if(!state.equalsIgnoreCase(PRP1.ReturnLocationState())) {
						Log("Location State:" + state + "-" + PRP1.ReturnLocationState());
				}
				if(!zip.equalsIgnoreCase(PRP1.ReturnLocationZip())) {
						Log("Location Zip Code:" + zip + "-" + PRP1.ReturnLocationZip());
				}
				if(!effdate.equalsIgnoreCase(PRP1.ReturnEffectiveDate())) {
						Log("Effective Date:" + effdate + "-" + PRP1.ReturnEffectiveDate());
				}
				if(!personalprop.equalsIgnoreCase(PRP1.ReturnContentsCoverage())) {
						Log("Contents Coverage:" + personalprop + "-" + PRP1.ReturnContentsCoverage());
				}
				if(!creditscore.equalsIgnoreCase(PRP1.ReturnCreditScoreOverride())) {
						Log("Credit Score: " + creditscore + "-" + PRP1.ReturnCreditScoreOverride());
				}
				if(!claimsurcharge.equalsIgnoreCase(PRP1.ReturnASIClaimSurcharge())) {
						Log("ASI Claim Surcharge: " + claimsurcharge + "-" + PRP1.ReturnASIClaimSurcharge());
				}
				PRP1.ClickNext();
					
				//Policy Rating Page 2
				switch(maritalstatus.toUpperCase()) {
					case "MARRIED": case "WIDOWED":						if(!PRP2.ReturnMaritalStatus().equalsIgnoreCase("Married")) {
																				Log("Marital Status: Married-" + PRP2.ReturnMaritalStatus());
																		}
																		break;
						
					case "SINGLE": case "DIVORCED": case "SEPERATED":	if(!PRP2.ReturnMaritalStatus().equalsIgnoreCase("Single")) {
																				Log("Marital Status: Single-" + PRP2.ReturnMaritalStatus());
																		}
																		break;
				}
				if(!priorliab.equalsIgnoreCase(PRP2.ReturnPriorLiabilityLimit())) {
						Log("Prior Liability Limit: " + priorliab + "-" + PRP2.ReturnPriorLiabilityLimit());
				}
				switch(reportedclaims.toUpperCase()) {
					case "0":	if(!PRP2.ReturnReportedClaims().equalsIgnoreCase("0 Claims")) {
										Log("Reported Claims excluding Wind, Hail, or Lightning in the past 3 yrs: 0 Claims-" + PRP2.ReturnReportedClaims());						
								}
								break;
						
					case "1":	if(!PRP2.ReturnReportedClaims().equalsIgnoreCase("1 Claim")) {
										Log("Reported Claims excluding Wind, Hail, or Lightning in the past 3 yrs: 1 Claim-" + PRP2.ReturnReportedClaims());						
								}
								break;
						
					case "2":	if(!PRP2.ReturnReportedClaims().equalsIgnoreCase("2 Claims")) {
										Log("Reported Claims excluding Wind, Hail, or Lightning in the past 3 yrs: 2 Claims-" + PRP2.ReturnReportedClaims());						
								}
								break;
						
					case "3":	if(!PRP2.ReturnReportedClaims().equalsIgnoreCase("3 or More Claims")) {
										Log("Reported Claims excluding Wind, Hail, or Lightning in the past 3 yrs: 3 or More Claims-" + PRP2.ReturnReportedClaims());						
								}
								break;
				}
				if(!liability.equalsIgnoreCase(PRP2.ReturnLiability())) {
						Log("Liability: " + liability + "-" + PRP2.ReturnLiability());
				}
				if(!medpayment.equalsIgnoreCase(PRP2.ReturnMedicalPaymentsLimit())) {
						Log("Medical Payments Limits: " + medpayment + "-" + PRP2.ReturnMedicalPaymentsLimit());
				}
				if(!esign.equalsIgnoreCase(PRP2.ReturnEPolicyPaperless())) {
						Log("E-Policy (Paperless): " + esign + "-" + PRP2.ReturnEPolicyPaperless());
				}
				if(!esign.equalsIgnoreCase(PRP2.ReturnESignature())) {
						Log("E-Signature: " + esign + "-" + PRP2.ReturnESignature());
				}
				if(!packagepol.equalsIgnoreCase(PRP2.ReturnPackagePolicyDiscount())) {
						Log("Package Policy Discount: " + packagepol + "-" + PRP2.ReturnPackagePolicyDiscount());
				}
				if(!securedsub.equalsIgnoreCase(PRP2.ReturnSecuredSubdivision())) {
						Log("Secured Subdivision: " + securedsub + "-" + PRP2.ReturnSecuredSubdivision());
				}
				switch(paidinfull.toUpperCase()) {
					case "INSURED FULL PAY":	if(!PRP2.ReturnPaidInFullDiscount().equalsIgnoreCase("Yes")) {
														Log("Paid in Full Discount: Yes-" + PRP2.ReturnPaidInFullDiscount());
												}
												break;
						
					case "INSURED PAY PLAN":	if(!PRP2.ReturnPaidInFullDiscount().equalsIgnoreCase("No")) {
														Log("Paid in Full Discount: No-" + PRP2.ReturnPaidInFullDiscount());
												}
												break;
				}
				if(!allotherperils.equalsIgnoreCase(PRP2.ReturnAllOtherPerilsDeductible())) {
						Log("All Perils Deductible: " + allotherperils + "-" + PRP2.ReturnAllOtherPerilsDeductible());
				}
				switch(hspackage.toUpperCase()){
					case "HSR":				if(!PRP2.ReturnPackage().equalsIgnoreCase("HSR")) {
													Log("Package Endorsement: HSR-" + PRP2.ReturnPackage());
											}
											break;
					
					case "N": case "NO":	if(!PRP2.ReturnPackage().equalsIgnoreCase("N")) {
													Log("Package Endorsement: N-" + PRP2.ReturnPackage());
											}
											break;
				}
				if(!hcc.equalsIgnoreCase(PRP2.ReturnHomeComputerCoverage())) {
						Log("Home Computer Coverage: " + hcc + "-" + PRP2.ReturnHomeComputerCoverage());
				}
				if(!incjwf.equalsIgnoreCase(PRP2.ReturnIncreaseJewelryWatchesAndFurs())) {
						Log("Increase Jewelry & Furs: " + incjwf + "-" + PRP2.ReturnIncreaseJewelryWatchesAndFurs());
				}
				if(!jewelryvalue.equalsIgnoreCase(PRP2.ReturnJewelry())) {
						Log("Jewelry: " + jewelryvalue + "-" + PRP2.ReturnJewelry());
				}
			}
				Log(casenum + "-" + quoteid + ": Script has completed");
				logger.log(Status.PASS, casenum + "-" + quoteid + ": Script has completed");
				Log("========================= End " + casenum + " =========================");
		}
		catch(Exception e) {
			e.printStackTrace();
			GetFailScreenShot(casenum + "-KS_HO4_Error");
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
			Log("====================================== End Rates_HO4 Batch ======================================");
	}
}