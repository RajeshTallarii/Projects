package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;

	@Given("the user is on the saucedemo login page")
	public void the_user_is_on_the_saucedemo_login_page() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='submit']"));
	}

	@When("the user enters valid credentials \\(username:{string},password:{string})")
	public void the_user_enters_valid_credentials_username_password(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	}

	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("the user should be redirected to the products page")
	public void the_user_should_be_redirected_to_the_products_page() {
		String status = driver.findElement(By.xpath("//span[@data-test='title']")).getText();
		System.out.println(status);
		driver.quit();

	}

}
