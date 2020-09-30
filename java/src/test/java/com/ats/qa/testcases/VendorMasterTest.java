package com.ats.qa.testcases;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ats.qa.base.TestBase;
import com.ats.qa.pages.DocumentMaster;
import com.ats.qa.pages.LoginPage;
import com.ats.qa.pages.ManageUser;

import com.ats.qa.pages.VendorMaster;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class VendorMasterTest extends TestBase {
	
	public static LoginPage lp;
	public static VendorMaster vm;;
	

	
		// TODO Auto-generated constructor stub
		
	
		  @BeforeClass()
			public void setup() throws Exception 
			{
				Initialization();
			    lp=new LoginPage();
				vm=new VendorMaster(driver);
			
			
			
			 }
		   
		   
		@Test(groups="Regression")	
		public  void Vendormaster_clickonMaster()  throws Exception
		{
			PropertyConfigurator.configure("log4j.properties");
	          
			 lp.costcenter();
	         lp.Login(prop.getProperty("username"), prop.getProperty("password"));
	         vm.clickonMaster();
		}
		 @Test(groups= {"Regression"},dependsOnMethods= {"Vendormaster_clickonMaster"})
		    public void Vendormaster_clickonVendor() throws InterruptedException 
		    {
	         vm.clickonVendor();
		    }
		 @Test(groups= {"Regression"},dependsOnMethods= {"Vendormaster_clickonVendor"})
		    public void Vendormaster_clickonAddvendordetails() throws InterruptedException 
		    {
	         vm.clickonAddvendordetails();
		    }
	         
	         //throw new SkipException("This scenarios is skipped from master module");

	         
	         
		
		@AfterClass

		public void Teardown() throws Exception
		{

			driver.quit();
			

		}
		
	   
	    
	     }
