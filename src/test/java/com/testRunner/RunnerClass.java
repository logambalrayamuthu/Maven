package com.testRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testing.BaseClasss;

public class RunnerClass extends BaseClasss {
	
	public static void main(String[] args) {
		
	launchingBrowser("chrome");
	launchingURL("https://www.facebook.com/");
	
	//WebElement email = driver.findElement(By.id("email"));
	//passInput(email,"logu@gmail.com");
	//WebElement password = driver.findElement(By.id("pass"));
	//passInput(password,"12455");
	//WebElement loginBtn = driver.findElement(By.name("login"));
	//clickElement(loginBtn);	
	navigateTOUrl("https://www.amazon.in");
	navigationMethods("forward");
	WebElement dropdown = driver.findElement(By.name("url"));
	selectDropdown(dropdown, "index", "5");
		
			
		
		
		
	}

}
