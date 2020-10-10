package com.selenium.businesscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilities.ExcelReader;

public class LaunchBrowser extends Reusable {
  
	static ExcelReader ex;

	
	public static void main(String[] args) throws InterruptedException, IOException {
	    ex=new ExcelReader("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx", "Sheet1");
		try{
		launchbrowser();
		openapp("https://www.mortgagecalculator.org/");			
		Thread.sleep(3000);
		String titlename=driver.getTitle();
		System.out.println(titlename);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("homeval")).clear();
		driver.findElement(By.id("homeval")).sendKeys(ex.getCellData(1, 0));
		Thread.sleep(3000);
		driver.findElement( By.name("param[downpayment]")).clear();
		driver.findElement( By.name("param[downpayment]")).sendKeys(ex.getCellData(1, 1));
		Thread.sleep(3000);
		click(By.name("cal"));
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			driver.close();

		}
		
		
		
		
		
		
		
		
		

	}

}
