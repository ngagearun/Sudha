package com.selenium.businesscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoComplete  extends Reusable{

	public static void main(String[] args) throws InterruptedException {
		
		launchbrowser();
		openapp("https://jqueryui.com/autocomplete/");
		driver.switchTo().frame(0);
		sendText(By.id("tags"),"A");
		List<WebElement> autosugesstion=driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		System.out.println(autosugesstion.size());
		
		for(int i=0;i<autosugesstion.size();i++){
			
			String value=autosugesstion.get(i).getText();
			if(value.equalsIgnoreCase("BASIC")){
				autosugesstion.get(i).click();
				break;
			}
		}
		
		Thread.sleep(3000);
		driver.close();

	}

}
