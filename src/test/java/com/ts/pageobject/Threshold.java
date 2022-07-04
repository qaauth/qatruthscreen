package com.ts.pageobject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Threshold extends NID{

	public Threshold(WebDriver rdriver) {
		super(rdriver);
		// TODO Auto-generated constructor stub
	}

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

	//******************Delete mail******************************//

	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[3]/div/table/tr/td[1]/div[2]/div[2]/div/div[3]/div[1]/div/div/div/div/div[1]/div[2]/div[3]/div[3]/div[1]")
	@CacheLookup
	public WebElement ReadMail80;

	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[4]/div/table/tr/td[1]/div[2]/div[2]/div/div[3]/div[7]/div/div/div/div/div[1]/div[2]/div[3]/div[3]/div")
	@CacheLookup
	public WebElement ReadMail90;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[3]/div/table/tr/td[1]/div[2]/div[2]/div/div[3]/div[1]/div/div/div/div/div[1]/div[2]/div[3]/div[3]/div[1]")
	@CacheLookup
	public WebElement ReadMail100;

	@FindBy(xpath= "//div[@class='iH bzn']/descendant::div[@class='T-I J-J5-Ji nX T-I-ax7 T-I-Js-Gs mA']")
	@CacheLookup
	public WebElement DeleteButton;


	// Action Methods for MAIL Login
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
	public void verifyMail() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(Mailmessageverification));
		Mailmessageverification.click();
		Thread.sleep(3000);
		try {
			File output = new File("TextMail.txt");
			FileWriter writer = new FileWriter(output);
			writer.write(ReadMail80.getText());
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//Delete Mail
	public void deleteMail() {
		DeleteButton.click();
	}

	//Mail verification text 90%
	public void verifyMail90() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(Mailmessageverification));
		Mailmessageverification.click();
		Thread.sleep(3000);
		try {
			File output = new File("TextMail.txt");
			FileWriter writer = new FileWriter(output);
			js.executeScript("arguments[0].scrollIntoView(true);", ReadMail90);
			writer.write(ReadMail90.getText());
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//mail verification text 100%
	public void verifyMail100() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(Mailmessageverification));
		Mailmessageverification.click();
		Thread.sleep(3000);
		try {
			File output = new File("TextMail.txt");
			FileWriter writer = new FileWriter(output);
			//js.executeScript("arguments[0].scrollIntoView(true);", ReadMail100);
			writer.write(ReadMail100.getText());
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}





