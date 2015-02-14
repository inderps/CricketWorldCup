Feature: World Cup Schedule feature

  Scenario: I can see all scheduled matches
    Given I should see the list of all matches
    When I click on 'Australia'
    Then I should see only 'Australia' matches
    And I click on 'February 14, 2015'
    Then I should see all matches which are scheduled on 'February 14, 2015'
    And I click on 'Pool A'
    Then I should see all matches of 'Pool A'
    And I click on 'University Oval, Dunedin'
    Then I should see all matches which are going to be played on 'University Oval, Dunedin' stadium
    When I click on 'Reset'
    Then I should see the list of all matches
