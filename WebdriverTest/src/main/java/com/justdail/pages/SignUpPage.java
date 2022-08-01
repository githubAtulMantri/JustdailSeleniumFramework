package com.justdail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.justdail.base.TestBase;

public class SignUpPage extends TestBase {
	
	@FindBy(xpath= "//div[contains(@class,'logintitle')]")
	WebElement loginTitle;
	
	public SignUpPage() {	
		PageFactory.initElements(driver, this);	
	}
	
	public void ValidateLoginTitle() {
		loginTitle.isDisplayed();		
		
	}
	
	


}
