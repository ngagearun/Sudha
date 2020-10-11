package com.test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentCustomizedReports {
	
	
	public static ExtentReports report;
	public static ExtentTest test;
	
	public ExtentCustomizedReports(){
		report=new ExtentReports(System.getProperty("user.dir")+"\\test-output\\extentreports.html",true);
		
	}
	

}
