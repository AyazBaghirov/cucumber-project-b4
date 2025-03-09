Feature: Docuport Sample Scenario

  @sampleDocuport
  Scenario: Practice click buttons on different pages as a client
    Given user is on Docuport login page
    When user inserts "b1g1_client@gmail.com" to "username" field on "Login" page
    When user inserts "Group1" to "password" field on "Login" page
    And user clicks "login" button on "Login" page
    And user clicks "continue" button on "Choose account" page
    Then user should be able to see the home for client
    And user clicks "Received Doc" button on "Left Navigate" page
    And user clicks "Search" button on "Received Doc" page
    And user inserts "tax document" to "Document name" field on "Received Doc" page
    And user selects "tax return" to "Tags" field on "Received Doc" page
    And user selects "3-7-2025" to "Upload date" field on "Received Doc" page
    And user selects "Batch1 Group1" to "Upload by" field on "Received Doc" page
    And user clicks "Search2" button on "Received Doc" page
    And user validate message "Your search returned no results. Make sure you search properly" on "Received Doc" page

