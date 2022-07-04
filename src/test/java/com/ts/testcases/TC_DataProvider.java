package com.ts.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ts.XLUtils;
import com.ts.pageobject.Login;
import com.ts.pageobject.LimitExceed;

import DataProvider1.FetchUrl;

public class TC_DataProvider extends BaseClass{
XLUtils xlutil=new XLUtils();
LimitExceed limitexceed;
	@Test
	public void login() throws InterruptedException, IOException {

		Login lg= new Login(driver);
		
		lg.loginTSaccount(username, password);
		System.out.println("Login in done");
	}
	
	@Test(dataProvider ="getData", dependsOnMethods = "login")
	public void FetchUrlFromExcel(String url) throws InterruptedException, IOException {
		System.out.println(url);
		limitexceed=new LimitExceed(driver);
		Thread.sleep(2000);
		driver.get(url);
		System.out.println(limitexceed.getTextErrorMsg());
		
		//Assertion
	Assert.assertTrue(limitexceed.getTextErrorMsg().contains("Your allowed search limit exceeded, Please contact system administrator"));
		
	}
	@DataProvider
	public Object[][] getData() throws Throwable{
		return xlutil.fetchMultipleData("Sheet1", "./documents/Book1.xls");
	}
}
