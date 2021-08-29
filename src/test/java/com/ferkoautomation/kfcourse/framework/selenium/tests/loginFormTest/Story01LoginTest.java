/**
 @author Kim Ferko
 QA Automation Engineer
 Written by Kim Ferko, "Kim Ferko Test Automation Engineer Services", kim.ferko1@gmail.com
 Last update: 29.08.2021
 */
package com.ferkoautomation.kfcourse.framework.selenium.tests.loginFormTest;
import com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.tools.ManagerSeleniumEasy;
import org.testng.annotations.Test;

public class Story01LoginTest extends ManagerSeleniumEasy {

    @Test
    public  void tc01_LoginTest() {
       System.out.println("Now this Framework will Login Before Every Test");
       System.out.println("Story01LoginTest --> Passed!!!");
       softAssert.assertAll();


    }


 }




