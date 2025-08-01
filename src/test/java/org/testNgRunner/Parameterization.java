package org.testNgRunner;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.testing.BaseClasss;

public class Parameterization extends BaseClasss  {
	
	@Test
	@Parameters({"username","password"})
	
	private void login(String username, String password) {
		
		launchingBrowser("chrome");
		launchingURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}
	
	


		
		
	}


