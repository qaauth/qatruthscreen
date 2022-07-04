package com.ts.pageobject;
import java.awt.Robot;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility extends NID{

	public Utility(WebDriver rdriver) {
		super(rdriver);	
	}

	@FindBy(id ="stateDropDown")
	@CacheLookup
	WebElement drpdownstate; // For Electricity Bill

	@FindBy(id ="VerificationVerificationNumber")
	@CacheLookup
	WebElement elecbill; // For Electricity Bill

	@FindBy(id ="VerificationPropertyTaxState")
	@CacheLookup
	WebElement propertytaxdrpdown;

	@FindBy(id ="VerificationVerificationNumber")
	@CacheLookup
	WebElement proptaxno;

	@FindBy(id="VerificationVerificationNumber")
	@CacheLookup
	WebElement vehicleregno;  //For Vehicle Reg Verification

	@FindBy(id ="stateDropDown")
	@CacheLookup
	WebElement rcvstatedrpdown; //For Ration Card drop down

	@FindBy(id ="VerificationVerificationNumber")
	@CacheLookup
	WebElement rationcardno; //For Ration Card drop down

	@FindBy(id ="VerificationVerficationNo1")
	@CacheLookup
	WebElement AdRCno; //advance RC verification

	@FindBy(id ="VerificationVerificationNumber")
	@CacheLookup
	WebElement RCno;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[2]/div/div/div[2]/form/ul/li[1]/div/input")
	@CacheLookup
	WebElement Stolenvehicle;

	@FindBy(xpath= "/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div/table/tbody/tr[2]/td[1]")
	@CacheLookup
	WebElement elecbillverificationtext;

	@FindBy(xpath= "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[2]/td[1]")
	@CacheLookup
	WebElement vehregverificationtext;

	@FindBy(xpath= "/html/body/div[1]/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/table/tbody/tr[2]/td[1]")
	@CacheLookup
	WebElement AdvanceRCverificationtext;

	@FindBy(xpath= "/html/body/div[1]/div[2]/div/div/div[2]/div/table/tbody/tr[4]/td[1]")
	@CacheLookup
	WebElement RCverificationtext;

	@FindBy(xpath= "/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div/h3")
	@CacheLookup
	WebElement rationcardverificationtext;

	@FindBy(xpath= "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[3]/td[2]")
	@CacheLookup
	WebElement stolenvehverificationtext;

	@FindBy(xpath= "/html/body/div[1]/div[2]/div/div[2]/div[1]/div/ul/li[2]/div[2]/div/div[2]/a")
	@CacheLookup
	WebElement utilitySearchSummary;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[1]/strong")
	@CacheLookup
	WebElement electricityBillSearchCount;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[2]/strong")
	@CacheLookup
	WebElement vehicleRegSearchCount;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[6]/strong")
	@CacheLookup
	WebElement RationCardSearchCount;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[5]/strong")
	@CacheLookup
	WebElement AdvanceVehicleRcSearchCount;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[3]/strong")
	@CacheLookup
	WebElement DetailRcSearchCount;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[4]/strong")
	@CacheLookup
	WebElement StolenVehicleVerifiSearchCount;

	// action method for Electricity Bill search count
	public String getElectricityBillSearchCount() throws InterruptedException {
		String ElectricityBillCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(utilitySearchSummary));
		utilitySearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Electricity Bill")) {

				ElectricityBillCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return ElectricityBillCount;
	}

	//Action Methods for Electricity Bill Verification
	public void ElectBill() throws InterruptedException {	
		try {
			ldriver.get("https://www.truthscreen.com/Verification/utility");
			wait = new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(drpdownstate));
			Select objSelect = new Select(drpdownstate);
			objSelect.selectByIndex(10);
			Thread.sleep(50);
			elecbill.click();
			elecbill.sendKeys(ElecBillSample());
		} catch (IOException e) {

			e.printStackTrace();
		}
		btnsubmit.click();			
	}		
	public String verifyelecbill() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(elecbillverificationtext));
		String ex = elecbillverificationtext.getText();
		return elecbillverificationtext.getText();	
	}

	// action method for Property Tax verification search count// (NA on LIVE)
	public String getPropertyTaxSearchCount() throws InterruptedException {
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(utilitySearchSummary));
		utilitySearchSummary.click();
		wait.until(ExpectedConditions.visibilityOf(vehicleRegSearchCount));
		return   vehicleRegSearchCount.getText();
	}

	//Action Methods for Property Tax Verification
	public void PropertyTaxVerification() throws InterruptedException {	
		ldriver.get("http://136.233.40.140/truthscreen-uat/Verification/property_tax_verification");	
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(propertytaxdrpdown));
		Select objSelect = new Select(propertytaxdrpdown);
		objSelect.selectByValue("4");
		proptaxno.click();
		proptaxno.sendKeys("SAMPLE NOT AVAILABLE");
		btnsubmit.click();			
	}		
	public String verifyproptax() {
		wait = new WebDriverWait(ldriver, 120);
		//wait.until(ExpectedConditions.visibilityOf("SAMPLE NOT AVAILABLE");
		String ex = elecbillverificationtext.getText();
		System.out.println(ex);				
		return elecbillverificationtext.getText();
	}

	// action method for VEHICLE Registration verification search count
	public String getVehicleRegSearchCount() throws InterruptedException {
		String VehicleRegistrationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(utilitySearchSummary));
		utilitySearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Vehicle Registration")) {

				VehicleRegistrationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return VehicleRegistrationCount;
	}

	//Action Methods for Vehicle Registration Verification
	public void VehicleRegverification() throws InterruptedException {	
		try 
		{
			ldriver.get("https://www.truthscreen.com/Verification/vehicle_reg_verification");
			wait=new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(vehicleregno));
			vehicleregno.click();
			vehicleregno.sendKeys(VehicleRegSample());
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		btnsubmit.click();			
	}		
	public String verifyvehiclereg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(vehregverificationtext));			
		return vehregverificationtext.getText();	
	}

	// Action method for Ration Card verification search count
	public String getRationCardVerifSearchCount() throws InterruptedException {
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(utilitySearchSummary));
		utilitySearchSummary.click();
		wait.until(ExpectedConditions.visibilityOf(RationCardSearchCount));
		return   RationCardSearchCount.getText();
	}
	//Action Methods for Ration Card Verification
	public void RationCardVerification() throws InterruptedException {	
		try {
			ldriver.get("https://www.truthscreen.com/Verification/ration_card_verification");
			wait = new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(rcvstatedrpdown));
			Select objSelect = new Select(rcvstatedrpdown);
			objSelect.selectByIndex(5);
			Thread.sleep(50);
			rationcardno.click();
			rationcardno.sendKeys(RationCardSample());
			btnsubmit.click();	
		} catch (IOException e) {

			e.printStackTrace();
		}
	}		
	public String verifyrationcard() {
		wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(rationcardverificationtext));			
		return rationcardverificationtext.getText();	
	}

	// Action method for Advance VEHICLE RC verification search count
	public String getAdvanceRCSearchCount() throws InterruptedException {
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(utilitySearchSummary));
		utilitySearchSummary.click();
		wait.until(ExpectedConditions.visibilityOf(AdvanceVehicleRcSearchCount));
		return  AdvanceVehicleRcSearchCount.getText();
	}

	//Action Methods for Advanced vehicle RC Verification		
	public void AdvanceRCVerification() throws InterruptedException {		
		try {
			ldriver.get("https://www.truthscreen.com/verification/advance_vehicle_verification");
			wait=new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(AdRCno));
			AdRCno.click();
			AdRCno.sendKeys(RCSample());
			btnsubmit.click();	
		} catch (IOException e) {

			e.printStackTrace();
		}
	}		
	public String verifyAdvanceRC() {
		wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(AdvanceRCverificationtext));			
		return AdvanceRCverificationtext.getText();	
	}

	// Action method for Detail RC verification search count
	public String getDetailRCSearchCount() throws InterruptedException {
		String DetailedRCVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(utilitySearchSummary));
		utilitySearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Detailed RC Verification")) {

				DetailedRCVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return DetailedRCVerificationCount;
	}

	//Action Methods for Detail RC Verification		
	public void RCVerification() throws InterruptedException {		
		try {
			ldriver.get("https://www.truthscreen.com/verification/rc_verification");
			wait = new WebDriverWait(ldriver, 90);
			wait.until(ExpectedConditions.visibilityOf(RCno));
			RCno.click();
			RCno.sendKeys(RCSample());
			btnsubmit.click();	
		} catch (IOException e) {

			e.printStackTrace();
		}
	}		
	public String verifyRC() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(RCverificationtext));			
		return RCverificationtext.getText();	
	}

	//Action method for stolen Vehicle verification search count
	public String getStolenVehicleVeriSearchCount() throws InterruptedException {
		String StolenVehicleVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(utilitySearchSummary));
		utilitySearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Stolen Vehicle Verification")) {

				StolenVehicleVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return StolenVehicleVerificationCount;
	}
	//Action Methods for Stolen Vehicle Verification		
	public void SVVerification() throws InterruptedException, IOException {		
		ldriver.get("https://www.truthscreen.com/verification/stolen_vehicle_verification");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(Stolenvehicle));
		Stolenvehicle.click();
		Stolenvehicle.sendKeys(StolenVehicleample());
		btnsubmit.click();			
	}		
	public String verifySV() {
		wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(stolenvehverificationtext));				
		return stolenvehverificationtext.getText();	
	}						
}