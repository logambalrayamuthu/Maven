package com.testNgRunner;



import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClass {
	@Test
	
	public void demo() {
		
		String a1actual="Logambal25";
		String b1expected="Logambal";
		
		SoftAssert assert1= new SoftAssert();
		assert1.assertEquals(a1actual,b1expected);
		
		
		
		System.out.println("validation");
		
	}

}
