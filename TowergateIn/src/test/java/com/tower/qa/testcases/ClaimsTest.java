package com.tower.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tower.qa.base.TestBase;
import com.tower.qa.pages.Claims;
import com.tower.qa.pages.Homepage;

public class ClaimsTest extends TestBase{
	
	Homepage home;
	Claims claim;
	
	public ClaimsTest() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		initialization();
		home = new Homepage();
	}
	
	
	@Test(priority=4)
	 public void clickclaim()
	 {
	   home.Claim();
	   utility();
	   claim = new Claims();
	   Assert.assertEquals(driver.getTitle(), "How to make a claim at Towergate Insurance");
	   driver.navigate().back();
	 }

	@AfterTest
	public void closeApp()
	{
			 driver.close();
	}
}
