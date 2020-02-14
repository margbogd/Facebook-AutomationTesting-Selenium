package com.fcb.prjct.test_suites.TS_UI_FB_CRT_02;

import com.fcb.prjct.pages.FacebookLoginPage.FbSingUp;
import com.fcb.prjct.test_utils.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @author mbogdanou
 * TC description: The user creates new account
 * Verify Facebook's 'Login' page opens.
 * Verify 'Sign Up' visibility.
 * Fill the info: First name, Last name, Mobile number or email, New password.
 * Select the birthday month, day and year.
 * Verify that 'Providing your birthday' message appears when clicks the punctuation.
 * The user chooses Female, Male or Custom radio button option.
 * Verify that Gender message help appears when clicks the punctuation.
 * The user clicks the 'Sign Up' button.
 */
public class TC_UI_FB_CRT_02_001 extends BaseTest {

    @Test
    public void TC_UI_FB_CRT_02_001() {

        FbSingUp fbCreate = PageFactory.initElements(driver, FbSingUp.class);
        fbCreate.verifyFBLoginPageOpens();
        fbCreate.singUpView();
        fbCreate.giveMainInfo();
        fbCreate.insertBirthdayDropDwn();
        fbCreate.birthdayMessageHelp();
        fbCreate.radioBtnOption("Female");
        fbCreate.genderMessageHelp();
//        fbCreate.singUpButton();
    }
}
