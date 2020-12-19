/*
 * Swash Tech Ltd.
 *
 * SearchPageStepDefs.java
 *
 * ©️ 2020 Swash Tech Ltd. All Rights Reserved
 *
 * Author: Swapna Padigala
 * Date  : 19/12/2020
 * Time  : 16:20
 */
// ---- Package ---------------------------------------------------------------
package com.cvlibrary.stepdefs;

// ---- Import Statements -----------------------------------------------------

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPageStepDefs extends BaseStepDefs {

    @Given("I want to navigate to homepage  with given url {string}")
    public void iWantToNavigateToHomepageWithGivenUrl(String arg0) {
        searchPage.navigateTo(arg0);
    }

    @When("Enter jobtitle {string}")
    public void enterJobtitle(String arg0) {
        searchPage.setJobTitle(arg0);
    }

    @And("Enter location {string}")
    public void enterLocation(String arg0) {
        searchPage.setLocation(arg0);
    }


    @And("Click on more search option")
    public void clickOnMoreSearchOption() {
        searchPage.clickMoreSearchOption();
    }

    @And("Enter minimum salary {string}")
    public void enterMinimumSalary(String arg0) {
        searchPage.setMinSalary(arg0);
    }

    @And("Enter maximum salary {string}")
    public void enterMaximumSalary(String arg0) {
        searchPage.setMaxSalary(arg0);
    }


    @Then("Click on findjobs button")
    public void clickOnFindjobsButton() {
        searchPage.clickFindJobsButton();
    }

    @And("Select distance {string}")
    public void selectDistance(String arg0) {
        searchPage.selectDistance(arg0);
    }

    @And("Select salary type {string}")
    public void selectSalaryType(String arg0) {
        searchPage.setSalaryType(arg0);
    }

    @And("Select job type {string}")
    public void selectJobType(String arg0) {
        searchPage.setJobType(arg0);
    }

    @And("Click on jobs link")
    public void clickOnJobsLink() {
        searchPage.clickJobs();
    }

    @And("User selections {string}, {string}, {string}, {string}, {string}, {string}, {string} should be available on the left hand side panel")
    public void userSelectionsShouldBeAvailableOnTheLeftHandSidePanel(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
//        assertEquals(arg0,searchPage.getSearchKeywords());
//        assertEquals(arg2,searchPage.getSearchDistance());
//        assertEquals(arg1,searchPage.getSearchLocation());
    }

    @Then("User should navigate to search results page for selected {string}, {string} and {string}")
    public void userShouldNavigateToSearchResultsPageForSelectedAnd(String arg0, String arg1, String arg2) {
        // assertEquals("Contract Tester jobs in London",searchPage.getSearchedText());
        // String result = String.format("%s %s jobs in %s", arg0, arg1, arg2);
        // assertEquals(result, searchPage.getSearchedText());
    }
}
