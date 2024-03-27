package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Pom_loginpage.Page_loginclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	 WebDriver driver =new ChromeDriver();
	

	@Given("Go with the url")
	public void go_with_the_url() throws Exception {

		driver.manage().window().maximize();
		driver.get("http://globalsquirrelsuserinterface-env.eba-mak34qea.ap-south-1.elasticbeanstalk.com/signup");
		Thread.sleep(2000);
	}

	@When("enter the valid crentials in the log in panel")
	public void enter_the_valid_crentials_in_the_log_in_panel() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("GuruSaiKumar");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("yerravandla");
		
		driver.findElement(By.xpath("//*[@id=\"workEmail\"]")).sendKeys("GuruSaiKumar");
	}

	@When("Click the Log in Button")
	public void click_the_log_in_button() throws Exception {

		try {
			WebElement timezone = driver.findElement(By.xpath("//*[@id=\"timeZone\"]/div/div[2]"));
			timezone.click();

			Select dropdown = new Select(timezone);

			dropdown.selectByVisibleText(" JST ");
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("clicking error");
		}

	}

	@Then("Navigate to the Home Page of Global Application")
	public void navigate_to_the_home_page_of_global_application() {

		try {
			WebElement checking = driver.findElement(By.linkText("Sign Up"));
		}

		catch (Exception e) {

			System.out.println("The page is working except login button");
		}
		driver.close();

	}

}
