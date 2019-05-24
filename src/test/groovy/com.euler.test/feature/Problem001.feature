@euler
Feature: Multiplicity, aka Euler Problem 001

  Scenario: Sum of all the multiples of 3 or 5 that are less than 10

    Given the natural numbers below 10
    When we collect all that are multiples of 3 or 5
    Then the sum of these numbers is 23

  Scenario: Sum of all the multiples of 3 or 5 that are less than 100

    Given the natural numbers below 100
    When we collect all that are multiples of 3 or 5
    Then the sum of these numbers is 2318

  Scenario: Sum of all the multiples of 3 or 5 that are less than 10

    Given the natural numbers below 1000
    When we collect all that are multiples of 3 or 5
    Then the sum of these numbers is 233168