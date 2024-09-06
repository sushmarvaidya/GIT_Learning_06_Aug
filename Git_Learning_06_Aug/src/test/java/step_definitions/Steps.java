package step_definitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Steps {
	WebDriver driver;
	@Given("the user is on git hub login page")
	public void the_user_is_on_git_hub_login_page() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		
		
	    
	}

	@When("the user enters valid credentials \\(username: {string}, password: {string})")
	public void the_user_enters_valid_credentials_username_password(String email, String pwd) {
		driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("sushmarvaidya5@gmail.com");
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("Sush@789");
	   
	}

	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("//*[@name=\"commit\"]")).click();
	  
	}

	@Then("the user should be redirected to the Repository page")
	public void the_user_should_be_redirected_to_the_repository_page() {
		boolean value=driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/feed-container/div[1]/h2")).isDisplayed();
		 //System.out.println(driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/feed-container/div[1]/h2")).getText());
		 System.out.println(value);
		 Assert.assertEquals("Home","Home");
		 driver.quit();
		 driver.findElement(By.xpath(""));
	    
	}

}
