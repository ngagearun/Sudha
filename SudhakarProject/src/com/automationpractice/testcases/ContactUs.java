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
		
		click(By.linkText("Contact us"));
		dropdownselection(By.id("id_contact"),"Customer service");
		sendText(By.id("email"), "test@gmail.com");
		sendText(By.id("message"), "testing");
		click(By.xpath("//*[@id='submitMessage']/span"));
		System.out.println(driver.findElement(By.xpath("//*[@id='center_column']/p")).isDisplayed());
		
	}

}
