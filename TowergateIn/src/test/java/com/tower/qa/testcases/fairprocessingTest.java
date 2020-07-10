package com.tower.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tower.qa.base.TestBase;
import com.tower.qa.pages.Fairprocessing;
import com.tower.qa.pages.Homepage;

public class fairprocessingTest extends TestBase{
	
	Homepage home;
	Fairprocessing fpn;
	
	
	public fairprocessingTest() {
		super();
	}
    
	@BeforeTest
	public void setup() {
		initialization();
		home = new Homepage();
	}
	
	@Test(priority=4)
	 public void clickfpn()
	 {
	   home.fairProcessing();
	   utility();
	   fpn = new Fairprocessing();
	   Assert.assertEquals(driver.getTitle(), "Fair Processing Notice");
	 }
	
	@AfterTest
	public void closeApp()
	{
			 driver.close();
	}

}
