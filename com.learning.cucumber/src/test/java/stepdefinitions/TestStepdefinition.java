package stepdefinitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestStepdefinition {
	WebDriver driver;
	private Scenario scenario;
	
	@Before
	public void setup(Scenario scenario) {
		System.out.println("framework setup");
		System.out.println("scenario outline > > > > : " + scenario.getName());
		WebDriverManager.chromedriver().version("84.0.4147.30").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationtesting.in/");
	}

	@After
	public void clean() {
		System.out.println("framework cleanup");
		driver.close();
	}
	
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() {
//		Assert.assertEquals(false, true);
	}

	@Given("I want to write a step with condition")
	public void enter_Details() {
		System.out.println("enter_Details for tag3");
	}

	@Given("Launch browser and start application")
	public void launch_browser_and_start_application() {
//		System.out.println("get the title of the page>> "+driver.getTitle());
		System.out.println("launch browser and started application successful");
		
	}

	@Given("^some other precondition$")
	public void some_other_precondition() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^I complete action$")
	public void i_complete_action() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^some other action$")
	public void some_other_action() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^yet another action$")
	public void yet_another_action() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) {
		HashMap<String, String> map=new HashMap<String, String>();
		List<HashMap<String, String>> list= new ArrayList<HashMap<String,String>>();
		list.add(map);
		
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() {
		// Write code here that turns the phrase above into concrete actions
	}

}
