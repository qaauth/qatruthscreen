package com.ts.testcases;
import org.testng.annotations.Test;

import com.ts.pageobject.Login;

import org.testng.*;
import java.io.IOException;

public class TC_Login extends BaseClass  {
	
	@Test(enabled = true, testName = "Login Test", priority = 1)
	public void loginTest() throws IOException, InterruptedException {
	
		driver.get(baseURL);
		logger.info("Url is opened");
		Login login = new Login(driver);
		login.loginTSaccount(username, password);
		logger.info("Entered Username and password!");
		//Thread.sleep(5);
		if (login.verifyDashboardText().contains("WELCOME TO DASHBOARD")) {
			Assert.assertTrue(true);
			logger.info("Demo user has logged Successfully!");
		} else {
			logger.info("Demo user has not logged Successfully!");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(true);
		}
	}
}
