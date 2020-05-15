package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class invocationTestCount {
	
	@BeforeTest
    public void testInvocationTest() {
        System.out.println("Before Test for Invocation class");
    }
	
	@Test(invocationCount =10)
	public void sum() {
		int a =10;
		int b =20;
		int c =a+b;
		System.out.println("sum is =="+c);
				
	}
	
	@AfterTest
    public void testInvocationAfterTest() {
        System.out.println("After Test for Invocation class");
    }

}
