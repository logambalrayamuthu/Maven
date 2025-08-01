package com.testNgRunner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTestMethod implements IRetryAnalyzer{
	
	private int reTryCount=0;
	private static final int maxicount=5;

	@Override
	public boolean retry(ITestResult result) {
		
		if (reTryCount < maxicount) {
			reTryCount++;
			return true;
			
		}
		return false;
	
	}
	
	

}
