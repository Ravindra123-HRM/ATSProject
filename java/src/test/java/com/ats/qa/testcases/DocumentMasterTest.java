package com.ats.qa.testcases;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.io.IOException;

import org.testng.ITestResult;
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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class DocumentMasterTest extends TestBase {

	
	public static LoginPage lp;
	public static DocumentMaster dm;

	
		// TODO Auto-generated constructor stub
		
	
	
		
	    @BeforeClass
		public void setup() throws Exception 
		{
	    	
			Initialization();
			lp=new LoginPage();
			dm=new DocumentMaster(driver);
			
		
		 }
	   
	    @Test(groups= {"Smoke"})
	    public void Documentmaster_clickonMaster() throws Exception 
	    {
	    	
	    	PropertyConfigurator.configure("log4j.properties");
			 lp.costcenter();
			lp.Login(prop.getProperty("username"), prop.getProperty("password"));
	    	dm.clickonMaster();
	    }
	    @Test(groups= {"Smoke"},dependsOnMethods= {"Documentmaster_clickonMaster"})
	    public void Documentmaster_clickOnDocumentMaster() throws InterruptedException 
	    {
	    	dm.clickOnDocumentMaster();
	    }
	    @Test(groups= {"Smoke"},dependsOnMethods= {"Documentmaster_clickOnDocumentMaster"})
	    public void Documentmaster_clickoncategory() throws InterruptedException 
	    {
	    	dm.clickoncategory();
	    }
	    @Test(groups= {"Smoke"},dependsOnMethods= {"Documentmaster_clickoncategory"})
	    public void Documentmaster_clickOncategoryMaster() throws InterruptedException 
	    {
	    	dm.clickOncategoryMaster();
	    }
	    @Test(groups= {"Smoke"},dependsOnMethods= {"Documentmaster_clickOncategoryMaster"})
	    public void Documentmaster_clickOnDocumentcategory() throws InterruptedException 
	    {
	    	dm.clickOnDocumentcategory();
	    
	     }
	    @AfterClass
		public void teardown()
		{
			
			driver.quit();
		
			
		}

	  
}




