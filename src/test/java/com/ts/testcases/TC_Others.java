package com.ts.testcases;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ts.pageobject.Bank;
import com.ts.pageobject.Login;
import com.ts.pageobject.NID;
import com.ts.pageobject.Others;


public class TC_Others extends BaseClass {

	//Email and Phone Verification (search count remains same even after verification )
	@Test(enabled =true, testName = "E-mail & Phone", priority = 1)
	public void Email_PhoneVerification() throws IOException, InterruptedException 
	{	
		Others getbeforecount= new  Others(driver);
		String beforecount= getbeforecount.getEmailPhoneSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before E-mail & Phone Verify search count=="+BeforeSearchCount);
		logger.info("got E-mail & Phone verification search count before search");
		Thread.sleep(100);
		Others xyz= new Others(driver);
		xyz.EmailPhoneVerification();	 
		logger.info("Email & Phone Sample submitted");
		if (xyz.verifyEmailPhoneverification().contains("Your email varification process has been successfuly initiated.")) {
			Assert.assertTrue(true);
			logger.info("Email & Phone verification initiated successfully!");
		} else {
			logger.info("Email & Phone verification not initiated successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Others getaftercount= new  Others(driver);
		String aftercount= getaftercount.getEmailPhoneSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after E-mail & Phone search count=="+AfterSearchCount);
		logger.info("got E-mail & Phone verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("E-mail & Phone verification search count verified successfully");
		} else 
		{
			logger.info("E-mail & Phone verification search count NOT verified");
			captureScreen(driver, "E-mail & Phone verification  search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	//Name/ Address Match
	@Test(enabled = true, testName = "Name/Address Match", priority = 1)
	public void NameMatch() throws IOException, InterruptedException 
	{	
		Others getbeforecount= new  Others(driver);
		String beforecount= getbeforecount.getNameMatchSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Name Match Verify search count=="+BeforeSearchCount);
		logger.info("got Name Match verification search count before search");
		Thread.sleep(100);
		Others xyz= new Others(driver);
		xyz.NameMatchVerification();	 
		logger.info("Name Match Sample submitted");
		if (xyz.verifyNameeverification().contains("The match score is 69.152%")) {
			Assert.assertTrue(true);
			logger.info("Name Match verification initiated successfully!");
		} else {
			logger.info("Name Match verification not initiated successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Others getaftercount= new  Others(driver);
		String aftercount= getaftercount.getNameMatchSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Name Match search count=="+AfterSearchCount);
		logger.info("got Name Match verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Name Match verification search count verified successfully");
		} else 
		{
			logger.info("Name Match verification search count NOT verified");
			captureScreen(driver, "Name Match verification  search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	//Face API Verification
	@Test(enabled = true, testName = "Face API Verification", priority = 1)
	public void FaceMatch() throws IOException, InterruptedException 
	{	
		Others getbeforecount= new  Others(driver);
		String beforecount= getbeforecount.getFaceMatchSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Face Match Verify search count=="+BeforeSearchCount);
		logger.info("got Face Matchverification search count before search");
		Thread.sleep(100);
		Others xyz= new Others(driver);
		xyz.FaceMatchVerification();	 
		logger.info("Face Match Sample submitted");
		if (xyz.verifyFaceverification().contains("FACE MATCH DETAILS")) {
			Assert.assertTrue(true);
			logger.info("Face Match verification initiated successfully!");
		} else {
			logger.info("Face Match verification not initiated successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Others getaftercount= new  Others(driver);
		String aftercount= getaftercount.getFaceMatchSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Face Match search count=="+AfterSearchCount);
		logger.info("got Face Match verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Face Matchverification search count verified successfully");
		} else 
		{
			logger.info("Face Match verification search count NOT verified");
			captureScreen(driver, "Face Matchverification  search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	//E-Mail Verification
	@Test(enabled = true, testName = "E-mail Verification", priority = 1)
	public void EMail() throws IOException, InterruptedException 
	{	
		Others getbeforecount= new  Others(driver);
		String beforecount= getbeforecount.getEmailVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before E-mail Verify search count=="+BeforeSearchCount);
		logger.info("got E-mail verification search count before search");
		Thread.sleep(100);
		Others xyz= new Others(driver);
		xyz.Email_Verification();	 
		logger.info("E-mail Sample submitted");
		if (xyz.verifymailverification().contains("Email address is verified.")) {
			Assert.assertTrue(true);
			logger.info("E-mail  verification Done successfully!");
		} else {
			logger.info("E- mail verification not Done successfully/Email address not verified !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Others getaftercount= new  Others(driver);
		String aftercount= getaftercount.getEmailVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after E-mail search count=="+AfterSearchCount);
		logger.info("got E-mail verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("E-mail verification search count verified successfully");
		} else 
		{
			logger.info("E-mail verification search count NOT verified");
			captureScreen(driver, "E-mail verification search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	//Advanced Email Verification 
	@Test(enabled = true, testName = "Advance E-mail Verification", priority = 1)
	public void AdvanceEMailVerification() throws IOException, InterruptedException 
	{	
		Others getbeforecount= new  Others(driver);
		String beforecount= getbeforecount.getAdvanceEmailVerificationSerachCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Advance E-mail Verify search count=="+BeforeSearchCount);
		logger.info("got Advance E-mail verification search count before search");
		Thread.sleep(100);
		Others xyz= new Others(driver);
		xyz.AdavnceEmailVerification();	 
		logger.info("Advance E-mail Sample submitted");
		if (xyz.AdvanceEmailVerificationSuccessMsg().contains("Details found successfully")) {
			Assert.assertTrue(true);
			logger.info("Advance E-mail  verification Done successfully!");
		} else {
			logger.info("Advance E- mail verification not Done successfully/Unsuccessful");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Others getaftercount= new  Others(driver);
		String aftercount= getaftercount.getAdvanceEmailVerificationSerachCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Advance E-mail search count=="+AfterSearchCount);
		logger.info("got Advance E-mail verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Advance E-mail verification search count verified successfully");
		} else 
		{
			logger.info("Advance E-mail verification search count NOT verified");
			captureScreen(driver, "Advance E-mail verification search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	//Liveness Verification 
	@Test(enabled = true, testName = "Liveness Verification", priority = 1)
	public void LivenessVerification() throws IOException, InterruptedException 
	{	
		Others getbeforecount= new  Others(driver);
		String beforecount= getbeforecount.livenessSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Liveness Verify search count=="+BeforeSearchCount);
		logger.info("got Liveness  verification search count before search");
		Thread.sleep(100);
		Others xyz= new Others(driver);
		xyz.livenessVerification();	 
		logger.info("Liveness  Sample submitted");
		if (xyz.verifyLivenessSuccessMsg().contains("FACE MATCH DETAILS")) {
			Assert.assertTrue(true);
			logger.info("Liveness  verification Done successfully!");
		} else {
			logger.info("Liveness  verification not Done successfully");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Others getaftercount= new  Others(driver);
		String aftercount= getaftercount.livenessSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Liveness verification search count=="+AfterSearchCount);
		logger.info("got Liveness verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Liveness  verification search count verified successfully");
		} else 
		{
			logger.info("Liveness verification search count NOT verified");
			captureScreen(driver, "Liveness verification search count NOT verified");
			Assert.assertTrue(false);
		}	
	}
	//Advance Name/Address match
	@Test(enabled = true, testName = "Advance Name/Add Match", priority = 1)
	public void AdvNameAddressMatch() throws IOException, InterruptedException 
	{
		Others getbeforecount= new  Others(driver);
		String beforecount= getbeforecount.AdvNameAddressMatchSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Advance Name/Address match Verify search count=="+BeforeSearchCount);
		logger.info("got Advance Name/Address match verification search count before search");
		Thread.sleep(100);
		Others xyz= new Others(driver);
		xyz.advanceNameAddressMatchVerification();	 
		logger.info("Advance Name/Address match Sample submitted");
		if (xyz.verifyAdvNameAddMatchSuccessMsg().contains("Level 1 match score: 0.0%")) {
			Assert.assertTrue(true);
			logger.info("Advance Name/Address match verification Done successfully!");
		} else {
			logger.info("Advance Name/Address match  verification not Done successfully");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Others getaftercount= new  Others(driver);
		String aftercount= getaftercount.AdvNameAddressMatchSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Advance Name/Address match verification search count=="+AfterSearchCount);
		logger.info("got Advance Name/Address match verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Advance Name/Address match  verification search count verified successfully");
		} else 
		{
			logger.info("Advance Name/Address match verification search count NOT verified");
			captureScreen(driver, "Advance Name/Address match verification search count NOT verified");
			Assert.assertTrue(false);
		}	
	}
	//Doc classification
	@Test(enabled = true, testName = "Document classification", priority = 1)
	public void DocumentClassification() throws IOException, InterruptedException 
	{
		Others getbeforecount= new  Others(driver);
		String beforecount= getbeforecount.DocClassificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Document classification Verify search count=="+BeforeSearchCount);
		logger.info("got Document classification verification search count before search");
		Thread.sleep(100);
		Others xyz= new Others(driver);
		xyz.docClassificationVerification();	 
		logger.info("Document classification Sample submitted");
		if (xyz.verifyDocClassificationSuccessMsg().contains("Correct document uploaded")) {
			Assert.assertTrue(true);
			logger.info("Document classification verification Done successfully!");
		} else {
			logger.info("Document classification  verification not Done successfully");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Others getaftercount= new  Others(driver);
		String aftercount= getaftercount.DocClassificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Document classification verification search count=="+AfterSearchCount);
		logger.info("got Document classification verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Document classification  verification search count verified successfully");
		} else 
		{
			logger.info("Document classification verification search count NOT verified");
			captureScreen(driver, "Document classification verification search count NOT verified");
			Assert.assertTrue(false);
		}	
	}
	//COWIN link Generation
	@Test(enabled = true, testName = "cowin Link Generation", priority = 1)
	public void cowinLinkGeneration() throws IOException, InterruptedException {
		Others getbeforecount= new  Others(driver);
		String beforecount= getbeforecount.cowinLinkGenerationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before cowin Link Generation Verify search count=="+BeforeSearchCount);
		logger.info("got cowin Link Generation verification search count before search");
		Thread.sleep(100);
		File folder = new File("/home/rohit.singh/Downloads");
		File fListInitial[] = folder.listFiles();
		int initialNumberOfPDFs = fListInitial.length;
		Others xyz= new Others(driver);
		xyz.cowinLinkGenerate();	 
		logger.info("cowin Link Generation Sample submitted");
		Thread.sleep(7000);
		File fListFinal[] = folder.listFiles();
		if (initialNumberOfPDFs + 1== fListFinal.length) {
			Assert.assertTrue(true);
			logger.info("cowin Link Generation verification Done successfully!");
		} else {
			logger.info("cowin Link Generation  verification not Done successfully");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Others getaftercount= new  Others(driver);
		String aftercount= getaftercount.cowinLinkGenerationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after cowin Link Generation verification search count=="+AfterSearchCount);
		logger.info("got cowin Link Generation verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("cowin Link Generation  verification search count verified successfully");
		} else 
		{
			logger.info("cowin Link Generation verification search count NOT verified");
			captureScreen(driver, "cowin Link Generation verification search count NOT verified");
			Assert.assertTrue(false);
		}	
	}
	//Basic Email Verification
	@Test(enabled = true, testName = "Basic Email Verification", priority = 1)
	public void basicEmailVerification() throws IOException, InterruptedException {
		Others getbeforecount= new  Others(driver);
		String beforecount= getbeforecount.basicEmailVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		logger.info("got Basic Email search count before verification");
		Thread.sleep(100);
		Others xyz= new Others(driver);
		xyz.submitEmailSample();	 
		logger.info("Basic Email Sample submitted");
		if (xyz.basicEmailVerificationSuccessMsg().contains("Your email verification process has been successfully initiated.")) {
			Assert.assertTrue(true);
			logger.info("Basic Email verification Done successfully!");
		} else {
			logger.info("Basic Email verification not Done successfully");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Others getaftercount= new  Others(driver);
		String aftercount= getaftercount.basicEmailVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		logger.info("got Basic Email search count after verification");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Basic Email verification search count verified successfully");
		} else {
			logger.info("Basic Email verification search count NOT verified");
			captureScreen(driver, "Basic Email verification search count NOT verified");
			Assert.assertTrue(false);
		}	
	}
	//PEP verification//new added service
	@Test(enabled = true, testName = "PEP verification", priority = 1)//
	public void PEPverification() throws IOException, InterruptedException {

		Others others = new Others(driver);
		String beforecount = others.getPEPsearchCount();
		int BeforeSearchCount = Integer.parseInt(beforecount);
		System.out.println("before PEP search count=="+ BeforeSearchCount);
		logger.info("got PEP search count before search");
		Thread.sleep(100);
		others.PEP_search();	 
		logger.info("PEP Sample submitted");
		if (others.verifyPEPop().contains("India Rajya Sabha")) {
			Assert.assertTrue(true);
			logger.info("PEP  verification Done successfully!");
		} else {
			logger.info("PEP not verified !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}  
		Others getaftercount= new Others(driver);
		String Aftercount = getaftercount.getPEPsearchCount();
		int AfterSearchCount = Integer.parseInt(Aftercount);
		System.out.println("after PEP search count=="+AfterSearchCount);
		logger.info("got PEP search count after search");
		Thread.sleep(2000);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("PEP search count verified successfully");
		} else {
			logger.info("PEP search count not verified");
			captureScreen(driver, "PEP search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	//Employement Check EPFO//newly added services//service not available on live
	@Test(enabled = false, testName = "Employement Check EPFO", priority = 1)
	public void EmployementCheckEPFOverification() throws IOException, InterruptedException {

		Others others = new Others(driver);
		String beforecount = others.getEmployementcheckEPFO();
		int BeforeSearchCount = Integer.parseInt(beforecount);
		System.out.println("before Employement Check EPFO search count=="+ BeforeSearchCount);
		logger.info("got Employement Check EPFO search count before search");
		Thread.sleep(100);
		others.Employementcheck();	 
		logger.info("Employement Check EPFO Sample submitted");
		if (others.verifyEmployementcheck().contains("EPFO Verification Successfully done.")) {	
			Assert.assertTrue(true);
			logger.info("Employement Check EPFO verification Done successfully!");
			if(others.verifyObservationCheck().contains("Rohit singh has been reported by AUTHBRIDGE RESEARCH SERVICES PVT. LTD. in the returns filed with EPF for the latest month of JAN-22 for Establishment ID GNGGN0028812000.")) {
				Assert.assertTrue(true);
				logger.info("Observation verification Done successfully!");
			}
		} else {
			logger.info("Employement Check EPFO not verified !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}  
		Others getaftercount= new Others(driver);
		String Aftercount = getaftercount.getEmployementcheckEPFO();
		int AfterSearchCount = Integer.parseInt(Aftercount);
		System.out.println("after Employement Check EPFO search count=="+AfterSearchCount);
		logger.info("got Employement Check EPFO search count after search");
		Thread.sleep(2000);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Employement Check EPFO search count verified successfully");
		} else {
			logger.info("Employement Check EPFO search count not verified");
			captureScreen(driver, "Employement Check EPFO search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	//Comprehensive email verification//
	@Test(enabled = true, testName = "Comprehensive email verification", priority = 1)
	public void ComprehensiveEmailverification() throws IOException, InterruptedException {

		Others others = new Others(driver);
		String beforecount = others.getComprehensiveEmailCount();
		int BeforeSearchCount = Integer.parseInt(beforecount);
		System.out.println("before Comprehensive Email search count=="+ BeforeSearchCount);
		logger.info("got Comprehensive Email search count before search");
		Thread.sleep(100);
		others.ComprehensiveEmail();	 
		logger.info("Comprehensive Email Sample submitted");
		if (others.verifyComprehensiveEmail().contains("Valid")) {
			Assert.assertTrue(true);
			logger.info("DOMAIN VERIFICATION STATUS verification Done successfully!");
			if(others.verifyRegisteredEmailID().contains("ajay.trehan@authbridge.com")) {
				Assert.assertTrue(true);
				logger.info("Registered Email ID verification Done successfully!");
			}
		} else {
			logger.info("Comprehensive Email not verified !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}  
		Others getaftercount= new Others(driver);
		String Aftercount = getaftercount.getComprehensiveEmailCount();
		int AfterSearchCount = Integer.parseInt(Aftercount);
		System.out.println("after Comprehensive Email search count=="+AfterSearchCount);
		logger.info("got Comprehensive Email search count after search");
		Thread.sleep(2000);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Comprehensive Email search count verified successfully");
		} else {
			logger.info("Comprehensive Email search count not verified");
			captureScreen(driver, "Comprehensive Email search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	//New Doc classification verification
	@Test(enabled = true, testName = "New Doc Classification", priority = 1)
	public void NewDocClassificationVerification() throws IOException, InterruptedException {	
		Others others = new Others(driver);
		String beforecount= others.getnewDocClassificationCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before New Doc Classification search count=="+BeforeSearchCount);
		logger.info("got New Doc Classification count before search");
		Thread.sleep(100);
		others.NewdocClassification();	 
		logger.info("New Doc Classification sample submitted");
		Thread.sleep(1000);
		if (others.verifyNewdocClassificationMsg().contains("98.0")) {
			Assert.assertTrue(true); 
			logger.info("New Doc Classification done successfully!");
		} else {
			logger.info("New Doc Classification not done successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Others others2 = new Others(driver);
		String afterCount= others2.getnewDocClassificationCount();
		int AfterSearchCount=Integer.parseInt(afterCount);
		System.out.println("after New Doc Classification search count=="+AfterSearchCount);
		logger.info("got New Doc Classification search count after search ");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("New Doc Classification search count verified successfully");
		} else {
			logger.info("New Doc Classification search count NOT verified");
			captureScreen(driver, "New Doc Classification search count NOT verified");
			Assert.assertTrue(false);
		}	
	}
	
	//Domain Verification
	@Test(enabled = true, testName = "Domain Verification", priority = 1)
	public void DomainVerification() throws IOException, InterruptedException {	
		Others others = new Others(driver);
		String beforecount= others.getDomainSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Domain Verification search count=="+BeforeSearchCount);
		logger.info("got Domain Verification count before search");
		Thread.sleep(100);
		others.DomainSearch();	 
		logger.info("Domain Verification sample submitted");
		Thread.sleep(1000);
		if (others.domainVerificationMsg().contains("GoDaddy.com, LLC")) {
			Assert.assertTrue(true); 
			logger.info("Domain Verification done successfully!");
		} else {
			logger.info("Domain Verification not done successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Others others1 = new Others(driver);
		String afterCount= others1.getDomainSearchCount();
		int AfterSearchCount=Integer.parseInt(afterCount);
		System.out.println("after Domain Verification search count=="+AfterSearchCount);
		logger.info("got Domain Verification search count after search ");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Domain Verification search count verified successfully");
		} else {
			logger.info("Domain Verification search count NOT verified");
			captureScreen(driver, "Domain Verification search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

}


