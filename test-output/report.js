$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/gay3v/eclipse-workspaceNew1/adactinBDDframework/src/main/java/features/BookHotelPageMap.feature");
formatter.feature({
  "line": 1,
  "name": "Validating BookHotelPage with Map Interface",
  "description": "",
  "id": "validating-bookhotelpage-with-map-interface",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validating BookHotelPage details with map Interfacescenario",
  "description": "",
  "id": "validating-bookhotelpage-with-map-interface;validating-bookhotelpage-details-with-map-interfacescenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user2 is already in LoginPage",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "The title2 of the loginPage is Adactin Hotels",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the user2 is entering the username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 6
    },
    {
      "cells": [
        "adactin123",
        "adactin123"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the user2 is hitting the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user2 is navigated to HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user2 entering Location,Hotels,Room Type,NoOfRooms, CheckInDate, CheckOutDate,NoOfAdults,NoOfChildren details",
  "rows": [
    {
      "cells": [
        "Location",
        "Hotel",
        "RoomType",
        "NoOfRooms",
        "CheckInDate",
        "CheckOutDate",
        "NoOfAdults",
        "NoOfChildren"
      ],
      "line": 11
    },
    {
      "cells": [
        "London",
        "Hotel Hervey",
        "Standard",
        "3 - Three",
        "24/12/2019",
        "31/12/2019",
        "2 - Two",
        "2 - Two"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user2 is hitting the search button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the user2 is navigated to SelectHotelPage",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user2 selected the hotel and clicked on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user2 is navigated to BookAHotelPage",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user2 enters information for hotel Booking",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Address",
        "CreditCardNo",
        "CCType",
        "ExpMonth",
        "ExpYear",
        "CVV"
      ],
      "line": 19
    },
    {
      "cells": [
        "Tarun",
        "Mithra",
        "9090 OliveWest Blvd",
        "1234567899876543",
        "VISA",
        "September",
        "2022",
        "323"
      ],
      "line": 20
    },
    {
      "cells": [
        "Varun",
        "Mithra",
        "9092 OliveWest Blvd",
        "1234567089876543",
        "VISA",
        "May",
        "2022",
        "329"
      ],
      "line": 21
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "clicked on Book Now",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user2 got navigated to ConfirmationPage",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user2 clicked on the Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user2 closed the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BookHotelPageMapStepDefinition.user2_is_already_in_LoginPage()"
});
formatter.result({
  "duration": 4652068200,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageMapStepDefinition.the_title2_of_the_loginPage_is_Adactin_Hotels()"
});
formatter.result({
  "duration": 5059700,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageMapStepDefinition.the_user2_is_entering_the_username_ang_password(DataTable)"
});
formatter.result({
  "duration": 187002100,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageMapStepDefinition.the_user2_is_hitting_the_login_button()"
});
formatter.result({
  "duration": 1072203300,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageMapStepDefinition.user2_is_navigated_to_HomePage()"
});
formatter.result({
  "duration": 15579700,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageMapStepDefinition.user2_entering_details(DataTable)"
});
formatter.result({
  "duration": 993869300,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageMapStepDefinition.user2_is_hitting_the_search_button()"
});
formatter.result({
  "duration": 707636700,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageMapStepDefinition.the_user2_is_navigated_to_SelectHotelPage()"
});
formatter.result({
  "duration": 24340800,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageMapStepDefinition.user2_selected_the_hotel_and_clicked_on_continue_button()"
});
formatter.result({
  "duration": 586053400,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageMapStepDefinition.user2_is_navigated_to_BookAHotelPage()"
});
formatter.result({
  "duration": 28378900,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageMapStepDefinition.user2_enters_information_for_hotel_Booking(DataTable)"
});
formatter.result({
  "duration": 927283600,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageMapStepDefinition.clicked_on_Book_Now()"
});
formatter.result({
  "duration": 52389400,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageMapStepDefinition.user2_got_navigated_to_ConfirmationPage()"
});
formatter.result({
  "duration": 5588300700,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageMapStepDefinition.user2_clicked_on_the_Logout()"
});
formatter.result({
  "duration": 356200100,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelPageMapStepDefinition.user2_closed_the_browser()"
});
formatter.result({
  "duration": 813890600,
  "status": "passed"
});
});