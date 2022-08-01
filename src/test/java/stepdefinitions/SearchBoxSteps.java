package stepdefinitions;


import configuration.common.WebTestBase;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.SearchBox;

import static configuration.common.GlobalReUsableMethods.*;

public class SearchBoxSteps extends WebTestBase {

    SearchBox searchBox;

    @BeforeStep

    public void getInit() {
        searchBox = PageFactory.initElements(driver, SearchBox.class);
    }

    @Given("user is landed on amazon homepage")
    public void user_is_landed_on_amazon_homepage() {
        System.out.println("Amazon HomePage landed");
    }

    @And("user should be able to enter valid product name")
    public void userShouldBeAbleToEnterValidProductName() {
        searchBox.enterValidProductNameInSearchBoxFunctionality("sunglasses");
    }

    @When("user should be able to click on search button")
    public void userShouldBeAbleToClickOnSearchButton() throws InterruptedException {
        searchBox.clickSearchButtonFunctionality();
        waitFor(5);
    }

    @Then("user should see the valid product appears")
    public void userShouldSeeTheValidProductAppears() throws InterruptedException {
        verifyText(searchBox.verifySearchProduct, "\"sunglasses\"", "text does not match");
        waitFor(3);
    }

    //=============================================================================================================
    @And("user should be able to enter invalid product name")
    public void userShouldBeAbleToEnterInvalidProductName() throws InterruptedException {
        searchBox.enterInValidProductNameInSearchBoxFunctionality("flowar");
        waitFor(5);
    }

    @Then("user should see the partial matched product appears")
    public void user_should_see_the_partial_matched_product_appears() throws InterruptedException {
        verifyText(searchBox.userShouldSeePartialMatchedProduct, "Did you mean flower", "text does not match");
        waitFor(3);
    }

    //======================================================================================================
    @Given("user enter valid {string} products name")
    public void user_enter_valid_products_name(String productName) {
        searchBox.enterValidProductNameInSearchBoxFunctionality(productName);
    }

    @Then("user should see the valid {string} products appears")
    public void user_should_see_the_valid_products_appears(String expectedProduct) throws InterruptedException {
        verifyText(searchBox.verifySearchProduct, "\"" + expectedProduct + "\"", "Product name does not match");
        waitFor(6);
        System.out.println("***************************verified product:********************** " + expectedProduct);
        System.out.println("***************************verified product:********************** " + expectedProduct);
    }

    //==============================================================================================================================
    @And("user should be able to enter valid {string}")
    public void userShouldBeAbleToEnterValid(String productName) {
        searchBox.enterValidProductNameInSearchBoxFunctionality(productName);
    }

    @And("user should be able to click on Free Shipping by Amazon")
    public void userShouldBeAbleToClickOnFreeShippingByAmazon() {
        searchBox.clickOnFreeShippingByAmazonCheckBoxFunctionality();

    }

    @And("user should be able to enter Minimum price in price edit field")
    public void userShouldBeAbleToEnterMinimumPriceInPriceEditField() {
        searchBox.enterMinimumPriceInPriceEditFieldFunctionality("50");
    }

    @And("user should be able to enter Maximum price in price edit field")
    public void userShouldBeAbleToEnterMaximumPriceInPriceEditField() {
        searchBox.enterMaximumPriceInPriceEditFieldFunctionality("200");
    }

    @When("users should be able to click on Go button")
    public void usersShouldBeAbleToClickOnGoButton() {
        searchBox.clickOnGoButtonFunctionality();
    }

    @Then("users should able to see {string} displayed")
    public void usersShouldAbleToSeeDisplayed(String productName) throws InterruptedException {
        verifyText(searchBox.verifyAllProductsDisplayed, "\"" + productName + "\"", "Product name does not match");
        waitFor(6);
    }

    //=====================================================================================================================
    @And("user enter {string} valid product name")
    public void userEnterValidProductName(String productName) {
        searchBox.enterValidProductNameInSearchBoxFunctionality(productName);
    }

    @Then("user should see {string} the valid product appears")
    public void userShouldSeeTheValidProductAppears(String productName) throws InterruptedException {
        verifyText(searchBox.verifySearchProduct, productName, "text does not match");
        waitFor(3);
    }

    //======================================================================================================
    @And("user should be able to click on {string} drop down list in the searchBox")
    public void userShouldBeAbleToClickOnDropDownListInTheSearchBox(String stringValue) throws InterruptedException {
        searchBox.clickOnAllDropDownListMenu();
        waitFor(4);
    }

    @And("user should be able to click on {string} link")
    public void userShouldBeAbleToClickOnLink(String stringValue) throws InterruptedException {
        searchBox.clickOnAlexaSkillsLink();
        waitFor(5);
    }

    @When("user hover the mouse on {string} link")
    public void userHoverTheMouseOnLink(String stringValue) throws InterruptedException {
        searchBox.HoverTheMouseOnFeaturesAndSkillsLink();
        waitFor(3);
    }

    @And("user can select {string} from the list")
    public void userCanSelectFromTheList(String stringValue) throws InterruptedException {
        searchBox.userCanSelectEntertainmentFromTheList();
        waitFor(5);
    }

    @Then("user should see the {string} displayed")
    public void userShouldSeeTheDisplayed(String stringValue) throws InterruptedException {
        verifyText(searchBox.verifyAlexaEntertainmentDisplayed, "Alexa Entertainment", "text does not match");
        waitFor(3);
    }
    //=========================================================================


}






