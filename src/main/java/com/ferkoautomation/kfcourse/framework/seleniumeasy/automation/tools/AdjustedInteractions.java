package com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.tools;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdjustedInteractions {

    public WebDriver driver;
    public WebDriverWait wait;
    int MAX_NUMBER_OF_LOOP_ATTEMPTS = 10;
    private By locator;

    public AdjustedInteractions(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }
    //Can Pass OverLoad Methods
    public void click(WebElement webElement) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
    }
    //Can Pass OverLoad Methods
    public void click(WebElement webElement, By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        webElement.click();
    }

    //This method allows to avoid Duplicates
    public void sendKeys(WebElement webElement, By by, String keysToSend) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        int loopNumber = 0;

        while (loopNumber <= MAX_NUMBER_OF_LOOP_ATTEMPTS) {
            loopNumber++;
            webElement.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            webElement.sendKeys(keysToSend);
            if (webElement.getAttribute("value").equals(keysToSend)) {
                break;
            }

        }

    }
    /**
     * Wait for alert present and then switch to it
     */
    protected Alert switchToAlert() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert();
    }
    /**
     * Perform scroll to the bottom
     */
    public void scrollToBottom() {
        System.out.println("Scrolling to the bottom of the page");
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    /**
     * Perform DoubleClick
     */
    public void doubleClick(By by) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Actions action_move = new Actions(driver);
        action_move.moveToElement(driver.findElement(by)).doubleClick()
                .build().perform();
    }

    protected Alert clickMultipleWindows() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert();
    }


}