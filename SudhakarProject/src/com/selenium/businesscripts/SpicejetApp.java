package com.selenium.businesscripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SpicejetApp extends Reusable {
	
	public static void main(String[] args) throws InterruptedException{
		
		launchbrowser();
        openapp("https://www.spicejet.com/");
        wait(3000);
        click(By.xpath("//*[@id=\"spicestyleheader\"]/a"));
        wait(3000);
       
        String parent=driver.getWindowHandle();
        Set<String> abc=driver.getWindowHandles();
        Iterator<String> it=abc.iterator();
        while(it.hasNext())
        {
        String childwindow=it.next();
        if(!parent.equals(childwindow))
        {
        driver.switchTo().window(childwindow);

        System.out.println(driver.switchTo().window(childwindow).getTitle());
        }
        }
        System.out.println(driver.getCurrentUrl());
        wait(5000);
        //actions(By.xpath("//*[@id=\"uiv2-main-menu\"]/ul/li[2]/a"));
        Actions a=new Actions(driver);
        WebElement women=driver.findElement(By.xpath("//*[@id=\"uiv2-main-menu\"]/ul/li[6]/a"));
a.moveToElement(women).build().perform();
        wait(3000);
        click(By.xpath("//*[@id=\"uiv2-main-menu\"]/ul/li[6]/div/div/div/ul[1]/li/a"));
        wait(3000);
        click(By.xpath("//*[@id=\"mp-pusher\"]/div[2]/div/div/div[5]/div/div[2]/div[6]/div[2]/div[1]/a"));
       
        wait(3000);
        click(By.xpath("//*[@id=\"mp-pusher\"]/div[2]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[5]/div[2]/div[3]/a"));
        wait(3000);
       WebElement addtocart=driver.findElement(By.xpath("//*[@data-title='Shoping Cart']"));
       
//       String mouseOverScript = 
//      "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
//      ((JavascriptExecutor) driver).executeScript(mouseOverScript,addtocart);
        a.moveToElement(addtocart).perform();
        wait(3000);
        click(By.xpath("//*[@id=\'order_now\']"));
        driver.close();
	}

}
