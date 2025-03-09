package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AppleHomepageUpNavigation {
    public AppleHomepageUpNavigation() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@class='globalnav-submenu-trigger-item']//a")
    public List<WebElement> appleHomepage;
}
