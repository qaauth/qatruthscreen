package Other_codes;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LOC {
	static {
		System.setProperty("webdriver.chrome.driver", "/home/rohit.singh/eclipse-workspace/truth_screen/drivers/chromedriver"); 
	}
	public static void main(String[] args) throws AWTException, IOException, InterruptedException  {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gps-coordinates.net/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		WebElement lat = driver.findElement(By.cssSelector("input[id='latlong']"));

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Actions act=new Actions(driver);
		act.moveToElement(lat).click().perform();

		Thread.sleep(3000);
		act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").build().perform();

		Thread.sleep(3000);

		driver.navigate().to("https://www.google.com/maps/@12.926976,77.5553024,12z");
		WebElement ele = driver.findElement(By.id("searchboxinput"));
		ele.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		ele.sendKeys(Keys.ENTER);

		WebElement element = driver.findElement(By.xpath("(//span[@class='DkEaL'])[1]"));
		System.out.println(element.getText());

		String pin=null;
		String s=element.getText();

		Pattern p1 = Pattern.compile("[0-9]{7}");
		Pattern p2 = Pattern.compile("[0-9]{6}");
		Matcher m1 = p1.matcher(s);
		Matcher m2 = p2.matcher(s);
		if(m1.find()){
			pin=m1.group();
			System.out.println(pin);
		}
		else if (m2.find()) {
			pin=m2.group();
			System.out.println(pin);
		}
	}
	public static void main1(String[] args) {
		gettingPin2();
	}
	private static void gettingPin2() {	
	}
}
