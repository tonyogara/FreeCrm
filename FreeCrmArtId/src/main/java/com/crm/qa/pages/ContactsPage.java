package com.crm.qa.pages;

import org.openqa.selenium.By;

import com.crm.qa.base.*;

public class ContactsPage extends TestBase{

	public ContactsPage()
	{
		super(prop);
	}
	
	
	
	 public void createContact(String fname, String sname)
	 {
		 //Create button - this is working
		 driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
		 							  
		 //First name text box
		 driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(fname);
		 							 
		 //Last name text box
		 driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys(sname);

		 
		 //Save button
		 driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]")).click();
	 
	 }
	
	
}
