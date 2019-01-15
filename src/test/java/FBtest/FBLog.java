package FBtest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBLog {
@Given("^I navigate to the login page$")
public void I_navigate_to_the_login_page(){
    System.out.println("print Given");
}

@And("^I entered user name as admin and password as admin$")

    public void I_entered_user_name_as_admin_and_password_as_admin(){
    System.out.println("print And");

}
@And("^I click the login button$")
    public void I_click_the_login_button(){
    System.out.println("print And");

}
@Then("^I should see the user form page$")
    public void I_should_see_the_user_form_page(){
    System.out.println("print Then");
}
}
