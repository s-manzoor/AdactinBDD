package testPackage;

import RunnerPackage.Login;
import RunnerPackage.SearchHotel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
    public static WebDriver driver;
     //Login log = new Login(driver);
    String userName = "sajidmanzoor";
    String invalidUser = "sajid";
    String password = "webdir123R";


    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://adactin.com/HotelApp/index.php");
    }

    @Test(priority = 1)
    public void validLogin() throws InterruptedException{
       Login log = new Login(driver);
        log.loginMethod(userName, password);
        log.loginClick();
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Explicit wait
      // Assert.assertEquals (log.loginVerification.getAttribute("value"), "Hello SajidManzoor!");
       Assert.assertTrue(log.loginVerification.isDisplayed());
    }

    @Test(priority = 0)
    public void invalidLogin() {
        Login log = new Login(driver);
        log.loginMethod(invalidUser, password);
        log.loginClick();

        Assert.assertEquals(log.loginError.getText(), "Invalid Login details or Your Password might have expired. Click here to reset your password");
    }

/*   @Test(priority = 100)
    public void Logout() {
        Login log = new Login(driver);
       log.Logout();
       //   log.clickChangePassword();
       Assert.assertEquals(log.logoutMessage.getText(),"You have successfully logged out. Click here to login again");
    }

*/
    @Test (priority = 2)
    public void HotelSearchTest() throws InterruptedException{
        SearchHotel obj = new SearchHotel(driver);
           obj.setLocation("Sydney");
           obj.setHotel("Hotel Creek");
           obj.setroomType("Standard");
           obj.setNumberofRooms("1 - One");
           obj.setCheckInDate("16/05/2019");
           obj.setCheckOutDate("17/05/2019");
           obj.setAdultsperRoom("1 - One");
           obj.setChildperRoom("1 - One");
           obj.SearchClick();
      Assert.assertTrue(driver.getTitle().contains("Select Hotel"));
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}