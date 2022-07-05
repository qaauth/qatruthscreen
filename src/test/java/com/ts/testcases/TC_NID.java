package com.ts.testcases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import com.ts.pageobject.Login;
import com.ts.pageobject.NID;

public class TC_NID extends BaseClass {

	///PAN service is being validated 
	@Test(enabled = true, testName = "PAN card", priority = 1)
	public void PANVerification() throws IOException, InterruptedException 

	{	
		NID getbeforecount= new NID(driver);
		String beforecount= getbeforecount.getPANSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before pan search count=="+beforecount);
		logger.info("got pan search count before search");
		Thread.sleep(100);
		NID panobj= new NID(driver);
		panobj.PAN();	 
		logger.info(" PAN Sample submitted");
		Thread.sleep(100);
		if (panobj.verifyPAN().contains("PAN Number")) {
			Assert.assertTrue(true); 
			logger.info("PAN verification performed successfully!");
		} else {
			logger.info(" PAN verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}

		NID getaftercount= new NID(driver);
		String AfterCount= getaftercount.getPANSearchCount();
		int AfterSearchCount=Integer.parseInt(AfterCount);
		System.out.println("after pan search count=="+AfterSearchCount);
		logger.info("got pan search count after search ");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Pan search count verified successfully");
		} else {
			logger.info("Pan search count NOT verified");
			captureScreen(driver, "Pan search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	///PASSPORT and Passport (with OCR) are exactly similar services
	@Test(enabled =true, testName = "Passport", priority = 2)
	public void PassportVerification() throws InterruptedException, IOException{
		NID beforeSearhCount = new NID(driver);
		String beforecount= beforeSearhCount.getPassportSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before passport search count=="+BeforeSearchCount);
		logger.info("got passport search count before search");
		Thread.sleep(100);
		NID passportobj = new NID(driver);
		passportobj.Passport();
		logger.info("Passport sample submitted");
		Thread.sleep(1000);

		if (passportobj.verifyPassport().contains("Yes, MRZ number is verified")) {
			Assert.assertTrue(true);
			logger.info("Passport verification performed successfully!");
		} else {
			logger.info(" Passport verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		NID afterSearchCount = new NID(driver);
		String AfterCount= afterSearchCount.getPassportSearchCount();
		int AfterSearchCount=Integer.parseInt(AfterCount);
		System.out.println("after passport search count=="+AfterSearchCount);
		logger.info("got pan search count after search ");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Passport search count verified successfully");
		} else {
			logger.info("Passport search count NOT verified");
			captureScreen(driver, "Passport search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	///VOTERID
	@Test(enabled = true, testName = "Voter id", priority = 3)
	public void VoterIdverification() throws InterruptedException, IOException{
		NID beforeSearchCount= new NID(driver);
		String beforecount= beforeSearchCount.getVoterIdSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before voterid  search count=="+BeforeSearchCount);
		logger.info("got voterId search count before search");
		Thread.sleep(100);
		NID voterobj= new NID(driver);
		voterobj.VoterId();
		logger.info("Voter ID sample submitted");
		Thread.sleep(100);
		if (voterobj.verifyvoterid().contains("Voter ID Details")) {
			Assert.assertTrue(true);
			logger.info("Voter id verification performed successfully!");
		} else {
			logger.info(" Voter id verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}	
		NID afterSearchCount= new NID(driver);
		String aftercount= afterSearchCount.getVoterIdSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after voterid  search count=="+AfterSearchCount);
		logger.info("got voterId search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("voterid search count verified successfully");
		} else {
			logger.info("voterid search count NOT verified");
			captureScreen(driver, "voterid search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	///AADHAR 
	@Test(enabled = true, testName = "Aadhar Verification", priority = 4)
	public void AadharVerification() throws InterruptedException, IOException{
		NID beforeSearchCount = new NID(driver);
		String beforecount= beforeSearchCount.getAadharSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before AADHAR  search count=="+BeforeSearchCount);
		logger.info("got ADHAR search count before search");
		Thread.sleep(100);
		NID aadharobj1 = new NID(driver);
		aadharobj1.AadharVerification();
		logger.info("SUBMITTED adhar sample");
		if (aadharobj1.verifyaadhar().contains("Aadhaar Verified Successfully")) {
			Assert.assertTrue(true);
			logger.info(" AAdhar verification performed successfully!");
		} else {
			logger.info(" Aadhar verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Thread.sleep(100);
		NID afterSearchCount = new NID(driver);
		String aftercount= afterSearchCount.getAadharSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after AADHAR  search count=="+AfterSearchCount);
		logger.info("got ADHAR search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("aadhar search count verified successfully");
		} else {
			logger.info("aadhar search count NOT verified");
			captureScreen(driver, "aadhar search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	///DL  verification
	@Test(enabled =true, testName = "DL Verification", priority = 5)
	public void DLVerification() throws InterruptedException, IOException{
		NID beforeSearchCount = new NID(driver);
		String beforecount= beforeSearchCount.getDLSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before DL  verification  search count=="+BeforeSearchCount);
		logger.info("got DL search count before search");
		NID Dl = new NID(driver);
		Dl.DrivingLicenseVerification();
		logger.info("submitted DL sample ");
		Thread.sleep(100);
		if (Dl.verifyDLdetailed().contains("Detail of Driving License")) {
			Assert.assertTrue(true);
			logger.info(" DL verification performed successfully!");
		} else {
			logger.info(" DL verification not performed successfully !");
			captureScreen(driver, "DlVerification");
			Assert.assertTrue(false);
		}
		NID afterSearchCount = new NID(driver);
		String aftercount=  afterSearchCount .getDLSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after DL  verification  search count=="+AfterSearchCount);
		logger.info("got DL search count AFTER search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("DL search count verified successfully");
		} else {
			logger.info("DL search count NOT verified");
			captureScreen(driver, "DL search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	///PAN Name match Verification
	@Test(enabled = true, testName = "PAN Name Verification", priority = 6)
	public void PanNameVerification() throws InterruptedException, IOException{
		NID beforeSearchCount = new NID(driver);
		String beforecount= beforeSearchCount.getPanNameSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before PAN Name  verification  search count=="+BeforeSearchCount);
		logger.info("got pan Name search count before search");
		Thread.sleep(100);
		NID panname = new NID(driver);
		panname.PannameVerification();
		logger.info("submitted PAN sample ");
		Thread.sleep(100);

		if (panname.verifyPanname().contains("Pan Number")) {
			Assert.assertTrue(true);
			logger.info(" Pan name verification performed successfully!");
		} else {
			logger.info(" Pan name verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		NID afterSearchCount = new NID(driver);
		String aftercount=  afterSearchCount .getPanNameSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after PAN Name  verification  search count=="+AfterSearchCount);
		logger.info("got pan Name search count AFTER search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Pan Name search count verified successfully");
		} else {
			logger.info("Pan Name search count NOT verified");
			captureScreen(driver, "Pan Name search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	///PAN ITD status //
	@Test(enabled = true, testName = "PAN ITD Verification", priority = 7)
	public void PanITDVerification() throws InterruptedException, IOException{
		NID beforeSearchCount = new NID(driver);
		String beforecount= beforeSearchCount.getPanITDSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before PAN ITD  verification  search count=="+BeforeSearchCount);
		logger.info("got pan Itd search count before search");
		Thread.sleep(100);
		NID panITD = new NID(driver);
		panITD.PanITDVerification();
		logger.info("submitted PAN ITD sample ");
		Thread.sleep(100);

		if (panITD.verifyPanITD().contains("Name")) {
			Assert.assertTrue(true);
			logger.info(" Pan ITD verification performed successfully!");
		} else {
			logger.info(" Pan ITD verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		NID afterSearchCount = new NID(driver);
		String aftercount=afterSearchCount.getPanITDSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after PAN ITD  verification  search count=="+AfterSearchCount);
		logger.info("got pan Itd search count AFTER search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Pan Itd search count verified successfully");
		} else {
			logger.info("Pan Itd search count NOT verified");
			captureScreen(driver, "Pan Itd search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	///E Aadhar upload Verification //techanical error
	@Test(enabled = false, testName = "E aadhar Verification", priority = 8)//
	public void Eaadharverification() throws InterruptedException, IOException{
		NID beforeSearchCount = new NID(driver);
		String beforecount= beforeSearchCount.getEAadharSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before E Aadhar  verification  search count=="+BeforeSearchCount);
		logger.info("got E-Aadhar search count before search");
		NID eaadhar = new NID(driver);
		eaadhar.EaadharVerification((System.getProperty("user.dir") + "/documents/sampleaadhar.pdf"));//
		logger.info("submitted E Aadhar sample ");
		Thread.sleep(100);
		if (eaadhar.verifyeaadhar().contains("Aadhaar Verified Successfully")) 
		{
			Assert.assertTrue(true);
			logger.info(" E aadhar verification performed successfully!");
		} else {
			logger.info(" E aadhar verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		NID afterSearchCount = new NID(driver);
		String aftercount= afterSearchCount.getEAadharSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after E Aadhar  verification  search count=="+AfterSearchCount);
		logger.info("got E-Aadhar search count AFTER search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("E-ADHAR search count verified successfully");
		} else {
			logger.info("E-ADHAR search count NOT verified");
			captureScreen(driver, "E-ADHAR search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	/// PAN NAME DOB MATCH
	@Test(enabled = true, testName = "Pan Name Dob Verification", priority = 9)
	public void pannamedob() throws InterruptedException, IOException{
		NID beforeSearchCount = new NID(driver);
		String beforecount= beforeSearchCount.getPanNameDOBSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		logger.info("got Pan Name DOB search count before search");
		System.out.println(" pan name dob before search count=="+BeforeSearchCount);
		Thread.sleep(100);
		NID pannamedob = new NID(driver);
		pannamedob.PannamedobVerification();
		logger.info("submitted Pan name DOB sample ");
		Thread.sleep(100);
		if (pannamedob.verifypannamedob().contains("Status of PAN")) 
		{
			Assert.assertTrue(true);
			logger.info(" Pan Name Dob verification performed successfully!");
		} else {
			logger.info(" Pan Name Dob verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		NID afterSearchCount = new NID(driver);
		String aftercount= afterSearchCount.getPanNameDOBSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		logger.info("got Pan Name DOB search count AFTER search");
		System.out.println(" pan name dob after search count=="+AfterSearchCount);
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Pan Name DOB search count verified successfully");
		} else {
			logger.info("Pan Name DOB search count NOT verified");
			captureScreen(driver, "Pan Name DOB search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	///PAN AAdhar Seeding
	@Test(enabled = true, testName = "Pan Aadhar Seeding Verification", priority = 10)
	public void panaadhar() throws InterruptedException, IOException{
		NID beforeSearchCount = new NID(driver);
		String beforecount= beforeSearchCount.getPanAadharSeedingSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		logger.info("got Pan aadhar seeding search count before search");
		System.out.println(" pan adhar seeding before count=="+BeforeSearchCount);
		NID panaadhar = new NID(driver);
		panaadhar.PanaadharVerification();
		logger.info("submitted Pan Aadhar seeding sample ");
		Thread.sleep(100);
		if (panaadhar.verifyPanaadhar().contains("PAN Number")) 
		{
			Assert.assertTrue(true);
			logger.info(" Pan AAdhar seeding verification performed successfully!");
		} 
		else {
			logger.info(" Pan aadhar seeding verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		NID afterSearchCount = new NID(driver);
		String aftercount= afterSearchCount.getPanAadharSeedingSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		logger.info("got Pan aadhar seeding search count AFTER search");
		System.out.println(" pan adhar seeding after count=="+AfterSearchCount);
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Pan aadhar seeding search count verified successfully");
		} else {
			logger.info("Pan aadhar seeding search count NOT verified");
			captureScreen(driver, "Pan aadhar seeding search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	///Passport Verification Using File Number
	@Test(enabled = true, testName = "Passport Verification Using File Number", priority = 11)
	public void passportfile() throws InterruptedException, IOException{
		NID beforeSearchCount = new NID(driver);
		String beforecount=beforeSearchCount.getPassportVerificationUsingFileNumSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Passport Verification verification  search count=="+BeforeSearchCount);
		logger.info("got Passportverification using file num search count before search");
		NID fileno = new NID(driver);
		fileno.PassportFileVerification();
		logger.info("submitted Passport verification using file num sample ");
		Thread.sleep(100);
		if (fileno.verifyPassportfile().contains("Passport No")) 
		{
			Assert.assertTrue(true);
			logger.info("Passport Verification Using File Number verification performed successfully!");
		} else {
			logger.info("Passport Verification Using File Number verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		NID afterSearchCount = new NID(driver);
		String aftercount=afterSearchCount.getPassportVerificationUsingFileNumSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Passport Verification verification  search count=="+AfterSearchCount);
		logger.info("got Passportverification using file num search count AFTER search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Passport Verification Using File Number search count verified successfully");
		} else {
			logger.info("Passport Verification Using File Number search count NOT verified");
			captureScreen(driver, "Passport Verification Using File Number search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	///ckyc verification
	@Test(enabled = true, testName = "CKYC Verification", priority = 12)
	public void ckycVerify() throws InterruptedException, IOException{
		NID beforeSearchCount = new NID(driver);
		String beforecount=beforeSearchCount.getCKYCsearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before ckyc verification verification  search count=="+BeforeSearchCount);
		logger.info("got ckyc verify search count before search");
		NID ob = new NID(driver);
		ob.ckycVerification();
		logger.info("submitted ckyc sample ");
		Thread.sleep(100);
		if (ob.verifyCkycSuccessMsg() .contains("CKYC application status")) {
			Assert.assertTrue(true);
			logger.info("ckyc verification performed successfully!");
		} else {
			logger.info("ckyc verification not performed successfully !");
			captureScreen(driver, "ckycVerification");
			Assert.assertTrue(false);
		}
		NID afterSearchCount = new NID(driver);
		String aftercount=afterSearchCount.getCKYCsearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after ckyc verification verification  search count=="+AfterSearchCount);
		logger.info("got ckyc search count AFTER search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("ckyc verification search count verified successfully");
		} else {
			logger.info("ckyc verification search count NOT verified");
			captureScreen(driver, "ckyc verification search count NOT verified");
			Assert.assertTrue(false);
		}
	}
	///Aadhar masking
	@Test(enabled = true, testName = "Aadhar masking", priority = 13)
	public void AdhaarMasking() throws InterruptedException, IOException {
		NID beforeSearchCount = new NID(driver);
		String beforecount=beforeSearchCount.getAdhaarMaskingsearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Aadhar masking verification  search count=="+BeforeSearchCount);
		logger.info("got adhaar masking search count before search");
		NID ob = new NID(driver);
		ob.adhaarMasking();
		logger.info("submitted Aadhar Sample for masking");
		Thread.sleep(100);
		if (ob.verifyAdhaarMaskingSuccessMsg().contains("Aadhaar Masked Successfully")) {
			Assert.assertTrue(true);
			logger.info("Aadhar masking verification performed successfully!");
		} else {
			logger.info("Aadhar masking verification not performed successfully !");
			captureScreen(driver, "AadharmaskingVerification");
			Assert.assertTrue(false);
		}
		NID afterSearchCount = new NID(driver);
		String aftercount=afterSearchCount.getAdhaarMaskingsearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Aadhar masking verification  search count=="+AfterSearchCount);
		logger.info("got Aadhar masking search count AFTER verification");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Aadhar masking search count verified successfully");
		} else {
			logger.info("Aadhar masking search count NOT verified");
			captureScreen(driver, "Aadhar masking search count NOT verified");
			Assert.assertTrue(false);
		}
	}


	///Advance Pan Verification//(Technical error)
	@Test(enabled = false, testName = "Advance PAN Card verification", priority = 14)
	public void AdvancePANVerification() throws IOException, InterruptedException 
	{	
		NID nid= new NID(driver);
		String beforecount= nid.getAdvPanSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before advance pan search count=="+BeforeSearchCount);
		logger.info("got pan search count before search");
		Thread.sleep(100);
		nid.AdvancePAN();	 
		logger.info(" PAN Sample submitted");
		Thread.sleep(100);
		if (nid.verifyAdvPAN().contains("Applicant Full Name")) {
			Assert.assertTrue(true); 
			logger.info("Advance PAN verification performed successfully!");
		} else {
			logger.info(" Advance PAN verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		NID getaftercount= new NID(driver);
		String afterCount= getaftercount.getAdvPanSearchCount();
		int AfterSearchCount=Integer.parseInt(afterCount);
		System.out.println("after advance pan search count=="+AfterSearchCount);
		logger.info("got advance pan search count after search ");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Advance Pan search count verified successfully");
		} else {
			logger.info("Advance Pan search count NOT verified");
			captureScreen(driver, "Advance Pan search count NOT verified");
			Assert.assertTrue(false);
		}	
	}


	///EPFO Employer Advance Verification//not present in live
	@Test(enabled = false, testName = "EPFO Employer Advance Verification", priority = 15)
	public void EPFOEmployerAdvanceVerification() throws IOException, InterruptedException 
	{	

		NID nid= new NID(driver);
		String beforecount= nid.getEPFOEmployerAdvancedCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before EPFO Employer Advance search count=="+BeforeSearchCount);
		logger.info("got EPFO Employer Advance search count before search");
		Thread.sleep(100);
		nid.EPFOEmployerAdvanced();	 
		logger.info(" EPFO Employer Advance Sample submitted");
		Thread.sleep(100);
		if (nid.verifyEPFOAdvanceDetaiMsg().contains("Company Name")) {
			Assert.assertTrue(true); 
			logger.info("EPFO Employer Advance verification done successfully!");
		} else {
			logger.info(" EPFO Employer Advance verification not done successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		NID getaftercount= new NID(driver);
		String afterCount= getaftercount.getEPFOEmployerAdvancedCount();
		int AfterSearchCount=Integer.parseInt(afterCount);
		System.out.println("after EPFO Employer Advance search count=="+AfterSearchCount);
		logger.info("got EPFO Employer Advance search count after search ");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("EPFO Employer Advance search count verified successfully");
		} else {
			logger.info("EPFO Employer Advance search count NOT verified");
			captureScreen(driver, "EPFO Employer Advance search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	///property tax verification//newly added
	@Test(enabled = true, testName = "Property tax", priority = 16)
	public void PropertyTaxVerification() throws IOException, InterruptedException {	
		NID nid= new NID(driver);
		String beforecount= nid.getPropertyTaxSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Property tax search count=="+BeforeSearchCount);
		logger.info("got Property tax count before search");
		Thread.sleep(100);
		nid.PropertytaxVerification();	 
		logger.info(" property tax Sample submitted");
		Thread.sleep(100);
		if (nid.verifyPropertyTaxverificationMsg().contains("Owner Name")) {
			Assert.assertTrue(true); 
			logger.info("property tax verification done successfully!");
		} else {
			logger.info(" property tax verification not done successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		NID getaftercount= new NID(driver);
		String afterCount= getaftercount.getPropertyTaxSearchCount();
		int AfterSearchCount=Integer.parseInt(afterCount);
		System.out.println("after Property tax search count=="+AfterSearchCount);
		logger.info("got Property tax count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("property tax search count verified successfully");
		} else {
			logger.info("property tax search count NOT verified");
			captureScreen(driver, "property tax search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	///Epan verification//Newly added
	@Test(enabled = true, testName = "Property tax", priority = 17)
	public void EpanVerification() throws IOException, InterruptedException {	
		NID nid= new NID(driver);
		String beforecount= nid.getEpanSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before E-pan search count=="+BeforeSearchCount);
		logger.info("got E-pan count before search");
		Thread.sleep(100);
		nid.EpanVerification();	 
		logger.info("E-pan Sample submitted");
		Thread.sleep(100);
		if (nid.verifyEpanverificationMsg().contains("VERT FINANCE PRIVATE LIMITED")) {
			Assert.assertTrue(true); 
			logger.info("E-pan verification done successfully!");
		} else {
			logger.info("E-pan verification not done successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		NID getaftercount= new NID(driver);
		String afterCount= getaftercount.getEpanSearchCount();
		int AfterSearchCount=Integer.parseInt(afterCount);
		System.out.println("after E-pan search count=="+AfterSearchCount);
		logger.info("got E-pan search count after search ");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("E-pan search count verified successfully");
		} else {
			logger.info("E-pan search count NOT verified");
			captureScreen(driver, "E-pan search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

}


