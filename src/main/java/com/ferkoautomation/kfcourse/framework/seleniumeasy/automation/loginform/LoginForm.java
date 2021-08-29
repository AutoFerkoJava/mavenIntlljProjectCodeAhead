/**
 @author Kim Ferko
 QA Automation Engineer
 Written by Kim Ferko, "Kim Ferko Test Automation Engineer Services", kim.ferko1@gmail.com
 Last update: 29.08.2021
 */
package com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.loginform;

import com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.tools.AdjustedInteractions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginForm {
    public WebDriver driver;
    public Factory elements;
    public AdjustedInteractions adjustedInteractions;

    //Create a Constructor for and use it inside the WebDriver
    public LoginForm(WebDriver driver){
        this.driver = driver;
        this.elements = new Factory(driver);
        this.adjustedInteractions = new AdjustedInteractions(driver);
    }

    public void formAuthentication(){
        adjustedInteractions.click(elements.formAuthentication);
    }
    /**Elements for Login*/

    public void username(String username) {
        adjustedInteractions.sendKeys(elements.username,
                By.id(Constants.USERNAME_ID), username);

    }
    public void password(String password) {
        //this.password = password;
        adjustedInteractions.sendKeys(elements.password,
                By.xpath(Constants.PASSWORD_XPATH), password);

    }

    public void clickLogin() {
        adjustedInteractions.click(elements.clickLogin,
                By.cssSelector(Constants.LOGIN_CSS));
    }

    public void clickLogout(){
        adjustedInteractions.click(elements.clickLogout);
    }

    /*public void navigateToWelcomeInternet(){
        adjustedInteractions.click(elements.welcomeInternet);
    }*/


}
