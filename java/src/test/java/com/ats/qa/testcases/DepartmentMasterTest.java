package com.ats.qa.testcases;

import org.testng.annotations.Test;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Reporter;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;


import com.ats.qa.base.Log;
import com.ats.qa.base.TestBase;
import com.ats.qa.pages.DepartmentMaster;
import com.ats.qa.pages.LoginPage;






public class DepartmentMasterTest extends TestBase {

	public static LoginPage lp;
	public static DepartmentMaster dm;
	

	
	// public static Logger logger =Logger.getLogger(DepartmentMasterTest.class.getName());
	 
	  
	@BeforeClass
	
	public  void setup() throws Exception
	{
		
		Initialization();
		 lp=new LoginPage();
		dm=new DepartmentMaster(driver);
		
	
	}
	
	@Test(groups="Smoke")
	public void Department_clickonMaster() throws Exception
	{
		PropertyConfigurator.configure("log4j.properties");
	
	    lp.costcenter();
		
		lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	
		dm.clickonMaster();
	}
	@Test(groups= {"Smoke"},dependsOnMethods= {"Department_clickonMaster"})
	public void Department_clickOnDepartment() throws Exception
	{
		dm.clickOnDepartment();
	}
		//dm.clickoncategory();
	@Test(groups= {"Smoke"},dependsOnMethods= {"Department_clickOnDepartment"})
	public void Department_clickonDepartmentMapping() throws Exception
	{
		dm.clickonDepartmentMapping();
	}
	@Test(groups= {"Smoke"},dependsOnMethods= {"Department_clickonDepartmentMapping"})
	public void Department_selectDepartment() throws Exception
	{
		dm.selectDepartment();
		
	}
	

	
	
	 
	
@AfterClass()
	
	public void Teardown() throws Exception
	{
	
	
		driver.quit();
		
	
	}

	  }


