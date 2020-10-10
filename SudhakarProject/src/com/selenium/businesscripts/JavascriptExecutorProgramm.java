package com.selenium.businesscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavascriptExecutorProgramm extends Reusable {

	public static void main(String[] args) throws InterruptedException {
	
		
		launchbrowser();
		openapp("http://only-testing-blog.blogspot.com/");
		WebElement ele=driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[1]"));
		JavascriptExecutor js =( (JavascriptExecutor) driver);
		Thread.sleep(3000);
		js.executeScript("arguments[0].style.border='3px dotted blue'", ele);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", ele);
		Thread.sleep(3000);
		driver.close();


	}

}
