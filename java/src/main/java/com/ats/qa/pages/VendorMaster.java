package com.ats.qa.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.ats.qa.base.Log;
import com.ats.qa.base.TestBase;



public class VendorMaster {
	WebDriver driver;
	public VendorMaster(WebDriver driver) throws Exception {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	By Master=By.id("cphMain_Masters");
	
	By vendor=By.id("hlVendorMaster");
	
	By vedorname=By.id("cphMain_tbVendorName");
	
	By Address=By.id("cphMain_tbAddress");
	
	By Emailaddress=By.id("cphMain_tbMailId");
	
	By contactperson=By.id("cphMain_tbContactPerson");
	
	By contactno=By.id("cphMain_tbContactNo");
	
	By update=By.id("cphMain_btnUpdate");
	
	By save=By.id("cphMain_btnSave");
	
	public void clickonMaster() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(Master).click();
	     
		
	}
	
	public void clickonVendor() throws InterruptedException
	{
		Thread.sleep(2000);
		boolean Click=driver.findElement(vendor).isSelected();
		driver.findElement(vendor).click();
		Log.info("Vendor is clickable"+Click);
	
		
		
	}
	
	public void clickonAddvendordetails() throws InterruptedException 
	{
		
		boolean sendvendor=driver.findElement(vedorname).isDisplayed();
		Log.info("Vendorname has display value" +sendvendor);
		driver.findElement(vedorname).sendKeys("Kumar");
		 Log.info("Vendor name is inserted");
		boolean sendAddress=driver.findElement(vedorname).isDisplayed();
		Log.info("sendAddress has display value" +sendAddress);
		driver.findElement(Address).sendKeys("Mumbai");
		 Log.info("Address value is inserted");
		
		boolean emailaddress=driver.findElement(vedorname).isDisplayed();
		Log.info("EmailAddress has display value" +emailaddress);
		driver.findElement(Emailaddress).sendKeys("pallavi.donadkar@techmahindra.com");
		 Log.info("Email address  value is inserted");
		boolean Contactperson=driver.findElement(vedorname).isDisplayed();
		Log.info("contactperson has display value" +Contactperson);
		driver.findElement(contactperson).sendKeys("pallavi");
		 Log.info("Contact person value is inserted");
		boolean Contactno=driver.findElement(vedorname).isDisplayed();
		Log.info("sendAddress has display value" +Contactno);
		driver.findElement(contactno).sendKeys("9874560123");
		 Log.info("contact name value is inserted");
		
		boolean fssladays=driver.findElement(By.id("cphMain_txtFSlaDays")).isDisplayed();
		Log.info("sendAddress has display value" +fssladays);
		driver.findElement(By.id("cphMain_txtFSlaDays")).sendKeys("0");
		 Log.info("zero value is inserted");
		boolean Isladays=driver.findElement(By.id("cphMain_txtISlaDays")).isDisplayed();
		Log.info("sendAddress has display value" +Isladays);
		driver.findElement(By.id("cphMain_txtISlaDays")).sendKeys("0");
		 Log.info("zero value is inserted");
		boolean fslaarrv=driver.findElement(By.id("cphMain_txtFSLARV")).isDisplayed();
		Log.info("sendAddress has display value" +fslaarrv);
		driver.findElement(By.id("cphMain_txtFSLARV")).sendKeys("0");
		 Log.info("zero value is inserted");
		boolean islarv=driver.findElement(By.id("cphMain_txtISLARV")).isDisplayed();
		Log.info("sendAddress has display value" +islarv);
		WebElement Islarv=driver.findElement(By.id("cphMain_txtISLARV"));
	    Islarv.sendKeys("1");
	    Log.info("one value is inserted");
	    Thread.sleep(2000);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("scroll(0, 350)");
	    driver.findElement(By.id("cphMain_btnSave")).click();
	    Log.info("save button is click");
	    Thread.sleep(2000);
		  JavascriptExecutor js1 = (JavascriptExecutor)driver;
		  js1.executeScript("scroll(0, 350)");
		 
	    driver.findElement(By.xpath("//td[contains(text(),'Kumar')]//following::td[9]//descendant::input[@text='Edit']")).click();
	    Log.info("Edit button is click");
	    Thread.sleep(2000);
		  JavascriptExecutor js11 = (JavascriptExecutor)driver;
		  js11.executeScript("scroll(3500, 0)");
		boolean sendvendor1=driver.findElement(vedorname).isDisplayed();
		Log.info("Vendorname has display value" +sendvendor1);
		  Thread.sleep(2000);
	   WebElement vendor= driver.findElement(vedorname);
	   vendor.clear();
	   vendor.sendKeys("tripati");
		Log.info("tripati value is inserted");
	   WebElement senddocument=driver.findElement(contactperson);
	   senddocument.clear();
	   senddocument.sendKeys("Aarti");
		Log.info("Aarti value is inserted");	 
	  Thread.sleep(2000);
	  JavascriptExecutor js111 = (JavascriptExecutor)driver;
		 js111.executeScript("scroll(0, 250)");
		
		driver.findElement(update).click();
		Log.info("Update button is click");	 
		
		
	}
}
	
