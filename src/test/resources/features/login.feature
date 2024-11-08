Feature: Login Functionality

  Scenario: Login with valid parameters
    Given User logins with valid credentials "batch16@gmail.com" "eurotech"

    Scenario: Login with Cookie
      Given User logins with Cookie "CfDJ8L3BKZO901tIs9KTgT9lUjFqAdKnYHyf_N_aRQmR-zqdCvyDlaFmlEO34pYKAsbHgwUKTPCwXkqG7hFSy-OJWBwxHbiAG7x4dN1u4WjfUj9XeHh3CCyAEoQBtt4Bg-nvwGXM_pHQx4JHVA-EmdTLcy4HSwzDbXcbeLlm6dCngnMBxVko277achhdfJbcyNdBQN6PeixCfBerlN-yM3Fx-m8aFZ6S0SAGK6gMtvczWL0ANvNfnii-7YL6q3LMJP96Z2ldUNCeMKASrbJ2bTkkrWT6vPzj8CQ-IGhiN7ug8yAqfP1n4ATV_6tMdg_VtMX8wGGNKg11jemOLpXJl7P0h2E_v8pE6hN_rDHISDvc3VczQGrJZSh315hjcA0JPT7ZRd2Oc_S5-ZrHNuumyCYVE8b3INDZpwRnovISoYvl_C5ruSR4Qz05R52V7IF2o0JolXsD0WI8iSfVVinokUEp8RRndzwT8HyQzNxhADf2Ozzqvez7X5HEj0cDhjhbxnBs64QQOGsGbBJGxia0jiapP4wqw2x3y3pcgEXmltjdeq0Gvi9u67VILgVfl_5U0n1zmw"

  @positiveLoginTest
  Scenario: Positive Login Test - B16DP-15
    Given User logins with Cookie "CfDJ8L3BKZO901tIs9KTgT9lUjFqAdKnYHyf_N_aRQmR-zqdCvyDlaFmlEO34pYKAsbHgwUKTPCwXkqG7hFSy-OJWBwxHbiAG7x4dN1u4WjfUj9XeHh3CCyAEoQBtt4Bg-nvwGXM_pHQx4JHVA-EmdTLcy4HSwzDbXcbeLlm6dCngnMBxVko277achhdfJbcyNdBQN6PeixCfBerlN-yM3Fx-m8aFZ6S0SAGK6gMtvczWL0ANvNfnii-7YL6q3LMJP96Z2ldUNCeMKASrbJ2bTkkrWT6vPzj8CQ-IGhiN7ug8yAqfP1n4ATV_6tMdg_VtMX8wGGNKg11jemOLpXJl7P0h2E_v8pE6hN_rDHISDvc3VczQGrJZSh315hjcA0JPT7ZRd2Oc_S5-ZrHNuumyCYVE8b3INDZpwRnovISoYvl_C5ruSR4Qz05R52V7IF2o0JolXsD0WI8iSfVVinokUEp8RRndzwT8HyQzNxhADf2Ozzqvez7X5HEj0cDhjhbxnBs64QQOGsGbBJGxia0jiapP4wqw2x3y3pcgEXmltjdeq0Gvi9u67VILgVfl_5U0n1zmw"
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






