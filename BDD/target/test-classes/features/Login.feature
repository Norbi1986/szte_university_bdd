Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario Outline: Login test
    Given I open the My Store page
    When I click on the Sign in button
    Then I redirect to the login page
    When I write "<user>" into email field
    And I write "<password>" into password field
    And I click on Login Button
    Then The account title should be <accountTitle>

    Examples:
      | user                    | password | accountTitle             |
      | epamuser.test.szte@gmail.com | Tester123  | Authentication failed.   |
      | epamuser.test.szte@gmail.com | usertest | Welcome to your account. |

