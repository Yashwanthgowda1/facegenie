package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
@FindBy(xpath = "//button[text()=\"Ok\"]")
private WebElement ok;

public logout(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void clickok() {
	ok.click();
}
}
