package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BaseClass {
	public static WebDriver driver;
	public static void openApplication() {
	System.setProperty("webdriver.gecko.driver", "G:\\\\Selenium\\\\Drivers\\\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/index.php");
	Reporter.log("Application Opened");
	}
	public static void closeApplication() {
	driver.close();
	Reporter.log("Application closed");
	}

}
