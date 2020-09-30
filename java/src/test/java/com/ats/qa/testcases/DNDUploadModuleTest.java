package com.ats.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.ats.qa.base.TestBase;
import com.ats.qa.pages.DNDUploadModule;
import com.ats.qa.pages.DepartmentMaster;
import com.ats.qa.pages.ExcluseAssesmentFromSelectionMatrix;
import com.ats.qa.pages.LoginPage;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DNDUploadModuleTest extends TestBase {

	public static LoginPage lp;
	
	public static DNDUploadModule DUM;
	
	 
	
		
			
	
	 @BeforeClass
	
	public void setup() throws Exception
	{
		Initialization();
		 lp=new LoginPage();
		 DUM=new DNDUploadModule(driver); 
		
	
	}
	
	@Test(groups= "Smoke")
	public void DNDuploadModule_getDNDmobile() throws Exception
	{
		PropertyConfigurator.configure("log4j.properties");
		lp.costcenter();
		lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		DUM.getDNDmobile();
	}
	@Test(groups= {"Smoke"},dependsOnMethods= {"DNDuploadModule_getDNDmobile"})
	public void DNDuploadModule_getDNDShowRadio() throws Exception
	{
		DUM.getDNDShowRadio();
	}
	@Test(groups= {"Smoke"},dependsOnMethods= {"DNDuploadModule_getDNDShowRadio"})
	public void DNDuploadModule_getDNDMobilenuumberText() throws Exception
	{
		DUM.getDNDMobilenuumberText();
	}
	@Test(groups= {"Smoke"},dependsOnMethods= {"DNDuploadModule_getDNDMobilenuumberText"})
	public void DNDuploadModule_getsave() throws Exception
	{
		DUM.getsave();
	}
	@Test(groups= {"Smoke"},dependsOnMethods= {"DNDuploadModule_getsave"})
	public void DNDuploadModule_getdelete() throws Exception
	{
		DUM.getdelete();
	}
	@Test(groups= {"Smoke"},dependsOnMethods= {"DNDuploadModule_getdelete"})
	public void DNDuploadModule_getHomebutton() throws Exception
	{
		DUM.getHomebutton();
		
	}
	
	
	
	
	 
@AfterClass
	
	public void Teardown() throws Exception
	{
	
		driver.quit();
		
	
	}

	  }


