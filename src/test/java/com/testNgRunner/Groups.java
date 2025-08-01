package com.testNgRunner;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = "light")
	public void colour1 () {
		System.out.println("orange");
	}

	
	@Test(groups = "light")
	public void colour2 () {
		System.out.println("pink");
	}
	@Test(groups = "light")
	public void colour3 () {
		System.out.println("yellow");
	}
	
   @Test(groups = "dark")
   
   public void darkcolour1 () {
		System.out.println("Balck");
	}
   
   @Test(groups = "dark")   
   public void darkcolour2 () {
		System.out.println("green");
	}
  @Test(groups = "dark")
  
  public void darkcolour3 () {
		System.out.println("Blue");
	}
  
   @Test(groups ="veg")
   
   public void curdrice() {
		System.out.println("Curd Rice");
   }
		
		@Test(groups ="veg")
		public void lemon() {
			System.out.println("Lemon Rice");
	}
  @Test(groups = "nonveg")
  
  public void mutton() {
		System.out.println("Mutton");
	}
  @Test(groups = "nonveg")
  
  public void chicken () {
		System.out.println("Chicken");
	}

}
