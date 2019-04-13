Feature: Facebook Login

Scenario: Facebook Login test

Given user is already on login page
When title is Facebook
Then user enters credentials 
Then clicks on login button 
Then user has to be on home page