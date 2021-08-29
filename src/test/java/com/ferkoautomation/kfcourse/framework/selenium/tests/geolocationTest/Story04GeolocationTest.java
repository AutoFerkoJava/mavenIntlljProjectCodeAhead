package com.ferkoautomation.kfcourse.framework.selenium.tests.geolocationTest;

import com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.tools.ManagerSeleniumEasy;
import org.testng.annotations.Test;




    public class Story04GeolocationTest extends ManagerSeleniumEasy {
    @Test
    public  void tc04_GeolocationTest() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
        geolocationPage.clickGeolocation();
        geolocationPage.whereAmI();
        geolocationPage.seeItOnGoogle();
       // driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();
        geolocationPage.zgadzamSie();
        geolocationPage.currentLocation();

    }

}
