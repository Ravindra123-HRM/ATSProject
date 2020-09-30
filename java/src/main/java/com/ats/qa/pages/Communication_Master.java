package com.ats.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.ats.qa.base.Listeners;
import com.ats.qa.base.Log;

public class Communication_Master {

	public WebDriver driver;

	// private static Logger logger=Logger.getLogger(Log.class.getName());

	public Communication_Master(WebDriver driver) throws Exception {

		this.driver = driver;
	}

	By Master = By.id("cphMain_Masters");

	By Communicationmaster = By.id("hlCommumaster");

	By Advisor = By.id("cphMain_rbAdvisor");

	By stage = By.id("cphMain_ddlStage");

	By Reipent = By.id("cphMain_ddlRecipient");

	By Location = By.id("cphMain_ddlLocation");

	By starttime = By.id("cphMain_txtStartTime");

	By EndTime = By.id("cphMain_txtEndTime");

	By NotificationType = By.id("cphMain_chkNotificationType_0");

	By Template = By.id("cphMain_tbTemplate");

	By save = By.id("cphMain_lbtnSave");

	By update = By.id("cphMain_btnUpdate");

	public By Homebutton = By.cssSelector("img[alt*='Home']");

	public void getMaster() throws InterruptedException {
		Thread.sleep(2000);
		WebElement criteria = driver.findElement(Master);
		criteria.click();
		Log.info("Master module  is selected");

	}

	public void getCommunicationMaster() throws InterruptedException {

		driver.findElement(Communicationmaster).click();

		Log.info("Communication Master is selected");

	}

	public void getAdvisor() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(Advisor).click();

		Log.info("Advisor radio button is selected");

	}

	public Select getStage() throws InterruptedException {
		Thread.sleep(2000);
		Select dropdown = new Select(driver.findElement(stage));
		dropdown.selectByVisibleText("Registration");
		return dropdown;

	}

	public Select getRecipent() throws InterruptedException {
		Thread.sleep(2000);
		Select dropdown = new Select(driver.findElement(Reipent));
		dropdown.selectByVisibleText("Candidate");
		Log.info("Recipent drop down is selected");
		return dropdown;
	}

	public void getLocation() throws InterruptedException {
		Thread.sleep(2000);
		Select dropdown = new Select(driver.findElement(Location));
		dropdown.selectByVisibleText("MUMBAI (UTC+05:30)");
		Log.info("Location drop down is selected");

	}

	public void getStartTime() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(starttime).sendKeys(Keys.ARROW_LEFT);
		driver.findElement(starttime).sendKeys("3");
		driver.findElement(starttime).sendKeys(Keys.TAB);
		Log.info("Satrt time is entered");

	}

	public void getEndTime() throws InterruptedException {
		Thread.sleep(2000);
		// driver.findElement(EndTime).sendKeys(Keys.ARROW_LEFT);
		driver.findElement(EndTime).sendKeys("4");

		Log.info("EndTime is entered");

	}

	public void getNotificationType() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(NotificationType).click();

		Log.info("Notification Type is click");
	}

	public void getTemplate() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(Template).sendKeys("ASD123");

		Log.info("Template is entered");

	}

	public void getSave() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(save).click();
		Log.info("save button is click");
	}

	public void getedit() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//td[contains(text(),'ASD123')]//following::td[6]//descendant::input[@text='Edit']")).click();
		Log.info("click on Edit button sucessfully");

	}

	public void getupdateTemplate() throws InterruptedException {

		driver.findElement(Template).clear();
		Thread.sleep(2000);
		driver.findElement(Template).sendKeys("ASDTesting");

		Log.info("Template is entered");

	}

	public void getUpdate() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(update).click();
		Log.info("Update button is selected");

	}

	public void getDelete() throws InterruptedException {

		driver.findElement(By.xpath("//td[contains(text(),'ASDTesting')]//following::td[7]//descendant::input[@text='Delete']")).click();
		Log.info("Delete button is selected");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Log.info("Yes is selected");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Log.info("OK  is selected");
	}

	public void getHomePage() throws InterruptedException {

		driver.findElement(Homebutton).click();
		Log.info("Home button is selected");

	}

}
