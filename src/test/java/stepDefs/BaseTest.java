package stepDefs;
import driver.Driver;
import helperMethods.Helper;
import inputPage.FindPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {


    protected Helper helper = new Helper();
    protected FindPage findPage = new FindPage();
    protected WebDriver driver = Driver.getDriver();
}
