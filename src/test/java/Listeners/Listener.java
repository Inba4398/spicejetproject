package Listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base.Baseclass;
import Utilities.ExtentReport;

public class Listener extends Baseclass implements ITestListener{
	//WebDriver driver;
	
	//create an extent report object
	ExtentReports extentReport=ExtentReport.getExtentReports();
	//initialize the extent variable
	ExtentTest extentTest;
	
	//call all the method for which we want to execute
	
	@Override
	public void onTestStart(ITestResult result) {
		extentTest=extentReport.createTest(result.getName());
	}
	
	//method execute to before successful each test
	@Override
	public void onTestSuccess(ITestResult result) {
		//log the status 
				//get the name of failed test case
				String testName=result.getName();
				try {
					String screenshotPath=TakeScreenshot(testName, driver);
					extentTest.addScreenCaptureFromPath(screenshotPath,testName);
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				extentTest.log(Status.PASS, "Test Passed");
			}
		
	
	//create a method to test failure
	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.fail(result.getThrowable());
		//get the name of failed test case
		String testName=result.getName();
		//Logic for screenshot capture
		try {
			driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalAccessException|IllegalArgumentException|NoSuchFieldException|SecurityException e) {
			e.printStackTrace();
		}
		try {
			String screenshotPath=TakeScreenshot(testName, driver);
			extentTest.addScreenCaptureFromPath(screenshotPath,testName);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		//flush the extent  to write the data to report file
		extentReport.flush();
	}
}