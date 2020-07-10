package com.tower.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tower.qa.base.TestBase;
import com.tower.qa.pages.Homepage;
import com.tower.qa.pages.Contactus;

public class ContactusTest extends TestBase {
	
	Homepage home;
	Contactus contact;
	
	public ContactusTest() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		initialization();
		home = new Homepage();
	}
	
	@Test(priority=6)
	 public void clickcontact()
	 {
	   home.Contact();
	   utility();
	   contact = new Contactus();
	   //Assert.assertEquals(driver.getTitle(), "Contact Us - Contact Information for Towergate Insurance");
	   //driver.navigate().back();
	   utility();
	  /* contact.selectitems();
	   driver.navigate().back();
	   contact.clickSeePage();*/
	
	 }
	
	@AfterTest
	public void closeApp()
	{
			 driver.close();
	}
	
		
}
