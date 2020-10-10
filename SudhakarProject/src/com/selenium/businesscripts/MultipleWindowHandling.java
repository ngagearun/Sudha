package com.selenium.businesscripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class MultipleWindowHandling extends Reusable{

	public static void main(String[] args) throws InterruptedException {
		
		launchbrowser();
		openapp("https://candidate.psiexams.com/");
		String parentwindow =driver.getWindowHandle();
		click(By.linkText("PSI Bookstore"));
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows.size());
		
		Iterator<String> itr=windows.iterator();
		while(itr.hasNext()){
			String windowname =itr.next();
			if(!windowname.equalsIgnoreCase(parentwindow)){
			driver.switchTo().window(windowname);
			sendText(By.id("search_queryispbxi_"), "Selenium");
			}
		}
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentwindow);
		click(By.linkText("Academic"));
		Thread.sleep(3000);
		driver.quit();
		

	}

}
