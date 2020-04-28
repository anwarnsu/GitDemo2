package Ovi_Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Demo5Test implements ITestListener {
public void onTestStart(ITestResult result) {
		
		// An onTestStart() is invoked only when any test method gets started.
		
	}

	public void onTestSuccess(ITestResult result) {
		//An onTestSuccess() method is executed on the success of a test method.
		// People normally donot use this method.
		// here +result.getName: print name of the test case
		 System.out.println("Success of test cases and its details are : "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		//An onTestFailure() method is invoked when test method fails.
		// If any testcase fails that will be redirected here
		//Use screenshot codehere
		//You can print if API is failed
		 System.out.println("Failure of test cases and its details are : "+result.getName()); 
	}

	public void onTestSkipped(ITestResult result) {
		// An onTestSkipped() run only when any test method has been skipped.
		 System.out.println("Skip of test cases and its details are : "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// This method is invoked each time when the test method fails but within success percentage.
		 System.out.println("Failure of test cases and its details are : "+result.getName()); 
	}

	public void onStart(ITestContext context) {
		// An onStart() method is executed on the start of any test method.
		
	}

	public void onFinish(ITestContext context) {
		// An onFinish() is invoked when any test case finishes its execution.
		
	}

	
	
	
	
	
	
	
	
	
}
