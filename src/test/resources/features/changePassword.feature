Feature: User can Change password
  As a user, I should be able to the  change password

  Background:
    Given User logins with valid credentials "sumeyra@gmail.com" "12312345"
    When User clicks password ändern


  Scenario: Verify that the password changed with valid credentials. - B16DP-58
    When User enters "12312345" altes Passwort
    When User enters "123123456" neues Passwort
    When User enters "123123456" Passwort bestätigen
    When User clicks password ändern button on the change password page
    Then verify that user can see message "Das Passwort wurde geändert"


  Scenario: Verify that the Change Password button should be working properly. - B16DP-60
    Then Verify that a change password button