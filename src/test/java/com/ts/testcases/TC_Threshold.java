package com.ts.testcases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ts.XLUtils;
import com.ts.pageobject.Bank;
import com.ts.pageobject.NID;
import com.ts.pageobject.Others;
import com.ts.pageobject.Threshold;
import com.ts.pageobject.Utility;

public class TC_Threshold extends BaseClass {

	@Test(enabled = false, testName = "ThresholdMail 80%", priority = 1)
	public void ThresholdMail80() throws IOException, InterruptedException {

		Threshold mail= new Threshold(driver);

		for (int i = 0; i < 8; i++) {
			NID nid=new NID(driver);
			nid.PAN();      
		}
		driver.get("https://uat.truthscreen.com/truthscreen-uat/dashboard");
		driver.get("https://uat.truthscreen.com/truthscreen-uat/Verification/pan_verification");

		mail.MAIL();
		System.out.println("Mail logged in successfully");
		mail.verifyMail();

		String data = new String(Files.readAllBytes(Paths.get("TextMail.txt")));
		String mailContain[] = data.split(" ");
		String mailtext=mailContain[12];
		System.out.println("Mail Conatins======="+mailtext);

		if(mailtext.contains("80%")) {
			Assert.assertTrue(true);
			logger.info("Threshold mail verification done successfully! and reached 80% limit");	
		}
		else {
			logger.info("Threshold mail verification not done successfully");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
		Threshold mail1= new Threshold(driver);
		mail1.deleteMail();
	}

    //PAN search limit 90% reached 
	@Test(enabled = true, testName = "ThresholdMail 90%", priority = 1)
	public void ThresholdMail90() throws IOException, InterruptedException {
		
		Threshold mail= new Threshold(driver);
		NID nid=new NID(driver);
		nid.PAN();
		driver.get("https://uat.truthscreen.com/truthscreen-uat/dashboard");
		driver.get("https://uat.truthscreen.com/truthscreen-uat/Verification/voter_verification");
		
		mail.MAIL();
		System.out.println("Mail logged in successfully");
		mail.verifyMail90();
		
		String data = new String(Files.readAllBytes(Paths.get("TextMail.txt")));
		String mailContain[] = data.split(" ");
		String mailtext=mailContain[12];
		System.out.println("Mail Conatins======="+mailtext);

		if(mailtext.contains("90%")) {
			Assert.assertTrue(true);
			logger.info("Threshold mail verification done successfully! and reached 90% limit");	
		}
		else {
			logger.info("Threshold mail verification not done successfully");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
	}
	
	//Pan search limit 100% reached
	
}


