package com.tower.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.tower.qa.base.TestBase;
import com.tower.qa.pages.Articles;
import com.tower.qa.pages.Homepage;

public class ArticlesTest extends TestBase{
	
	Homepage home;
	Articles art;
	
	public ArticlesTest() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		initialization();
		home = new Homepage();
	}
	
	
	
	@Test(priority=2)
	 public void clickArticle()
	 {
	   home.Article();
	   utility();
	   art = new Articles();
	   Assert.assertEquals(driver.getTitle(), "Insurance Articles & Guides | Towergate");
	   driver.navigate().back();
	 }
	
	@AfterTest
	public void closeApp()
	{
			 driver.close();
	}


}
