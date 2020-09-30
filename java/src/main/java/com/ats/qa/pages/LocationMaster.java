package com.ats.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ats.qa.base.Log;
import com.ats.qa.base.TestBase;

public class LocationMaster extends TestBase{
	WebDriver driver;
	public LocationMaster(WebDriver driver) throws Exception {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	By Master=By.id("cphMain_Masters");
	
	By Location=By.id("hlLocationMaster");
	
	By parameter=By.id("cphMain_ddlParameter");
	
	By value=By.id("cphMain_txtValue");
	
	By TimeZone=By.id("cphMain_ddlTimeZone");
	
	By update=By.id("cphMain_lbtnUpdate");
	
	
	
	
	public void clickonMaster() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(Master).click();
		Log.info("click on  Master module");
		
	}
	
	public void clickonDesignationmaster() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(Location).click();
		Log.info("click on Location Master module");
	}
	
	public void clickonEnterdetails() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Value=driver.findElement(value);
		Value.sendKeys("Test123"); 
		Log.info("Test123 value is inserted");
		Thread.sleep(2000);
		Select Timezonee=new Select(driver.findElement(TimeZone));
		Timezonee.selectByVisibleText("(UTC-09:30) Marquesas Islands");
		Log.info("UTC-09:30) Marquesas Islands drop value is selected");
		driver.findElement(By.id("cphMain_lbtnSave")).click();
		Log.info("save button is click");
		Thread.sleep(2000);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("scroll(0, 250)");
	 driver.findElement(By.xpath("//td[contains(text(),'Test123')]//following::td[2]//descendant::input[@text='Edit']")).click();
		Log.info("Edit button is click");
	 Thread.sleep(2000);
	 WebElement Value1=driver.findElement(value);
	 Value1.clear();
	 Value1.sendKeys("ASDTest");
		Log.info("ASDTest value is entered");
	 driver.findElement(update).click();
		Log.info("update button is click");

	
	
		
	}
	
	
}