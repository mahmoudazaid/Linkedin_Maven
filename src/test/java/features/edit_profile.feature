@chrome

Feature: Edit profile


	Background: Login as a authenticated user
    Given I am on Home page
    And I Enter "mabuzaid.automation@gmail.com" into "Email"
    And I Enter "Test@123" into "Password"
    And I Submit to sign in
    And I wait for 10 seconds
    And I click on "Welco	me, Automation!" link
    And I wait for 10 seconds
    
  	Scenario: Add Work experience
  		Given I click on "Add profile section" dropdown menu
  		And I wait for 5 seconds
  		And I select "Work experience" from list
  		And I wait for 5 seconds
  		And I have enter "Manager" into "Title"
  		And I have enter "Test" into "Company"
  		And I select "April" from "From" dropdown menu
  		And I select "2017" from "From" dropdown menu
  		When I click on "Save" button
  		Then I should see "Manager"