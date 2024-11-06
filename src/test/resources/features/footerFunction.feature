Feature: Footer functionality

  @informationCategory
  Scenario Outline: Information category test in footer section - B16DP-73
    Given The user is on the main page
    When The user clicks on the <InformationCategory> category in the footer
    Then The user should be redirected to the "<InformationCategoryPage>" category page

    Examples:
      | InformationCategory | InformationCategoryPage |
      | 1                   | Shipping & returns      |
      | 2                   | Privacy notice          |
      | 3                   | Conditions of Use       |
      | 4                   | Über Uns                |
      | 5                   | Kontakt aufnehmen       |


  @hilfeUndServiceCategory
  Scenario Outline: Hilfe und Service category test in footer section - B16DP-73
    Given The user is on the main page
    When The user clicks on the <HilfeUndServiceCategory>  Hilfe und Service category in the footer
    Then The user should be redirected to the "<HilfeUndServiceCategoryPage>" Hilfe und Service category pages

    Examples:
      | HilfeUndServiceCategory | HilfeUndServiceCategoryPage |
      | 1                       | Suchen                      |
      | 2                       | Kürzlich angesehen          |
      | 3                       | Produkte                    |


  @myAccountCategory
  Scenario Outline: My account category test in footer section - B16DP-73
    Given User logins with valid credentials "forentom@gmail.com" "Muller007@"
    When The user clicks on the <MyAccountCategory>  My Account category in the footer
    Then The user should be redirected to the "<MyAccountCategoryPage>" My Account category pages

    Examples:
      | MyAccountCategory | MyAccountCategoryPage |
      | 1                 | Customer info         |
      | 2                 | Orders                |
      | 3                 | Customer info         |
      | 4                 | Shopping Cart         |


  @followUsFooter
  Scenario Outline: Follow us category test in footer section - B16DP-73
    Given The user is on the main page
    When The user clicks on the email box under Follow us footer section
    And The user enters the email address "<email>"
    And The user clicks on the Subscribe button
    Then The user should be able to see following  mesagge "<message>"

    Examples:
      | email              | message                                                                |
      | forentom@gmail.com | Danke für Ihr Abonnement. Eine E-Mail wurde zur Bestätigung versendet. |
      | forentom@          | Geben Sie eine gültige E-Mail ein                                      |
      | forentom@g         | Geben Sie eine gültige E-Mail ein                                      |
      | forentom@g.        | Geben Sie eine gültige E-Mail ein                                      |