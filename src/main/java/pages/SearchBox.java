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
    //==================================================================================================
    @FindBy(xpath = enterInValidProductNameInSearchBoxWebElement)
    public WebElement enterInValidProductNameInSearchBox;
    @FindBy(xpath = userShouldSeePartialMatchedProductWebElements)
    public WebElement userShouldSeePartialMatchedProduct;
    //================================================================================================
    @FindBy(xpath = clickOnFreeShippingByAmazonCheckBoxWebElement)
    public WebElement clickOnFreeShippingByAmazonCheckBox;
    @FindBy(xpath = enterMinimumPriceInPriceEditFieldWebElement)
    public WebElement enterMinimumPriceInPriceEditField;
    @FindBy(xpath = enterMaximumPriceInPriceEditFieldWebElement)
    public WebElement enterMaximumPriceInPriceEditField;
    @FindBy(xpath = clickOnGoButtonWebElement)
    public WebElement clickOnGoButton;
    @FindBy(xpath = verifyAllProductsDisplayedProperly)
    public WebElement verifyAllProductsDisplayed;

//====================================================================================================
@FindBy(xpath = userShouldBeAbleToClickOnAllDropDownListWebElement)
public WebElement userShouldBeAbleToClickOnAllDropDownList;
  @FindBy(xpath = userShouldBeAbleToClickOnAlexaSkillsLinkWebElement)
public WebElement userShouldBeAbleToClickOnAlexaSkillsLink;
@FindBy(xpath = userHoverTheMouseOnFeaturesAndSkillsLinkWebElement)
public WebElement userHoverTheMouseOnFeaturesAndSkillsLink;
  @FindBy(xpath = userCanSelectEntertainmentFromTheListWebElement)
public WebElement userCanSelectEntertainmentFromTheList;
  @FindBy(xpath = verifyAlexaEntertainmentDisplayedOnThePage)
public WebElement verifyAlexaEntertainmentDisplayed;


    public void enterValidProductNameInSearchBoxFunctionality(String productName) {
        enterValidProductNameInSearchBox.clear();
        enterValueOnElement(enterValidProductNameInSearchBox, productName);
    }
    public void clickSearchButtonFunctionality() {
        clickOnElement(clickOnSearchButton);

    }
    //    public void searchResultDisplayed(String expectedKeyWord) {
//        String actualSearchKeyword = verifySearchProduct.getText();
//        System.out.println("Actual Text: " + actualSearchKeyword);
//        Assert.assertEquals(actualSearchKeyword, expectedKeyWord, "Search keyword not match");
//    }
    public void enterInValidProductNameInSearchBoxFunctionality(String productName) {
        enterValidProductNameInSearchBox.clear();
        enterValueOnElement(enterInValidProductNameInSearchBox, productName);
    }

    //=========================================================================================================================
    public void clickOnFreeShippingByAmazonCheckBoxFunctionality() {
        clickOnElement(clickOnFreeShippingByAmazonCheckBox);

    }

    public void enterMinimumPriceInPriceEditFieldFunctionality(String productMaxPrice) {
        enterMinimumPriceInPriceEditField.clear();
        enterValueOnElement(enterMinimumPriceInPriceEditField, productMaxPrice);
    }

    public void enterMaximumPriceInPriceEditFieldFunctionality(String productMinPrice) {
        enterMaximumPriceInPriceEditField.clear();
        enterValueOnElement(enterMaximumPriceInPriceEditField, productMinPrice);
    }

    public void clickOnGoButtonFunctionality() {
        clickOnElement(clickOnGoButton);

    }
    //=====================================================================================================
    public void clickOnAllDropDownListMenu(){
        clickOnElement(userShouldBeAbleToClickOnAllDropDownList);
    }
    public void clickOnAlexaSkillsLink(){
        clickOnElement(userShouldBeAbleToClickOnAlexaSkillsLink);
    }
    public void HoverTheMouseOnFeaturesAndSkillsLink(){
        mouseHoverByXpath("//a[normalize-space()='Features and Skills']");

    }
    public void userCanSelectEntertainmentFromTheList(){
        clickOnElement(userCanSelectEntertainmentFromTheList);
    }




}
