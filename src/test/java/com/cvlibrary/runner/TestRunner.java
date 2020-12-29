/*
 * Swash Tech Ltd.
 *
 * TestRunner.java
 *
 * ©️ 2020 Swash Tech Ltd. All Rights Reserved
 *
 * Author: Swapna Padigala
 * Date  : 19/12/2020
 * Time  : 15:48
 */
// ---- Package ---------------------------------------------------------------
package com.cvlibrary.runner;

// ---- Import Statements -----------------------------------------------------


import com.cvlibrary.base.BrowserFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.cvlibrary.stepdefs"},
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"})
@RunWith(Cucumber.class)
public class TestRunner {
    @AfterClass
    public static void tearDown() {
        BrowserFactory.tearDown();
    }
}
