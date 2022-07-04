package com.ts.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ts.pageobject.Bank;
import com.ts.pageobject.Employment;
import com.ts.pageobject.OCR;
import com.ts.pageobject.Others;

public class TC_OCR extends BaseClass {

	//Aadhar OCR Verification  
	@Test(enabled = true, testName = "Aadhar OCR", priority = 1)
	public void Aadharocrverification() throws IOException, InterruptedException 
	{	
		OCR getbeforecount= new OCR(driver);
		String beforecount= getbeforecount.getAadharOCRSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Aadhar OCR search count=="+BeforeSearchCount);
		logger.info("got Aadhar OCR verification search count before search");
		Thread.sleep(100);
		OCR xyz= new OCR(driver);
		xyz.AdharOCRVerification();	 
		logger.info("Aadhar OCR Sample submitted");
		if (xyz.verifyAadharOcrverification().contains("Aadhaar Detail Found Successfully")) {
			Assert.assertTrue(true);
			logger.info("Aadhar OCR verification performed successfully!");
		} else {
			logger.info("Aadhar OCR verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		OCR getaftercount= new OCR(driver);
		String aftercount= getaftercount.getAadharOCRSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Aadhar OCR  search count=="+AfterSearchCount);
		logger.info("got Aadhar OCR  verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Aadhar OCR  verification search count verified successfully");
		} else 
		{
			logger.info("Aadhar OCR  verification search count NOT verified");
			captureScreen(driver, "Aadhar OCR  verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}
	//PAN OCR Verification 
	@Test(enabled = true, testName = "PAN OCR", priority = 2)
	public void PanocrVerification() throws IOException, InterruptedException 
	{	
		OCR getbeforecount= new OCR(driver);
		String beforecount= getbeforecount.getPanOCRSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before PAN OCR search count=="+BeforeSearchCount);
		logger.info("got PAN OCR verification search count before search");
		Thread.sleep(100);
		OCR xyz= new OCR(driver);
		xyz.PANOCRVerification();	 
		logger.info("Pan OCR Sample submitted");
		if (xyz.verifyPanOcrverification().contains("Pan Detail Found Successfully")) {
			Assert.assertTrue(true);
			logger.info("PAN OCR verification performed successfully!");
		} else {
			logger.info("PAN OCR verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		OCR getaftercount= new OCR(driver);
		String aftercount= getaftercount.getPanOCRSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after PAN OCR  search count=="+AfterSearchCount);
		logger.info("got PAN OCR  verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("PAN OCR  verification search count verified successfully");
		} else 
		{
			logger.info("PAN OCR verification search count NOT verified");
			captureScreen(driver, "PAN OCR verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	//DL OCR Verification 
	@Test(enabled = true, testName = "DL OCR", priority = 3)
	public void dlocrVerification() throws IOException, InterruptedException 
	{	
		OCR getbeforecount= new OCR(driver);
		String beforecount= getbeforecount.getDLOCRSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before DL OCR search count=="+BeforeSearchCount);
		logger.info("got DL OCR verification search count before search");
		Thread.sleep(100);
		OCR xyz= new OCR(driver);
		xyz.DLOCRVerification();	 
		logger.info("DL OCR Sample submitted");
		if (xyz.verifydlOcrverification().contains("DRIVING LICENSE Detail Found Successfully")) {
			Assert.assertTrue(true);
			logger.info("DL OCR verification performed successfully!");
		} else {
			logger.info("DL OCR verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		OCR getaftercount= new OCR(driver);
		String aftercount= getaftercount.getDLOCRSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after DL OCR  search count=="+AfterSearchCount);
		logger.info("got DL OCR  verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("DL OCR verification search count verified successfully");
		} else 
		{
			logger.info("DL OCR verification search count NOT verified");
			captureScreen(driver, "DL OCR verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	//Voter Id OCR Verification  
	@Test(enabled = true, testName = "Voter Id OCR", priority = 4)
	public void voteridocrVerification() throws IOException, InterruptedException 
	{	
		OCR getbeforecount= new OCR(driver);
		String beforecount= getbeforecount.getVoterIdOCRSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Voter Id  OCR search count=="+BeforeSearchCount);
		logger.info("got Voter Id  OCR verification search count before search");
		Thread.sleep(100);
		OCR xyz= new OCR(driver);
		xyz.VoterIdOCRVerification();	 
		logger.info("Voter Id OCR Sample submitted");
		if (xyz.verifyvoteridOcrverification().contains("Voter ID Detail Found Successfully")) {
			Assert.assertTrue(true);
			logger.info("Voter Id OCR verification performed successfully!");
		} else {
			logger.info("Voter Id OCR verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		OCR getaftercount= new OCR(driver);
		String aftercount= getaftercount.getVoterIdOCRSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Voter Id  OCR  search count=="+AfterSearchCount);
		logger.info("got Voter Id  OCR  verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Voter Id  OCR verification search count verified successfully");
		} else 
		{
			logger.info("Voter Id  OCR verification search count NOT verified");
			captureScreen(driver, "Voter Id  OCR verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	//Passport OCR Verification 
	@Test(enabled = true, testName = "Passport OCR", priority = 5)
	public void PasspocrVerification() throws IOException, InterruptedException 
	{	
		OCR getbeforecount= new OCR(driver);
		String beforecount= getbeforecount.getPassportOCRSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Passport  OCR search count=="+BeforeSearchCount);
		logger.info("got Passport  OCR verification search count before search");
		Thread.sleep(100);
		OCR xyz= new OCR(driver);
		xyz.PassportOCRVerification(); 
		logger.info(" Passport OCR Sample submitted");
		if (xyz.verifypassportOcrverification().contains("Passport Detail Found Successfully")) {
			Assert.assertTrue(true);
			logger.info("Passport OCR verification performed successfully!");
		} else {
			logger.info(" Passport OCR verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		OCR getaftercount= new OCR(driver);
		String aftercount= getaftercount.getPassportOCRSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Passport  OCR  search count=="+AfterSearchCount);
		logger.info("got Passport  OCR  verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Passport  OCR verification search count verified successfully");
		} else 
		{
			logger.info("Passport  OCR verification search count NOT verified");
			captureScreen(driver, "Passport  OCR verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	//cheque OCR Verification
	@Test(enabled = true, testName = "cheque OCR", priority = 6)
	public void chequeOcrVerification() throws IOException, InterruptedException 
	{
		OCR getbeforecount= new OCR(driver);
		String beforecount= getbeforecount.getChequeOCRSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before cheque   OCR search count=="+BeforeSearchCount);
		logger.info("got cheque  OCR verification search count before search");
		Thread.sleep(100);
		OCR xyz= new OCR(driver);
		xyz.ChequeOCRVerification(); 
		logger.info(" cheque  OCR Sample submitted");
		if (xyz.chequeOcrVerificationSuccessMsg().contains("Cheque Detail Found Successfully")) {
			Assert.assertTrue(true);
			logger.info("cheque  OCR verification performed successfully!");
		} else {
			logger.info(" cheque  OCR verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		OCR getaftercount= new OCR(driver);
		String aftercount= getaftercount.getChequeOCRSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after cheque   OCR  search count=="+AfterSearchCount);
		logger.info("got cheque  OCR  verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("cheque   OCR verification search count verified successfully");
		} else 
		{
			logger.info("cheque   OCR verification search count NOT verified");
			captureScreen(driver, "cheque OCR verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	//Advance Passport OCR
	@Test(enabled = true, testName = "Advance passport OCR", priority = 7)
	public void AdvancePassportOCRVerification() throws IOException, InterruptedException {

		OCR ocr=new OCR(driver);
		String beforecount= ocr.getAdvancePassportOCRSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		logger.info("got Advance passport OCR search count before search");
		System.out.println("before Advance passport OCR search count=="+BeforeSearchCount);
		Thread.sleep(100);
		ocr.AdvancePassportOCRVerification();
		logger.info("Advance passport OCR Sample submitted");
		if (ocr.advancePassportVerificationSuccessMsg().contains("Advanced Passport  Detail Found Successfully")){
			Assert.assertTrue(true);
			logger.info("Advance passport OCR performed successfully!");
		}
		if (ocr.advancePassportVerificationSuccessMsg1().contains("ATULKUMAR CHUNILAL")) {
			Assert.assertTrue(true);
			logger.info("Passport holder Name verification performed successfully!");
		}
		else {
			logger.info("Advance passport OCR not performed successfully !");
			captureScreen(driver,"Advance passport OCR not performed successfully !");
			Assert.assertTrue(false);
		}
		OCR getaftercount= new OCR(driver);
		String aftercount= getaftercount.getAdvancePassportOCRSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		logger.info("got Advance passport OCR search count after search");
		System.out.println("before Advance passport OCR search count=="+AfterSearchCount);
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Advance passport OCR count verified successfully");
		} else 
			
		{
			logger.info("Advance passport OCR search count NOT verified");
			captureScreen(driver, "Advance passport OCR search count NOT verified");
			Assert.assertTrue(false);
		}	
	}	

}
