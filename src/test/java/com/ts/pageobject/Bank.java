package com.ts.pageobject;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bank extends NID{
	
	public Bank(WebDriver rdriver) {
		super(rdriver);
		
	}
 
	//*********Elements*****///
	
			@FindBy(id ="VerificationIfscCode")
			@CacheLookup
			WebElement IfscCode;
	
			@FindBy(id ="autocomplete")
			@CacheLookup
			WebElement ifscsearch;
			
			@FindBy(className ="select2-search__field")
			@CacheLookup
			WebElement citytextbox;
			
			@FindBy(id ="autocomplete")
			@CacheLookup
			WebElement cityid;
				
			@FindBy(id ="autocompletebank")
			@CacheLookup
			WebElement bankname;	
			
			@FindBy(xpath ="//*[@id='collapseOne']/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td")
			@CacheLookup
			WebElement ifscverificationtext;
			
			@FindBy(xpath="//span[text()='BANK ']/ancestor::li[@class='row']/descendant::a[@class='icon-dot']")
			@CacheLookup
			WebElement bankSearchSummary;
			
			@FindBy(xpath="//*[@id='bankStatement1']")
			@CacheLookup
			WebElement bankStatementUploadBox;
			
			@FindBy(xpath="//*[@id='submit-all']")
			@CacheLookup
			WebElement submitBtn;
			
			@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/strong")
			@CacheLookup
			WebElement bankStatementuploadSuccessTxt;

			
			@FindBy(xpath="//*[@id='netFetchself']")
			@CacheLookup
			WebElement initiateSelfRadioBtn;
			
			@FindBy(xpath="//*[@id='bank_name']")
			@CacheLookup
			WebElement enterCandidateName;
			
			@FindBy(xpath="//*[@id='bank_verificationEmaiId']")
			@CacheLookup
			WebElement enterCandidateEmail;
			
			@FindBy(xpath="//*[@id='bank_mob']")
			@CacheLookup
			WebElement enterCandidateMob;
			
			@FindBy(xpath="/html/body/div/div[5]/div[1]/div/div[1]")
			@CacheLookup
			WebElement BankName;
			
			@FindBy(xpath="/html/body/div/div[5]/div[1]/div/div[1]/div[1]")
			@CacheLookup
			WebElement searchBankName;
			
			@FindBy(xpath="//*[@value='STATEMENT_UPLOAD']")
			@CacheLookup
			WebElement bankStatementUploadRadioBtn;
			
			@FindBy(xpath="//*[text()='Continue']")
			@CacheLookup
			WebElement continueBtn;
			
			@FindBy(xpath="//*[@type='button']")
			@CacheLookup
			WebElement uploadBtn;
			
			@FindBy(xpath="/html/body/div/div[2]/div[2]/div[1]/div/div/form/div[1]/div/div[2]/div/div[2]/select")
			@CacheLookup
			WebElement selectBankName;
			
			@FindBy(xpath="//*[text()='Statement Uploaded Successfully']")
			@CacheLookup
			WebElement bankStatementUploadSuccessMsg;
			
			@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'IFSC Code Verification  ')]/strong")
			@CacheLookup
			WebElement ifscCodeVerificationSearchCount;
			
			@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'IFSC Code Search  ')]/strong")
			@CacheLookup
			WebElement ifscCodeSearchCount;
			
			@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'Bank Statement Analysis  ')]/strong")
			@CacheLookup
			WebElement bankStatementAnalysisSearchCount;
			
			@FindBy(xpath="//*[@id='ifsc_code_search']/ul/li[1]/div/span/span[1]/span")
			@CacheLookup
			WebElement addressIfscCodeSearchDropDown;
			
			@FindBy(xpath="//*[@type='search']")
			@CacheLookup
			WebElement enterAddress;
			
			@FindBy (xpath="//*[@id='autocompletebank']") //(xpath = "//option[contains(.,'PUNJAB NATIONAL BANK')]")  
			@CacheLookup
			WebElement selBankName;
			
			@FindBy(xpath="//*[contains(text(),'Fetch the IFSC Code')]")
			@CacheLookup
			WebElement ifscSearchText;
			
			@FindBy(xpath="//*[text()='Details of Bank Branch']")
			@CacheLookup
			WebElement ifscCodeSearchSuccessMsg;
			
			//bank account Verification-Advanced
			@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'Bank Account Verification - Advanced  ')]/strong")
			@CacheLookup
			WebElement bankAccountVerificationAdvSearchCount;
			
			@FindBy(xpath="//*[@id='VerificationAccountNo']")
			@CacheLookup
			WebElement enterBankAcNum;
			
			@FindBy(xpath="//*[@id='VerificationIfscCode']")
			@CacheLookup
			WebElement enterBankIfscCodeNum;
			
			@FindBy(xpath="//*[contains(text(),'Details of Bank Account')]")
			@CacheLookup
			WebElement BankAccountVerificationSuccessMsg;
			
			//bank statement fetch & Analysis
			@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'Bank Statement Fetch & Analysis  ')]/strong")
			@CacheLookup
			WebElement BankStatementFetchAnalysisSearchCount;
			
			// get IFSC code verification search count
			public String getifscVerificationSearchCount() throws InterruptedException {
				String IFSCCodeVerificationCount=null;
				ldriver.get("https://www.truthscreen.com/dashboard");
				wait=new WebDriverWait(ldriver, 60);
				wait.until(ExpectedConditions.visibilityOf(bankSearchSummary));
				bankSearchSummary.click();
				int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
				for (int r = 1; r <= rows; r++) {
					WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
					String text = servicename.getText();
					if(text.contains("IFSC Code Verification")) {

						IFSCCodeVerificationCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
						break;
					}
				}
				return IFSCCodeVerificationCount;
			}
	
			//Action Methods for IFSC Code verification
			public void IFSCCodeVerification() throws IOException 
			{        
				ldriver.get("https://www.truthscreen.com/bank_verification/ifsc_code_verification");
				wait = new WebDriverWait(ldriver, 60);
				wait.until(ExpectedConditions.visibilityOf(IfscCode));
			    IfscCode.click();
			    IfscCode.sendKeys(IFSCCodeSample());
				btnsubmit.click();	  
			}
			public String verifyifscverification() 
			{
			    wait = new WebDriverWait(ldriver, 60);
			    wait.until(ExpectedConditions.visibilityOf(ifscverificationtext));				
			    return ifscverificationtext.getText();	
			}
			
			// action method for Bank Statement Analysis search count
			public String getBankStatementAnalysisSearchCount() throws InterruptedException {
				String BankStatementAnalysisCount=null;
				ldriver.get("https://www.truthscreen.com/dashboard");
				wait=new WebDriverWait(ldriver, 60);
				wait.until(ExpectedConditions.visibilityOf(bankSearchSummary));
				bankSearchSummary.click();
				int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
				for (int r = 1; r <= rows; r++) {
					WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
					String text = servicename.getText();
					if(text.contains("Bank Statement Analysis")) {

						BankStatementAnalysisCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
						break;
					}
				}
				return BankStatementAnalysisCount;
			}
			//action method bank statement analysis 
			public void submitBankStatementAnalysisSample() throws IOException {
				ldriver.get("https://www.truthscreen.com/Ocrverification/bank_statement_analysis");
				wait=new WebDriverWait(ldriver, 60);
				wait.until(ExpectedConditions.visibilityOf(bankStatementUploadBox));
				bankStatementUploadBox.sendKeys(BankStatementSample());
				btnsubmit.click();
			}
			public String verifyBankStatementUploadMsg() 
			{
			    wait = new WebDriverWait(ldriver, 60);
			    wait.until(ExpectedConditions.visibilityOf(bankStatementuploadSuccessTxt));				
			    return bankStatementuploadSuccessTxt.getText();	
			}
			
			//action method for Bank Statement fetch and Analysis search count
			public String getBankStatementFetchAndAnalysisSearchCount() throws InterruptedException {
				String BankStatementFetchAndAnalysisCount=null;
				ldriver.get("https://www.truthscreen.com/dashboard");
				wait=new WebDriverWait(ldriver, 60);
				wait.until(ExpectedConditions.visibilityOf(bankSearchSummary));
				bankSearchSummary.click();
				int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
				for (int r = 1; r <= rows; r++) {
					WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
					String text = servicename.getText();
					if(text.contains("Bank Statement Fetch & Analysis")) {

						BankStatementFetchAndAnalysisCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
						break;
					}
				}
				return BankStatementFetchAndAnalysisCount;
			
			}
			//action method for submitting bank statement sample
			public void submitBankStatementSample() throws IOException {
				ldriver.get("https://www.truthscreen.com/bank_statementverification");
				wait=new WebDriverWait(ldriver, 120);
				wait.until(ExpectedConditions.visibilityOf(initiateSelfRadioBtn));
				initiateSelfRadioBtn.click();
				wait.until(ExpectedConditions.visibilityOf(enterCandidateName));
				enterCandidateName.sendKeys(candidateName());
				enterCandidateEmail.sendKeys(candidateEmail());
				btnsubmit.click();
				wait.until(ExpectedConditions.visibilityOf(BankName));
				BankName.sendKeys(bankName()+Keys.ENTER);
				wait.until(ExpectedConditions.visibilityOf(bankStatementUploadRadioBtn));
				bankStatementUploadRadioBtn.click();
				continueBtn.click();
				wait.until(ExpectedConditions.visibilityOf(uploadBtn));
				uploadBtn.sendKeys(BankStatementSample());
				wait.until(ExpectedConditions.visibilityOf(selectBankName));
                Select sel=new Select(selectBankName);
                sel.selectByValue(bankName());
                wait.until(ExpectedConditions.visibilityOf(btnsubmit));
                btnsubmit.click();
			}
			//action method verifying for bank statement upload success msg
			public String verifyBankStatementUploadSuccessMsg() {
				wait = new WebDriverWait(ldriver, 120);
			    wait.until(ExpectedConditions.visibilityOf(bankStatementUploadSuccessMsg));				
			    return bankStatementUploadSuccessMsg.getText();
			}
			
			//action method for ifsc search count
			public String getIfscCodeSearchCount() throws InterruptedException {
				String IFSCCodeSearchCount=null;
				ldriver.get("https://www.truthscreen.com/dashboard");
				wait=new WebDriverWait(ldriver, 120);
				wait.until(ExpectedConditions.visibilityOf(bankSearchSummary));
				bankSearchSummary.click();
				int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
				for (int r = 1; r <= rows; r++) {
					WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
					String text = servicename.getText();
					if(text.contains("IFSC Code Search")) {

						IFSCCodeSearchCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
						break;
					}
				}
				return IFSCCodeSearchCount;
			}
			//action method for submitting ifsc code search sample
			public void ifscCodeSearch() throws IOException, InterruptedException {
				ldriver.get("https://www.truthscreen.com/bank_verification/ifsc_code_search");
				wait=new WebDriverWait(ldriver, 120);
				wait.until(ExpectedConditions.visibilityOf(addressIfscCodeSearchDropDown));
				addressIfscCodeSearchDropDown.click();
				wait.until(ExpectedConditions.visibilityOf(enterAddress));
				enterAddress.click();
				Thread.sleep(200);
				enterAddress.sendKeys(ifscAddress());
				Thread.sleep(1000);
				enterAddress.sendKeys(Keys.ENTER);
				Thread.sleep(500);
				Select sel=new Select(selBankName);
				selBankName.click();
				Thread.sleep(1000);
				sel.selectByIndex(1);
				Thread.sleep(1000);
				ifscSearchText.click();
				btnsubmit.click();
			}
			//action method for verifying ifsc code search success msg
			public String verifyIfscCodeSearchSuccessMsg() {
				wait = new WebDriverWait(ldriver, 120);
			    wait.until(ExpectedConditions.visibilityOf(ifscCodeSearchSuccessMsg));				
			    return ifscCodeSearchSuccessMsg.getText();
			}
			
			//Bank Account Verification-Advance search count
			public String getBankAccountVerificationAdvancedSearchCount() throws InterruptedException {
				String BankAccountVerificationAdvancedCount=null;
				ldriver.get("https://www.truthscreen.com/dashboard");
				wait=new WebDriverWait(ldriver, 120);
				wait.until(ExpectedConditions.visibilityOf(bankSearchSummary));
				bankSearchSummary.click();
				int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
				for (int r = 1; r <= rows; r++) {
					WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
					String text = servicename.getText();
					if(text.contains("Bank Account Verification - Advanced")) {

						BankAccountVerificationAdvancedCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
						break;
					}
				}
				return BankAccountVerificationAdvancedCount;
			}
			//action method for bank account verification sample submitn
			public void BankAccountVerificationAdvanced() throws IOException {
				ldriver.get("https://www.truthscreen.com/bank_verification/bank_details");
				wait=new WebDriverWait(ldriver, 120);
				wait.until(ExpectedConditions.visibilityOf(enterBankAcNum));
				enterBankAcNum.click();
				enterBankAcNum.sendKeys(BankAccountSample());
				enterBankIfscCodeNum.click();
				enterBankIfscCodeNum.sendKeys(BankIfscCodeSample());
				btnsubmit.click();
			}
			// verify bank account verification success msg
			public String verifyBankAccountVerificationAdvSuccessMsg() {
				wait = new WebDriverWait(ldriver, 120);
			    wait.until(ExpectedConditions.visibilityOf(BankAccountVerificationSuccessMsg));				
			    return BankAccountVerificationSuccessMsg.getText();
			}
			
			
}


