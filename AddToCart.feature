Feature: Add to cart

  Scenario: Add Sauce Labs Backpack to cart
    Given I login with "standard_user" and "secret_sauce"
    When I add "Sauce Labs Backpack" to the cart
    Then the cart should contain "Sauce Labs Backpack"
