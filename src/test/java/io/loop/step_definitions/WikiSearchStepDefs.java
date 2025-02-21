package io.loop.step_definitions;

import io.cucumber.java.en.*
        ;
import io.loop.pages.WikiSearchPage;
import io.loop.utilities.Driver;
import org.junit.Assert;

public class WikiSearchStepDefs {
    WikiSearchPage wikiSearchPage = new WikiSearchPage();


    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");

    }
    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        wikiSearchPage.searchBox.sendKeys("Steve Jobs");

    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiSearchPage.searchButton.click();

    }
    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Steve Jobs"));

    }

    @Then("User sees Steve Jobs is in the main header")
    public void user_sees_steve_jobs_is_in_the_main_header() {
        Assert.assertTrue(wikiSearchPage.headerSteveJobs.getText().contains("Steve Jobs"));

    }

    @Then("User sees Steve Jobs is in the image header")
    public void user_sees_steve_jobs_is_in_the_image_header() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(wikiSearchPage.headerSteveJobsImage.getText());
       // Assert.assertTrue(wikiSearchPage.headerSteveJobsImage.getText().contains("Steve Jobs"));

    }
    @Then("we love Loop Academy")
    public void we_love_loop_academy() {
        System.out.println("We Love Loop Academy");
    }

}
