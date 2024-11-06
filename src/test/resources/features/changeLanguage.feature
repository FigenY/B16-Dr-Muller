Feature:User can Change Language
  As a user, I should be able to the change language

  Background:
    Given User logins with valid credentials "batch16@gmail.com" "eurotech"

  Scenario:Verify Language Change Updates Page Title, Navigation Bar, and Headings
    When The user changes the language to English using the toggle at the top right.
    Then The user sees that the page title has not been updated in English.

  Scenario:Verify Full Translation of Menu Items and Interactive Elements After Language Switch
    When The user is on the homepage.
    Then The user changes the language to German using the toggle.
    And The user sees that the page title has not been updated in German.
