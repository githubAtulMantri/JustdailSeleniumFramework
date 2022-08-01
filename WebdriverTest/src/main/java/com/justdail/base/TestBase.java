package com.justdail.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;

import com.justdail.util.TestUtil;
import com.justdail.util.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Mantri\\eclipse-workspace\\WebdriverTest\\src\\main"
					+"\\java\\com\\justdail\\config\\config.properties");
			prop.load(ip);		
		    }catch(FileNotFoundException e) {
		    	e.printStackTrace();		    	
		    }catch(IOException e) {
		    	e.printStackTrace();
		    }
 }
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	@AfterTest
	public static void closeBrowser() {
		driver.close();
	}

}
