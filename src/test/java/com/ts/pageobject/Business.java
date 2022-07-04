package com.ts.pageobject;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Business extends NID{

	public Business(WebDriver rdriver) {
		super(rdriver);
	}

	//*********Elements*****///
	@FindBy(id ="MasterCompanyDin")
	@CacheLookup
	WebElement din_no;

	@FindBy(id ="auto_complete11")
	@CacheLookup
	WebElement dinname;

	@FindBy(xpath = "//input[@id='MasterCompanyCin']")
	@CacheLookup
	WebElement cin_no;

	@FindBy(id ="VerificationTinNumber")
	@CacheLookup
	WebElement tin_no;

	@FindBy(id ="VerificationVerificationNumber")
	@CacheLookup
	WebElement service_tax_no;

	@FindBy(id ="stateDropDown")
	@CacheLookup
	WebElement shopdropdown;

	@FindBy(id ="VerificationVerificationNumber")
	@CacheLookup
	WebElement Shopnest_no;

	@FindBy(id="VerificationState")
	@CacheLookup
	WebElement druglicensedropdown;

	@FindBy(id="VerificationLicenseNumber")
	@CacheLookup
	WebElement druglicenseno;

	@FindBy(id="VerificationUamNumber")
	@CacheLookup
	WebElement UAM;

	@FindBy(id="VerificationVerificationNumber")
	@CacheLookup
	WebElement PANdirector;

	@FindBy(id="VerificationVerificationNumber")
	@CacheLookup
	WebElement ESIC;

	@FindBy(id="VerificationVerificationNumber")
	@CacheLookup
	WebElement IEC;

	@FindBy(id="VerificationVerificationNumber")
	@CacheLookup
	WebElement GST;

	@FindBy(id="VerificationDetails")
	@CacheLookup
	WebElement GSTdropdown;

	@FindBy(id="VerificationCinNumber")
	@CacheLookup
	WebElement industrytype;

	@FindBy(id="VerificationVerificationNumber")
	@CacheLookup
	WebElement PAN_GST;

	@FindBy  (xpath ="//input[@id='company_name_text']") //(id="company_name_text")
	@CacheLookup
	WebElement company_search ;

	@FindBy(id="VerificationPanNumber")
	@CacheLookup
	WebElement GSTIN_PAN;

	@FindBy(id="VerificationVerificationNumber")
	@CacheLookup
	WebElement GSTINverification;

	@FindBy(id="VerificationDetails")
	@CacheLookup
	WebElement GSTINverificationDetail;

	@FindBy(id="VerificationCompanyName")
	@CacheLookup
	WebElement Creditratings;

	@FindBy(xpath = "//*[@id='stateId']") 
	@CacheLookup
	WebElement  esicempdropdown1;

	@FindBy(xpath = "//*[@id='districtId']") 
	@CacheLookup
	WebElement  esicempdropdown2;

	@FindBy(xpath ="//input[@name='employer']") 
	@CacheLookup
	WebElement  esicemployer;

	@FindBy(id ="VerificationVerificationNumber") 
	@CacheLookup
	WebElement  Fssaino;

	@FindBy(xpath="//*[@id='VerificationState']") 
	@CacheLookup
	WebElement  STVstate; //Street Vendor select State

	@FindBy(id ="VerificationUlbname") 
	@CacheLookup
	WebElement  STVulbno;

	@FindBy(id ="VerificationVoteridcard") 
	@CacheLookup
	WebElement  STVvoteridcard;

	@FindBy(id ="VerificationCertificatevendingno") 
	@CacheLookup
	WebElement  STVcertificate;

	@FindBy(id ="VerificationNamestreetname") 
	@CacheLookup
	WebElement  STVname;

	@FindBy(id ="VerificationFathername") 
	@CacheLookup
	WebElement  STVfathername;

	@FindBy(id ="VerificationMobileno") 
	@CacheLookup
	WebElement  STVmobileno;

	@FindBy(id ="VerificationVerificationNumber") 
	@CacheLookup
	WebElement cgst;

	@FindBy(id ="stateDropDown") 
	@CacheLookup
	WebElement cgstdropdown;
	
	@FindBy(xpath = "//*[@id='submitBtn']")
	@CacheLookup
	WebElement SubmitButton1;
	
	@FindBy (xpath ="//button[contains(.,'Search')]")
	@CacheLookup
	WebElement Searchbutton;
	

	@FindBy(xpath ="//span[text()='Businesses ']/ancestor::li[@class='row']/descendant::a[@class='icon-dot']") 
	@CacheLookup
	WebElement  businessSearchSummary; 

	// Assertion/ Verification texts
	@FindBy(xpath ="/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div/table/thead/tr/th[2]")
	@CacheLookup
	WebElement dinverificationtext;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div/table/thead/tr/th[1]")
	@CacheLookup
	WebElement cinverificationtext;

	@FindBy(xpath ="")  //TBD
	@CacheLookup
	WebElement tinverificationtext;

	@FindBy(xpath ="")//TBD
	WebElement staxverificationtext;


	@FindBy(xpath ="//*[text()='IE Code']")
	WebElement IECverificationtext;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div/table/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement shopnestverificationtext;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div/table/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement druglicenseverificationtext;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[2]/div[2]/table/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement uamverificationtext;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/table/tbody/tr[2]/td[1]") 
	@CacheLookup
	WebElement panverificationtext;

	@FindBy(xpath ="//*[@id=\"main\"]/div[2]/div[1]/div/div[2]/div[2]/h4") 
	@CacheLookup
	WebElement pandirectorverificationtext;


	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div/h3") 
	@CacheLookup
	WebElement esicverificationtext;

	@FindBy(xpath ="//*[contains(text(),'GSTIN Details')]") 
	@CacheLookup
	WebElement gstINverificationtext;

	@FindBy(xpath ="//*[@id='main']/div[2]/div/div/div[2]/div[2]/h4") 
	@CacheLookup
	WebElement indtypeverificationtext;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div/table/tbody/tr[2]/td[1]") 
	@CacheLookup
	WebElement PAN_GSTverificationtext;

	@FindBy(xpath= "//table[@class='table table-striped fs-13 c6']/thead/tr/th[2]") 
	@CacheLookup
	WebElement csverificationtext;

	@FindBy(xpath ="//*[@id='main']/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div/table/thead/tr/th[2]") 
	@CacheLookup
	WebElement gstinpanverificationtext;

	@FindBy(xpath ="//*[text()='GSTIN Details']") 
	@CacheLookup
	WebElement gstinTaxpayerverificationtext;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[1]/span") 
	@CacheLookup
	WebElement  creditratingverificationtext;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[2]/td[1]") 
	@CacheLookup
	WebElement  esicempverificationtext;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td") 
	@CacheLookup
	WebElement  fssaiverificationtext;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div/h3") 
	@CacheLookup
	WebElement  STVverificationtext;

	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'DIN  ')]/strong") 
	@CacheLookup
	WebElement  dinVerificationSearchCount;

	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'CIN Search  ')]/strong") 
	@CacheLookup
	WebElement  cinVerificationSearchCount;

	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'Shop & Establishment  ')]/strong") 
	@CacheLookup
	WebElement  ShopnEstablishmentSearchCount;

	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'Drug License  ')]/strong") 
	@CacheLookup
	WebElement  DrugLicenseVerificationSearchCount;

	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'Udyog Aadhaar  ')]/strong") 
	@CacheLookup
	WebElement UdyogAadharVerificationSearchCount;

	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'PAN-Director  ')]/strong") 
	@CacheLookup
	WebElement PANDirectorVerificationSearchCount;

	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'ESIC  ')]/strong") 
	@CacheLookup
	WebElement   ESICVerificationSearchCount;

	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'IEC  ')]/strong") 
	@CacheLookup
	WebElement   IECVerificationSearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[9]/strong") 
	@CacheLookup
	WebElement   gstVerificationSearchCount;

	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'Industry Type  ')]/strong") 
	@CacheLookup
	WebElement   IndustryTypeSearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[11]/strong") 
	@CacheLookup
	WebElement   KnowUrPANUsingGSTSearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[12]/strong") 
	@CacheLookup
	WebElement   CompanyNameSearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[13]/strong") 
	@CacheLookup
	WebElement   KnowYourGSTinPANINDIASearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[14]/strong") 
	@CacheLookup
	WebElement   GSTINTaxpayerVerificationSearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[17]/strong") 
	@CacheLookup
	WebElement   CreditRatingsSearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[19]/strong") 
	@CacheLookup
	WebElement   EsicEmployerVerificationSearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[20]/strong") 
	@CacheLookup
	WebElement   FssaiVerificationSearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[21]/strong") 
	@CacheLookup
	WebElement   StreetVendorVerificationSearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[23]/strong") 
	@CacheLookup
	WebElement   ComprehensiveGSTVerificationSearchCount;

	//gstr return

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[18]/strong") 
	@CacheLookup
	WebElement GSTRreturnVerificationSearchCount;

	@FindBy(xpath ="//*[@id='gstrUsername']") 
	@CacheLookup
	WebElement GSTRreturnUsername;

	@FindBy(xpath ="//*[@id='submitBtn1']") 
	@CacheLookup
	WebElement submitBtn;

	@FindBy(xpath ="//*[@id='submitBtn']") 
	@CacheLookup
	WebElement submitButton;

	@FindBy(xpath ="//*[@id='gstrVerificationNumber']") 
	@CacheLookup
	WebElement GSTRreturnNo;

	@FindBy(xpath ="//*[contains(text(),'Active token fetched successfully.')]") 
	@CacheLookup
	WebElement GSTRreturnSuccessMsg;
	
	@FindBy(xpath ="//option[contains(.,'Haryana')]")
	@CacheLookup
	WebElement StateOption;

	//comprehensive GST aDVANCE
	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[24]/strong") 
	@CacheLookup
	WebElement cGstAdvancedVerificationSearchCount;

	@FindBy(xpath ="//*[contains(text(),'Active token fetched successfully.')]") 
	@CacheLookup
	WebElement cGstAdvVerifySuccessMsg;

	//udyam verification
	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[26]/strong") 
	@CacheLookup
	WebElement udyamVerificationSearchCount;

	@FindBy(xpath ="//*[@id='VerificationUdyamNumber']") 
	@CacheLookup
	WebElement enterUdyamRegistrationNum;

	@FindBy(xpath ="//*[contains(text(),'Name of Enterprise')]") 
	@CacheLookup
	WebElement UdyamVerificationSuccessMsg;

	//Udyog Adhhar using phone verification
	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[16]/strong") 
	@CacheLookup
	WebElement udyogAdhaarUsingPhoneSearchCount;

	@FindBy(xpath ="//*[@id='VerificationUamNumber']") 
	@CacheLookup
	WebElement enterUAMnumber;

	@FindBy(xpath ="//*[@id='VerificationPhoneNumber']") 
	@CacheLookup
	WebElement enterPhoneNumber;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[2]/div[2]/h4") 
	@CacheLookup
	WebElement udyogAdhaarUsingPhoneVerificationSuccessMsg;

	//gstIN View and Track Return
	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[15]/strong") 
	@CacheLookup
	WebElement gstViewAndTrackReturnSearchCount;

	@FindBy(xpath ="//*[@id='VerificationVerificationNumber']") 
	@CacheLookup
	WebElement enterGSTnumber;

	@FindBy(xpath ="//*[@id='stateDropDown']") 
	@CacheLookup
	WebElement enterFinancialYear;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div/table/thead/tr/th[1]") 
	@CacheLookup
	WebElement gstTrackReturnVerificationSuccessMsg;

	//GST Basis PAN
	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'GST Basis PAN  ')]/strong") 
	@CacheLookup
	WebElement GSTBasisPANSearchCount;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[3]")
	@CacheLookup
	WebElement GstUinStatusVerification;

	@FindBy(xpath="//button[@type='submit']")  
	@CacheLookup
	WebElement SubmitButton;

	// action method for Din verification search count
	public String getDinVerificationSearchCount() throws InterruptedException {
		String DINCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("DIN")) {

				DINCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return DINCount;
	}

	//Action Methods for Din Verification
	public void DIN() throws InterruptedException {	
		try {
			ldriver.get("https://www.truthscreen.com/search/director_listing");
			wait = new WebDriverWait(ldriver, 10);
			wait.until(ExpectedConditions.visibilityOf(dinname));
			dinname.click();
			dinname.sendKeys(DinnameSample());		
			wait = new WebDriverWait(ldriver, 10);
			wait.until(ExpectedConditions.visibilityOf(din_no));
			din_no.click();
			din_no.sendKeys(DinnoSample());
			Searchbutton.click();			
		}		
		catch (IOException e) 
		{
			e.printStackTrace();
		}	
	}
	public String verifyDin() {
		wait = new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(dinverificationtext));
		return dinverificationtext.getText();	
	}

	// action method for Cin verification search count
	public String getCinVerificationSearchCount() throws InterruptedException {
		String CINSearchCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("CIN Search")) {

				CINSearchCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return CINSearchCount;
	}
	//Action Methods for CIN Verification
	public void CIN() {
		try {
			ldriver.get("https://www.truthscreen.com/search");
			wait = new WebDriverWait(ldriver, 10);
			wait.until(ExpectedConditions.visibilityOf(cin_no));
			cin_no.click();
			cin_no.sendKeys(CinSample());		
			Searchbutton.click();			
		}		
		catch (IOException e) 
		{	
			e.printStackTrace();
		}	
	}
	public String verifyCin() {
		wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(cinverificationtext));	
		return cinverificationtext.getText();	
	}

	// action method for Tin verification search count(removed from live)
	public String getTinVerificationSearchCount() throws InterruptedException {
		String TINCount=null;
		String TinVerificationSearchCount="";
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		Thread.sleep(500);
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("TIN")) {

				TINCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return TINCount;
	}
	//Action Methods for Tin Verification
	public void TIN() {
		try 
		{
			ldriver.get("http://136.233.40.140/truthscreen-uat/search/tin_verification");
			wait = new WebDriverWait(ldriver, 90);
			wait.until(ExpectedConditions.visibilityOf(tin_no));
			tin_no.click();
			tin_no.sendKeys(TinSample());		
			btnsubmit.click();			
		}		
		catch (IOException e) 
		{	
			e.printStackTrace();
		}	
	}
	public String verifyTin() {
		wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(tinverificationtext));				
		return tinverificationtext.getText();	
	}

	//Action Methods for Service tax Verification//(SERVICES REMOVED FROM LIVE)
	public void ServiceTax() {
		try 
		{
			ldriver.get("http://136.233.40.140/truthscreen-uat/search/get_service_tax_detail");
			wait = new WebDriverWait(ldriver, 90);
			wait.until(ExpectedConditions.visibilityOf(service_tax_no));
			service_tax_no.click();
			service_tax_no.sendKeys(ServiceTaxSample());		
			btnsubmit.click();			
		}		
		catch (IOException e) 
		{	
			e.printStackTrace();
		}	
	}
	public String verifyServiceTax() {
		wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(staxverificationtext));				
		return staxverificationtext.getText();	
	}

	// action method for Shop n Establishment search count
	public String getShopnEstablishmentSearchCount() throws InterruptedException {
		String ShopAndEstablishmentCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Shop & Establishment")) {

				ShopAndEstablishmentCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return ShopAndEstablishmentCount;
	}
	//Action Methods for Shop n Establishment Verification
	public void ShopNEstablishement() {
		try {
			ldriver.get("https://www.truthscreen.com/Verification/shop_establishment");
			wait = new WebDriverWait(ldriver, 90);
			wait.until(ExpectedConditions.visibilityOf(shopdropdown));
			Select objSelect = new Select(shopdropdown);
			objSelect.selectByValue("2");
			Shopnest_no.click();
			Shopnest_no.sendKeys(ShopSample());		 
			btnsubmit.click();			
		}		
		catch (IOException e) 
		{	
			e.printStackTrace();
		}	
	}
	public String verifyShopnestablishement() {
		wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(shopnestverificationtext));				
		return shopnestverificationtext.getText();	
	}

	// action method for Drug License Verification search count
	public String getDrugLicenseVerificationSearchCount() throws InterruptedException {
		String DrugLicenseCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Drug License")) {

				DrugLicenseCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return DrugLicenseCount;
	}
	//Action Methods for Drug License Verification
	public void DrugLicense() {
		try {
			ldriver.get("https://www.truthscreen.com/Verification/drug_license_verification");
			wait = new WebDriverWait(ldriver, 90);
			wait.until(ExpectedConditions.visibilityOf(druglicensedropdown));
			Select objSelect = new Select(druglicensedropdown);
			objSelect.selectByIndex(2);
			druglicenseno.click();
			druglicenseno.sendKeys(DrugSample());		 
			btnsubmit.click();			
		}		
		catch (IOException e) 
		{	
			e.printStackTrace();
		}	
	}
	public String VerifyDrugLicense() {
		wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(druglicenseverificationtext));				
		return druglicenseverificationtext.getText();	
	}
	
	// action method for Udyog Aadhar Verification search count
	public String getUdyogAadharVerificationSearchCount() throws InterruptedException {
		String UdyogAadhaarCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Udyog Aadhaar")) {

				UdyogAadhaarCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return UdyogAadhaarCount;
	}
	//Action Methods for Udyog Aadhar Verification
	public void UdyogAdhaar() {
		try {
			ldriver.get("https://www.truthscreen.com/Verification/udyog_aadhaar");
			wait=new WebDriverWait(ldriver, 90);
			wait.until(ExpectedConditions.visibilityOf(UAM));
			UAM.click();
			UAM.sendKeys(UdyogAdhaarSample());		 
			btnsubmit.click();			
		}		
		catch (IOException e) 
		{	
			e.printStackTrace();
		}	
	}
	public String VerifyUdyogAdhaar() {
		wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(uamverificationtext));				
		return uamverificationtext.getText();	
	}

	// action method for PAN Director Verification search count
	public String getPANDirectorVerificationSearchCount() throws InterruptedException {
		String PANDirectorCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("PAN-Director")) {

				PANDirectorCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return PANDirectorCount;
	}

	//Action Methods for PAN Director Verification
	public void PANdirector() {
		try {
			ldriver.get("https://www.truthscreen.com/Search/pan_director_verification");
			wait=new WebDriverWait(ldriver, 90);
			wait.until(ExpectedConditions.visibilityOf(PANdirector));
			PANdirector.click();
			PANdirector.sendKeys(PANdirectorSample());		 
			btnsubmit.click();			
		}		
		catch (IOException e) 
		{
			e.printStackTrace();
		}	
	}
	public String VerifyPANdirector() {
		wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(pandirectorverificationtext));				
		return pandirectorverificationtext.getText();	
	}
	
	// action method for ESIC Verification search count
	public String getESICVerificationSearchCount() throws InterruptedException {
		String ESICCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("ESIC")) {

				ESICCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return ESICCount;
	}

	//Action Methods for ESIC Verification
	public void ESIC() throws InterruptedException {
		try {
			ldriver.get("https://www.truthscreen.com/Verification/esic_verification");
			wait=new WebDriverWait(ldriver, 90);
			wait.until(ExpectedConditions.visibilityOf(ESIC));
			ESIC.click();
			ESIC.sendKeys(ESICSample());
			Thread.sleep(500);
			btnsubmit.click();			
		}		
		catch (IOException e) 
		{	
			e.printStackTrace();
		}	
	}
	public String VerifyESIC() {
		wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(esicverificationtext));				
		return esicverificationtext.getText();	
	}

	//Action method for IEC Verification search count
	public String getIECVerificationSearchCount() throws InterruptedException {
		String IECCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("IEC")) {

				IECCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return IECCount;
	}
	//Action Methods for IEC Verification
	public void IEC() {
		try{
			ldriver.get("https://www.truthscreen.com/Verification/iec_verification");
			wait = new WebDriverWait(ldriver, 90);
			wait.until(ExpectedConditions.visibilityOf(IEC));
			IEC.click();
			IEC.sendKeys(IECSample());		 
			btnsubmit.click();			
		}		
		catch (IOException e) 
		{	
			e.printStackTrace();
		}	
	}
	public String VerifyIEC() {
		js=(JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,300)");
		wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(IECverificationtext));				
		return IECverificationtext.getText();	
	}
	
	// action method for GSTIN Verification search count
	public String getGSTVerificationSearchCount() throws InterruptedException {
		String GSTINCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("GSTIN")) {

				GSTINCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return GSTINCount;
	}
	//Action Methods for GSTIN  Verification
	public void GST() {
		try {
			ldriver.get("https://www.truthscreen.com/Verification/gstin_verification");
			wait=new WebDriverWait(ldriver, 90);
			wait.until(ExpectedConditions.visibilityOf(GST));
			GST.click();
			GST.sendKeys(GSTSample());	
			btnsubmit.click();			
		}		
		catch (IOException e) 
		{	
			e.printStackTrace();
		}	
	}
	public String VerifyGST() {
		wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(gstINverificationtext));				
		return gstINverificationtext.getText();	
	}

	// action method for Industry Type search count
	public String getIndustryTypeSearchCount() throws InterruptedException {
		String IndustryTypeSearchCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Industry Type")) {

				IndustryTypeSearchCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return IndustryTypeSearchCount;
	}
	//Action Methods for Industry Type
	public void IndustryType() {
		try {
			ldriver.get("https://www.truthscreen.com/search/getIndustryType");
			wait=new WebDriverWait(ldriver, 90);
			wait.until(ExpectedConditions.visibilityOf(industrytype));
			industrytype.click();
			industrytype.sendKeys(IndtypeSample());	
			btnsubmit.click();			
		}		
		catch (IOException e) 
		{	
			e.printStackTrace();
		}	
	}
	public String VerifyIndType() {
		wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(indtypeverificationtext));				
		return indtypeverificationtext.getText();	
	}

	// action method for kNOW UR PAN using GST search count
	public String getKnowUrPANUsingGSTSearchCount() throws InterruptedException {
		String KnowYourPANusingGSTINCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Know Your PAN using GSTIN")) {

				KnowYourPANusingGSTINCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return KnowYourPANusingGSTINCount;
	}
	//Action Methods for PAN using GST Verification
	public void PANGST() {
		try {
			ldriver.get("https://www.truthscreen.com/search/pan_details_gstin");
			wait=new WebDriverWait(ldriver, 90);
			wait.until(ExpectedConditions.visibilityOf(PAN_GST));
			PAN_GST.click();
			PAN_GST.sendKeys(PAN_GSTSample());		 
			btnsubmit.click();			
		}		
		catch (IOException e) 
		{		
			e.printStackTrace();
		}	
	}
	public String VerifyPAN_GST() {
		wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(PAN_GSTverificationtext));				
		return PAN_GSTverificationtext.getText();	
	}

	// action method for Company name  search count
	public String getCompanyNameSearchCount() throws InterruptedException {
		String CompanyNameSearchCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 80);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Company Name Search")) {

				CompanyNameSearchCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return CompanyNameSearchCount;
	}
	//Action Methods for Company Search Verification
	public void CompanySearch() {
		try {
			ldriver.get("https://www.truthscreen.com/search/search_by_company_name");
			wait = new WebDriverWait(ldriver, 90);
			wait.until(ExpectedConditions.visibilityOf(company_search));
			company_search.click();
			company_search.sendKeys(CompanySearchSample());		 
			Searchbutton.click();			
		}		
		catch (IOException e) 
		{	
			e.printStackTrace();
		}	
	}
	public String VerifyCompanySearch() {
		js=(JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,200)");
		wait = new WebDriverWait(ldriver, 90);
		wait.until(ExpectedConditions.visibilityOf(csverificationtext));				
		return csverificationtext.getText();	
	}

	//action method for Know Your GSTIN- PANINDIA  search count
	public String getKnowYourGSTinPANINDIASearchCount() throws InterruptedException {
		String KnowYourGSTPANINDIACount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 80);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("KnowYourGST-PANINDIA")) {

				KnowYourGSTPANINDIACount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return KnowYourGSTPANINDIACount;
	}

	//Action Methods for Know Your GSTIN- PANINDIA
	public void GSTIN_PANINDIA() {
		try {
			ldriver.get("https://www.truthscreen.com/verification/know_your_gstin_pan_india");
			wait = new WebDriverWait(ldriver, 80);
			wait.until(ExpectedConditions.visibilityOf(GSTIN_PAN));
			GSTIN_PAN.click();
			GSTIN_PAN.sendKeys(GSTINPANSample());		 
			btnsubmit.click();			
		}		
		catch (IOException e) 
		{	
			e.printStackTrace();
		}	
	}
	public String VerifyGSTIN_PAN() {
		wait = new WebDriverWait(ldriver, 80);
		wait.until(ExpectedConditions.visibilityOf(gstinpanverificationtext));				
		return gstinpanverificationtext.getText();	
	}

	//action method for Know Your GSTIN- taxpayer  search count
	public String getGSTINTaxpayerVerificationSearchCount() throws InterruptedException {
		String GSTINTAXPAYERCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 80);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("GSTIN TAXPAYER")) {

				GSTINTAXPAYERCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return GSTINTAXPAYERCount;
	}
	//Action Methods GSTIN-Taxpayer Verification
	public void GSTINTaxPayerverification() {
		try {
			ldriver.get("https://www.truthscreen.com/verification/gstin_gsp_verification");
			wait = new WebDriverWait(ldriver, 80);
			wait.until(ExpectedConditions.visibilityOf(GSTINverification));
			GSTINverification.click();
			GSTINverification.sendKeys(GSTIverificationSample());	
			btnsubmit.click();			
		}		
		catch (IOException e) 
		{	
			e.printStackTrace();
		}	
	}
	public String VerifyGSTINTaxPayerverification() {
		wait = new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(gstinTaxpayerverificationtext));				
		return gstinTaxpayerverificationtext.getText();	
	}

	//action method for Credit Ratings search count
	public String getCreditRatingsSearchCount() throws InterruptedException {
		String CreditRatingCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Credit Rating")) {

				CreditRatingCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return CreditRatingCount;
	}
	//Action Methods Credit Ratings
	public void CreditRatingsverification() {
		try {
			ldriver.get("https://www.truthscreen.com/bank_verification/credit_rating");
			wait = new WebDriverWait(ldriver, 80);
			wait.until(ExpectedConditions.visibilityOf(Creditratings));
			Creditratings.click();
			Creditratings.sendKeys(CreditRatingSample());	
			btnsubmit.click();			
		}		
		catch (IOException e) 
		{	
			e.printStackTrace();
		}	
	}
	public String VerifyCreditRatingverification() {
		js=(JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,200)");
		wait = new WebDriverWait(ldriver, 80);
		wait.until(ExpectedConditions.visibilityOf(creditratingverificationtext));				
		return creditratingverificationtext.getText();	
	}

	//action method for ESIC employer verify search count
	public String getEsicEmployerVerificationSearchCount() throws InterruptedException {
		String ESICEmployerVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("ESIC Employer Verification")) {

				ESICEmployerVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return ESICEmployerVerificationCount;
	}
	//Action Methods for Esic Employer Verification
	public void Esicemployerverification() throws InterruptedException {
		try {
			ldriver.get("https://www.truthscreen.com/verification/esic_employer");
			wait = new WebDriverWait(ldriver, 10);
			wait.until(ExpectedConditions.visibilityOf(esicempdropdown1));
			Select objSelect = new Select(esicempdropdown1);
			objSelect.selectByIndex(13);	//objSelect.selectByVisibleText("Haryana");
			wait.until(ExpectedConditions.visibilityOf(esicempdropdown2));
			Select obj= new Select(esicempdropdown2);
			Thread.sleep(1000);
			obj.selectByIndex(5); //obj.selectByVisibleText("Gurgaon");
			esicemployer.click();
			esicemployer.sendKeys(EsicEmplSample());	
			btnsubmit.click();			
		}		
		catch (IOException e) 
		{	
			e.printStackTrace();
		}	
	}
	public String Esicemployergverification() {
		wait = new WebDriverWait(ldriver, 10);
		js=(JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", esicempverificationtext);
		wait.until(ExpectedConditions.visibilityOf(esicempverificationtext));
		System.out.println("text==="+esicempverificationtext.getText());
		return esicempverificationtext.getText();	
	}

	//action method for Fssai Verification search count
	public String getFssaiVerificationSearchCount() throws InterruptedException {
		String FSSAIVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("FSSAI Verification")) {

				FSSAIVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return FSSAIVerificationCount;
	}
	//Action Methods for Fssai Verification
	public void FssaiVerification() {
		try {
			ldriver.get("https://www.truthscreen.com/Verification/fssai");
			wait = new WebDriverWait(ldriver, 10);
			wait.until(ExpectedConditions.visibilityOf(Fssaino));
			Fssaino.click();
			Fssaino.sendKeys(FssaiSample());	
			btnsubmit.click();			
		}		
		catch (IOException e) 
		{	
			e.printStackTrace();
		}	
	}
	public String VerifyFssaiverification() {
		wait = new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(fssaiverificationtext));
		return fssaiverificationtext.getText();	
	}

	//action method for Street Vendor Verification search count
	public String getStreetVendorVerificationSearchCount() throws InterruptedException {
		String StreetVendorVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Street Vendor Verification")) {

				StreetVendorVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return StreetVendorVerificationCount;
	}
	//Action Methods for Street Vendor Verification
	public void StreetVendorVerification() {
		try {
			ldriver.get("https://www.truthscreen.com/Verification/street_vendor_verification");
			wait = new WebDriverWait(ldriver, 10);
			wait.until(ExpectedConditions.visibilityOf(STVstate));
			Select objSelect = new Select(STVstate);
			objSelect.selectByIndex(5);
			STVulbno.click();
			STVulbno.sendKeys(STVulbSample());	
			STVname.click();
			STVname.sendKeys(STVnameSample());
			STVfathername.click();
			STVfathername.sendKeys(STVfathernameSample());
			STVmobileno.click();
			STVmobileno.sendKeys(STVmobilenoSample());
			btnsubmit.click();			
		}		
		catch (IOException e) 
		{
			e.printStackTrace();
		}	
	}
	public String VerifyStreetVendorverification() {
		wait = new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(STVverificationtext));	
		return STVverificationtext.getText();	
	}

	//action method for Comprehensive GST Verification search count
	public String getComprehensiveGSTVerificationSearchCount() throws InterruptedException {
		String ComprehensiveGSTSolutionCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Comprehensive GST Solution")) {

				ComprehensiveGSTSolutionCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return ComprehensiveGSTSolutionCount;
	}
	//Action Methods for Comprehensive GST Verification
	public void cgstVerification() throws InterruptedException {
		try 
		{
			ldriver.get("https://www.truthscreen.com/verification/comprehensive_gst_solution/1");
			wait=new WebDriverWait(ldriver, 10);
			wait.until(ExpectedConditions.visibilityOf(cgst));
			cgst.click();
			cgst.sendKeys(CGSTSample());	
			wait = new WebDriverWait(ldriver, 10);
			wait.until(ExpectedConditions.visibilityOf(cgstdropdown));
			Select objSelect = new Select(cgstdropdown);
			Thread.sleep(500);
			objSelect.selectByValue("2017-18");
			SubmitButton1.click();			
		}		
		catch (IOException e) {	
			e.printStackTrace();
		}	
	}

	//search count for GstR return verification
	public String getGSTRreturnVerificationSearchCount() {
		String GSTRReturnCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("GSTR Return")) {

				GSTRReturnCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return GSTRReturnCount;
	}
	//action method gstr return sample submit
	public void gstrReturnVerification() {
		try {
			ldriver.get("https://www.truthscreen.com/gstr");
			wait=new WebDriverWait(ldriver, 10);
			wait.until(ExpectedConditions.visibilityOf(GSTRreturnNo));
			GSTRreturnNo.click();
			GSTRreturnNo.sendKeys(GSTReturnverificationSample());	
			GSTRreturnUsername.click();
			GSTRreturnUsername.sendKeys(GSTReturnverificationusernameSample());
			btnsubmit.click();			
		}		
		catch (IOException e) {	
			e.printStackTrace();
		}	
	}
	//verification success msg
	public String gstrReturnVerifySuccessMsg() {
		wait=new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(GSTRreturnSuccessMsg));
		return GSTRreturnSuccessMsg.getText();
	}

	//COMP-GST ADVAnce search count
	public String getComprehensiveGstAdvVerificationSearchCount() {
		String ComprehensiveGSTSolutionAdvancedCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Comprehensive GST Solution Advanced")) {

				ComprehensiveGSTSolutionAdvancedCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return ComprehensiveGSTSolutionAdvancedCount;
	}
	//action method for comp- gst  advance sample submit
	public void cgstAdvVerification() throws IOException, InterruptedException {
		try {
			ldriver.get("https://www.truthscreen.com/verification/comprehensive_gst_solution/2");
			wait=new WebDriverWait(ldriver, 100);
			wait.until(ExpectedConditions.visibilityOf(GSTRreturnNo));
			GSTRreturnNo.click();
			GSTRreturnNo.sendKeys(GSTReturnverificationSample());	
			GSTRreturnUsername.click();
			GSTRreturnUsername.sendKeys(GSTReturnverificationusernameSample());
			Thread.sleep(500);
			submitBtn.click();	
			wait.until(ExpectedConditions.visibilityOf(submitButton));
			submitButton.click();
			Thread.sleep(13000);
		}		
		catch (IOException e) {	
			e.printStackTrace();
		}
	}
	//verify comp gst adv verification success msg
	public int compGstAdvVerifySuccessMsg() throws InterruptedException, IOException {
		String strUrl = ldriver.getCurrentUrl();
		Thread.sleep(100);
		URL url = new URL(strUrl);
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		int statusCode = http.getResponseCode();  
		return statusCode;
	}

	//get Udyam Verification search count
	public String udyamVerificationSearchCount() {
		String UdyamVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Udyam Verification")) {

				UdyamVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return UdyamVerificationCount;
	}
	//action method for Udyam Sample submit
	public void udyamVerification() throws IOException {
		try {
			ldriver.get("https://www.truthscreen.com/udyam/udyam_verification");
			wait=new WebDriverWait(ldriver, 10);
			wait.until(ExpectedConditions.visibilityOf(enterUdyamRegistrationNum));
			enterUdyamRegistrationNum.click();
			enterUdyamRegistrationNum.sendKeys(udyamVerificationSample());	
			btnsubmit.click();	
		}		
		catch (IOException e) {	
			e.printStackTrace();
		}
	}
	//udyam verification success Msg
	public String UdyamVerificationSuccessMsg() {
		wait=new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(UdyamVerificationSuccessMsg));
		return UdyamVerificationSuccessMsg.getText();
	}

	//get UDYOG Adhaar using phone search count
	public String udyogAadhaarUsingPhoneSearchCount() {
		String UdyogAadhaarusingphoneCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Udyog Aadhaar using phone")) {

				UdyogAadhaarusingphoneCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return UdyogAadhaarusingphoneCount;
	}
	//action method for udyog adhaar using phoneverification
	public void udyogAdhaarUsingPhoneVerification() {
		try {
			ldriver.get("https://www.truthscreen.com/verification/udyog_aadhaar_phone");
			wait=new WebDriverWait(ldriver, 10);
			wait.until(ExpectedConditions.visibilityOf(enterUAMnumber));
			enterUAMnumber.sendKeys(uamSample());
			enterPhoneNumber.sendKeys(uamRelatedPhoneSample());
			btnsubmit.click();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//verify udyog adhaar verification using phone success Msg
	public String UdyogAdhaarVerificationUsingPhoneSuccessMsg() {
		wait=new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf( udyogAdhaarUsingPhoneVerificationSuccessMsg));
		return  udyogAdhaarUsingPhoneVerificationSuccessMsg.getText();
	}
	
	//get gstin view and track return search count 
	public String gstViewAndTrackReturnSearchCount() {
		String GSTINViewandTrackReturnCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("GSTIN View and Track Return")) {

				GSTINViewandTrackReturnCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return GSTINViewandTrackReturnCount;
	}
	//action method for gst track and return verification
	public void gstTrackAndReturnVerification() {
		try {
			ldriver.get("https://www.truthscreen.com/Verification/gstin_gsp_return_verification");
			wait=new WebDriverWait(ldriver, 10);
			wait.until(ExpectedConditions.visibilityOf(enterGSTnumber));
			enterGSTnumber.sendKeys(gstSample());
			enterFinancialYear.sendKeys(financialYear());
			btnsubmit.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//verify gst track and return verification success msg
	public String verifyGstTrackAndReturnVerificationSuccessMsg() {
		wait=new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(gstTrackReturnVerificationSuccessMsg));
		return gstTrackReturnVerificationSuccessMsg.getText();
	}

	//action method for GST Basis PAN  search count
	public String getGSTBasisPANSearchCount() throws InterruptedException {
		String GSTBasisPANCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 80);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("GST Basis PAN")) {

				GSTBasisPANCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return GSTBasisPANCount;
	}
	//Action Methods for GST Basis PAN
	public void GSTBasisPAN() {
		try {
			ldriver.get("https://www.truthscreen.com/Verification/gst_basis_pan");
			wait = new WebDriverWait(ldriver, 80);
			wait.until(ExpectedConditions.visibilityOf(GSTIN_PAN));
			GSTIN_PAN.click();
			GSTIN_PAN.sendKeys(GSTBasisPANSample());		 
			SubmitButton.click();			
		}		
		catch (IOException e) 
		{	
			e.printStackTrace();
		}	
	}
	public String VerifyGSTBasisPAN() {
		wait = new WebDriverWait(ldriver, 80);
		wait.until(ExpectedConditions.visibilityOf(GstUinStatusVerification));				
		return GstUinStatusVerification.getText();	
	}

}








