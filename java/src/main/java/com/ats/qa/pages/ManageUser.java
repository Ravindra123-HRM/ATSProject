package com.ats.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ats.qa.base.Log;
import com.ats.qa.base.TestBase;

public class ManageUser  {
	WebDriver driver;
	public ManageUser(WebDriver driver) throws Exception {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

    
	public By Employeename = By.xpath("//a[@id='cphMain_hlUserManagement']");
	public By Autusuggest = By.id("cphMain_tbEmployee");
	public By save = By.id("cphMain_btnSave");
	public By Edit = By.xpath(" //input[@id='cphMain_gvUserRole_lbtnEdit_2']");
	public By updatebutton = By.id("cphMain_btnUpdate");
	public By Homebutton = By.cssSelector("img[alt*='Home']"); 

	

	public void getemployeename() throws InterruptedException {
     Thread.sleep(2000);
	driver.findElement(Employeename).click();
	Log.info("click on UserMangement Module");

	}

	public void getAutosuggest() throws InterruptedException 
	{
		   Thread.sleep(2000);
		WebElement hover = driver.findElement(Autusuggest);
		hover.click();
		Log.info("click on Employee Name field");
		WebElement autosuggest = driver.findElement(By.id("cphMain_tbEmployee"));
		// KINDLY INSERT NEW EMPLOYEE_ID FOR NEW USER IN USERMANGEMENT
		autosuggest.sendKeys("103760");
		Log.info("Name of the employee is entered");
		Thread.sleep(5000);
		autosuggest.sendKeys(Keys.ARROW_DOWN);

		autosuggest.sendKeys(Keys.ENTER);

	

	}

	public void getcheckbox() throws InterruptedException 
	{

		Thread.sleep(2000);

		WebElement name = driver.findElement(By.cssSelector("input[type='checkbox']"));
		name.findElement(By.xpath("//input[@id='cphMain_cblRoles_2']")).click();
		Log.info("check box is checked");
		
	}

	public void getsave() throws InterruptedException
	{
		 Thread.sleep(2000);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("scroll(0, 550)");
		  
		if (Autusuggest.equals(By.id("cphMain_tbEmployee"))) {

			Thread.sleep(2000);
			driver.findElement(updatebutton).click();
			Log.info("Update button is click");
		}

		else if (Autusuggest.equals(By.id("cphMain_tbEmployee"))) {
			Thread.sleep(2000);
			driver.findElement(save).click();
			Log.info("save button is click");
		}

	}

	public void getEdit() throws InterruptedException

	{
		Thread.sleep(2000);

		 driver.findElement(Edit).click();
		 Log.info("Edit button is click");
		
	}

	public void getupdatebutton() throws InterruptedException
	{
		Thread.sleep(2000);

		 driver.findElement(updatebutton).click();
		 Log.info("update button is click");
		
	}

	public void getHomebutton() throws InterruptedException 
	{
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		 driver.findElement(Homebutton).click();;
		 Log.info("Home button is click");
		
	}

}
