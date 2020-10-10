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

import com.test.AccessModifiers;

public class Reusable   {
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
	}
	
	@AfterTest(groups={"regression","smoke","sanity"})
	public static void tearDown(){
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
	
	
public static void sendText(By locatorname,String value){
		
		driver.findElement(locatorname).sendKeys(value);
	}
	
	public static void click(By locatorname){
		driver.findElement(locatorname).click();
	}
	
	public static void mousehover(By locatorname){
		
		 action=new Actions(driver);
	   WebElement ele=	driver.findElement(locatorname);
		 action.moveToElement(ele).perform();
		
	}
	
	public static void switchToframeIndex(int index){
		
		driver.switchTo().frame(index);
	}

	public static void dropdownselection(By locatorname,String text){
		Select select=new Select(driver.findElement(locatorname));
		select.selectByVisibleText(text);
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
