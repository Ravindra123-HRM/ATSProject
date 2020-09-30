package com.ats.qa.base;


import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportNG { 
	 static ExtentReports extent;

	 public static   ExtentReports extentReportGenerator()  {

		 
			String path=System.getProperty("user.dir") + "\\reports\\index.html";
	//htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/extentReportImage");
          ExtentSparkReporter htmlReporter=new ExtentSparkReporter(path);
            htmlReporter.config().setDocumentTitle("Automation Report");
			htmlReporter.config().setReportName("ATS Report");
			htmlReporter.config().setTheme(Theme.STANDARD);
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			extent.setSystemInfo("Hostname", "LocalHost");
			extent.setSystemInfo("OS", "Windows10");
			extent.setSystemInfo("Tester Name", "Ravindra chavan");
			extent.setSystemInfo("Browser", "Internet Explorer");
			return extent;

		}
	 
	

}
