package com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.dynamicControlsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.PortUnreachableException;

public class Factory extends Constants{

    @FindBy(linkText = CLICK_DYNAMIC_CONTROLS_LINKTEXT)
    public WebElement clickDynamicControls;
    @FindBy(xpath = CLICK_CHECKBOX_XPATH)
    public WebElement clickCheckbox;
    @FindBy(xpath = REMOVE_CHECKBOX_XPATH)
    public WebElement removeCheckbox;
    @FindBy(xpath = ADD_BUTTON_XPATH)
    public WebElement addButton;
    @FindBy(xpath = CLICK_CHECKBOX_AGAIN_XPATH)
    public WebElement clickCheckboxAgain;
    @FindBy(xpath = REMOVE_ADD_XPATH)
    public WebElement removeAdd;

    @FindBy(css = ENABLE_BUTTON_CSS)
    public WebElement enableButton;
    @FindBy(xpath = BUTTON_ENABLED_XPATH)
    public WebElement buttonEnabled;
    @FindBy(xpath = DISABLE_BUTTON_XPATH)
    public WebElement disableButton;
    @FindBy(xpath = BUTTON_DISABLED_XPATH)
    public WebElement buttonDisabled;
    @FindBy(css = INPUT_TEXT_CSS)
    public WebElement inputText;
    @FindBy(css = ENABLE_BUTTON_AGAIN_CSS)
    public WebElement enableButtonAgain;



    public Factory(WebDriver driver) {
           PageFactory.
                   initElements(driver,
                           this);
    }
}
