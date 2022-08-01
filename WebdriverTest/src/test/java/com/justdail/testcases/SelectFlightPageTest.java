package com.justdail.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.justdail.base.TestBase;
import com.justdail.pages.SelectFlightPage;

public class SelectFlightPageTest extends TestBase{
	SelectFlightPage selectFlightPage;
		
	@BeforeMethod
	public void SetUp() 
	{
		initialization();
		selectFlightPage = new SelectFlightPage();
	}
	
	@Test(priority=1)
	public void selectRedioBtnAndContinueTest()
	{
		selectFlightPage.SelectRedioBtnAndContinue();
	}
	
	@Test(priority=2)
	public void selectNoInsureanceRadioBtn()
	{
		selectFlightPage.selectNoInsureanceRadioBtn();
	}

}
