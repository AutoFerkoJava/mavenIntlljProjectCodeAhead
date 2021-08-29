package com.ferkoautomation.kfcourse.framework.selenium.tests.alertTests;

import com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.tools.ManagerSeleniumEasy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Story02AlertsJsTest extends ManagerSeleniumEasy {
    @Test
    public  void tc02_AlertsJsTest() {
        //driver.navigate().to("https://the-internet.herokuapp.com/");
        driver.get("https://the-internet.herokuapp.com/");
        alertsPage.javaScriptAlerts();
        alertsPage.jsAlert();
        driver.switchTo().alert().accept();
        alertsPage.jsConfirm();
        driver.switchTo().alert().dismiss();
        alertsPage.jsPrompt();
        driver.switchTo().alert().getText();
        driver.switchTo().alert().sendKeys("Test Passed");
        System.out.println("Now this Framework will Login Before Every Test");
        System.out.println("Story02AlertsJsTest --> Passed!!!");
        softAssert.assertAll();

    }

}
