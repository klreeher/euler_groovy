# language: en

Feature: Sum of All Multiples of 3 or 5

  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
  The sum of these multiples is 23.
  Find the sum of all the multiples of 3 or 5 below 1000.

  Scenario: all the natural numbers below 10 that are multiples of [3, 5]

    Given all natural numbers below 10
    When I list all the multiples of 3 or 5
    Then I have the values list:3, 5, 6, 9