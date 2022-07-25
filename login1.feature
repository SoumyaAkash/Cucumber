Feature: Leaftaps login functionality

Scenario: Test login functionality with positive credential
Given Open the chrome browser
And Load the application url
And Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed

Scenario: Test login functionality with negative credential

Given Open the chrome browser
And Load the application url
And Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When Click on Login button
But Error message should be displayed
