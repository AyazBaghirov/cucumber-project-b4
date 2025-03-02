package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DocuportHomePageForClient {
    public DocuportHomePageForClient() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='v-list-item__title']//span")
   public List<WebElement> leftNavigation;
}
