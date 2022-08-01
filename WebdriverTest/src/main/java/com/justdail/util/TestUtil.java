package com.justdail.util;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtil {
	
	public static long IMPLICT_WAIT =20;
	public static WebDriver driver;
		
		public static void takeScreenshotAtEndOfTest() throws IOException {
			File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String currentDir = System.getProperty("user.dir");
			FileUtils.copyFile(scrfile, new File(currentDir +"/screenshot/" +System.currentTimeMillis()+".png"));
		}
		}



