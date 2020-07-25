package com.crm.qa.testdata;

public class HomeTest {
	
	
	public String getloggeduser()
	{
		return userDisplay.getText();
	}
	public void getMenulist()
	{
		for(int i=0; i<menuList.size(); i++)
		{
			System.out.println(menuList.get(i).getText());
		}
	}
	public void clickmenuitem(String menuname)
	{
		for(int i=0; i<menuList.size();i++)
		{
			System.out.println(menuList.get(i).getText());
			if(menuList.get(i).getText().contains(manuName))
			{
				menulist.get(i).click();
			}
			break;
		}
	
	}
}
