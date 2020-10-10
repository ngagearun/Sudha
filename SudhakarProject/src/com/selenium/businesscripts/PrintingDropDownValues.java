package com.selenium.businesscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.ExcelReader;

public class PrintingDropDownValues extends Reusable {

	static ExcelReader ex;
	public static void main(String[] args) throws IOException {
		ex=new ExcelReader("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx", "Sheet3");
		launchbrowser();
		openapp("https://www.mortgagecalculator.org/");
		List<WebElement> month=driver.findElements(By.xpath("//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[8]/select/option"));
		System.out.println(month.size());
		
		for(int i=0;i<month.size();i++){
			String text=month.get(i).getText();
			ex.writeData(1, 5,text);
		}
		ex.saveWorkBook("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
      driver.close();
	}

}
