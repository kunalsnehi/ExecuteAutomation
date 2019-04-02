Feature: LoginEAFeature
This feature deals with the login functionality of the application

Scenario: Login with correct username and password

Given I navigate to the login page
And I enter the following for Login
	|username|password|
	|admin|admin|
And I click Login button
Then I should see the Login Page


#Scenario Outline: I Login with correct username and password using scenario outline

#Given I navigate to the login page
#And I enter the following for Login
	
#And I click Login button
#Then I should see the Login Page
#
#Examples:
#
#|username|password|
#|admin|admin|
#|execute|automation|
