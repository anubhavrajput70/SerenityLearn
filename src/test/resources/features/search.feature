Feature: feature to verify search functionality

	@task
  Scenario: Validate google search is working
    Given opening web browser
    And user is on google search page
    When user enters a test in search box
    And hits enter
    Then user is navigated to search results
         