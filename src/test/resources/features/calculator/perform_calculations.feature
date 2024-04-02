Feature: Perform Calculations
  As a maths student,
  I want to perform various calculations
  so that I can practice my skills.

  #we weill refactor this also, by adding background and scenario outline
  Scenario: Perform additions and subtractions
    Given I have opened the calculator
    When I perform the following calculations:
      | Left Operand | Operator | Right operand |
      | 1            | +        | 2             |
    And I wait for the dots to disappear
    Then I should see a result of "3"


    #bad example

  #(When you want to comment out multiple lines in IntelliJ IDEA on a MacOS, you can use a keyboard shortcut: Cmd + /)
  #(when you've selected multiple lines within your code and press Cmd + /, it will put a # at the start of all selected lines)

#    Given I enter  left operand of "1"
#    And I choose the "+" operator
#    And I enter right operand of "2"
#    And I click "Go"
#    And I wait for the dots to disappear
#    Then I should see a result of "3"

