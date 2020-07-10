package com.tower.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tower.qa.base.TestBase;

public class Contactus extends TestBase {
	
	public Contactus(WebDriver driver)
	{
		TestBase.driver = driver;
	}

	public WebDriverWait wait;
	@FindBy(xpath = "//select[@id='ContentPlaceHolderDefault_content_Contact_10_ddlProductSearchType']")
	WebElement productsearchtype;
	
	@FindBy(xpath = "//select[@id='ContentPlaceHolderDefault_content_Contact_10_ddlProduct']")
	WebElement product;
	
	/*try
	{
		WebElement ProductSpecific = driver.findElement(By.xpath("//select[@id='ContentPlaceHolderDefault_content_Contact_10_ddlProductSpecific']"));
	}
	catch(org.openqa.selenium.StaleElementReferenceException ex)
	{
		WebElement ProductSpecific = driver.findElement(By.xpath("//select[@id='ContentPlaceHolderDefault_content_Contact_10_ddlProductSpecific']"));
	}*/
		
	
	@FindBy(xpath = "//select[@id='ContentPlaceHolderDefault_content_Contact_10_ddlProductSpecific']")
	WebElement ProductSpecific;
	
	
	
	@FindBy(xpath = "//select[@id='ContentPlaceHolderDefault_content_Contact_10_contactSubmit']")
	WebElement showresults;
	
	@FindBy(linkText = "see this page")
	WebElement seepage;
	
	public Select drop;
	public Select drop1;
	public Select drop2;
	
	
	
	
	
	public Contactus() {
		PageFactory.initElements(driver, this);
		drop = new Select(productsearchtype);
		drop1 = new Select(product);
		
			drop2 = new Select(ProductSpecific);
			
		
		
	}
	
	public void selectitems()
	{
		
			drop.selectByIndex(1);
		
		
			drop1.selectByVisibleText("Liability Insurance");
		
			
				
				drop2.selectByValue("Business Indemnity Insurance");
				
			
			
		
			
		
		    showresults.click();
	}
	
	public Contactus clickSeePage()
	{
		seepage.click();
		return new Contactus();
	}
	
}

