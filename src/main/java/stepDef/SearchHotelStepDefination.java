package stepDef;

import RunnerPackage.Login;
import RunnerPackage.SearchHotel;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SearchHotelStepDefination {

   public Hooks hook = new Hooks();
   public SearchHotel searchHotel;
   public Login log;

    @Given("^User is on Hotel Search page$")
    public void user_is_on_Hotel_Search_page()  {
        // Write code here that turns the phrase above into concrete actions
      log = new Login(hook.driver);
      log.loginMethod("sajidmanzoor","webdir123R");
      log.loginClick();
      System.out.println("User is on Select Hotel Page...");
     // Assert.assertTrue(hook.driver.getTitle().contains("Search Hotel"));
    }

    @When("^Provide hotel search criteria$")
    public void provide_hotel_search_criteria()  {
        // Write code here that turns the phrase above into concrete actions

        searchHotel = new SearchHotel(hook.driver);
      /*  searchHotel.setLocation();
        searchHotel.setHotel();
        searchHotel.setroomType();
        searchHotel.setNumberofRooms();
        searchHotel.setCheckInDate();
        searchHotel.setCheckOutDate();
        searchHotel.setAdultsperRoom();
        searchHotel.setChildperRoom();*/

        searchHotel.SearchHotelMethod();

    }

    @When("^click Search button$")
    public void click_Search_button()  {
        // Write code here that turns the phrase above into concrete actions
        searchHotel = new SearchHotel(hook.driver);
        searchHotel.SearchClick();

    }

    @Then("^Select Hotel page is displayed$")
    public void select_Hotel_page_is_displayed()  {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(hook.driver.getTitle().contains("Select Hotel"));
        System.out.println("Search page test is executed...");
    }
}
