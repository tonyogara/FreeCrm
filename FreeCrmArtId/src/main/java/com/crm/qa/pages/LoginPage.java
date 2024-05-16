package com.crm.qa.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase
{
	
	
	

	//Page Factory - OR
	//@FindBy(name="email")
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement emaiLogin;
	
	
	
	//@FindBy(name="password")
	@FindBy(xpath ="//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement passwordLogin;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]")
	WebElement loginBtn;
	
	
	
	@FindBy(xpath ="//header/div[1]/nav[1]/div[2]/div[1]/div[2]/ul[1]/a[1]")
	WebElement firstLoginBtn;
	
	/**
	/html[1]/body[1]/iframe[2]
	**/
	
	
			
	@FindBy(xpath="//body/iframe[2]")		
	WebElement cookiesIframe;
	
	/**
	Full xPath
	/html/body/div[3]//dialog
	**/
	
	@FindBy(xpath="/html/body/div[3]//dialog")		
	WebElement cookiesModal;
	
	
	
	
	//@FindBy(id="cf_consent-buttons__accept-all")
	//WebElement acceptAllBtn;
	
	
	
	//Initializing the Page Object
	public LoginPage() 
	{
		super(prop);
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	
	@SuppressWarnings("deprecation")
	public HomePage login(String lgn,String pwd)
	{	
		
		
		//cf_button cf_button--accept
		//<div class="cf_modal_container"></div>
		
		/** this works
		WebElement modalBox = driver.findElement(By.xpath("//div[@class='cf_modal_container']"));
		System.out.println(modalBox.getText());
		**/
		
		//driver.findElement(By.xpath("//div[@class='cf_modal_container']//button[contains(@class,'cf_button cf_button--accept')]")).click();
		
		////button[text()='Some text']
		
		//WebElement acceptBtn = driver.findElement(By.xpath("//button[@class='cf_button cf_button--accept']"));
		//WebElement acceptBtn = driver.findElement(By.xpath("//button[text()='Accept All']"));
		//System.out.println(acceptBtn.getText());
		
		
		// Commented 16/05 - WebElement acceptBtn = driver.findElement(By.xpath("//*[@id='cf_consent-buttons__accept-all']"));
		//  WebElement acceptBtn = driver.findElement(By.xpath("//*[@id="cf_consent-buttons__accept-all"]"));
		//System.out.println(acceptBtn.getText());
		
		
		/**
		<button class="cf_button cf_button--accept" id="cf_consent-buttons__accept-all">
	      Accept All
	    </button>
		**/
		
		
		//WebElement acceptBtn = driver.findElement(By.id("cf_consent-buttons__accept-all"));
		//System.out.println(acceptBtn.getText());
		
		//*[@id="cf_consent-buttons__accept-all"]
		
		
		//*[@id="cf_consent-buttons__accept-all"]
		//*[@id="cf_consent-buttons__accept-all"]
		
		// /html/body/div[3]//dialog/div[4]/button[1]
		
		/**
		<button class="cf_button cf_button--accept" id="cf_consent-buttons__accept-all">
	      Accept All
	    </button>
		**/
		
		
		
		//button[text()='Some text']
		
		
		//WebElement acceptBtn = driver.findElement(By.xpath("//*[@id=\"cf_consent-buttons__accept-all\"]"));
		//System.out.println(acceptBtn.getText());
		
		
		//*[@id="cf_consent-buttons__accept-all"]
		
		
		//driver.findElement(By.xpath("//div[@class='modal-footer']//button[contains(@class,'btn-default')]")).click();
		
		//cf_consent-buttons__accept-all
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/iframe[2]")));
		
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]")));

		
		//System.out.println(acceptAllBtn.getText());
		
		//acceptAllBtn.click();
		
		
		
		/**
		//Useful stack overflow info on wait
		//https://stackoverflow.com/questions/12858972/how-can-i-ask-the-selenium-webdriver-to-wait-for-few-seconds-in-java
		
		String parent = driver.getWindowHandle();
		System.out.println("Window handle is : " + parent);
		
		// Wait 10 seconds
		driver.manage().timeouts().wait().;
		
		Set < String > s = driver.getWindowHandles();

	    // Now iterate using Iterator
	    Iterator < String > I1 = s.iterator();

	    while (I1.hasNext()) {

	      String child_window = I1.next();

	      if (!parent.equals(child_window)) {
	        driver.switchTo().window(child_window);

	        System.out.println(driver.switchTo().window(child_window).getTitle());

	        //driver.close();
	      }

	    }
	    **/
		
		
		
		firstLoginBtn.click();
		emaiLogin.sendKeys(lgn);
		passwordLogin.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	
		
	
}
