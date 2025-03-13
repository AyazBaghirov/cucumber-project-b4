package io.loop.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.*;
import io.loop.utilities.BrowserUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.awt.*;

import static org.junit.Assert.assertEquals;


public class SampleDocuportStepDefs {

    LoginPage loginPage = new LoginPage();
    ReceivedDocsPage receivedDocsPage = new ReceivedDocsPage();
    LeftNavigatePage leftNavigatePage = new LeftNavigatePage();
    private static final Logger LOG = LogManager.getLogger();
    MyUploadsPage myUploadsPage = new MyUploadsPage();


    @When("user inserts {string} to {string} field on {string} page")
    public void user_inserts_to_field_on_page(String input, String field, String page) {
        switch (page.toLowerCase().trim()){
            case "login":
                loginPage.insertField(field,input);
                LOG.info(input + " - was successfully sent to -  " + field);
                break;
            case "received doc":
                receivedDocsPage.insertField(field, input);
                LOG.info(input + " - was successfully sent to -  " + field);
                break;
            default: throw new IllegalArgumentException("not such a page: " + page);

        }
    }
    @When("user clicks {string} button on {string} page")
    public void user_clicks_button_on_page(String button, String page) {
        switch (page.toLowerCase().trim()){
            case "login", "choose account":
                loginPage.clickButton(button);
                LOG.info(button + " - was successfully clicked");
                break;
            case "left navigate":
                leftNavigatePage.clickButton(button);
                LOG.info(button + " - was successfully clicked");
                break;
            case "received doc":
                receivedDocsPage.clickButton(button);
                LOG.info(button + " - was successfully clicked");
                break;
            case "my uploads":
                myUploadsPage.clickButton(button);
                LOG.info(button+ " - was successfully clicked");
                break;
            default: throw new IllegalArgumentException("not such a page: " + page);
        }
    }
    @Then("user selects {string} to {string} field on {string} page")
    public void user_selects_to_field_on_page(String button, String field, String page) {
        switch (page.toLowerCase().trim()){
            case "login", "choose account":
                LOG.info( " - was successfully clicked");
                break;
            case "left navigate":
                LOG.info( " - was successfully clicked");
                break;
            case "received doc":
                receivedDocsPage.clickButton(button);
                LOG.info( " - was successfully clicked");
                break;

            case "my uploads":
                myUploadsPage.clickButton(button);
                LOG.info( " - was successfully clicked");
                break;
            default: throw new IllegalArgumentException("not such a page: " + page);
        }

    }
    @Then("user validate message {string} on {string} page")
    public void user_validate_message_on_page(String message, String page) {
        switch (page.toLowerCase().trim()){
            case "login", "choose account":

                LOG.info( " - was successfully clicked");
                break;
            case "left navigate":

                LOG.info( " - was successfully clicked");
                break;
            case "received doc":
                assertEquals("Expected Does Not Match Actual", message,receivedDocsPage.message.getText());

                LOG.info( " - was successfully clicked");
                break;


            default: throw new IllegalArgumentException("not such a page: " + page);
        }


    }

    @Then("user uploads document")
    public void user_uploads_document() throws AWTException {
//   myUploadsPage.uploadDocuments.sendKeys("\"C:\\Users\\Admin\\OneDrive\\Desktop\\path.txt\"");
//
        BrowserUtils.uploadFileForWindows("\"C:\\Users\\Admin\\OneDrive\\Desktop\\path.txt\"");
    }
}