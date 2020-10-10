package com.selenium.businesscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitCommand extends Reusable {

	public static void main(String[] args) {
		
		launchbrowser();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		openapp("http://only-testing-blog.blogspot.com/2014/06/alert_6.html?fname=test&lname=eeeee");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.close();
	}

}
