package com.ats.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.ats.qa.base.Log;
import com.ats.qa.base.TestBase;

public class DNDUploadModule {
	public WebDriver driver;

	public DNDUploadModule(WebDriver driver) throws Exception {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	By DNDmobile = By.id("cphMain_DNDMobile");
	By DNDShowRadio = By.id("cphMain_rbDNDShow");
	By DNDMobilenuumberText = By.id("cphMain_tbMobileNumber");
	By save = By.id("cphMain_lbtnSave");
	// By delete = By.id("cphMain_gvGetDNDMobileNo_lbtnDelete_0");
	By Homebutton = By.cssSelector("img[alt*='Home']");

	public void getDNDmobile() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(DNDmobile).click();
		Log.info("click on DND mobile  module");
		return;

	}

	public void getDNDShowRadio() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(DNDShowRadio).click();
		Log.info("click on DNDShowRadio button");
	}

	public void getDNDMobilenuumberText() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(DNDMobilenuumberText).sendKeys("8983527790");
		Log.info("Mobile number inserted sucessfully");
	}

	public void getsave() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(save).click();
		Log.info("save button is click");

	}

	public void getdelete() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.id("cphMain_lbShow")).click();
		Log.info("click on show button");
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("scroll(0, 250)");
		driver.findElement(By.xpath("//td[contains(text(),'8983527790')]//following::td[1]//descendant::input[@text='Remove']")).click();
		Log.info("click on edit button");
	}

	public void getHomebutton() throws InterruptedException {

		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("scroll(250, 0)");
		driver.findElement(Homebutton).click();
		Log.info("click on Home button");

	}
}
