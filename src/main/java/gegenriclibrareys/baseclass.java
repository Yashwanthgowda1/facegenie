package gegenriclibrareys;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.AnalyticsandReports;
import pompages.ManageStudent;
import pompages.homepage;
import pompages.loginPage;
import pompages.logout;


public class baseclass {
	protected Propertyfileutility property;
	protected 	 ExcelFileutility excel;
	protected JavaUtility junit;
	protected 	   WebDriverutility web;
	protected WebDriver driver;
	protected homepage home;
	protected AnalyticsandReports AnalyticsReports;
	protected loginPage login;
	protected ManageStudent mangestudent;
	protected  logout logou;
	
	
//@BeforeSuite
//@BeforeTest
@BeforeClass
public void openbrowser() {
	 
	 property=new Propertyfileutility();
	  excel=new ExcelFileutility();
	   junit=new JavaUtility();
	    web=new WebDriverutility();
	    property.propertyconfg(Iconsatntpath.PROPerties_FILE);
	 String url=   property.fetchproperty("url");
	String browser= property.fetchproperty("browser");
	String tim= property.fetchproperty("time");
long time=	Long.parseLong(tim);

 driver=web.openApplication(browser, url, time);
}

@BeforeMethod
public void logintoappliactionandintilizethepom() {
	excel.reintilization(Iconsatntpath.EXCEL_FILE);
	 home=new homepage(driver);
	  AnalyticsReports=new AnalyticsandReports(driver);
	   login=new loginPage(driver);
	    mangestudent=new ManageStudent(driver);
	     logou=new logout(driver);
	    Assert.assertTrue(login.getlogo().isDisplayed());
	   
}



@AfterClass
public void quittheappliacton() {
	web.quitBrowser();
}
}

