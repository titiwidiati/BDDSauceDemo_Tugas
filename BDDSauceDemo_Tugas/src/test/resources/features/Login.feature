@Login
Feature: Login
  As a user I want to login on sauce demo website

  Scenario: Normal Login
    Given User already on sauce demo website
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on sales page

  Scenario Outline: Invalid Login
    Given User already on sauce demo website
    When User input "<userName>" as userName and input "<password>" as password
    Then User see error "<errorText>" on login page
  Examples:
    | userName      | password     | errorText                                                                 |
    | standard_user |              | Epic sadface: Password is required                                        |
    |               | secret_sauce | Epic sadface: Username is required                                        |
    | titi          | 123          | Epic sadface: Username and password do not match any user in this service |