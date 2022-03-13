Feature: Zerodha login feature
Scenario: Zerodha login test 
Given When user launch chromebrowser
When  User opens url("https://kite.zerodha.com")
And  Enter userId as "YT2353"" and Password as "Pass@123"
Then Click on the login button
Then when user is on Pin page
