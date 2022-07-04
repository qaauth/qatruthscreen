package Other_codes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ts.XLUtils;
import com.ts.pageobject.Login;

public class xyz {
	public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "/home/rohit.singh/git/repository1/truth_screen/drivers/chromedriver");

         WebDriver driver = new ChromeDriver();

         driver.get("https://qa.truthscreen.com/");
         driver.findElement(By.xpath(""));
         

         List<WebElement> getLinks = driver.findElements(By.tagName("a"));  
         // to get the list of urls from the website 
         System.out.println(getLinks.size());


         //fetch data from excel
         try {
                File excel = new File("C:\\Users\\Jatin\\Documents\\Output.xlsx");
                FileInputStream fis = new FileInputStream(excel);
                XSSFWorkbook book = new XSSFWorkbook(fis);
                XSSFSheet sheet = book.getSheetAt(0);

                Iterator<Row> itr = sheet.iterator();

                // Iterating over Excel file in Java
                while (itr.hasNext()) {
                    Row row = itr.next();

                    Iterator<Cell> cellIterator = row.cellIterator();
                    while (cellIterator.hasNext()) {

                        Cell cell = cellIterator.next();

                        switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;
                        default:


                        }
                    }
                    System.out.println("");}
                }catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
	}
}
