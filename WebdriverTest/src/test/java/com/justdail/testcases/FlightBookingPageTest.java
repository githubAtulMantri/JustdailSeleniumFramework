package com.justdail.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.justdail.base.TestBase;
import com.justdail.pages.FlightBookingPage;
import com.justdail.pages.HomePage;
import com.justdail.pages.SelectFlightPage;

public class FlightBookingPageTest extends TestBase {
	
	FlightBookingPage flightBookingPage;
	
	@BeforeMethod
	public void Setup() {
		flightBookingPage = new FlightBookingPage();
		}
	
	@Test(priority=1)
	public void verifyReturnTicketLinkTest() {
		flightBookingPage.verifyReturnTicketLink();
	}
	
	@Test(priority=2)
	public void verifyReturnTicketClickTest() {
		flightBookingPage.verifyReturnTicketClick();
	}
	
	@Test(priority=3)
	public void enterValueOnLeavingAndGoingTest() {
		flightBookingPage.enterValueOnLeavingAndGoing(prop.getProperty("Leaving"),prop.getProperty("Going"));
	}	
	
}
















