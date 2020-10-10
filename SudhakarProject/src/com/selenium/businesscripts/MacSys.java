package com.selenium.businesscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MacSys {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.macys.com/");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("shopByDepartmentLabelText"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Women")).click();
		driver.close();

	}

}
