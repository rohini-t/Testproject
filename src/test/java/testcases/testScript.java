package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import tests.baseclass;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;


public class testScript {
	WebDriver driver;
	
	
	@BeforeTest
	public void beforetest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
}
	
	@Test
	public void Search() {
		driver.get("http://sgtestinginstitute.com/");
		driver.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[7]/a")).click();
		 driver.findElement(By.id("email")).sendKeys("hemabhargavi7@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("Rohini@1");
		 driver.findElement(By.name("btn-login")).click();
		
	}
	
	
	@AfterTest
	public void aftertest() {
		driver.quit();
}
}

