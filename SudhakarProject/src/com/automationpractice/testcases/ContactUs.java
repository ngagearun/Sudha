package com.automationpractice.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.selenium.businesscripts.LaunchBrowser;
import com.selenium.businesscripts.Reusable;

public class ContactUs extends Reusable {
	
	
	@Test(priority=1,groups="smoke")
	public static void verifysentmessage(){
		report.startTest("ContactUs Testcase started to excute");
		click(By.linkText("Contact us"),"clicking on contact us link");
		dropdownselection(By.id("id_contact"),"Customer service","Selecting the customer service dropdowna value");
		sendText(By.id("email"), "test@gmail.com","Enter the email id in contact us page");
		sendText(By.id("message"), "testing","Enter the comments in meaasge box");
		click(By.xpath("//*[@id='submitMessage']/span"),"clicking on submit button");
		System.out.println(driver.findElement(By.xpath("//*[@id='center_column']/p")).isDisplayed());
		
	}

}
