package generic_librarey;

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

public class Baseclass {
	protected WebDriverUtility web;
	protected ExcelFileUtility excel;
	protected JavaUtility junit;
	protected PropertyFileUtility property;// link with property
	protected WebDriver driver;
	
	protected AnalyticsandReports analysticsreport;
	protected 	 homepage home;
	protected loginPage login;
	protected    logout loout;
	protected ManageStudent managestudents;
	
	@BeforeClass
	/**
	 * launching the browser 
	 */
		public void classconfigration() {
			web = new WebDriverUtility();
			excel = new ExcelFileUtility();// ;ink with execel
			junit = new JavaUtility();
			property = new PropertyFileUtility();

			property.propertyconfg(IconstantPath.PROPERTIES_PATH);
			String browser = property.fetchproperty("browser");
			String url = property.fetchproperty("url");
			String time = property.fetchproperty("time");
			long a = Long.parseLong(time);
			driver = web.openApplication(browser, url, a);
		}
	
	@BeforeMethod // LOGGIN TO APLLICATION AND INTILIZATION OF POM CLASS
	public void methodconfigration() {
		excel.reintilization(IconstantPath.EXEL_PATH);
		 analysticsreport=new AnalyticsandReports(driver);
		  home=new homepage(driver);
		   login=new loginPage(driver);
		    loout=new logout(driver);
		     managestudents=new ManageStudent(driver);
		     Assert.assertTrue(login.getlogo().isDisplayed());
}
	
	@AfterMethod
	public void methodteardown() {
		excel.closeWorkBook();
	}

	@AfterClass
	public void closethebrowser() {
		web.quitBrowser();
	}
}
