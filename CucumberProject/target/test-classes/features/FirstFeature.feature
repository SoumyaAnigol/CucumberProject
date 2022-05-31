
Feature: login

Background:
 
    Given user go to "https://qa-tekarch.firebaseapp.com/"
    When user enters "admin123@gmail.com" in username field
    @Smoke
  	Scenario: valid login with correct username and password
  	And "admin123" in passsword field
    And user click on login button
    Then page title should be "Selenium"
    
    @Regression
    Scenario: invalid login with correct username and password
   
    And "admin" in passsword field
    And user click on login button
    Then user should get an alert with text "Error : The password is invalid or the user does not have a password."

 