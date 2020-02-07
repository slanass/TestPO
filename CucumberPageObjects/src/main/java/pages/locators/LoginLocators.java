package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginLocators {
	
	@FindBy(how=How.ID,using="signingMenu")
	public WebElement signingMenu;
	
	@FindBy(how=How.ID,using="header-login-username")
	public WebElement HeaderLoginUsername;
	
	@FindBy(how=How.ID,using="header-login-password")
	public WebElement HeaderLoginPassword;
	
	@FindBy(how=How.ID,using="header-login-btn")
	public WebElement HeaderLoginBtn;
	
	


}
