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




