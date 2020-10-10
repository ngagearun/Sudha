package com.selenium.businesscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class WindowBasedTablw extends Reusable {

	public static void main(String[] args) throws InterruptedException, IOException, FindFailed {

		

		launchbrowser();
		openapp("http://only-testing-blog.blogspot.com/");
		Thread.sleep(5000);
		click(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/form[1]/input[10]"));
		Thread.sleep(5000);
		//Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\NareshUploadFile.exe");
		
		Screen sc=new Screen();
		Pattern fileupload=new Pattern("C:\\Users\\Lenovo\\Desktop\\filepath.png");
		Pattern openbutton=new Pattern("C:\\Users\\Lenovo\\Desktop\\openbutton.png");
		
		
		sc.type(fileupload, "C:\\Users\\Lenovo\\Downloads\\FR_Test Plan.doc");
		sc.click(openbutton);
		
		
	}

}
