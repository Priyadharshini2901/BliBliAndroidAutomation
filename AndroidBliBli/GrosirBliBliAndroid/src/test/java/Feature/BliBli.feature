Feature: Purchasing a discounted groceries in blibli
  Scenario: User logs in with specific location and purchases
    Given blibli app is launched
    When User enters email as "testingdemo@gmail.com" and password as "Test@12345"
    Then User is succesfully logged in
    When User clicks on Add Address icon
    And User selects new Address bar
    Then User enters "Starbucks Harapan Indah" as the address
    And User chooses the Select location
    When User enters "122" doorNo "harry" as recipientName and "08129876540" as mobileNo
    Then User chooses Save Address
    And new Address is selected
    When User clicks on search
    Then Fresh By BliBli is suggested
    When User clicks on FreshByBliBli
    Then User clicks on Categories to choose "Rice& Cooking Essentials" and "Salt & Seasoning"
    And choose the product with discount
    When User clicks on the product
    Then User navigated to productDetails page
    When User changes the bank details to "Bank Mandiri"
    Then User Payment is successfull
    And User cancels the order
    When User confirms order cancellation
    Then "Order cancelled" message is displayed
    And User returns home






