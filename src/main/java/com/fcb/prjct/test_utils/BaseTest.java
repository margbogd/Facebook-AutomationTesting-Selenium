package com.fcb.prjct.test_utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    // Web Elements

    // End of Web Elements

    /**
     * Public for being seen from other TCs
     * Implement it so the other steps will know what are we talking about
     */
    public WebDriver driver;

    /**
     * Opens Chrome browser and application's url
     * Creates a new Chrome driver
     * Maximizes the window
     * Navigates to web application
     */
    @BeforeTest
    public void setUp() {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/mbogdanou/Desktop/Margarita/refactoring-pom-la/src/main/resources/chromedriver.exe"); //TODO CHANGE PATH BEFORE GITHUBING IT 

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
    }

    /**
     * Closes the browser's window
     */
    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    /**
     * This is a method that returns if an element exists or not
     *
     * @param by is the element locator
     * @return true when an element exists or false if not
     */
    public Boolean isElementPresent(By by) {
        // .findElements returns an array
        if (driver.findElements(by).size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This is a method for dynamic wait until the page is loaded
     *
     * @param driver this is the webdriver we use
     */
    public void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> expectation = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript
                                ("return document.readyState").toString().equals("complete");
                    }
                };
        try {
            Thread.sleep(500);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }

    /**
     * Verify Facebook's 'Login' page opens
     * @return This page
     */
    public BaseTest verifyFBLoginPageOpens() {
        waitForLoad(driver);
        Assert.assertTrue(isElementPresent(By.xpath("//h2[contains(.,'Connect with friends and the world " +
                "around you on Facebook')]")));

        return this;
    }
}
