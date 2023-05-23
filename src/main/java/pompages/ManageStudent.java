package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageStudent {
@FindBy(xpath = "//p[text()=\"Dashboard/ Manage Student\"]")
private WebElement ManageStudentverify;
@FindBy(xpath = "//button[text()=\"1\"]")
private WebElement selectdetails1;
@FindBy(xpath = "//p[text()=\"Edit Details\"]")
private WebElement editdetails;
@FindBy(xpath = "(//*[name()='svg'][@data-testid=\"DownloadIcon\"])[2]")
private WebElement dowloadQR;
@FindBy(xpath = "(//button[@type=\"submit\"]/span[@class=\"MuiTouchRipple-root css-w0pj6f\"])[2]")
private WebElement conformeditdetais;


public ManageStudent(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getManageStudentverify() {
	return ManageStudentverify;
}
public void clickselectdetails1() {
	selectdetails1.click();
}
public void clickeditdetails() {
	editdetails.click();
}
public void clickdowloadQR() {
	dowloadQR.click();
}
public void clickconformeditdetais() {
	conformeditdetais.click();
}
}
