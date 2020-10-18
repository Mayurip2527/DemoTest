package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationHomePage 
{
	WebDriver driver;
	//object repository or page factory
	
	@FindBy(xpath="//input[@ng-model='FirstName']")
	private WebElement name;
	
	@FindBy(xpath="//input[@ng-model='LastName']")
	private WebElement last;
	
	@FindBy(xpath="//textarea[@ng-model='Adress']")
	private WebElement xpath;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='tel']")
	private WebElement phoneno;
	
	@FindBy(xpath="//input[@value='FeMale']")
	private WebElement female;
	
	@FindBy(xpath="//input[@value='Movies']")
	private WebElement movie;
	
	@FindBy(xpath="//input[@value='Hockey']")
	private WebElement Hockey;
	
	
	
	
	

	
	//Initialization
	public AutomationHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	// Action
	public void login()
	{
		name.sendKeys("Mayuri");
		last.sendKeys("Patil");
		xpath.sendKeys("62,kalika nagar pachora");
		email.sendKeys("mayuri34@gmail.com");
		phoneno.sendKeys("9890952908");
		female.click();
		movie.click();
		Hockey.click();
		
	}
	
}
