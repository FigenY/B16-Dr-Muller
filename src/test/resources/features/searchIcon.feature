Feature: Search Icon Function
  As a user I should be able to search in the search engine.

  Background:
    Given User logins with valid credentials "juniorsdet@gmail.com" "Tester1234"
    When The user clicks on the searchbar

    Scenario: Verify that the product is displayed when the user searches for the item on the website - B16DP-23
      And The user enters a product name "Adler" on the searchbar
      Then The user should be able to see that the product is displayed when the user searches for the item on the website

    Scenario: Verify that when a user clicks on a product from the search results, they are redirected to the detail page of the relevant product - B16DP-32
      And The user enters a product name "Adler" on the searchbar
      Then The user should be able to see that the product is displayed when the user searches for the item on the website
      And The user clicks on the product name in the search bar
      Then The user should be able to see the detail page of the relevant product

    Scenario: Verify that the message "product not found" is displayed when the user searches for the item that is not on the website - B16DP-33
      When The user enters a product name "Apple" on the searchbar
      And The user clicks on the search icon
      Then The user should be able to see the message "No products were found that matched your criteria." on the search page.