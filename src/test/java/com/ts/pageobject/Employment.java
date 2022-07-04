package com.ts.pageobject;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ts.XLUtils;

public class Employment extends NID{

	public Employment(WebDriver rdriver) {
		super(rdriver);
		// TODO Auto-generated constructor stub
	}

	//*********Elements*****///
	@FindBy  (xpath = "//input[@value='self']")//(name ="data[Verification][BVtype]")
	@CacheLookup
	WebElement radiobuttonsalary;

	@FindBy(name ="data[Verification][candidate_name_bank]")
	@CacheLookup
	WebElement bankname;

	@FindBy(name ="data[Verification][emailId_bank]")
	@CacheLookup
	WebElement bankemailid;

	@FindBy(name="data[Verification][candidate_mob_bank]")
	@CacheLookup	
	WebElement bankmobileno;

	@FindBy  (id ="sub-btn-block") //(xpath= "//button[contains(.,'Submit')]")
	@CacheLookup	
	WebElement submitbutton;

	@FindBy(id ="uan_verificationUserName")
	@CacheLookup	
	WebElement uanno;

	@FindBy(id ="uan_verificationPassword")
	@CacheLookup	
	WebElement uanpass;

	@FindBy(id ="candidate_name")
	@CacheLookup	
	WebElement itrname;

	@FindBy(id ="emailId")
	@CacheLookup	
	WebElement itrmailid;

	@FindBy(id ="mob")
	@CacheLookup	
	WebElement itrmobileno;

	@FindBy(id ="pan_number")
	@CacheLookup	
	WebElement itrpanno;

	@FindBy(id ="dp2")
	@CacheLookup	
	WebElement itrdob;

	@FindBy(xpath ="//span[@class='sprite doc-iocn mb-10']")
	@CacheLookup	
	WebElement form16;

	@FindBy(xpath = "//button[@id='submit-all']")
	@CacheLookup	
	WebElement submitform16;

	@FindBy(id ="employmentPanNumber")
	@CacheLookup	
	WebElement Panno;

	@FindBy(id ="tan_number")
	@CacheLookup	
	WebElement Tanno;

	@FindBy(css ="#dp2 .glyphicon")
	@CacheLookup	
	WebElement Startdate;

	@FindBy(css ="#dp3 .glyphicon")
	@CacheLookup	
	WebElement Enddate;

	@FindBy(id ="employmentViewType")
	@CacheLookup	
	WebElement Selectitr;

	@FindBy(id ="tanNo")
	@CacheLookup	
	WebElement itrtan;

	@FindBy(name ="data[employment][challanPeriodFromDate]")
	@CacheLookup	
	WebElement itrtanfrom;

	@FindBy(id ="to_date")
	@CacheLookup	
	WebElement itrtanto;

	@FindBy(xpath="//*[@id='itr_employmentAckName']")
	@CacheLookup	
	WebElement itrno;

	@FindBy(id ="itr_employmentAckName")
	@CacheLookup	
	WebElement itrackno;

	@FindBy(xpath="//input[@id='uan_detailsUserName']")
	@CacheLookup
	WebElement UANNo;

	@FindBy(id="uan_detailsEmployerName")
	@CacheLookup
	WebElement UANDetailEmployer;

	// Assertion/ Verification texts
	@FindBy(xpath ="/html/body/div[2]/div[2]/div[1]/div/h5")
	@CacheLookup
	WebElement salaryverificationtext;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div[2]/div[2]/div[2]/h4")
	@CacheLookup
	WebElement itrstatusverificationtext;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/table/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement form16verificationtext;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div/table/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement pantanverificationtext;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/table/thead/tr/th[1]")
	@CacheLookup
	WebElement itrtanverificationtext;

