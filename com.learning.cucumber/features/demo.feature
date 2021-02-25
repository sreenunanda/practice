@tag @Demo
Feature: Title of your feature

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |

  @tag3
  Scenario: Test tag3
    Given I want to write a step with condition
    Given Launch browser and start application
    
    @tag4
    Scenario: Login to facebook
    Given I navigate to Facebook page
    Then I enter username and password
      | username | saurabh.d2106@gmail.com |
      | password | password                |
    Then I Clicked on the login button
    Then I verified that login is successful
    
    
