package Automation.IAQ.Regression.Rates.WI;

import Automation.IAQ.testBase.TestBase;
import Automation.IAQ.PS.pages.*;
import Automation.IAQ.pages.*;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.*;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.log4j.Logger;
import java.text.*;
import java.util.*;
import org.testng.annotations.*;

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
	PolicyRatingPage2 PRP2;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\IAQ\\Regression\\Rates\\WI\\Rates_HO3\\Rates_HO3-" + GetDateTime() + ".html");

	@DataProvider(name="Rates_HO3")
	public String[][] GetRates_HO3DataCall() {
		String[][] data = GetData("IAQPoldata", "Rates_HO3", "Regression", "WI");
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
			PRP2 = new PolicyRatingPage2(driver);
					
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
			P.SelectProtectionClass(pc);
				Pause(1000);
			if(driver.getPageSource().contains("Purchase Price")) {
				P.TypePurchasePrice("300000");
			}
			if(accbuilder.toUpperCase().equals("Y") || accbuilder.toUpperCase().equals("YES")) {
				P.ForceTypeYearRoofInstalled(new SimpleDateFormat("yyyy").format(new Date()));
			}
			else {
				P.ForceTypeYearRoofInstalled(yearroof);
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
			if(driver.getPageSource().contains("Year Cooling Replaced")) {
				P.TypeYearCoolingReplaced(new SimpleDateFormat("yyyy").format(new Date()));
				P.TypeYearHeatingReplaced(new SimpleDateFormat("yyyy").format(new Date()));
				P.TypeYearElectricalReplaced(new SimpleDateFormat("yyyy").format(new Date()));
				P.TypeYearPlumbingReplaced(new SimpleDateFormat("yyyy").format(new Date()));
				P.TypeYearWaterHeaterReplaced(new SimpleDateFormat("yyyy").format(new Date()));	
			}
			P.SelectAluminumWiring("No");
			P.SelectElectricalSystem("Circuit Breakers");
				Pause(1500);
			P.SelectPlumbingSystem("PVC / CPVC");
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
			CBP.SelectIncreaseJewelryWatchesFurs(incjwf);
			CBP.SelectIncreasedReplacementCostOnDwelling(increpcost);
			CBP.SelectAnimalLiability(animalliab);
			CBP.SelectLossAssessment(lossassessment);
			CBP.SelectOrdinanceOrLaw(ordlaw);
			if(hspackage.toUpperCase().equals("N") || (hspackage.toUpperCase().equals("NO"))) {
				CBP.SelectWaterBackupBasement(waterbackup, basement);
			}
			else{
				CBP.SelectAdditionalWaterBackupBasement(waterbackup, basement);
			}
			CBP.CheckLimitedWaterDamage(limwaterdmg);
				Pause(2000);
			CBP.CheckPersonalInjury(personalinj);
				Pause(2000);
			CBP.CheckPersonalPropertyReplacementCost(pprc);
				Pause(2000);
			CBP.CheckSpecialPersonalProperty(specialpp);
				Pause(2000);
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
			CBP.TypeHomeComputerCoverage(hcc);
			if(!CBP.ReturnTypeHomeComputerCoverage().equals(hcc)) {
				CBP.TypeHomeComputerCoverage(hcc);
			}
			CBP.ClickBillPlan(paidinfull);
				Pause(3000);
			CBP.ClickCustomerTextHeader();
			CBP.ClickRecalculate();	
				Pause(8000);
				Log(asiagentid + "-" + effdate + "-" + quoteid + "-" + fname + "-" + lname + "-" + CBP.ReturnPremium("N"));
			CBP.SaveQuote();
			if(!premium.equals(CBP.ReturnPremium("N"))) {
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
				if(accbuilder.toUpperCase().equals("Y") || accbuilder.toUpperCase().equals("YES")) {
					if(!PRP1.ReturnYearHomeBuilt().equalsIgnoreCase(new SimpleDateFormat("yyyy").format(new Date()))) {
							Log("Year Home Built:" + new SimpleDateFormat("yyyy").format(new Date()) + "-" + PRP1.ReturnYearHomeBuilt());
					}
				}
				else {
					if(!yearhomebuilt.equalsIgnoreCase(PRP1.ReturnYearHomeBuilt())) {
							Log("Year Home Built:" + yearhomebuilt + "-" + PRP1.ReturnYearHomeBuilt());
					}
				}
				if(!constype.equalsIgnoreCase(PRP1.ReturnTypeofConstruction())) {
						Log("Type of Construction:" + constype + "-" + PRP1.ReturnTypeofConstruction());
				}
				if(!covga.equalsIgnoreCase(PRP1.ReturnDwellingCoverage())) {
						Log("Dwelling Coverage:" + covga + "-" + PRP1.ReturnDwellingCoverage());
				}
				if(!numofstories.equalsIgnoreCase(PRP1.ReturnNumofStories())) {
						Log("# Stories:" + numofstories + "-" + PRP1.ReturnNumofStories());
				}
				if(!pc.equalsIgnoreCase(PRP1.ReturnProtectionClass())) {
						Log("Protection Class:" + pc + "-" + PRP1.ReturnProtectionClass());
				}
				if(accbuilder.toUpperCase().equals("Y") || accbuilder.toUpperCase().equals("YES")) {
					if(!PRP1.ReturnYearRoofInstalled().equalsIgnoreCase(new SimpleDateFormat("yyyy").format(new Date()))) {
							Log("Year Roof Installed:" + new SimpleDateFormat("yyyy").format(new Date()) + "-" + PRP1.ReturnYearRoofInstalled());
					}
				}
				else {
					if(!yearroof.equalsIgnoreCase(PRP1.ReturnYearRoofInstalled())) {
							Log("Year Roof Installed:" + yearroof + "-" + PRP1.ReturnYearRoofInstalled());
					}
				}
				if(newpurch.equalsIgnoreCase("Y") || newpurch.equalsIgnoreCase("YES") || newpurch.equalsIgnoreCase("1")) {
					if(!effdate.equalsIgnoreCase(PRP1.ReturnPurchaseDate())) {
							Log("Purchase Date:" + effdate + "-" + PRP1.ReturnPurchaseDate());
					}
				}
				else {
					if(!PRP1.ReturnPurchaseDate().equalsIgnoreCase(new SimpleDateFormat("MMddyyyy").format(new Date()))) {
							Log("Purchase Date:" + new SimpleDateFormat("MMddyyyy").format(new Date()) + "-" + PRP1.ReturnPurchaseDate());
					}
				}	
				if(!roofdesign.equalsIgnoreCase(PRP1.ReturnRoofDesign())) {
						Log("Roof Design:" + roofdesign + "-" + PRP1.ReturnRoofDesign());
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
				if(!roofmaterial.equalsIgnoreCase(PRP1.ReturnRoofMaterial())) {
						Log("Roof Material:" + roofmaterial + "-" + PRP1.ReturnRoofMaterial());
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
				switch(numofchild.toUpperCase()) {
					case "9":	if(!PRP2.ReturnNumberOfChildrenInHousehold().equalsIgnoreCase("9 or more")) {
										Log("Number of children in household (<18): 9 or more-" + PRP2.ReturnNumberOfChildrenInHousehold());
								}
								break;
						
					default:	if(!numofchild.equalsIgnoreCase(PRP2.ReturnNumberOfChildrenInHousehold())) {
										Log("Number of children in household (<18): " + numofchild + "-" + PRP2.ReturnNumberOfChildrenInHousehold());
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
						
					case "2":	if(!PRP2.ReturnReportedClaims().equalsIgnoreCase("2 or More")) {
										Log("Reported Claims excluding Wind, Hail, or Lightning in the past 3 yrs: 2 or More-" + PRP2.ReturnReportedClaims());						
								}
								break;
								
					case "3":	if(!PRP2.ReturnReportedClaims().equalsIgnoreCase("2 or More")) {
										Log("Reported Claims excluding Wind, Hail, or Lightning in the past 3 yrs: 2 or More-" + PRP2.ReturnReportedClaims());						
								}
								break;
				}
				if(!otherstructures.equalsIgnoreCase(PRP2.ReturnOtherStructures())) {
						Log("Other Structures: " + otherstructures + "-" + PRP2.ReturnOtherStructures());
				}
				if(!personalprop.equalsIgnoreCase(PRP2.ReturnPersonalProperty())) {
						Log("Personal Property: " + personalprop + "-" + PRP2.ReturnPersonalProperty());
				}
				if(!lossofuse.equalsIgnoreCase(PRP2.ReturnLossOfUse())) {
						Log("Loss of Use: " + lossofuse + "-" + PRP2.ReturnLossOfUse());
				}
				if(!liability.equalsIgnoreCase(PRP2.ReturnLiability())) {
						Log("Personal Liability – Each Occurrence: " + liability + "-" + PRP2.ReturnLiability());
				}
				if(!medpayment.equalsIgnoreCase(PRP2.ReturnMedicalPaymentsLimit())) {
						Log("Medical Payments to Others – Each Person: " + medpayment + "-" + PRP2.ReturnMedicalPaymentsLimit());
				}
				if(!accbuilder.equalsIgnoreCase(PRP2.ReturnAccreditedBuilder())) {
						Log("Accredited Builder: " + accbuilder + "-" + PRP2.ReturnAccreditedBuilder());
				}
				if(!esign.equalsIgnoreCase(PRP2.ReturnEPolicyPaperless())) {
						Log("E-Policy (Paperless): " + esign + "-" + PRP2.ReturnEPolicyPaperless());
				}
				if(!esign.equalsIgnoreCase(PRP2.ReturnESignature())) {
						Log("E-Signature: " + esign + "-" + PRP2.ReturnESignature());
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
				if(!securedsub.equalsIgnoreCase(PRP2.ReturnSecuredSubdivision())) {
						Log("Secured Subdivision: " + securedsub + "-" + PRP2.ReturnSecuredSubdivision());
				}
				if(!umbrella.equalsIgnoreCase(PRP2.ReturnUmbrellaDiscount())) {
						Log("Umbrella Discount: " + umbrella + "-" + PRP2.ReturnUmbrellaDiscount());
				}
				if(!wbstove.equalsIgnoreCase(PRP2.ReturnWoodBurningStove())) {
						Log("Woodburning Stove: " + wbstove + "-" + PRP2.ReturnWoodBurningStove());
				}
				if(!PRP2.ReturnACVLossSettlement().contains(acvlosssettlement)) {
						Log("ACV Loss Settlement-Wind/Hail Losses to Roof: " + acvlosssettlement + "-" + PRP2.ReturnACVLossSettlement());
				}
				if(!burglarprot.equalsIgnoreCase(PRP2.ReturnBurglarProtection())) {
						Log("Burglar Protection: " + burglarprot + "-" + PRP2.ReturnBurglarProtection());
				}
				if(!residentsmoke.equalsIgnoreCase(PRP2.ReturnDoAnyResidentsSmoke())) {
						Log("Do Any Residents Smoke: " + residentsmoke + "-" + PRP2.ReturnDoAnyResidentsSmoke());
				}
				if(!fireprot.equalsIgnoreCase(PRP2.ReturnFireProtection())) {
						Log("Fire Protection: " + fireprot + "-" + PRP2.ReturnFireProtection());
				}
				if(!occupancy.equalsIgnoreCase(PRP2.ReturnOccupancy())) {
						Log("Occupancy: " + occupancy + "-" + PRP2.ReturnOccupancy());
				}
				if(!packagepol.equalsIgnoreCase(PRP2.ReturnPackagePolicyDiscount())) {
						Log("Package Policy Discount: " + packagepol + "-" + PRP2.ReturnPackagePolicyDiscount());
				}
				if(!paidinfull.equalsIgnoreCase(PRP2.ReturnPaidInFullDiscount())) {
						Log("Paid in Full Discount: " + paidinfull + "-" + PRP2.ReturnPaidInFullDiscount());
				}
				if(!waterleakprot.equalsIgnoreCase(PRP2.ReturnWaterLeakProtection())) {
						Log("Water Leak Protection: " + waterleakprot + "-" + PRP2.ReturnWaterLeakProtection());
				}
				if(!hud.equalsIgnoreCase(PRP2.ReturnHomeUpdateDiscount())) {
						Log("Home Update Discount: " + hud + "-" + PRP2.ReturnHomeUpdateDiscount());
				}
				if(!latestpermit.equalsIgnoreCase(PRP2.ReturnLatestPermitDate())) {
						Log("Latest Permit Date: " + latestpermit + "-" + PRP2.ReturnLatestPermitDate());
				}
				if(!allotherperils.equalsIgnoreCase(PRP2.ReturnAllOtherPerilsDeductible())) {
						Log("All Perils Deductible: " + allotherperils + "-" + PRP2.ReturnAllOtherPerilsDeductible());
				}
				if(!windhaildeduct.equalsIgnoreCase(PRP2.ReturnWindHailDeductible())) {
						Log("Wind Hail Deductible: " + windhaildeduct + "-" + PRP2.ReturnWindHailDeductible());
				}
				if(!hspackage.equalsIgnoreCase(PRP2.ReturnPackage())) {
						Log("Package Endorsement: " + hspackage + "-" + PRP2.ReturnPackage());
				}
				if(!limwaterdmg.equalsIgnoreCase(PRP2.ReturnLimitedWaterDamageCoverage())) {
						Log("Limited Water Damage Cov: " + limwaterdmg + "-" + PRP2.ReturnLimitedWaterDamageCoverage());
				}
				if(!personalinj.equalsIgnoreCase(PRP2.ReturnPersonalInjuryCoverage())) {
						Log("Personal Injury Coverage: " + personalinj + "-" + PRP2.ReturnPersonalInjuryCoverage());
				}
				if(!pprc.equalsIgnoreCase(PRP2.ReturnPersonalPropertyReplacementCost())) {
						Log("Personal Prop Replmnt Cost: " + pprc + "-" + PRP2.ReturnPersonalPropertyReplacementCost());
				}
				if(!specialpp.equalsIgnoreCase(PRP2.ReturnSpecialPersonalPropertyCoverage())) {
						Log("Special Pers Prop Coverage: " + specialpp + "-" + PRP2.ReturnSpecialPersonalPropertyCoverage());
				}
				if(!hcc.equalsIgnoreCase(PRP2.ReturnHomeComputerCoverage())) {
						Log("Home Computer Coverage: " + hcc + "-" + PRP2.ReturnHomeComputerCoverage());
				}
				if(!animalliab.equalsIgnoreCase(PRP2.ReturnAnimalLiability())) {
						Log("Animal Liability: " + animalliab + "-" + PRP2.ReturnAnimalLiability());
				}
				if(!golfcart.equalsIgnoreCase(PRP2.ReturnGolfCart())) {
						Log("Golf Cart Physical Damage & Liability: " + golfcart + "-" + PRP2.ReturnGolfCart());
				}
				if(!incjwf.equalsIgnoreCase(PRP2.ReturnIncreaseJewelryWatchesAndFurs())) {
						Log("Increase Jewelry & Furs: " + incjwf + "-" + PRP2.ReturnIncreaseJewelryWatchesAndFurs());
				}
				if(!increpcost.equalsIgnoreCase(PRP2.ReturnIncreasedReplacementCostOnDwelling())) {
						Log("Increased Repl Cost on Dwelling: " + increpcost + "-" + PRP2.ReturnIncreasedReplacementCostOnDwelling());
				}
				if(!lossassessment.equalsIgnoreCase(PRP2.ReturnLossAssessment())) {
						Log("Loss Assessment: " + lossassessment + "-" + PRP2.ReturnLossAssessment());
				}
				if(!ordlaw.equalsIgnoreCase(PRP2.ReturnOrdinanceOrLaw())) {
						Log("Ordinance or Law: " + ordlaw + "-" + PRP2.ReturnOrdinanceOrLaw());
				}
				if(!PRP2.ReturnWaterBackupBasement().contains(waterbackup)) {				
						Log("Water Backup - Basement/Water Backup: "  + waterbackup + " - " + PRP2.ReturnWaterBackupBasement());
				}
				else {
					if(!PRP2.ReturnWaterBackupBasement().contains(basement)) {
							Log("Water Backup - Basement/Basement: "  + basement + "-" + PRP2.ReturnWaterBackupBasement());
					}
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
				Log("========================= End " + casenum + " =========================");
		}
		catch(Exception e) {
				e.printStackTrace();
				GetFailScreenShot(casenum + "-WI_HO3_Error");
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