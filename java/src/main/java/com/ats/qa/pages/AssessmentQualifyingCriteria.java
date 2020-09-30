package com.ats.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.ats.qa.base.Listeners;
import com.ats.qa.base.Log;

public class AssessmentQualifyingCriteria extends Listeners {
	public WebDriver driver;

	// private static Logger logger=Logger.getLogger(Log.class.getName());

	public AssessmentQualifyingCriteria(WebDriver driver) throws Exception {

		this.driver = driver;
	}

	public By Assesmentcriteria = By.id("cphMain_AssessmentQualifyCriteria");
	public By AssesmentType = By.id("cphMain_ddlAssessmentType");
	public By CostCentre = By.id("cphMain_ddlCostCentre");
	public By Department = By.id("cphMain_ddlDepartment");
	public By From = By.id("cphMain_tbFrom");
	public By To = By.id("cphMain_tbTo");
	public By Result = By.id("cphMain_ddlResult");
	public By save = By.id("cphMain_btnSave");
	public By edit = By.id("cphMain_gvAssessmentQualifyingCriteria_lbtnEdit_1");
	public By Update = By.id("cphMain_btnUpdate");
	// private By Delete =
	// By.id("cphMain_gvAssessmentQualifyingCriteria_lbtnelete_0");
	public By Homebutton = By.cssSelector("img[alt*='Home']");

	public void getAssesmentcriteria() throws InterruptedException {
		Thread.sleep(2000);
		WebElement criteria = driver.findElement(Assesmentcriteria);
		criteria.click();

		Log.info("Assesment criteria  is selected");

	}

	public Select getAssesmentType() throws InterruptedException {

		Select dropdown = new Select(driver.findElement(AssesmentType));
		dropdown.selectByVisibleText("VET");
		Log.info("Assesment type drop down is selected");

		return dropdown;
	}

	public Select getCostCentre() throws InterruptedException {
		Thread.sleep(2000);
		Select dropdown = new Select(driver.findElement(CostCentre));
		dropdown.selectByVisibleText("JOINT");
		Log.info("Joint cost center is selected");
		return dropdown;

	}

	public Select getDepartment() throws InterruptedException {
		Thread.sleep(2000);
		Select dropdown = new Select(driver.findElement(Department));
		dropdown.selectByVisibleText("Joint_Business HR");
		return dropdown;

	}

	public void getFrom() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(From).sendKeys("10");
		;
		Log.info("Assesment type drop down is selected");
	}

	public void getTo() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(To).sendKeys("20");
		;
		Log.info("20 value is selected");
	}

	public void getResult() throws InterruptedException {
		Thread.sleep(2000);
		Select dropdown = new Select(driver.findElement(Result));
		dropdown.selectByVisibleText("Ready");
		Log.info("Ready drop down is selected");

	}

	public void getSave() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(save).click();
		Log.info("click on save button sucessfully");
	}

	public void getedit() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("scroll(0, 550)");

		driver.findElement(By.xpath("//td[contains(text(),'VET')]//following::td[6]//descendant::input[@text='Edit']"))
				.click();
		Log.info("click on Edit button sucessfully");

	}

	public void getUpdate() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(To).clear();
		Log.info("Field is clear");

		driver.findElement(To).sendKeys("20");
		
		Log.info("20 value is entered");
		driver.findElement(Update).click();
		Log.info("Update button is selected");

	}

	public void getDelete() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("scroll(0, 250)");

		driver.findElement(
				By.xpath("//td[contains(text(),'VET')]//following::td[7]//descendant::input[@text='Delete']")).click();
		Log.info("Delete button is selected");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Log.info("Yes is selected");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Log.info("OK  is selected");
	}

	public void getHomePage() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("scroll(250, 0)");
		driver.findElement(Homebutton).click();
		Log.info("Home button is selected");

	}

}
