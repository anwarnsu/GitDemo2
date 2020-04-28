package Ovi_Test;

import org.testng.annotations.Test;

public class Demo4Test {
	@Test
	public void WebloginHomeLoan()
	{
		//selenium
		System.out.println("WebloginHome");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLogicHomeLoan()
	{ 
		//Appium
		System.out.println("MobileLogicHome");
	}
	
	
	@Test(groups= {"Smoke"})
	public void LoginApiHomeloan() 
	{
		//Rest API automation
		System.out.println("LoginApiHome");
	}
	
}
