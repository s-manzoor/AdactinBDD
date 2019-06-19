package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@CucumberOptions(features = {"src/test/feature/Login_Test.feature", "src/test/feature/Search_Hotel.feature", "src/test/feature/Select_Hotel.feature" },
        glue = "stepDef",
        plugin = {"html:target/cucumber-html-report/", "pretty", "json:target/cucumber-reports/Cucumber.json", "testng:targe/cucumber-reports/Cucumber.xml"},
        tags = {"~@SmokeTests","~@RegressionTests"},
monochrome = true
)

public class Runner extends AbstractTestNGCucumberTests {
   /*     public static WebDriver driver;
        //Login log = new Login(driver);
        String userName = "sajidmanzoor";
        String invalidUser = "sajid";
        String password = "webdir123R";

        @Before
        public void setup() {
                System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("http://adactin.com/HotelApp/index.php");
        }



        @After
        public void tearDown() {
                driver.close();
        }*/
}

