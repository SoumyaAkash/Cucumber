Feature: Leaftaps login functionality2

Scenario Outline: Test login functionality with positive credential 
Given Open the chrome browser
And Load the application url
And Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed

Examples:

|username||password|
|'DemoCSR'||'crmsfa'|
|'Demosalesmanager'||'crmsfa'|

Scenario: Test login functionality with negative credential

Given Open the chrome browser
And Load the application url
And Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When Click on Login button
But Error message should be displayed
