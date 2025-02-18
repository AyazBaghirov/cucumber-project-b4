package io.loop.step_definitions;

import io.cucumber.java.en.*;
import io.loop.pages.LoginPage;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.DocuportConstants;
import io.loop.utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("docuportBETA"));


    }
    @When("user enters username for client")
    public void user_enters_username_for_client() {
        BrowserUtils.waitForClickable(loginPage.loginButton, DocuportConstants.EXTRA_LARGE);
        assertTrue("Login button is NOT displayed", loginPage.loginButton.isDisplayed());
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_CLIENT);



    }
    @When("user enters password for client")
    public void user_enters_password_for_client() {
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);

    }
    @When("user click login button")
    public void user_click_login_button() {
        loginPage.loginButton.click();

    }
    @Then("user should be able to see the home for client")
    public void user_should_be_able_to_see_the_home_for_client() {
        assertEquals(1,2);

    }


    @When("user enters username for employee")
    public void user_enters_username_for_employee() {

    }
    @When("user enters password for employee")
    public void user_enters_password_for_employee() {

    }
    @Then("user should be able to see the home for employee")
    public void user_should_be_able_to_see_the_home_for_employee() {

    }


    @When("user enters username for advisor")
    public void user_enters_username_for_advisor() {

    }
    @When("user enters password for advisor")
    public void user_enters_password_for_advisor() {

    }
    @Then("user should be able to see the home for advisor")
    public void user_should_be_able_to_see_the_home_for_advisor() {

    }


    @When("user enters username for supervisor")
    public void user_enters_username_for_supervisor() {

    }
    @When("user enters password for supervisor")
    public void user_enters_password_for_supervisor() {

    }
    @Then("user should be able to see the home for supervisor")
    public void user_should_be_able_to_see_the_home_for_supervisor() {

    }


}
