Feature: LoginFeature
This feature deals with the login functionality of the system

Scenario: Login with correct username and password
Given user is already on Login Page
When Title of the page is ExecuteAutomation
And I enter username and password
And I click login button
Then I should see the userform page