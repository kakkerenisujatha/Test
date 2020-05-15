package com.dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Excel.utility.Xls_Reader;




public class DataDrivenTest {

	public static void main(String[] args) {
		
		
		
	Xls_Reader reader = new Xls_Reader("C:/Users/kakke/eclipse-workspace/Data sample sujatha/JavaTraningSession/src/com/TestData/ebay.com.xlsx");

	String username = reader.getCellData("ebay", "username", 2);
	System.out.println(username);
	
	String password = reader.getCellData("ebay", "password", 2);
	System.out.println(password);
	
	
		
	
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver", "c:\\Users\\kakke\\Downloads\\chromedriver\\chromedriver.exe");
		
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
	driver.get("https://portal.newdaycards.com/debenhams/login");
	driver.manage().window().maximize();
	


	
	driver.findElement(By.xpath("//*[@id='j_username']")).clear();
	driver.findElement(By.xpath("//*[@id='j_username']")).sendKeys(username);
	
	
	driver.findElement(By.xpath("//*[@id ='j_password']")).clear();
	driver.findElement(By.xpath("//*[@id ='j_password']")).sendKeys(password);
	
	
}


	}


