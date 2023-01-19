package inputPage;

import BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class FindPage extends BasePage {

    @FindBy(name = "q")
    public WebElement search;
    @FindBy(className = "gNO89b")
    public WebElement inputButton;
    @FindBy(xpath = "(//div[@class='TbwUpd NJjxre'])[3]")
    public WebElement Assertions;

    public FindPage openPage(String str){
        helper.sendKeys(search,str);
        return this;
    }
    public FindPage Click(){
        helper.click(inputButton);
        return this;
    }

}
