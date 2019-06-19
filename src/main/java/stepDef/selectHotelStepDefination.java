package stepDef;

import RunnerPackage.Login;
import RunnerPackage.SearchHotel;
import RunnerPackage.SelectHotel;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class selectHotelStepDefination {
    public Hooks hook = new Hooks();
    public Login log;
    public SearchHotel searchHotel;
    public SelectHotel selectHotel;

    @Given("^User is on Select Hotel page$")
    public void user_is_on_Select_Hotel_page()  {
        // Write code here that turns the phrase above into concrete actions
       log = new Login(hook.driver);
       log.loginMethod("sajidmanzoor","webdir123R");
       log.loginClick();

       searchHotel = new SearchHotel(hook.driver);
       searchHotel.SearchHotelMethod();
       searchHotel.SearchClick();
    }

    @When("^Select a hotel$")
    public void select_a_hotel()  {
        // Write code here that turns the phrase above into concrete actions

        selectHotel = new SelectHotel(hook.driver);
        selectHotel.tableData();
//        selectHotel.radioButton01_Click();
        selectHotel.continueBtnClick();

       // throw new PendingException();
    }

    @Then("^Booking confirmation page is displayed$")
    public void booking_confirmation_page_is_displayed()  {

        // Write code here that turns the phrase above into concrete actions
       Assert.assertTrue(hook.driver.getTitle().contains("Book A Hotel"));

      // throw new PendingException();
    }

}

