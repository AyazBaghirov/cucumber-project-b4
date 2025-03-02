
Feature: Docuport Login Logout Feature


    Given user is on Docuport login page


  @xry @B4G2A-172 @B4G2A-133 @smoke
  Scenario: Login as a client
#    Given user is on Docuport login page
    Given user is on Docuport login page
    When user enters username for client
    And user enters password for client
    And user click login button
    Then user should be able to see the home for client