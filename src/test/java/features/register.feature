
Feature: I need to test linkedin registeration

  
  
   Scenario: Confirm the mail
      Given Connect to Email
      Then Email with subject "Automation, welcome to your new Google Account" contains "Hi Automation"  
      