@Sample-Login
Feature: verify a positif login

  @PositifLogin
  Scenario Outline: verify if B2C users can login successfully
    Given user is in page Login  "https://www.vente-directe-vigneron-independant.com/"
    When user inter "<validLogin>"
    And user  interPassword "<validPassword>"
    Then conneting successfully on page MyAccount

    Examples: 
      | validLogin             | validPassword |
      | slaoui.anass@gmail.com |        123456 |
