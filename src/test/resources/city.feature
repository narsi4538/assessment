Feature: city

  Scenario: Get by city
    When I execute the get method on endpoint "city/london/users"
    Then I should validate the status 200
    And  I should see the empty response