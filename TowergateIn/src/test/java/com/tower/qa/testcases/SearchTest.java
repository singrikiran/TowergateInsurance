package com.tower.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tower.qa.base.TestBase;
import com.tower.qa.pages.Homepage;
import com.tower.qa.pages.Search;

public class SearchTest extends TestBase{

	Homepage home;
	Search serch;
	
	public SearchTest() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		initialization();
		home = new Homepage();
	}

	
	@Test(priority=1)
	public void searchTest()
	{ 
		home = new Homepage();
		home.Search();
		utility();
		Assert.assertEquals(driver.getTitle(), "Search");
	}
	
	@AfterTest
	public void closeApp()
	{
			 driver.close();
	}

}
