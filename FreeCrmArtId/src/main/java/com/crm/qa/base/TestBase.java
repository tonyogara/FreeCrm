package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.PageFactory;

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
			
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			
			/*
			WebDriver driver = new ChromeDriver();
			Actions actions = new Actions(driver);

			WebElement element = driver.findElement(By.id("elementId"));
			actions.moveToElement(element).click().build().perform();
			
			*/
			
			
		}
		else if(browserName.equals("firefox"))
		{		
			System.setProperty("webdriver.gecko.driver", "/Users/tony/Documents/Learning/FreeCrm/FreeCrmArtId/src/main/java/com/crm/qa/FirefoxDriver/geckodriver");

			FirefoxOptions options = new FirefoxOptions();
		    driver = new FirefoxDriver(options);
		}	
		else if(browserName.equals("safari"))
		{	
			System.setProperty("webdriver.Safari()", "/Library/Apple/System/Library/CoreServices/SafariSupport.bundle/Contents/MacOS/safaridriver/safaridriver");
		    
		    SafariOptions options = new SafariOptions();
	        driver = new SafariDriver(options);
			
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
					
	}
	

}
