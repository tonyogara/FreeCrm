package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.crm.qa.utilities.TestUtil;


public class TestBase {
	//Global variables
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static String browserName;
	
	
	public TestBase(Properties prop){
		
		//Read my properties
		try {
			FileInputStream ip = new FileInputStream(
				"/Users/tony/Documents/Learning/FreeCrm/FreeCrmArtId"
							+ "/src/main/java/com/crm/qa/config/config.properties");
			
			
			prop.load(ip);
			browserName = prop.getProperty("browser");
			
		}catch (FileNotFoundException e){
				e.printStackTrace();
			} catch (IOException e){
				e.printStackTrace();
			}			
		}
	
	

	public static void initialization()
	{
			
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/tony/Documents/Learning/FreeCrm/FreeCrmArtId/src/main/java/com/crm/qa/chromedriver/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("safari"))
		{		
			driver = new SafariDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
					
	}
	

}
