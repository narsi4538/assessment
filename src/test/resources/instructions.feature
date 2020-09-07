Feature: instructions

  Scenario: get instructions
    When I execute the get method on endpoint "/instructions"
    Then I should validate the status 200
    And I should see the response