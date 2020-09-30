package com.ats.qa.testcases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;


import com.ats.qa.base.TestBase;

import com.ats.qa.pages.Communication_Master;
import com.ats.qa.pages.LoginPage;
import com.ats.qa.pages.OnlineTestMaster;


	public class OnlineMasterTest extends TestBase {
		
		public  LoginPage lp;
		public   OnlineTestMaster OTM;
			
		@BeforeClass
		
		public  void setup() throws Exception
		{
			
			  driver=Initialization();
		      lp=new LoginPage();
		      OTM=new OnlineTestMaster(driver); 
			
			}
		
		@Test(groups="Regression")
		public  void OnlineTestMaster_getMaster() throws Exception
		{  
			
			PropertyConfigurator.configure("log4j.properties");
			 lp.costcenter();
			lp.Login(prop.getProperty("username"), prop.getProperty("password"));
			OTM.getMaster();
		}
		@Test(groups= {"Regression"},dependsOnMethods= {"OnlineTestMaster_getMaster"})
		public void OnlineTestMaster_getCommunicationMaster() throws InterruptedException
		{
		
			OTM.getCommunicationMaster();
	} 
		@Test(groups= {"Regression"},dependsOnMethods= {"OnlineTestMaster_getCommunicationMaster"})
		public void OnlineTestMaster_getStage() throws InterruptedException
		{
		    OTM.getStage();
		}
		@Test(groups= {"Regression"},dependsOnMethods= {"OnlineTestMaster_getStage"})
		public void OnlineTestMaster_getRecipent() throws InterruptedException
		{
		    OTM.getRecipent();
		}
		@Test(groups= {"Regression"},dependsOnMethods= {"OnlineTestMaster_getRecipent"})
		public void OnlineTestMaster_getNotificationType() throws InterruptedException
		{ 
			String[] testName = null;
			OTM.getNotificationType(driver, testName);
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"OnlineTestMaster_getNotificationType"})
		public void OnlineTestMaster_getSave() throws InterruptedException
		{ 
			Thread.sleep(2000);
			 JavascriptExecutor js1 = (JavascriptExecutor)driver;
			 js1.executeScript("scroll(0, 350)");
			OTM.getSave();
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"OnlineTestMaster_getSave"})
		public void OnlineTestMaster_getedit() throws InterruptedException
		{ 
			Thread.sleep(2000);
			 JavascriptExecutor js1 = (JavascriptExecutor)driver;
			 js1.executeScript("scroll(0, 550)");
			OTM.getedit();
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"OnlineTestMaster_getedit"})
		public void OnlineTestMaster_getupdateTemplate() throws InterruptedException
		{ 
			Thread.sleep(2000);
			 JavascriptExecutor js1 = (JavascriptExecutor)driver;
			 js1.executeScript("scroll(0, 550)");
	        OTM.getupdateTemplate();
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"OnlineTestMaster_getupdateTemplate"})
		public void OnlineTestMaster_getUpdate() throws InterruptedException
		{ 
			Thread.sleep(2000);
			 JavascriptExecutor js1 = (JavascriptExecutor)driver;
			 js1.executeScript("scroll(0, 550)");
			OTM.getUpdate();
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"OnlineTestMaster_getUpdate"})
		public void OnlineTestMaster_getDelete() throws InterruptedException
		{ 
			Thread.sleep(2000);
			  JavascriptExecutor js1 = (JavascriptExecutor)driver;
			  js1.executeScript("scroll(0, 1000)");
			OTM.getDelete();
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"OnlineTestMaster_getDelete"})
		public void OnlineTestMaster_getHomePage() throws InterruptedException
		{
			Thread.sleep(2000);
			 JavascriptExecutor js1 = (JavascriptExecutor)driver;
			 js1.executeScript("scroll(1000,0 )");
			OTM.getHomePage();
		}
		
	
		@AfterClass()
		
		
		public void Teardown() throws Exception
		{
		
			driver.quit();
			

	}

		  }




