Feature: My Account-Address Info Functionality

  @informationCategory
  Scenario Outline: Information category test in footer section - B16DP-82
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