Feature: Validating HomePage
Scenario Outline: Validating HomePage search hotel details
Given user is already in LoginPage
When The title of the loginPage is Adactin Hotels
Then the user is entering the "<username>" and "<password>"
And the user is hitting the login button
Then user is navigated to HomePage
And entering "<Location>","<Hotels>","<Room Type>","<NoOfRooms>", "<CheckInDate>", "<CheckOutDate>","<NoOfAdults>","<NoOfChildren>" details
And user is hitting the search button
Then the user is navigated to SelectHotelPage



Examples:
|	username	|	password	|	Location	|	Hotels	        |	Room Type	|	NoOfRooms	|	CheckInDate	|	CheckOutDate	|	NoOfAdults	|	NoOfChildren	|
|adactin123		|	adactin123	|	London		|	Hotel Hervey	|	Standard	|	3 - Three	|	24/12/2019	|	31/12/2019		|	2 - Two		|	2 - Two			|
