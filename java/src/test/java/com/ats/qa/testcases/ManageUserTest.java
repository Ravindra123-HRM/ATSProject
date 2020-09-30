package com.ats.qa.testcases;



import org.testng.annotations.Test;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import com.ats.qa.base.TestBase;

import com.ats.qa.pages.LoginPage;
import com.ats.qa.pages.ManageUser;



public class ManageUserTest extends TestBase {
	
	public static LoginPage lp;
	public static  ManageUser mu;
	

	
		// TODO Auto-generated constructor stub
		
		
	    @BeforeClass
		public void setup() throws Exception 
		{
			driver=Initialization();
		    lp=new LoginPage();
			mu=new ManageUser(driver);
			
		
		 }
	   
	   
	@Test(groups="Regression")	
	public  void UserManagement_getemployeename()  throws Exception
	{
		PropertyConfigurator.configure("log4j.properties");
 		
		 lp.costcenter();
         lp.Login(prop.getProperty("username"), prop.getProperty("password"));
         mu.getemployeename();
	}
	@Test(groups= {"Regression"},dependsOnMethods= {"UserManagement_getemployeename"})
    public void UserManagement_getAutosuggest() throws InterruptedException 
    {
         mu.getAutosuggest();
    }
	@Test(groups= {"Regression"},dependsOnMethods= {"UserManagement_getAutosuggest"})
    public void UserManagement_getcheckbox() throws InterruptedException 
    {
         mu.getcheckbox();
    }
	@Test(groups= {"Regression"},dependsOnMethods= {"UserManagement_getcheckbox"})
    public void UserManagement_getsave() throws InterruptedException 
    {
         mu.getsave();
    }
	@Test(groups= {"Regression"},dependsOnMethods= {"UserManagement_getsave"})
    public void UserManagement_getEdit() throws InterruptedException 
    {
          mu.getEdit();
    }
	@Test(groups= {"Regression"},dependsOnMethods= {"UserManagement_getEdit"})
    public void UserManagement_getupdatebutton() throws InterruptedException 
    {
          mu.getupdatebutton();
    }
	@Test(groups= {"Regression"},dependsOnMethods= {"UserManagement_getupdatebutton"})
    public void UserManagement_getHomebutton() throws InterruptedException 
    {
         mu.getHomebutton();
         
	}
	
	
   

 	
@AfterClass
	
	public void Teardown() throws Exception
	{
	
		driver.close();
		
	
	}
}





