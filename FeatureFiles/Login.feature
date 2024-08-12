Feature: User Login

  Scenario: Success Login
    Given the user is on the saucedemo login page
    When the user enters valid credentials (username:"standard_user",password:"secret_sauce")
    And the user clicks on the login button
    Then the user should be redirected to the products page
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
