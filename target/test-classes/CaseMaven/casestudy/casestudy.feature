
Feature: TestMe casetudy
  I want to use this template for my feature file

@sanity
 Scenario: TestMe casestudy
    Given Alex has entered into the signup page
    And Alex given the username "rajgok77"
    And Alex given the firstname "gokul"
    And Alex given the lastname "raju"
    And Alex given the pass "gokul12345"
    And Alex given the cpass "gokul12345"
    And Alex given the gender "Male"
    And Alex given the email "gokul@cc.com"
    And Alex given the mobile "9876543210"
    And Alex given the dob "09/05/2018"
    And Alex given the address "shri ram gateway"
    And Alex given the squestion "gokul"
    And Alex given the answer "gokul"
    And clicked Register
    
@smoke
Scenario Outline: logging in
 
    Given the signup page
    And the username "<uname>"
    And the password "<pass>"
    Then click on login
    And click on searchbar and type
    Then click add to cart and select cart
    Then move to payement
    
 Examples: 
     |uname  |pass       |
     |lalitha|password123|
    
 
 
 @unit
Scenario Outline: logging in
 
    Given the signup page
    And the username "<uname>"
    And the password "<pass>"
    Then click on login
    And click on searchbar and type
    Then click add to cart and select cart
    Then reduce the quantity to zero
    And check for error message
    
 Examples: 
     |uname  |pass       |
     |lalitha|password123|   
 
 
 
 