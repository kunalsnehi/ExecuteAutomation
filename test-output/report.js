$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/kunal/workspace/FreeCRMBDDFramework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "This feature deals with the login functionality of the system",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login with correct username and password",
  "description": "",
  "id": "loginfeature;login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of the page is ExecuteAutomation",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter username and password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see the userform page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 6962879580,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_page_is_execute_automation()"
});
formatter.result({
  "duration": 15188743,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_enter_username_and_password()"
});
formatter.result({
  "duration": 159734683,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_login_button()"
});
formatter.result({
  "duration": 54702134,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_should_see_the_userform_page()"
});
formatter.result({
  "duration": 146498415,
  "status": "passed"
});
});