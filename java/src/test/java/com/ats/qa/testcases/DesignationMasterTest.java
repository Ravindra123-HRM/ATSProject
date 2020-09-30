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
import com.ats.qa.pages.DesignationMaster;
import com.ats.qa.pages.LoginPage;



public class DesignationMasterTest extends TestBase {

	public static LoginPage lp;
	
	public static DesignationMaster dm;
	
	 @BeforeClass
	
	public void Department_setup() throws Exception
	{
		Initialization();
		 lp=new LoginPage();
		dm=new DesignationMaster(driver);; 
		 
	
	}
	 
	
	 @Test(groups= {"Smoke"})
		public void Designation_clickonMaster() throws Exception
		{
			PropertyConfigurator.configure("log4j.properties");
			 lp.costcenter();
			lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		    dm.clickonMaster();
		}
	
	 @Test(groups= {"Smoke"},dependsOnMethods= {"Designation_clickonMaster"} )
		public void Designation_clickondesignationmaster() throws Exception
		{
		dm.clickonDesignationmaster();
		}
	 @Test(groups= {"Smoke"},dependsOnMethods= {"Designation_clickondesignationmaster"})
		public void Designation_clickonEnterdetails() throws Exception
		{
		 
		dm.clickonEnterdetails();
		
		 }
		
@AfterClass

public void Teardown() throws Exception
{

	driver.quit();
	

}

}



