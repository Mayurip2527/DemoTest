package com.seleniumform;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.AutomationHomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationHomeTestcase 
{
	WebDriver driver;
	AutomationHomePage ah;
	
	@BeforeMethod
	public void start()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		ah=new AutomationHomePage(driver);
	}
	
	@Test
	public void login()
	{
		ah.login();
	}
	@AfterMethod
	public void close()
	{
		driver.close();
		
	}
}
