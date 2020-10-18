package com.seleniumform;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage
{
	WebDriver driver;

	public HomePage(WebDriver driver)
	{
		
		this.driver = driver;
	}
	public void start()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	}
	public void home(String fname,String lname,String gender,String yrofexp,String date,String continents,String photo)
	{
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-3")).click();
		driver.findElement(By.id("datepicker")).sendKeys(date);
		List<WebElement> list=driver.findElements(By.xpath("//input[@name='profession']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getAttribute("value"));
			list.get(i).click();
			
		}
		List<WebElement> listt=driver.findElements(By.xpath("//input[@name='tool']"));
		System.out.println(listt.size());
		for(int i=0;i<listt.size();i++)
		{
			System.out.println(listt.get(i).getAttribute("value"));
			listt.get(i).click();
		}
		WebElement conti=driver.findElement(By.xpath("//select[@id='continents']"));
		Select qq=new Select(conti);
		qq.selectByVisibleText(continents);
		
		driver.findElement(By.id("photo")).sendKeys(photo);
	}
	
	
}
