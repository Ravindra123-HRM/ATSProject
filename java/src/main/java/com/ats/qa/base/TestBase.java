package com.ats.qa.base;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.ats.qa.pages.LoginPage;
import com.ats.qa.testcases.DepartmentMasterTest;
import com.ats.qa.util.TestUtil;




 public  class TestBase  { 

	public static WebDriver driver;
	 public  static Properties prop;
	 public static LoginPage lp;
	
	 
	 
		
	 
	 public  static WebDriver Initialization() throws Exception
	 {
		
		
		  
		 prop =new Properties();
		  FileInputStream fis=new FileInputStream("C:\\Users\\rchavan0103760\\eclipse-workspace\\ATSSeleniumNew\\java\\src\\main\\java\\com\\ats\\qa\\config\\config.properties");
		  prop.load(fis);
		 String browsername=prop.getProperty("chromebrowser");    
       //String browsername=prop.getProperty("InternetExplorerbrowser");
		 if(browsername.equals("chrome"))
		 {
		     //Launch Application
				System.setProperty("webdriver.chrome.driver","./Driver2/chromedriver.exe");
		          driver=new ChromeDriver();
	
			    
			     
		}
		 else if(browsername.equals("IE"))
			
		{
		     //Launch Application
			System.setProperty("webdriver.ie.driver", "./Driver3/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
	
		}
	 
		

		
		 
		 //Launch Application
		 driver.manage().window().maximize();
		
	
		 driver.manage().deleteAllCookies();
	     driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	     driver.get(prop.getProperty("url"));
		return driver;
		
	    
	 }
	
	 public   String getScreenShotPath(String testCaseName) throws IOException 
	 {
	 	TakesScreenshot ts=(TakesScreenshot) driver;
	 	File source =ts.getScreenshotAs(OutputType.FILE);
	 	String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	 	FileUtils.copyFile(source,new File(destinationFile));
	 	return destinationFile; 


	 }
	
	
	 }
 

		    //Main function is calling readExcel function to read data from excel file

		   
		    //Create an object of ReadGuru99ExcelFile class

		    

		
	 

