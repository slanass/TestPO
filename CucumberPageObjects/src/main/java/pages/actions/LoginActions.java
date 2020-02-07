package pages.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumDriver;
import pages.locators.LoginLocators;

public class LoginActions {
	
	
	LoginLocators loginLocators=null; //Create Object of our locator
	
	public LoginActions() {
		this.loginLocators=new LoginLocators(); //Constructor
		PageFactory.initElements(SeleniumDriver.getDriver(), loginLocators);
		
		
	}
	public void setUsername() {
		
		Actions action= new Actions(SeleniumDriver.getDriver());
		//dir twiichiyate dial les étapes
	
	}
	public void setPaswword() {
		
		Actions action= new Actions(SeleniumDriver.getDriver());
		//action.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")).sendKeys("User");
		//dir twiichiyate dial les étapes
	}
	public void clickbtnlogin() {
	
	}
	
	
}


