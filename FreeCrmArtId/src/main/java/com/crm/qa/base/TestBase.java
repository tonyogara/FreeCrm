package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.utilities.TestUtil;

public class TestBase {
	//Global variables
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase(Properties prop){
		
		//Read my properties
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("/Users/tony/Documents/Learning/FreeCrm/FreeCrmArtId"
							+ "/src/main/java/com/crm/qa/config.properties"));
			prop.load(ip);
		}catch (FileNotFoundException e){
				e.printStackTrace();
			} catch (IOException e){
				e.printStackTrace();
			}			
		}
	
	


	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.getProperty("webdriver.chrome.driver", "location where the chromedriver is saved to");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.getProperty("webdriver.gecko.driver", "location where the chromedriver is saved to");
			driver = new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
		
				
	}
	

}
