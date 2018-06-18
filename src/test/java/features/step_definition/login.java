package features.step_definition;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utilities.driver;

public class login {
  @Given("^I am on Home page$")
  public void given() throws Throwable {
	  driver.visit("http://www.linkedin.com");
  }
  
  @Given("^I Enter \"([^\"]*)\" into \"([^\"]*)\"$")
  public void i_Enter_into(String arg1, String field) throws Throwable {
	  driver.browser.findElement(By.xpath("//input[@placeholder='"+field+"']")).sendKeys(arg1);
  }
  
  @When("^I Submit to sign in$")
  public void i_submit_to_sign_in() throws Throwable {
	  driver.browser.findElement(By.xpath("//input[@value='Sign in']")).click();	  
  }
}
