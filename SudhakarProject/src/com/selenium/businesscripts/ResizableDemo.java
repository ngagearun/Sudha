package com.selenium.businesscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");	
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		
		WebElement draggable =driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		action.dragAndDropBy(draggable, 94, 254).perform();
		Thread.sleep(3000);
		driver.close();
		

	}

}
