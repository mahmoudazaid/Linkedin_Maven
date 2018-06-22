package step_defention;

import javax.mail.Message;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilities.EmailUtils;

public class email_utils {
	private static EmailUtils emailUtils;
	
	@Given("^Connect to Email$")
	public static void connectToEmail() {
	    try {
	      emailUtils = new EmailUtils("mabuzaid.automation@gmail.com", "Test@123", "smtp.gmail.com", EmailUtils.EmailFolder.INBOX);
	    } catch (Exception e) {
	      e.printStackTrace();
	      Assert.fail(e.getMessage());
	    }
	  }
	
	@Then("^Email with subject \"([^\"]*)\" contains \"([^\"]*)\"$")
	public void email_contains(String subject,String text) throws Throwable {
		try{
		    Message email = emailUtils.getMessagesBySubject(subject, true, 5)[0];
		    Assert.assertTrue(text, emailUtils.isTextInMessage(email, text));
		    } catch (Exception e) {
		      e.printStackTrace();
		      Assert.fail(e.getMessage());
		    }
		  }


}
