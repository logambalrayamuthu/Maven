package com.testNgRunner;

import org.testng.annotations.Test;

import com.testing.BaseClasss;

public class InvocationCount extends BaseClasss{
	
	@Test(invocationCount = 5)
	
	public void webSiteTestMethod() {
		
		launchingBrowser("chrome");
		launchingURL("https://www.facebook.com/");
		
	}
	@Test
	public static void sampletest() {
		
		System.out.println("Sample Test");
	}
}
