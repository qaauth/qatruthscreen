package Other_codes;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Phone_Verification {
	
	static {
		System.setProperty("webdriver.chrome.driver","/home/rohit.singh/eclipse-workspace/truth_screen/drivers/chromedriver");
	}
     public static void main(String[] args) throws InterruptedException {
		
    	 WebDriver driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://www.truthscreen.com");
    	 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("qa.team@authbridge.com");
    	 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testing@123");
    	 driver.findElement(By.xpath("//button[@id='submit1']")).click();
    	 Thread.sleep(5000);
    	 Actions act=new Actions(driver);
    	 act.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[8]/a[1]"))).perform();;
    	 
    	 WebElement element = driver.findElement(By.xpath("//a[contains(.,'Mobile Verification (308)')]"));
    	 element.click();
    	 
    	 driver.findElement(By.xpath("//input[@name='data[Verification][mobilenumber]']")).sendKeys("9444038834");
    	 //get the otp
    	 driver.findElement(By.xpath("//input[@value='Generate OTP']")).click();
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Switch to another window
    	 String parentWindow = driver.getWindowHandle();
    	 Set<String> handles =  driver.getWindowHandles();
    	    for(String windowHandle  : handles)
    	        {
    	        if(!windowHandle.equals(parentWindow))
    	           {
    	           driver.switchTo().window(windowHandle);
    	         // driver.switchTo().window(parentWindow); //cntrl to parent window
    	           }
    	        }
    	 
    	// driver.findElement(By.xpath("//input[@id='VerificationOtp']")).sendKeys("");
    	 //print msg 'Mobile no. validated.'
     }	 
	
}
