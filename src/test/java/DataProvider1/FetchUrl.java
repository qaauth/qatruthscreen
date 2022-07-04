package DataProvider1;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
 
public class FetchUrl {

 	WebDriver driver;
  	FileInputStream file;
  	
  
	
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
                Iterator<Cell> cellIterator
                    = row.cellIterator();
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
  	public void search(String dta){
        	System.out.println(dta);
  	}
  
}


