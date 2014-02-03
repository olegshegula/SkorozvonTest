package com.skorozvon.test.listener;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

import com.skorozvon.test.core.BaseTest;


//This class can help to make screenshots of tests

public class Screenshot extends TestListenerAdapter {
	
		//this method will be called after test will failure
	
	@Override
	public void onTestFailure(ITestResult result) {

		Reporter.setCurrentTestResult(result);

		try {
			BaseTest.CaptureScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.setCurrentTestResult(null);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// will be called after test will be skipped
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// will be called after test will pass
	}
}
