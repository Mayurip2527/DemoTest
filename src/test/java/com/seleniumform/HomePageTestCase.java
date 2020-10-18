package com.seleniumform;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTestCase 
{
	WebDriver driver;
	HomePage hh;
	
	@BeforeMethod
	public void start()
	{
		hh=new HomePage(driver);
		hh.start();
	}
	
	@Test
	public void home()
	{
		hh.home("Mayuri","Patil","Female","4","22-09-2020","Europe","C:\\mayu\\img mine.jpeg");
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
