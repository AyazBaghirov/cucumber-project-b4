package io.loop.step_definitions;

import io.cucumber.java.en.*;
import io.cucumber.java.it.Ma;
import io.loop.pages.LoginPage;
import io.loop.pages.POM;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.DocuportConstants;
import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
    POM pages = new POM();

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
        BrowserUtils.waitForClickable(loginPage.loginButton, DocuportConstants.EXTRA_LARGE);
        loginPage.loginButton.click();

    }
    @When("user click login button")
    public void user_click_login_button() {


    }
    @Then("user should be able to see the home for client")
    public void user_should_be_able_to_see_the_home_for_client() {
        assertTrue("Credentional is not correct",true);

    }


    @When("user enters username for employee")
    public void user_enters_username_for_employee() {
        loginPage.login2(DocuportConstants.USERNAME_EMPLOYEE,DocuportConstants.PASSWORD);

    }
    @When("user enters password for employee")
    public void user_enters_password_for_employee() {

    }
    @Then("user should be able to see the home for employee")
    public void user_should_be_able_to_see_the_home_for_employee() {

    }


    @When("user enters username for advisor")
    public void user_enters_username_for_advisor() {

        loginPage.login2(DocuportConstants.USERNAME_ADVISOR, DocuportConstants.PASSWORD);
    }
    @When("user enters password for advisor")
    public void user_enters_password_for_advisor() {

    }
    @Then("user should be able to see the home for advisor")
    public void user_should_be_able_to_see_the_home_for_advisor() {

    }


    @When("user enters username for supervisor")
    public void user_enters_username_for_supervisor() {
loginPage.login2(DocuportConstants.USERNAME_SUPERVISOR, DocuportConstants.PASSWORD);
    }
    @When("user enters password for supervisor")
    public void user_enters_password_for_supervisor() {

    }
    @Then("user should be able to see the home for supervisor")
    public void user_should_be_able_to_see_the_home_for_supervisor() {

    }
    @When("user enters credentials")
    public void user_enters_credentials(Map<String, String> credentials) {
//        for(Map.Entry<String,String > entry : credentials.entrySet()) {
//            String key = entry.getKey();
//            System.out.println("key = " + key);
//
//            String value = entry.getValue();
//            System.out.println("value = " + value);
//        }
        loginPage.login2(credentials.get("username"), credentials.get("password"));

    }
    @Then("user should bbe able to see the home for client")
    public void user_should_bbe_able_to_see_the_home_for_client() {

    }


    @When("user click continue button")
    public void user_click_continue_button() {
        BrowserUtils.waitForClickable(loginPage.continueButton, DocuportConstants.EXTRA_LARGE);
        loginPage.continueButton.click();

    }
    @Then("user validate left navigate items")
    public void user_validate_left_navigate_items( List<String> leftNavigation) {

        List<String> actualLeftNavigation = new ArrayList<String>();
        for (WebElement item : pages.getDocuportHomePageForClient().leftNavigation) {
            actualLeftNavigation.add(item.getText().trim());
        }
        assertEquals("Actual left navigation does not match expected",leftNavigation, actualLeftNavigation);
    }
}
