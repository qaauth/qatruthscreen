package Other_codes;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class Captcha {
	
	public void getCaptchaCode() throws InterruptedException {
		WebDriver ldriver = null;
		WebDriverWait wait = new WebDriverWait(ldriver, 120);
		WebElement txtUsername = null;
		wait.until(ExpectedConditions.visibilityOf(txtUsername));
		try {
			Thread.sleep(2000);
			File src = ldriver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/img[1]"))
					.getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir") + "/Screenshots/CaptchaCode.png";
			FileHandler.copy(src, new File(path));
			ITesseract image = new Tesseract();
			String imageText = image.doOCR(new File(path));
			String[] splitStr = imageText.trim().split("\\s+");
			System.out.println("Final Captcha is:" + splitStr);
			Thread.sleep(5000);
			ldriver.findElement(By.xpath("//input[@id='captcha']")).sendKeys(splitStr);
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Exception Cautch: " + e.getMessage());
		}
		Thread.sleep(2000);
		WebElement clickOnSubmitBtn = null;
		clickOnSubmitBtn.click();
		Thread.sleep(1000);
	}
	
}
