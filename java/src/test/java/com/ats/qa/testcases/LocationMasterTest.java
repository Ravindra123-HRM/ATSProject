package com.ats.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.ats.qa.base.TestBase;
import com.ats.qa.pages.DepartmentMaster;
import com.ats.qa.pages.DesignationMaster;
import com.ats.qa.pages.LocationMaster;
import com.ats.qa.pages.LoginPage;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LocationMasterTest extends TestBase {

	public static LoginPage lp;
	
	public static LocationMaster Lm;
	
	 
	
		
			
	
	@BeforeClass
	
	public void setup() throws Exception
	{
		
		driver=Initialization();
		 lp=new LoginPage();
		 Lm=new LocationMaster(driver);
		
	
	}
	
	@Test(groups="Regression")
	public void Locationmaster_clickonMaster() throws Exception
	{
		PropertyConfigurator.configure("log4j.properties");
		lp.costcenter();
		lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		Lm.clickonMaster();
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Locationmaster_clickonMaster"})
    public void Locationmaster_clickonDesignationmaster() throws InterruptedException 
    {
		Lm.clickonDesignationmaster();
    }
	@Test(groups= {"Regression"},dependsOnMethods= {"Locationmaster_clickonDesignationmaster"})
    public void Locationmaster_clickonEnterdetails() throws InterruptedException 
    {
		Lm.clickonEnterdetails();
		
	}
	


@AfterClass

public void Teardown() throws Exception
{

	driver.quit();
	

}

}



