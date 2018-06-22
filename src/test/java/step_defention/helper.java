package step_defention;

import java.util.Scanner;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class helper {
	@When("^I wait for (\\d+) seconds$")
	public void i_wait_for_seconds(int time) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(time*1000);
	}
	
	@Given("^I pause$")
	public void i_pause() throws Throwable {
		 System.out.println("Press \"ENTER\" to continue...");
		   Scanner scanner = new Scanner(System.in);
		   scanner.nextLine();
	}
}
