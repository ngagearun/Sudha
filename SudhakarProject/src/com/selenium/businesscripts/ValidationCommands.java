package com.selenium.businesscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/?FORM=Z9FD1");	
		Thread.sleep(3000);
		boolean status=driver.findElement(By.id("b_logo")).isDisplayed();
		if(status==true){
			System.out.println("Element is present");
		}else{
			System.out.println("Not Present");
		}

		Thread.sleep(3000);
		driver.close();
	}

}
