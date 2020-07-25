package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseTest;
import com.crm.qa.util.TestUtil;


public class SignUpPage extends BaseTest
{
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement signUpLinkbutton;
	
	public SignUpPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	public void signup()
	{
		TestUtil.clickon(signUpLinkbutton);
		//signUpLinkbutton.click();
	}
}