	@FindBy(xpath ="//span[text()='Employment ']/ancestor::li[@class='row']/descendant::a[@class='icon-dot']")
	@CacheLookup
	WebElement EmploymentSearchSummary;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[1]/strong")
	@CacheLookup
	WebElement ITRStatusSearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[2]/strong")
	@CacheLookup
	WebElement salaryVerificationSearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[3]/strong")
	@CacheLookup
	WebElement Form16VerificationSearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[5]/strong")
	@CacheLookup
	WebElement PAN_TANVerificationSearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[8]/strong")
	@CacheLookup
	WebElement ITRchallanVerificationSearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[6]/strong")
	@CacheLookup
	WebElement basicUANVerificationSearchCount;

	@FindBy(xpath ="//*[@id='uan_detailsUserName']")
	@CacheLookup
	WebElement enterUAN;

	@FindBy(xpath ="//*[text()='UAN Details']")
	@CacheLookup
	WebElement UANverificationSuccessMsg;

	@FindBy(xpath ="//*[@id='employmentEstCode']")
	@CacheLookup
	WebElement companyName;

	@FindBy(xpath ="//*[@id='employmentPersonName']")
	@CacheLookup
	WebElement personName;

	@FindBy(xpath ="//*[text()='EPFO Verification Details']")
	@CacheLookup
	WebElement epfoMatchSuccessMsg;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[9]/strong")
	@CacheLookup
	WebElement EpfoCheckExactMatchSearchCount;

	//Epfo Employer verification
	@FindBy(xpath ="/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[6]/strong[1]")
	@CacheLookup
	WebElement EpfoEmployerSearchCount;

	@FindBy(xpath ="//*[@id='employmentCompanyName']")
	@CacheLookup
	WebElement enterEpfoEmployerCompanyName;

	@FindBy(xpath ="//*[contains(text(),'Employer PF Verification Details')]")
	@CacheLookup
	WebElement epfoEmployerSearchSuccessMsg;

	//Epfo Employee verification
	@FindBy(xpath ="/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[7]/strong[1]")
	@CacheLookup
	WebElement EpfoEmployeeVerifySearchCount;

	@FindBy(xpath ="//*[@id='employmentCompanyName']")
	@CacheLookup
	WebElement enterEmployeeCompanyName;

	@FindBy(xpath ="//select[@id='employmentCompanyName']")
	@CacheLookup
	WebElement companyNameDropDown;

	@FindBy(xpath ="//*[@id='person_name']")
	@CacheLookup
	WebElement enterEmployeeName;

	@FindBy(xpath ="//*[@id='employmentDoj']")
	@CacheLookup
	WebElement enterEmployeeDoj;

	@FindBy(xpath ="//*[text()='Submit']")
	@CacheLookup
	WebElement finalSubmitBtn;

	@FindBy(xpath ="//*[text()='Match Found']")
	@CacheLookup
	WebElement epfoEmployeeSearchSuccessMsg;

	//Employer Default check
	@FindBy(xpath ="/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[9]/strong[1]")
	@CacheLookup
	WebElement EmployerDefaultCheckSearchCount;

	@FindBy(xpath ="//*[@id='employmentEstablishmentId']")
	@CacheLookup
	WebElement EmployerEstablishmentId;

	@FindBy(xpath ="//*[contains(text(),'Name of Establishment')]")
	@CacheLookup
	WebElement EmployerDefaultCheckVerifySuccessMsg;

	//bgv Employment check
	@FindBy(xpath ="/html[1]/body[1]/div[5]/div[2]/div[1]/ul[1]/li[8]/strong[1]")
	@CacheLookup
	WebElement BgvEmploymentCheckSearchCount;

	@FindBy(xpath ="//*[@id='username']")
	@CacheLookup
	WebElement BgvEmployeeName;

	@FindBy(xpath ="//*[@id='mob']")
	@CacheLookup
	WebElement BgvEmployeeMobileNum;

	@FindBy(xpath ="//*[@id='dp2']")
	@CacheLookup
	WebElement BgvEmployeeDOB;

	@FindBy(xpath ="//*[contains(text(),'Employment Summary')]")
	@CacheLookup
	WebElement BgvEmploymentCheckSuccessMsg;

