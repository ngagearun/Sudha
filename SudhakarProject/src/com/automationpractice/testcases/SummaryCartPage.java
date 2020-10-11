package com.automationpractice.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.businesscripts.Reusable;

public class SummaryCartPage extends Reusable {

	@Test(priority=2,groups="sanity")
	public static void deleteitemfromcart() throws InterruptedException{
		report.startTest("Summary cart page");
		mousehover(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a"));
		explicitwait(By.xpath("//*[@id='block_top_menu']/ul/li[2]/ul/li[2]/a"));
		click(By.xpath("//*[@id='block_top_menu']/ul/li[2]/ul/li[2]/a"),"");
		scrollDown();
		mousehover(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
		Thread.sleep(4000);
		click(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]"),"");
		Thread.sleep(4000);
		click(By.xpath("//span[@title='Continue shopping']"),"");
		
		mousehover(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
		explicitwait(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a"));
		click(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a"),"");
		scrollDown();
		
		explicitwait(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
		mousehover(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
		click(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[2]/span"),"");
		explicitaitwithframe(0);
		click(By.xpath("//*[@id='add_to_cart']/button/span"),"");
		Thread.sleep(3000);
		click(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span"),"");
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		List<WebElement> summarytable=driver.findElements(By.xpath("//*[@id='cart_summary']/tbody/tr"));
		
		for(int i=0;i<summarytable.size();i++){
			System.out.println(summarytable.get(i));
			String text=driver.findElement(By.xpath("//*[@id='cart_summary']/tbody/tr["+(i+1)+"]/td[2]/p/a")).getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("Faded Short Sleeve T-shirts")){
				driver.findElement(By.xpath("//*[@id='cart_summary']/tbody/tr["+(i+1)+"]/td[7]/div/a/i")).click();
				break;
			}
		}
		
		Thread.sleep(4000);
		report.endTest(test);
    }
	
}
