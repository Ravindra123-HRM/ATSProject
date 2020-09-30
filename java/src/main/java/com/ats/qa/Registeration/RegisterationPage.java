package com.ats.qa.Registeration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ats.qa.base.Log;
import com.ats.qa.base.TestBase;

public class RegisterationPage extends TestBase {

	

	public RegisterationPage(WebDriver driver)
	{
		super();
	   PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cphMain_WalkEntry")
	WebElement usermangement;
	
	@FindBy(id="cphMain_lbtnWalkInEntry")
	WebElement newwalkinid;
	
	@FindBy(id="cphMain_ddlLocation")
	WebElement Location;
	
	@FindBy(id="cphMain_ddlGender")
	WebElement Gender;
	
	@FindBy(id="cphMain_ddlTitle")
	WebElement Title;
	
	@FindBy(id="cphMain_txtFname")
	WebElement FirstName;
	
	@FindBy(id="cphMain_txtLname")
	WebElement Lastname;
	
	@FindBy(className="ajax__calendar_day")
	WebElement calender;
	
	@FindBy(id="cphMain_txtMobNo")
	WebElement mobileNo;
	
	@FindBy(id="cphMain_ddlSourceCateg")
	WebElement sourcecategory;
	
	@FindBy(name="ctl00$cphMain$ddlSourceDetail")
	WebElement sourcedetail;
	
	@FindBy(id="cphMain_txtPan")
	WebElement pan;
	
	@FindBy(id="cphMain_txtAdhar")
	WebElement Aadhar;
	
	@FindBy(id="cphMain_ddlImpactSourceCateg")
	WebElement Impactsource;
	
	@FindBy(id="cphMain_lbtnSave")
	WebElement submitbutton;
		
	@FindBy(xpath="//input[@id='cphMain_imgCal']")
	WebElement clickcalender;
	@FindBy(id="cphMain_ddlPopDupChk")
	WebElement clickonduplicatecheck;
	@FindBy(id="cphMain_ddlRegistrationStatus")
	WebElement clickonRegisterationstatus;
	
	
	public void clickonRegister() throws InterruptedException
	{
		
		Thread.sleep(2000);
		usermangement.click();
		Log.info("usermangement module is click");
		
	}
	
	public void clickonNewwalkinEntry() throws InterruptedException
	{
		
		Thread.sleep(2000);
		newwalkinid.click();
		Log.info("New WalkinId Module is click");
	}
	
	public void clickonLocation() throws InterruptedException
	{
		
	Select location=new Select(Location);
	location.selectByVisibleText("MUMBAI");
	
	Log.info("Location is selected");
	Thread.sleep(2000);
	Select gender=new Select(Gender);
	gender.selectByVisibleText("Male");
	Log.info("Gender is selected");
	Thread.sleep(2000);
	Select title=new Select(Title);
	title.selectByVisibleText("MR.");
	Log.info("Title is selected");
		
	}
	
	public void clickonName() throws InterruptedException 
	{
		FirstName.sendKeys("Ravindra");
		Log.info("FirstName value is inserted");
	
		Lastname.sendKeys("Chavan");
		Log.info("LastName value is inserted");
		

		
	}
	
	public void clickonCalender() throws InterruptedException
	{
		
         
         clickcalender.click();
		
		Log.info("calender is click");
	
		List<WebElement> Calender= driver.findElements(By.xpath("//tbody//div[@class='ajax__calendar_day']"));
		for(WebElement cal:Calender)
		{
			String name=cal.getText();
			if(name.equalsIgnoreCase("9"))
			{
				cal.click();
				Log.info("Date is selected");
				break;
				
			}
			
		}
		
	}
	
	public void clickonMobileno()
	{
		mobileNo.sendKeys("8983527790");
		Log.info("Mobile No is selected");
	}
	
	public void clickonCategory()
	{
		Select category=new Select(sourcecategory);
		category.selectByVisibleText("Agency");
		Log.info("sourcecategory is selected");
	}
	
	public void clickonDetails() throws InterruptedException
	{
		Thread.sleep(2000);
		Select detail=new Select(sourcedetail);
		detail.selectByVisibleText("Aura International");
		Log.info("sourcedetail is selected");
	}
	
	public void clickonPan() throws InterruptedException
	{
		Thread.sleep(2000);
		pan.sendKeys("ASDCV2145K");
		Log.info("PAN_Number is selected");
	}
	
	public void clickOnAdharcard() throws InterruptedException
	{
		Thread.sleep(2000);
		Aadhar.sendKeys("634643643636");
		Log.info("AardharCard_Number is selected");
	}
	
	public void clickonImpactsource()
	{
		Select Imapct=new Select(Impactsource);
		Imapct.selectByVisibleText("Yellow Ration card holder");
		Log.info("Impact source is selected");
		
	}
	

	public void clickonsubmit() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		submitbutton.click();
		Log.info("Click on submit button");
	}
	
	public void clickonduplicatecheck() throws InterruptedException
	{
		
		Select duplicate=new Select(clickonduplicatecheck);
		duplicate.selectByVisibleText("Duplicate Check - Pass");
		Log.info("Duplicate drop down is selected");
	}
	
	public void clickonRegisterationstatus() throws InterruptedException
	{
		Thread.sleep(2000);
		Select duplicate=new Select(clickonRegisterationstatus);
		duplicate.selectByVisibleText("Registered");
		Log.info("Registeration status drop down is selected");
	}
	
	public void clickonsavebutton() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("cphMain_lbtnCancel")).click();
		Log.info("Save button is click");
	}
	
}
