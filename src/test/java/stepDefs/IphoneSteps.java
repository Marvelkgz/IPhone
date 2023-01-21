package stepDefs;

import dataProvider.ConfigReader;
import driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import org.junit.AfterClass;
import org.junit.jupiter.api.Assertions;


public class IphoneSteps extends BaseTest {

    @Given("Go to login page")
    public void go_to_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Given("write {string} enter")
    public void write_enter(String str) {
        homePage.search("IPhone");
    }

    @Given("find page store")
    public void find_page_store() throws InterruptedException {
        Thread.sleep(1000);
        Assertions.assertTrue(
                resultPage.getListOfSitesAsString().stream().anyMatch(s -> s.contains("https://softech.kg")));
    }


}
