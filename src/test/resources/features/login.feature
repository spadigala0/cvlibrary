Feature: CVLibrary - Login Feature

  Scenario Outline: As a Registered user I want to Login into the application with valid credentials
    Given I want to navigate  with given url "https://www.cv-library.co.uk/"
    When I Click on Login link
    And I enter user name "<user name>"
    And I enter password "<password>"
    And I click on Login button
    Then I should navigate to the registered user's Job Search page
    And It should display registered user first name.

    Examples:
      | user name                     | password |
      | cvlibrary.test@mailinator.com | cv.user1 |
