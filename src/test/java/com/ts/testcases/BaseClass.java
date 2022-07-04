package com.ts.testcases;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.ts.ReadConfig;

public class BaseClass {
	// Create ReadConfig class object
	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplication();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();

	public static WebDriver driver;
	public static Logger logger;

	// Mailinator Base Url
	public String BASEURL = readconfig.getMailinatorBaseURL();

	@Parameters({"browser"})
	@BeforeTest

	public void setup(String br) {
		logger = Logger.getLogger("TruthScreen"); // import right package Apache POI logger
		PropertyConfigurator.configure(System.getProperty("user.dir") + "/log4j.properties"); // PropertyConfigurator.configure("log4j.properties");
		// // windows machine
		if (br.equals("chrome")) {
		//	System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			//driver = new ChromeDriver();
			driver = new ChromeDriver(new ChromeOptions().setHeadless(true)); //for headless mode
		} else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		} 

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL); // it is copy to TestCase_001
	}

	@AfterTest
	public void tearDown() {
		//driver.quit();
		// driver.close();
	}
	// If you want to catch failed test cases you will have to add "captureScreen"
	// method.

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
