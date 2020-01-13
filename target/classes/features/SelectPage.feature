Feature: Validating SelectPage
Scenario: Validating SelectPage details scenario
Given user1 is already in LoginPage
When The title1 of the loginPage is Adactin Hotels
Then the user1 is entering the username and password
|	adactin123	|	adactin123	|
And the user1 is hitting the login button
Then user1 is navigated to HomePage
And entering Location,Hotels,Room Type,NoOfRooms, CheckInDate, CheckOutDate,NoOfAdults,NoOfChildren details
|	London		|	Hotel Hervey	|	Standard	|	3 - Three	|	24/12/2019	|	31/12/2019		|	2 - Two		|	2 - Two			|

And user1 is hitting the search button
Then the user1 is navigated to SelectHotelPage
And selected the hotel and clicked on continue button
Then user1 is navigated to BookAHotelPage

