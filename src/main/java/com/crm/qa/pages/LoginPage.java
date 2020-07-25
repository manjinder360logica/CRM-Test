package com.crm.qa.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.BaseTest;

	public class LoginPage extends BaseTest
	{ 
		public LoginPage() throws IOException {
			super();
			
		}
		//Object Repository = OR
		@FindBy(xpath="//input[@name='username']")
		WebElement username;
		
	    @FindBy(xpath="//input[@name='password']")
		WebElement password;
	    
	    @FindBy(xpath="//input[@class='btn btn-small']")
		WebElement LoginButton;

	 //Initialization the page objects
		public void LoginPage()
		{
			PageFactory.initElements(driver, this);
			
		}
				//Actions: Method/Features
		public String getPageTitle()
		{
			return driver.getTitle();
		}
		public void Login(String Un, String pass)
		{
			username.sendKeys(Un);
			password.sendKeys(pass);
			LoginButton.click();
		}
		public String invalidLogin() {
			// TODO Auto-generated method stub
			return null;
		}
} 