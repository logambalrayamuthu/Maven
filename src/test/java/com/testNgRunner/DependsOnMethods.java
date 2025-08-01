package com.testNgRunner;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test(dependsOnMethods = "orangeColours")
	public void blueColours() {
		System.out.println("Blue Colours");
		
	}
    @Test//0
   public void orangeColours() {
    	System.out.println("Orange Colours");	
	}
    
    @Test(priority=-1)
    public void whiteColours() {
    	System.out.println("White Colours");
	}
    
    @Test//0
    public void blackColours() {
    	
    	System.out.println("Black Colours");
		
	}
    
    @Test(priority=5)
    public void greenColours() {
    	
    	System.out.println("green Colours");
}
}