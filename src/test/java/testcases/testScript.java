package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import tests.baseclass;


public class testScript extends baseclass {
	//WebDriver driver;
	
	

	
	
	@Test(priority=1, description="valid_login_with_valid credential")
	public void Search() {
		//driver.get("http://sgtestinginstitute.com/");
		driver.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[7]/a")).click();
		 driver.findElement(By.id("email")).sendKeys("hemabhargavi7@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("Rohini@1");
		 driver.findElement(By.name("btn-login")).click();
		
	}
	
	
	
}

