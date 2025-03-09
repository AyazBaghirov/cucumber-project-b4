package io.loop.step_definitions;

import io.cucumber.java.en.*;
import io.loop.pages.AppleHomepageUpNavigation;
import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class appleStepdefs {


 AppleHomepageUpNavigation appleHomepageUpNavigation = new AppleHomepageUpNavigation();
    List< String> actualResult = new ArrayList<>();
    @Given("validate information from Apple website")
    public void validate_information_from_apple_website(List<String> expectedNavigation) {

        Driver.getDriver().get("https://www.apple.com/");

        for (WebElement navigationItem : appleHomepageUpNavigation.appleHomepage) {

        actualResult.add(navigationItem.getText());
}
        assertEquals(expectedNavigation, actualResult);
    }

}
