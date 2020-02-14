package com.fcb.prjct.test_suites.TS_UI_FB_LANG_03;

import com.fcb.prjct.pages.FacebookLoginPage.FbLanguage;
import com.fcb.prjct.test_utils.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @author mbogdanou
 * TC description: Choose another languge
 * Verify Facebook's 'Login' page opens.
 * Change the language of the page.
 * Click on plus button to choose another language.
 * Verify that 'All Languages' option are selected.
 * The user clicks on 'Close'button.
 * The user returns the language to English (US).
 * Click on plus button to choose another language.
 * After clicking on plus button for extra languages options, user chooses one of these languages: Dansk.
 */
public class TC_UI_FB_LANG_03_001 extends BaseTest {

    @Test
    public void TC_UI_FB_LANG_03_001() {

        FbLanguage fbLagn = PageFactory.initElements(driver, FbLanguage.class);
        fbLagn.verifyFBLoginPageOpens();
        fbLagn.languageOption("Română");
        fbLagn.clickPlusForOtherLanguage();
        fbLagn.verifyRegionOption("All Languages");
        fbLagn.closeLangOptionsBtn();
        fbLagn.returnLanguage();
        fbLagn.clickPlusForOtherLanguage();
        fbLagn.chooseAnotherLanguage("Western Europe");
    }
}
