package com.testNgRunner;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testing.BaseClasss;

import junit.framework.Assert;

public class ItestMethod extends BaseClasss{
	
	@BeforeTest
	
	public void urlLogin(){
		
		launchingBrowser("chrome");
		launchingURL("https://www.google.com/");
	}
	
	@Test(retryAnalyzer = ReTestMethod.class)
	public void googleSite() {
		
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, "https://www.google1.com/");
	}
	
	
	@AfterTest
	public void terminateBrowser(){
		terminateBrowser();
	}

}
