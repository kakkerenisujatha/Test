package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemo {

	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\kakke\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");
	}

}

//You cant use class name as Test because you already have @Test so JVM doesn't understand both class name as Test and @Test annotation
//testng is not there in my project structure does this make any difference?
//we added testng in proper way.. earlier meeru thappuga add chesaru..
// thanks ....one quick question can i add other classes in xml file ? now 
//yes you can and make sure the classes are present in that project itself.
//Thanks for your time....can you be my tutor please
// nenu guide chesthanu meeku.. let me know when ur free.. konni best practises follow avali for writing code or creation of packages.
//roju this time i will be free
//ok..okasare either zoom or team viewer call lo chepthanu..
//ikkada full typying ante chala kastamga untadi..
//ok andi and to say i new starter to automation started last week infact to say...but trying my best to get things

//parvaledhu.. keep doing.. lot of Non-IT people(nurses/dentisits)are working in automation.. meeku easy ga osthadi.. t
//tension padakandi... but konchem basics clear ga follow avandi from beginning or else konchem tough avthadi as you keep going.. antha blank ga untadi
//ok andi my target is need to finish my automation in two months.
//Will ping you tommrrow//ok
//Thanks andi by the way your name :)

//Np.. Krish.. nenu US time zone lo unna
//ok.. bye andi
//TC