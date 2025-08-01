package com.testNgRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SimpleAnnotation {

	
	//Before-suite , test , class, method 
	   //@test--methods
	// After method , class, test , suite

	
	@Test
	@Ignore
	
	public void locationSelection() {
			
			System.out.println("location Selection completed");
		}
		@Test(enabled=false)
		
		public void dateSelection() {
			
			System.out.println("Date Selection completed");
		}
     @Test
		
		public void PickupLocation() {
			
			System.out.println("PickupLocation completed");
		}
		
   
	@BeforeSuite
	
	public void setup() {
		System.out.println("Decided Blinking app for ticket booking");
	}
	
	@BeforeTest
	
	public void browserLaunch() {
		
		System.out.println("Chrome browser Launched");
		
	}
	
	@BeforeClass

	public void urlLaunching() {
		
		System.out.println("blinking URL launched");
		
	}
	
	
	@BeforeMethod
	
public void login() {
		
		System.out.println("Login Sucessfully");
		
	}
	
	@AfterMethod
	
	public void screenShot() {
		
		System.out.println("ScreenShot completed");
	}
	@AfterClass
	
public void logOut() {
		
		System.out.println("Logout");
	}
	
	@AfterTest
	
public void closeBrowser() {
		
		System.out.println("closeBrowser");
	}
	@AfterSuite
	
public void Termination() {
		
		System.out.println("Termination Browser");
	}
	 
}