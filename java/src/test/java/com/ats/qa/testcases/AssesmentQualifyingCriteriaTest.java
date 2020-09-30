package com.ats.qa.testcases;




import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.ats.qa.base.Log;
import com.ats.qa.base.TestBase;
import com.ats.qa.pages.AssessmentQualifyingCriteria;
import com.ats.qa.pages.LoginPage;





public class AssesmentQualifyingCriteriaTest extends TestBase {
	
	public  LoginPage lp;
	public   AssessmentQualifyingCriteria AQC;
	


	
	
	
	@BeforeClass
	
	public  void setup() throws Exception
	{
		
		driver=Initialization();
	      lp=new LoginPage();
	      AQC=new AssessmentQualifyingCriteria(driver); 
		
		}
	
	@Test(groups="Regression")
	public  void Assesmentqualifyingcriteria_getAssesment() throws Exception
	{  
		
		PropertyConfigurator.configure("log4j.properties");
		 lp.costcenter();
		lp.Login(prop.getProperty("username"), prop.getProperty("password"));
	   AQC.getAssesmentcriteria();
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Assesmentqualifyingcriteria_getAssesment"})
	public void Assesmentqualifyingcriteria_getAssesmenttype() throws InterruptedException
	{
	
		AQC.getAssesmentType();
} 
	@Test(groups= {"Regression"},dependsOnMethods= {"Assesmentqualifyingcriteria_getAssesmenttype"})
	public void Assesmentqualifyingcriteria_getcostcenter() throws InterruptedException
	{
	    AQC.getCostCentre();
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Assesmentqualifyingcriteria_getcostcenter"})
	public void Assesmentqualifyingcriteria_getdepartment() throws InterruptedException
	{
	    AQC.getDepartment();
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"Assesmentqualifyingcriteria_getdepartment"})
	public void Assesmentqualifyingcriteria_getFrom() throws InterruptedException
	{ 
		AQC.getFrom();
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Assesmentqualifyingcriteria_getFrom"})
	public void Assesmentqualifyingcriteria_getTo() throws InterruptedException
	{ 
		AQC.getTo();
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Assesmentqualifyingcriteria_getTo"})
	public void Assesmentqualifyingcriteria_getResult() throws InterruptedException
	{ 
		AQC.getResult();
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Assesmentqualifyingcriteria_getResult"})
	public void Assesmentqualifyingcriteria_getSave() throws InterruptedException
	{ 
		
        AQC.getSave();
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Assesmentqualifyingcriteria_getSave"})
	public void Assesmentqualifyingcriteria_getedit() throws InterruptedException
	{ 
		AQC.getedit();
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Assesmentqualifyingcriteria_getedit"})
	public void Assesmentqualifyingcriteria_getUpdate() throws InterruptedException
	{ 
		AQC.getUpdate();
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Assesmentqualifyingcriteria_getUpdate"})
	public void Assesmentqualifyingcriteria_getDelete() throws InterruptedException
	{
		AQC.getDelete();
	}
	
	@Test(groups= {"Regression"},dependsOnMethods= {"Assesmentqualifyingcriteria_getDelete"})
	public void Assesmentqualifyingcriteria_getHomePage() throws InterruptedException
	{
	    AQC.getHomePage();
		
	}

	
	
	
	 
	
	
	

	@AfterClass()
	
	
	public void Teardown() throws Exception
	{
	
		driver.quit();
		

	}

	  }

