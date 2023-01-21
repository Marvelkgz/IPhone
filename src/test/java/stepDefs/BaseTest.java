package stepDefs;

import BasePage.BasePage;
import driver.Driver;
import helperMethods.Helper;

import io.cucumber.java.After;
import org.junit.AfterClass;
import org.junit.jupiter.api.AfterAll;
import page_objects.HomePage;
import org.openqa.selenium.WebDriver;
import page_objects.ResultPage;

public abstract class BaseTest {


    protected Helper helper = new Helper();
    protected HomePage homePage = new HomePage();
    protected ResultPage resultPage = new ResultPage();
    protected WebDriver driver = Driver.getDriver();
    protected Hooks hooks = new Hooks();
    protected BasePage basePage = new BasePage();
}
