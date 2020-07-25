package com.crm.qa.util;

import org.openqa.selenium.WebElement;

public class TestUtil 
{
		public static long PAGE_LOAD_TIMEOUT =20;
		public static long IMPLICIT_WAIT =40;
		
		public static void clickon(WebElement element)
		{
			element.click();
		}
	
}
