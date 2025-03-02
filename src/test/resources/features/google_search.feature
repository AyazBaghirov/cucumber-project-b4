Feature: Google Search Functionality Title Verification
  User Story: As a user, when i am on the Google search page
  i should able to search whatever i want and see the releveant information

  @google_search @smoke
  Scenario: Search functionality result title verification
    Given user in on Google search page
    When user types Loop Academy in the google search box and clicks enter
    Then user should see Loop Academy - Google search in the google title

    @google_search @smoke
    Scenario: Search functionality result title verification
      Given user in on Google search page
      When user types "Loop Academy" in the google search box and clicks enter
      Then user should see "Loop Academy - Google search" in the google title

  @google_search @smoke
  Scenario: Search functionality result title verification
    Given user in on Google search page
    When user types "Nadir Shafiyev" in the google search box and clicks enter
    Then user should see "Nadir Shafiyev - Google search" in the google title