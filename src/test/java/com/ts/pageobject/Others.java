package com.ts.pageobject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ts.XLUtils;



public class Others extends NID{

	public Others(WebDriver rdriver) {
		super(rdriver);
		// TODO Auto-generated constructor stub
	}

	// Element Locators

	@FindBy(id ="get_all_category_data")
	@CacheLookup
	WebElement submit;

	@FindBy(id="submitBtn")
	@CacheLookup
	WebElement btn;

	@FindBy(id ="VerificationMobileNumber")
	@CacheLookup
	WebElement Phoneveri;

	@FindBy(id ="VerificationEmailAddress")
	@CacheLookup
	WebElement Emailveri;

	@FindBy(id ="namematching_type1")
	@CacheLookup
	WebElement radiobutton;

	@FindBy(id ="name1")
	@CacheLookup
	WebElement Name1;

	@FindBy(id ="name2")
	@CacheLookup
	WebElement Name2;

	@FindBy(id ="frontImage")
	@CacheLookup
	WebElement Facefrontveri;

	@FindBy(id ="backImage")
	@CacheLookup
	WebElement Facebackveri;

	@FindBy(xpath ="//*[@id=\"VerificationVerificationNumber\"]")
	@CacheLookup
	WebElement mailveri;

	@FindBy(id="VerificationName") 
	@CacheLookup
	WebElement PEP_search;  

	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[5]")
	@CacheLookup
	WebElement MoveToOther;

	@FindBy(id="VerificationEmployeeName")
	@CacheLookup
	WebElement EmpName;

	@FindBy(id="employer_name")
	@CacheLookup
	WebElement EmployerName;

	@FindBy (xpath="//button[contains(.,'Run a Match')]")
	@CacheLookup
	WebElement RunAmatch;

	@FindBy (xpath = "//button[contains(.,'Validate')]")
	@CacheLookup
	WebElement ValidateBtn;




	// Verification

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[5]/strong")
	@CacheLookup
	WebElement EmailVerifySearchCount;

	@FindBy(xpath ="//*[contains(text(),'Your email varification process has been successfuly initiated.')]")
	@CacheLookup
	WebElement Emailphoneverificationtext;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[2]/div[2]/div/table/tbody/tr/td")
	@CacheLookup
	WebElement Nameverificationtext;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/table/tbody/tr[1]/td")
	@CacheLookup
	WebElement Faceverificationtext;

	@FindBy(xpath ="//*[text()='Email address is verified.']")
	@CacheLookup
	WebElement mailverificationtext;

	@FindBy(xpath ="//span[text()='Other ']/ancestor::li[@class='row']/descendant::a[@class='icon-dot']")
	@CacheLookup
	WebElement otherSearchSummary;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[7]/strong")
	@CacheLookup
	WebElement emailPhoneSearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[6]/strong")
	@CacheLookup
	WebElement NameMatchSearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[2]/strong")
	@CacheLookup
	WebElement FaceMatchSearchCount;

	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[9]/strong")
	@CacheLookup
	WebElement AdvanceEmailVerifySearchCount;

	@FindBy(xpath ="//*[@id='VerificationVerificationNumber']")
	@CacheLookup
	WebElement AdvanceEmailSearchBox;

	@FindBy(xpath ="//*[contains(text(),'Details found successfully')]")
	@CacheLookup
	WebElement AdvanceEmailVerificationSuccessMsg;

	@FindBy(xpath="//tbody/tr/th[1]")   //
	@CacheLookup
	WebElement PEPveriName;

	@FindBy(xpath="//table[@class='table table-striped table-bordered dataTable']/tbody/tr[contains(.,'India Rajya Sabha')]")
	@CacheLookup
	WebElement PEPveriOp;

