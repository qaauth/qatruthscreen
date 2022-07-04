package com.ts.pageobject;

import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
    WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Robot rbt;

	public Login(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	// Login functionalities of the Truthscreen
		@FindBy(id ="username")
		@CacheLookup
		WebElement txtUserName;

		@FindBy(id ="password")
		@CacheLookup
		WebElement txtPassword;

		@FindBy(xpath = "//*[@id=\"submit1\"]")
		@CacheLookup
		WebElement btnLogin;

		// Verify After Login By Demo user Account-- Case Submission Summary Text
		@FindBy(xpath="//*[@id=\"main\"]/div[2]/div/div[1]/div[1]/h1")
		@CacheLookup
		WebElement verifySummaryText;

		// Action Methods for Login functionalities of the Truthscreen Portal
		public void loginTSaccount(String username, String password) {
			wait = new WebDriverWait(ldriver, 5);
			wait.until(ExpectedConditions.visibilityOf(txtUserName));
			txtUserName.sendKeys(username);
			txtPassword.sendKeys(password);
			btnLogin.click();
		}
		
		public String verifyDashboardText() {
			wait = new WebDriverWait(ldriver, 5);
			wait.until(ExpectedConditions.visibilityOf(verifySummaryText));
			return verifySummaryText.getText();
		}
		
	
}
