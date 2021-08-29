/**
 @author Kim Ferko
 QA Automation Engineer
 Written by Kim Ferko, "Kim Ferko Test Automation Engineer Services", kim.ferko1@gmail.com
 Last update: 29.08.2021
 */
package com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.geolocationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Factory extends Constants {


    @FindBy(linkText = CLICK_GEOLOCATION_LINKTEXT)
    public WebElement clickGeolocation;
    @FindBy(xpath = WHERE_AM_I_XPATH)
    public WebElement whereAmI;
    @FindBy(css = SEE_IT_ON_GOOGLE_CSS)
    public WebElement seeItOnGoogle;

    @FindBy(xpath = ZGADZAM_SIE_XPATH)
    public WebElement zgadzamSie;
    @FindBy(xpath = CURRENT_LOCATION_XPATH)
    public WebElement currentLocation;

    public Factory(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}

