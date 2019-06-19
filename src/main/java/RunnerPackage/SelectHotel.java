package RunnerPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import stepDef.Hooks;

import java.util.List;

public class SelectHotel {
    public SelectHotel(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void tableData() {
        Hooks hook = new Hooks();
        List<WebElement> col = hook.driver.findElements(By.xpath("//table[@class='login']/tbody/tr[2]/td/table/tbody/tr[1]/td"));
        System.out.println("No of columns are: " + col.size());

        List<WebElement> rows = hook.driver.findElements(By.xpath("//table[@class='login']/tbody/tr[2]/td/table/tbody/tr/td[2]"));
        System.out.println("No of rows are :" +rows.size());
      /*  try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
         WebElement baseTable = hook.driver.findElement(By.className("login"));
        WebElement tableRow = baseTable.findElement(By.xpath("//table[@class='login']/tbody/tr[2]/td/table/tbody/tr[2]"));
        WebElement CellNeeded = tableRow.findElement(By.xpath("//table[@class='login']/tbody/tr[2]/td/table/tbody/tr[3]/td[1]/input[1]"));

        System.out.println(CellNeeded.isEnabled());
        System.out.println(CellNeeded.isDisplayed());

//        WebElement CellNeeded = hook.driver.findElement(By.xpath(" /html[1]/body[1]/table[2]/tbody[1]/tr[2]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]"));

        CellNeeded.click();

    }

    @FindBy (id = "continue")
    public WebElement continueBtn;

    @FindBy (id = "cancel")
    public WebElement cancelBtn;

    public void continueBtnClick(){
        continueBtn.click();
    }
    public void cancelBtnClick(){
        cancelBtn.click();
    }

/*    @FindBy(id = "radiobutton_1")
    public WebElement radioButton01;

    @FindBy(id = "radiobutton_2")
    public WebElement radioButton02;

    @FindBy(id = "radiobutton_3")
    public WebElement radioButton03;

    @FindBy(id = "radiobutton_4")
    public WebElement radioButton04;



    public void radioButton01_Click(){
        radioButton01.click();
    }

    public void radioButton02_Click(){
        radioButton02.click();
    }

    public void radioButton03_Click(){
        radioButton03.click();
    }

    public void radioButton04_Click(){
        radioButton04.click();
    }

   public void assertionMethod(){  // Wrote only for testing purposes
        Hooks hook = new Hooks();
        Assert.assertTrue(hook.driver.getTitle().contains("Book A Hotel"));
    }
*/

}