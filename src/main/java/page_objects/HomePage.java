package page_objects;

import BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class HomePage extends BasePage {

    @FindBy(name = "q")
    public WebElement search;
    @FindBy(className = "gNO89b")
    public WebElement inputButton;

    private HomePage inputText(String str){
        helper.sendKeys(search,str);
        return this;
    }
    private HomePage clickSearchButton(){
        helper.click(inputButton);
        return this;
    }
    public void search (String str){
        inputText(str)
                .clickSearchButton();
    }

}
