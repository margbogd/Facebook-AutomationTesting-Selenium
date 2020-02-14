package com.fcb.prjct.test_suites.TS_UI_FB_LGN_01;

import com.fcb.prjct.pages.FacebookLoginPage.FbLoginPage;
import com.fcb.prjct.test_utils.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @author mbogdanou
 * TC description: Faceboon Login page opens
 * Verify Facebook's 'Login' page opens.
 * Verify Login's inputs that are displayed: Email or Phone, Password.
 * Verify 'Login button' visibility.
 */
public class TC_UI_FB_LGN_01_001 extends BaseTest {

    @Test
    public void TC_UI_FB_LGN_01_001() {

        FbLoginPage fbLgn = PageFactory.initElements(driver, FbLoginPage.class);
        fbLgn.verifyFBLoginPageOpens();
        fbLgn.verifyInputsVisibility();
        fbLgn.verifyLoginBtnVisibility();
//        fbLgn.fillInputs();
//        fbLgn.clickLogin();
    }
}
