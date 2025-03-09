package io.loop.pages;

import io.loop.utilities.BrowserUtils;
import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;
import java.util.Date;

public class ReceivedDocsPage {


    public ReceivedDocsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[contains(text(),'Search')]")
    public WebElement searchButton;

    @FindBy(xpath = "//label[contains(text(),'Document name')]/following-sibling::input")
    public WebElement documentName;

    @FindBy(xpath = "//div[@class='v-select__selections']//input")
    public WebElement tags;

    @FindBy(xpath="//span[contains(@id,'list-item')]//span[@class='v-chip__content']//span[.='Tax Return']")
    public WebElement taxReturn;

    @FindBy(xpath = "//input[@role='button']")
    public WebElement uploadDate;
    LocalDate today = LocalDate.now();



    @FindBy(xpath = "(//div[@class='v-btn__content'])[7]")
    public WebElement selectDate;

    @FindBy(xpath = "(//label[.='Uploaded by']//following-sibling::input)[1]")
    public WebElement uploadedBy;

    @FindBy(xpath = "(//div[@class='v-list-item__content']//div[@class='v-list-item__title' and text()='Batch1 Group1'])[1]")
    public WebElement batch1Group1;

    @FindBy(xpath = "//span[.=' Search ']")
    public WebElement search2;

    @FindBy(xpath = "//p[contains(.,'Your search returned no results. Make sure you search properly')]")
    public WebElement message;




    public void clickButton(String button){
        switch (button.toLowerCase().trim()){
            case "search":
                BrowserUtils.waitForClickable(searchButton, 10).click();
                break;
            case "tax return":
                BrowserUtils.waitForClickable(tags, 10).click();
                BrowserUtils.waitForClickable(taxReturn, 10).click();
                break;

            case "3-7-2025":
                BrowserUtils.waitForClickable(uploadDate, 10).click();
                BrowserUtils.waitForClickable(selectDate, 10).click();
                break;


            case "batch1 group1":
                BrowserUtils.waitForClickable(uploadedBy, 10).click();
                BrowserUtils.waitForClickable(batch1Group1, 10).click();
                break;

            case "search2":
                BrowserUtils.waitForClickable(search2, 10).click();
                break;

            default: throw new IllegalArgumentException("Not such a button: " + button);

        }
    }

    public void insertField(String field, String input){
        switch (field.toLowerCase().trim()){
            case "document name":
                BrowserUtils.waitForVisibility(documentName, 10).sendKeys(input);
                break;
            default: throw new IllegalArgumentException("No such a field: " + field );
        }
    }
}