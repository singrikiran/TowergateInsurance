package com.tower.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tower.qa.base.TestBase;
import com.tower.qa.pages.Aboutus;

import com.tower.qa.pages.Homepage;

public class AboutusTest extends TestBase {

	Homepage home;
	Aboutus abt;
	
	public AboutusTest() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		initialization();
		home = new Homepage();
	}
	
	
	@Test(priority=3)
	 public void clickAbout()
	 {
	   home.About();
	   utility();
	   abt = new Aboutus();
	   Assert.assertEquals(driver.getTitle(), "About Us - Towergate Insurance");
	   abt.productlink();
	   driver.navigate().back();
	   abt.productlink1();
	   driver.navigate().back();
	   abt.productlink2();
	   driver.navigate().back();
	   abt.productlink3();
	   driver.navigate().back();
	   abt.productlink4();
	   driver.navigate().back();
	   abt.productlink5();
	   driver.navigate().back();
	   driver.navigate().back();
	 }
	
	@AfterTest
	public void closeApp()
	{
			 driver.close();
	}

}
