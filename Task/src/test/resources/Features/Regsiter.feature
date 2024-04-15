Feature: Testing the Register functionalities


  Background: 
    When the User Launch VMAccount page
    
    @Register @TC09
  Scenario: Register a new account
  
 Given the user click Register here option
  Then the user give details Name "<Name>" Email "<Email>" password "<Password>" and confirm password "<ConfirmPassword>"
  And the user click the checkbox to privacy policy and term and condition option and the user click the register button 
  Examples: 
  |Name|Email|Password|ConfirmPassword|
  |Gowtham|Gowthamvenkat2120@gmail.com|0987654321@|0987654321@|