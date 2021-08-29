package com.ferkoautomation.kfcourse.framework.selenium.tests.dynamicControlsTests;

import com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.tools.ManagerSeleniumEasy;
import org.testng.annotations.Test;

public class Story03AddRemoveCheckboxTest extends ManagerSeleniumEasy {

    @Test
    public void tc03_AddRemoveCheckbox (){
        //driver.navigate().to("https://the-internet.herokuapp.com/");
        driver.get("https://the-internet.herokuapp.com/");
        dynamicControlsPage.clickDynamicControlsLink();
        dynamicControlsPage.clickCheckbox();
        dynamicControlsPage.removeCheckbox();
        dynamicControlsPage.addButton();
        dynamicControlsPage.clickCheckBoxAgain();
        dynamicControlsPage.removeAdd();

        dynamicControlsPage.enableButton();
        dynamicControlsPage.buttonEnabled();
        dynamicControlsPage.disableButton();
        dynamicControlsPage.buttonDisabled();
        dynamicControlsPage.inputText("Test");
        dynamicControlsPage.enableButtonAgain();



    }

}
