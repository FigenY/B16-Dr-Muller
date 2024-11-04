Feature: Register Functionality

  Background: The user is on the Register page
    Given User is on the home page
    When User clicks Konto icon for registrierung
    And User clicks Registrierung Button


  Scenario: Verify that when the user clicks on the "registererung" link, a registration form page is displayed. - B16DP-46
    Then Verify that a registration form page is displayed with "Registrierung"


  Scenario Outline: Registering with Correct Information test with DDT - B16DP-47
    When user clicks gender
    When user enters "<vorname>" vorname
    When user enters "<nachname>" nachname
    When user enters "<email>" email
    When user enters "<password>" password
    When user enters "<confirmPassword>" password Confirm
    And user clicks registering button
    Then verify that user can see "<message>" message
    Examples:
      | vorname | nachname | email                 | password  | confirmPassword | message                            |
      | alex    | markt    | alex2@gmail.com       | alex12345 | alex12345       |  Registrierung abgeschlossen       |
      | katrin  | kurz     | katrinkurz3@gmail.com | katrin123 | katrin123       |  Registrierung abgeschlossen       |


  Scenario: Attempting to Register with Empty Fields (For Firstname) - B16DP-49
    When user clicks gender
    When user enters "" vorname
    When user enters "torreria" nachname
    When user enters "lucas123@gmail.com" email
    When user enters "lucas12345" password
    When user enters "lucas12345" password Confirm
    And user clicks registering button
    Then verify that user can see error message for Vorname "Die Angabe des Vornamens ist erforderlich."


  Scenario: Attempt to register with an E-Mail already in use - B16DP-50
    When user clicks gender
    When user enters "nellson" vorname
    When user enters "sanchez" nachname
    When user enters "katrinkurz2@gmail.com" email
    When user enters "12341234" password
    When user enters "12341234" password Confirm
    And user clicks registering button
    Then verify that user can see error message for already E-Mail "Die E-Mail Adresse wird bereits verwendet"


  Scenario: Attempt to register when the password and confirm password fields do not match - B16DP-51
    When user clicks gender
    When user enters "abdi" vorname
    When user enters "yemis" nachname
    When user enters "abdi@gmail.com" email
    When user enters "12341234" password
    When user enters "12341235" password Confirm
    And user clicks registering button
    Then verify that user can see error message for not match Passwords "Das Passwort und das Bestätigungspasswort stimmen nicht überein."


  Scenario: Attempting to Register with Empty Fields (For Lastname) - B16DP-52
    When user clicks gender
    When user enters "lucas" vorname
    When user enters "" nachname
    When user enters "lucastorreia1@gmail.com" email
    When user enters "lucas12345" password
    When user enters "lucas12345" password Confirm
    And user clicks registering button
    Then verify that user can see error message for Nachname "Die Angabe des Nachnamens ist erforderlich."


  Scenario: Attempting to Register with Empty Fields (For E-Mail) - B16DP-53
    When user clicks gender
    When user enters "mertens" vorname
    When user enters "ciko" nachname
    When user enters "" email
    When user enters "mertens12345" password
    When user enters "mertens12345" password Confirm
    And user clicks registering button
    Then verify that user can see error message for Email "Die Angabe der E-Mail Adresse ist erforderlich."


  Scenario: Attempting to Register with Empty Fields (For Password) - B16DP-54
    When user clicks gender
    When user enters "mertens" vorname
    When user enters "ketty" nachname
    When user enters "mertens@gmail.com" email
    When user enters "" password
    When user enters "mertens12345" password Confirm
    And user clicks registering button
    Then verify that user can see error message for Password "Das Passwort und das Bestätigungspasswort stimmen nicht überein."


  Scenario: Attempting to Register with Empty Fields (For Password Bestätigen) - B16DP-55
    When user clicks gender
    When user enters "osimhen" vorname
    When user enters "nein" nachname
    When user enters "galatasaray@gmail.com" email
    When user enters "osimhen123" password
    When user enters "" password Confirm
    And user clicks registering button
    Then verify that user can see error message for Password Confirm "Das Passwort ist erforderlich."


  Scenario: Attempting to Register with Empty Fields (For Beide Password) - B16DP-56
    When user clicks gender
    When user enters "icardi" vorname
    When user enters "sisi" nachname
    When user enters "galatasarayicardi10@gmail.com" email
    When user enters "" password
    When user enters "" password Confirm
    And user clicks registering button
    Then verify that user can see error message for Password "Das Passwort ist erforderlich." and for Password Confirm "Das Passwort ist erforderlich."


  Scenario: Registierung with Invalid Password Format - B16DP-57
    When user clicks gender
    When user enters "davinson" vorname
    When user enters "sanchez" nachname
    When user enters "sanschez@gmail.com" email
    When user enters "1234" password
    When user enters "1234" password Confirm
    And user clicks registering button
    Then verify that user can see error message for invalid Password "muss die folgenden Regeln erfüllen:"
    Then verify that user can see other error message for invalid Password "muss mindestens 6 Zeichen enthalten"