package stepDef;

import RunnerPackage.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class loginStepDefination {

   // public static WebDriver driver;
    public Hooks hook = new Hooks(); // Inherited with Parent class
    public Login log1;  // Inherited with Parent class

   @Given("^User provides login credentials$")
    public void user_provides_login_credentials() {
        System.out.println("Test message 01");

        log1 = new Login(hook.driver);
        log1.loginMethod("sajidmanzoor", "webdir123R");
    }

    @When("^User clicks Login button$")
    public void user_clicks_Login_button()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test message 02");

        log1 = new Login(hook.driver); // We initialized it in every Method to call Page Factory initElement constractor otherwise it returns Null Pointer Exception
        log1.loginClick();
    }

    @Then("^SearchHotel page is displayed$")
    public void searchhotel_page_is_displayed()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test message 03");
        Assert.assertTrue(hook.driver.getTitle().contains("Search Hotel"));

    }

    @Given("^User provides invalid login credentials$")
    public void user_provides_invalid_login_credentials()  {
        // Write code here that turns the phrase above into concrete actions
        log1 = new Login(hook.driver);
        log1.loginMethod("sajidmanzoor", "webdir123");
    }

    @Then("^Login failure error message is displayed$")
    public void login_failure_error_message_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(log1.loginError.getText(), "Invalid Login details or Your Password might have expired. Click here to reset your password");
    }

}
