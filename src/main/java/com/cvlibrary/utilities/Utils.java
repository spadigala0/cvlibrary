/*
 * Swash Tech Ltd.
 *
 * Utils.java
 *
 * ©️ 2020 Swash Tech Ltd. All Rights Reserved
 *
 * Author: Swapna Padigala
 * Date  : 19/12/2020
 * Time  : 15:47
 */
// ---- Package ---------------------------------------------------------------
package com.cvlibrary.utilities;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

// ---- Import Statements -----------------------------------------------------
public class Utils {
    public static void waitForPageLoadAndImplicitWait(WebDriver driver, int pageWait, int implicitWait) {

        driver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(implicitWait, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);

    }
}
