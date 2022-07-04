package DataProvider1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ts.pageobject.Login;
import com.ts.testcases.BaseClass;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class ReadURL extends BaseClass {

	WebDriver driver;
	FileInputStream file;

	@FindBy(xpath= "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]")
	@CacheLookup
	WebElement Text;
	
	@BeforeMethod
	public void init() {
		//driver = setup();
	}

	@Test
	public void login() {
		Login lg=new Login(driver);
//		System.out.println(username+password);
//		lg.loginTSaccount(username, password);
	}
	@DataProvider(name = "test-data")
	public Object[] dataProvFunc(){
		//ArrayList<String> list=new ArrayList<String>();

		int i=0;
		Object[] obj = null;
		try {
			file = new FileInputStream(
					new File("/home/rohit.singh/git/repository1/truth_screen/documents/Book1.xls"));
			HSSFWorkbook workbook = new HSSFWorkbook(file);
			HSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			obj=new Object[(sheet.getLastRowNum()+1)];
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					obj[i]=cell.getStringCellValue();
					i++;
				}
			}
			file.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
	//Passing the dataProvider to the test method through @Test annotation
	@Test(dataProvider ="test-data")
	public void search(String dta) throws IOException{
		
		System.out.println(dta);
		driver.get(dta);
		String str = Text.getText();
		if (str.contains("Your allowed search limit exceeded, Please contact system administrator")) {
			Assert.assertTrue(true); 
//			logger.info("Limit verification done successfully!");
//		} else {
//			logger.info(" Limit verification not done successfully!");
//			captureScreen(driver, "verifyDashboardSummaryText");
			Assert.assertTrue(false);
		}
	}
}


