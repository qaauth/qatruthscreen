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

public class CourtCheck extends NID{

	public CourtCheck(WebDriver rdriver) {
		super(rdriver);
		// TODO Auto-generated constructor stub
	}
	//Element Locators
	@FindBy(xpath="//input[@id='CaseCandidateName']")
	@CacheLookup
	WebElement CourtCheckName;

	@FindBy(xpath="//input[@id='CaseCandidatePersonalAddress']")
	@CacheLookup
	WebElement CourtCheckAdrs;

	@FindBy(xpath="//li[@class='col-xs-12']/button[@type='button']")
	@CacheLookup
	WebElement SubmitButton;

	//Verification
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div/table/tbody/tr/td[2]/center[1]/span")
	@CacheLookup
	WebElement CourtCheckverificationtext;

	@FindBy(xpath ="//span[text()='Court Check ']/ancestor::li[@class='row']/descendant::a[@class='icon-dot']")
	@CacheLookup
	WebElement courtCheckSearchSummary;

	@FindBy(xpath ="//div[@class='info-content']/ul/li[contains(.,'Court Check  ')]/strong")
	@CacheLookup
	WebElement courtCheckSearchCount;

	@FindBy(xpath="//div[@class='info-content']/ul/li[contains(.,'Litigation Check  ')]/strong")
	@CacheLookup
	WebElement LitigitionCheckSearchCount;

	@FindBy(xpath="//select[@id='stateDropDown']")
	@CacheLookup
	WebElement LitigationcheckType;

	@FindBy(xpath="//input[@id='VerificationName']")
	@CacheLookup
	WebElement CompanyName;

	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	WebElement LitigitionSubmitButton;
	
	@FindBy(xpath="//table[@class='table table-striped border-top-f4 voter']/tbody/tr[2]/td[1]")
	@CacheLookup
	WebElement LitigationVerificationText;

	// action method for court check search count
	public String getCourtCheckSearchCount() throws InterruptedException {
		String CourtCheckCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(courtCheckSearchSummary));
		courtCheckSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Court Check")) {

				CourtCheckCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return CourtCheckCount;
	}

	//Action Methods for Court Check
	public void CourtCheckVerification()throws InterruptedException, IOException {	
		ldriver.get("https://www.truthscreen.com/Verification/court_room_check");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(CourtCheckName));
		CourtCheckName.click();
		CourtCheckName.sendKeys(CourtNameSample());
		CourtCheckAdrs.click();
		CourtCheckAdrs.sendKeys(CourtAddressSample());
		SubmitButton.click();	
	}
	public String verifyCourtverification() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(CourtCheckverificationtext));
		String verifyText[]=CourtCheckverificationtext.getText().split(" ");
		Thread.sleep(100);
		return verifyText[2];	
	}

	// action method for Litigation Check search count
	public String getLitigationCheckSearchCount() throws InterruptedException {
		String LitigationCheckCount=null;
		ldriver.get("https://www.truthscreen.com/dashboard");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(courtCheckSearchSummary));
		courtCheckSearchSummary.click();
		int rows = ldriver.findElements(By.xpath("/html/body/div[5]/div[2]/div/ul/li")).size();               
		for (int r = 1; r <= rows; r++) {
			WebElement servicename = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]"));
			String text = servicename.getText();
			if(text.contains("Litigation Check")) {

				LitigationCheckCount = ldriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/ul/li[" + r + "]/strong")).getText();
				break;
			}
		}
		return LitigationCheckCount;
	}
	//Action Methods for Litigation Check
	public void LitigationCheckVerification()throws InterruptedException, IOException {	
		ldriver.get("https://www.truthscreen.com/Verification/litigation_check");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(LitigationcheckType));
		LitigationcheckType.click();
		Select sel=new Select(LitigationcheckType);
		sel.selectByIndex(2);
		Thread.sleep(1000);
		CompanyName.sendKeys(LitigationCheckSample());
		LitigitionSubmitButton.click();	
	}
	public String verifyLitigationCheck() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(LitigationVerificationText));
		return LitigationVerificationText.getText();	
	}
	
}
