Feature: New endpoint feature

  Scenario: Client calls new endpoint
    When client calls "/newEndpoint"
    Then the response should be "New endpoint response"