#Feature: validating Adactin Hotel LoginPage
#Scenario: validating adactin login page with valid credentials
#Data driven without Example Keyword
#Given user is already in login page
#When title of the page is Adactin hotel
#Then the user is entering "adactin123" and "adactin123"
#And clicking on Login button
#Then user is navigated to homepage
#Then closing the browser
Feature: validating Adactin Hotel LoginPage

Scenario Outline: validating adactin login page with valid credentials

#Data driven with Example Keyword

Given user is already in login page
When title of the page is Adactin hotel
Then the user is entering "<username>" and "<password>"
And clicking on Login button
Then user is navigated to homepage
Then closing the browser




Examples:

	|	username	|	password	|
	|	adactin123	|	adactin123	|
	|	adactin		|	adactin		|