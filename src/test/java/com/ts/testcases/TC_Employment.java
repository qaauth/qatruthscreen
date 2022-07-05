package com.ts.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ts.pageobject.Bank;
import com.ts.pageobject.Business;
import com.ts.pageobject.Employment;
import com.ts.pageobject.Login;

public class TC_Employment extends BaseClass {

	///Salary Verification (Net Banking Login Required After First Page) 
	@Test(enabled = false, testName = "Salary Verification", priority = 1)
	public void Salary_Verification() throws IOException, InterruptedException 
	{	
		Employment getbeforecount= new Employment(driver);
		String beforecount= getbeforecount.getSalaryVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before salary verification search count=="+BeforeSearchCount);
		logger.info("got salary verification search count before search");
		Thread.sleep(100);
		Employment obj= new Employment(driver);
		obj.SalaryVerification();
		logger.info("Salary verification Sample submitted");
		if (obj.Verifysalaryverification().contains("Your Credentials Are Never Stored!"))
		{
			Assert.assertTrue(true);
			logger.info("Salary verification performed successfully!");
		}
		else {
			logger.info("Salary verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Employment getaftercount= new Employment(driver);
		String aftercount= getaftercount.getSalaryVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after salary verification search count=="+AfterSearchCount);
		logger.info("got salary verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("salary verification search count verified successfully");
		} else {
			logger.info("salary verification search count NOT verified");
			captureScreen(driver, "salary verification  search count NOT verified");
			Assert.assertTrue(false);
		}	
	}		

	///ITR Status Verification(Not working properly)(otp required)
	@Test(enabled = false, testName = "ITR Status", priority = 1)
	public void Itrstaus_Verification() throws IOException, InterruptedException {	
		Employment getbeforecount= new Employment(driver);
		String beforecount= getbeforecount.getITRStatusSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before ITR Status Verification search count=="+BeforeSearchCount);
		logger.info("got ITR status  search count before search");
		Thread.sleep(100);
		Employment obj= new Employment(driver);
		obj.ITRstatusVerification();
		logger.info("ITR Status verification Sample submitted");
		if (obj.Verifyitrstatusverification().contains("ITR Status"))
		{
			Assert.assertTrue(true);
			logger.info("ITR Status verification performed successfully!");
		}
		else {
			logger.info("ITR Status verification not performed successfully !");
			captureScreen(driver,"ITR Status verification not performed successfully !");
			Assert.assertTrue(false);
		}
		Employment getaftercount= new Employment(driver);
		String aftercount= getaftercount.getITRStatusSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after ITR Status Verification search count=="+AfterSearchCount);
		logger.info("got ITR status search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("ITR status search count verified successfully");
		} else 
		{
			logger.info("ITR status search count NOT verified");
			captureScreen(driver, "ITR status  search count NOT verified");
			Assert.assertTrue(false);
		}	
	}	

	//Form-16 Verification
	@Test(enabled = false, testName = "Form 16 verification", priority = 1)
	public void Form16_Verification() throws IOException, InterruptedException, AWTException 
	{	
		Employment getbeforecount= new Employment(driver);
		String beforecount= getbeforecount.getForm16VerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Form-16 Verification search count=="+BeforeSearchCount);
		logger.info("got form-16 verification  search count before search");
		Thread.sleep(100);
		Employment obj= new Employment(driver);
		obj.Form16Verification((System.getProperty("user.dir") + "/documents/Form16.pdf"));
		logger.info("Form 16 Sample submitted");
		if (obj.verifyform16verification().contains("Form16 Status"))
		{
			Assert.assertTrue(true);
			logger.info("Form 16 verification performed successfully!");
		}
		else {
			logger.info("Form 16 verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Employment getaftercount= new Employment(driver);
		String aftercount= getaftercount.getForm16VerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Form-16 Verification search count=="+AfterSearchCount);
		logger.info("got form-16 verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("form-16 verification search count verified successfully");
		} else {
			logger.info("form-16 verification search count NOT verified");
			captureScreen(driver, "form-16 verification  search count NOT verified");
			Assert.assertTrue(false);
		}	
	}	

	///PAN_TAN Verification
	@Test(enabled = true, testName = "PAN/TAN verification", priority = 1)
	public void PAN_TAN_Verification() throws IOException, InterruptedException 
	{	
		Employment getbeforecount= new Employment(driver);
		String beforecount= getbeforecount.getPANTANVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("Before PAN_TAN Verification search count=="+BeforeSearchCount);
		logger.info("got pan/tan verification  search count before search");
		Thread.sleep(100);
		Employment obj= new Employment(driver);
		obj.PanTanVerification();
		logger.info("PAN/TAN Sample submitted");
		if (obj.verifyPanTanverification().contains("Company TAN No."))
		{
			Assert.assertTrue(true);
			logger.info("Pan/Tan verification performed successfully!");
		}
		else {
			logger.info("Pan/Tan verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Employment getaftercount= new Employment(driver);
		String aftercount= getaftercount.getPANTANVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("After PAN_TAN Verification search count=="+AfterSearchCount);
		logger.info("got PAN/TAN verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("PAN/TAN verification search count verified successfully");
		} else 
		{
			logger.info("PAN/TAN verification search count NOT verified");
			captureScreen(driver, "PAN/TANverification  search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	//ITR Challan TAN Based Verification(service removed from live)
	@Test(enabled = false, testName = "ITR Challan tan based verification", priority = 1)//
	public void ITRChallan_TANbased_Verification() throws IOException, InterruptedException 
	{	
		Employment getbeforecount= new Employment(driver);
		String beforecount= getbeforecount.getITRChallanVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("Before ITR Challan TAN Based Verification search count=="+BeforeSearchCount);
		logger.info("got ITR Challan verification  search count before search");
		Thread.sleep(100);
		Employment obj= new Employment(driver);
		obj.ITRTANVerification();
		logger.info("ITR challan tan based Sample submitted");
		if (obj.verifyItrTanverification().contains("No"))
		{
			Assert.assertTrue(true);
			logger.info("ITR challan tan based verification performed successfully!");
		}
		else {
			logger.info("ITR challan tan based not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Employment getaftercount= new Employment(driver);
		String aftercount= getaftercount.getITRChallanVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("After ITR Challan TAN Based Verification search count=="+AfterSearchCount);
		logger.info("got ITR Challan verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("ITR Challan verification search count verified successfully");
		} else 
		{
			logger.info("ITR Challan verification search count NOT verified");
			captureScreen(driver, "ITR Challan verification  search count NOT verified");
			Assert.assertTrue(false);
		}	
	}
	///Basic UAN Verification
	@Test(enabled = true, testName = "Basic UAN verification", priority = 1)//
	public void basicUANVerification() throws IOException, InterruptedException 
	{
		Employment getbeforecount= new Employment(driver);
		String beforecount= getbeforecount.getUANVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("Before Basic UAN Verification search count=="+BeforeSearchCount);
		logger.info("got basic UAN verification search count before search");
		Thread.sleep(100);
		Employment obj= new Employment(driver);
		obj.basicUANVerification();
		logger.info("Uan sample submitted");
		if (obj.verifyBasicUANverification().contains("UAN Details"))
		{
			Assert.assertTrue(true);
			logger.info("basic UAN verification performed successfully!");
		}
		else {
			logger.info(" basic UAN verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Employment getaftercount= new Employment(driver);
		String aftercount= getaftercount.getUANVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("After Basic UAN Verification search count=="+AfterSearchCount);
		logger.info("got basic UAN verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("basic UAN  verification search count verified successfully");
		} else 
		{
			logger.info("basic UAN  verification search count NOT verified");
			captureScreen(driver, "basic UAN verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}
	
	//EPFO Check Exact Match (services removed from live)
	@Test(enabled = false, testName = "EPFO Check Exact Match", priority = 1)//
	public void epfoCheckVerification() throws IOException, InterruptedException 
	{
		Employment getbeforecount= new Employment(driver);
		String beforecount= getbeforecount.getEpfoCheckSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("Before EPFO Check Exact Match search count=="+BeforeSearchCount);
		logger.info("got EPFO Check Exact Match verification search count before search");
		Thread.sleep(100);
		Employment obj= new Employment(driver);		
		obj.epfoCheckVerification();
		logger.info("epfo exact match sample submitted");
		if (obj.verifyEpfoMatchSuccessMsg().contains("EPFO VERIFICATION DETAILS"))
		{
			Assert.assertTrue(true);
			logger.info("epfo exact match verification performed successfully!");
		}
		else {
			logger.info("epfo exact match verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Employment getaftercount= new Employment(driver);
		String aftercount= getaftercount.getEpfoCheckSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("After EPFO Check Exact Match search count=="+AfterSearchCount);
		logger.info("got epfo exact match verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("epfo exact match verification search count verified successfully");
		} else 
		{
			logger.info("epfo exact match verification search count NOT verified");
			captureScreen(driver, "epfo exact match verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	///EPFO Employer search/Employer PF Verification
	@Test(enabled = true, testName = "EPFO Employer search verification", priority = 1)
	public void EpfoEmployerSearchVerification() throws IOException, InterruptedException 
	{
		Employment getbeforecount= new Employment(driver);
		String beforecount= getbeforecount.EpfoEmployerSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("Before EPFO Employer search search count=="+BeforeSearchCount);
		logger.info("got EPFO Employer verification search count before search");
		Thread.sleep(100);
		Employment obj= new Employment(driver);		
		obj.EpfoEmployerSearchVerification();
		logger.info("EPFO Employer sample submitted");
		if (obj.verifyEpfoEmployerSearchSuccessMsg().contains("Employer PF Verification Details"))
		{
			Assert.assertTrue(true);
			logger.info("EPFO Employer verification performed successfully!");
		}
		else {
			logger.info("EPFO Employer verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Employment getaftercount= new Employment(driver);
		String aftercount= getaftercount.EpfoEmployerSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("After EPFO Employer search search count=="+AfterSearchCount);
		logger.info("got EPFO Employer verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("epfo EPFO Employer verification search count verified successfully");
		} else 
		{
			logger.info("EPFO Employer verification search count NOT verified");
			captureScreen(driver, "EPFO Employer verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}
	///EPFO Employee search/Employee verification
	@Test(enabled = true, testName = "EPFO Employee verification", priority = 1)//tech error 
	public void EpfoEmployeeVerification() throws IOException, InterruptedException 
	{
		Employment getbeforecount= new Employment(driver);
		String beforecount= getbeforecount.EpfoEmployeeVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("Before EPFO Employer search search count=="+BeforeSearchCount);
		logger.info("got EPFO Employee verification search count before search");
		Thread.sleep(100);
		Employment obj= new Employment(driver);		
		obj.EpfoEmployeeVerification();
		logger.info("EPFO Employee sample submitted");
		if (obj.verifyEpfoEmployeeSearchSuccessMsg().contains("Match Found"))
		{
			Assert.assertTrue(true);
			logger.info("EPFO Employee verification performed successfully!");
		}
		else {
			logger.info("EPFO Employee verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Employment getaftercount= new Employment(driver);
		String aftercount= getaftercount.EpfoEmployeeVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("After EPFO Employer search search count=="+AfterSearchCount);
		logger.info("got EPFO Employee verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("EPFO Employee verification search count verified successfully");
		} else 
		{
			logger.info("EPFO Employee verification search count NOT verified");
			captureScreen(driver, "EPFO Employee verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	///Employer Default Check verification 
	@Test(enabled = true, testName = "Employer Default Check verification", priority = 1)
	public void EmployerDefaultCheckVerification() throws IOException, InterruptedException 
	{
		Employment getbeforecount= new Employment(driver);
		String beforecount= getbeforecount.EmployerDefaultCheckSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("Before Employer Default Check verification search count=="+BeforeSearchCount);
		logger.info("got Employer Default Check verification search count before search");
		Thread.sleep(100);
		Employment obj= new Employment(driver);		
		obj.EmployerDefaultCheckVerification();
		logger.info("Employer Default Check sample submitted");
		if (obj.verifyEmployerDefaultCheckSuccessMsg().contains("Name of Establishment"))
		{
			Assert.assertTrue(true);
			logger.info("Employer Default Check verification performed successfully!");
		}
		else {
			logger.info("Employer Default Check verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Employment getaftercount= new Employment(driver);
		String aftercount= getaftercount.EmployerDefaultCheckSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("After Employer Default Check verification search count=="+AfterSearchCount);
		logger.info("got Employer Default Check verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Employer Default Check verification search count verified successfully");
		} else 
		{
			logger.info("Employer Default Check verification search count NOT verified");
			captureScreen(driver, "Employer Default Check verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	///BGV Employment check
	@Test(enabled = true, testName = "BGV: Employment check", priority = 1)
	public void BgvEmploymentCheckVerification() throws IOException, InterruptedException 
	{
		Employment getbeforecount= new Employment(driver);
		String beforecount= getbeforecount.BgvEmployementCheckSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("Before BGV Employment check search count=="+BeforeSearchCount);
		logger.info("got BGV: Employment check verification search count before search");
		Thread.sleep(100);
		Employment obj= new Employment(driver);		
		obj.BgvEmploymentCheckVerification();
		logger.info("BGV: Employment checksample submitted");
		if (obj.verifyBgvEmploymentCheckSuccessMsg().contains("Employment Summary"))
		{
			Assert.assertTrue(true);
			logger.info("BGV: Employment check verification performed successfully!");
		}
		else {
			logger.info("BGV: Employment check verification not performed successfully !");
			captureScreen(driver,"verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Employment getaftercount= new Employment(driver);
		String aftercount= getaftercount.BgvEmployementCheckSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("After BGV Employment check search count=="+AfterSearchCount);
		logger.info("got BGV: Employment check verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("BGV: Employment check verification search count verified successfully");
		} else 
		{
			logger.info("BGV: Employment check verification search count NOT verified");
			captureScreen(driver, "BGV: Employment check verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	///Dual Employment Check//not working/Not Available
	@Test(enabled = false, testName = "Dual Employment Check", priority = 1)
	public void DualEmploymentCheckVerification() throws IOException, InterruptedException {
		
		Employment employement= new Employment(driver);
		String beforecount= employement.getDualEmploymentCheckSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("Before Dual Employment Check search count=="+BeforeSearchCount);
		logger.info("got Dual Employment Check  search count before search");
		Thread.sleep(100);
		employement.DualEmploymentCheckVerification();
		logger.info("Dual Employment Check verification Sample submitted");
		if (employement.VerifyUANDetailsverification().contains("UAN Details")){
			Assert.assertTrue(true);
			logger.info("UAN verification performed successfully!");
		}
		if (employement.VerifyEstablishmentNameverification().contains("AUTHBRIDGE RESEARCH SERVICES PVT. LTD")) {
			Assert.assertTrue(true);
			logger.info("Establishment Name verification performed successfully!");
		}
		else {
			logger.info("Dual Employment Check not performed successfully !");
			captureScreen(driver,"Dual Employment Check not performed successfully !");
			Assert.assertTrue(false);
		}
		Employment getaftercount= new Employment(driver);
		String aftercount= getaftercount.getDualEmploymentCheckSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("After Dual Employment Check search count=="+AfterSearchCount);
		logger.info("got Dual Employment Check search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Dual Employment Check search count verified successfully");
		} else 
		{
			logger.info("Dual Employment Check search count NOT verified");
			captureScreen(driver, "Dual Employment Check  search count NOT verified");
			Assert.assertTrue(false);
		}	
	}
	
	///Negative Due Deligance
	@Test(enabled = true, testName = "Negative Due Deligance", priority = 1)
	public void NegativeDueDeliganceVerification() throws IOException, InterruptedException {
		
		Employment employement= new Employment(driver);
		String beforecount= employement.getNegativeDueDeliganceSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Negative Due Deligance search count=="+BeforeSearchCount);
		logger.info("got Negative Due Deligance search count before search");
		Thread.sleep(100);
		employement.NegativeDueDeliganceVerification();
		logger.info("Negative Due Deligance verification Sample submitted");
		if (employement.VerifyNegativeDueDeliganceverification().contains("CIBIL DEFAULTERS LIST")){
			Assert.assertTrue(true);
			logger.info("Negative Due Deligance performed successfully!");
		}
		if (employement.VerifyDefaulterName().contains("Vijay Mallya")) {
			Assert.assertTrue(true);
			logger.info("Negative Due Deligance name verify performed successfully!");
		}
		else {
			logger.info("Negative Due Deligance not performed successfully !");
			captureScreen(driver,"Negative Due Deligance not performed successfully !");
			Assert.assertTrue(false);
		}
		Employment getaftercount= new Employment(driver);
		String aftercount= getaftercount.getNegativeDueDeliganceSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("before Negative Due Deligance search count=="+AfterSearchCount);
		logger.info("got Negative Due Deligance search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Negative Due Deligance search count verified successfully");
		} else 
		{
			logger.info("Negative Due Deligance search count NOT verified");
			captureScreen(driver, "Negative Due Deligancek  search count NOT verified");
			Assert.assertTrue(false);
		}	
	}	
}
