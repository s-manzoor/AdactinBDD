package stepDef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {
    public static WebDriver driver;
     //Login log = new Login(driver);
    String userName = "sajidmanzoor";
    String invalidUser = "sajid";
    String password = "webdir123R";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
       //  System.setProperty("webdriver.gecko.driver", "D:\\Automation\\Selenium Drivers\\geckodriver.exe");
       // driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://adactin.com/HotelApp/index.php");
    }


    @After
    public void tearDown() {
     driver.quit();
    }
}