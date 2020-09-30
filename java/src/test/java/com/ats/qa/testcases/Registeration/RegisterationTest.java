package com.ats.qa.testcases.Registeration;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ats.qa.Registeration.RegisterationPage;
import com.ats.qa.base.TestBase;
import com.ats.qa.pages.LoginPage;

public class RegisterationTest extends TestBase {
	

	public static RegisterationPage rp;
	public static LoginPage lp;
	
	@BeforeClass
	public void Login_steup() throws Exception
	{
		driver=Initialization();
		lp=new LoginPage();
		rp=new RegisterationPage(driver);
		
	}
   @Test(groups="Regression")
	public void Registeration_clickonRegister() throws Exception
	{
	   PropertyConfigurator.configure("log4j.properties");
		 lp.costcenter();
		lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		 
		rp.clickonRegister();
	}
   
   @Test(groups= {"Regression"},dependsOnMethods= {"Registeration_clickonRegister"})
  	public void Registeration_clickonNewwalkinEntry() throws InterruptedException
  	{
	  
  		rp.clickonNewwalkinEntry();
  	}
   
   @Test(groups= {"Regression"},dependsOnMethods= {"Registeration_clickonNewwalkinEntry"})
 	public void Registeration_clickonLocation() throws InterruptedException
 	{
	 
 		rp.clickonLocation();
 	}
   
   @Test(groups= {"Regression"},dependsOnMethods= {"Registeration_clickonLocation"})
	public void Registeration_clickonName() throws InterruptedException
	{
		
		rp.clickonName();
	}
   
   @Test(groups= {"Regression"},dependsOnMethods= {"Registeration_clickonName"})
	public void Registeration_clickonCalender() throws InterruptedException
	{
	   Thread.sleep(2000);
		  JavascriptExecutor js1 = (JavascriptExecutor)driver;
		  js1.executeScript("scroll(0, 350)");
		rp.clickonCalender();
	}
   
   @Test(groups= {"Regression"},dependsOnMethods= {"Registeration_clickonCalender"})
 	public void Registeration_clickonMobileno() throws InterruptedException
 	{
 		
 		rp.clickonMobileno();
 	}
   
   @Test(groups= {"Regression"},dependsOnMethods= {"Registeration_clickonMobileno"})
	public void Registeration_clickonCategory() throws InterruptedException
	{
		
		rp.clickonCategory();
	}
  
   @Test(groups= {"Regression"},dependsOnMethods= {"Registeration_clickonCategory"})
	public void Registeration_clickonDetails() throws InterruptedException
	{
		
		rp.clickonDetails();
	}
   
   @Test(groups= {"Regression"},dependsOnMethods= {"Registeration_clickonDetails"})
  	public void Registeration_clickonPan() throws InterruptedException
  	{
	   Thread.sleep(2000);
		  JavascriptExecutor js1 = (JavascriptExecutor)driver;
		  js1.executeScript("scroll(0, 350)");
  		rp.clickonPan();
  	}
   
   @Test(groups= {"Regression"},dependsOnMethods= {"Registeration_clickonPan"})
 	public void Registeration_clickOnAdharcard() throws InterruptedException
 	{
 		
 		rp.clickOnAdharcard();
 	}
   
   @Test(groups= {"Regression"},dependsOnMethods= {"Registeration_clickOnAdharcard"})
	public void Registeration_clickonImpactsource() throws InterruptedException
	{
	   
		rp.clickonImpactsource();
	}
   
   
   @Test(groups= {"Regression"},dependsOnMethods= {"Registeration_clickonImpactsource"})
  	public void Registeration_clickonsubmit() throws InterruptedException
  	{
 	   Thread.sleep(2000);
 		  JavascriptExecutor js1 = (JavascriptExecutor)driver;
 		  js1.executeScript("scroll(0, 1000)");
         rp.clickonsubmit();
  	}
   @Test(groups= {"Regression"},dependsOnMethods= {"Registeration_clickonsubmit"})
	public void Registeration_clickonduplicatecheck() throws InterruptedException
	{
	Thread.sleep(5000);
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
       rp.clickonduplicatecheck();
       
	}
   
   @Test(groups= {"Regression"},dependsOnMethods= {"Registeration_clickonduplicatecheck"})
  	public void Registeration_clickonRegisterationstatus() throws InterruptedException
  	{
  	 
         rp.clickonRegisterationstatus();
  	}
   
   @Test(groups= {"Regression"},dependsOnMethods= {"Registeration_clickonRegisterationstatus"})
 	public void Registeration_clickonsavebutton() throws InterruptedException
 	{
 	 
        rp.clickonsavebutton();
 	}
   /*@AfterClass()
   public void Teradown()
   {
	   
	   driver.quit();
   }*/
}
