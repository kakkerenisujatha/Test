package Saleniumclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","c:\\Users\\kakke\\Downloads\\chromedriver\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
	}

}
