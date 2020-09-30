package com.ats.qa.testcases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;


import com.ats.qa.base.TestBase;

import com.ats.qa.pages.Communication_Master;
import com.ats.qa.pages.LoginPage;


	public class CoomunicationMasterTest extends TestBase {
		
		public  LoginPage lp;
		public   Communication_Master CM;
		


		
		
		
		@BeforeClass
		
		public  void setup() throws Exception
		{
			
			driver=Initialization();
		      lp=new LoginPage();
		      CM=new Communication_Master(driver); 
			
			}
		
		@Test(groups="Regression")
		public  void CommunicationMaster_getMaster() throws Exception
		{  
			
			PropertyConfigurator.configure("log4j.properties");
			 lp.costcenter();
			lp.Login(prop.getProperty("username"), prop.getProperty("password"));
			CM.getMaster();
		}
		@Test(groups= {"Regression"},dependsOnMethods= {"CommunicationMaster_getMaster"})
		public void CommunicationMaster_getCommunicationMaster() throws InterruptedException
		{
		
			CM.getCommunicationMaster();
	} 
		@Test(groups= {"Regression"},dependsOnMethods= {"CommunicationMaster_getCommunicationMaster"})
		public void CommunicationMaster_getAdvisor() throws InterruptedException
		{
		    CM.getAdvisor();
		}
		@Test(groups= {"Regression"},dependsOnMethods= {"CommunicationMaster_getAdvisor"})
		public void CommunicationMaster_getStage() throws InterruptedException
		{
		    CM.getStage();
		}
		@Test(groups= {"Regression"},dependsOnMethods= {"CommunicationMaster_getStage"})
		public void CommunicationMaster_getRecipent() throws InterruptedException
		{ 
			CM.getRecipent();
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"CommunicationMaster_getRecipent"})
		public void CommunicationMaster_getLocation() throws InterruptedException
		{ 
			CM.getLocation();
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"CommunicationMaster_getLocation"})
		public void CommunicationMaster_getStartTime() throws InterruptedException
		{ 
			CM.getStartTime();
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"CommunicationMaster_getStartTime"})
		public void CommunicationMaster_getEndTime() throws InterruptedException
		{ 
			
	        CM.getEndTime();
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"CommunicationMaster_getEndTime"})
		public void CommunicationMaster_getNotificationType() throws InterruptedException
		{ 
			CM.getNotificationType();
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"CommunicationMaster_getNotificationType"})
		public void CommunicationMaster_getTemplate() throws InterruptedException
		{ 
			CM.getTemplate();
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"CommunicationMaster_getTemplate"})
		public void CommunicationMaster_getSave() throws InterruptedException
		{
			Thread.sleep(2000);
			 JavascriptExecutor js1 = (JavascriptExecutor)driver;
			 js1.executeScript("scroll(0, 350)");
			CM.getSave();
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"CommunicationMaster_getSave"})
		public void CommunicationMaster_getedit() throws InterruptedException
		{
			Thread.sleep(2000);
			 JavascriptExecutor js1 = (JavascriptExecutor)driver;
			 js1.executeScript("scroll(0, 550)");
		    CM.getedit();
			
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"CommunicationMaster_getedit"})
		public void CommunicationMaster_getupdateTemplate() throws InterruptedException
		{
			Thread.sleep(2000);
			 JavascriptExecutor js1 = (JavascriptExecutor)driver;
			 js1.executeScript("scroll(0, 550)");
		    CM.getupdateTemplate();
			
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"CommunicationMaster_getupdateTemplate"})
		public void CommunicationMaster_getUpdate() throws InterruptedException
		{
			Thread.sleep(2000);
			 JavascriptExecutor js1 = (JavascriptExecutor)driver;
			 js1.executeScript("scroll(0, 550)");
		    CM.getUpdate();
			
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"CommunicationMaster_getUpdate"})
		public void CommunicationMaster_getDelete() throws InterruptedException
		{
			Thread.sleep(2000);
			  JavascriptExecutor js1 = (JavascriptExecutor)driver;
			  js1.executeScript("scroll(0, 1000)");
			 
		    CM.getDelete();
			
		}
		
		@Test(groups= {"Regression"},dependsOnMethods= {"CommunicationMaster_getDelete"})
		public void CommunicationMaster_getHomePage() throws InterruptedException
		{
			Thread.sleep(2000);
			  JavascriptExecutor js1 = (JavascriptExecutor)driver;
			  js1.executeScript("scroll(1000, 0)");
		    CM.getHomePage();
			
		}

		
		
		
		 
		
		
		

		@AfterClass()
		
		
		public void Teardown() throws Exception
		{
		
			driver.quit();
			

	}

		  }




