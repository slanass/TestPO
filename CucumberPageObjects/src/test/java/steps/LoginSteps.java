package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	
	
	

	@Given("^user is in page Login  \"([^\"]*)\"$")
	public void user_is_in_page_Login(String url) throws Throwable {
		System.out.println("@Given user go to login page test"+url);
	}


	@When("^user inter \"([^\"]*)\"$")
	public void user_inter(String Validlogin) throws Throwable {
		System.out.println("@When user inter valid login" +Validlogin);
	}

	@And("^user  interPassword \"([^\"]*)\"$")
	public void user_interPassword(String ValidPassword) throws Throwable {
		System.out.println("@And user inter valid Password as" +ValidPassword);
	}

	@Then("^conneting successfully on page MyAccount$")
	public void conneting_successfully_on_page_MyAccount() throws Throwable {
		System.out.println("@then user login successfuly");
	}
}
