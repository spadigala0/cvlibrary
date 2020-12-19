Feature: CVLibrary - Search Page

  Scenario Outline: Search for jobs
    Given I want to navigate to homepage  with given url "https://www.cv-library.co.uk/"
    When Enter jobtitle "<job title>"
    And Enter location "<location>"
    And Select distance "<distance>"
    And Click on more search option
    And Enter minimum salary "<salary min>"
    And Enter maximum salary "<salary max>"
    And Select salary type "<salary type>"
    And Select job type "<job type>"
    And Click on findjobs button
    Then User should navigate to search results page for selected "<job type>", "<job title>" and "<location>"
    And User selections "<job title>", "<location>", "<distance>", "<salary min>", "<salary max>", "<salary type>", "<job type>" should be available on the left hand side panel
    And Click on jobs link

    Examples:
      | job title | location | salary min | salary max | distance      | salary type | job type  |
      | Tester    | London   | 25000      | 35000      | up to 1 mile  | Per annum   | Contract  |
      | Java      | TW3 4JJ  | 40000      | 50000      | up to 2 miles | Per week    | Permanent |
      | Developer | Reading  | 30000      | 550000     | up to 5 miles | Per month   | Permanent |
