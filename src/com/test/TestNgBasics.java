package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	//preconditions annotains are create @before
	
	
	@BeforeSuite //1
	public void setup() {
		System.out.println("setup system property at chrome");
	}
	
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("Launch chrome browser");
	}
	
	@BeforeClass //3
	public void Login() {
		System.out.println("Login to app");
		
	}
	

	@BeforeMethod //4
	public void enterurl() {
		System.out.println("enter URl");
	}
	
	//test cases ---starting @test
	@Test //5
	public void googletiletest() {
		System.out.println("google title test");
		}
	
	@Test
	public void search() {
		System.out.println("search annotation");
	}
	
	//Post conditions are starting with @after
	
	@AfterMethod //6
	public void logout() {
	  System.out.println("@after method :logout after app");
	  
	}
	
	@AfterTest //8
	public void deleteallcookies() {
		System.out.println("@aftertest :Delete all cookies");
	}

	@AfterClass //7
	public void closeBroser() {
		System.out.println("close brwoser");
	}
	
	@AfterSuite //9
	public void generateTestReport() {
		System.out.println();
		
	}
	}
	