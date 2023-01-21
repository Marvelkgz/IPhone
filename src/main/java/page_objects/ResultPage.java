package page_objects;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ResultPage extends BasePage {
    @FindBy(xpath = "//a//cite")
    public List<WebElement> listOfSites;

    public List<String> getListOfSitesAsString() {
        return listOfSites
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}
