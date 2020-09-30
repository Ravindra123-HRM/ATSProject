package com.ats.qa.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.ats.qa.base.Listeners;
import com.ats.qa.base.Log;

public class OnlineTestMaster {

	public WebDriver driver;

	// private static Logger logger=Logger.getLogger(Log.class.getName());

	public OnlineTestMaster(WebDriver driver) throws Exception {

		this.driver = driver;
	}

	By Master = By.id("cphMain_Masters");

	By OnlineTestMaster = By.id("hlOnlineTmaster");

	By costcenter = By.id("cphMain_ddlCostCentre");

	By Department = By.id("cphMain_ddlDepartment");

	By TestName = By.id("cphMain_cblTestName_0");

	By save = By.id("cphMain_btnSave");

	By update = By.id("cphMain_btnUpdate");

	public By Homebutton = By.cssSelector("img[alt*='Home']");
	
	String[] testName= {"typingtestadmin","testmanual","Myself"};
    int j=0;
	public void getMaster() throws InterruptedException {
		Thread.sleep(2000);
		WebElement criteria = driver.findElement(Master);
		criteria.click();
		Log.info("Master module  is selected");

	}

	public void getCommunicationMaster() throws InterruptedException {

		driver.findElement(OnlineTestMaster).click();

		Log.info("Online Master is selected");

	}

	public Select getStage() throws InterruptedException {
		Thread.sleep(2000);
		Select dropdown = new Select(driver.findElement(costcenter));
		dropdown.selectByVisibleText("JOINT");
		Log.info("CostCenter is selected");
		return dropdown;

	}

	public Select getRecipent() throws InterruptedException {
		Thread.sleep(2000);
		Select dropdown = new Select(driver.findElement(Department));
		dropdown.selectByVisibleText("Joint_ASD");
		Log.info("Department drop down is selected");
		return dropdown;
	}


	public void getNotificationType(WebDriver driver, String[] testName) throws InterruptedException {
		Thread.sleep(2000);
		// driver.findElement(TestName).click();
		
	     
	     Thread.sleep(3000);

	     getNotificationType(driver,testName);
	    
		List<WebElement> checks=driver.findElements(By.xpath("//input[@type='checkbox']/following::label"));

		for(int i=0;i<checks.size();i++)
		{
			List itemsNeededList = Arrays.asList(testName);
			
			if(itemsNeededList.contains(testName))
			{
				j++;
				driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
				Log.info("TestName is click");
				if(j==testName.length)
				{
					
					break;
					
				}
				
			}
			
		}
		
	//	driver.findElement(By.xpath("//label[contains(text(),'typingtestadmin')]//preceding-sibling::input[@id='cphMain_cblTestName_0']")).click();
		
	}

	

	public void getSave() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(save).click();
		Log.info("save button is click");
	}

	public void getedit() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//td[contains(text(),'typingtestadmin')]//following::td[2]//descendant::input[@text='Edit']"))
				.click();

		Log.info("click on Edit button sucessfully");

	}

	public void getupdateTemplate() throws InterruptedException {
		
		

		driver.findElement(By.xpath("//label[contains(text(),'typingtestadmin')]//preceding-sibling::input[@id='cphMain_cblTestName_0']")).click();

		driver.findElement(By.xpath("//label[contains(text(),'testmanual')]//preceding-sibling::input[@id='cphMain_cblTestName_1']")).click();
		Log.info("Template is entered");

	}

	public void getUpdate() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(update).click();
		Log.info("Update button is selected");

	}

	public void getDelete() throws InterruptedException {

		driver.findElement(By.xpath("//td[contains(text(),'testmanual')]//following::td[3]//descendant::input[@text='Remove']")).click();
		Log.info("Delete button is selected");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Log.info("Yes is selected");
		// Thread.sleep(2000);
		// driver.switchTo().alert().accept();
		Log.info("OK  is selected");
	}

	public void getHomePage() throws InterruptedException {

		driver.findElement(Homebutton).click();
		Log.info("Home button is selected");

	}

	

}
