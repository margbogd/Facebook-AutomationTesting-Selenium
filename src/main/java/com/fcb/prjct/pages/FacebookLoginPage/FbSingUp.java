package com.fcb.prjct.pages.FacebookLoginPage;

import com.fcb.prjct.test_utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FbSingUp extends BaseTest {

    // Web Elements
    @FindBy(xpath = "//h2[contains(.,'Sign Up')]")
    private WebElement signUpTitle;

    @FindBy(how = How.XPATH, using = "//input[@name='firstname' and contains(@class,'inputtext')]")
    private WebElement firstname;

    @FindBy(how = How.XPATH, using = "//input[@name='lastname' and contains(@class,'inputtext')]")
    private WebElement lastname;

    @FindBy(how = How.XPATH, using = "//input[@name='reg_email__' and contains(@class,'inputtext')]")
    private WebElement phoneOrmail;

    @FindBy(how = How.XPATH, using = "//input[@name='reg_passwd__' and contains(@class,'inputtext')]")
    private WebElement newPass;

    @FindBy(how = How.XPATH, using = "//*[@id='month']")
    private WebElement birthMonth;

    @FindBy(how = How.XPATH, using = "//option[contains(.,'Mar')]")
    private WebElement monthOption;

    @FindBy(how = How.XPATH, using = "//*[@id='day']")
    private WebElement birthDay;

    @FindBy(how = How.XPATH, using = "//option[contains(.,'7')]")
    private WebElement dayOption;

    @FindBy(how = How.XPATH, using = "//*[@id='year']")
    private WebElement birthYear;

    @FindBy(how = How.XPATH, using = "//option[contains(.,'1990')]")
    private WebElement yearOption;

    @FindBy(how = How.XPATH, using = "//a[@id='birthday-help']")
    private WebElement birthHelp;

    @FindBy(how = How.XPATH, using = "//div//following::b[contains(text(), 'Providing your birthday')]")
    private WebElement birthMsg;

    @FindBy(how = How.XPATH, using = "//*[@id='globalContainer']/div[3]//preceding::a[text()='Close']")
    private WebElement closeHelp;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Female')]")
    private WebElement femaleOption;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Male')]")
    private WebElement maleOption;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Custom')]")
    private WebElement customOption;

    @FindBy(how = How.XPATH, using = "//a[@id='gender-help']")
    private WebElement genderHelp;

    @FindBy(how = How.XPATH, using = "//div//following::div[contains(text(), 'You can change who sees your gender')]")
    private WebElement genderMsg;

    @FindBy(how = How.XPATH, using = "//button[@name='websubmit' and contains(.,'Sign Up')]")
    private WebElement signUpBtn;
    // End of Web Elements

    /**
     * Constructor
     * @param driverL The local driver
     */
    public FbSingUp(WebDriver driverL) {
        this.driver = driverL;
    }

    /**
     * Verify 'Sign Up' visibility
     * @return This page
     */
    public FbSingUp singUpView() {
        Assert.assertTrue(signUpTitle.isDisplayed());

        return this;
    }

    /**
     * Fill the info: First name, Last name, Mobile number or email, New password
     * @return This page
     */
    public FbSingUp giveMainInfo() {
        firstname.sendKeys("Klelia");
        lastname.sendKeys("Cream");
        phoneOrmail.sendKeys("xx@gmail.com");
        newPass.sendKeys("1234567");

        return this;
    }

    /**
     * Select the birthday month, day and year
     * @return This page
     */
    public FbSingUp insertBirthdayDropDwn() {
        birthMonth.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='month']/option")));
        monthOption.click();

        birthDay.click();
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='day']/option")));
        dayOption.click();

        birthYear.click();
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='year']/option")));
        yearOption.click();

        return this;
    }

    /**
     * Verify that 'Providing your birthday' message help appears when clicks the punctuation
     * @return This page
     */
    public FbSingUp birthdayMessageHelp() {
        birthHelp.click();
        Assert.assertTrue(birthMsg.isDisplayed());
        closeHelp.click();

        return this;
    }

    /**
     * Choose Female, Male or Custom radio button option
     * @return This page
     */
    public FbSingUp radioBtnOption(String gender) {
        if (gender == "Female") {
            femaleOption.click();
        } else if (gender == "Male") {
            maleOption.click();
        } else {
            customOption.click();
        }

        return this;
    }

    /**
     * Verify that Gender message help appears when clicks the punctuation
     * @return This page
     */
    public FbSingUp genderMessageHelp() {
        genderHelp.click();
        Assert.assertTrue(genderMsg.isDisplayed());
        closeHelp.click();

        return this;
    }

    /**
     * The user clicks 'Sign Up' button
     * @return This page
     */
    public FbSingUp singUpButton() {
        signUpBtn.click();

        return this;
    }
}
