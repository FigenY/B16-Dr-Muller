Feature: Login Functionality

  Scenario: Login with valid parameters
    Given User logins with valid credentials "batch16@gmail.com" "eurotech"

  @positiveLoginTest
  Scenario: Positive Login Test - B16DP-15
    Given User logins with valid credentials "forentom@gmail.com" "Muller007@"
    Then The user should be able to logged in

  @invalidUsernameLogin
  Scenario Outline: The user can not login with invalid email address - B16DP-16
    Given The user is on the main page
    When User enters invalid "<Username>" username
    And User enters valid "<Password>" password
    And User clicks login button
    Then The user should be able to see "<expectedWarningMessage>"

    Examples:
      | Username          | Password   | expectedWarningMessage    |
      | forentom@gmail.co | Muller007@ | Kein Kundenkonto gefunden |
      #| forentom@gmail,com | Muller007@ | Kein Kundenkonto gefunden |
      #| forentom@gmail.    | Muller007@ | Kein Kundenkonto gefunden |
      #| forentomqgmail.com | Muller007@ | Kein Kundenkonto gefunden |
      #| forentom@gmal.com | Muller007@ | Kein Kundenkonto gefunden |

  @invalidPasswordLogin
  Scenario Outline: The user can not login with invalid password - B16DP-17
    Given The user is on the main page
    When User enters valid "<Username>" username
    And User enters invalid "<Password>" password
    And User clicks login button
    Then The user should be able to see "<expectedWarningMessage>"

    Examples:
      | Username           | Password  | expectedWarningMessage    |
      | forentom@gmail.com | Muller007 | Die angegebenen Anmeldeinformationen sind ungültig |

  @emptyUsernameLogin
  Scenario: The user can not login with empty username - B16DP-18
    Given The user is on the main page
    When User leaves the username field blank
    And User enters valid "Muller007@" password
    And User clicks login button
    Then The user should not be able to log in

  @emptyPasswordLogin
  Scenario: The user can not login with empty password - B16DP-19
    Given The user is on the main page
    When User enters valid "forentom@gmail.com" username
    And User leaves the password field blank
    And User clicks login button
    Then The user should be able to see "Die angegebenen Anmeldeinformationen sind ungültig"

  @emptyUsernameAndPasswordLogin
  Scenario: The user can not login with empty username and empty password - B16DP-20
    Given The user is on the main page
    When User leaves the username field blank
    And User leaves the password field blank
    And User clicks login button
    Then The user should not be able to log in

  @passwordMasking
  Scenario: The password is masked when entered in the password field - B16DP-21
    Given The user is on the main page
    When User enters valid "forentom@gmail.com" username
    And User enters valid "Muller007@" password
    Then The user should be able to see the password "password" as bullet signs






