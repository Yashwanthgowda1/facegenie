package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
/**
 * utilization 
 * 
 */
	@FindBy(xpath = "//img[@style=\"width: 80%; height: auto;\"]")
	private WebElement logo;
	@FindBy (xpath = "//input[@autocomplete=\"email\"]")
	private WebElement emailtextfiled;
	@FindBy (xpath = "//input[@id=\"password\"]")
	private WebElement passwordtextfiled;
	@FindBy (xpath = "//button[text()=\"Log In\"]")
	private WebElement loginbutton;
	/**
	 * intilization
	 * 
	 */
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/**
	 * declartion
	 * @return 
	 */
	public WebElement getlogo() {
		return logo;
		
	}
	public void clickloginbutton() {
		loginbutton.click();
		
	}
	public void setemailtextfiled(String elemnts1) {
		emailtextfiled.sendKeys(elemnts1);
	}
	public void setpasswordtextfiled(String elemnts2) {
		passwordtextfiled.sendKeys(elemnts2);
	}
}
