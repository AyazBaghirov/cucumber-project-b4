Feature: Docuport Login Logout Feature

  Background: this is for navigating Docuport login page
    Given user is on Docuport login page


  @smoke @hw @B4G2A-180 @B4G2A-133
  Scenario: Login as a client
#    Given user is on Docuport login page
    When user enters username for client
    And user enters password for client
    And user click login button
    And user click continue button
    Then user validate left navigate items
      | Home          |
      | Received docs |
      | My uploads    |
      | Invitations   |


  @smoke @hw @B4G2A-180 @B4G2A-133
  Scenario: Login as an employee
    When user enters username for employee
    And user enters password for employee
    And user click login button
    Then user validate left navigate items
      | Home            |
      | Received docs   |
      | My uploads      |
      | Clients         |
      | Users           |
      | Bookkeeping     |
      | 1099 Form       |
      | Reconciliations |

  @smoke @hw @B4G2A-180 @B4G2A-133
  Scenario: Login as an advisor
    When user enters username for advisor
    And user enters password for advisor
    And user click login button
    Then user validate left navigate items
      | Home            |
      | Received docs   |
      | My uploads      |
      | Clients         |
      | Invitations     |
      | Users           |
      | Leads           |
      | Bookkeeping     |
      | 1099 Form       |
      | Reconciliations |

  @smoke @hw @B4G2A-180 @B4G2A-133
  Scenario: Login as a supervisor
    When user enters username for supervisor
    And user enters password for supervisor
    And user click login button
    Then user validate left navigate items
      | Home            |
      | Received docs   |
      | My uploads      |
      | Clients         |
      | Users           |
      | Leads           |
      | Bookkeeping     |
      | 1099 Form       |
      | Reconciliations |

  @dataTableLogin @smoke @B4G2A-180 @B4G2A-133
  Scenario: Login as a client map practice
    When user enters credentials
      | username | b1g1_client@gmail.com |
      | password | Group1                |
    Then user should bbe able to see the home for client