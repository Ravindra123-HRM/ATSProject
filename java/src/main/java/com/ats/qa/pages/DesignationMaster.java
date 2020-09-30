package com.ats.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ats.qa.base.Log;
import com.ats.qa.base.TestBase;

public class DesignationMaster {
	WebDriver driver;

	public DesignationMaster(WebDriver driver) throws Exception {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	By Master = By.id("cphMain_Masters");

	By Designation = By.id("hlPostApplied");

	By parameter = By.id("cphMain_ddlParameter");

	By value = By.id("cphMain_txtValue");

	By update = By.id("cphMain_lbtnUpdate");

	public void clickonMaster() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(Master).click();
		Log.info("click on master");

	}

	public void clickonDesignationmaster() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(Designation).click();
		Log.info("click on designationmaster module");
	}

	public void clickonEnterdetails() throws InterruptedException {
		WebElement Value = driver.findElement(value);
		Value.sendKeys("Test123");
		Log.info("Test123 value is inserted");
		driver.findElement(By.id("cphMain_lbtnSave")).click();
		Log.info("save button is selected");
		driver.navigate().refresh();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0, 250)");
		driver.findElement(By.xpath("//td[contains(text(),'Quality Analyst (IRL)')]//following::td[2]//descendant::input[@text='Edit']")).click();
		Log.info("Edit button is selected");
		Thread.sleep(2000);
		Value.sendKeys("ASDTest");
		Log.info("ASDTest value is inserted ");
		driver.findElement(update).click();
		Log.info("update button is click");

	}

}