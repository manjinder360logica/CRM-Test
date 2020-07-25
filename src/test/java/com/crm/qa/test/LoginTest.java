package com.crm.qa.test;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseTest;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginTest extends BaseTest
	{
	
	LoginPage loginPage;
		public LoginTest() throws IOException 
	{
			super();
	}
		@BeforeMethod
		public void setup() throws IOException
		{
			Initlization();
			loginPage=new LoginPage();
					
		}
		
		@Test
		public void getPageTitle()
		{
			String title=loginPage.getPageTitle();
			System.out.println("Page title is" +title);
			System.out.println("Verify page tilte" +driver.getTitle());
			//Assert.assertEquals(title, "Cogmento CRM");
		}
		
		/*@Test
		public void validateLogin()
		{
			loginPage.Login(prop.getProperty("Un"), prop.getProperty("pass"));
			String user=HomePage.getloggedUser();
			System.out.println("User Name is: " +user);
			//Assert.assertEquals(user, "Manjinder Kaur");
		}*/
		@Test
		//public void validateinvalidLogin()
		//{
			//String msg=loginPage.invalidLogin();
			
		//}
		@AfterMethod
		public void teardown()
		{
			driver.quit();
		}
		
		
}
