Feature: User

  Scenario: get by id
    When I execute the get method on endpoint "/user/2"
    Then I should validate the status 200
    And  I should see the response id with 2

  Scenario: get users
    When I execute the get method on endpoint "/users"
    Then I should validate the status 200
    And  I should see the response


