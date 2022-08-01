package com.justdail.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.justdail.base.TestBase;

public class SelectFlightPage extends TestBase{
	
	@FindBy(xpath="//div[@id='ResultFlights']//div[@class='dtable']//div[1]/div[1]/div/input[@type='radio' and @name='fldtonrdio']")
	WebElement firstFlight;
	
	@FindBy(xpath="//div[@id='ResultFlights']//div[@class='dtable']/div[2]//div[@class='dblock flxbdrbtm  fltinfo'][1]/div/div[1]")
	WebElement secondFlight;
	
	@FindBy(xpath="//div[text()='Continue']")
	WebElement continueBtn;
	
	@FindBy(css="#insuranceOpt>label:nth-of-type(2)>span>span")
	WebElement noInsuranceRadioBtn;
	
	@FindBy(xpath="//div[contains(@class,'flgtsmrylft')]//div/button[text()='Continue Booking']")
	WebElement continueBooking;
	
	public SelectFlightPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public HomePage SelectRedioBtnAndContinue() {
		firstFlight.click();
		secondFlight.click();
		continueBtn.click();
		return new HomePage();
	}
	
	public void selectNoInsureanceRadioBtn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		noInsuranceRadioBtn.click();
		continueBooking.click();
	}

}
