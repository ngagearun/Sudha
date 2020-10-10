package com.selenium.businesscripts;

import org.openqa.selenium.By;

public class WebBasedAlertDemo extends Reusable {

	public static void main(String[] args) throws InterruptedException {
		
		launchbrowser();
		openapp("http://only-testing-blog.blogspot.com/");
		Thread.sleep(5000);
		click(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[1]"));
		Thread.sleep(3000);
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

	}

}
