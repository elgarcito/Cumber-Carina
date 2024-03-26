Feature: Login Functionality data table

  In order to do internet banking
  As a valid Para Bank customer
  I want to login successfully

Scenario:Login Successful data table
Given I am in the login page of the Para Bank application using data table
When I enter valid credentials using data table
  |autotester|password|
Then I should be taken to the overview page using data table
