Feature: My Account-Address Info Functionality

  @addNewAddress
  Scenario Outline: Verify that user can add the new address - B16DP-82
    Given User logins with valid credentials for Ersin
    When The user clicks on the account button
    And The user clicks on the address button
    And The user clicks on the add new button
    And The user clicks on the "<infoBoxes>" info boxes respectively
    And The user enters "<informations>" informations
    And The user selects country
    And The user selects State Province
    And The user clicks on the save button
    Then The user should be able to add a new address

    Examples:
      | infoBoxes             | informations      |
      | Address_FirstName     | John              |
      | Address_LastName      | Doe               |
      | Address_Email         | JohnDoe@gmail.com |
      | Address_City          | Berlin            |
      | Address_Address1      | Muster Str 1      |
      | Address_ZipPostalCode | 12345             |
      | Address_PhoneNumber   | 123456            |




  @updateAddress
  Scenario Outline: Verify that user can add the new address - B16DP-83
    Given User logins with valid credentials for Ersin
    When The user clicks on the account button
    And The user clicks on the address button
    And The user clicks on the edit button
    And The user clicks on the "<infoBoxes>" info boxes respectively and clears
    And The user enters "<informations>" informations
    And The user selects country
    And The user selects State Province
    And The user clicks on the save button
    Then The user should be able to update address

    Examples:
      | infoBoxes             | informations      |
      | Address_FirstName     | Jane              |
      | Address_LastName      | Doe               |
      | Address_Email         | JaneDoe@gmail.com |
      | Address_City          | Berlin            |
      | Address_Address1      | Muster Str 2      |
      | Address_ZipPostalCode | 456789            |
      | Address_PhoneNumber   | 456789123         |


  @incorrectInfo
  Scenario Outline: Verify that user can add the new address - B16DP-84
    Given User logins with valid credentials for Ersin
    When The user clicks on the account button
    And The user clicks on the address button
    And The user clicks on the add new button
    And The user clicks on the "<infoBoxes>" info boxes respectively and clears
    And The user enters "<informations>" informations
    And The user selects country
    And The user selects State Province
    And The user clicks on the save button
    Then The user should be able to update address

    Examples:
      | infoBoxes             | informations      |
      | Address_FirstName     | Jane              |
      | Address_LastName      | Doe               |
      | Address_Email         | JaneDoe@gmail.com |
      | Address_City          | Berlin            |
      | Address_Address1      | Muster Str 2      |
      | Address_ZipPostalCode | 456789            |
      | Address_PhoneNumber   | 456789123         |



