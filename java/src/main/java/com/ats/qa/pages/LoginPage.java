package com.ats.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ats.qa.base.Log;
import com.ats.qa.base.TestBase;




public class LoginPage extends TestBase {

	public LoginPage() throws Exception {
		super();
		PageFactory.initElements(driver, this);
		// driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="ddlCostCentres")
	WebElement costcenter;
	
	@FindBy(id="tbLoginId")
	WebElement username;
	
	@FindBy(id="tbPassword")
	WebElement password;
	
	@FindBy(id="ibLogin")
	WebElement Login;
	
	
	public void costcenter() { 

		Select costcenter1 = new Select(costcenter);
		costcenter1.selectByVisibleText("JOINT");
		Log.info("JOINT cost center drop down is click");
	
	}
	
	public void Login(String un,String Pwd) throws Exception
	{
		username.sendKeys(un);
		Log.info("User name is entered");
		password.sendKeys(Pwd);
		Log.info("Password is entered");
		Login.click();
		Log.info("Login button is click");
	}

}
