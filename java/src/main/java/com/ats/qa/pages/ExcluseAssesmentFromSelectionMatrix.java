package com.ats.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ats.qa.base.Log;
import com.ats.qa.base.TestBase;

public class ExcluseAssesmentFromSelectionMatrix extends TestBase {

	WebDriver driver;
	public By AssesmentMatrix = By.xpath("//a[@id='cphMain_AssessmentExcludeFromSelectionMatrix']");
	public By AsssesmentType = By.id("cphMain_ddlAssessmentType");
	public By Costcenter = By.id("cphMain_ddlCostCentre");
	public By Department = By.id("cphMain_ddlDepartment");
	public By save = By.id("cphMain_btnSave");
	// private By delete =
	// By.id("cphMain_gvExcludeFromSelectionMatrix_lbtnDelete_0");
	public By Homebutton = By.cssSelector("img[alt*='Home']");

	public ExcluseAssesmentFromSelectionMatrix(WebDriver driver) throws Exception {

		this.driver = driver;
	}

	public WebElement getAssesmentMatrix() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AssesmentMatrix).click();
		Log.info("Assesment Matrix module is click");
		return null;
	}

	public Select getAsssesmentType() throws InterruptedException {
		Thread.sleep(2000);
		Select Assesment = new Select(driver.findElement(AsssesmentType));
		Assesment.selectByVisibleText("HR");
		Log.info("HR drop down type is selected");
		return Assesment;

	}

	public Select getCostcenter() throws InterruptedException {
		Thread.sleep(2000);
		Select Assesment = new Select(driver.findElement(Costcenter));
		Assesment.selectByVisibleText("JOINT");
		Log.info("Joint drop down type is selected");
		return Assesment;
	}

	public Select getDepartment() throws InterruptedException {
		Thread.sleep(2000);
		Select Assesment = new Select(driver.findElement(Department));
		Assesment.selectByVisibleText("Joint_ASD");
		Log.info("JOINT_ASD drop down type is selected");
		return Assesment;
	}

	public WebElement getsave() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(save).click();
		Log.info("save button is click");
		return null;
	}

	public void getdelete() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("scroll(0, 550)");

		driver.findElement(By.xpath("//td[contains(text(),'HR')]//following::td[4]//descendant::input[@text='Delete']"))
				.click();
		Log.info("Edit button is selected");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

	public void getHomebutton() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("scroll(250, 0)");
		driver.findElement(Homebutton).click();
		Log.info("Home button is selected");

	}

	/*
	 * public void getdelete() throws InterruptedException { Thread.sleep(2000);
	 * if(delete.equals(By.id("cphMain_gvExcludeFromSelectionMatrix_lbtnDelete_0")))
	 * { Thread.sleep(2000); driver.findElement(delete).click();
	 * 
	 * } }
	 */

	/*
	 * public void getacceptalertmessage() throws InterruptedException {
	 * Thread.sleep(2000); Alert alert = driver.switchTo().alert(); alert.accept();
	 * }
	 */

}
