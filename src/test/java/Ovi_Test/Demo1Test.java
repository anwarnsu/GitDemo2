package Ovi_Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Demo1Test {

	

	//extends TestBase:Inherit the properties of TestBase class
 

@AfterTest
public void LastExecution( ) {     //LastExecution is a testcase name. 
System.out.println("I will execute last");
}



@Test(groups= {"Smoke"})    //Second testcase
public void Demo( ) {                    
System.out.println("Hello");
}


@Test                          //third testcase
public void SecondTest( ) {
System.out.println("Bye");
}

}
