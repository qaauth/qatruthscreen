package Other_codes;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ts.testcases.BaseClass;

public class TC_Thresholdmail extends BaseClass {
     
	//Threshold Mail service validation
	/*	@Test(enabled = true, testName = "Threshold Mail", priority = 1)
	public void ThresholdMail() throws IOException, InterruptedException {
		
		Thresholdmail mail= new Thresholdmail(driver);
		String beforecount= mail.getGSTINsearchCount();
		int BeforeSearchCount=Integer.parseInt(beforecount);
		System.out.println("before GISTIN search count=="+BeforeSearchCount);
		logger.info("got GSTIN search count before search");
		Thread.sleep(100);
		mail.GSTIN();
		logger.info("Successfully reached on GSTIN detailed page");
		Thresholdmail getaftercount= new Thresholdmail(driver);
		String AfterCount= getaftercount.getGSTINsearchCount();
		int AfterSearchCount=Integer.parseInt(AfterCount);
		System.out.println("after GISTIN search count=="+AfterSearchCount);
		
		for (int i = AfterSearchCount ; i <=10; i++) {
			
			if(i == 8) {  
				System.out.println("Renew yor subscription 80% limit exhaust");
				break;
			}
			 if(i == 9) {
				System.out.println("Renew yor subscription 90% limit exhaust");
				break;
			}
			if(i == 10) {
				System.out.println("Renew yor subscription 100% limit exhaust");
				break;
			}
		}

		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));

		Thresholdmail mailText= new Thresholdmail(driver);
		mailText.MAIL();

		if (mailText.verifyMail().contains("Urgent - Subscription balance about to exhaust")) {
			Assert.assertTrue(true); 
			logger.info("Threshold mail verification done successfully!");
		} else {
			logger.info(" Threshold mail verification done performed successfully !");
			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}

	}  */
}