	@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'PEP Search  ')]/strong")  //
	@CacheLookup
	WebElement PEPsearchCount;

	//Comprehensive Email Verification
	@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'Comprehensive Email Verification  ')]/strong")
	@CacheLookup
	WebElement ComprehensiveEmailCount;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]")
	@CacheLookup
	WebElement ReportsLink;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")
	@CacheLookup
	WebElement MoreInfo;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/h1[1]")
	@CacheLookup
	WebElement ComprehensiveEmailSummary;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]")
	@CacheLookup
	WebElement ChooseOrgListPage;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/ul[1]/li[5]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement RadioBtn;

	@FindBy(xpath="//table[@class='table table-striped']/tbody/tr/td[4]")
	@CacheLookup
	WebElement DomainVeriStatus;

	@FindBy(xpath="//table[@class='table table-striped' and @id='table-2']/tbody/tr/td[contains(.,'ajay.trehan@authbridge.com')]")
	@CacheLookup
	WebElement Detailedinfo;

	@FindBy(xpath="//button[@class='btn-lg btn-default']")
	@CacheLookup
	WebElement Btn1;

	//Employment check epfo veri

	@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'Employment Check EPFO  ')]/strong")
	@CacheLookup
	WebElement EmpCheckEpfoCount;

	@FindBy(xpath="//strong[contains(.,'EPFO Verification Successfully done.')]")
	@CacheLookup
	WebElement EpfoVerification;

	@FindBy(xpath="/html[1]/body[1]/ul[1]/li[1]/div[1]")
	@CacheLookup
	WebElement CompFullName;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")
	@CacheLookup
	WebElement Observation;

	//liveness verification
	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[10]/strong")
	@CacheLookup
	WebElement livenessSearchCount;

	@FindBy(xpath ="//*[@id='frontImage']")
	@CacheLookup
	WebElement livenessUploadImgBox;

	@FindBy(xpath ="//*[contains(text(),'Face Match Details')]")
	@CacheLookup
	WebElement livenessVerifySuccessMsg;

	//adv Name-Address Match
	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[12]/strong")
	@CacheLookup
	WebElement AdvanceNameAddressMatch;

	@FindBy(xpath ="//*[@id='name1']")
	@CacheLookup
	WebElement enterFirstName;

	@FindBy(xpath ="//*[@id='name2']")
	@CacheLookup
	WebElement enterSecondName;

	@FindBy(xpath ="//*[contains(text(),'Run a Match')]")
	@CacheLookup
	WebElement submitDetailsBtn;

	@FindBy(xpath ="//*[contains(text(),'Level 1 match score')]")
	@CacheLookup
	WebElement verifyAdvNameAddMatchSuccessMsg;

	//Doc classification
	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[11]/strong")
	@CacheLookup
	WebElement docClassificationSearchCount;

	@FindBy(xpath ="//*[@id='DocVerificationProcessType']")
	@CacheLookup
	WebElement docClassificationProcessTypeDropdown;

	@FindBy(xpath ="//*[@id='frontImage']")
	@CacheLookup
	WebElement docFrontImage;

	@FindBy(xpath ="//*[@id='backImage']")
	@CacheLookup
	WebElement docBackImage;

	@FindBy(xpath ="//*[@id='submit-all']")
	@CacheLookup
	WebElement performOcrBtn;

	@FindBy(xpath ="//*[text()='Correct document uploaded']")
	@CacheLookup
	WebElement docClassificationSuccessMsg;

	//cowin link generation
	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[13]/strong")
	@CacheLookup
	WebElement cowinLinkGenerationSearchCount;

	@FindBy(xpath ="//*[@id='frontImage']")
	@CacheLookup
	WebElement cowinSampleSubmitBox;

	//basic Email Verification
	@FindBy(xpath ="/html/body/div[5]/div[2]/div/ul/li[15]/strong")
	@CacheLookup
	WebElement basicEmailVerificationSearchCount;

	@FindBy(xpath ="//*[@id='VerificationEmailAddress']")
	@CacheLookup
	WebElement enterEmailId;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div[1]/div/strong")
	@CacheLookup
	WebElement basicEmailVerificationSuccessMsg;

	//New docs classification
	@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'New Doc Classification  ')]/strong")
	@CacheLookup
	WebElement newdocsClassificationsearchCount;

	@FindBy(xpath="//table[@class='table table-striped fs-13 c6 mb-1']/tbody/tr/td[2]")
	@CacheLookup
	WebElement docsClassificationResult;

	@FindBy(xpath="//input[@type='file']")
	@CacheLookup
	WebElement uplodFile;

	//Domain search
	@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'Domain Verification  ')]/strong")
	@CacheLookup
	WebElement domainSearchCount;

	@FindBy(xpath="//strong[text()='Domain']/ancestor::div[@class='radio']/descendant::input[@type='radio']")
	@CacheLookup
	WebElement domainradioButton;

	@FindBy(xpath="//input[@id='VerificationDomainName']")
	@CacheLookup
	WebElement domainNameSearch;

	@FindBy(xpath="//table[@class='table table-striped']/tbody/tr[2]/td[contains(.,'GoDaddy.com, LLC')]")
	@CacheLookup
	WebElement domainVerificationText;

	// action method for E-mail & Phone verify search count
	public String getEmailPhoneSearchCount() throws InterruptedException {
		String EmailandPhoneVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(otherSearchSummary));
		otherSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Email and Phone Verification")) {
				EmailandPhoneVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return EmailandPhoneVerificationCount;
	}
	//Action Methods for E-mail & Phone Verification
	public void EmailPhoneVerification()throws InterruptedException {	
		try {
			ldriver.get("https://www.truthscreen.com/emailplusphoneverification/initiateVerification");
			Phoneveri.click();
			Phoneveri.sendKeys(PhnSample());
			Emailveri.click();
			Emailveri.sendKeys(EmailSample());
			btnsubmit.click();	

		} catch (IOException e) {

			e.printStackTrace();
		}
	}		
	public String verifyEmailPhoneverification() {
		wait = new WebDriverWait(ldriver, 20);
		wait.until(ExpectedConditions.visibilityOf(Emailphoneverificationtext));				
		return Emailphoneverificationtext.getText();		
	}

	// action method for  Name Match  search count
	public String getNameMatchSearchCount() throws InterruptedException {
		String NameAddressMatchCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(otherSearchSummary));
		otherSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Name/Address Match")) {

				NameAddressMatchCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return NameAddressMatchCount;
	}
	//Action Methods for Name Match 
	public void NameMatchVerification()throws InterruptedException, IOException
	{	
		ldriver.get("https://www.truthscreen.com/verification/name_matching");
		wait = new WebDriverWait(ldriver, 20);
		wait.until(ExpectedConditions.visibilityOf(radiobutton));
		radiobutton.click();
		Name1.click();
		Name1.sendKeys(NameSample1());
		Name2.click();
		Name2.sendKeys(NameSample2());
		RunAmatch.click();				
	}		
	public String verifyNameeverification() {
		wait = new WebDriverWait(ldriver, 20);
		wait.until(ExpectedConditions.visibilityOf(Nameverificationtext));				
		return Nameverificationtext.getText();		
	}

	// action method for face Match  search count
	public String getFaceMatchSearchCount() throws InterruptedException {
		String FaceAPIVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(otherSearchSummary));
		otherSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Face API Verification")) {

				FaceAPIVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return FaceAPIVerificationCount;
	}

	//Action Methods for Face Match 
	public void FaceMatchVerification()throws InterruptedException, IOException
	{	
		ldriver.get("https://www.truthscreen.com/Verification/face_verification");
		wait = new WebDriverWait(ldriver, 20);
		wait.until(ExpectedConditions.visibilityOf(Facefrontveri));				
		Facefrontveri.sendKeys(FacefrontSample());
		Facebackveri.sendKeys(FacebackSample());
		btnsubmit.click();				
	}
	public String verifyFaceverification() {
		wait = new WebDriverWait(ldriver, 20);
		wait.until(ExpectedConditions.visibilityOf(Faceverificationtext));				
		return Faceverificationtext.getText();		
	}

	// action method for email verification search count
	public String getEmailVerificationSearchCount() throws InterruptedException {
		String EmailVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(otherSearchSummary));
		otherSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Email Verification")) {

				EmailVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return EmailVerificationCount;
	}

	//Action Methods for Email Verification
	public void Email_Verification()throws InterruptedException {	
		try {
			ldriver.get("https://www.truthscreen.com/verification/email_verification_link");
			wait = new WebDriverWait(ldriver, 20);
			wait.until(ExpectedConditions.visibilityOf(mailveri));					
			mailveri.click();
			mailveri.sendKeys(MailSample());
			btnsubmit.click();	
		} catch (IOException e) {

			e.printStackTrace();
		}
	}			
	public String verifymailverification() {
		wait = new WebDriverWait(ldriver, 20);
		wait.until(ExpectedConditions.visibilityOf(mailverificationtext));				
		return mailverificationtext.getText();		
	}

	//advanced Email Serach Count
	public String getAdvanceEmailVerificationSerachCount() {
		String AdvancedEmailVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(otherSearchSummary));
		otherSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Advanced Email Verification")) {

				AdvancedEmailVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return AdvancedEmailVerificationCount;
	}
	//advance Email sample submit
	public void AdavnceEmailVerification() {
		try {
			ldriver.get("https://www.truthscreen.com/verification/advanced_email_verification");
			wait = new WebDriverWait(ldriver, 20);
			wait.until(ExpectedConditions.visibilityOf(AdvanceEmailSearchBox));					
			AdvanceEmailSearchBox.click();
			AdvanceEmailSearchBox.sendKeys(MailSample());
			ValidateBtn.click();	
		} 
		catch (IOException e) {

			e.printStackTrace();
		}
	}
	//verify Advance Email Veriffication Success Msg
	public String AdvanceEmailVerificationSuccessMsg() {
		wait = new WebDriverWait(ldriver, 20);
		wait.until(ExpectedConditions.visibilityOf(AdvanceEmailVerificationSuccessMsg));				
		return AdvanceEmailVerificationSuccessMsg.getText();	
	}

	//liveness Search count
	public String livenessSearchCount() {
		String LivenessCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(otherSearchSummary));
		otherSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Liveness")) {

				LivenessCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return LivenessCount;
	}
	//action method for liveness sample submit 
	public void livenessVerification() throws IOException, InterruptedException {
		ldriver.get("https://www.truthscreen.com/Verification/liveness_verification");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(livenessUploadImgBox));
		livenessUploadImgBox.sendKeys(LivenessSample());
		Thread.sleep(1000);
		btnsubmit.click();
	}
	//verify liveness verify success Msg
	public String verifyLivenessSuccessMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(livenessVerifySuccessMsg));				
		return livenessVerifySuccessMsg.getText();
	}

	//Adv name/Add match Search Count
	public String AdvNameAddressMatchSearchCount() {
		String AdvancedNameAddressMatchCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(otherSearchSummary));
		otherSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Advanced Name/Address Match")) {

				AdvancedNameAddressMatchCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return AdvancedNameAddressMatchCount;
	}

	//action method for name Advance Name and Address Match sample submit
	public void advanceNameAddressMatchVerification() throws IOException {
		ldriver.get("https://www.truthscreen.com/verification/adv_name_matching");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(enterFirstName));
		enterFirstName.click();
		enterFirstName.sendKeys(AdvNameAddMatchFirstNameSample());
		enterSecondName.click();
		enterSecondName.sendKeys(AdvNameAddMatchSecondNameSample());
		submitDetailsBtn.click();
	}
	//verify Name Address Match Sucess Msg
	public String verifyAdvNameAddMatchSuccessMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyAdvNameAddMatchSuccessMsg));				
		return verifyAdvNameAddMatchSuccessMsg.getText();
	}
	//Doc classification search count
	public String DocClassificationSearchCount() {
		String DocumentClassificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(otherSearchSummary));
		otherSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Document Classification")) {

				DocumentClassificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return DocumentClassificationCount;
	}
	//sample submit for doc classification
	public void docClassificationVerification() throws IOException {
		ldriver.get("https://www.truthscreen.com/ocrverification/doc_classification");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(docClassificationProcessTypeDropdown));
		Select sel=new Select(docClassificationProcessTypeDropdown);
		sel.selectByIndex(0);
		docFrontImage.sendKeys(Aadhaocr1Sample());
		docBackImage.sendKeys(Aadhaocr2Sample());
		//js.executeScript("arguments[0].scrollIntoView(true);",performOcrBtn);
		performOcrBtn.click();
	}
	//verify doc classification success msg
	public String verifyDocClassificationSuccessMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(docClassificationSuccessMsg));				
		return docClassificationSuccessMsg.getText();
	}
	//cowin link generation search count
	public String cowinLinkGenerationSearchCount() {
		String CowinLinkGenerationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(otherSearchSummary));
		otherSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Cowin Link Generation")) {

				CowinLinkGenerationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return CowinLinkGenerationCount;
	}
	//sample submit for cowin link generate
	public void cowinLinkGenerate() throws IOException {
		ldriver.get("https://www.truthscreen.com/BulkProcess/cowin_link_gen");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(cowinSampleSubmitBox));
		cowinSampleSubmitBox.sendKeys(cowinLinkGenSample());
		btnsubmit.click();
	}


	//basic Email verification search count
	public String basicEmailVerificationSearchCount() {
		String BasicEmailVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(otherSearchSummary));
		otherSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Basic Email Verification")) {

				BasicEmailVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return BasicEmailVerificationCount;
	}
	//action method for Email sample submit
	public void submitEmailSample()  {
		try {
			ldriver.get("https://www.truthscreen.com/emailverification/initiate");
			wait=new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(enterEmailId));
			enterEmailId.sendKeys(MailSample());
			btnsubmit.click();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	//verify Basic Email verification success msg
	public String basicEmailVerificationSuccessMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(basicEmailVerificationSuccessMsg));				
		return basicEmailVerificationSuccessMsg.getText();
	}


	// action method for PEP search count
	public String getPEPsearchCount() {
		String PEPSearchCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(otherSearchSummary));
		otherSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("PEP Search")) {

				PEPSearchCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return PEPSearchCount;
	}
	// action method for PEP check verification
	public void  PEP_search() throws InterruptedException, IOException {
		ldriver.get("https://www.truthscreen.com/PepSearch/politically_exposed_person");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(PEP_search));
		XLUtils obj  = new XLUtils();
		String PEPsample;

		try {
			PEPsample =obj.PEPsample();
			PEP_search.click();
			PEP_search.sendKeys(PEPsample);
			btnsubmit.click();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
	public String verifyPEPop() {
		wait = new WebDriverWait(ldriver, 2000);
		wait.until(ExpectedConditions.visibilityOf(PEPveriOp));				
		return PEPveriOp.getText();
	} 


	//Action method for Employement check EPFO search count
	public String getEmployementcheckEPFO() throws InterruptedException {
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(otherSearchSummary));
		otherSearchSummary.click();
		wait.until(ExpectedConditions.visibilityOf(EmpCheckEpfoCount));
		return EmpCheckEpfoCount.getText();
	}
	//Action Methods for Employement check EPFO Verification
	public void Employementcheck()throws InterruptedException, IOException {	
		try {
			ldriver.get("https://www.truthscreen.com/employmentEpfo/initiate");

			Emailveri.sendKeys(OfficialEmailIDsample());
			Thread.sleep(500);
			EmpName.sendKeys(EmployeeNamesample());
			Thread.sleep(500);
			EmployerName.sendKeys(EmployerName());
			Thread.sleep(500);
			wait.until(ExpectedConditions.visibilityOf(CompFullName));
			Actions actions= new Actions(ldriver);
			actions.moveToElement(CompFullName);
			Thread.sleep(1000);
			actions.sendKeys(Keys.ARROW_DOWN).click().build().perform();
			btn.click();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}		
	public String verifyEmployementcheck() {
		wait = new WebDriverWait(ldriver, 20);
		wait.until(ExpectedConditions.visibilityOf(EpfoVerification));				
		return EpfoVerification.getText();
	}
	public String verifyObservationCheck() {
		wait = new WebDriverWait(ldriver,20);
		wait.until(ExpectedConditions.visibilityOf(Observation));
		return Observation.getText();
	}


	//Action method for Comprehensive email search count
	public String getComprehensiveEmailCount() throws InterruptedException {
		String ComprehensiveEmailVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(otherSearchSummary));
		otherSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Comprehensive Email Verification")) {

				ComprehensiveEmailVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return ComprehensiveEmailVerificationCount;
	}
	//Action Methods for Comprehensive email Verification
	public void ComprehensiveEmail()throws InterruptedException, IOException {	
		try {
			ldriver.get("https://www.truthscreen.com/EmailMcaVerification/initiate");
			Emailveri.click();
			Emailveri.sendKeys(ComprehensiveEmailsample());
			btn.click();
			wait=new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(ReportsLink));  
			ReportsLink.click();
			//	wait.until(ExpectedConditions.visibilityOf(ComprehensiveEmailSummary));   
			MoreInfo.click();

			//	wait.until(ExpectedConditions.visibilityOf(ChooseOrgListPage));
			//	wait.until(ExpectedConditions.visibilityOf(radiobutton));
			RadioBtn.click();
			Thread.sleep(3000);
			//    Actions act=new Actions(ldriver);
			//   act.moveToElement(ReportsLink).click().build().perform();
			//	JavascriptExecutor js=(JavascriptExecutor)ldriver;
			//	js.executeScript("arguments[0].scrollIntoView(true);",btn);
			Btn1.click();

			wait.until(ExpectedConditions.visibilityOf(ComprehensiveEmailSummary));

		} catch (IOException e) {

			e.printStackTrace();
		}
	}		
	public String verifyComprehensiveEmail() {
		wait = new WebDriverWait(ldriver, 20);
		wait.until(ExpectedConditions.visibilityOf(DomainVeriStatus));				
		return DomainVeriStatus.getText();
	}
	public String verifyRegisteredEmailID() {
		wait = new WebDriverWait(ldriver, 20);
		wait.until(ExpectedConditions.visibilityOf(Detailedinfo));				
		return Detailedinfo.getText();
	}

	// action method for New Doc Classification search count
	public String getnewDocClassificationCount() throws InterruptedException {
		String NewDocClassificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(otherSearchSummary));
		otherSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("New Doc Classification")) {

				NewDocClassificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return NewDocClassificationCount;
	}
	// action method for New Doc Classification
	public void NewdocClassification() throws InterruptedException {	
		try {
			ldriver.get("https://www.truthscreen.com/doc_classification");
			wait = new WebDriverWait(ldriver, 20);
			wait.until(ExpectedConditions.visibilityOf(uplodFile));
			Actions act=new Actions(ldriver);
			act.moveToElement(uplodFile).build().perform();
			Thread.sleep(1000);
			uplodFile.sendKeys(Panocr1Sample());
			Thread.sleep(1000);
			submitBtn.click();	
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public String verifyNewdocClassificationMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(docsClassificationResult));			
		return docsClassificationResult.getText();
	}

	//Action method for Domain verification Search count
	public String getDomainSearchCount() throws InterruptedException {
		String DomainVerificationCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(otherSearchSummary));
		otherSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();
		// Get NID all services count                
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Domain Verification")) {

				DomainVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return DomainVerificationCount;
	}
	//Action method for Domain verification
	public void DomainSearch() throws InterruptedException {	
		try {
			ldriver.get("https://www.truthscreen.com/verification/domain_information");
			wait = new WebDriverWait(ldriver, 20);
			wait.until(ExpectedConditions.visibilityOf(domainradioButton));
			domainradioButton.click();
			domainNameSearch.sendKeys(DomainName());
			Thread.sleep(1000);
			submitBtn.click();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	//Domain Verification
	public String domainVerificationMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(domainVerificationText));			
		return domainVerificationText.getText();
	}

}








