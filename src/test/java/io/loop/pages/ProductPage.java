package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class ProductPage {

    public ProductPage(){
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.valueOf(ConfigurationReader.getProperties("timeouts"))));
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickCategory(String category){

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.valueOf(ConfigurationReader.getProperties("timeouts"))));
        Driver.getDriver().findElement(By.xpath("//a[contains(.,'"+category+"')]")).click();
    }

    public String getProductPrice(String product){

        try{


        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.valueOf(ConfigurationReader.getProperties("timeouts"))));
        String actualPrice = Driver.getDriver().findElement(By.xpath("//a[normalize-space(.)='"+product+"']/../../h5")).getText();
        return actualPrice.substring(1);}
        catch (StaleElementReferenceException e){
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.valueOf(ConfigurationReader.getProperties("timeouts"))));
            String actualPrice = Driver.getDriver().findElement(By.xpath("//a[normalize-space(.)='"+product+"']/../../h5")).getText();
            return actualPrice.substring(1);
        }
    }
}