package com.fcb.prjct.pages.FacebookLoginPage;

import com.fcb.prjct.test_utils.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FbLoginPage extends BaseTest {

    // Web Elements
    @FindBy(xpath = "//tr/following::input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//tr/following::input[@id='pass']")
    private WebElement currentPassword;

    @FindBy(xpath = "//label/following::input[@type='submit']")
    private WebElement loginBtn;

    @FindBy(xpath = "//a[contains(.,'Forgot account')]")
    private WebElement forgotAccount;
    // End of Web Elements

    /**
     * Constructor
     * @param driverL The local driver
     */
    public FbLoginPage(WebDriver driverL) {
        this.driver = driverL;
    }

    /**
     * Verify Login's inputs that are displayed: Email or Phone, Password.
     * @return This page
     */
    public FbLoginPage verifyInputsVisibility() {
        Assert.assertTrue(email.isDisplayed());
        Assert.assertTrue(currentPassword.isDisplayed());

        return this;
    }

    /**
     * Verify 'Login button' visibility
     * @return This page
     */
    public FbLoginPage verifyLoginBtnVisibility() {
        Assert.assertTrue(loginBtn.isDisplayed());

        return this;
    }

    /**
     * Fill the inputs: Email and Password
     * @return This page
     */
    public FbLoginPage fillInputs() {
        email.sendKeys("xx@gmail.com");
        currentPassword.sendKeys("12345");

        return this;
    }

    /**
     * Click 'Login' button
     * @return This page
     */
    public FbLoginPage clickLogin() {
        loginBtn.click();

        return this;
    }
}
