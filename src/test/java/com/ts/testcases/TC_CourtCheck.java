package com.ts.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ts.pageobject.CourtCheck;
import com.ts.pageobject.Others;

public class TC_CourtCheck extends BaseClass{

	//Court Check Verification
	@Test(enabled = true, testName = "Court Check", priority = 1)
	public void Court_CheckVerification() throws IOException, InterruptedException 
	{	
		CourtCheck getbeforecount= new  CourtCheck(driver);
		String beforecount= getbeforecount.getCourtCheckSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Court Check Verif search count=="+BeforeSearchCount);
		logger.info("got Court Check verification search count before search");
		Thread.sleep(100);
		CourtCheck xyz= new CourtCheck(driver);
		xyz.CourtCheckVerification();	 
		logger.info("Court Check Sample submitted");
		if (xyz.verifyCourtverification().contains("Match")) {
			Assert.assertTrue(true);
			logger.info("Court Check verification performed successfully!");
		} else {
			logger.info("Court Check verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}	
		CourtCheck getaftercount= new  CourtCheck(driver);
		String aftercount= getaftercount.getCourtCheckSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Court Check search count=="+AfterSearchCount);
		logger.info("got Court Check verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Court Check verification search count verified successfully");
		} else 
		{
			logger.info("Court Check verification search count NOT verified");
			captureScreen(driver, "Court Check verification  search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	//Litigation Check
	@Test(enabled = true, testName = "Litigation Check", priority = 1)
	public void LitigationCheckVerification() throws IOException, InterruptedException 
	{	
		CourtCheck court= new  CourtCheck(driver);
		String beforecount= court.getLitigationCheckSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Litigation Check Verif search count=="+BeforeSearchCount);
		logger.info("got Litigation Check verification search count before search");
		Thread.sleep(100);
		court.LitigationCheckVerification(); 
		logger.info("Litigation Check Sample submitted");
		if (court.verifyLitigationCheck().contains("PARTY NAME : MS.MARKET ADV.RESEARCH SERVICES")) {
			Assert.assertTrue(true);
			logger.info("Litigation Check verification performed successfully!");
		} else {
			logger.info("Litigation Check verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}	
		CourtCheck getaftercount= new  CourtCheck(driver);
		String aftercount= getaftercount.getLitigationCheckSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Litigation Check search count=="+AfterSearchCount);
		logger.info("got Litigation Check verification search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Litigation Check verification search count verified successfully");
		} else 
		{
			logger.info("Litigation Check verification search count NOT verified");
			captureScreen(driver, "Litigation Check verification  search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

}
