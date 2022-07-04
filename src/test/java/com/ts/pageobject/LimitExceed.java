package com.ts.pageobject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ts.XLUtils;

import jxl.Cell;


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




