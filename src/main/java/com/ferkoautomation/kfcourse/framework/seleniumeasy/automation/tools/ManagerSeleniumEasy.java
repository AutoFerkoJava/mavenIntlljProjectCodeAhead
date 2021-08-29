package com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.tools;

import com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.alertsPage.AlertsPage;
import com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.dynamicControlsPage.DynamicControlsPage;
import com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.geolocationPage.GeolocationPage;
import com.ferkoautomation.kfcourse.framework.seleniumeasy.automation.loginform.LoginForm;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ManagerSeleniumEasy {
    public String internetherokuappUnderTest;
    //public String welcometointernetherokuapp;
    public String username;
    public String password;
    private String pathToGlobalVariables = "src\\test\\resources\\globalvariables.properties";
    public SoftAssert softAssert;
    public WebDriver driver;
    private ChromeOptions chromeOptions;
    public LoginForm loginForm;
    public AlertsPage alertsPage;
    public DynamicControlsPage dynamicControlsPage;
    public GeolocationPage geolocationPage;




    @BeforeSuite
    public void loadInGlobalVariables() throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(pathToGlobalVariables);
        properties.load(fileInputStream);
        internetherokuappUnderTest = properties.getProperty("url");
        //welcometointernetherokuapp = properties.getProperty("urlwelcome");
        username = properties.getProperty("username");
        System.out.println(username);
        password = properties.getProperty("password");
    }


    @Parameters({"browser"})
    @BeforeMethod
    public void prepareTests(@Optional("chrome") String browser) {
        System.out.println(WebDriverManager.chromedriver().getDriverVersions());
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            System.out.println(WebDriverManager.chromedriver().getDownloadedDriverVersion());
            chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("start-maximized");
            driver = new ChromeDriver(chromeOptions);
        }
        if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(internetherokuappUnderTest);
        //driver.get(welcometointernetherokuapp);
        loginForm = new  LoginForm(driver);
        loginForm.formAuthentication();
        loginForm.username(username);
        loginForm.password(password);
        loginForm.clickLogin();
        loginForm.clickLogout();
        softAssert = new SoftAssert();
        alertsPage = new AlertsPage(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);
        geolocationPage = new GeolocationPage(driver);

    }

    @AfterMethod
    public void terminateDriver(){
       driver.quit();


    }

}
