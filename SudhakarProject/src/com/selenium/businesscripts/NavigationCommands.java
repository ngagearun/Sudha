package com.selenium.businesscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");	
		
		driver.findElement(By.linkText("Downloads")).click();
		
		driver.findElement(By.linkText("Projects")).click();
		
		driver.findElement(By.linkText("Documentation")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		String url=driver.getCurrentUrl();		
		
		driver.navigate().to(url);
		
		driver.close();
		
		
		
		
		

	}

}
