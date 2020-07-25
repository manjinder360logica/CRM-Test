package com.crm.qa.testdata;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseTest;
import com.crm.qa.pages.SignUpPage;

public class SignUpTest extends BaseTest
	{
	SignUpPage signuppage;
	
	public SignUpTest() throws IOException
	{
		super();
	}
	@BeforeMethod
	public void setup() throws IOException
	{
		//preliminarysetup();
		signuppage= new SignUpPage();
		
	}
	@Test
	public void verifypageTitle() 
	{
		String ActualPagTitle=signuppage.getPageTitle();
		assertEquals(ActualPagTitle, "Cogmento CRM", "First page title doesn't match");
	}
	
	@Test
	public void signup() 
	{
	signuppage.signup();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}