Feature: Signin Page UI Functionalities and Element Visibility

  Background:
    Given user on the Sign in page for client

  Scenario: Sign in page elements visibility for client
    Then Logo should be visible
    Then Company name text should be visible
    Then Header signup button should be visible
    Then Welcome back! text should be visible
    Then Do not have an account yet? text should be visible
    Then Email label should be visible
    Then Password label should be visible
    Then Enter Email placeholder should be visible
    Then Enter password placeholder should be visible
    Then Forgot password should be visible
    Then login button should be visible
    Then Footer logo should be visible
    Then Footer compnay name should be visible
    Then Footer Connecting you to trusted childcare text should be visible
    Then Instagram logo should be visible
    Then Facebook logo should be visible
    Then Phone number icon should be visible
    Then Email icon should be visible
    Then Contact number should be visible
    Then Email should be visible
    Then Privacy Policy text should be visible
    Then Term and condition text should be visible
    Then © 2025 Hopscotch Connect. All rights reserved. text should be visible

  Scenario: Verify clickablity of the elements in the sign in page
    Then Hopscotch name should be clickable in Header
    And Header signup button should be clickable
    And Email address input field should be clickable
    And Password input field should be clickable
    And sign in button should be clickable
    And Forgot your password link should be clickable
    And Create account button should be clickable
    And Instagram logo should be clickable
    And Facebook logo should be clickable
    And Footer Email should be clickable

  Scenario: Verify Redirection page
    When user click on the signup button in the login page for client
    Then the user should be redirected to the sign up page

    Scenario: verify the redirection to forgot password page for client
    When user click on the forgot password button in login page for client
    Then the user should be redirected to forgot password page

  Scenario:verify the redirection to Signup page from CreateAccount
    When user click on Create account button in login page for client
    Then  the user should be redirected to the sign up page

  Scenario: Verify the user successfully logged in
    When the user enter username "pankaj@yopmail.com"
    And the user enter the password "Test@12345"
    And user clicks on the sign in button
    Then the user should be logged in sucessfully