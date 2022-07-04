package Other_codes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReadingwithDP {

	WebDriver ldriver;
	@BeforeTest
	public void OpenApp()
	{
		System.setProperty("webdriver.chrome.driver",  "/home/rohit.singh/git/repository1/truth_screen/drivers/chromedriver");
		ldriver = new ChromeDriver();
		ldriver.navigate().to("https://qa.truthscreen.com/");
		ldriver.findElement(By.id("username")).sendKeys("bigshark@authbridge.com");
		ldriver.findElement(By.id("password")).sendKeys("Auth@1234");
		ldriver.findElement(By.id("submit1")).click();
	
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(dataProvider="empLogin")
	public void login(String username, String password)
	{
		
		ldriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//	    WebElement back = ldriver.findElement(By.xpath("//*[@id='blueBarDOMInspector']/div/div[1]/div/div/h1/a/i"));
		//	    back.click();
	}
	@DataProvider(name="searchURL")
	public Object[][] logindata()
	{
		Object[][] arrayobject = getexceldata("/home/rohit.singh/git/repository1/truth_screen/documents/Book1.xls","Sheet1");
		return arrayobject;
	}

	public String[][] getexceldata(String filename, String sheetname)
	{

		String[][] arrayexceldata = null;
		try
		{
			FileInputStream fis = new FileInputStream(filename);
			Workbook wb = Workbook.getWorkbook(fis);
			Sheet sh = wb.getSheet(sheetname);
			int row = sh.getRows();
			int col = sh.getColumns();
			arrayexceldata = new String[row-1][col];
			for (int i=1;i< row;i++)
			{
				for(int j=0;j<col;j++)
				{
					arrayexceldata[i-1][j]=sh.getCell(j,i).getContents();
				}
			}

		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		}
		return arrayexceldata;

	}

}
