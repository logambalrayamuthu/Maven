package com.testNgRunner;

import org.testng.annotations.Test;

import com.testing.BaseClasss;

public class CrossBrowser extends BaseClasss {

	@Test
	
	public void chromeBrowser() {

		launchingBrowser("chrome");
		launchingURL("https://www.facebook.com/");
		System.out.println(" Browser ID:"+ Thread.currentThread().getId());
}
	@Test
	public void edge() {

		launchingBrowser("edge");
		launchingURL("https://www.facebook.com/");
		System.out.println(" Browser ID:"+ Thread.currentThread().getId());
}
	@Test
	public void firefox() {

		launchingBrowser("firefox");
		launchingURL("https://www.facebook.com/");
		System.out.println(" Browser ID:"+ Thread.currentThread().getId());
}
}
