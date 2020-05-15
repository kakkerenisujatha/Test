package co.dataprovider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility.Testutil;

public class HalfEbaytest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\kakke\\Downloads\\chromedrivers\\chromedriver.exe");
		
		
		driver = new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.get("https://portal.newdaycards.com/debenhams/login");
		driver.manage().window().maximize();
}

	@DataProvider
	
	public Iterator<Object[]> gettestData() {
		ArrayList<Object[]> testData =Testutil.getDatafromExcel();
		return testData.iterator();
	}

	

@Test(dataProvider ="gettestData")
public void ebaytest(String username, String password) 
{
	
	driver.findElement(By.xpath("//*[@id='j_username']")).clear();
	driver.findElement(By.xpath("//*[@id='j_username']")).sendKeys(username);
	
	
	driver.findElement(By.xpath("//*[@id='j_password']")).clear();
	driver.findElement(By.xpath("//*[@id='j_password']")).sendKeys(password);
	

}

@AfterMethod
public void logout() {
	driver.close();
}
}