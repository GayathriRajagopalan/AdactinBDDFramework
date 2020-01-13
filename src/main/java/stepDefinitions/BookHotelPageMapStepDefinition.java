package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class BookHotelPageMapStepDefinition {
	public WebDriver driver;

	@Given("^user2 is already in LoginPage$")
	public void user2_is_already_in_LoginPage() {
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@SuppressWarnings("deprecation")
	@When("^The title2 of the loginPage is Adactin Hotels$")
	public void the_title2_of_the_loginPage_is_Adactin_Hotels() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("AdactIn.com - Hotel Reservation System", title);
	}

	@Then("^the user2 is entering the username and password$")
	public void the_user2_is_entering_the_username_ang_password(DataTable credentials) {
		for (Map<String,String> data : credentials.asMaps(String.class, String.class)) {
		driver.findElement(By.id("username")).sendKeys(data.get("username"));
		driver.findElement(By.id("password")).sendKeys(data.get("password"));
	}
	}
	@Then("^the user2 is hitting the login button$")
	public void the_user2_is_hitting_the_login_button() {
		driver.findElement(By.id("login")).click();
	}

	@SuppressWarnings("deprecation")
	@Then("^user2 is navigated to HomePage$")
	public void user2_is_navigated_to_HomePage() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("AdactIn.com - Search Hotel", title);
	}

	@And("^user2 entering Location,Hotels,Room Type,NoOfRooms, CheckInDate, CheckOutDate,NoOfAdults,NoOfChildren details$")
	public void user2_entering_details(DataTable selectHotel) {
		//List<List<String>> value = selectHotel.raw();
		for(Map<String,String>selectData : selectHotel.asMaps(String.class, String.class)) {
		Select loc = new Select(driver.findElement(By.id("location")));
		loc.selectByVisibleText(selectData.get("Location"));
		Select hot = new Select(driver.findElement(By.id("hotels")));
		hot.selectByVisibleText(selectData.get("Hotel"));
		Select room = new Select(driver.findElement(By.id("room_type")));
		room.selectByVisibleText(selectData.get("RoomType"));
		Select noofroom = new Select(driver.findElement(By.id("room_nos")));
		noofroom.selectByVisibleText(selectData.get("NoOfRooms"));
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys(selectData.get("CheckInDate"));
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys(selectData.get("CheckOutDate"));
		Select adultroom = new Select(driver.findElement(By.id("adult_room")));
		adultroom.selectByVisibleText(selectData.get("NoOfAdults"));
		Select childRoom = new Select(driver.findElement(By.id("child_room")));
		childRoom.selectByVisibleText(selectData.get("NoOfChildren"));
	}
	}

	@And("^user2 is hitting the search button$")
	public void user2_is_hitting_the_search_button() {
		driver.findElement(By.id("Submit")).click();
	}

	@SuppressWarnings("deprecation")
	@Then("^the user2 is navigated to SelectHotelPage$")
	public void the_user2_is_navigated_to_SelectHotelPage() {
		String text = driver.findElement(By.xpath("//td[@class='login_title']")).getText();
		System.out.println(text);
		Assert.assertEquals("Select Hotel", text);
	}

	@And("^user2 selected the hotel and clicked on continue button$")
	public void user2_selected_the_hotel_and_clicked_on_continue_button() {
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
	}

	@SuppressWarnings("deprecation")
	@Then("^user2 is navigated to BookAHotelPage$")
	public void user2_is_navigated_to_BookAHotelPage() {
		String BookHotelText = driver.findElement(By.xpath("//td[contains(text(),'Book A Hotel ')]")).getText();
		Assert.assertEquals("Book A Hotel", BookHotelText);
	}

	@Then("^user2 enters information for hotel Booking$")
	public void user2_enters_information_for_hotel_Booking(DataTable Bookinginfo) {
		//List<List<String>> info = Bookinginfo.raw();
		for (Map<String,String>info : Bookinginfo.asMaps(String.class, String.class)) {
		driver.findElement(By.id("first_name")).sendKeys(info.get("FirstName"));
		driver.findElement(By.id("last_name")).sendKeys(info.get("LastName"));
		driver.findElement(By.id("address")).sendKeys(info.get("Address"));
		driver.findElement(By.id("cc_num")).sendKeys(info.get("CreditCardNo"));
		Select creditcardtype = new Select(driver.findElement(By.id("cc_type")));
		creditcardtype.selectByVisibleText(info.get("CCType"));
		Select month = new Select(driver.findElement(By.id("cc_exp_month")));
		month.selectByVisibleText(info.get("ExpMonth"));
		Select year = new Select(driver.findElement(By.id("cc_exp_year")));
		year.selectByVisibleText(info.get("ExpYear"));
		driver.findElement(By.id("cc_cvv")).sendKeys(info.get("CVV"));
		}
	}

	@Then("^clicked on Book Now$")
	public void clicked_on_Book_Now() {
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
	}

	@Then("^user2 got navigated to ConfirmationPage$")
	public void user2_got_navigated_to_ConfirmationPage() {
		boolean flag = driver.findElement(By.id("my_itinerary")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("^user2 clicked on the Logout$")
	public void user2_clicked_on_the_Logout() {
		driver.findElement(By.id("logout")).click();
	}

	@Then("^user2 closed the browser$")
	public void user2_closed_the_browser() {
		driver.quit();
	}

}
