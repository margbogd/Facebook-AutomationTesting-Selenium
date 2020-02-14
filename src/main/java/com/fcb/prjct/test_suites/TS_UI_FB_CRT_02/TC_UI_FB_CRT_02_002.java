package com.fcb.prjct.test_suites.TS_UI_FB_CRT_02;

import com.fcb.prjct.pages.FacebookLoginPage.FbCreateAPage;
import com.fcb.prjct.pages.FacebookLoginPage.FbSingUp;
import com.fcb.prjct.test_utils.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @author mbogdanou
 * TC description: The user creates a page
 * Verify Facebook's 'Login' page opens.
 * The user clicks on 'Create a Page'.
 */
public class TC_UI_FB_CRT_02_002 extends BaseTest {

    @Test
    public void TC_UI_FB_CRT_02_002() {

        FbCreateAPage fbCreatePage = PageFactory.initElements(driver, FbCreateAPage.class);
        fbCreatePage.verifyFBLoginPageOpens();
        fbCreatePage.createPage();
    }
}
