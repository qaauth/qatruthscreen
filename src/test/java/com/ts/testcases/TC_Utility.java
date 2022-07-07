package com.ts.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ts.pageobject.Bank;
import com.ts.pageobject.NID;
import com.ts.pageobject.Utility;

public class TC_Utility extends BaseClass {

	//Electricity Bill
	@Test(enabled = true, testName = "Electricity Bill", priority = 1 )
	public void ElecbillVerification() throws IOException, InterruptedException 
	{	
		Utility  getbeforecount= new Utility (driver);
		String beforecount= getbeforecount.getElectricityBillSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Electricity Bill search count=="+BeforeSearchCount);
		logger.info("got Electricity Bill search count before search");
		Thread.sleep(100);
		Utility elec_bill= new Utility(driver);
		elec_bill.ElectBill();	 
		logger.info("electricity bill Sample submitted");
		if (elec_bill.verifyelecbill().contains("Name")) {
			Assert.assertTrue(true);
			logger.info("Electricity Bill verification performed successfully!");
		} else {
			logger.info("Electricity Bill verification not performed successfully!");
			captureScreen(driver, "Electricity Bill verification not performed successfully");
			Assert.assertTrue(false);
		}
		Utility  getaftercount= new Utility (driver);
		String aftercount= getaftercount.getElectricityBillSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Electricity Bill search count=="+AfterSearchCount);
		logger.info("got Electricity Billsearch count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Electricity Bill search count verified successfully");
		} else 
		{
			logger.info("Electricity Bill search count NOT verified");
			captureScreen(driver, "Electricity Bill search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	//Property Tax (Service Not working) (NA-ON LIVE)
	@Test(enabled = false, testName = "Property Tax Verification", priority = 1 )
	public void ProptaxVerification() throws IOException, InterruptedException 
	{	
		Utility  getbeforecount= new Utility (driver);
		String beforecount= getbeforecount.getPropertyTaxSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Property Tax search count=="+BeforeSearchCount);
		logger.info("got Property Tax search count before search");
		Thread.sleep(100);
		Utility proptax= new Utility(driver);
		proptax.PropertyTaxVerification();	 
		logger.info("Sample submitted");
		if (proptax.verifyproptax().contains("Name")) {
			Assert.assertTrue(true);
			logger.info("Property Tax verification performed successfully!");
		} else {
			logger.info(" Property Tax verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Utility  getaftercount= new Utility (driver);
		String aftercount= getaftercount.getPropertyTaxSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Property Tax search count=="+AfterSearchCount);
		logger.info("got Property Tax search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Property Tax search count verified successfully");
		} else 
		{
			logger.info("Property Tax search count NOT verified");
			captureScreen(driver, "Property Tax search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	// Vehicle Registration verification 
	@Test(enabled = true, testName = "Vehicle Registration", priority = 1 )
	public void VehicleregVerification() throws IOException, InterruptedException 
	{	
		Utility  getbeforecount= new Utility (driver);
		String beforecount= getbeforecount.getVehicleRegSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Vehicle Registration search count=="+BeforeSearchCount);
		logger.info("got Vehicle Registrationsearch count before search");
		Thread.sleep(100);
		Utility vehicle_reg= new Utility(driver);
		vehicle_reg.VehicleRegverification();	 
		logger.info("Vehicle Registration Sample submitted");
		if (vehicle_reg.verifyvehiclereg().contains("Registration Number")) 
		{
			Assert.assertTrue(true);
			logger.info("Vehicle Registration verification performed successfully!");
		} else {
			logger.info("Vehicle Registration verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Utility  getaftercount= new Utility (driver);
		String aftercount= getaftercount.getVehicleRegSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Vehicle Registration search count=="+AfterSearchCount);
		logger.info("got Vehicle Registration search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Vehicle Registration search count verified successfully");
		} else 
		{
			logger.info("Vehicle Registration search count NOT verified");
			captureScreen(driver, "Vehicle Registration search count NOT verified");
			Assert.assertTrue(false);
		}	
	}	 	

	// Ration card verification (service removed from live)
	@Test(enabled = false, testName = "Ration Card Registration Verification", priority = 1 )
	public void RationcardVerification() throws IOException, InterruptedException 
	{	
		Utility  getbeforecount= new Utility (driver);
		String beforecount= getbeforecount.getRationCardVerifSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Ration Card Registration search count=="+BeforeSearchCount);
		logger.info("got Ration Card Registration search count before search");
		Thread.sleep(100);
		Utility rcv= new Utility(driver);
		rcv.RationCardVerification(); 
		logger.info("Ration Card Registration Sample submitted");
		if (rcv.verifyrationcard().contains("Ration Card Details")) 
		{
			Assert.assertTrue(true);
			logger.info("Ration Card  verification performed successfully!");
		} else 
		{
			logger.info("Ration Card  verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Utility  getaftercount= new Utility (driver);
		String aftercount= getaftercount.getRationCardVerifSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Ration Card Registration search count=="+AfterSearchCount);
		logger.info("got Ration Card Registration search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Ration Card Registration search count verified successfully");
		} else 
		{
			logger.info("Ration Card Registration search count NOT verified");
			captureScreen(driver, "Ration Card Registration search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	// Advance RC Verification   (service removed from live)
	@Test(enabled = false, testName = "Advanced RC Verification", priority = 1 )
	public void AdRCVerification() throws IOException, InterruptedException 
	{	
		Utility  getbeforecount= new Utility (driver);
		String beforecount= getbeforecount.getAdvanceRCSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Advanced RC search count=="+BeforeSearchCount);
		logger.info("got Advanced RC search count before search");
		Thread.sleep(100);
		Utility adrcveri= new Utility(driver);
		adrcveri.AdvanceRCVerification(); 
		logger.info("Sample submitted");
		if (adrcveri.verifyAdvanceRC().contains("Registration Number")) 
		{
			Assert.assertTrue(true);
			logger.info("Advance RC verification performed successfully!");
		} else 
		{
			logger.info("Advance RC verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Utility  getaftercount= new Utility (driver);
		String aftercount= getaftercount.getAdvanceRCSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Advanced RC verify search count=="+AfterSearchCount);
		logger.info("got Advanced RC search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Advanced RC search count verified successfully");
		} else 
		{
			logger.info("Advanced RC search count NOT verified");
			captureScreen(driver, "Advanced RC search count NOT verified");
			Assert.assertTrue(false);
		}	
	}
	/// Detail RC Verification   
	@Test(enabled = true, testName = "RC Verification", priority = 1 )
	public void RCVerification() throws IOException, InterruptedException 
	{	
		Utility  getbeforecount= new Utility (driver);
		String beforecount= getbeforecount.getDetailRCSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Detail RC search count=="+BeforeSearchCount);
		logger.info("got Detail RC search count before search");
		Thread.sleep(100);  
		Utility rcveri= new Utility(driver);
		rcveri.RCVerification(); 
		logger.info("Detail RC Sample submitted");
		if (rcveri.verifyRC().contains("Fuel Type")) 
		{
			Assert.assertTrue(true);
			logger.info("RC verification performed successfully!");
		} else 
		{
			logger.info("RC verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Utility  getaftercount= new Utility (driver);
		String aftercount= getaftercount.getDetailRCSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Detail RC verify search count=="+AfterSearchCount);
		logger.info("got Detail RC search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Detail RC search count verified successfully");
		} else 
		{
			logger.info("Detail RC search count NOT verified");
			captureScreen(driver, "Detail RC search count NOT verified");
			Assert.assertTrue(false);
		}	
	}

	/// Stolen Vehicle Verification //test data not available
	@Test(enabled = true, testName = "Stolen Vehicle Registration", priority = 1 )
	public void StolenVehicleVerification() throws IOException, InterruptedException 
	{	
		Utility  getbeforecount= new Utility (driver);
		String beforecount= getbeforecount.getStolenVehicleVeriSearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before Stolen Vehicle verify search count=="+BeforeSearchCount);
		logger.info("got Stolen Vehicle verify search count before search");
		Thread.sleep(100);	
		Utility rcv= new Utility(driver);
		rcv.SVVerification(); 
		logger.info("Stolen Vehicle verify Sample submitted");
		if (rcv.verifySV().contains("STOLEN/THEFT")) {
			Assert.assertTrue(true);
			logger.info("Stolen Vehicle verification performed successfully!");
		} else {
			logger.info("Stolen Vehicle verification not performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Utility  getaftercount= new Utility (driver);
		String aftercount= getaftercount.getStolenVehicleVeriSearchCount();
		int AfterSearchCount=Integer.parseInt(aftercount);
		System.out.println("after Stolen Vehicle verify search count=="+AfterSearchCount);
		logger.info("got Stolen Vehicle verify search count after search");
		Thread.sleep(100);
		if((AfterSearchCount-BeforeSearchCount)==1) {
			Assert.assertTrue(true); 
			logger.info("Stolen Vehicle verify search count verified successfully");
		} else {
			logger.info("Stolen Vehicle verify search count NOT verified");
			captureScreen(driver, "Stolen Vehicle verify  search count NOT verified");
			Assert.assertTrue(false);
		}	
	}
}





