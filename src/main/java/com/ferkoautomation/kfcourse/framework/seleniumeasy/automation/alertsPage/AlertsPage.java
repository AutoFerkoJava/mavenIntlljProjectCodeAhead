/**
 @author Kim Ferko
 QA Automation Engineer
 Written by Kim Ferko, "Kim Ferko Test Automation Engineer Services", kim.ferko1@gmail.com
 Last update: 29.08.2021
 */
package com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.alertsPage;

import com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.tools.AdjustedInteractions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.alertsPage.Constants.*;

public class AlertsPage {
    public WebDriver driver;
    public Factory elements;
    public AdjustedInteractions adjustedInteractions;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
        this.elements = new Factory(driver);
        this.adjustedInteractions = new AdjustedInteractions(driver);
    }
    public void javaScriptAlerts(){
        adjustedInteractions.doubleClick(By.xpath(
                JAVA_SCRIPT_ALERTS_XPATH));
    }
    public void jsAlert() {
        adjustedInteractions.doubleClick(By.xpath(
                          JS_ALERT_XPATH));

    }
    public void jsConfirm() {
        adjustedInteractions.doubleClick(By.xpath(
        JS_CONFIRM_XPATH));
    }
     public void jsPrompt() {
        adjustedInteractions.doubleClick(By.xpath(
                JS_PROMPT_XPATH));

    }

}
