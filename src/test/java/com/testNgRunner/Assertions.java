package com.testNgRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testing.BaseClasss;

public class Assertions extends BaseClasss {

	
	@Test
	
	public void hardAssert() {
		
		launchingBrowser("chrome");
		launchingURL("https://www.facebook.com/");
		String actual = driver.findElement(By.xpath("//Button[@type='submit']")).getText();
		WebElement email = driver.findElement(By.id("email"));
		passInput(email, "VelanDG");
		Assert.assertEquals(actual, "login");
		WebElement password = driver.findElement(By.id("pass"));
		passInput(password, "123456");
		
	
	}
}
 