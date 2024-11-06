Feature: Navigation bar functionality

  @retrorativeCategory
  Scenario Outline: Restorative Products test in navigation bar - B16DP-77
    Given The user is on the main page
    When The user navigates to restorative produkte
    And The user clicks on the <restorativeCategory> category under Restorative Products
    Then The user should be redirected to the "<produktePage>" products page

    Examples:
      | restorativeCategory | produktePage          |
      | 1                   | Composite             |
      | 2                   | Bleaching             |
      | 3                   | Befestigungscomposite |
      | 4                   | Prophy Materials      |
      | 5                   | Liners                |
      | 6                   | Etching               |
      | 7                   | Bonding               |


  @navbarCategories
  Scenario Outline: Verify that the user can click other links in the navigation bar - B16DP-78
    Given The user is on the main page
    When The user clicks on the <navbarCategories> categories in navigation bar
    Then The user should be redirected to the "<navbarCategoriesPage>" categories page

    Examples:
      | navbarCategories | navbarCategoriesPage     |
      | 2                | Restorative Produkte     |
      | 3                | Catalog                  |
      | 4                | e-IFU                    |
      | 5                | Über Uns                 |
      | 6                | Wiederkehrender Benutzer |
      | 7                | Kontakt aufnehmen        |

