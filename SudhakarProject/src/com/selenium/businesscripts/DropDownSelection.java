package com.selenium.businesscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection extends Reusable {

	public static void main(String[] args) throws InterruptedException {
	
		launchbrowser();
		openapp("https://candidate.psiexams.com/catalog/displayagencylicenses.jsp?catalogID=334");
		
		Select sponsorname=new Select(driver.findElement(By.id("c0")));
		
		sponsorname.selectByIndex(1000);
		Thread.sleep(3000);
		sponsorname.selectByValue("714^-99");
		Thread.sleep(3000);
		sponsorname.selectByVisibleText("ATI TEAS");
		Thread.sleep(3000);
		driver.close();

	}

}
