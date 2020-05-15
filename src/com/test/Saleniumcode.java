package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Saleniumcode {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\kakke\\Downloads\\chromedriver\\chromedriver.exe");
		
		// mistake you did is 
		//Webdriver driver =new ChromeDriver();
		driver = new ChromeDriver(); // you have already declared Webdriver driver in globally and again you are creating inside the method.
		//thats the reason we got nullpointer exception . let me show you
		// so its working now...
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		// now you can run

		
	}

	 @Test(priority=1)
	public void googleTitleTest() {
		String title =driver.getTitle();
			System.out.println(title);
		Assert.assertEquals(title, "Google", "title not matched");
		
	}
	@Test
	public void Logotest() 
	{
		
		boolean b = driver.findElement(By.xpath("//img[@id ='hplogo']")).isDisplayed();
		Assert.assertTrue(b);

	}

	@AfterMethod
	public void logout() {
		driver.close();
	}

}
