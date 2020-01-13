Feature: Validating BookHotelPage
Scenario: Validating BookHotelPage details scenario
Given user2 is already in LoginPage
When The title2 of the loginPage is Adactin Hotels
Then the user2 is entering the username and password
|	adactin123	|	adactin123	|
And the user2 is hitting the login button
Then user2 is navigated to HomePage
And user2 entering Location,Hotels,Room Type,NoOfRooms, CheckInDate, CheckOutDate,NoOfAdults,NoOfChildren details
|	London		|	Hotel Hervey	|	Standard	|	3 - Three	|	24/12/2019	|	31/12/2019		|	2 - Two		|	2 - Two			|

And user2 is hitting the search button
Then the user2 is navigated to SelectHotelPage
And user2 selected the hotel and clicked on continue button
Then user2 is navigated to BookAHotelPage
And user2 enters information for hotel Booking
|	Tarun	|	Mithra	|	9090 OliveWest Blvd	|	1234567899876543	|	VISA	|	September	|	2022	|	323	|
And clicked on Book Now 
Then user2 got navigated to ConfirmationPage
Then user2 clicked on the Logout
Then user2 closed the browser