package com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.dynamicControlsPage;

import com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.dynamicControlsPage.Factory;
;
import com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.tools.AdjustedInteractions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicControlsPage {

    public WebDriver driver;
    public Factory elements;
    public AdjustedInteractions adjustedInteractions;

    public DynamicControlsPage(WebDriver driver){
        this.driver = driver;
        this.elements = new Factory(driver);
        this.adjustedInteractions = new AdjustedInteractions(driver);

    }
    public void clickDynamicControlsLink(){
        adjustedInteractions.click(elements.clickDynamicControls);
    }
    /**
    Elements for Checkbox Remove Add
    */
    public void clickCheckbox() {
        adjustedInteractions.click(elements.clickCheckbox);
    }
    public void removeCheckbox() {
        adjustedInteractions.click(elements.removeCheckbox);
    }
    public void addButton(){
        adjustedInteractions.click(elements.addButton);
    }
    public void clickCheckBoxAgain(){
        adjustedInteractions.click(elements.clickCheckboxAgain);
    }
    public void removeAdd(){
        adjustedInteractions.click(elements.removeAdd);
    }

    /**
     Elements for Enable Disable Button
     */

    public void enableButton(){
        adjustedInteractions.click(elements.enableButton);
    }
    public void buttonEnabled(){
        adjustedInteractions.click(elements.buttonEnabled);
    }
    public void disableButton(){
        adjustedInteractions.click(elements.disableButton);
    }
    public void buttonDisabled(){
        adjustedInteractions.click(elements.buttonDisabled);
    }

    public void inputText(String inputText ) {
        adjustedInteractions.sendKeys(elements.inputText,
                By.cssSelector(Constants.INPUT_TEXT_CSS),
        inputText);

    }
    public void enableButtonAgain(){
        adjustedInteractions.click(elements.enableButtonAgain);

    }


}
