Feature: Contact Icon function
  As a user, I should be able to see contact information and get in touch.

  Background:
    Given User logins with valid credentials "batch16@gmail.com" "eurotech"
    When The user locates and clicks on the "Contact" link to open the Contact page.

  Scenario:Verify Visibility and Clickability of Address
    Then Verify that the Address is visible on the Contact page.
    And The user clicks on the Address link.

  Scenario:Verify Visibility and Clickability of WhatsApp
    Then The user sees that the WhatsApp icon is visible on the Contact page
    And The user clicks on the WhatsApp icon.

  Scenario:Verify Visibility and Clickability of Phone Number
    Then The user sees that the Phone Number is visible on the Contact page.
    And The user clicks on the Phone Number.

  Scenario:Verify Visibility and Clickability of Email
    Then The user sees that the Email address is visible on the Contact page.
    And The user clicks on the Email address.

  Scenario:Verify Contact Form Visibility, Fillability and Confirmation Message on Successful Submission and Verify Visibility and Clickability of Address
    Then The user fills the Name field.
    Then The user fills the Email field.
    Then The user fills the Subject field.
    Then The user fills the Enquriy field.



