package com.selenium.businesscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTableDemo extends Reusable {

	public static void main(String[] args) {
		
		launchbrowser();
		openapp("https://money.rediff.com/gainers/bsc/dailygroupa?");
		WebElement table_body=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody"));
		List<WebElement> getrows =table_body.findElements(By.tagName("tr"));
		
		for(int i=0;i<2;i++){
			
			List<WebElement> getcols=getrows.get(i).findElements(By.tagName("td"));
			
			  for(int j=0;j<getcols.size();j++){
				  
				System.out.println(getcols.get(j).getText());
			  }	
			
		}
		
		driver.close();

	}

}
