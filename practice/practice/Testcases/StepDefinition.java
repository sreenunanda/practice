package Testcases;

import cucumber.api.java.en.Given;

public class StepDefinition {


		@Given("^I want to write a step with precondition$")
		public void user_is_on_Home_Page() throws Throwable {
			Functions functions=new Functions();
			functions.Login();
	}

}
