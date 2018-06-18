package features.step_definition;

import java.util.Scanner;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import utilities.driver;

public class helper {
	@Given("^I wait for (\\d+) seconds$")
	public void i_wait_for_seconds(int time) throws Throwable {
		Thread.sleep(time*1000);
	}
	
	@Given("^I pause$")
	public void i_pause() throws Throwable {
		 System.out.println("Press \"ENTER\" to continue...");
		   Scanner scanner = new Scanner(System.in);
		   scanner.nextLine();
	}
}
