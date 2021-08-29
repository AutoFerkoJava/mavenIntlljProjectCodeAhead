package com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.alertsPage;

import com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.loginform.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.alertsPage.Constants.*;


public class Factory extends Constants {

    /**Factories for */
    @FindBy(xpath = "JAVA_SCRIPT_ALERTS_XPATH")
    public WebElement javaScriptAlerts;
    @FindBy(xpath = JS_ALERT_XPATH)
    public WebElement jsAlert;
    @FindBy(xpath = JS_CONFIRM_XPATH)
    public WebElement jsConfirm;
    @FindBy(xpath = JS_PROMPT_XPATH)
    public WebElement jsPrompt;


    /**Initialize the object and make a Constructor*/
    public Factory(WebDriver driver){
        PageFactory.initElements(driver, this);

    }



}