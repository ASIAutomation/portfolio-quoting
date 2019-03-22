package Automation.IAQ.Testing.Rates.TX;

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
public class Rates_HO6 extends TestBase {

	public static final Logger log = Logger.getLogger(Rates_HO6.class.getName());

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
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\IAQ\\Testing\\Rates\\TX\\Rates_HO6\\Rates_HO6-" + GetDateTime() + ".html");
	
	@DataProvider(name="Rates_HO6")
	public String[][] GetRates_HO6DataCall() {
		String[][] data = GetData("IAQPoldata", "Rates_HO6", "Testing", "TX");
		return data;
	}

	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting Rates_HO6 Batch ======================================");
	}

	@Test(dataProvider="Rates_HO6")
	public void RunRates_HO6(String casenum, String state, String planid, String pgragentid, String asiagentid, String fname, String lname,
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
		String othersportsequip, String silverware, String stamps, String premium) throws InterruptedException, NoSuchMethodException, SecurityException {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("Rates_HO6");
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
			PRP2 = new PolicyRatingPage2(driver);
					
			//FAO Page
			FAO.StartFAO(state, "HO6");
	
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
				Pause(1000);
			if(newpurch.toUpperCase().equals("Y") || newpurch.toUpperCase().equals("YES") || newpurch.toUpperCase().equals("1")) {
				P.SelectRiskHomeClosing("Y");
			}
			else {
				P.SelectRiskHomeClosing("N");
			}
				Pause(2000);
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
					Pause(500);
				P.TypePurchasePrice("200000");
					Pause(500);
			}
			else {
				P.TypePurchaseDate(new SimpleDateFormat("MMddyyyy").format(new Date()));
					Pause(1000);
			}
			P.TypePersonalProperty(personalprop);
				Pause(1000);
			P.ForceTypeYearHomeBuilt(yearhomebuilt);
			P.SelectIsAFireHydrantWithin1000Feet("Y","N");
			P.SelectIsAFireHydrantWithin1000Feet("Y","Y");
			P.ForceSelectTypeofConstruction(constype);
			P.ForceSelectRoofDesign("Gable");
			P.ForceSelectNumberofStories("Condo 1 Story");
			
			//Confirm values are all populated
			P.TypeYearHomeBuilt(yearhomebuilt);
			P.SelectTypeofConstruction(constype);
			P.SelectRoofDesign("Gable");
			P.SelectNumberofStories("Condo 1 Story");
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
			PRT.SelectSplitPCByIndex(1, casenum);
				
			//Policy Rating Page 1
			PRP1.SelectOccupation("Other");
			PRP1.SelectProtectionClass(pc);
			PRP1.ApplyAllOverridesHO6(reportedclaims, creditscore, claimsurcharge, "Rates Testing");
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
			P.TypeLivingAreaSquareFeet("2000");
			P.SelectBathroomGrade("Builder's Grade");
			P.SelectNumberFullBaths("2");
			P.SelectNumberHalfBaths("0");
			P.SelectKitchenGrade("Builder's Grade");
			P.SelectCoolingAir("Central Air Conditioning");
			P.SelectPermanentHeatSource("Electric");
			P.SelectDeck("None");
				Pause(1500);
			P.ClickHouseholdMembers();
	
			//Household Members Page			
			HM.TypeSSN("111001111");
			HM.SelectMarital(maritalstatus);
			HM.ClickAdditionalDetails();
	
			//Additional Details page
			AD.SelectFloorsAboveUnit(numoffloors);
			AD.SelectPriorLiabilityLimitOld(priorliab);
				String priorliabvalue = AD.ReturnPriorLiabilityLimit();
			AD.SelectRenterOccupied(renterocc);
			AD.SelectESign(esign);
			AD.SelectReportedClaims(reportedclaims);
			if(driver.getPageSource().contains("Are you retired?")) {
				AD.SelectAreYouRetired(retired);
			}
			AD.SelectResidentsSmoke(residentsmoke);
			if(driver.getPageSource().contains("New Purchase")) {
				AD.SelectNewPurchase(newpurch);
			}
			AD.SelectPackagePolicy(packagepol);
			AD.SelectSecuredSubdivision(securedsub);
			AD.SelectBurglarProtection(burglarprot);
			AD.SelectFireProtection(fireprot);
			AD.SelectPaperless(esign);
			AD.ClickCoverageBillPlans();
	
			//Coverage/Bill Plans Page
			CBP.SelectPersonalLiability(liability);
				Pause(3000);
			CBP.SelectMedicalPaymentsLimit(medpayment);
				Pause(3000);
			CBP.SelectAllOtherPerils(allotherperils);
				Pause(3000);
			CBP.SelectWindHailDeductible(windhaildeduct);
				Pause(3000);
			CBP.SelectIncreaseJewelryWatchesFurs(incjwf);
				Pause(3000);
			CBP.SelectAnimalBuyback(animalliab);
				Pause(3000);
			CBP.TypeHomeComputerCoverage(hcc);
				Pause(500);
			if(!CBP.ReturnTypeHomeComputerCoverage().equals(hcc)) {
				CBP.TypeHomeComputerCoverage(hcc);
				Pause(500);
			}
			CBP.SelectLossAssessment(lossassessment);
				Pause(3000);
			CBP.SelectOrdinanceOrLaw(ordlaw);
				Pause(3000);
			CBP.SelectMoldBuyback(fungi);
				Pause(3000);
			CBP.SelectWaterBackupSumpPump(waterbackup);
				Pause(3000);
			CBP.CheckPersonalInjury(personalinj);
			CBP.CheckPersonalPropertyReplacementCost(pprc);
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
			CBP.ClickCustomerTextHeader();
				Pause(5000);
			CBP.ClickRecalculate();
				Pause(15000);
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
				if(!effdate.equalsIgnoreCase(PRP1.ReturnEffectiveDate())) {
						Log("Effective Date:" + effdate + "-" + PRP1.ReturnEffectiveDate());
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
				if(!yearhomebuilt.equalsIgnoreCase(PRP1.ReturnYearHomeBuilt())) {
						Log("Year Home Built:" + yearhomebuilt + "-" + PRP1.ReturnYearHomeBuilt());
				}
				if(!constype.equalsIgnoreCase(PRP1.ReturnTypeofConstruction())) {
						Log("Type of Construction:" + constype + "-" + PRP1.ReturnTypeofConstruction());
				}
				if(!numofstories.equalsIgnoreCase(PRP1.ReturnNumofStories())) {
						Log("# Stories:" + numofstories + "-" + PRP1.ReturnNumofStories());
				}
				if(!covga.equalsIgnoreCase(PRP1.ReturnDwellingCoverage())) {
						Log("Dwelling Coverage:" + covga + "-" + PRP1.ReturnDwellingCoverage());
				}
				if(!personalprop.equalsIgnoreCase(PRP1.ReturnContentsCoverage())) {
						Log("Contents:" + personalprop + "-" + PRP1.ReturnContentsCoverage());
				}
				if(!pc.equalsIgnoreCase(PRP1.ReturnProtectionClass())) {
						Log("Protection Class: " + PRP1.ReturnProtectionClass());
				}
				if(!roofdesign.equalsIgnoreCase(PRP1.ReturnRoofDesign())) {
						Log("Roof Design:" + roofdesign + "-" + PRP1.ReturnRoofDesign());
				}
				if(newpurch.toUpperCase().equals("Y") || newpurch.toUpperCase().equals("YES") || newpurch.toUpperCase().equals("1")) {
					if(!PRP1.ReturnPurchaseDate().equalsIgnoreCase(effdate)) {
							Log("Purchase Date: " + effdate + "-" + PRP1.ReturnPurchaseDate());
					}
				}
				else {
					if(!PRP1.ReturnPurchaseDate().equalsIgnoreCase(new SimpleDateFormat("MMddyyyy").format(new Date()))) {
							Log("Purchase Date: " + new SimpleDateFormat("MMddyyyy").format(new Date()) + "-" + PRP1.ReturnPurchaseDate());
					}
				}				
				if(newpurch.equalsIgnoreCase("Y") || newpurch.equalsIgnoreCase("YES") || newpurch.equalsIgnoreCase("1")) {
					if(!PRP1.ReturnRiskForAHomeClosing().equalsIgnoreCase("YES")) {
							Log("Is this risk for a home closing?: Yes-" + PRP1.ReturnRiskForAHomeClosing());
					}
				}
				else {
					if(!PRP1.ReturnRiskForAHomeClosing().equalsIgnoreCase("NO")) {
							Log("Is this risk for a home closing?: No-" + PRP1.ReturnRiskForAHomeClosing());
					}
				}
				if(!creditscore.equalsIgnoreCase(PRP1.ReturnCreditScoreOverride())) {
						Log("Credit Score:" + creditscore + "-" + PRP1.ReturnCreditScoreOverride());
				}			
				PRP1.ClickNext();
				
				//Policy Rating Page 2
				switch(priorliab.toUpperCase()) {
					case "100":						if(!PRP2.ReturnPriorLiabilityLimit().equalsIgnoreCase("$10,000 - $100,000")) {
															Log("Prior Liability Limit: $10,000 - $100,000-" + PRP2.ReturnPriorLiabilityLimit());
													}
													break;
													
					case "300":						if(!PRP2.ReturnPriorLiabilityLimit().equalsIgnoreCase(priorliabvalue)) {
															Log("Prior Liability Limit: " + priorliabvalue + "-"  + PRP2.ReturnPriorLiabilityLimit());
													}
													break;
								
					case "FIRST TIME HOME BUYER":	if(!PRP2.ReturnPriorLiabilityLimit().equalsIgnoreCase("First Time Home Buyer")) {
															Log("Prior Liability Limit: First Time Home Buyer-" + PRP2.ReturnPriorLiabilityLimit());
													}
													break;
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
						
					case "2":	if(!PRP2.ReturnReportedClaims().equalsIgnoreCase("2 or More")) {
										Log("Reported Claims excluding Wind, Hail, or Lightning in the past 3 yrs: 2 or More-" + PRP2.ReturnReportedClaims());						
								}
								break;
						
					case "3":	if(!PRP2.ReturnReportedClaims().equalsIgnoreCase("2 or More")) {
										Log("Reported Claims excluding Wind, Hail, or Lightning in the past 3 yrs: 2 or More-" + PRP2.ReturnReportedClaims());						
								}
								break;
				}
				if(!liability.equalsIgnoreCase(PRP2.ReturnLiability())) {
						Log("Liability: " + liability + "-" + PRP2.ReturnLiability());
				}
				if(!medpayment.equalsIgnoreCase(PRP2.ReturnMedicalPaymentsLimit())) {
						Log("Medical Payments Limit: " + medpayment + "-" + PRP2.ReturnMedicalPaymentsLimit());
				}
				if(!esign.equalsIgnoreCase(PRP2.ReturnESignature())) {
						Log("E-Signature: " + esign + "-" + PRP2.ReturnESignature());
				}
				if(!esign.equalsIgnoreCase(PRP2.ReturnEPolicyPaperless())) {
						Log("E-Policy (Paperless): " + esign + "-" + PRP2.ReturnEPolicyPaperless());
				}
				if(!securedsub.equalsIgnoreCase(PRP2.ReturnSecuredSubdivision())) {
						Log("Secured Subdivision: " + securedsub + "-" + PRP2.ReturnSecuredSubdivision());
				}
				switch(newpurch.toUpperCase()) {
					case "Y": case "YES": case "1": case "2": case "3": if(!PRP2.ReturnNewPurchaseDiscount().equalsIgnoreCase("Y")) {
																				Log("New Purchase Discount: Y-" + PRP2.ReturnNewPurchaseDiscount());
																		}
																		break;
						
					default:											if(!PRP2.ReturnNewPurchaseDiscount().equalsIgnoreCase("N")) {
																				Log("New Purchase Discount: N-" + PRP2.ReturnNewPurchaseDiscount());
																		}
																		break;				
				}
				if(!fireprot.equalsIgnoreCase(PRP2.ReturnFireProtection())) {
						Log("Fire Protection: " + fireprot + "-" + PRP2.ReturnFireProtection());
				}
				if(!burglarprot.equalsIgnoreCase(PRP2.ReturnBurglarProtection())) {
						Log("Burglar Protection: " + burglarprot + "-" + PRP2.ReturnBurglarProtection());
				}
				if(!residentsmoke.equalsIgnoreCase(PRP2.ReturnDoAnyResidentsSmoke())) {
						Log("Do Any Residents Smoke: " + residentsmoke + "-" + PRP2.ReturnDoAnyResidentsSmoke());
				}
				if(!packagepol.equalsIgnoreCase(PRP2.ReturnPackagePolicyDiscount())) {
						Log("Package Policy Discount: " + packagepol + "-" + PRP2.ReturnPackagePolicyDiscount());
				}
				if(!renterocc.equalsIgnoreCase(PRP2.ReturnRenterOcupied())) {
						Log("Renter Occupied: " + renterocc + "-" + PRP2.ReturnRenterOcupied());
				}
				if(!numoffloors.equalsIgnoreCase(PRP2.ReturnFloorAboveUnit())) {
						Log("Floor Above Unit: " + numoffloors + "-" + PRP2.ReturnFloorAboveUnit());
				}
				if(!allotherperils.equalsIgnoreCase(PRP2.ReturnAllOtherPerilsDeductible())) {
						Log("All Perils Deductible: " + allotherperils + "-" + PRP2.ReturnAllOtherPerilsDeductible());
				}
				if(!windhaildeduct.equalsIgnoreCase(PRP2.ReturnWindHailDeductible())) {
						Log("Wind Hail Deductible: " + windhaildeduct + "-" + PRP2.ReturnWindHailDeductible());
				}
				if(!personalinj.equalsIgnoreCase(PRP2.ReturnPersonalInjuryCoverage())) {
						Log("Personal Injury Coverage: " + personalinj + "-" + PRP2.ReturnPersonalInjuryCoverage());
				}
				if(!pprc.equalsIgnoreCase(PRP2.ReturnPersonalPropertyReplacementCost())) {
						Log("Personal Prop Replmnt Cost: " + pprc + "-" + PRP2.ReturnPersonalPropertyReplacementCost());
				}
				switch(waterbackup.toUpperCase()) {
					case "YES": case "Y":	if(!PRP2.ReturnWaterBackupSumpPump().equalsIgnoreCase("Y")) {
													Log("Water Backup/Sump Pump: Y-" + PRP2.ReturnWaterBackupSumpPump());
											}
											break;
											
					case "NO": case "N":	if(!PRP2.ReturnWaterBackupSumpPump().equalsIgnoreCase("N")) {
													Log("Water Backup/Sump Pump: N-" + PRP2.ReturnWaterBackupSumpPump());
											}
											break;				
				}
				if(!hcc.equalsIgnoreCase(PRP2.ReturnHomeComputerCoverage())) {
						Log("Home Computer Coverage: " + hcc + "-" + PRP2.ReturnHomeComputerCoverage());
				}
				if(!animalliab.equalsIgnoreCase(PRP2.ReturnAnimalLiability())) {
						Log("Animal Liability: " + animalliab + "-" + PRP2.ReturnAnimalLiability());
				}
				if(!incjwf.equalsIgnoreCase(PRP2.ReturnIncreaseJewelryWatchesAndFurs())) {
						Log("Increase Jewelry & Furs: " + incjwf + "-" + PRP2.ReturnIncreaseJewelryWatchesAndFurs());
				}
				if(!lossassessment.equalsIgnoreCase(PRP2.ReturnLossAssessment())) {
						Log("Loss Assessment: " + lossassessment + "-" + PRP2.ReturnLossAssessment());
				}
				if(!ordlaw.equalsIgnoreCase(PRP2.ReturnOrdinanceOrLaw())) {
						Log("Ordinance or Law: " + ordlaw + "-" + PRP2.ReturnOrdinanceOrLaw());
				}
				if(!fungi.equalsIgnoreCase(PRP2.ReturnMoldBuyback())) {
						Log("Mold Buyback: " + fungi + "-" + PRP2.ReturnMoldBuyback());
				}
				if(!antiques.equalsIgnoreCase(PRP2.ReturnAntiques())) {
						Log("Antiques: " + antiques + "-" + PRP2.ReturnAntiques());
				}
				if(!bicycles.equalsIgnoreCase(PRP2.ReturnBicycles())) {
						Log("Bicycles: " + bicycles + "-" + PRP2.ReturnBicycles());
				}
				if(!cameras.equalsIgnoreCase(PRP2.ReturnCamerasandProjectionEquipment())) {
						Log("Cameras & Projection Equip: " + cameras + "-" + PRP2.ReturnCamerasandProjectionEquipment());
				}
				if(!coins.equalsIgnoreCase(PRP2.ReturnCoins())) {
						Log("Coins: " + coins + "-" + PRP2.ReturnCoins());
				}
				if(!fineartsnobreakage.equalsIgnoreCase(PRP2.ReturnFineArtsNoBreakage())) {
						Log("Fine Arts (No Breakage): " + fineartsnobreakage + "-" + PRP2.ReturnFineArtsNoBreakage());
				}
				if(!fineartsbreakage.equalsIgnoreCase(PRP2.ReturnFineArtsBreakage())) {
						Log("Fine Arts (Breakage): " + fineartsbreakage + "-" + PRP2.ReturnFineArtsBreakage());
				}
				if(!furs.equalsIgnoreCase(PRP2.ReturnFurs())) {
						Log("Furs: " + furs + "-" + PRP2.ReturnFurs());
				}
				if(!golfequip.equalsIgnoreCase(PRP2.ReturnGolfersEquipment())) {
						Log("Golfers Equipment: " + golfequip + "-" + PRP2.ReturnGolfersEquipment());
				}
				if(!jewelryvalue.equalsIgnoreCase(PRP2.ReturnJewelry())) {
						Log("Jewelry: " + jewelryvalue + "-" + PRP2.ReturnJewelry());
				}
				if(!gunscollectable.equalsIgnoreCase(PRP2.ReturnGunsCollectible())) {
						Log("Guns (Collectible): " + gunscollectable + "-" + PRP2.ReturnGunsCollectible());
				}
				if(!gunsfired.equalsIgnoreCase(PRP2.ReturnGunsFired())) {
						Log("Guns (Fired): " + gunsfired + "-" + PRP2.ReturnGunsFired());
				}
				if(!musicinstruments.equalsIgnoreCase(PRP2.ReturnMusicalInstruments())) {
						Log("Musical Instruments (Non Prof): " + musicinstruments + "-" + PRP2.ReturnMusicalInstruments());
				}
				if(!othersportsequip.equalsIgnoreCase(PRP2.ReturnOtherSportsEquipment())) {
						Log("Other Sports Equip: " + othersportsequip + "-" + PRP2.ReturnOtherSportsEquipment());
				}
				if(!silverware.equalsIgnoreCase(PRP2.ReturnSilverware())) {
						Log("Silverware: " + silverware + "-" + PRP2.ReturnSilverware());
				}
				if(!stamps.equalsIgnoreCase(PRP2.ReturnStamps())) {
						Log("Stamps: " + stamps + "-" + PRP2.ReturnStamps());
				}
			}
				Log(casenum + "-" + quoteid + ": Script has completed");
				logger.log(Status.PASS, casenum + "-" + quoteid + ": Script has completed");
			QuitBrowser();
				Log("========================= End " + casenum + " =========================");
		}
		catch(Exception e) {
				e.printStackTrace();
				GetFailScreenShot(casenum + "-TX_HO6_Error");
				Log(casenum + ": Script has failed. Please rerun.");
				logger.log(Status.FAIL, casenum + ": Script has failed. Please rerun.");
				Log("============================== End " + casenum + " ===================================");	
		}
	}
	
	@AfterMethod
	public void AfterEachTest() {
		//QuitBrowser();	
	}

	@AfterTest
	public void EndBatch() {
		extent.flush();
			Log("====================================== End Rates_HO6 Batch ======================================");
	}
}