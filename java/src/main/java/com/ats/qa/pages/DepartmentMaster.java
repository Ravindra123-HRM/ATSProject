package com.ats.qa.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.ats.qa.base.Log;
import com.ats.qa.base.TestBase;

public class DepartmentMaster extends TestBase {
	public WebDriver driver;

	public DepartmentMaster(WebDriver driver) throws Exception {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	By Master = By.id("cphMain_Masters");

	By Departmentmaster = By.id("UnMappedMappings");

	By Document = By.id("cphMain_ddlCostCenter");

	By Departmentmapping = By.id("cphMain_lbDepartmentMapping");

	By update = By.id("cphMain_lbtnUpdate");

	public void clickonMaster() {
		driver.findElement(Master).click();
		Log.info("click on Master Module");
	}

	public void clickOnDepartment() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(Departmentmaster).click();
		Log.info("Click on department Master");
	}

	public void clickoncategory() throws InterruptedException {

		Select category = new Select(driver.findElement(Document));

		category.selectByVisibleText("JOINT");
		Log.info("Joint cost center is selected");
		WebElement departmentskillset = driver.findElement(By.id("cphMain_txtDeptSkillSet"));
		departmentskillset.sendKeys("ASD Department");
		Log.info("ASD Department skill set selected");
		WebElement description = driver.findElement(By.id("cphMain_txtDescription"));
		description.sendKeys("Test123");
		Log.info("Test123 input is inserted");
		driver.findElement(By.id("cphMain_chkActiveShow")).click();
		Log.info("Active button is selected");
		driver.findElement(By.xpath("//a[@id='cphMain_lbtnSave']")).click();

		Thread.sleep(2000);
		Log.info("save button is click");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0, 850)");
		driver.findElement(By.xpath("//td[contains(text(),'test123')]//following::td[3]//descendant::input[@text='Edit']")).click();
		Thread.sleep(2000);
		Log.info("Edit button is selected");
		WebElement Department = driver.findElement(By.id("cphMain_txtDeptSkillSet"));
		Department.clear();
		Log.info("Department field is clear");
		Department.sendKeys("test123");
		Log.info("Test 123 value is inserted");
		Thread.sleep(2000);
		WebElement senddocument = driver.findElement(By.id("cphMain_txtDescription"));
		senddocument.clear();
		Log.info("value is clear");
		senddocument.sendKeys("test");
		Log.info("test text is inserted in description");
		driver.findElement(update).click();
		Log.info("Update button is selected");

	}

	public void clickonDepartmentMapping() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(Departmentmapping).click();
		Log.info("Department mapping is click");

	}

	public void selectDepartment() throws InterruptedException {
		Thread.sleep(2000);
		Select ddlcostcenter = new Select(driver.findElement(By.id("cphMain_ddlCostCenter")));
		ddlcostcenter.selectByVisibleText("UK-India");
		Log.info("UK India cost center is selected");
		Thread.sleep(2000);
		Select Mapped = new Select(driver.findElement(By.id("cphMain_ddlMappUnmapp")));
		Mapped.selectByVisibleText("Mapped");
		Log.info("Mapped value is selected");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0, 550)");
		Thread.sleep(2000);
		driver.findElement(By.id("cphMain_lbtnShowReport")).click();
		Log.info("show report button is selected");
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("scroll(0, 350)");
		Thread.sleep(2000);
		driver.findElement(By.id("cphMain_gvShowReport_chkRow_0")).click();
		Log.info("check box is selected");

		Thread.sleep(2000);
		driver.findElement(By.id("cphMain_lbtnMappSelect")).click();
		Log.info("Mapped button is selected");
		Thread.sleep(2000);
		Select departmentskillset = new Select(driver.findElement(By.id("cphMain_ddlPopDepartment")));
		departmentskillset.selectByVisibleText("UK_2nd Line Network Team");
		Log.info("UK_2nd Line Network Team drop down value is selected");
		Thread.sleep(2000);
		driver.findElement(By.id("cphMain_btnSave")).click();
		Log.info("save button is selected");

	}
}
