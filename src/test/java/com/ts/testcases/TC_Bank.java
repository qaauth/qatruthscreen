package com.ts.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ts.pageobject.Bank;
import com.ts.pageobject.Employment;
import com.ts.pageobject.Login;

public class TC_Bank extends BaseClass {
	
	   //IFSC Code Verification
		@Test(enabled = true, testName = "IFSC Code Verification", priority = 1)
		public void IFSCcode_Verification() throws IOException, InterruptedException {	
			Bank getbeforecount= new Bank(driver);
			String beforecount= getbeforecount.getifscVerificationSearchCount();
			int BeforeSearchCount=Integer.parseInt(beforecount);
			System.out.println("before IFSC CODE Verif search count=="+BeforeSearchCount);
			logger.info("got IFSC CODE verification search count before search");
			Thread.sleep(100);
			Bank obj= new Bank(driver);
			obj.IFSCCodeVerification();
			logger.info("Ifsc Code verification Sample submitted");
			if (obj.verifyifscverification().contains("BANK INFORMATION"))
			{
				 Assert.assertTrue(true);
				 logger.info("Ifsc Code verification performed successfully!");
			}
			else {
				 logger.info("Ifsc Code verification not performed successfully !");
				 captureScreen(driver,"verifyDashboardSummaryText");
				 Assert.assertTrue(false);
			}
			Bank getaftercount= new Bank(driver);
			String aftercount= getaftercount.getifscVerificationSearchCount();
			int AfterSearchCount=Integer.parseInt(aftercount);
			System.out.println("after ifsc code search count=="+AfterSearchCount);
			logger.info("got IFSC CODE verification search count after search");
			Thread.sleep(100);
			if((AfterSearchCount-BeforeSearchCount)==1) {
				 Assert.assertTrue(true); 
				 logger.info("ifsc code verification search count verified successfully");
			} else {
				 logger.info("ifsc code verification search count NOT verified");
				 captureScreen(driver, "ifsc code verification  search count NOT verified");
				 Assert.assertTrue(false);
			}	
		}
		//Bank Statement Analysis (personal details required)//techanical error
		@Test(enabled = false, testName = "Bank Statement Analysis", priority = 1)
		public void BankStatementAnalysis() throws InterruptedException, IOException {
			Bank getbeforecount= new Bank(driver);
			String beforecount= getbeforecount.getBankStatementAnalysisSearchCount();
			int BeforeSearchCount=Integer.parseInt(beforecount);
			System.out.println("before BankStatement Analysis search count=="+BeforeSearchCount);
			logger.info("got BankStatement Analysis search count before search");
			Thread.sleep(100);
			Bank obj= new Bank(driver);
			obj.submitBankStatementAnalysisSample();
			logger.info("BankStatement Analysis Sample submitted");
			if (obj.verifyBankStatementUploadMsg().contains("Request submitted successfully"))
			{
				 Assert.assertTrue(true);
				 logger.info("BankStatement Analysis performed successfully!");
			}
			else {
				 logger.info("BankStatement Analysis not performed successfully !");
				 captureScreen(driver,"verifyDashboardSummaryText");
				 Assert.assertTrue(false);
			}
			Bank getaftercount= new Bank(driver);
			String aftercount= getaftercount.getBankStatementAnalysisSearchCount();
			int AfterSearchCount=Integer.parseInt(aftercount);
			System.out.println("after BankStatement Analysis search count=="+AfterSearchCount);
			logger.info("got BankStatement Analysissearch count after search");
			Thread.sleep(100);
			if((AfterSearchCount-BeforeSearchCount)==1) {
				 Assert.assertTrue(true); 
				 logger.info("BankStatement Analysis search count verified successfully");
			} else {
				 logger.info("BankStatement Analysis search count NOT verified");
				 captureScreen(driver, "BankStatement Analysis  search count NOT verified");
				 Assert.assertTrue(false);
			}
		}
		//Bank Statement Fetch & Analysis  (page not working)
		@Test(enabled = false, testName = "Bank Statement Fetch And Analysis", priority = 1)
		public void BankStatementFetchAndAnalysis() throws InterruptedException, IOException {
			Bank getbeforecount= new Bank(driver);
			String beforecount= getbeforecount.getBankStatementFetchAndAnalysisSearchCount();
			int BeforeSearchCount=Integer.parseInt(beforecount);
			System.out.println("before BankStatement fetch and Analysis search count=="+BeforeSearchCount);
			logger.info("got BankStatement fetch and Analysis search count before search");
			Thread.sleep(100);
			Bank obj= new Bank(driver);
			obj.submitBankStatementSample();
			logger.info("BankStatement fetch and Analysis Sample submitted");
			if (obj.verifyBankStatementUploadSuccessMsg().contains("Statement Uploaded Successfully"))
			{
				 Assert.assertTrue(true);
				 logger.info("BankStatement fetch and Analysis performed successfully!");
			}
			else {
				 logger.info("BankStatement fetch and Analysis not performed successfully !");
				 captureScreen(driver,"verifyDashboardSummaryText");
				 Assert.assertTrue(false);
			}
			Bank getaftercount= new Bank(driver);
			String aftercount= getaftercount.getBankStatementFetchAndAnalysisSearchCount();
			int AfterSearchCount=Integer.parseInt(aftercount);
			System.out.println("after BankStatement fetch and Analysis search count=="+AfterSearchCount);
			logger.info("got BankStatement fetch and Analysis search count after search");
			Thread.sleep(100);
			if((AfterSearchCount-BeforeSearchCount)==1) {
				 Assert.assertTrue(true); 
				 logger.info("BankStatement fetch and Analysis search count verified successfully");
			} else {
				 logger.info("BankStatement fetch and Analysis search count NOT verified");
				 captureScreen(driver, "BankStatement fetch and Analysis search count NOT verified");
				 Assert.assertTrue(false);
			}
		}
		//IFSC code search
		@Test(enabled = true, testName = "IFSC code search", priority = 1)
		public void ifscCodeSearch() throws InterruptedException, IOException {
			Bank getbeforecount= new Bank(driver);
			String beforecount= getbeforecount.getIfscCodeSearchCount();
			int BeforeSearchCount=Integer.parseInt(beforecount);
			System.out.println("before IFSC code search  count=="+BeforeSearchCount);
			logger.info("got IFSC code search count before search");
			Thread.sleep(100);
			Bank obj= new Bank(driver);
			obj.ifscCodeSearch();
			logger.info("ifsc code search sample submitted");
			if (obj.verifyIfscCodeSearchSuccessMsg().contains("Details of Bank Branch"))
			{
				 Assert.assertTrue(true);
				 logger.info("ifsc code search performed successfully!");
			}
			else {
				 logger.info("ifsc code search not performed successfully !");
				 captureScreen(driver,"verifyDashboardSummaryText");
				 Assert.assertTrue(false);
			}
			Bank getaftercount= new Bank(driver);
			String aftercount= getaftercount.getIfscCodeSearchCount();
			int AfterSearchCount=Integer.parseInt(aftercount);
			System.out.println("ifsc code search count=="+AfterSearchCount);
			logger.info("got ifsc code search count after search");
			Thread.sleep(100);
			if((AfterSearchCount-BeforeSearchCount)==1) {
				 Assert.assertTrue(true); 
				 logger.info("ifsc code search count verified successfully");
			} else {
				 logger.info("ifsc code search count NOT verified");
				 captureScreen(driver, "ifsc code search count NOT verified");
				 Assert.assertTrue(false);
			}
		}
		//Bank Account verification-Advance
		@Test(enabled = true, testName = "Bank Account verification-Advance", priority = 1)
		public void BankAccountVerificationAdvance() throws InterruptedException, IOException {
			Bank getbeforecount= new Bank(driver);
			String beforecount= getbeforecount.getBankAccountVerificationAdvancedSearchCount();
			int BeforeSearchCount=Integer.parseInt(beforecount);
			System.out.println("before Bank Account verification-Advance search  count=="+BeforeSearchCount);
			logger.info("got Bank Account verification-Advance search count before search");
			Thread.sleep(100);
			Bank obj= new Bank(driver);
			obj.BankAccountVerificationAdvanced();
			logger.info("Bank Account verification-Advance sample submitted");
			if (obj.verifyBankAccountVerificationAdvSuccessMsg().contains("Details of Bank Account"))
			{
				 Assert.assertTrue(true);
				 logger.info("Bank Account verification-Advance verification performed successfully!");
			}
			else {
				 logger.info("Bank Account verification-Advance verification not performed successfully !");
				 captureScreen(driver,"verifyDashboardSummaryText");
				 Assert.assertTrue(false);
			}
			Bank getaftercount= new Bank(driver);
			String aftercount= getaftercount.getBankAccountVerificationAdvancedSearchCount();
			int AfterSearchCount=Integer.parseInt(aftercount);
			System.out.println("Bank Account verification-Advance search count=="+AfterSearchCount);
			logger.info("got Bank Account verification-Advance search count after search");
			Thread.sleep(100);
			if((AfterSearchCount-BeforeSearchCount)==1) {
				 Assert.assertTrue(true); 
				 logger.info("Bank Account verification-Advance search count verified successfully");
			} else {
				 logger.info("Bank Account verification-Advance search count NOT verified");
				 captureScreen(driver, "Bank Account verification-Advance search count NOT verified");
				 Assert.assertTrue(false);
			}
		}
		
}
