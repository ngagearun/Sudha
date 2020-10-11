package com.automationpractice.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.businesscripts.Reusable;
//Added
public class Womens extends Reusable {
	
	@BeforeClass(groups={"regression","smoke","sanity"})	
	public void tshirtpage(){	
		report.startTest("women testcase");
		mousehover(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
		explicitwait(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a"));
		click(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a"),"");
		scrollDown();
	}	
	
	@Test(priority=3,groups="regression")
	public void additemtocartthroughquickview() throws InterruptedException{	
		
		
		explicitwait(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
		mousehover(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
		click(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[2]/span"),"");
		explicitaitwithframe(0);
		click(By.xpath("//*[@id='add_to_cart']/button/span"),"");
		Thread.sleep(3000);
		click(By.xpath("//span[@title='Continue shopping']"),"");
		driver.switchTo().defaultContent();
	}
	
	@Test(priority=4,groups="smoke")
	public void addtocartitemwithcartbutton() throws InterruptedException{

		explicitwait(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
		mousehover(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
		Thread.sleep(4000);
		click(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[3]"),"");
		Thread.sleep(4000);
		click(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span"),"");
	}

	@AfterClass
	public void endtest(){
		

	}
}
