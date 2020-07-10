package com.tower.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tower.qa.base.TestBase;

public class Aboutus extends TestBase{
	
	public Aboutus(WebDriver driver)
	{
		TestBase.driver = driver;
	}

	@FindBy(xpath = "//a[@class='cpbi cpbi--hybrid landlord']")
	WebElement landlord;
	
	@FindBy(xpath = "//a[@class='cpbi cpbi--hybrid motorboat']")
	WebElement motorboat;
	
	@FindBy(xpath = "//a[@class='cpbi cpbi--hybrid touringcaravan']")
	WebElement tourcaravan;
	
	@FindBy(xpath = "//a[@class='cpbi cpbi--hybrid truck']")
	WebElement truck;
	
	@FindBy(xpath = "//a[@class='cpbi cpbi--hybrid publicliability']")
	WebElement publicliability;
	
	@FindBy(xpath = "//a[@class='cpbi cpbi--hybrid unoccupied']")
	WebElement unoccupied;
	
	public Aboutus() {
		PageFactory.initElements(driver, this);
	}
	
	public void productlink()
	{
		if(landlord.isDisplayed())
		{
			System.out.println("Element is visible");
			landlord.click();
			Assert.assertEquals(driver.getTitle(), "Landlord Insurance | Compare Quotes Online | Towergate");
		}else {
			System.out.println("Element is not visible");
		}
	}
	public void productlink1()
	{
		 if(motorboat.isDisplayed())
		{
			System.out.println("Element1 is visible");
			motorboat.click();
			Assert.assertEquals(driver.getTitle(), "Motor Boat Insurance | Speedboats & Motor Cruisers | Towergate");
		}else {
			System.out.println("Element1 is not visible");
		}
	}
	public void productlink2()
	{
		 if(tourcaravan.isDisplayed())
		{
			System.out.println("Element2 is visible");
			tourcaravan.click();
			Assert.assertEquals(driver.getTitle(), "Caravan Insurance | Quote & Buy Online | Towergate");
		}else {
			System.out.println("Element2 is not visible");
		}
	}
	public void productlink3()
	{
		if(truck.isDisplayed())
		{
			System.out.println("Element3 is visible");
			truck.click();
			Assert.assertEquals(driver.getTitle(), "Truck Insurance | HGV & Lorry Quotes For Hauliers | Towergate");
		}else {
			System.out.println("Element3 is not visible");
		}
	}
	public void productlink4()
	{
		if(publicliability.isDisplayed())
		{
			System.out.println("Element4 is visible");
			publicliability.click();
			Assert.assertEquals(driver.getTitle(), "Public Liability Insurance | PLI Insurance Quotes | Towergate");
		}else {
			System.out.println("Element4 is not visible");
		}
	}
	public void productlink5()
	{
		if(unoccupied.isDisplayed())
		{
			System.out.println("Element5 is visible");
			unoccupied.click();
			Assert.assertEquals(driver.getTitle(), "Unoccupied Property Insurance | Empty & Vacant Homes | Towergate");
		}else {
			System.out.println("Element5 is not visible");
		}
	}
	
}
