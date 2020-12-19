/*
 * Swash Tech Ltd.
 *
 * SearchPage.java
 *
 * ©️ 2020 Swash Tech Ltd. All Rights Reserved
 *
 * Author: Swapna Padigala
 * Date  : 19/12/2020
 * Time  : 16:01
 */
// ---- Package ---------------------------------------------------------------
package com.cvlibrary.pom;

import com.cvlibrary.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

// ---- Import Statements -----------------------------------------------------
public class SearchPage extends BasePage {
    @FindBy(id = "keywords")
    private WebElement jobTitle;
    @FindBy(id = "location")
    private WebElement location;
    @FindBy(id = "distance")
    private WebElement distance;
    @FindBy(id = "toggle-hp-search")
    private WebElement moreSearch;
    @FindBy(id = "salarymin")
    private WebElement minSalary;
    @FindBy(id = "salarymax")
    private WebElement maxSalary;
    @FindBy(id = "salarytype")
    private WebElement salaryType;
    @FindBy(id = "tempperm")
    private WebElement jobType;
    @FindBy(id = "hp-search-btn")
    private WebElement findJobs;
    @FindBy(id = "searchjobs")
    private WebElement searchJobs;
    @FindBy(id = "srchkeywords")
    private WebElement searchKeywords;
    @FindBy(id = "geo")
    private WebElement searchLocation;
    @FindBy(id = "distance")
    private WebElement searchDistance;
    @FindBy(css = "div[class='search-header__title'] h1")
    private WebElement searchedText;

    public void setJobTitle(String jobTitle) {
        this.jobTitle.sendKeys(jobTitle);
    }

    public void setLocation(String loc) {
        location.clear();
        location.sendKeys(loc);
    }

    public void selectDistance(String distance) {
        Select s = new Select(this.distance);
        s.selectByVisibleText(distance);
    }

    public void clickMoreSearchOption() {
        moreSearch.click();
    }

    public void setMinSalary(String sal) {
        minSalary.sendKeys(sal);
    }

    public void setMaxSalary(String sal) {
        maxSalary.sendKeys(sal);
    }

    public void setSalaryType(String salType) {
        Select s = new Select(salaryType);
        s.selectByVisibleText(salType);
    }

    public void setJobType(String jobType) {
        Select s = new Select(this.jobType);
        s.selectByVisibleText(jobType);
    }

    public void clickFindJobsButton() {
        findJobs.click();
    }

    public void clickJobs() {
        searchJobs.click();
    }

    public String getSearchKeywords() {
        return searchKeywords.getText();
    }

    public String getSearchLocation() {
        return new Select(searchLocation).getFirstSelectedOption().getText();
    }

    public String getSearchDistance() {
        return searchDistance.getText();
    }

    public String getSearchedText() {
        return searchedText.getText();
    }
}
