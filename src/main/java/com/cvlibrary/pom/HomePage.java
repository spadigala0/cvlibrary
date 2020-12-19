/*
 * Swash Tech Ltd.
 *
 * HomePage.java
 *
 * ©️ 2020 Swash Tech Ltd. All Rights Reserved
 *
 * Author: Swapna Padigala
 * Date  : 19/12/2020
 * Time  : 15:44
 */
// ---- Package ---------------------------------------------------------------
package com.cvlibrary.pom;

import com.cvlibrary.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// ---- Import Statements -----------------------------------------------------
public class HomePage extends BasePage {
    @FindBy(css = "img[alt='CV-Library Logo']")
    WebElement logo;

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

}
