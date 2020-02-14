package com.fcb.prjct.pages.FacebookLoginPage;

import com.fcb.prjct.test_utils.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FbCreateAPage extends BaseTest {

    // Web Elements
    @FindBy(how = How.XPATH, using = "//div[@id='reg_pages_msg' and contains(.,'Create a Page')]")
    private WebElement createPg;
    // End of Web Elements

    /**
     * Constructor
     * @param driverL The local driver
     */
    public FbCreateAPage(WebDriver driverL) {
        this.driver = driverL;
    }

    /**
     * The user clicks on 'Create a Page'
     * @return This page
     */
    public FbCreateAPage createPage() {
        createPg.click();

        return this;
    }
}
