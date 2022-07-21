package com.ts.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LimitExceed {

//	FileInputStream file;
//	WebDriverWait wait;

	public LimitExceed(WebDriver rdriver) {
		
		PageFactory.initElements(rdriver, this);
	}
	// Assertion/ Verification texts
	@FindBy(xpath= "//div[@class='alert alert-danger xs-mg-t70']")
	@CacheLookup
	private WebElement errorText;

	//verify Limit Exceed  msg
	public String getTextErrorMsg() {
				
		return errorText.getText();
	}
}




