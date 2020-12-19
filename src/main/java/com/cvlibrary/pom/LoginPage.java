/*
 * Swash Tech Ltd.
 *
 * LoginPage.java
 *
 * ©️ 2020 Swash Tech Ltd. All Rights Reserved
 *
 * Author: Swapna Padigala
 * Date  : 19/12/2020
 * Time  : 15:50
 */
// ---- Package ---------------------------------------------------------------
package com.cvlibrary.pom;

import com.cvlibrary.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// ---- Import Statements -----------------------------------------------------
public class LoginPage extends BasePage {
    @FindBy(css = "#nav-login")
    private WebElement loginLink;
    @FindBy(css = "#cand_email")
    private WebElement userName;
    @FindBy(css = "#cand_password")
    private WebElement password;
    @FindBy(css = "input[value='Login as jobseeker']")
    private WebElement loginButton;
    @FindBy(css = "a[class='site-nav__link site-nav__link--cand']")
    private WebElement candidateName;

    public void clickLoginLink() {
        loginLink.click();
        acceptCookies();
    }

    public void setUserName(String uName) {
        userName.sendKeys(uName);
    }

    public void setPassword(String pwd) {
        password.sendKeys(pwd);

    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getCandidateName() {
        return candidateName.getText();

    }
}
