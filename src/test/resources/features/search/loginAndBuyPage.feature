Feature: Login to the platform

  Scenario Outline: Unsuccessful login with invalid credentials
    Given The user enters their credentials "<name>" and "<password>"
    Then they should see an error message indicating invalid credentials
    Examples:
      | name            | password     |
      | locked_out_user | secret_sauce |

  Scenario Outline: Order, add and remove products from the cart

    Given The user enters their credentials "<name>" and "<password>"
    Then they should see the products page
    And the user selects the order of products
    And the user selects the  randoms product
    When the user enters the cart using the cart button
    And the user removes the first product from the cart
    Then the product should not be visible in the cart
    And the user clicks the checkout button
    When the user enters their information "<firtsName>", "<lastName>" and "<postalCode>" and clicks the continue button
    And the user clicks the FINISH button
    Then the user should see the confirmation message
    Examples:
      | firtsName | lastName  | postalCode | name          | password     |
      | Rosa      | Sarmiento | 202015     | standard_user | secret_sauce |




