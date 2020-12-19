/*
 * Swash Tech Ltd.
 *
 * BrowserFactory.java
 *
 * ©️ 2020 Swash Tech Ltd. All Rights Reserved
 *
 * Author: Swapna Padigala
 * Date  : 19/12/2020
 * Time  : 15:42
 */
// ---- Package ---------------------------------------------------------------
package com.cvlibrary.base;

import com.cvlibrary.utilities.Utils;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// ---- Import Statements -----------------------------------------------------
public class BrowserFactory {
    public static int PAGE_LOAD_TIMEOUT = 10;
    public static int IMPLICIT_WAIT = 3;
    private static WebDriver driver;

    public static WebDriver getWebDriver() {
        if (driver == null) {
            ChromeDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-errors");
            driver = new ChromeDriver();
            Utils.waitForPageLoadAndImplicitWait(driver, PAGE_LOAD_TIMEOUT, IMPLICIT_WAIT);
        }
        return driver;
    }

    public static void tearDown() {
        driver.quit();
        driver = null;
    }


}
