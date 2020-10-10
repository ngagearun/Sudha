package com.selenium.businesscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");	
		Thread.sleep(6000);
		
		Actions action=new Actions(driver);
		WebElement electronics =driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
		action.moveToElement(electronics).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Mi")).click();
		Thread.sleep(3000);
		String text=driver.findElement(By.className("_2yAnYN")).getText();
		System.out.println(text);
		driver.close();
		
	}

}
