package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomePageStepdefinition {
	public WebDriver driver;
	
	@Given("^user is already in LoginPage$")
	public void user_is_already_in_LoginPage(){
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@SuppressWarnings("deprecation")
	@When("^The title of the loginPage is Adactin Hotels$")
	public void the_title_of_the_loginPage_is_Adactin_Hotels()  {
			String title=driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("AdactIn.com - Hotel Reservation System", title); 
	}

	@Then("^the user is entering the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_is_entering_the_username_ang_password(String un, String pwd)  {
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@Then("^the user is hitting the login button$")
	public void the_user_is_hitting_the_login_button() {
		driver.findElement(By.id("login")).click();
	}

	@SuppressWarnings("deprecation")
	@Then("^user is navigated to HomePage$")
	public void user_is_navigated_to_HomePage(){
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("AdactIn.com - Search Hotel",title );
	}
	@And("^entering \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" details$")
	public void entering_details(String location, String hotels, String roomType, String noOfrooms, String ChkInDate, String ChkOutDate, String adultRoom, String childrenRoom) {
		Select loc=new Select(driver.findElement(By.id("location")));
		loc.selectByVisibleText(location);
		Select hot=new Select(driver.findElement(By.id("hotels")));
		hot.selectByVisibleText(hotels);
		Select room=new Select(driver.findElement(By.id("room_type")));
		room.selectByVisibleText(roomType);
		Select noofroom=new Select(driver.findElement(By.id("room_nos")));
		noofroom.selectByVisibleText(noOfrooms);
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys(ChkInDate);
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys(ChkOutDate);
		Select adultroom=new Select(driver.findElement(By.id("adult_room")));
		adultroom.selectByVisibleText(adultRoom);
		Select childRoom=new Select(driver.findElement(By.id("child_room")));
		childRoom.selectByVisibleText(childrenRoom);
	}
	
	@And("^user is hitting the search button$")
	public void user_is_hitting_the_search_button() {
		driver.findElement(By.id("Submit")).click();
	}

	@SuppressWarnings("deprecation")
		@Then("^the user is navigated to SelectHotelPage$")
	public void the_user_is_navigated_to_SelectHotelPage(){
	  String text=driver.findElement(By.xpath("//td[@class='login_title']")).getText();
	  System.out.println(text);
	  Assert.assertEquals("Select Hotel", text);
	}



}
