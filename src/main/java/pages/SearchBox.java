package pages;

import configuration.common.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static configuration.common.GlobalReUsableMethods.*;
import static elements.SearchBoxElement.*;

public class SearchBox extends WebTestBase {
    public SearchBox() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = enterValidProductNameInSearchBoxWebElement)
    public WebElement enterValidProductNameInSearchBox;
    @FindBy(xpath = clickOnSearchButtonWebElement)
    public WebElement clickOnSearchButton;
    @FindBy(xpath = verifySearchProductWebElement)
    public WebElement verifySearchProduct;

    public void checkValidProductNameInSearchBoxFunctionality() {
        enterValidProductNameInSearchBox.clear();
        enterValueOnElement(enterValidProductNameInSearchBox, "sunglasses");

    }

    public void checkSearchButtonFunctionality() {
        clickOnElement(clickOnSearchButton);

    }

//    public void searchResultDisplayed(String expectedKeyWord) {
//        String actualSearchKeyword = verifySearchProduct.getText();
//        System.out.println("Actual Text: " + actualSearchKeyword);
//        Assert.assertEquals(actualSearchKeyword, expectedKeyWord, "Search keyword not match");
//    }
}
