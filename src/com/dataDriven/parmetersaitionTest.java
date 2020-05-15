package com.dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Excel.utility.Xls_Reader;

public class parmetersaitionTest {

	

	public static void main(String[] args) {
	
		

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\kakke\\Downloads\\chromedriver\\chromedriver.exe");
			
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.get("https://portal.newdaycards.com/debenhams/login");
		driver.manage().window().maximize();
		

		
		Xls_Reader reader = new Xls_Reader("C:/Users/kakke/eclipse-workspace/Data sample sujatha/JavaTraningSession/src/com/TestData/ebay.com.xlsx");

		int rowCount = reader.getRowCount("ebay");
		
		// reader.addSheet("Homepage");
		//if(reader.isSheetExist("Homepage")) {
			//reader.addSheet("Homepage");
		//}
		
		reader.addColumn("ebay", "status");
		
		for(int rowNu = 2 ; rowNu<=rowCount;rowNu++) {
		
		
		String username = reader.getCellData("ebay", "username", rowNu);
		System.out.println(username);
		
		String password = reader.getCellData("ebay", "password", rowNu);
		System.out.println(password);
		
		

		driver.findElement(By.xpath("//*[@id='j_username']")).clear();
		driver.findElement(By.xpath("//*[@id='j_username']")).sendKeys(username);
		
		
		driver.findElement(By.xpath("//*[@id='j_password']")).clear();
		driver.findElement(By.xpath("//*[@id='j_password']")).sendKeys(password);
		
		
		reader.setCellData("ebay", "status", rowNu, "pass");
		
		}
		
		 	 	
	}

}
