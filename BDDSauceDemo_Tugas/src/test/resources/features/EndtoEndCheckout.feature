@Checkout
  Feature: End to End Checkout
    As a user I want to checkout product on sauce demo website

  Scenario: End to End Checkout Product
    Given User already on sauce demo website
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on sales page
    When User sort the product list by "Name (Z to A)"
    Then User add "Sauce Labs Onesie" and "Test.allTheThings() T-Shirt (Red)" to cart
    And User click cart button
    Then User already on your cart page
    Then User remove item Tshirt Red
    And User click checkout button
    Then User already on checkout information page
    When User input "Titi" as firstName, input "Widya" as lastName and input "99999" as zipCode
    And User click continue button
    Then User already on checkout overview page
    And User done check the total price "$8.63"
    And User click the finish button
    Then User already completed checkout