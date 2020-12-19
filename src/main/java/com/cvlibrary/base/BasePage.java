/*
 * Swash Tech Ltd.
 *
 * BasePage.java
 *
 * ©️ 2020 Swash Tech Ltd. All Rights Reserved
 *
 * Author: Swapna Padigala
 * Date  : 19/12/2020
 * Time  : 15:40
 */
// ---- Package ---------------------------------------------------------------
package com.cvlibrary.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

// ---- Import Statements -----------------------------------------------------
public class BasePage {
    public WebDriver driver;

    public BasePage() {
        this.setup();
    }

    public void setup() {
        this.driver = BrowserFactory.getWebDriver();
        PageFactory.initElements(driver, this);

    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void acceptCookies() {
        driver.switchTo().frame("gdpr-consent-notice");
        WebElement acceptCookies = driver.findElement(By.linkText("Accept All"));
        acceptCookies.click();
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
