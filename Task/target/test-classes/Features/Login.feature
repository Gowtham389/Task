Feature: Testing the Login functionalities


  Background: 
    Given User launches the browser and navigate to VMAccount WebPage
    
   
  @Login @TC02
  Scenario: Test Login Page with Invaild username and password
  
  Given the user enter the invaild email address "Testing123@gmail.com"
  When the user enter the password "12345qwert"
  And the user click the login button
  And the user verify to successfully login
  @Login @TC03
  Scenario: Test the Login Page with case sensitive upper and lower case letter in email address
  
 Given the user enter the uppper and lower case sensitive letter in the email address "gowThaMVenKat2120@gmail.com"
 When the user enter the password "123456789@"
 And the user click the login button
 And the user verify to successfully login
 @Login @TC04
 Scenario: Test the email address textbox show error when the domain name is not given
 
 Given the user enter the email address "Gowthamvenkat2120"
 When the user enter the password "123456789@"
 And the user click the login button
 And the user verify to successfully login
 
  @Login @TC01 
     Scenario: Test Login Page with vaild username and password
     
  Given the user enter the email address "Gowthamvenkat2120@gmail.com"
  When the user enter the password "123456789@"
  And the user click the login button 
  And the user verify to successfully login 
 
 @Login @TC05 
 Scenario: Test the Login page with Invaild password
 
 Given the user enter the email address "Gowthamvenkat2120@gmail.com"
 When the user enter the invaild password "0987654321"
 And the user click the login button
 And the user verify to successfully login
 @Login @TC06
 Scenario: Test the Login page click login button without giving password
 
 Given the user enter the email address "Gowthamvenkat2120@gmail.com"
 And the user click the login button
 And the user verify to successfully login
 
 @Login @TC07
 
 Scenario: Test the Login page click login button without giving email address
 
 Given the user enter the password "123456789@"
 And the user click the login button
 And the user verify to successfully login
 
 