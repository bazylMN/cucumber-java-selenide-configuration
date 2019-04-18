Feature: As a user i want to visit cucumber pages

Scenario Outline: Visit cucumber pages
  Given I go to <home> page
  Then I should be on <home> page
  When I go to <training> page
  Then I should be on <training> page
  Examples:
    |home                     |training                     |
    |https://cucumber.io/blog |https://cucumber.io/training |



  Scenario: Try to sign up for GitHub
    Given I go to https://github.com/ page
    When I fill form fields with data
      |login    |loginfirst     |
      |email    |email@first.pl |
      |password |first123       |
    Then I should see form with filled fields
