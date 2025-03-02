package io.loop.step_definitions;

import io.cucumber.java.en.*;
import io.loop.pages.POM;
import io.loop.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SmartBearStepDefs {
    POM pages = new POM();
    private static final Logger LOG = LogManager.getLogger();
    String expected;
    String actual;

    @Given("user is already logged in and navigated to order page")
    public void user_is_already_logged_in_and_navigated_to_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        pages.getSmartBearPages().usernameBox.sendKeys("Tester");
        pages.getSmartBearPages().passwordBox.sendKeys("test");
        pages.getSmartBearPages().loginButton.click();
        pages.getSmartBearPages().orderButton.click();

    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String familyAlbum) {
        pages.getSmartBearPages().orderProductsDropdown.click();
        Select select = new Select(pages.getSmartBearPages().orderProductsDropdown);
        select.selectByIndex(1);

    }
    @When("user enters quantity {string}")
    public void user_enters_quantity(String string) {
        pages.getSmartBearPages().orderProductsQuantity.sendKeys(Keys.BACK_SPACE+"1");
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
        pages.getSmartBearPages().customerNameBox.sendKeys("Chuck Norris");

    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
        pages.getSmartBearPages().streetBox.sendKeys("1100 Long way dr");

    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
        pages.getSmartBearPages().cityBox.sendKeys("Chantilly");

    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
pages.getSmartBearPages().stateBox.sendKeys("Virginia");
    }
    @When("user enters zip {string}")
    public void user_enters_zip(String string) {
        pages.getSmartBearPages().zipBox.sendKeys("22011");

    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {

        pages.getSmartBearPages().selectAmericanExpress("Visa").click();
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        pages.getSmartBearPages().cardNumberBox.sendKeys("1234567890");

    }
    @When("user enters expiration date {string}")
    public void user_enters_expiration_date(String string) {
        pages.getSmartBearPages().expDateBox.sendKeys("02/12");

    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        pages.getSmartBearPages().processButton.click();

    }
    @Then("user should see {string} in the first row of the table")
    public void user_should_see_in_the_first_row_of_the_table(String customerName, List<Map<String,String>> list) {
pages.getSmartBearPages().viewAllOrders.click();

for (Map<String,String> map : list) {
    expected = map.get("customerName");

}
actual =pages.getSmartBearPages().firstRowOfTable.getText();
assertEquals("Actual Does NOT match expected",expected,actual);

    }

}
