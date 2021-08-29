package com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.loginform;

import com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.tools.AdjustedInteractions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Factory extends Constants{

    /**Factories for */
    @FindBy(xpath= FORM_AUTHENTICATION_XPATH)
    public WebElement formAuthentication;
    @FindBy(id = USERNAME_ID)
    public WebElement username;
    @FindBy(xpath = PASSWORD_XPATH)
    public WebElement password;
    @FindBy(css = LOGIN_CSS)
    public WebElement clickLogin;
    @FindBy(xpath = LOGOUT_XPATH)
    public WebElement clickLogout;
    @FindBy(linkText = "WELCOME_INTERNET_LINKTEXT")
    public WebElement welcomeInternet;



    /**Initialize the object and make a Constructor*/
    public Factory(WebDriver driver){
        PageFactory.initElements(driver, this);

    }


}
