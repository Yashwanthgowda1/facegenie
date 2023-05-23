package facegenie1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import gegenriclibrareys.baseclass;

public class loginpage1 extends baseclass {
@Test
public void m1() throws InterruptedException {
	
	SoftAssert soft=new SoftAssert();
	login.setemailtextfiled("test101@gmail.com");
	Thread.sleep(1000);
	login.setpasswordtextfiled("Test@101");
	Thread.sleep(1000);
	login.clickloginbutton();
	soft.assertTrue(home.getlogo().isDisplayed());
	Thread.sleep(2000);
	home.clickManageStudent();
	mangestudent.clickselectdetails1();
	Thread.sleep(1000);
	mangestudent.clickeditdetails();
	Thread.sleep(1000);
	mangestudent.clickdowloadQR();
	Thread.sleep(1000);
	mangestudent.clickconformeditdetais();
	Thread.sleep(1000);
	home.clickLogOut();
	logou.clickok();
	Thread.sleep(1000);
//	home.clickLogOut();
//	Thread.sleep(1000);
//	logou.clickok();

	
	soft.assertAll();
}
}
