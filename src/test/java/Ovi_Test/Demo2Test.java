package Ovi_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2Test {

	@Test(groups= {"Smoke"})
	public void ploan() {
	System.out.println("Good");
	}
	
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("I will execute first");
	}

}
