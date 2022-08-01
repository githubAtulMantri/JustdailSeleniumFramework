package com.justdail.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.justdail.base.TestBase;
import com.justdail.pages.HomePage;

public class HomePageTest extends TestBase{
	
	HomePage homePage;
	
	@BeforeMethod
	public void Setup() {
		initialization();
		homePage = new HomePage();
	}
	
	@Test
	public void verifyAirTicketLink() {
		homePage.clickOnAirTicketslink();
	}
		

}
