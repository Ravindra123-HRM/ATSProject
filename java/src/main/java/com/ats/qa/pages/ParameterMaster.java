package com.ats.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ats.qa.base.Log;
import com.ats.qa.base.TestBase;



public class ParameterMaster  {
public WebDriver driver;
	public ParameterMaster(WebDriver driver) throws Exception {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	By Master=By.id("cphMain_Masters");
	By para=By.id("ParameterMaster");
	By parameter=By.id("cphMain_ddlParameter");
	By save=By.id("cphMain_lbtnSave");
	By update=By.id("cphMain_lbtnUpdate"); 
	
	public void clickonMaster() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(Master).click();
		Log.info("Master module  is click");
		
	}
	public void clickonparameter() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(para).click();
		Log.info("parameter master is click");
	}
	
	public void clickonEnterdetails() throws InterruptedException
	{
		Thread.sleep(2000);
		Select category=new Select(driver.findElement(parameter));
		category.selectByVisibleText("College");
		Log.info("college drop down value is selected");
		Thread.sleep(2000);
		WebElement value=driver.findElement(By.id("cphMain_txtValue"));
		value.sendKeys("Test123");
		Log.info("Test123 value is inserted");
		driver.findElement(save).click();
		Log.info("save button is selected");
	
		
		 Thread.sleep(2000);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("scroll(0, 350)");
		  
		  driver.findElement(By.id("cphMain_gvShowParameterReport_lbtnEdit_0")).click();
			Log.info("Edit button is selected");
		  Select category1=new Select(driver.findElement(parameter));
		category1.selectByVisibleText("Degree");
		Log.info("Degree drop down value is selected");
	     Thread.sleep(2000);
	     WebElement senddocument=driver.findElement(By.id("cphMain_txtValue"));
	     senddocument.clear();
	     senddocument.sendKeys("Degre certificate");
	     Log.info("Degree certificate value is selected");
	     driver.findElement(update).click();
	     Log.info("update button is selected");
	     
	}
	
	
	
}
