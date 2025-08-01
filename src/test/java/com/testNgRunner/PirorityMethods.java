package com.testNgRunner;

import org.testng.annotations.Test;

public class PirorityMethods {
	
	@Test(priority=-5)
	public void primarySchool() {
		System.out.println("primarySchool");
		
	}
	@Test(priority=10)
	
	public void nursarySchool() {
		System.out.println("Nursary School");
		
	}
	
	@Test(priority=-9)
	public void highSchool() {
		System.out.println("High School");
		
	}
	@Test(priority=-3)
	public void mediumSchool() {
		System.out.println("Medium School");
		
	}

}
