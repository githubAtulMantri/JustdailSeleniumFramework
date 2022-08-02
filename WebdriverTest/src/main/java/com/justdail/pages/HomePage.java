package com.justdail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.justdail.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath= "//span[contains(text(),'Air Tickets ')]")
	WebElement airTicketsLink;
	
	public HomePage() {	
		PageFactory.initElements(driver, this);	
	}
	
	public void clickOnAirTicketslink() {
		initialization();
		airTicketsLink.isDisplayed();
		airTicketsLink.click();		
	}

}
