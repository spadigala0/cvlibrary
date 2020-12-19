/*
 * Swash Tech Ltd.
 *
 * BaseStepDefs.java
 *
 * ©️ 2020 Swash Tech Ltd. All Rights Reserved
 *
 * Author: Swapna Padigala
 * Date  : 19/12/2020
 * Time  : 16:02
 */
// ---- Package ---------------------------------------------------------------
package com.cvlibrary.stepdefs;

// ---- Import Statements -----------------------------------------------------

import com.cvlibrary.pom.HomePage;
import com.cvlibrary.pom.LoginPage;
import com.cvlibrary.pom.SearchPage;

public class BaseStepDefs {
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected SearchPage searchPage;

    public BaseStepDefs() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        searchPage = new SearchPage();
    }
}
