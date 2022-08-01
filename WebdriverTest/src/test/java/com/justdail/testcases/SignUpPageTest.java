package com.justdail.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.justdail.base.TestBase;
import com.justdail.pages.SignUpPage;

public class SignUpPageTest extends TestBase{

	SignUpPage signUpPage;
	
	@BeforeMethod
	public void Setup() {
		initialization();
		signUpPage = new SignUpPage();
	}
	
	@Test
	public void verifyAirTicketLink() {
		signUpPage.ValidateLoginTitle();
	}
		

}
