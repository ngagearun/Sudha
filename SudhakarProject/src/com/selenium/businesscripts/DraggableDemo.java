package com.selenium.businesscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableDemo extends Reusable{

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		openapp("https://jqueryui.com/draggable/");	
		Thread.sleep(3000);
		
		Actions action=new Actions(driver);
		
		driver.switchTo().frame(0);		
		WebElement draggable =driver.findElement(By.id("draggable"));
		action.dragAndDropBy(draggable, 1800, 9800).perform();
		Thread.sleep(3000);
		driver.close();
		

	}

}
