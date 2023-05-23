package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
@FindBy(xpath = "//img[@style=\"width: 80%; height: auto;\"]")
private WebElement logo;
@FindBy( xpath = "//span[text()=\"Dashboard\"]")
private WebElement Dashboard;

@FindBy( xpath = "//span[text()=\"Attendance Logs\"]")
private WebElement AttendanceLogs;

@FindBy( xpath = "//span[text()=\"Analytics and Reports\"]")
private WebElement AnalyticsandReports;

@FindBy( xpath = "//div[@style=\"margin: 10px 0px;\"][4]")
private WebElement ManageStudent;

@FindBy( xpath = "//span[text()=\"Manage Licenses\"]")
private WebElement ManageLicenses;

@FindBy( xpath = "//span[text()=\"Manage Sync\"]")
private WebElement ManageSync;
@FindBy( xpath = "//span[text()=\"Archives\"]")
private WebElement Archives;

@FindBy( xpath = "//span[text()=\"Setting\"]")
private WebElement Setting;
@FindBy( xpath = "//span[text()=\"Log Out\"]")
private WebElement LogOut;
@FindBy(xpath = "//p[text()='test101@gmail.com']")
private WebElement logincredantial;
/**
 * 
 * intilization
 * @param driver
 */

public homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
/**
 * 
 * utilization
 * @return       
 */


public WebElement getlogincredantial() {
return logincredantial;
}
public WebElement getlogo() {
	return logo;
}
public void clickDashboard() {
	Dashboard.click();
}
public void clickAttendanceLogs() {
	AttendanceLogs.click();
}
public void clickAnalyticsandReports() {
	AnalyticsandReports.click();
}
public void clickManageStudent() {
	ManageStudent.click();
}
public void clickManageLicenses() {
	ManageLicenses.click();
}
public void clickManageSync() {
	ManageSync.click();
}
public void clickArchives() {
	Archives.click();
}
public void clickSetting() {
	Setting.click();
}
public void clickLogOut() {
	LogOut.click();
}
public void clicklogincredantial() {
	logincredantial.click();
}
}
