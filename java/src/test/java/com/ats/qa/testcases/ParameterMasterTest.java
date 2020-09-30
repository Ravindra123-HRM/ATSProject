package com.ats.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.apache.log4j.PropertyConfigurator;
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
import com.ats.qa.pages.LoginPage;

import com.ats.qa.pages.ParameterMaster;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ParameterMasterTest extends TestBase {

	public static LoginPage lp;
	
	public static ParameterMaster pm;
	

	 
	
	
	@BeforeClass
	
	public void setup() throws Exception
	{
		Initialization();
		 lp=new LoginPage();
		 pm=new ParameterMaster(driver);; 
		
	
	}
	
	@Test(groups="Smoke")
	public void ParameterTest_clickonMaster() throws Exception 
	{
		PropertyConfigurator.configure("log4j.properties");
		lp.costcenter();
		lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		pm.clickonMaster();
	}
	@Test(groups= {"Smoke"},dependsOnMethods= {"ParameterTest_clickonMaster"})
    public void ParameterTest_clickonparameter() throws InterruptedException 
    {
		pm.clickonparameter();
    }
    @Test(groups= {"Smoke"},dependsOnMethods= {"ParameterTest_clickonparameter"})
    public void ParameterTest_clickonEnterdetails() throws InterruptedException 
    {
		pm.clickonEnterdetails();
    
		
	}
	
	
	 
	
/**
 * @throws Exception
 */
@AfterClass
	
	public void Teardown() throws Exception
	{
	
		driver.close();
		
	
	}

	  }


