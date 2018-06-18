@chrome
Feature: Login Feature
  Verify if user is able to Login in to the site
  
  Scenario Outline: Login with incorrect password
   	Given I am on Home page
    And I Enter "<Email>" into "Email"
    And I Enter "<Password>" into "Password"
    And I wait for 5 seconds
    When I Submit to sign in
    And I wait for 10 seconds
    Then I should see "<Expectation>"
    
    Examples:
    |Email												 |Password	|Expectation																																							 |
    |mabuzaid.automation@gmail.com|Test@123455|There were one or more errors in your submission. Please correct the marked fields below.|
    |mabuzaid.automatin@gmail.com |Test@123455|There were one or more errors in your submission. Please correct the marked fields below.|
    |mabuzaid.automation@gmail.com|Test@123		|Me	|