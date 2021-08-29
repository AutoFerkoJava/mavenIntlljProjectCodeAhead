package com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.geolocationPage;

import com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.tools.AdjustedInteractions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.geolocationPage.Constants.CURRENT_LOCATION_XPATH;
import static com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.geolocationPage.Constants.SEE_IT_ON_GOOGLE_CSS;

public class GeolocationPage {

    public WebDriver driver;
    public Factory elements;
    public AdjustedInteractions adjustedInteractions;

    public GeolocationPage(WebDriver driver){
        this.driver = driver;
        this.elements = new Factory(driver);
        this.adjustedInteractions = new AdjustedInteractions(driver);
    }

    public void clickGeolocation(){
        adjustedInteractions.click(elements.clickGeolocation);
    }
    public void whereAmI(){
        adjustedInteractions.click(elements.whereAmI);
    }
    public void seeItOnGoogle(){
        adjustedInteractions.doubleClick(By.cssSelector(SEE_IT_ON_GOOGLE_CSS));
    }
    public void zgadzamSie(){
        elements.zgadzamSie.click();
    }
    public void currentLocation(){adjustedInteractions.doubleClick(By.xpath(CURRENT_LOCATION_XPATH));}


}
