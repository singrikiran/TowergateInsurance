package com.tower.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.tower.qa.base.TestBase;
import com.tower.qa.pages.Homepage;

public class HomeTest extends TestBase{
	
	 Homepage home;

	public HomeTest() {
		super();
	}
	@BeforeTest
	public void setup() {
		initialization();
		home = new Homepage();
	}
	
	@Test
	public void verifyHomepagetitletest()
	{
		String Homepagetitle = home.verifyHomepageTitle();
		Assert.assertEquals(home.verifyHomepageTitle(), "Specialist Personal & Business Insurance | Towergate Insurance");
	}
	
	/*@Test
	public void clickAbout()
	{
		     
			 home.About();
			 utility();
             driver.navigate().back();
	}
	@Test
	 public void clickArticle()
	 {
	   home.Article();
	   utility();
	   driver.navigate().back();
	 }
	
	@Test
	public void clickclaim()
	{
	        
	         home.Claim();
	         utility();
			 driver.navigate().back();
	}
	@Test
	public void clickrenewal()
	{
			 
			 home.Renewal();
			 utility();
			 driver.navigate().back();
	}
	@Test
	public void clickcontact()
	{
			 
			 home.Contact();
			 utility();
			 driver.navigate().back();
	}*/
	

	
	@AfterTest
	public void closeApp()
	{
			 driver.close();
	}

}
