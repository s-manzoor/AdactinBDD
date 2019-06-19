package testPackage;

import RunnerPackage.SearchHotel;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SearchHotelStepDefinationTest {
    public static WebDriver driver;
    SearchHotel obj1 = new SearchHotel(driver);


    @Test
    public void print(){
        obj1.print();
    }

}
