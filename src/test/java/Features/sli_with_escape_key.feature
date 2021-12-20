@Sli_test_geeks
Feature: SLI POP UP test

  Scenario: SLI popup test with escape key
  Given user is on Home Page
  Then Enter data in search filed
  Then press escape key
  Then verify the pop-up
  Then Click on login button  
  And Enter free valid username and password 
  Then Enter Data in Search filed
  Then Press Escape key
  Then verify the Pop-up