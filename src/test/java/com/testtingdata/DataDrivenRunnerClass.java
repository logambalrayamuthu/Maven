package com.testtingdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.ReadExcelData;

public class DataDrivenRunnerClass {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	String userName = ReadExcelData.getParticularData(1, 0);
    driver.findElement(By.id("email")).sendKeys(userName);
	
	String password= ReadExcelData.getParticularData(1, 1);
	driver.findElement(By.id("pass")).sendKeys(password);
}
}
