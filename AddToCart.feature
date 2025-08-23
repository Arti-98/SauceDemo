Feature: Shopping Cart Functionality

Scenario: A logged-in user adds a product to the cart
  Given the user is logged in
  When the user adds the "Sauce Labs Backpack" to the cart
  Then the shopping cart icon should show a count of "1"