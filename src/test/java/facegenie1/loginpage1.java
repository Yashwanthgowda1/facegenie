package facegenie1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic_librarey.Baseclass;

public class loginpage1 extends Baseclass {
@Test
public void m1() throws InterruptedException {
	
	SoftAssert soft=new SoftAssert();
	login.setemailtextfiled(excel.readData("Sheet1", 0, 1));
	Thread.sleep(1000);
	login.setpasswordtextfiled(excel.readData("Sheet1", 1, 1));
	Thread.sleep(1000);
	login.clickloginbutton();
	soft.assertTrue(home.getlogo().isDisplayed());
	Thread.sleep(2000);
	


	

	
	soft.assertAll();
}
}
