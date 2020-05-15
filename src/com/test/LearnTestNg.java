package com.test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnTestNg {

	
	@BeforeSuite //1
	public void setup() {
		System.out.println("setup system property at chrome");
	}
	
	
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("Launch chrome browser");
	}
	@Test //5
	public void googletiletest() {
		System.out.println("google title test");
		}
	
}
