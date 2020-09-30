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
import com.ats.qa.pages.ExcluseAssesmentFromSelectionMatrix;
import com.ats.qa.pages.LoginPage;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExcludeAssesmentFromSelectionMatrixTest extends TestBase {

	public static LoginPage lp;
	
	public  static ExcluseAssesmentFromSelectionMatrix EAFSM;
	
	 
	
		
	
	@BeforeClass
	
	public void setup() throws Exception
	{
		Initialization();
		 lp=new LoginPage();
		 EAFSM=new ExcluseAssesmentFromSelectionMatrix(driver); 
		
	
	}
	
	@Test(groups="Smoke")
	public void ExcludeassementfromselectionMatrix_getAssesmentMatrix() throws Exception
	{
		PropertyConfigurator.configure("log4j.properties"); 
		lp.costcenter();
		lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		EAFSM.getAssesmentMatrix();
	}
	 @Test(groups= {"Smoke"},dependsOnMethods= {"ExcludeassementfromselectionMatrix_getAssesmentMatrix"})
	    public void ExcludeassementfromselectionMatrix_getAsssesmentType() throws InterruptedException 
	    {
		EAFSM.getAsssesmentType();
	    }
	 @Test(groups= {"Smoke"},dependsOnMethods= {"ExcludeassementfromselectionMatrix_getAsssesmentType"})
	    public void ExcludeassementfromselectionMatrix_getCostcenter() throws InterruptedException 
	    {
		EAFSM.getCostcenter();
	    }
	 @Test(groups= {"Smoke"},dependsOnMethods= {"ExcludeassementfromselectionMatrix_getCostcenter"})
	    public void ExcludeassementfromselectionMatrix_getDepartment() throws InterruptedException 
	    {
		EAFSM.getDepartment();
	    }
	 @Test(groups= {"Smoke"},dependsOnMethods= {"ExcludeassementfromselectionMatrix_getDepartment"})
	    public void ExcludeassementfromselectionMatrix_getsave() throws InterruptedException 
	    {
		EAFSM.getsave();
	    }
	 @Test(groups= {"Smoke"},dependsOnMethods= {"ExcludeassementfromselectionMatrix_getsave"})
	    public void ExcludeassementfromselectionMatrix_getdelete() throws InterruptedException 
	    {
		EAFSM.getdelete();
	    }
	 @Test(groups= {"Smoke"},dependsOnMethods= {"ExcludeassementfromselectionMatrix_getdelete"})
	    public void ExcludeassementfromselectionMatrix_getHomebutton() throws InterruptedException 
	    {
		EAFSM.getHomebutton();
	    }
		
	
	
	
	
	
	 
@AfterClass
	
	public void Teardown() throws Exception
	{
	
		driver.quit();
		
	
	}

	  }


