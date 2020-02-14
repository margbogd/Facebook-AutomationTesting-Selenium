package com.fcb.prjct.test_suites.TS_UI_FB_LGN_01;

import com.fcb.prjct.pages.FacebookLoginPage.FbForgotaccountPage;
import com.fcb.prjct.test_utils.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @author mbogdanou
 * TC description: The user clicks on 'Forgot account?'
 * Verify Facebook's 'Login' page opens.
 * The user clicks on 'Forgot account?' option.
 * Verify that 'Forgot Account' page opens.
 * The user clicks on 'Cancel' button and redirects to the 'Login' page.
 */
public class TC_UI_FB_LGN_01_002 extends BaseTest {

    @Test
    public void TC_UI_FB_LGN_01_002() {

        FbForgotaccountPage fbForgot = PageFactory.initElements(driver, FbForgotaccountPage.class);
        fbForgot.verifyFBLoginPageOpens();
        fbForgot.clickForgotAccount();
        fbForgot.verifyForgotAccntPageOpens();
        fbForgot.clickCancel();
        fbForgot.redirectToFBLoginPage();
    }
}
