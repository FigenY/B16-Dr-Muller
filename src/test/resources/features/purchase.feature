Feature: Purchase Function
  As a user  I should be able to complete the purchase with selected product
Background:
  Given User logins with valid credentials "batch16@gmail.com" "eurotech"

  Scenario: Der Benutzer meldet sich mit der vorhandenen E-Mail und dem Kennwort an und wechselt zum anderen Konto

    When The user clicks on "Restorative Produkte.
    Then The user selects a product and adds it to the cart.
    And The user proceeds to the "Checkout" page.


  Scenario: Complete Purchase with Selected Product (Billing and Shipping Address Are the Same
    And The user proceeds to the "Checkout" page.
    And The user selects an existing billing address and clicks continue button
    Then The user checks "Ship to the same address" (default)
    Then The user selects a "Shipping Method" and clicks continue button
    Then The user selects a "Payment Method" and clicks continue button
    And The user clicks "Confirm Order" and clicks continue button

  Scenario: Complete Purchase with Adding New Address (Billing and Shipping Address Are Different

    And The user chooses to add a new address
    Then The user fills in new address fields if "New Address" is selected and clicks continue button
    Then The user unchecks "Ship to the same address"
    And The user fills in the "Shipping Address" fields and clicks continue button
    Then The user selects a "Shipping Method" and clicks continue button
    Then  The user selects a "Payment Method"
#    Then The user sees the Payment Information and clicks continue button
    And The user clicks "Confirm Order" and clicks continue button

  Scenario:Incomplete Purchase Due to Missing Required Fields

    Then The user chooses to add a new address
    Then The user leaves required fields blank in "New Address"
    And The user attempts to proceed with the purchase