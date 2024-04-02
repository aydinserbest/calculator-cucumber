Feature: Perform Calculations
  As a maths student,
  I want to perform various calculations
  so that I can practice my skills.

  Background:
    Given Matt a maths student has opened the calculator

  Scenario Outline: Perform mathematical operations
    When Matt performs the following calculation:
      | Left Operand   | Operator   | Right operand   |
      | <Left Operand> | <Operator> | <Right operand> |
    Then He should see a result of "<Result>"
    Examples: Additions and subtractions
      | Left Operand | Operator | Right operand | Result |
      | 1            | +        | 2             | 3      |
      | 12           | +        | 34            | 46     |
      | 12           | -        | 5             | 7      |
      | 12           | -        | 34            | -22    |
      | 1.9          | +        | 1.9           | 2    |
    Examples: Multiplications and divisions
      | Left Operand | Operator | Right operand | Result |
      | 1            | +        | 2             | 3      |
      | 12           | +        | 34            | 46     |
      | 12           | -        | 5             | 7      |
      | 12           | -        | 34            | -22    |
      | 1.9          | +        | 1.9           | 2    |

#  Scenario Outline: Perform more calculations
#    When Matt calculates <Calculations>
#    Then He should see a result of "<Result>"
#    Examples:
#      | Calculations | Result |
#      | 1+2          | 3      |
#      | 2*4          | 8      |

  Scenario Outline: Reporting invalid inputs
    When Matt performs the following calculation:
      | Left Operand   | Operator   | Right Operand   |
      | <Left Operand> | <Operator> | <Right Operand> |
    Then He should see a result of "<Result>"

    Examples: Non-numerical characters
      | Left Operand | Operator | Right Operand | Result |
      | abc          | +        | 123           | NaN    |
      | 123          | -        | abc           | NaN    |

    Examples: Division by zero
      | Left Operand | Operator | Right Operand | Result |
      | 1          | /        | 0           | Infinity    |
      | 0          | /        | 0           | NaN    |



