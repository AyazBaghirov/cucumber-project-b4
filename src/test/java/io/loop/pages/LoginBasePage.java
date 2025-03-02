package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LoginBasePage {
    public LoginBasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
