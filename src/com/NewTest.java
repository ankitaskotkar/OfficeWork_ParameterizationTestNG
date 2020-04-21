package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	
	//if we dont not provide parameter from testng then it takes option values mentioned here
	//if we only run java program then it takes optional values from java file and not parameters from testng.xml
	 @Test
	  @Parameters({"email","password"})
	  public void testParameter(@Optional("test@test.com")String email,@Optional("123")String password){
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\akotkar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		  	WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://ui.freecrm.com/");

			driver.findElement(By.name("email")).sendKeys(email);
			driver.findElement(By.name("password")).sendKeys(password);
	  }
}
