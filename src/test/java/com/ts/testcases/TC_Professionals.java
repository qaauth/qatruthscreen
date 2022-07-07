package com.ts.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ts.pageobject.Bank;
import com.ts.pageobject.NID;
import com.ts.pageobject.Professionals;
import com.ts.pageobject.Utility;

public class TC_Professionals extends BaseClass {

	///Insurance Agent Verification
	@Test(enabled = true, testName = "Insurance Agent", priority = 1)
	public void IAVerification() throws IOException, InterruptedException 
	{	
		Professionals getbeforecount= new  Professionals(driver);
		String beforecount= getbeforecount.getInsuranceAgentVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Insurance Agent Verif search count=="+BeforeSearchCount);
		logger.info("got Insurance Agent verification search count before search");
		Thread.sleep(100); 
		Professionals xyz= new Professionals(driver);
		xyz.InsuranceAgentVerification();	 
		logger.info("IA Sample submitted");
		if (xyz.verifyInsuranceAgent().contains("JAGAN BODDEDA")) {
			Assert.assertTrue(true);
			logger.info("Insurance Agent verification performed successfully!");
		} else {
			logger.info("Insurance Agent verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Professionals getaftercount= new Professionals(driver);
		String aftercount= getaftercount.getInsuranceAgentVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Insurance Agent search count=="+AfterSearchCount);
		logger.info("got Insurance Agent search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Insurance Agent verification search count verified successfully");
		} else 
		{
			logger.info("Insurance Agent verification search count NOT verified");
			captureScreen(driver, "Insurance Agent verification  search count NOT verified");
			Assert.assertTrue(false);
		}	
	}


	///CA verification
	@Test(enabled= true, testName="CA Verification" , priority=1)
	public void CAverification() throws InterruptedException, IOException
	{
		Professionals getbeforecount= new  Professionals(driver);
		String beforecount= getbeforecount.getCAVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before CA Verif search count=="+BeforeSearchCount);
		logger.info("got CA verification search count before search");
		Thread.sleep(100); 
		Professionals ca=new Professionals(driver);
		ca.CAVerification();
		logger.info("CA Sample submitted");
		if (ca.verifyCAverification().contains("Name")) {
			Assert.assertTrue(true);
			logger.info("CA verification performed successfully !");
		} else {
			logger.info("CA verification not performed successfully ");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Professionals getaftercount= new Professionals(driver);
		String aftercount= getaftercount.getCAVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after CA verify search count=="+AfterSearchCount);
		logger.info("got CA search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("CA verification search count verified successfully");
		} else 
		{
			logger.info("CA verification search count NOT verified");
			captureScreen(driver, "CA verification  search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	///Doctor verification
	@Test(enabled= true, testName="Doctor Verification" , priority=1)
	public void Doctorverification() throws InterruptedException, IOException {
		Professionals getbeforecount= new  Professionals(driver);
		String beforecount= getbeforecount.getDoctorVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Doctor Verif search count=="+BeforeSearchCount);
		logger.info("got Doctor verification search count before search");
		Thread.sleep(100); 		
		Professionals ca=new Professionals(driver);
		ca.DocVerification();
		logger.info("Doc Sample submitted");
		if (ca.verifydoctorverification().contains("Name")) {
			Assert.assertTrue(true);
			logger.info("Doctor verification performed successfully !");
		} else {
			logger.info("Doctor verification not performed successfully ");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);				
		}
		Professionals getaftercount= new Professionals(driver);
		String aftercount= getaftercount.getDoctorVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Doctor verify search count=="+AfterSearchCount);
		logger.info("got Doctor search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Doctor verification search count verified successfully");
		} else 
		{
			logger.info("Doctor verification search count NOT verified");
			captureScreen(driver, "Doctor verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	///Dentist verification
	@Test(enabled= true, testName="Dentist Verification" , priority=1)
	public void Dentistverification() throws InterruptedException, IOException
	{
		Professionals getbeforecount= new  Professionals(driver);
		String beforecount= getbeforecount.getDentistVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Dentist Verif search count=="+BeforeSearchCount);
		logger.info("got Dentist verification search count before search");
		Thread.sleep(100); 	
		Professionals ca=new Professionals(driver);
		ca.DentistVerification();
		logger.info("Dentist Sample submitted");
		if (ca.verifydentistverification().contains("Name")) {
			Assert.assertTrue(true);
			logger.info("Dentist verification performed successfully !");
		} else {
			logger.info("Dentist verification not performed successfully ");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);				
		}
		Professionals getaftercount= new Professionals(driver);
		String aftercount= getaftercount.getDentistVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Dentist verify search count=="+AfterSearchCount);
		logger.info("got Dentist search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Dentist verification search count verified successfully");
		} else 
		{
			logger.info("Dentist verification search count NOT verified");
			captureScreen(driver, "Dentist verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	///ICSI verification
	@Test(enabled= true, testName="ICSI Verification" , priority=1)
	public void ICSIverification() throws InterruptedException, IOException
	{
		Professionals getbeforecount= new  Professionals(driver);
		String beforecount= getbeforecount.getICSIVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before ICSI Verif search count=="+BeforeSearchCount);
		logger.info("got ICSI verification search count before search");
		Thread.sleep(100); 	
		Professionals ca=new Professionals(driver);
		ca.ICSIVerification();
		logger.info("ICSI Sample submitted");
		if (ca.verifyICSItverification().contains("MEMBERSHIP NUMBER")) {
			Assert.assertTrue(true);
			logger.info("ICSI verification performed successfully !");
		} 
		else {
			logger.info("ICSI verification not performed successfully ");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);				
		}
		Professionals getaftercount= new Professionals(driver);
		String aftercount= getaftercount.getICSIVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after ICSI verify search count=="+AfterSearchCount);
		logger.info("got ICSI search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("ICSIverification search count verified successfully");
		} else 
		{
			logger.info("ICSI verification search count NOT verified");
			captureScreen(driver, "ICSI verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	///ICWAI verification
	@Test(enabled= true, testName="ICWAI Verification" , priority=1)
	public void ICWAIverification() throws InterruptedException, IOException
	{
		Professionals getbeforecount= new  Professionals(driver);
		String beforecount= getbeforecount.getICWAIVerificationSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before ICWAI Verif search count=="+BeforeSearchCount);
		logger.info("got ICWAI verification search count before search");
		Thread.sleep(100); 
		Professionals ca=new Professionals(driver);
		ca.ICWAIVerification();
		logger.info("ICWAI Sample submitted");
		if (ca.verifyICWAItverification().contains("MEMBER NUMBER"))
		{
			Assert.assertTrue(true);
			logger.info("ICWAI verification performed successfully !");
		} else {
			logger.info("ICWAI verification not performed successfully ");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);				
		}
		Professionals getaftercount= new Professionals(driver);
		String aftercount= getaftercount.getICWAIVerificationSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after ICWAI verify search count=="+AfterSearchCount);
		logger.info("got ICWAI search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("ICWAI verification search count verified successfully");
		} else 
		{
			logger.info("ICWAI verification search count NOT verified");
			captureScreen(driver, "ICWAI verification  search count NOT verified");
			Assert.assertTrue(false);
		}
	}

	///Insurance Agent Pan check Verification
	@Test(enabled= true, testName="Insurance Agent Pan check Verification" , priority=1)
	public void InsuranceAgentPanCheckverification() throws InterruptedException, IOException
	{
		Professionals getbeforecount= new  Professionals(driver);
		String beforecount= getbeforecount.InsuranceAgentPanCheckSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Insurance Agent Pan Verify search count=="+BeforeSearchCount);
		logger.info("got  Insurance Agent Pan Verify  search count before search");
		Thread.sleep(100); 
		Professionals ia=new Professionals(driver);
		ia.InsuranceAgentPanCheckVerification();
		logger.info("Insurance Agent Pan Verify Sample submitted");
		if (ia.IAPancheckVerifySuccessMsg().contains("Matching Record Found In DataBase"))
		{
			Assert.assertTrue(true);
			logger.info(" Insurance Agent Pan Verification performed successfully !");
		} else {
			logger.info(" Insurance Agent Pan verification not performed successfully ");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);				
		}
		Professionals getaftercount= new Professionals(driver);
		String aftercount= getaftercount.InsuranceAgentPanCheckSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after  Insurance Agent Pan Verify  search count=="+AfterSearchCount);
		logger.info("got  Insurance Agent Pan Verify search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info(" Insurance Agent Pan check  search count verified successfully");
		} else 
		{
			logger.info("Insurance Agent Pan check search count NOT verified");
			captureScreen(driver, "Insurance Agent Pan check  search count NOT verified");
			Assert.assertTrue(false);
		}
	}
	
	///Nurse Verification//newly added
	@Test(enabled = true, testName = "Nurse Verification", priority = 1)
	public void NurseVerification() throws IOException, InterruptedException 
	{	

		Professionals pro = new Professionals(driver);
		String beforecount= pro.getNurseSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Nurse search count=="+BeforeSearchCount);
		logger.info("got Nurse search count before search");
		Thread.sleep(100);
		pro.NUID();	 
		logger.info(" NUID number Sample submitted");
		Thread.sleep(100);
		if (pro.verifyNUID().contains("Applicant Name")) {
			Assert.assertTrue(true); 
			logger.info("NUID verification done successfully!");
		} else {
			logger.info(" NUID verification not done successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Professionals getaftercount= new Professionals(driver);
		String afterCount= getaftercount.getNurseSearchCount();
		int AfterSearchCount=Integer.parseInt(afterCount);
		System.out.println("after NUID search count=="+AfterSearchCount);
		logger.info("got NUID search count after search ");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("NUID search count verified successfully");
		} else {
			logger.info("NUID search count NOT verified");
			captureScreen(driver, "NUID search count NOT verified");
			Assert.assertTrue(false);
		}	
	}
}
