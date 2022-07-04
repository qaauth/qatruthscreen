package com.ts.pageobject;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import com.ts.XLUtils;

public class NID extends XLUtils{

	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Robot rbt;

	public NID(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(id ="verification_number")
	@CacheLookup
	WebElement PAN_no;

	@FindBy(id ="VerificationVerificationNumber")
	@CacheLookup
	WebElement voterid;

	@FindBy(id ="UidaiAadhaarVidNo")
	@CacheLookup
	WebElement aadhar_no;	

	@FindBy(id ="VerificationAadhaarNo")
	@CacheLookup
	WebElement aadhar_no1; //AAdhar Verification

	@FindBy(id ="VerificationLicenseNo")
	@CacheLookup
	WebElement license_no;   //DL

	@FindBy(id ="verification_number")
	@CacheLookup
	WebElement Pannumber;

	@FindBy(id ="VerificationPanNumber")
	@CacheLookup
	WebElement Panitd;

	@FindBy(id="name")
	@CacheLookup
	WebElement eaadhar;

	@FindBy(xpath = "//button[contains(.,'UPLOAD & SUBMIT')]")
	@CacheLookup
	WebElement btnupload; //E Aadhar

	@FindBy(id ="VerificationPanNumber")
	@CacheLookup
	WebElement pnumber;

	@FindBy(id="company")
	@CacheLookup
	WebElement companyName;

	@FindBy(id="enam")
	@CacheLookup
	WebElement employeeName;

	@FindBy(id ="VerificationFullName")
	@CacheLookup
	WebElement pname; 

	@FindBy(id ="verification_number")
	@CacheLookup
	WebElement panaadhar;

	@FindBy(id ="CandidateFileNumber")
	@CacheLookup
	WebElement fileno;

	@FindBy(xpath = "//select[contains(.,'- Select -')]")
	@CacheLookup
	WebElement passportdropdown;

	@FindBy(id ="VerificationDob")
	@CacheLookup
	WebElement dldatePicker;

	@FindBy(id ="VerificationVerificationName")
	@CacheLookup
	WebElement namepan;

	@FindBy(id ="VerificationDateOfBirth")
	@CacheLookup
	WebElement panitddob;

	@CacheLookup
	@FindBy(xpath="//*[@id='VerificationMobileNo']")
	WebElement mobNo;

	@CacheLookup
	@FindBy(xpath="//*[@id='VerificationOtp']")
	WebElement otpVerification;

	@CacheLookup
	@FindBy(xpath="//*[@id='otp_button']")
	WebElement verifyOtpBtn;

	@FindBy(id ="CandidateDateOfBirth")
	@CacheLookup
	WebElement passportdob;

	@FindBy(xpath="//button[contains(.,'Submit')]")
	@CacheLookup
	WebElement btnsubmit;

	@FindBy(xpath = "//option[@value='3']")
	@CacheLookup
	WebElement Option;

	//Verification Locators

	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[1]")
	@CacheLookup
	WebElement Panverificationtext;

	@FindBy(xpath="//table[@class='table table-striped fs-13 c6 mb-30']/tbody/tr[contains(.,'Applicant Full Name')]")
	@CacheLookup
	WebElement AdvPanVerificationtext;

	@FindBy(xpath="//table[@class='table table-striped border-top-f4 voter']/tbody/tr[contains(.,'Company Name')]")
	@CacheLookup
	WebElement EPFOEmployerAdvancetext;

	@FindBy(xpath= "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div/div/p")
	@CacheLookup
	WebElement Passportverificationtext;

	@FindBy(xpath="//*[@id=\"main\"]/div[2]/div/div/div[2]/div/div[2]/div/div/div/h3")
	@CacheLookup
	WebElement voteridverificationtext; 

	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/p")
	@CacheLookup
	WebElement aadharverificationtext; 

	@FindBy(xpath="//*[text()='Aadhaar Verified Successfully']")
	@CacheLookup
	WebElement eadharpverificationtext;

	@FindBy(xpath= "//*[contains(text(),'Detail of Driving License')]")
	@CacheLookup
	WebElement dlverificationtext;

	@FindBy(xpath= "/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[1]")
	@CacheLookup
	WebElement pannameverificationtext;

	@FindBy(xpath= "") //Source Site down 
	@CacheLookup
	WebElement panitdverificationtext;

	@FindBy(xpath= "/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[1]")
	@CacheLookup
	WebElement pannamedobverificationtext;

	@FindBy(xpath= "/html/body/div[1]/div[2]/div/div/div[2]/div[2]/div/table/tbody/tr[6]/td[1]")
	@CacheLookup
	WebElement passportfiletext; 

	@FindBy(xpath= "//span[text()='NID ']/ancestor::li[@class='row']/descendant::a[@class='icon-dot']")
	@CacheLookup
	WebElement NIDSearchSummary;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[1]/strong")
	@CacheLookup
	WebElement panSearchCount;

	@FindBy(xpath="/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[5]/strong[1]") 
	@CacheLookup
	WebElement nurseSearchCount;

	@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'Advanced PAN Verification  ')]/strong")
	@CacheLookup
	WebElement advPanSearchCount;

	@FindBy(xpath="/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[6]/strong[1]")
	@CacheLookup
	WebElement EPFOEmpAdvSearchCount;

	@FindBy(xpath="/html[1]/body[1]/ul[1]/li[1]/div[1]")
	@CacheLookup
	WebElement companyFullname;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[2]/strong")
	@CacheLookup
	WebElement passportSearchCount;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[4]/strong")
	@CacheLookup
	WebElement voterIdSearchCount;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[5]/strong")
	@CacheLookup
	WebElement AadharSearchCount;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[6]/strong")
	@CacheLookup
	WebElement EAadharSearchCount;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[9]/strong")
	@CacheLookup
	WebElement PassportVerificationUsingFileNumSearchCount;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[11]/strong")
	@CacheLookup
	WebElement DlVerifySearchCount;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[13]/strong")
	@CacheLookup
	WebElement PanITDSearchCount;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[14]/strong")
	@CacheLookup
	WebElement PanNameSearchCount;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[16]/strong")
	@CacheLookup
	WebElement PanNameDOBSearchCount;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[17]/strong")
	@CacheLookup
	WebElement PanAadharSeedingSearchCount;

	//ckyc
	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[18]/strong")
	@CacheLookup
	WebElement CKYCSearchCount;

	@FindBy(xpath= "//*[@id='verification_number']")
	@CacheLookup
	WebElement enterPanForCkyc;

	@FindBy(xpath= "//*[contains(text(),'CKYC application status')]")
	@CacheLookup
	WebElement ckycVerifyText;

	@FindBy(xpath= "/html/body/div[5]/div[2]/div/ul/li[15]/strong")
	@CacheLookup
	WebElement adhaarMaskingSearchCount;

	@FindBy(xpath= "//*[@type='file'][@name='front_image']")
	@CacheLookup
	WebElement uploadAdhaarImageBox;

	@FindBy(xpath = "//button[@id='submit-all']")
	@CacheLookup
	WebElement performocr;

	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/p[1]")
	@CacheLookup
	WebElement adhaarMaskingSuccessMsg;

	@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'E-PAN  ')]/strong")
	@CacheLookup
	WebElement EpanSearchCount;

	@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'Aadhaar Paperless : Web API  ')]/strong")
	@CacheLookup
	WebElement AadharPaperlessSearchCount;

	@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'Property Tax  ')]/strong")
	@CacheLookup
	WebElement PropertyTaxSearchCount;

	@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'E-Aadhaar(Digilocker)  ')]/strong")
	@CacheLookup
	WebElement EaadharDigilockerSearchCount;

	@FindBy(xpath="//strong[text()='Entity e-Pan']/ancestor::div[@class='radio']/descendant::input[@type='radio']")
	@CacheLookup
	WebElement entityEpanRadioButton;

	@FindBy(xpath="//input[@id='frontImage']")
	@CacheLookup
	WebElement uplodFrontImageButton;

	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	WebElement submitBtn;

	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr[2]/td[2]")
	@CacheLookup
	WebElement Epanverification;

	//property tax
	@FindBy(xpath="//select[@id='VerificationPropertyTaxState']")
	@CacheLookup
	WebElement Statedropdown;

	@FindBy(xpath="//select[@id='VerificationAndhraDistrict']")
	@CacheLookup
	WebElement Subdistricdropdown;


	@FindBy(xpath="//input[@id='VerificationVerificationNumber']")
	@CacheLookup
	WebElement PropertytaxNO;

	@FindBy(xpath="//table[@class='table table-striped border-top-f4 voter']/tbody/tr[2]/td[contains(.,'Owner Name')]")
	@CacheLookup
	WebElement ownerName;

	//NID Total number of services
	@FindBy(xpath="/html/body/div[5]/div[2]/div/ul/li")
	@CacheLookup
	WebElement TotalServices;


	// action method for PAN search count
	public String getPANSearchCount() throws InterruptedException {
		
		String panCount = null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(NIDSearchSummary));
		NIDSearchSummary.click();
		
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("PAN")) {

				panCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return panCount;
	}

	// Action Methods for PAN Verification
	public void PAN() {		
		ldriver.get("https://www.truthscreen.com/Verification/pan_verification");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(PAN_no));
		XLUtils obj  = new XLUtils();
		String pansamp;
		try {
			pansamp = obj.Pandata();
			PAN_no.click();
			PAN_no.sendKeys(pansamp);
			btnsubmit.click();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public String verifyPAN() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(Panverificationtext));		
		return Panverificationtext.getText();			
	}


	//action method for advance pan search count
	public String getAdvPanSearchCount() throws InterruptedException {
        String advancePanCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(NIDSearchSummary));
		NIDSearchSummary.click();
		
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Advanced PAN Verification")) {

				advancePanCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return advancePanCount;
	}

	// Action Methods for Advance PAN Verification
	public void AdvancePAN() {		
		ldriver.get("https://www.truthscreen.com/Verification/pan_data");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(PAN_no));
		XLUtils obj  = new XLUtils();
		String pansamp;
		try {
			pansamp = obj.Pandata();
			PAN_no.click();
			PAN_no.sendKeys(pansamp);
			btnsubmit.click();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String verifyAdvPAN() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(AdvPanVerificationtext));		
		return AdvPanVerificationtext.getText();			
	}

	//search count for passport
	public String getPassportSearchCount() throws InterruptedException {
		String passportCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(NIDSearchSummary));
		NIDSearchSummary.click();
		
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Passport")) {

				passportCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return passportCount;
	}

	// Action Methods for Passport 	Verification
	public void Passport() throws InterruptedException {
		try 
		{
			ldriver.get("https://www.truthscreen.com/Verification/passport_verification");	
			wait=new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(passportdropdown));
			passportdropdown.click();
			Select objSelect = new Select(passportdropdown);
			passportdropdown.click();
			objSelect.selectByValue(PassportddSample());
			Thread.sleep(3000);

			js=(JavascriptExecutor) ldriver;
			js.executeScript("window.scrollBy(0,1000)");
			btnsubmit.click();
		} catch (IOException e) {
			e.printStackTrace();
		}			  
	}	
	public String verifyPassport() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(Passportverificationtext));			
		return Passportverificationtext.getText();				
	}

	//search count for voterID
	public String getVoterIdSearchCount() throws InterruptedException {
		String voterIDCount=null;

		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(NIDSearchSummary));
		NIDSearchSummary.click();
		
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Voter Id")) {

				voterIDCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return voterIDCount;
	}

	// Action Methods for VoterID Verification
	public void VoterId() {
		try { 
			ldriver.get("https://www.truthscreen.com/Verification/voter_verification");
			wait=new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(voterid));
			XLUtils obj  = new XLUtils();
			String voteridsample;
			voteridsample = obj.VoterIddata();
			voterid.click();
			voterid.sendKeys(voteridsample);
			btnsubmit.click();	
		} catch (IOException e) {
			e.printStackTrace();
		}		   		     
	}
	public String verifyvoterid() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(voteridverificationtext));			
		return voteridverificationtext.getText();				
	}

	//search count for AADHARCARD
	public String getAadharSearchCount() throws InterruptedException {
		
        String AadhaarVerificationtCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(NIDSearchSummary));
		NIDSearchSummary.click();
		
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Aadhaar Verification")) {

				AadhaarVerificationtCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return AadhaarVerificationtCount;
	}
	// Action Methods for AAdhar Verification			   
	public void AadharVerification() {
		try 
		{
			ldriver.get("https://www.truthscreen.com/Verification/uidai_aadhaar_verification");
			wait=new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(aadhar_no1));
			aadhar_no1.click();
			aadhar_no1.sendKeys(AAdhardata());
			btnsubmit.click();  
		} catch (IOException e) {

			e.printStackTrace();
		}		   	 
	}

	public String verifyaadhar() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(aadharverificationtext));		
		return aadharverificationtext.getText();				
	}

	//search count for DL verification
	public String getDLSearchCount() throws InterruptedException {
		String DrivingLicenseCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(NIDSearchSummary));
		NIDSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count  
		for (int r = 4; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Driving License")) {
				DrivingLicenseCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return DrivingLicenseCount;	
	}
	//Action Methods for DL Verification 
	public void DrivingLicenseVerification() throws InterruptedException {
		try {
			ldriver.get("https://www.truthscreen.com/verification/driving_license");
			wait=new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(license_no));
			js=(JavascriptExecutor) ldriver;
			license_no.click();
			license_no.sendKeys(Dldata()); 	  
			js.executeScript("arguments[0].removeAttribute('readonly')",dldatePicker);
			dldatePicker.sendKeys(Dldatadob());      
			btnsubmit.click();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public String verifyDLdetailed() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(dlverificationtext));
		return dlverificationtext.getText();				
	}

	//search count for Pan Name verification
	public String getPanNameSearchCount() throws InterruptedException {
		String PanNameMatchCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(NIDSearchSummary));
		NIDSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Pan Name Match")) {
				PanNameMatchCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return PanNameMatchCount;	
	}

	//Action Methods for PAN Name Verification 
	public void PannameVerification() throws IOException {  	
		ldriver.get("https://www.truthscreen.com/Verification/pan_name_verification");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(Pannumber));
		Pannumber.click();
		Pannumber.sendKeys(Pandata());
		namepan.click();
		namepan.sendKeys(PanNameSample());
		btnsubmit.click(); 
	}
	public String verifyPanname() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(Panverificationtext));				
		return Panverificationtext.getText();				
	}

	//search count for Pan ITD verification
	public String getPanITDSearchCount() {
		String PANITDStatusCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(NIDSearchSummary));
		NIDSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("PAN ITD Status")) {
				PANITDStatusCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return PANITDStatusCount;	
	}
	
	///Action Methods for PAN ITD Status Verification 
	public void PanITDVerification() throws IOException, InterruptedException {  
		ldriver.get("https://www.truthscreen.com/Verification/pan_itd_status");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(Panitd));
		Panitd.click();
		Panitd.sendKeys(Pandata());
		pname.click();
		pname.sendKeys(PanNameSample());
		panitddob.click();
		Thread.sleep(2000);
    	js.executeScript("arguments[0].removeAttribute('readonly')",panitddob);
		Thread.sleep(2000);
		panitddob.sendKeys(PandobSample()); 
		Thread.sleep(500);
		mobNo.sendKeys(STVmobilenoSample());
		btnsubmit.click();
	}
	public String verifyPanITD() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(panitdverificationtext));				
		return panitdverificationtext.getText();				
	}

	//search count for E-Aadahr verification
	public String getEAadharSearchCount() {
		String EAadhaarUploadCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(NIDSearchSummary));
		NIDSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("E-Aadhaar Upload")) {
				EAadhaarUploadCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return EAadhaarUploadCount;	
	}
	//E AAdhar UPLOAD
	public void EaadharVerification(String docUpload) throws IOException, InterruptedException {  
		try {
			ldriver.get("https://www.truthscreen.com/eaadhaar/aadhaar_upload");
			wait = new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(eaadhar));
			eaadhar.click();
			eaadhar.sendKeys(EaadharNameSample());
			ldriver.findElement(By.id("dob")).sendKeys(EaadharyobSample());	
			WebElement browse = ldriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div/div[1]/div[3]/form/div[3]/div/div/div[1]/span"));		  	  
			StringSelection ss = new StringSelection(EaadharpdfSample());
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			browse.click();
			browse.sendKeys(docUpload);
			
//			Robot robot = new Robot();    
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_V);
//			robot.keyRelease(KeyEvent.VK_V);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);    
			Thread.sleep(500);
			js=(JavascriptExecutor) ldriver;
			js.executeScript("window.scrollBy(0,350)");          
			btnupload.click();	
			Thread.sleep(1000);	
		}catch(Exception e){
			System.out.println("exception ="+e);
		}
	}
	public String verifyeaadhar() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(eadharpverificationtext));				
		return eadharpverificationtext.getText();				
	}

	//search count for Pan Name DOB verification
	public String getPanNameDOBSearchCount() {
		String PanNameDobCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(NIDSearchSummary));
		NIDSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Pan Name Dob")) {
				PanNameDobCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return PanNameDobCount;	
	}
	// PAN NAME DOB 
	public void PannamedobVerification() throws InterruptedException { 
		try {
			ldriver.get("https://www.truthscreen.com/Verification/pan_name_dob");
			wait = new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(pnumber));
			js=(JavascriptExecutor) ldriver;
			pnumber.click();
			pnumber.sendKeys(Pandata());
			pname.click();
			pname.sendKeys(PanNameSample());
			panitddob.click(); 
			js.executeScript("arguments[0].removeAttribute('readonly')",panitddob);
			Thread.sleep(2000);
			panitddob.sendKeys(PandobSample()); 
			Thread.sleep(500);
			mobNo.sendKeys(PanMobSample());
			Thread.sleep(500);
			btnsubmit.click();
			wait.until(ExpectedConditions.visibilityOf(otpVerification));
			otpVerification.sendKeys("12345");
			verifyOtpBtn.click();
		} catch (IOException e) {

			e.printStackTrace();
		} 
	}
	public String verifypannamedob() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(pannamedobverificationtext));				
		return pannamedobverificationtext.getText();			
	}
	
	//search count for Pan Aadhar seeding verification
	public String getPanAadharSeedingSearchCount() {
		String PANAadharSeedingCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(NIDSearchSummary));
		NIDSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("PAN Aadhar Seeding")) {
				PANAadharSeedingCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return PANAadharSeedingCount;	
	}
	//PAN Aadhar Seeding
	public void PanaadharVerification() {  
		try {
			ldriver.get("https://www.truthscreen.com/Verification/panaadhar_verification");
			wait = new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(panaadhar));
			panaadhar.click();
			panaadhar.sendKeys(Pandata());
		} catch (IOException e) {

			e.printStackTrace();
		}
		btnsubmit.click();
	}
	public String verifyPanaadhar() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(Panverificationtext));				
		return Panverificationtext.getText();				
	}

	//search count for Passport verification using file  number
	public String getPassportVerificationUsingFileNumSearchCount() {
		String passportverificationusingfilenumberCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(NIDSearchSummary));
		NIDSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("passport verification using file number")) {
				passportverificationusingfilenumberCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return passportverificationusingfilenumberCount;	
	}

	// Passport verification using file number
	public void PassportFileVerification() { 
		js=(JavascriptExecutor) ldriver;
		try {
			ldriver.get("https://www.truthscreen.com/Verification/passport_verification_fileno");
			wait = new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(fileno));	
			fileno.click();
			fileno.sendKeys(PassportfileSample());
			passportdob.click();
			js.executeScript("arguments[0].removeAttribute('readonly')",passportdob);  
			passportdob.sendKeys(PassportdobSample());
			btnsubmit.click();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public String verifyPassportfile() 
	{
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(passportfiletext));			
		return passportfiletext.getText();				
	}

	//search count for ckyc
	public String getCKYCsearchCount() throws InterruptedException {
		String ckycCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(NIDSearchSummary));
		NIDSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("CKYC")) {
				ckycCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return ckycCount;
	}

	//action method for ckyc verification
	public void ckycVerification() {
		ldriver.get("https://www.truthscreen.com/Ckyc");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(enterPanForCkyc));
		try {
			enterPanForCkyc.click();
			enterPanForCkyc.sendKeys(cKycSample());
			btnsubmit.click();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	//verify ckyc verification success msg
	public String verifyCkycSuccessMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(ckycVerifyText));			
		return ckycVerifyText.getText();				
	}

	//search count for adhaar msking
	public String getAdhaarMaskingsearchCount() throws InterruptedException {
		String AadhaarmaskingCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(NIDSearchSummary));
		NIDSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Aadhaar masking")) {
				AadhaarmaskingCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return AadhaarmaskingCount;
	}
	//action method for adhaar masking
	public void adhaarMasking() {
		try {
			ldriver.get("https://www.truthscreen.com/ocrverification/aadhaar_masking_ocr");
			wait=new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(uploadAdhaarImageBox));
			uploadAdhaarImageBox.sendKeys(Aadhaocr1Sample());
			Thread.sleep(500);
			//js.executeScript("arguments[0].scrollIntoView();", performocr);
			performocr.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//verify adhaar masking success msg
	public String verifyAdhaarMaskingSuccessMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(adhaarMaskingSuccessMsg));			
		return adhaarMaskingSuccessMsg.getText();				
	}


	//search count for EPFO Employer Advance count Verification
	public String getEPFOEmployerAdvancedCount() throws InterruptedException {
		String EPFOEmployerAdvancedCount=null;
		ldriver.get("https://qa.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(NIDSearchSummary));
		NIDSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("EPFO Employer Advanced")) {
				EPFOEmployerAdvancedCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return EPFOEmployerAdvancedCount;
	}
	//action method for EPFO Employer Advance
	public void EPFOEmployerAdvanced() {		
		ldriver.get("https://qa.truthscreen.com/Verification/epfo_db");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(companyName));
		XLUtils obj  = new XLUtils();
		String EPFOEmployerCompanyName;
		String EPFOEmployerEmployeeName;
		try {
			EPFOEmployerCompanyName = obj.EmpAdvaverificationCompanyNameSample();
			companyName.click();
			companyName.sendKeys(EPFOEmployerCompanyName);
			wait.until(ExpectedConditions.visibilityOf(companyFullname));
			Actions actions= new Actions(ldriver);
			actions.moveToElement(companyFullname);
			actions.sendKeys(Keys.ARROW_DOWN).click().build().perform();//

			EPFOEmployerEmployeeName = obj.EmpAdvaverificationEmployeeNameSample();
			employeeName.click();
			employeeName.sendKeys(EPFOEmployerEmployeeName);
			btnsubmit.click();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	//verify EPFO Employer Advance msg
	public String verifyEPFOAdvanceDetaiMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(EPFOEmployerAdvancetext));			
		return EPFOEmployerAdvancetext.getText();

	}


	// action method for Property-Tax search count
	public String getPropertyTaxSearchCount() throws InterruptedException {
		String PropertyTaxCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(NIDSearchSummary));
		NIDSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Property Tax")) {
				PropertyTaxCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return PropertyTaxCount;
	}
	//action method for Property tax
	public void PropertytaxVerification() throws InterruptedException {	
		try {
			ldriver.get("https://www.truthscreen.com/Verification/property_tax_verification");
			wait = new WebDriverWait(ldriver, 20);
			wait.until(ExpectedConditions.visibilityOf(Statedropdown));
			Select objSelect = new Select(Statedropdown);
			objSelect.selectByIndex(1);
			Thread.sleep(1000);
			Select objSelect1 = new Select(Subdistricdropdown);
			objSelect1.selectByIndex(1);
			Thread.sleep(1000);
			PropertytaxNO.sendKeys(PropertytaxNo());
			submitBtn.click();	
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	//verify property tax msg
	public String verifyPropertyTaxverificationMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(ownerName));			
		return ownerName.getText();
	}


	// action method for E-PAN search count//newly added//qa
	public String getEpanSearchCount() throws InterruptedException {
		String EPANCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(NIDSearchSummary));
		NIDSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("E-PAN")) {
				EPANCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return EPANCount;
	}
	// action method for E-PAN
	public void EpanVerification() throws InterruptedException {	
		try {
			ldriver.get("https://www.truthscreen.com/Verification/e_pan");
			wait = new WebDriverWait(ldriver, 20);
			wait.until(ExpectedConditions.visibilityOf(entityEpanRadioButton));
			entityEpanRadioButton.click();
			Thread.sleep(500);
			uplodFrontImageButton.sendKeys(EPandata());
			//js.executeScript("arguments[0].scrollIntoView(true);",submitBtn);

			submitBtn.click();	
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	//Epan verification 
	public String verifyEpanverificationMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(Epanverification));			
		return Epanverification.getText();
	}
}





