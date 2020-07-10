package com.tower.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tower.qa.util.Testutil;

public class TestBase {
    
	public static WebDriver driver;
	
	public static Properties prop;
	
	public TestBase()
	{
		try
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\singri.kumar\\Automation\\TowergateIn\\src\\main\\java\\com\\tower\\qa\\config\\config.properties");
		    prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		String pathName = prop.getProperty("chromepath");
		if(browserName.equals("chrome"))
        {
	    System.setProperty("webdriver.chrome.driver", pathName);
	    driver = new ChromeDriver();
        }
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get(prop.getProperty("url"));
	}
	
	public static void utility()
	{
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
}
