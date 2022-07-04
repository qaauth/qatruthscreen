package com.ts.pageobject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ts.XLUtils;

public class Professionals extends NID{

	public Professionals(WebDriver rdriver) {
		super(rdriver);	
	}

	// Element Locators
	@FindBy(id ="VerificationPanNumber")
	@CacheLookup
	WebElement IAveri; // Insurance Agent textbox

	@FindBy(id ="VerificationMembershipNumber")
	@CacheLookup
	WebElement CAveri; //CA verification

	@FindBy(id ="VerificationState")
	@CacheLookup
	WebElement Docveri;

	@FindBy(id ="VerificationRegistrationNumber")
	@CacheLookup
	WebElement Docregno;

	@FindBy(id ="VerificationState")
	@CacheLookup
	WebElement Denveri;

	@FindBy(id ="VerificationRegno")
	@CacheLookup
	WebElement Denregno;

	@FindBy(id ="member_number")
	@CacheLookup
	WebElement ICSIveri;

	@FindBy(id ="member_number")
	@CacheLookup
	WebElement ICWAIveri;

	@FindBy(id ="member_name")
	@CacheLookup
	WebElement ICWAInameveri;

	@FindBy(id ="NUIDNuidNumber")  
	@CacheLookup
	WebElement nuidnumber;

	//Verification locators
	@FindBy(xpath= "//*[contains(text(),'JAGAN BODDEDA')]")
	@CacheLookup
	WebElement IAverificationtext;

	@FindBy(xpath= "//*[@id=\"main\"]/div[2]/div/div/div[2]/div/div[2]/div/div/div/table/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement CAverificationtext;

	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div/table/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement Docverificationtext;

	@FindBy(xpath= "/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div/div/div/div/table[1]/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement Denverificationtext;

	@FindBy(xpath="//*[text()='Membership Number']")
	@CacheLookup
	WebElement ICSIverificationtext;

	@FindBy(xpath="//*[text()='Member Number']")
	@CacheLookup
	WebElement ICWAIverificationtext;

	@FindBy(xpath="//span[text()='Professionals ']/ancestor::li[@class='row']/descendant::a[@class='icon-dot']")
	@CacheLookup
	WebElement professionalSearchSummary;

	@FindBy(xpath="/html/body/div[5]/div[2]/div/ul/li[1]/strong")
	@CacheLookup
	WebElement insuranceAgentSearchCount;

	@FindBy(xpath="/html/body/div[5]/div[2]/div/ul/li[2]/strong")
	@CacheLookup
	WebElement caVerificationSearchCount;

	@FindBy(xpath="/html/body/div[5]/div[2]/div/ul/li[3]/strong")
	@CacheLookup
	WebElement DoctorVerificationSearchCount;

	@FindBy(xpath="/html/body/div[5]/div[2]/div/ul/li[4]/strong")
	@CacheLookup
	WebElement DentistVerificationSearchCount;

	@FindBy(xpath="/html/body/div[5]/div[2]/div/ul/li[5]/strong")
	@CacheLookup
	WebElement ICSIVerificationSearchCount;

	@FindBy(xpath="/html/body/div[5]/div[2]/div/ul/li[6]/strong")
	@CacheLookup
	WebElement ICWAIVerificationSearchCount;

	//insurance Agent PAN CHECK verification
	@FindBy(xpath="/html/body/div[5]/div[2]/div/ul/li[7]/strong")
	@CacheLookup
	WebElement InsuranceAgentPanCheckVerificationSearchCount;

	@FindBy(xpath="//*[@id='ProfessionalPan']")
	@CacheLookup
	WebElement enterInsuranceAgentPan;

	@FindBy(xpath="//*[contains(text(),'Matching Record Found In DataBase')]")
	@CacheLookup
	WebElement InsuranceAgentPanVerifySuccessMsg;

	@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'Nurses Verification  ')]/strong") 
	@CacheLookup
	WebElement nurseSearchCount;

	@FindBy(xpath="//table[@class='table table-striped fs-13 c6 mb-30']/tbody/tr[contains(.,'Applicant Name')]")   //
	@CacheLookup
	WebElement Nurseverificationtext;


	// action method for Insurance Agent verification search count
	public String getInsuranceAgentVerificationSearchCount() throws InterruptedException {
		String InsuranceAgentVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(professionalSearchSummary));
		professionalSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Insurance Agent Verification")) {

				InsuranceAgentVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return InsuranceAgentVerificationCount;
	}

	//Action Methods for Insurance Agent Verification
	public void InsuranceAgentVerification()throws InterruptedException {				
		try {
			ldriver.get("https://www.truthscreen.com/professional/getInsuranceAgentDetails");
			wait = new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(IAveri));
			IAveri.click();
			IAveri.sendKeys(IASample());
			btnsubmit.click();	
		} catch (IOException e) {

			e.printStackTrace();
		}
	}		
	public String verifyInsuranceAgent() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(IAverificationtext));				
		return IAverificationtext.getText();		
	}

	// action method for  CA  verification search count
	public String getCAVerificationSearchCount() throws InterruptedException {
		String CAVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(professionalSearchSummary));
		professionalSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("CA Verification")) {

				CAVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return CAVerificationCount;
	}

	//Action Methods for CA Verification
	public void CAVerification()throws InterruptedException {	
		try {
			ldriver.get("https://www.truthscreen.com/professional/getCADetails");
			wait=new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(CAveri));
			CAveri.click();
			CAveri.sendKeys(CASample());
			btnsubmit.click();	
		} catch (IOException e) {

			e.printStackTrace();
		}
	}		
	public String verifyCAverification() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(CAverificationtext));				
		return CAverificationtext.getText();		
	}

	// action method for Doctor  verification search count
	public String getDoctorVerificationSearchCount() throws InterruptedException {
		String DoctorVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(professionalSearchSummary));
		professionalSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Doctor Verification")) {

				DoctorVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return DoctorVerificationCount;
	}

	//Action Methods for Doctor Verification
	public void DocVerification()throws InterruptedException {	
		try {
			ldriver.get("https://www.truthscreen.com/professional/getDoctorDetails");
			wait = new WebDriverWait(ldriver, 60);
			wait.until(ExpectedConditions.visibilityOf(Docveri));
			Select state= new Select(Docveri);
			state.selectByIndex(1);
			Thread.sleep(50);
			Docregno.sendKeys(DocSample());
			btnsubmit.click();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}		
	public String verifydoctorverification() {
		wait = new WebDriverWait(ldriver, 120);	
		wait.until(ExpectedConditions.visibilityOf(Docverificationtext));				
		return Docverificationtext.getText();		
	}

	// action method for Dentist verification search count
	public String getDentistVerificationSearchCount() throws InterruptedException {
		String DentistVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(professionalSearchSummary));
		professionalSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Dentist Verification")) {

				DentistVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return DentistVerificationCount;
	}

	//Action Methods for Dentist Verification
	public void DentistVerification()throws InterruptedException {	
		try  {	
			ldriver.get("https://www.truthscreen.com/professional/getDentistDetail");
			wait = new WebDriverWait(ldriver, 5);
			wait.until(ExpectedConditions.visibilityOf(Denveri));
			Select state= new Select(Denveri);
			state.selectByIndex(1);
			Thread.sleep(50);
			Denregno.sendKeys(DenSample());
			btnsubmit.click();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}		
	public String verifydentistverification() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(Denverificationtext));				
		return Denverificationtext.getText();		
	}

	// Action method for ICSI verification search count
	public String getICSIVerificationSearchCount() throws InterruptedException {
		String ICSICount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(professionalSearchSummary));
		professionalSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("ICSI")) {

				ICSICount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return ICSICount;
	}
	//Action Methods for ICSI Verification
	public void ICSIVerification()throws InterruptedException {	
		try {
			ldriver.get("https://www.truthscreen.com/Icsinicwai/icsi");
			wait=new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(ICSIveri));
			ICSIveri.click();
			ICSIveri.sendKeys(ICSISample());
			btnsubmit.click();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}		
	public String verifyICSItverification() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(ICSIverificationtext));				
		return ICSIverificationtext.getText();		
	}

	// Action method for ICWAI verification search count
	public String getICWAIVerificationSearchCount() throws InterruptedException {
		String ICWAICount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(professionalSearchSummary));
		professionalSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("ICWAI")) {

				ICWAICount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return ICWAICount;
	}
	//Action Methods for ICWAI Verification
	public void ICWAIVerification()throws InterruptedException {	
		try {	
			ldriver.get("https://www.truthscreen.com/Icsinicwai/icwai");
			wait=new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(ICWAIveri));
			ICWAIveri.click();
			ICWAIveri.sendKeys(ICWAISample());
			ICWAInameveri.click();
			ICWAInameveri.sendKeys(ICWAInameSamp());
			btnsubmit.click();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}		
	public String verifyICWAItverification() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(ICWAIverificationtext));	
		return ICWAIverificationtext.getText();		
	}

	//INSURANCE AGENT PAN CHECK VERIFY SEARCH COUNT
	public String InsuranceAgentPanCheckSearchCount() {
		String InsuranceAgentPANCheckCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(professionalSearchSummary));
		professionalSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Insurance Agent PAN Check")) {

				InsuranceAgentPANCheckCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return InsuranceAgentPANCheckCount;
	}
	//Insurance Agent pan check sample submit
	public void InsuranceAgentPanCheckVerification()throws InterruptedException {	
		try {	
			ldriver.get("https://www.truthscreen.com/professional/insurance_agent_pan_check");
			wait=new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(enterInsuranceAgentPan));
			enterInsuranceAgentPan.click();
			enterInsuranceAgentPan.sendKeys(IASample());
			btnsubmit.click();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//insurance agent pan check verify success msg
	public String IAPancheckVerifySuccessMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(InsuranceAgentPanVerifySuccessMsg));	
		return InsuranceAgentPanVerifySuccessMsg.getText();	
	}

	//Action method for Nurse Search count
	public String getNurseSearchCount() throws InterruptedException {
        String NursesVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(professionalSearchSummary));
		professionalSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Nurses Verification")) {

				NursesVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return NursesVerificationCount;
	}
	// Action Methods for NUID (Nurse) Verification
	public void NUID() {		
		ldriver.get("https://www.truthscreen.com/NurseVerification");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(nuidnumber));
		XLUtils obj  = new XLUtils();
		String nuidsamplenumber;
		try {
			nuidsamplenumber = obj.NuidSample();
			nuidnumber.click();
			nuidnumber.sendKeys(nuidsamplenumber);
			btnsubmit.click();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public String verifyNUID() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(Nurseverificationtext));		
		return Nurseverificationtext.getText();			
	}
}



