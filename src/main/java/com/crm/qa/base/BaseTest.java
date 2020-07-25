package com.crm.qa.base;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;


public class BaseTest 
{
		public static Properties prop;
		public static WebDriver driver;
		public BaseTest() throws IOException
		{
			try
			{
				Properties prop= new Properties();
				FileInputStream ip= new FileInputStream ("C:\\Users\\manjinderk\\workspace\\FreeCRM\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");	
				prop.load(ip);
			} 
			catch (FileNotFoundException  e) 
			{
				e.printStackTrace();
			}
			catch (IOException  e) 
			{
				e.printStackTrace();
			}
		}
		
			public void Initlization()
			{
				String BrowserName = prop.getProperty("Browser");
				System.out.println("Browser Name is: "+BrowserName);
				String URL = prop.getProperty("Url");
				if (BrowserName.equals("Chrome"))
				{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\manjinderk\\workspace\\FreeCRM\\Drivers\\chromedriver83.exe");		
				driver = new ChromeDriver();
		    	}
		        else if (BrowserName.equals("FF"))
		        {	
		        	System.setProperty("webdriver.gecko.driver","C:\\Users\\manjinderk\\workspace\\FreeCRM\\Drivers\\geckodriver.exe" );
		    	   	WebDriver driver = new FirefoxDriver();
		        }
				
				driver.get(URL);
				System.out.println("URL Name is: "+URL);
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		    }
	
}
