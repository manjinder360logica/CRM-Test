package com.crm.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseTest;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomeTest extends BaseTest
{
	LoginPage loginpage;
	HomePage homepage;
	
	public HomeTest() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		Initlization();
		loginpage = new LoginPage();
		loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@Test
	public void showMenuList()
	{
		homepage.getMenulist();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
