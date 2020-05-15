package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitletest {

	WebDriver driver;
	
	@BeforeMethod
	public void setup(  ) {
		System.setProperty("webdriver.chrome.driver","c:\\Users\\kakke\\Downloads\\chromedrivers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		  
		   
				driver.get("http://google.com");
			}
		
		@Test
	public void googleTitleTest() {
		String title =driver.getTitle();
		//System.out.println(title);
		Assert.assertEquals(title, "Google", "title not matched");
		
		}
}
