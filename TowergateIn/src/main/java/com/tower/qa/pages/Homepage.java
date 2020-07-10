package com.tower.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tower.qa.base.TestBase;

public class Homepage extends TestBase {
	
	public Homepage(WebDriver driver)
	{
		TestBase.driver = driver;
	}
	WebDriverWait wait = new WebDriverWait(driver, 10);
	/*By art = By.linkText("Articles & Guides");
	By abo = By.linkText("About");
	By clai = By.linkText("Claims");
	By ren = By.linkText("Renewals");
	By con = By.linkText("Contact");
	//By ser = By.id("acSearchText");*/
	@FindBy(linkText = "Articles & Guides")
	WebElement article;
	@FindBy(linkText = "About")
	WebElement about;
	@FindBy(linkText = "Claims")
	WebElement claim;
	@FindBy(linkText = "Renewals")
	WebElement renewal;
	@FindBy(linkText = "Contact")
	WebElement contact;
	@FindBy(id = "acSearchText")
	WebElement serch;
	@FindBy(name = "submit")
	WebElement go; 
	//By go = By.name("submit");
	@FindBy(xpath="//a[@title='Fair Processing Notice']")
	WebElement fairprocessing;
	
	@FindBy(xpath="//a[contains(text(),'Cookies']")
	WebElement cookies;
	@FindBy(xpath="//div[@class='col5-5']//a[contains(text(),'Accessibility']")
	WebElement accessibility;
	@FindBy(xpath="//div[@class='col5-5']//a[contains(text(),'Legal']")
	WebElement legal;
	@FindBy(xpath="//div[@class='col5-5']//a[contains(text(),'Regulatory information']")
	WebElement regulatory_information;
	@FindBy(xpath="//div[@class='col5-5']//a[contains(text(),'Modern Slavery Act Statement']")
	WebElement modern_slavery;
	
	
	// Initializing the Page Objects:
		public Homepage() {
			PageFactory.initElements(driver, this);
		}
		
		
		public String verifyHomepageTitle()
		{
			return driver.getTitle();
		}

	public Articles Article()
	{
		article.click();
		return  new Articles();
		
	}
	public Aboutus About()
	{
		about.click();
		return  new Aboutus();
		
	}
	public Claims Claim()
	{
		claim.click();
		return  new Claims();
	}
	public Renewals Renewal()
	{
		renewal.click();
		return  new Renewals();
	}
	
	public void Contact()
	{
		contact.click();
		
	}
	
	public Homepage Search()
	{
		serch.sendKeys("car");
		go.click();
		return new Homepage();
		
	}
	
	public void fairProcessing()
	{
		fairprocessing.click();
		
		//wait.until(ExpectedConditions.elementToBeClickable(fairprocessing)).click();
		
		
	}
	
	
}
