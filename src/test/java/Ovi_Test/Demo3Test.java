package Ovi_Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3Test {

	@BeforeMethod
	public void BeforeMethod()
	{
		//selenium
		System.out.println("I wll execute every time");
	}
	
    @Parameters({"URL"})
	@Test
	public void WebloginCarLoan(String URL)
	{
		//selenium
		System.out.println("WebloginCar");
		System.out.println(URL);
	}
	
	@BeforeMethod
	public void BeforeMethod2()
	{
		//selenium
		System.out.println("I wll execute every time");
	}
	@AfterClass
	public void AfterClass()
	{
		//selenium
		System.out.println("After Executing All Methods in the Class");
	}
	@Test(groups= {"Smoke"})
	public void MobileloginCarLoan()
	{
		//selenium
		System.out.println("MobileloginCar");
	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		//selenium
		System.out.println("I am no 1");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileSignInCarLoan()
	{
		//Appium
		System.out.println("MobileSignInCar");
	}
	
	@Test(timeOut=300)
	public void MobileSignOutCarLoan()
	{
		//Appium
		System.out.println("MobileSignOutCar");
	}
	
	
	@Test(dataProvider="getData")
	public void MobileLogicCarLoan(String username, String password)
	{
		//Appium
		System.out.println("MobileLogicCar");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	public void LoginApiCarloan() 
	{
		//Rest API automation
		System.out.println("LoginApiCar");
	}
	
	@DataProvider
	public Object[][] getData()
	{
	//1st combination: username password- good credit history- row
	//2nd combination: username password- no credit history
	//3rd combination: fraudelent credit history
	Object[][] data=new Object[3][2];
	//1st set
	data[0][0]="firstsetusername";
	data[0][1]="firstpassword";
	
	//2nd set
	data[1][0]="secondsetusername";
	data[1][1]="secondpassword";
	
	//3rdset
	data[2][0]="thirdsetusername";
	data[2][1]="thirdpassword";
	return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
}
