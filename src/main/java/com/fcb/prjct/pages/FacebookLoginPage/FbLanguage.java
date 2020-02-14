package com.fcb.prjct.pages.FacebookLoginPage;

import com.fcb.prjct.test_utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FbLanguage extends BaseTest {

    // Web Elements
    @FindBy(how = How.XPATH, using = "//div[@id='pageFooter']/ul/li[12]/a")
    private WebElement plusLangBtn;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Închide')]")
    private WebElement closeExtraLangBtn;

    @FindBy(how = How.XPATH, using = "//*[@id='pageFooter']/ul/li[2]/a")
    private WebElement returnEnglLang;
    // End of Web Elements

    /**
     * Constructor
     * @param driverL The local driver
     */
    public FbLanguage(WebDriver driverL) {
        this.driver = driverL;
    }

    /**
     * Change the language of the page
     * @param newlangOption The new language option
     * @return This page
     */
    public FbLanguage languageOption(String newlangOption) {
        if (newlangOption == "Ελληνικά") {
            driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[2]/a")).click();
        } else if (newlangOption == "Shqip") {
            driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[3]/a")).click();
        } else if (newlangOption == "Türkçe") {
            driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[4]/a")).click();
        } else if (newlangOption == "Български") {
            driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[5]/a")).click();
        } else if (newlangOption == "Română") {
            driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[6]/a")).click();
        } else if (newlangOption == "Русский") {
            driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[7]/a")).click();
        } else if (newlangOption == "العربية") {
            driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[8]/a")).click();
        } else if (newlangOption == "Deutsch") {
            driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[9]/a")).click();
        } else if (newlangOption == "Español") {
            driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[10]/a")).click();
        } else if (newlangOption == "Português (Brasil)") {
            driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[11]/a")).click();
        } else {
            driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[1]")).click();
        }

        return this;
    }

    /**
     * Click on plus button to choose another language
     * @return This page
     */
    public FbLanguage clickPlusForOtherLanguage() {
        plusLangBtn.click();

        return this;
    }

    /**
     * Verify that 'All Languages' option are selected
     * @param regionOption The chosen region option
     * @return This page
     */
    public FbLanguage verifyRegionOption(String regionOption) {
        waitForLoad(driver);
        if (regionOption == "All Languages") {
            driver.findElement(By.xpath("//*[@id='intl-region-link-container']/ul/li[1]/a")).isDisplayed();
        } else if (regionOption == "Africa and Middle East") {
            driver.findElement(By.xpath("//*[@id='intl-region-link-container']/ul/li[2]/a")).isDisplayed();
        } else if (regionOption == "Americas") {
            driver.findElement(By.xpath("//*[@id='intl-region-link-container']/ul/li[3]/a")).isDisplayed();
        } else if (regionOption == "Asia-Pacific") {
            driver.findElement(By.xpath("//*[@id='intl-region-link-container']/ul/li[4]/a")).isDisplayed();
        } else if (regionOption == "Eastern Europe") {
            driver.findElement(By.xpath("//*[@id='intl-region-link-container']/ul/li[5]/a")).isDisplayed();
        } else if (regionOption == "Western Europe") {
            driver.findElement(By.xpath("//*[@id='intl-region-link-container']/ul/li[6]/a")).isDisplayed();
        } else {
            closeExtraLangBtn.click();
        }

        return this;
    }

    /**
     * Click 'Close' button
     * @retunr This page
     */
    public FbLanguage closeLangOptionsBtn() {
        closeExtraLangBtn.click();
        waitForLoad(driver);

        return this;
    }

    /**
     * After turning on Română language, return to English (US)
     * @return This page
     */
    public FbLanguage returnLanguage() {
        waitForLoad(driver);
        returnEnglLang.click();

        return this;
    }

    /**
     * After clicking on plus button for extra languages options, user chooses one of these languages: France
     * @param regionOption The region options as 'Western Europe'
     * @return This page
     */
    public FbLanguage chooseAnotherLanguage(String regionOption) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='intl-region-link-container']/ul/li[1]/a")));

        if (regionOption == "All Languages") {
            driver.findElement(By.xpath("//*[@id='intl-region-link-container']/ul/li[1]/a")).isDisplayed();
            driver.findElement(By.xpath("//div[@id='intl-region-container']/div[1]//a[contains(.,'Dansk')]")).click();
        } else if (regionOption == "Western Europe") {
            driver.findElement(By.xpath("//*[@id='intl-region-link-container']/ul/li[6]/a")).isDisplayed();
            driver.findElement(By.xpath("//*[@id='intl-region-link-container']/ul/li[6]/a")).click();
            driver.findElement(By.xpath("//div[@id='intl-region-container']/div[6]//a[contains(.,'Dansk')]")).click();
        } else {
            closeExtraLangBtn.click();
        }

        return this;
    }
}
