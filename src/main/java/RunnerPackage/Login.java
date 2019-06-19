package RunnerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

   public Login(WebDriver driver) {

       PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username") private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login")
    private WebElement loginBtn;

    @FindBy(linkText = "Logout")
    private WebElement Logout;

  //  @FindBy(css = ".auth_error")
   // public WebElement loginError;
    @FindBy(className = "auth_error")
    public WebElement loginError;

    @FindBy(id = "username_show")
    public WebElement loginVerification;

    @FindBy(className = "reg_success")
    public WebElement logoutMessage;

    @FindBy (linkText = "Change Password")
    public WebElement changePassword;

    public void setUsername(String user) { // Setter
        userName.clear();
        userName.sendKeys(user);

    }

    public void setPassword(String pwd) {
        password.clear();
        password.sendKeys(pwd);
    }

    public void loginClick() {
        loginBtn.click();
    }

    public void Logout() {
        Logout.click();
    }

    public void clickChangePassword(){
        changePassword.click();

    }
    public void loginMethod(String userName, String password) { // Getter
        setUsername(userName);
        setPassword(password);
       // loginClick();

    }

    /*  public void loginMethod (WebDriver driver, String userName, String password) {
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login")).click();
   }
*/


}
