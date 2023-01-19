package stepDefs;

import dataProvider.ConfigReader;
import driver.Driver;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;


public class IphoneSteps extends BaseTest {
    @Given("Go to login page")
    public void go_to_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Given("write {string} enter")
    public void write_enter(String str) {
        findPage.openPage("IPhone");
        findPage.Click();
    }

    @Given("find page store")
    public void find_page_store() {
        Assertions.assertEquals("https://www.istore.kg", helper.getText(findPage.Assertions));
        driver.close();


    }
}
