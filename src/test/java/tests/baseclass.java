package tests;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

///import java.net.URL;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class baseclass {

	
	
	//System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
 protected WebDriver driver;
	String baseUrl;
	
	@BeforeMethod
	
	
	public void setUp() throws Exception {
	driver = new ChromeDriver();
	baseUrl = "http://sgtestinginstitute.com/";
	driver.get(baseUrl);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass
	public void aftertest() {
		driver.quit();
}
	


public void log() {
	
}
}
