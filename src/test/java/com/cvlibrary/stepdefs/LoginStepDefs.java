/*
 * Swash Tech Ltd.
 *
 * LoginStepDefs.java
 *
 * ©️ 2020 Swash Tech Ltd. All Rights Reserved
 *
 * Author: Swapna Padigala
 * Date  : 19/12/2020
 * Time  : 16:05
 */
// ---- Package ---------------------------------------------------------------
package com.cvlibrary.stepdefs;

// ---- Import Statements -----------------------------------------------------

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStepDefs extends BaseStepDefs {
    @Given("I want to navigate  with given url {string}")
    public void iWantToNavigateWithGivenUrl(String arg0) {

        loginPage.navigateTo(arg0);
        assertTrue(homePage.isLogoDisplayed());
    }

    @When("I Click on Login link")
    public void iClickOnLoginLink() {
        loginPage.clickLoginLink();

    }

    @And("I click on Login button")
    public void iClickOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should navigate to the registered user's Job Search page")
    public void iShouldNavigateToSearchPage() {
        assertEquals("Job Search - Find 175,000 UK jobs on CV-Library", loginPage.getTitle());

    }

    @And("I enter user name {string}")
    public void iEnterUserName(String arg0) {
        loginPage.setUserName(arg0);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String arg0) {
        loginPage.setPassword(arg0);
    }

    @And("It should display registered user first name.")
    public void itShouldDisplayRegisteredUserFirstName() {
        assertEquals("CVLibrary", loginPage.getCandidateName().trim());

    }
}

