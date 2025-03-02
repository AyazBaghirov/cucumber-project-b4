package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearOrderPage {

    public SmartBearOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[.='Web Orders']")
    public WebElement webOrder;

    @FindBy (xpath = "//a[@href = 'Process.aspx']")
    public WebElement orderButton;

    @FindBy (xpath = "//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']")
    public WebElement orderProductsDropdown;

    @FindBy (name = "ctl00$MainContent$fmwOrder$txtQuantity")
    public WebElement orderProductsQuantity;

    @FindBy (xpath = "//input[@type= 'submit']")
    public WebElement submitCalculateButton;

    @FindBy (name = "ctl00$MainContent$fmwOrder$txtName")
    public WebElement customerNameBox;

    @FindBy (name = "ctl00$MainContent$fmwOrder$TextBox2")
    public WebElement streetBox;

    @FindBy (name = "ctl00$MainContent$fmwOrder$TextBox3")
    public WebElement cityBox;

    @FindBy (name = "ctl00$MainContent$fmwOrder$TextBox4")
    public WebElement stateBox;

    @FindBy (name = "ctl00$MainContent$fmwOrder$TextBox5")
    public WebElement zipBox;

    @FindBy (xpath = " //*[contains(text(),'American Express')]")
    public WebElement visaRadioBox;

    @FindBy (name = "ctl00$MainContent$fmwOrder$TextBox6")
    public WebElement cardNumberBox;

    @FindBy (name = "ctl00$MainContent$fmwOrder$TextBox1")
    public WebElement expDateBox;

    @FindBy (id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_fmwOrder_InsertButton']/following-sibling::strong")
    public WebElement successMessage;

    @FindBy(xpath="//a[.='View all orders']")
    public WebElement viewAllOrders;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_orderGrid']//tr[2]//td[2]")
    public WebElement firstRowOfTable;

    @FindBy
    public WebElement americanExpress;

    @FindBy(name="ctl00$MainContent$username")
    public WebElement usernameBox;

    @FindBy (name = "ctl00$MainContent$password")
    public WebElement passwordBox;

    @FindBy (name = "ctl00$MainContent$login_button")
    public WebElement loginButton;



    public WebElement selectAmericanExpress (String str) {


        americanExpress = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'"+ str + "')]"));

        return americanExpress;

    }



}
