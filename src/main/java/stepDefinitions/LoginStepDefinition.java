package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	public WebDriver driver;
	
	@Given("^user is already in login page$")
	public void user_is_already_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@SuppressWarnings("deprecation")
	@When("^title of the page is Adactin hotel$")
	public void title_of_the_page_is_Adactin_hotel(){
		String title=driver.getTitle();
		Assert.assertEquals("AdactIn.com - Hotel Reservation System", title);
	
	}
	@Then("^the user is entering \"(.*)\" and \"(.*)\"$")
	public void the_user_is_entering_username_and_password(String un, String pwd){
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		
	}
	@Then("^clicking on Login button$")
	public void clicking_on_Login_button()  {
		driver.findElement(By.id("login")).click();
	}
	@SuppressWarnings("deprecation")
	@Then("^user is navigated to homepage$")
	public void user_is_navigated_to_homepage() {
		String title=driver.getTitle();
		Assert.assertEquals("AdactIn.com - Search Hotel",title );
	    
	}
	@Then("^closing the browser$")
	public void closing_the_browser() {
	   driver.quit();
	}
	
}
