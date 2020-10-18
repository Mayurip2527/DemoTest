package com.automation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest 
{	
	WebDriver driver;
	LoginPage ll;
	
	@BeforeMethod
	public void start()
	{
		ll=new LoginPage(driver);
		ll.start();
		
		
	}
	@Test
	public void login() throws Exception
	{
		
		ll.login("mayurip2729@gmail.com","Bajaj123@");
		ll.screenshot();
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
	
	
}
