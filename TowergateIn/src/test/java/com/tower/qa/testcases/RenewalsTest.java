package com.tower.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tower.qa.base.TestBase;
import com.tower.qa.pages.Renewals;
import com.tower.qa.pages.Homepage;

public class RenewalsTest extends TestBase {
	
	Homepage home;
	Renewals renewal;
	
	public RenewalsTest() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		initialization();
		home = new Homepage();
	}
	
	
	@Test(priority=5)
	 public void clickrenewal()
	 {
	   home.Renewal();
	   utility();
	   renewal = new Renewals();
	   Assert.assertEquals(driver.getTitle(), "Renew My Insurance Policy | Towergate Insurance");
	   driver.navigate().back();
	 }
	
	@AfterTest
	public void closeApp()
	{
			 driver.close();
	}



}
