Feature: Purchase Function
  As a user  I should be able to complete the purchase with selected product
  Background:
    Given User logins with valid credentials "batch16@gmail.com" "eurotech"


  @wip
  Scenario: Der Benutzer meldet sich mit der vorhandenen E-Mail und dem Kennwort an und wechselt zum anderen Konto
    When The user clicks on "Restorative Produkte.
    Then The user selects a product and adds it to the cart.
    And The user proceeds to the "Checkout" page.

  @wip
  Scenario: Complete Purchase with Selected Product (Billing and Shipping Address Are the Same
    When The user clicks on "Restorative Produkte.
    Then The user selects a product and adds it to the cart.
    And The user proceeds to the "Checkout" page.
    And The user selects an same existing billing address and clicks continue button
    Then The user checks "Ship to the same address" (default)
    Then The user selects a "Payment Method" and clicks continue button
   And The user clicks Payment Information and clicks continue button
    Then The user clicks Confirm Order and clicks continue button

  @wip
  Scenario: Complete Purchase with Adding New Addrcess (Billing and Shipping Address Are Different
    When The user clicks on "Restorative Produkte.
    Then The user selects a product and adds it to the cart.
    And The user proceeds to the "Checkout" page.
    And The user chooses to add a different new address
    Then The user unchecks "Ship to the same address"and clicks continue button
    Then  The user selects a "Payment Method"
  # Then The user sees the Payment Information and clicks continue button
  #  And The user clicks "Confirm Order" and clicks continue button