	//Dual Employement check
	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'Dual Employment Check  ')]/strong")
	@CacheLookup
	WebElement DualEmployementcheckSearchCount;

	@FindBy(xpath="//table[@class='table table-striped fs-13 c6']/tbody/tr[contains(.,'AUTHBRIDGE RESEARCH SERVICES PVT. LTD')]")
	@CacheLookup
	WebElement EstablishmentName; 

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/span[1]")//(xpath="//span[text()='UAN Details']")
	@CacheLookup
	WebElement UANDetails;
	
	//Negative Due Diligence
	@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'Negative Due Diligence  ')]/strong")
	@CacheLookup
	WebElement NegativeDueDeliganceVeriearchCount;
	
	@FindBy(xpath="//input[@id='name']")
	@CacheLookup
	WebElement name;
	
	@FindBy(xpath="//select[@name='data[Verification][user_type]']")
	@CacheLookup
	WebElement UserType;
	
	@FindBy(xpath="//h2[text()='CIBIL Defaulters List']")
	@CacheLookup
	WebElement CibilDefaulterList;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div/div[21]/div[1]/table/tbody/tr/td[8]")
	@CacheLookup
	WebElement DefaulterName;
	

	// action method for salary verification search count
	public String getSalaryVerificationSearchCount() throws InterruptedException {
		String SalaryVerificationSearchCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(EmploymentSearchSummary));
		EmploymentSearchSummary.click();
		Thread.sleep(500);
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Salary Verification")) {

				SalaryVerificationSearchCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return SalaryVerificationSearchCount;
	}

	//Action Methods for Salary Verification
	public void SalaryVerification() throws InterruptedException, IOException {	
		ldriver.get("https://www.truthscreen.com/employment/salary_verification");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(radiobuttonsalary));	
		radiobuttonsalary.click();
		wait.until(ExpectedConditions.visibilityOf(bankname));	
		bankname.click();
		bankname.sendKeys(SalarynameSample());
		bankemailid.click();
		bankemailid.sendKeys(SalarymailidSample());
		bankmobileno.click();
		bankmobileno.sendKeys(SalaryphnnoSample());
		Thread.sleep(2000);
		submitbutton.click();	
		//further bank details are required to complete salary verification and  verify search count
	}		
	public String Verifysalaryverification() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(salaryverificationtext));
		String ex = salaryverificationtext.getText();
		System.out.println(ex);				
		return salaryverificationtext.getText();
	}

	// action method for Itr status  search count
	public String getITRStatusSearchCount() throws InterruptedException {
		String ITRStatusCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(EmploymentSearchSummary));
		EmploymentSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("ITR Status")) {

				ITRStatusCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return ITRStatusCount;
	}
	//Action Methods for ITR Status
	public void ITRstatusVerification() throws InterruptedException, IOException {	
		ldriver.get("https://www.truthscreen.com/employment/itr");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(itrackno));
		itrackno.click();
		itrackno.sendKeys(itrstatusacknoSample());
		btnsubmit.click();	
		
	}

	public String Verifyitrstatusverification() 
	{
		wait = new WebDriverWait(ldriver, 120);	
		wait.until(ExpectedConditions.visibilityOf(itrstatusverificationtext));
		return itrstatusverificationtext.getText();
	}

	// action method for Form-16 verification search count
	public String getForm16VerificationSearchCount() throws InterruptedException {
		String Form16VerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(EmploymentSearchSummary));
		EmploymentSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Form-16 Verification")) {

				Form16VerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return Form16VerificationCount;
	}
	//Action Methods for Form 16 Verification 
	public void Form16Verification() throws IOException, InterruptedException, AWTException {  	
		ldriver.get("https://www.truthscreen.com/employment/form16_verification");
		wait = new WebDriverWait(ldriver, 120);	
		wait.until(ExpectedConditions.visibilityOf(form16));
		StringSelection ss = new StringSelection(From16Sample());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		form16.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		submitform16.click();	  
	}
	public String verifyform16verification() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(form16verificationtext));				
		return form16verificationtext.getText();				
	}

	// action method for PAN/TAN verification search count
	public String getPANTANVerificationSearchCount() throws InterruptedException {
		String PanTanVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(EmploymentSearchSummary));
		EmploymentSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("PAN/TAN Verification")) {

				PanTanVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return PanTanVerificationCount;
	}
	//Action Methods for PAN/TAN Verification 
	public void PanTanVerification() throws IOException, InterruptedException { 
		ldriver.get("https://www.truthscreen.com/employment/employee_varification_using_pan_tan");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(Panno));
		Panno.click();
		Panno.sendKeys(PANnoSample());
		Tanno.click();
		Tanno.sendKeys(TANnoSample());
		WebElement date= ldriver.findElement(By.id("employmentStartDate")); 
		((JavascriptExecutor) ldriver).executeScript("arguments[0].removeAttribute('readonly','readonly')", date); 
		date.click();
		date.sendKeys(itrtanfromSample());
		WebElement date2= ldriver.findElement(By.id("employmentEndDate")); 
		((JavascriptExecutor) ldriver).executeScript("arguments[0].removeAttribute('readonly','readonly')", date2);		 
		date2.click();
		date2.sendKeys(itrtantoSample());		 
		btnsubmit.click();	  
	}
	public String verifyPanTanverification() {
		js=(JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,100)");
		wait = new WebDriverWait(ldriver, 100);
		wait.until(ExpectedConditions.visibilityOf(pantanverificationtext));				
		return pantanverificationtext.getText();				
	}

	// action method for ITR Challan verification search count
	public String getITRChallanVerificationSearchCount() throws InterruptedException {
		String PanTanVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(EmploymentSearchSummary));
		EmploymentSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("PAN/TAN Verification")) {

				PanTanVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return PanTanVerificationCount;
	}	
	//Action Methods for ITR challan Based Verification 
	public void ITRTANVerification() throws IOException { 
		ldriver.get("https://www.truthscreen.com/employment/itr_challan_verification");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(Selectitr));
		Select viewtype= new Select(Selectitr);
		viewtype.selectByValue("2");
		itrtan.click();
		itrtan.sendKeys(itrtanSample());
		WebElement date= ldriver.findElement(By.id("employmentChallanPeriodFromDate")); 
		((JavascriptExecutor) ldriver).executeScript("arguments[0].removeAttribute('readonly','readonly')", date); 
		date.click();
		date.sendKeys(itrtanfromSample());
		WebElement date2= ldriver.findElement(By.id("employmentChallanPeriodToDate")); 
		((JavascriptExecutor) ldriver).executeScript("arguments[0].removeAttribute('readonly','readonly')", date2);		 
		date2.click();
		date2.sendKeys(itrtantoSample());
		btnsubmit.click();	  
	}

	public String verifyItrTanverification() 
	{
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(itrtanverificationtext));
		return itrtanverificationtext.getText();				
	}

	//action method for basic UAN Verification Search Count
	public String getUANVerificationSearchCount() throws InterruptedException {
		String BasicUANVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(EmploymentSearchSummary));
		EmploymentSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Basic UAN Verification")) {

				BasicUANVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return BasicUANVerificationCount;
	}
	//action method for basic UAN verification
	public void basicUANVerification() throws IOException, InterruptedException {
		ldriver.get("https://www.truthscreen.com/employment/uan_details");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(enterUAN));
		enterUAN.click();
		enterUAN.sendKeys(uanoSample());
		Thread.sleep(300);
		btnsubmit.click();
	}
	public String verifyBasicUANverification() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(UANverificationSuccessMsg));
		return UANverificationSuccessMsg.getText();
	}
	
	//action method for Epfo check Exact Match SEARCH count
	public String getEpfoCheckSearchCount() throws InterruptedException {
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(EmploymentSearchSummary));
		EmploymentSearchSummary.click();
		wait.until(ExpectedConditions.visibilityOf(EpfoCheckExactMatchSearchCount));
		return EpfoCheckExactMatchSearchCount.getText();
	}
	public void epfoCheckVerification() throws IOException {
		ldriver.get("https://www.truthscreen.com/employment/employee_epfo_verification");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(companyName));
		companyName.sendKeys(epfoCompanyNameSample());
		personName.sendKeys(epfoPersonNameSample());
		btnsubmit.click();
	}
	public String verifyEpfoMatchSuccessMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(epfoMatchSuccessMsg));
		return epfoMatchSuccessMsg.getText();
	}

	//EPFO Employer search SEARCH count
	public String EpfoEmployerSearchCount() throws IOException {
		String EPFOEmployerSearchCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(EmploymentSearchSummary));
		EmploymentSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("EPFO Employer Search")) {

				EPFOEmployerSearchCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return EPFOEmployerSearchCount;
	}
	//ACTION method for Epfo Employer search Sample submit
	public void EpfoEmployerSearchVerification() throws IOException {
		ldriver.get("https://www.truthscreen.com/employment/employer_pf_verification");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(enterEpfoEmployerCompanyName));
		enterEpfoEmployerCompanyName.sendKeys(epfoEmployerNameSample());
		btnsubmit.click();
	}
	//verify epfo Employer search Success Msg
	public String verifyEpfoEmployerSearchSuccessMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(epfoEmployerSearchSuccessMsg));
		return epfoEmployerSearchSuccessMsg.getText();
	}

	//Epfo Employee verification Search Count
	public String EpfoEmployeeVerificationSearchCount() throws IOException {
		String EpfoEmployeeSearchCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(EmploymentSearchSummary));
		EmploymentSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("EPFO : Employee Search")) {

				EpfoEmployeeSearchCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return EpfoEmployeeSearchCount;
	}
	//sample submit for Epfo Employee verification
	public void EpfoEmployeeVerification() throws IOException, InterruptedException {
		ldriver.get("https://www.truthscreen.com/employment/employee_company_verification");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(enterEmployeeCompanyName));
		enterEmployeeCompanyName.click();
		enterEmployeeCompanyName.sendKeys(epfoEmployeeCompanyNameSample());
		btnsubmit.click();
		wait.until(ExpectedConditions.visibilityOf(companyNameDropDown));
		Thread.sleep(100);
		Select sel=new Select(companyNameDropDown);
		sel.selectByIndex(1);
		Thread.sleep(100);
		enterEmployeeName.click();
		enterEmployeeName.sendKeys(epfoEmployeeNameSample());
		Thread.sleep(100);
		Select doj=new Select(enterEmployeeDoj);
		doj.selectByValue(epfoEmployeeDOJSample());
		finalSubmitBtn.click();
	}
	//verify Employee Search Success MSG
	public String verifyEpfoEmployeeSearchSuccessMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(epfoEmployeeSearchSuccessMsg));
		return epfoEmployeeSearchSuccessMsg.getText();
	}

	//Employer Default check search count
	public String EmployerDefaultCheckSearchCount() throws IOException {
		String EmployerDefaultCheckCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(EmploymentSearchSummary));
		EmploymentSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Employer Default Check")) {

				EmployerDefaultCheckCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return EmployerDefaultCheckCount;
	}
	//sample submit for Employer Default check
	public void EmployerDefaultCheckVerification() throws IOException { 
		ldriver.get("https://www.truthscreen.com/employment/employer_default_check");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(EmployerEstablishmentId));
		EmployerEstablishmentId.click();
		EmployerEstablishmentId.sendKeys(EmployerDefaultCheckEstablishmentIdSample());
		WebElement date= ldriver.findElement(By.id("employmentPeriodfrom")); 
		((JavascriptExecutor) ldriver).executeScript("arguments[0].removeAttribute('readonly','readonly')", date); 
		date.click();
		date.sendKeys(EmployerDefaultCheckFromDate());
		WebElement date2= ldriver.findElement(By.id("employmentPeriodto")); 
		((JavascriptExecutor) ldriver).executeScript("arguments[0].removeAttribute('readonly','readonly')", date2);		 
		date2.click();
		date2.sendKeys(EmployerDefaultCheckToDate());
		btnsubmit.click();	  
	}
	//verify employer default check success msg
	public String verifyEmployerDefaultCheckSuccessMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(EmployerDefaultCheckVerifySuccessMsg));
		return EmployerDefaultCheckVerifySuccessMsg.getText();
	}

	//BGV: Employment check search count
	public String BgvEmployementCheckSearchCount() throws IOException {
		String BGVEmploymentCheckCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(EmploymentSearchSummary));
		EmploymentSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("BGV: Employment Check")) {

				BGVEmploymentCheckCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return BGVEmploymentCheckCount;
	}
	//sample submit for Bgv Employment check
	public void BgvEmploymentCheckVerification() throws IOException { 
		ldriver.get("https://www.truthscreen.com/verification/employment_verification");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(BgvEmployeeName));
		BgvEmployeeName.click();
		BgvEmployeeName.sendKeys(BgvEmployeeNameSample());
		BgvEmployeeMobileNum.click();
		BgvEmployeeMobileNum.sendKeys(BgvEmployeeMobNum());
		((JavascriptExecutor) ldriver).executeScript("arguments[0].removeAttribute('readonly','readonly')", BgvEmployeeDOB); 
		BgvEmployeeDOB.click();
		BgvEmployeeDOB.sendKeys(BgvEmployeeDOB());
		btnsubmit.click();
	}
	//VERIFY Bgv Employment success msg
	public String verifyBgvEmploymentCheckSuccessMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(BgvEmploymentCheckSuccessMsg));
		return BgvEmploymentCheckSuccessMsg.getText();
	}

	
	// action method for Dual Employment Check  search count
	public String getDualEmploymentCheckSearchCount() throws InterruptedException {
		String DualEmploymentCheckCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(EmploymentSearchSummary));
		EmploymentSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Dual Employment Check")) {

				DualEmploymentCheckCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return DualEmploymentCheckCount;
	}
	//Action Methods for Dual Employment Check Status
	public void DualEmploymentCheckVerification() throws InterruptedException, IOException {	
		ldriver.get("https://truthscreen.com/employment/dual_employment_check");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(UANNo));
		UANNo.click();
		UANNo.sendKeys(DualEmployercheckUANSample());
		Thread.sleep(300);
		UANDetailEmployer.click();
		UANDetailEmployer.sendKeys(DualEmployercheckEmployerSample());
		btnsubmit.click();				
	}
	public String VerifyUANDetailsverification() 	{

		wait = new WebDriverWait(ldriver, 120);	
		wait.until(ExpectedConditions.visibilityOf(UANDetails));
		return UANDetails.getText();
	}
	public String VerifyEstablishmentNameverification() 	{
		wait = new WebDriverWait(ldriver, 120);	
		wait.until(ExpectedConditions.visibilityOf(EstablishmentName));
		return EstablishmentName.getText();
	}
	
	//Negative Due Deligance search Count
	public String getNegativeDueDeliganceSearchCount() throws InterruptedException {
		String NegativeDueDiligenceCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(EmploymentSearchSummary));
		EmploymentSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Negative Due Diligence")) {

				NegativeDueDiligenceCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return NegativeDueDiligenceCount;
	}
	//Action method for Negative Due Deligance
	public void NegativeDueDeliganceVerification() throws InterruptedException, IOException {	
		ldriver.get("https://www.truthscreen.com/mobile_user_details/due_diligence");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(UserType));
//		Select sel=new Select(UserType);
//		sel.selectByIndex(1);
		name.sendKeys(NegativeDueDiligenceSample());
		btnsubmit.click();				
	}
	public String VerifyNegativeDueDeliganceverification() 	{
		wait = new WebDriverWait(ldriver, 120);	
		Actions act=new Actions(ldriver);
		act.moveToElement(CibilDefaulterList);
		wait.until(ExpectedConditions.visibilityOf(CibilDefaulterList));
		return CibilDefaulterList.getText();
	}
	public String VerifyDefaulterName() 	{
		wait = new WebDriverWait(ldriver, 120);	
		wait.until(ExpectedConditions.visibilityOf(DefaulterName));
		return DefaulterName.getText();
	}
}
