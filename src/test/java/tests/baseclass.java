package tests;


import org.openqa.selenium.By;

//import java.net.URL;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {

	
	
	//System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");

	WebDriver driver;
 


public void login(WebDriver driver)  {
	
	this.driver=driver;
	
}

public void log() {
	driver.get("http://sgtestinginstitute.com/");
	driver.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[7]/a")).click();
	 driver.findElement(By.id("email")).sendKeys("hemabhargavi7@gmail.com");
	 driver.findElement(By.id("password")).sendKeys("Rohini@1");
	 driver.findElement(By.name("btn-login")).click();
}
}
