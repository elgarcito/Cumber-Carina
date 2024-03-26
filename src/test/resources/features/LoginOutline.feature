Feature: Login Functionality outline

  In order to do internet banking outline
  As a valid Para Bank customer outline
  I want to login successfully outline

Scenario Outline:Login Successful outline
Given I am in the login page of the Para Bank application outline
When I enter valid <username> and <password> outline
Then I should be taken to the overview page outline

Examples:
|username|password|
|"tautester"|"password"|
|"autotester"|"password"|