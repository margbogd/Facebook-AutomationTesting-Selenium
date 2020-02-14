package com.fcb.prjct.pages.FacebookLoginPage;

import com.fcb.prjct.test_utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FbForgotaccountPage extends BaseTest {

    // Web Elements
    @FindBy(xpath = "//a[contains(.,'Forgot account')]")
    private WebElement forgotAccount;

    @FindBy(xpath = "//span[@class='uiButtonText']")
    private WebElement cancelBtn;

    @FindBy(xpath = "//*[@id='blueBarDOMInspector']//div[1]//i")
    private WebElement redirectFB;
    // End of Web Elements

    /**
     * Constructor
     * @param driverL The local driver
     */
    public FbForgotaccountPage(WebDriver driverL) {
        this.driver = driverL;
    }

    /**
     * Click on 'Forgot account?'
     * @return This page
     */
    public FbForgotaccountPage clickForgotAccount() {
        forgotAccount.click();

        return this;
    }

    /**
     * Verify that 'Forgot Account' page opens
     * @return This page
     */
    public FbForgotaccountPage verifyForgotAccntPageOpens() {
        Assert.assertTrue(isElementPresent(By.xpath("//h2[@class='uiHeaderTitle']")));

        return this;
    }

    /**
     * Enter phone number to find the account
     * @return This page
     */


    /**
     * Click on 'Cancel' button
     * @return This page
     */
    public FbForgotaccountPage clickCancel() {
        cancelBtn.click();

        return this;
    }

    public FbForgotaccountPage redirectToFBLoginPage() {
        redirectFB.click();

        return this;
    }

}
