package com.ats.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.ats.qa.base.Log;
import com.ats.qa.base.TestBase;

public class DocumentMaster  {
	WebDriver driver;

	public DocumentMaster(WebDriver driver) throws Exception {
		this.driver=driver; 
		// TODO Auto-generated constructor stub
	}
	
	By Master=By.id("cphMain_Masters");
	
	By Documentmaster=By.xpath("//a[@id='hlDocumentType']");
	
	By Document=By.id("cphMain_ddlCategoryType");
	
	By categorymaster=By.id("cphMain_btnCategoryMaster");
	
	By documentcategory=By.id("cphMain_tbDcumentCategory");
	
	By update=By.id("cphMain_btnUpdate");
	
	public void clickonMaster() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(Master).click();
		 Log.info("click on master");
	}
	
	public void clickOnDocumentMaster() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(Documentmaster).click();
		 Log.info("click on DocumentMaster");
	}
	
	public void clickoncategory() throws InterruptedException
	{
		
	Select category=new Select(driver.findElement(Document));
	category.selectByVisibleText("Declaration");
	 Log.info("Declaration is selected");
	WebElement document=	driver.findElement(By.id("cphMain_tbDcumentType"));
	document.sendKeys("document");
	 Log.info("document is inseted in to fields");
	driver.findElement(By.id("cphMain_btnSave")).click();
	 Log.info("click on save button");
			  Thread.sleep(2000);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("scroll(0, 250)");
	 driver.findElement(By.xpath("//td[contains(text(),'document')]//following::td[3]//descendant::input[@text='Edit']")).click();
	 Log.info("click on edit button");
   
	Thread.sleep(2000);
    Select updatecategory=new Select(driver.findElement(Document));
	updatecategory.selectByVisibleText("Test123");
	 Log.info("Test123 is inserted sucessfully");
	WebElement senddocument=driver.findElement(By.id("cphMain_tbDcumentType"));
	senddocument.clear();
	senddocument.sendKeys("test");
	 Log.info("Test is inserted sucessfully");
	driver.findElement(update).click();
	 Log.info("click on update button");
	
	}
	
	
	public void clickOncategoryMaster() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(categorymaster).click();	
		 Log.info("click on category master");
	
	}
	
	public void clickOnDocumentcategory() throws InterruptedException
	{
		
	WebElement category=driver.findElement(documentcategory);
	category.sendKeys("caste certificate");
	 Log.info("caste certificate is inserted sucessfullyr");
	driver.findElement(By.id("cphMain_btnSave")).click();
	 Thread.sleep(2000);
	 Log.info("click on save button");
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("scroll(0, 250)");
	WebElement edit= driver.findElement(By.xpath("//td[contains(text(),'caste certificate')]//following::td[3]//descendant::input[@text='Edit']"));
	edit.click();
	 Log.info("click on edit button");
	Thread.sleep(2000);
	WebElement sendcategory=driver.findElement(documentcategory);
	sendcategory.clear();
	sendcategory.sendKeys("Noncriminal Certificate");
	 Log.info("Non criminal certificate is inserted ");
	driver.findElement(By.id("cphMain_btnUpdate")).click();
	 Log.info("update button is selected");
	
		}

}
