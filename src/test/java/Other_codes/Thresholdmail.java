package Other_codes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ts.XLUtils;
import com.ts.pageobject.NID;

public class Thresholdmail extends NID{
	
	WebDriver ldriver = new ChromeDriver();
	
	
	public Thresholdmail(WebDriver rdriver) {
		super(rdriver);
	}
	
	//************ELEMENTS*********************//

	@FindBy(xpath= "//span[text()='Businesses ']/ancestor::li[@class='row']/descendant::a[@class='icon-dot']")
	@CacheLookup
	private WebElement businessSearchSummary;

	@FindBy (xpath = "//div[@class='info-content']/ul/li[contains(.,'GSTIN  ')]/strong")
	@CacheLookup
	public WebElement GSTINsearchCount;

	@FindBy (xpath = "//input[@id='VerificationVerificationNumber']")
	@CacheLookup
	public WebElement GSTINnumberSearchBox;

	//************Mails***********************//
	@FindBy (xpath="//span[text()='truthscreen']/ancestor::tr[@class='zA zE']/descendant::td[@class='xY a4W']")
	@CacheLookup
	public WebElement Mailmessageverification;

	@FindBy (xpath= "//input[@type='email']")
	@CacheLookup
	public WebElement emailSearchBar;

	@FindBy (xpath="//span[text()='Next']")
	@CacheLookup
	public WebElement nextButton;

	@FindBy(xpath="//input[@name='username']")
	@CacheLookup
	public WebElement userNameBox;

	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	public WebElement passwordBox;

	@FindBy(xpath="//input[@type='submit']")
	@CacheLookup
	public WebElement submitButton;

	@FindBy(xpath="//span[text()='Continue']")
	@CacheLookup
	public WebElement continueButton;

	@FindBy(xpath="//button[text()='No thanks']")
	@CacheLookup
	public WebElement popupButton;

	// action method for GSTIN search count
/*	public String getGSTINsearchCount() throws InterruptedException {
		
		ldriver.get("https://qa.truthscreen.com/dashboard");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(businessSearchSummary));
		businessSearchSummary.click();
		wait.until(ExpectedConditions.visibilityOf(GSTINsearchCount));
		return GSTINsearchCount.getText();
	}

	// Action Methods for GSTIN Verification
	public void GSTIN() throws IOException {	


		ldriver.get("https://qa.truthscreen.com/Verification/gstin_verification");
		wait=new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(GSTINnumberSearchBox));
		ldriver.get("https://qa.truthscreen.com/dashboard");
		
//		XLUtils obj  = new XLUtils();
//		String GSTINsample;
//		try {
//			GSTINsample = obj.GSTSample();
//			GSTINnumberSearchBox.click();
//			GSTINnumberSearchBox.sendKeys(GSTINsample);
//			btnsubmit.click();
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//	}
		
	}
	// Action Methods for MAIL Verification
	public void MAIL() throws InterruptedException {		
		
		ldriver.get("https://mail.google.com/");
		emailSearchBar.click();
		emailSearchBar.sendKeys("rohit.singh4@authbridge.com");
		nextButton.click();
		Thread.sleep(1000);
		userNameBox.click();
		userNameBox.sendKeys("rohit.singh4@authbridge.com");
		passwordBox.click();
		passwordBox.sendKeys("Auth@1234");
		submitButton.click();
		continueButton.click();
		popupButton.click();
	}
	// Mail verification text
	public String verifyMail() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(Mailmessageverification));		
		return Mailmessageverification.getText();			
	}  */
}