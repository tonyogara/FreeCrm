package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest()
	{
	super(prop);

	}
	

	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		loginPage = new LoginPage();

	}

	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");

	}

	@Test(priority=2)
	public void crmImageTest()
	{
		boolean crmImageFlag = loginPage.validateCRMImage
		Assert.assertTrue(flag)

	}


	@Test(priority=3)
	public void loginTest()
	{
		homePage = loginPage.login(prop.getProperty("uesername"),prop.getProperty("password"));


	}


	@AfterMethod
	 public void tearDown()
	 {
		driver.quit();
	 }







	/*
	Given I launch the website
	When I enter my login
	And I enter my password
	And I select the  login button
	Then the Hole page is displayed
	*/
	
	
	
	
	
	
}
