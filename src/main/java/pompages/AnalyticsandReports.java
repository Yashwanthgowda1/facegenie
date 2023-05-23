package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnalyticsandReports {

@FindBy (xpath = "(//div[@aria-haspopup=\"listbox\"])[1]")
private WebElement selectBus;
@FindBy(xpath = "(//div[@aria-haspopup=\"listbox\"])[2]")
private WebElement selectclass;
@FindBy(xpath = "(//div[@aria-haspopup=\"listbox\"])[3]")
private WebElement selectdevision;
@FindBy (xpath = "(//button[@type=\"button\"]/p[text()=\"Download\"])[1]")
private WebElement Download1;
@FindBy (xpath = "(//button[@type=\"button\"]/p[text()=\"Download\"])[2]")
private WebElement Download2;
@FindBy(xpath = "//p[text()='Dashboard/ AnalyticsReports Logs']")
private WebElement analysisandreportslogs;
public AnalyticsandReports(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getanalysisandreportslogs() {
	return analysisandreportslogs;
}
public void clickselectBus() {
	selectBus.click();
}
public void clickselectclass() {
	selectclass.click();
}
public void clickselectdevision() {
	selectdevision.click();
}
public void clickDownload1() {
	Download1.click();
}
public void clickDownload2() {
	Download2.click();
}

}
