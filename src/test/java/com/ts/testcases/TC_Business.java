package com.ts.testcases;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ts.pageobject.Business;
import com.ts.pageobject.Login;
import com.ts.pageobject.Professionals;


public class TC_Business extends BaseClass{

	// Test Case for DIN Verification
	@Test(enabled = true, testName = "DIN", priority = 1)
	public void DINverification() throws IOException, InterruptedException 
	{	
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getDinVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before DIN Verif search count=="+BeforeSearchCount);
		logger.info("got DIN verification search count before search");
		Thread.sleep(100); 
		Business dinobj= new Business(driver);
		dinobj.DIN();	 
		logger.info("Din Sample submitted");
		if (dinobj.verifyDin().contains("NAME")) {
			Assert.assertTrue(true);
			logger.info("DIN verification performed successfully!");
		} else {
			logger.info(" DIN verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getDinVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after DIN search count=="+AfterSearchCount);
		logger.info("got DIN search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("DIN verification search count verified successfully");
		} else 
		{
			logger.info("DIN verification search count NOT verified");
			captureScreen(driver, "DIN verification  search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	//Test Case for CIN Verification
	@Test(enabled = true, testName = "CIN", priority = 1)
	public void CINVerification() throws IOException, InterruptedException 
	{	
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getCinVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before CIN Verif search count=="+BeforeSearchCount);
		logger.info("got CINverification search count before search");
		Thread.sleep(100);
		Business cinobj= new Business(driver);
		cinobj.CIN();
		logger.info("Cin Sample submitted");
		if (cinobj.verifyCin().contains("COMPANY DETAILS")) {
			Assert.assertTrue(true);
			logger.info("CIN verification performed successfully!");
		} else {
			logger.info(" CIN verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getCinVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after CIN search count=="+AfterSearchCount);
		logger.info("got CIN search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("CINverification search count verified successfully");
		} else 
		{
			logger.info("CIN verification search count NOT verified");
			captureScreen(driver, "CIN verification  search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	//Test Case for TIN Verification ( Service removed from live)
	@Test(enabled =false, testName = "TIN", priority = 1)//
	public void TINVerification() throws IOException, InterruptedException 
	{	
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getTinVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before TIN Verif search count=="+BeforeSearchCount);
		logger.info("got TIN verification search count before search");
		Thread.sleep(100);
		Business tinobj= new Business(driver);
		tinobj.TIN();	 
		logger.info("Sample submitted");
		if (tinobj.verifyCin().contains("")) {
			Assert.assertTrue(true);
			logger.info("TIN verification performed successfully!");
		} else {
			logger.info(" TIN verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getTinVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after TIN search count=="+AfterSearchCount);
		logger.info("got TIN search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("TIN verification search count verified successfully");
		} else 
		{
			logger.info("TIN verification search count NOT verified");
			captureScreen(driver, "TIN verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}
	//Test Case for Service Tax Verification (Service removed from live)
	@Test(enabled = false, testName = "Service Tax", priority = 1)//
	public void ServiceTaxVerification() throws IOException, InterruptedException 
	{	
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getTinVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Service Tax  Verif search count=="+BeforeSearchCount);
		logger.info("got Service Tax verification search count before search");
		Thread.sleep(100);
		Business servicetaxobj= new Business(driver);
		servicetaxobj.ServiceTax();	 
		logger.info("Sample submitted");
		if (servicetaxobj.verifyServiceTax().contains("")) {
			Assert.assertTrue(true);
			logger.info("Service tax verification performed successfully!");
		} else {
			logger.info(" Service tax verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getTinVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Service Tax  search count=="+AfterSearchCount);
		logger.info("got Service Tax  search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Service Tax  verification search count verified successfully");
		} else 
		{
			logger.info("Service Tax verification search count NOT verified");
			captureScreen(driver, "Service Tax  verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}
	//Test Case for Shop N Establishment Verification
	@Test(enabled = true, testName = "Shop n Establishement", priority = 1)
	public void ShopNEstablishementVerification() throws IOException, InterruptedException 
	{
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getShopnEstablishmentSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Shop N Establishment Verif search count=="+BeforeSearchCount);
		logger.info("got Shop N Establishment verification search count before search");
		Thread.sleep(100);
		Business shopnestablishementobj= new Business(driver);
		shopnestablishementobj.ShopNEstablishement();	 
		logger.info("Shop n establishement Sample submitted");
		if (shopnestablishementobj.verifyShopnestablishement().contains("Shop ID")) {
			Assert.assertTrue(true);
			logger.info("Shop n Establishement verification performed successfully!");
		} else {
			logger.info("Shop n Establishement  not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getShopnEstablishmentSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Shop N Establishment  search count=="+AfterSearchCount);
		logger.info("got Shop N Establishment  search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Shop N Establishment  verification search count verified successfully");
		} else 
		{
			logger.info("Shop N Establishment verification search count NOT verified");
			captureScreen(driver, "Shop N Establishment  verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	//Test Case for Drug License Verification
	@Test(enabled = true, testName = "Drug License", priority = 1)
	public void DruglicenseVerification() throws IOException, InterruptedException 
	{	
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getDrugLicenseVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Drug License Verif search count=="+BeforeSearchCount);
		logger.info("got Drug License verification search count before search");
		Thread.sleep(100);
		Business drugobj= new Business(driver);
		drugobj.DrugLicense();
		logger.info("Drug License Sample submitted");
		if (drugobj.VerifyDrugLicense().contains("License Number")) {
			Assert.assertTrue(true);
			logger.info("Drug License verification performed successfully!");
		} else {
			logger.info("Drug License verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getDrugLicenseVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Drug License  search count=="+AfterSearchCount);
		logger.info("got Drug License  search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Drug License verification search count verified successfully");
		} else 
		{
			logger.info("Drug License verification search count NOT verified");
			captureScreen(driver, "Drug License verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	//Test Case for Udyog AAdhaar Verification 			  
	@Test(enabled = true, testName = "Udyog Adhar", priority = 1)
	public void UdyogAdharVerification() throws IOException, InterruptedException 
	{	
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getUdyogAadharVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Udyog Adhar Verif search count=="+BeforeSearchCount);
		logger.info("got Udyog Adhar verification search count before search");
		Thread.sleep(100);
		Business udyogAdhar= new Business(driver);
		udyogAdhar.UdyogAdhaar();
		logger.info("Udyog Aadhar Sample submitted");
		if (udyogAdhar.VerifyUdyogAdhaar().contains("Udyog Aadhaar")) {
			Assert.assertTrue(true);
			logger.info("Udyog Aadhar verification performed successfully!");
		} else {       
			logger.info("Udyog Aadhar verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getUdyogAadharVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Udyog Adhar  search count=="+AfterSearchCount);
		logger.info("got Udyog Adhar  search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Udyog Adhar verification search count verified successfully");
		} else 
		{
			logger.info("Udyog Adhar verification search count NOT verified");
			captureScreen(driver, "Udyog Adhar verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	//Test Case for PAN Director Verification
	@Test(enabled = true, testName = "Pan Director", priority = 1)
	public void PanDirectorVerification() throws IOException, InterruptedException 
	{	
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getPANDirectorVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Pan Director Verif search count=="+BeforeSearchCount);
		logger.info("got Pan Director verification search count before search");
		Thread.sleep(100);
		Business drugobj= new Business(driver);
		drugobj.PANdirector();
		logger.info("Pan director Sample submitted");
		if (drugobj.VerifyPANdirector().contains("Matched Director Data"))
		{
			Assert.assertTrue(true);
			logger.info("Pan Director verification performed successfully!");
		}
		else {
			logger.info(" Pan Director verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getPANDirectorVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Pan Director  search count=="+AfterSearchCount);
		logger.info("got Pan Director  search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Pan Director verification search count verified successfully");
		} else 
		{
			logger.info("Pan Director verification search count NOT verified");
			captureScreen(driver, "Pan Director verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}			

	//Test Case for ESIC Verification //not working
	@Test(enabled = false, testName = "ESIC", priority = 1)//
	public void ESICVerification() throws IOException, InterruptedException 
	{
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getESICVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before ESIC Verif search count=="+BeforeSearchCount);
		logger.info("got ESIC verification search count before search");
		Thread.sleep(100);
		Business obj= new Business(driver);
		obj.ESIC();
		logger.info("Esic Sample submitted");
		if (obj.VerifyESIC().contains("ESIC Details")) {
			Assert.assertTrue(true);
			logger.info("ESIC verification performed successfully!");
		}
		else {
			logger.info("ESIC verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}	
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getESICVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after ESIC  search count=="+AfterSearchCount);
		logger.info("got ESIC  search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("ESIC verification search count verified successfully");
		} else 
		{
			logger.info("ESIC verification search count NOT verified");
			captureScreen(driver, "ESIC verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}			

	//Test Case for GSTIN Verification 
	@Test(enabled = true, testName = "GSTIN", priority = 1)
	public void GSTINVerification() throws IOException, InterruptedException 
	{
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getGSTVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before GSTIN Verif search count=="+BeforeSearchCount);
		logger.info("got GSTIN verification search count before search");
		Thread.sleep(100);
		Business obj= new Business(driver);
		obj.GST();
		logger.info("GSTIN Sample submitted");
		if (obj.VerifyGST().contains("GSTIN Details")) {
			Assert.assertTrue(true);
			logger.info("GSTIN verification performed successfully!");
		}
		else {
			logger.info("GSTIN verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getGSTVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after GSTIN search count=="+AfterSearchCount);
		logger.info("got GSTIN  search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("GSTIN verification search count verified successfully");
		} else 
		{
			logger.info("GSTIN verification search count NOT verified");
			captureScreen(driver, "GSTIN verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}		

	//Test Case for IEC Verification 
	@Test(enabled = true, testName = "IEC", priority = 1)
	public void IECVerification() throws IOException, InterruptedException 
	{
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getIECVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before IEC Verif search count=="+BeforeSearchCount);
		logger.info("got IEC verification search count before search");
		Thread.sleep(100);
		Business obj= new Business(driver);
		obj.IEC();
		logger.info("IEC Sample submitted");
		if (obj.VerifyIEC().contains("IE Code")) 
		{
			Assert.assertTrue(true);
			logger.info("IEC verification performed successfully!");
		}
		else {
			logger.info("IEC verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getIECVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after IEC search count=="+AfterSearchCount);
		logger.info("got IEC  search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("IEC verification search count verified successfully");
		} else 
		{
			logger.info("IEC verification search count NOT verified");
			captureScreen(driver, "IEC verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}		

	//Test Case for Industry Type Verification
	@Test(enabled = true, testName = "Industry Type", priority = 1)
	public void IndtypeVerification() throws IOException, InterruptedException 
	{
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getIndustryTypeSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Industry TypeVerif search count=="+BeforeSearchCount);
		logger.info("got Industry Type verification search count before search");
		Thread.sleep(100);
		Business obj= new Business(driver);
		obj.IndustryType();
		logger.info("Industry type Sample submitted");
		if (obj.VerifyIndType().contains("Industry Type Details")) 
		{
			Assert.assertTrue(true);
			logger.info("Industry Type verification performed successfully!");
		}
		else {
			logger.info("Industry Type verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getIndustryTypeSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Industry Type search count=="+AfterSearchCount);
		logger.info("got Industry Type search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Industry Type verification search count verified successfully");
		} else 
		{
			logger.info("Industry Type verification search count NOT verified");
			captureScreen(driver, "Industry Type verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}		

	//Test Case for Pan Verification Using GST
	@Test(enabled = true, testName = "PAN using GSTIN", priority = 1)
	public void GSTPANVerification() throws IOException, InterruptedException 
	{
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getKnowUrPANUsingGSTSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before PAN using GST Verif search count=="+BeforeSearchCount);
		logger.info("got PAN using GST verification search count before search");
		Thread.sleep(100);
		Business obj= new Business(driver);
		obj.PANGST();
		logger.info("Pan using gst Sample submitted");
		if (obj.VerifyPAN_GST().contains("Verified PAN Number")) 
		{
			Assert.assertTrue(true);
			logger.info("PAN verification using GSTIN  performed successfully!");
		}
		else {
			logger.info("PAN verification using GSTIN not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getKnowUrPANUsingGSTSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after PAN using GST search count=="+AfterSearchCount);
		logger.info("got PAN using GST search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("PAN using GST verification search count verified successfully");
		} else 
		{
			logger.info("PAN using GST verification search count NOT verified");
			captureScreen(driver, "PAN using GST verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}		

	// Company Name Search  
	@Test(enabled = true, testName = "Company Name Search", priority = 1)
	public void CompanySearchVerification() throws IOException, InterruptedException 
	{
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getCompanyNameSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Company Search  search count=="+BeforeSearchCount);
		logger.info("got Company Search search count before search");
		Thread.sleep(100);
		Business obj= new Business(driver);
		obj.CompanySearch();
		logger.info("Test Company Sample submitted");
		if (obj.VerifyCompanySearch().contains("Company Name")) 
		{
			Assert.assertTrue(true);
			logger.info("Company Search verification performed successfully!");
		}
		else {
			logger.info("Company Search verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getCompanyNameSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Company Search search count=="+AfterSearchCount);
		logger.info("got Company Search search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Company Search verification search count verified successfully");
		} else 
		{
			logger.info("Company Search verification search count NOT verified");
			captureScreen(driver, "Company Search verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}	

	//Know Your GSTIN- PANINDIA 
	@Test(enabled = true, testName = "Know Your GSTIN- PANINDIA", priority = 1)
	public void GSTIN_PANVerification() throws IOException, InterruptedException 
	{
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getKnowYourGSTinPANINDIASearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Know Your GSTIN- PANINDIA search count=="+BeforeSearchCount);
		logger.info("got Know Your GSTIN- PANINDIA search count before search");
		Thread.sleep(100);
		Business obj= new Business(driver);
		obj.GSTIN_PANINDIA();
		logger.info("GSTIN PAN Sample submitted");
		if (obj.VerifyGSTIN_PAN().contains("GSTIN/UIN"))
		{
			Assert.assertTrue(true);
			logger.info("GST via Pan verification performed successfully!");
		}
		else {
			logger.info("Gst via Pan verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getKnowYourGSTinPANINDIASearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Know Your GSTIN- PANINDIA search count=="+AfterSearchCount);
		logger.info("got Know Your GSTIN- PANINDIA search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Know Your GSTIN- PANINDIA verification search count verified successfully");
		} else 
		{
			logger.info("Know Your GSTIN- PANINDIA verification search count NOT verified");
			captureScreen(driver, "Know Your GSTIN- PANINDIA verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}		

	//GSTIN-Taxpayer verification
	@Test(enabled = true, testName = "GSTIN-Taxpayer Verification", priority = 1)
	public void GSTINTaxPayerVerification() throws IOException, InterruptedException 
	{
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getGSTINTaxpayerVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before GSTIN tAXPAYER search count=="+BeforeSearchCount);
		logger.info("got GSTIN Taxpayer search count before search");
		Thread.sleep(100);
		Business obj= new Business(driver);
		obj.GSTINTaxPayerverification();
		logger.info("GSTIN  Tax payer Sample submitted");
		if (obj.VerifyGSTINTaxPayerverification().contains("GSTIN Details"))
		{
			Assert.assertTrue(true);
			logger.info("GSTIN taxpayer verification performed successfully!");
		}
		else {
			logger.info("GSTIN taxpayer verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getGSTINTaxpayerVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after GSTIN tax[payer search count=="+AfterSearchCount);
		logger.info("got GSTIN taxpayer search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("GSTIN taxpayer verification search count verified successfully");
		} else 
		{
			logger.info("GSTIN taxpayer verification search count NOT verified");
			captureScreen(driver, "GSTIN taxpayer verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}	
	//Credit Rating 
	@Test(enabled = true, testName = "Credit Rating", priority = 1)
	public void CreditRatingVerification() throws IOException, InterruptedException 
	{
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getCreditRatingsSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Credit Rating search count=="+BeforeSearchCount);
		logger.info("got Credit Ratingsearch count before search");
		Thread.sleep(100);
		Business obj= new Business(driver);
		obj.CreditRatingsverification();
		logger.info("Credit Rating Sample submitted");
		if (obj.VerifyCreditRatingverification().contains("Details of Credit Rating"))
		{
			Assert.assertTrue(true);
			logger.info("Credit Rating verification performed successfully!");
		}
		else {
			logger.info("Credit Rating  verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getCreditRatingsSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("afterCredit Rating search count=="+AfterSearchCount);
		logger.info("got Credit Rating count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Credit Rating verification search count verified successfully");
		} else 
		{
			logger.info("Credit Rating verification search count NOT verified");
			captureScreen(driver, "Credit Rating verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}		

	//ESIC Employer Verification 
	@Test(enabled = true, testName = "ESIC Employer", priority = 1)
	public void EsicemployerVerification() throws IOException, InterruptedException 
	{
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getEsicEmployerVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before ESIC Employer search count=="+BeforeSearchCount);
		logger.info("got ESIC Employer search count before search");
		Thread.sleep(100);
		Business obj= new Business(driver);
		obj.Esicemployerverification();
		logger.info("Esic epmloyer Sample submitted");
		Business verify= new Business(driver);
		if (verify.Esicemployergverification().contains("Employer Name"))
		{
			Assert.assertTrue(true);
			logger.info("Esic epmloyer verification performed successfully!");
		}
		else {
			logger.info("Esic epmloyer verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getEsicEmployerVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after ESIC Employer search count=="+AfterSearchCount);
		logger.info("got ESIC Employer count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("ESIC Employer verification search count verified successfully");
		} else 
		{
			logger.info("ESIC Employer verification search count NOT verified");
			captureScreen(driver, "ESIC Employer verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}	

	//FSSAI Verification
	@Test(enabled = true, testName = "FSSAI", priority = 1)
	public void FssaiVerification() throws IOException, InterruptedException 
	{
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getFssaiVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before FSSAI search count=="+BeforeSearchCount);
		logger.info("got FSSAI search count before search");
		Thread.sleep(100);
		Business obj= new Business(driver);
		obj.FssaiVerification();
		logger.info(" Fssai Sample submitted");
		if (obj.VerifyFssaiverification().contains("FSSAI ACCOUNT DETAILS"))
		{
			Assert.assertTrue(true);
			logger.info("FSSAI verification performed successfully!");
		}
		else 
		{
			logger.info("FSSAI verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getFssaiVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after FSSAI search count=="+AfterSearchCount);
		logger.info("got FSSAI count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("FSSAI verification search count verified successfully");
		} else 
		{
			logger.info("FSSAI verification search count NOT verified");
			captureScreen(driver, "FSSAI verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}	


	//Street Vendor Verification
	@Test(enabled = true, testName = "Street Vendor", priority = 1)
	public void StreetVendorVerification() throws IOException, InterruptedException 
	{
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getStreetVendorVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Street Vendorsearch count=="+BeforeSearchCount);
		logger.info("got Street Vendor search count before search");
		Thread.sleep(100);
		Business obj= new Business(driver);
		obj.StreetVendorVerification();
		logger.info("Street Vendor Sample submitted");
		if (obj.VerifyStreetVendorverification().contains("Street Vendor Details"))
		{
			Assert.assertTrue(true);
			logger.info("Street vendor verification performed successfully!");
		}
		else 
		{
			logger.info("Street vendor verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getStreetVendorVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Street Vendor search count=="+AfterSearchCount);
		logger.info("got Street Vendor count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Street Vendor verification search count verified successfully");
		} else 
		{
			logger.info("Street Vendor verification search count NOT verified");
			captureScreen(driver, "Street Vendor verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}	

	//Comprehensive GST Solution Verification 
	@Test(enabled = true, testName = "Comprehensive GST Solution", priority = 1)
	public void CGSTVerification() throws IOException, InterruptedException 
	{	
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getComprehensiveGSTVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Comprehensive GST search count=="+BeforeSearchCount);
		logger.info("got Comprehensive GST search count before search");
		Thread.sleep(100);
		Business obj= new Business(driver);
		File folder = new File("/home/rohit.singh/Downloads");
		File fListInitial[] = folder.listFiles();
		int initialNumberOfPDFs = fListInitial.length;
		obj.cgstVerification();     
		logger.info("CGST Sample submitted");
		Thread.sleep(5000);
		File fListFinal[] = folder.listFiles();
		if (initialNumberOfPDFs + 1== fListFinal.length)
		{
			Assert.assertTrue(true); 
			logger.info("Comprehesive Gst verification performed successfully!");
		}
		else
		{
			logger.info("Comprehensive Gst verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getComprehensiveGSTVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Comprehensive GST search count=="+AfterSearchCount);
		logger.info("got Comprehensive GST count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Comprehensive GST search count verified successfully");
		} else 
		{
			logger.info("Comprehensive GST search count NOT verified");
			captureScreen(driver, "Comprehensive GST verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	//GSTR Return verification(Data required)
	@Test(enabled = false, testName = " GSTR Return verification", priority = 1)//
	public void GSTRreturnVerification() throws IOException, InterruptedException 
	{	
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getGSTRreturnVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before gstr Return search count=="+BeforeSearchCount);
		logger.info("got gstr Return search count before search");
		Thread.sleep(100);
		Business obj= new Business(driver);
		obj.gstrReturnVerification();
		logger.info("gstr Return Sample submitted");
		if (obj.gstrReturnVerifySuccessMsg().contains("Active token fetched successfully"))
		{
			Assert.assertTrue(true);
			logger.info("gstr Return verification performed successfully!");
		}
		else 
		{
			logger.info("gstr Return verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getGSTRreturnVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after gstr Return search count=="+AfterSearchCount);
		logger.info("got gstr Return count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("gstr Return verification search count verified successfully");
		} else 
		{
			logger.info("gstr Return verification search count NOT verified");
			captureScreen(driver, "gstr Return verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	//Comprehensive GST solution Advanced verification
	@Test(enabled = true, testName = "comprehensive gst-Advanced verification", priority = 1)
	public void ComprehensiveGstAdvancedVerification() throws IOException, InterruptedException 
	{
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.getComprehensiveGstAdvVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before comprehensive gst-Advanced search count=="+BeforeSearchCount);
		logger.info("got comprehensive gst-Advanced search count before search");
		Thread.sleep(100);
		Business obj= new Business(driver);
		obj.cgstAdvVerification();
		logger.info("comprehensive gst-Advanced Sample submitted");
		if (obj.compGstAdvVerifySuccessMsg()==200){
			Assert.assertTrue(true);
			logger.info("comprehensive gst-Advanced verification performed successfully!");
		}
		else 
		{
			logger.info("comprehensive gst-Advanced verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getComprehensiveGstAdvVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after comprehensive gst-Advanced search count=="+AfterSearchCount);
		logger.info("got comprehensive gst-Advanced count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("comprehensive gst-Advanced verification search count verified successfully");
		} else 
		{
			logger.info("comprehensive gst-Advanced verification search count NOT verified");
			captureScreen(driver, "comprehensive gst-Advanced verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	//UDYAM Verification
	@Test(enabled = true, testName = "Udyam verification", priority = 1)
	public void UdyamVerification() throws IOException, InterruptedException {
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.udyamVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		logger.info("got udyam verification search count before search");
		Thread.sleep(100);
		Business obj= new Business(driver);
		obj.udyamVerification();
		logger.info("udyam verification Sample submitted");
		if (obj.UdyamVerificationSuccessMsg().contains("Name of Enterprise"))
		{
			Assert.assertTrue(true);
			logger.info("udyam verification performed successfully!");
		}
		else 
		{
			logger.info("udyam verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.udyamVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		logger.info("got udyam verification count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("udyam verification  search count verified successfully");
		} else 
		{
			logger.info("udyam verification search count NOT verified");
			captureScreen(driver, "udyam verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	//Udyog Aadhaar Using Phone verification
	@Test(enabled = true, testName = "Udyog Aadhaar Using Phone verification", priority =1)
	public void UdyogAadhaarUsingPhoneVerification() throws IOException, InterruptedException {
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.udyogAadhaarUsingPhoneSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		logger.info("got Udyog Aadhaar Using Phone verification search count before search");
		Thread.sleep(100);
		Business obj= new Business(driver);
		obj.udyogAdhaarUsingPhoneVerification();
		logger.info("Udyog Aadhaar Using Phone verification Sample submitted");
		if (obj.UdyogAdhaarVerificationUsingPhoneSuccessMsg().contains("Udyog Aadhaar Using Phone Details")){
			Assert.assertTrue(true);
			logger.info("Udyog Aadhaar Using Phone verification performed successfully!");
		}
		else 
		{
			logger.info("Udyog Aadhaar Using Phone verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.udyogAadhaarUsingPhoneSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		logger.info("got Udyog Aadhaar Using Phone verification count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Udyog Aadhaar Using Phone verification  search count verified successfully");
		} else 
		{
			logger.info("Udyog Aadhaar Using Phone verification search count NOT verified");
			captureScreen(driver, "Udyog Aadhaar Using Phone verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	//gstin view and track return verification
	@Test(enabled = true, testName = "gst view and track return verification", priority = 1)
	public void gstViewAndTrackReturnVerification() throws IOException, InterruptedException {
		Business  getbeforecount= new  Business(driver);
		String beforecount= getbeforecount.gstViewAndTrackReturnSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		logger.info("got gstin view and track return search count before verification");
		Thread.sleep(100);
		Business obj= new Business(driver);
		obj.gstTrackAndReturnVerification();
		logger.info("gstin view and track return  verification Sample submitted");
		if (obj.verifyGstTrackAndReturnVerificationSuccessMsg().contains("MODE OF FILE")) {
			Assert.assertTrue(true);
			logger.info("gstin view and track return verification performed successfully!");
		}
		else {
			logger.info("gstin view and track return verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.gstViewAndTrackReturnSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		logger.info("got gstin view and track return count after verification");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("gstin view and track return search count verified successfully");
		} else 
		{
			logger.info("gstin view and track return search count NOT verified");
			captureScreen(driver, "gstin view and track return search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	//GST Basis PAN//
	@Test(enabled = true, testName = "GST Basis PAN", priority = 1)
	public void GSTBasisPANVerification() throws IOException, InterruptedException {
		
		Business  business= new  Business(driver);
		String beforecount= business.getGSTBasisPANSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before GST Basis PAN search count=="+BeforeSearchCount);
		logger.info("got GST Basis PAN search count before search");
		Thread.sleep(100);
		business.GSTBasisPAN();
		logger.info("GST Basis PAN Sample submitted");
		if (business.VerifyGSTBasisPAN().contains("GSTIN/UIN Status"))
		{
			Assert.assertTrue(true);
			logger.info("GST Basis PAN verification performed successfully!");
		}
		else {
			logger.info("GST Basis PAN verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Business  getaftercount= new Business(driver);
		String aftercount= getaftercount.getGSTBasisPANSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after GST Basis PAN search count=="+AfterSearchCount);
		logger.info("got GST Basis PAN search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("GST Basis PAN verification search count verified successfully");
		} else 
		{
			logger.info("GST Basis PAN verification search count NOT verified");
			captureScreen(driver, "GST Basis PAN verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}		

}















