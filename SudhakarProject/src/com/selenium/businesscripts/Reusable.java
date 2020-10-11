package com.selenium.businesscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.LogStatus;
import com.test.AccessModifiers;
import com.test.ExtentCustomizedReports;

public class Reusable  extends ExtentCustomizedReports  {
	static ExtentCustomizedReports ex;
	

	static String browsername="chrome";
	
	public static WebDriver driver;
	static Actions action;
	
	@BeforeTest(groups={"regression","smoke","sanity"})
	@Parameters("browser")
	public static void setup(String browser){
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
			}else if(browsername.equals("firefox")){
				driver=new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/");
			ex=new ExtentCustomizedReports();
	}
	
	@AfterTest(groups={"regression","smoke","sanity"})
	public static void tearDown(){
		report.endTest(test);
		report.flush();
		report.close();
		driver.close();
	}
	
	public static void wait(int seconds) throws InterruptedException{
		Thread.sleep(seconds);
	}
	public static void launchbrowser(){
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
			}else if(browsername.equals("firefox")){
				driver=new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void openapp(String url){
		driver.get(url);
	}
	
	
public static void sendText(By locatorname,String value,String stepname){
		try{
		driver.findElement(locatorname).sendKeys(value);
		test.log(LogStatus.PASS, stepname);
		}catch(Exception e){
			
		}
	}
	
	public static void click(By locatorname,String stepname){
		try{
		driver.findElement(locatorname).click();
		test.log(LogStatus.PASS, stepname);
		}catch(Exception e){
			
		}
	}
	
	public static void mousehover(By locatorname){
		try{
		 action=new Actions(driver);
	   WebElement ele=	driver.findElement(locatorname);
		 action.moveToElement(ele).perform();
		}catch(Exception e){
			
		}
		
	}
	
	public static void switchToframeIndex(int index){
		
		driver.switchTo().frame(index);
	}

	public static void dropdownselection(By locatorname,String text,String stepnamme){
		Select select=new Select(driver.findElement(locatorname));
		select.selectByVisibleText(text);
		test.log(LogStatus.PASS, stepnamme);
	}
	
	public static void scrollDown(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0, 500)");
	}
	
	public static void explicitwait(By locatorname){
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(locatorname));
	}
	
	public static void explicitaitwithframe(int index){
	
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}

	
	
	

}
