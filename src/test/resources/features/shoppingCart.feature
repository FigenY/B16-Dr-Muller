Feature: Shopping Cart Function
  As a user I should be able to add items/products to the cart.

  Background:
    Given User logins with valid credentials "juniorsdet@gmail.com" "Tester1234"
    When The user clicks Home page button

  Scenario: Verify that the shopping cart icon is clickable - B16DP-79
    When The user clicks on the shopping cart icon
    Then The user should be able to see the shopping cart page


  Scenario: Verify that the user is able to successfully add items into the cart - B16DP-80
    And The user scrolls down
    And The user clicks on "Liners" category
    And The user clicks Add to cart button on the "1" item
    And The user clicks Add to cart button on the "2" item
    Then The user should be able to see on the top of page "The product has been added to your shopping cart"


  Scenario: Verify that the user is not able to add items into the cart - B16DP-81 - neg.Test with BUG
    #When The user is on the english page
    #And The user scrolls down
    #And The user clicks on "Bleaching" category
    #Then The user can not clicks on "Add to cart" button on the first item -> BUG!!!


  Scenario: Verify that the user is able to increase and decrease the item's quantity - B16DP-86
    When The user scrolls down
    And The user clicks on "Etching" category
    And The user clicks Add to cart button on the "1" item
    And The user clicks Add to cart button on the "2" item
    Then The user should be able to see on the top of page "The product has been added to your shopping cart"
    When The user clicks on the shopping cart icon
    Then The user should be able to see the shopping cart page
    And The user sets the quantity of the first item to "2"
    And The user sets the quantity of the second item to "2"
    Then The user should see the quantity values updated to "2" and "2" on the shopping cart page
