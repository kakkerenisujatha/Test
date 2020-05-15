package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterizationTest {

	WebDriver driver;

	@Test
	@Parameters({"url", "emailid"})
	public void yahoologinTest(String url, String emailid) {
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\kakke\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//*[@id='login-username']")).clear();
		 driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys(emailid);
		  driver.findElement(By.xpath("//*[@id='login-signin']")).click();

	}
}
	