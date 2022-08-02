package com.justdail.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.justdail.base.TestBase;

public class FlightBookingPage extends TestBase {
	
	@FindBy(xpath="//span[text()='Return Journey']")
	WebElement returnTicket;
	
	@FindBy(xpath="//input[@placeholder='Type Departure City']")
	WebElement leaving;
	
	@FindBy(xpath="//input[@placeholder='Type Destination City']")
	WebElement going;
	
	@FindBy(xpath="//ul[contains(@class,'flgtagst')]/li")
	WebElement leavingSuggestion;
	
	@FindBy(xpath="//ul[contains(@class,'flgtagst')]/li")
	WebElement goingSuggestion;

	@FindAll(@FindBy(xpath="//div[@id='dvcalendar']//div[contains(@class,'days')]/following-sibling::div/ul/li/span[not(contains(@class,'old-dt'))]"))
	List<WebElement> deptDates;
	
	@FindAll(@FindBy(xpath="//div[@id='dvcalendar']//div[contains(@class,'days')]/following-sibling::div/ul/li/span[not(contains(@class,'old-dt'))]"))
	List<WebElement> returnDates;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement search;
	
	@FindAll(@FindBy(xpath="//div[contains(@class,'flgtacldr posRel')]"))
	List <WebElement> FlightCalendars;
	
	public FlightBookingPage() {
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyReturnTicketLink() {
		return returnTicket.isDisplayed();
	}
	
	public void verifyReturnTicketClick() {
		returnTicket.click();
	}
	
	public void enterValueOnLeavingAndGoing(String Leaving, String Going) {
		leaving.sendKeys(Leaving);
		leavingSuggestion.click();
		going.sendKeys(Going);
		goingSuggestion.click();
		
		FlightCalendars.get(0).click();
		//Here index value 2 means, It will skip 2 date then click on next date
		deptDates.get(2).click();
		
		FlightCalendars.get(1).click();
		//Here index value 2 means next date of return
		returnDates.get(1).click();
		search.click();	
		
	}

}














