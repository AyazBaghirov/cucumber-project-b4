Feature: Smart bear software Web orders

  @SmartBear @smoke
  Scenario: user should be bale to place order and order should be seen in page
    Given user is already logged in and navigated to order page
    When user selects product type "<product>"
    And user enters quantity "<quantity>"
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<City>"
    And user enters state "<state>"
    And user enters zip "<zip>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiration date "<expireDate>"
    And user enters process order button
    Then user should see "<customerName>" in the first row of the table

      |product     | quantity | customerName | street          | city         | state    | zip   |cardType | cardNumber | expireDate|
      |FamilyAlbum |   2      | Chuck Norris |1100 Long way dr | Chantilly    | Virginia | 22011 | Visa    | 1234567890 |  02/12    |

