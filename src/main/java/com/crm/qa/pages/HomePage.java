package com.crm.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseTest;

public class HomePage extends BaseTest
{
	@FindBy(xpath="//span[@class='user-display']")
	static
	WebElement userDisplay;
	
	@FindAll({@FindBy(xpath="//span[@class='item-text']")})
	List<WebElement> menuList;
	
	//Initialization of page object
	public HomePage()throws IOException
	{
		PageFactory.initElements(driver, this);
		
	}
	public static String getloggedUser() 
	{
		return userDisplay.getText();
	}

	public void getMenulist()
	{
		//int size=menulist.size
		for(int i=0;i<menuList.size(); i++)
		{
			System.out.println(menuList.get(i).getText());
		}
	}
	
}

