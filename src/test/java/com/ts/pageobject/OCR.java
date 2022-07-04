package com.ts.pageobject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OCR extends NID {

	public OCR(WebDriver rdriver) {
		super(rdriver);
		// TODO Auto-generated constructor stub
	}

	// Element Locators
	@FindBy(xpath ="//*[@id='frontImage']")
	@CacheLookup
	WebElement frontveri; // OCR

	@FindBy(xpath ="//*[@id='backImage']")
	@CacheLookup
	WebElement backveri; // OCR

	@FindBy(xpath="//*[@id='submit-all']")
	@CacheLookup
	WebElement performocr; //Perform OCR Button


	// Verification

	@FindBy(xpath ="//*[@id='main']/div[2]/div[2]/div/div[2]/div/div/div[1]/div/p")
	@CacheLookup
	WebElement aadharocrverificationtext;

	@FindBy(xpath ="/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/p")
	@CacheLookup
	WebElement panocrverificationtext;

	@FindBy(xpath ="//*[@id='main']/div[2]/div[2]/div/div[2]/div/div/div[1]/div/p")
	@CacheLookup
	WebElement dlocrverificationtext;

	@FindBy(xpath ="//*[@id=\"main\"]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/p")
	@CacheLookup
	WebElement voteridocrverificationtext;

	@FindBy(xpath ="//*[@id='main']/div[2]/div[2]/div/div[2]/div/div/div[1]/div/p")
	@CacheLookup
	WebElement passportocrverificationtext;

	@FindBy(xpath ="//span[text()='OCR ']/ancestor::li[@class='row']/descendant::a[@class='icon-dot']")
	@CacheLookup
	WebElement OCRsearchSummary;

	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'AADHAAR OCR  ')]/strong")
	@CacheLookup
	WebElement AadharOCRcount;

	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'PAN OCR  ')]/strong")
	@CacheLookup
	WebElement PanOCRcount;

	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'DRIVING LICENSE OCR  ')]/strong")
	@CacheLookup
	WebElement DLOCRcount;

	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'VOTER ID OCR  ')]/strong")
	@CacheLookup
	WebElement VoterIdOCRcount;

	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'PASSPORT OCR  ')]/strong")
	@CacheLookup
	WebElement PassportOCRcount;

	//cheque ocr
	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'Cheque OCR  ')]/strong")
	@CacheLookup
	WebElement ChequeOCRcount;

	@FindBy(xpath ="//*[@id='frontImage']")
	@CacheLookup
	WebElement ChequeOCRImageUpload;

	@FindBy(xpath ="//*[contains(text(),'Cheque Detail Found Successfully')]")
	@CacheLookup
	WebElement ChequeOCRVerificationSuccessMsg;

	//advnace passport ocr
	@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'Advanced Passport OCR  ')]/strong")
	@CacheLookup
	WebElement AdvancePassportOCRcount;

	@FindBy(xpath="//p[@class='fs-24 mb-0']")
	@CacheLookup
	WebElement AdvancePassportveriMsg;

	@FindBy(xpath="//table[@class='table table-striped fs-13 c6 mb-30']/tbody/tr[6]/td[2]")
	@CacheLookup
	WebElement AdvancePassportnameMsg;

	JavascriptExecutor js = (JavascriptExecutor) ldriver;

	// action method for aadhar ocr verification search count
	public String getAadharOCRSearchCount() throws InterruptedException {
		String AADHAAROCRCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(OCRsearchSummary));
		OCRsearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("AADHAAR OCR")) {

				AADHAAROCRCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return AADHAAROCRCount;
	}
	//Action Methods for AAdhar OCR Verification
	public void AdharOCRVerification()throws InterruptedException {	
		try {	
			ldriver.get("https://www.truthscreen.com/ocrverification/aadhaar_ocr");
			wait = new WebDriverWait(ldriver, 20);
			wait.until(ExpectedConditions.visibilityOf(frontveri));
			frontveri.sendKeys(Aadhaocr1Sample());
			backveri.sendKeys(Aadhaocr2Sample());
			js.executeScript("window.scrollBy(0,500)");
			performocr.click();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}		
	public String verifyAadharOcrverification() {
		wait = new WebDriverWait(ldriver, 20);
		wait.until(ExpectedConditions.visibilityOf(aadharocrverificationtext));				
		return aadharocrverificationtext.getText();		
	}

	// action method for PAN OCR verification search count
	public String getPanOCRSearchCount() throws InterruptedException {
		String PANOCRCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(OCRsearchSummary));
		OCRsearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("PAN OCR")) {

				PANOCRCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return PANOCRCount;
	}
	//Action Methods for PAN OCR Verification
	public void PANOCRVerification()throws InterruptedException {	
		try {
			ldriver.get("https://www.truthscreen.com/ocrverification/pan_ocr");
			wait = new WebDriverWait(ldriver, 10);
			wait.until(ExpectedConditions.visibilityOf(frontveri));
			frontveri.sendKeys(Panocr1Sample());
			backveri.sendKeys(Panocr2Sample());
			js.executeScript("window.scrollBy(0,500)");
			performocr.click();	
		} catch (IOException e) {

			e.printStackTrace();
		}
	}		
	public String verifyPanOcrverification() 
	{
		wait = new WebDriverWait(ldriver, 20);
		wait.until(ExpectedConditions.visibilityOf(panocrverificationtext));				
		return panocrverificationtext.getText();		
	}

	// action method for DL OCR verification search count
	public String getDLOCRSearchCount() throws InterruptedException {
		String DRIVINGLICENSEOCRCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(OCRsearchSummary));
		OCRsearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("DRIVING LICENSE OCR")) {

				DRIVINGLICENSEOCRCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return DRIVINGLICENSEOCRCount;
	}
	//Action Methods for DL OCR Verification
	public void DLOCRVerification()throws InterruptedException {	
		try {	
			ldriver.get("https://www.truthscreen.com/ocrverification/dl_ocr");
			wait = new WebDriverWait(ldriver, 20);
			wait.until(ExpectedConditions.visibilityOf(frontveri));
			frontveri.sendKeys(dlocr1Sample());
			backveri.sendKeys(dlocr2Sample());
			js.executeScript("window.scrollBy(0,500)");
			performocr.click();	
		} catch (IOException e) {

			e.printStackTrace();
		}
	}		
	public String verifydlOcrverification() {
		wait = new WebDriverWait(ldriver, 20);
		wait.until(ExpectedConditions.visibilityOf(dlocrverificationtext));				
		return dlocrverificationtext.getText();		
	}

	// action method for voter id OCR verification search count
	public String getVoterIdOCRSearchCount() throws InterruptedException {
		String VOTERIDOCRCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(OCRsearchSummary));
		OCRsearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("VOTER ID OCR")) {

				VOTERIDOCRCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return VOTERIDOCRCount;
	}
	//Action Methods for Voter Id OCR Verification
	public void VoterIdOCRVerification()throws InterruptedException {	
		try {	
			ldriver.get("https://www.truthscreen.com/ocrverification/voterid_ocr");
			wait = new WebDriverWait(ldriver, 20);
			wait.until(ExpectedConditions.visibilityOf(frontveri));
			frontveri.sendKeys(voteridocr1Sample());
			backveri.sendKeys(voteridocr2Sample());
			js.executeScript("window.scrollBy(0,500)");
			performocr.click();	
		} catch (IOException e) {

			e.printStackTrace();
		}
	}		
	public String verifyvoteridOcrverification() {
		wait = new WebDriverWait(ldriver, 20);
		wait.until(ExpectedConditions.visibilityOf(dlocrverificationtext));				
		return dlocrverificationtext.getText();		
	}

	// action method for Passport OCR verification search count
	public String getPassportOCRSearchCount() throws InterruptedException {
		String PASSPORTOCRCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(OCRsearchSummary));
		OCRsearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("PASSPORT OCR")) {

				PASSPORTOCRCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return PASSPORTOCRCount;
	}
	//Action Methods for Passport OCR Verification
	public void PassportOCRVerification()throws InterruptedException {	
		try {
			ldriver.get("https://www.truthscreen.com/ocrverification/passport_ocr");
			wait = new WebDriverWait(ldriver, 20);
			wait.until(ExpectedConditions.visibilityOf(frontveri));
			frontveri.sendKeys(Passportocr1Sample());
			backveri.sendKeys(Passportocr2Sample());
			js.executeScript("arguments[0].scrollIntoView(true);",performocr);
			performocr.click();	
		} catch (IOException e) {

			e.printStackTrace();
		}
	}		
	public String verifypassportOcrverification() {
		wait = new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOf(passportocrverificationtext));				
		return passportocrverificationtext.getText();		
	}

	//cheque Ocr Search count
	public String getChequeOCRSearchCount() throws InterruptedException {
		String ChequeOCRCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(OCRsearchSummary));
		OCRsearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Cheque OCR")) {

				ChequeOCRCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return ChequeOCRCount;
	}

	//cheque ocr verification sample submit
	public void ChequeOCRVerification() throws InterruptedException {	
		try {
			ldriver.get("https://www.truthscreen.com/ocrverification/cheque_ocr");
			wait = new WebDriverWait(ldriver, 20);
			wait.until(ExpectedConditions.visibilityOf(ChequeOCRImageUpload));
			ChequeOCRImageUpload.sendKeys(ChequeOcrSample());
			js.executeScript("arguments[0].scrollIntoView(true);",performocr);
			performocr.click();	
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	//verify cheque ocr success msg
	public String chequeOcrVerificationSuccessMsg() {
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(ChequeOCRVerificationSuccessMsg));				
		return ChequeOCRVerificationSuccessMsg.getText();
	}

	//Advance Passport search count
	public String getAdvancePassportOCRSearchCount() throws InterruptedException {
		String NEWPASSPORTOCRCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(OCRsearchSummary));
		OCRsearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("NEW PASSPORT OCR")) {

				NEWPASSPORTOCRCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return NEWPASSPORTOCRCount;
	}
	//Action method for Advance passport OCR
	public void AdvancePassportOCRVerification() throws InterruptedException {	
		try {
			ldriver.get("https://www.truthscreen.com/ocrverification/advanced_passport_ocr");
			wait = new WebDriverWait(ldriver, 20);
			wait.until(ExpectedConditions.visibilityOf(uplodFrontImageButton));
			Actions act=new Actions(ldriver);
			act.moveToElement(uplodFrontImageButton).build().perform();
			Thread.sleep(500);
			uplodFrontImageButton.sendKeys(Passportocr1Sample());
			submitBtn.click();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public String advancePassportVerificationSuccessMsg() {
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(AdvancePassportveriMsg));				
		return AdvancePassportveriMsg.getText();
	}
	public String advancePassportVerificationSuccessMsg1() {
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(AdvancePassportnameMsg));				
		return AdvancePassportnameMsg.getText();
	}
}
