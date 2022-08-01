package elements;

public class SearchBoxElement {

    public static final String enterValidProductNameInSearchBoxWebElement="//input[@aria-label='Search']";
    public static final String clickOnSearchButtonWebElement="//input[@value='Go']";
    public static final String verifySearchProductWebElement="//span[@class='a-color-state a-text-bold']";
//==========================================================================================================
    public static final String enterInValidProductNameInSearchBoxWebElement="//input[@aria-label='Search']";
    public static final String userShouldSeePartialMatchedProductWebElements="//span[@data-component-type='s-search-results']//div//div//div//div//div//h1";
    //====================================================================================================================================
    public static final String clickOnFreeShippingByAmazonCheckBoxWebElement="//li[@aria-label='Free Shipping by Amazon']//span//a//div//label//i";
    public static final String enterMinimumPriceInPriceEditFieldWebElement="//input[@placeholder='Min']";
    public static final String enterMaximumPriceInPriceEditFieldWebElement="//input[@placeholder='Max']";
    public static final String clickOnGoButtonWebElement="//form[@method='get']//span//span//input[@type='submit']";
    public static final String verifyAllProductsDisplayedProperly="//span[@class='a-color-state a-text-bold']";
//===========================================================================================================
public static final String userShouldBeAbleToClickOnAllDropDownListWebElement="//select[@id='searchDropdownBox']";
    public static final String userShouldBeAbleToClickOnAlexaSkillsLinkWebElement="//select[@id=\"searchDropdownBox\"]/option[2]";
    public static final String userHoverTheMouseOnFeaturesAndSkillsLinkWebElement="//a[normalize-space()='Features and Skills']";
    public static final String userCanSelectEntertainmentFromTheListWebElement="//div[@id='nav-section-0']//ul//a[@class='color-squid-ink'][normalize-space()='Entertainment']";
    public static final String verifyAlexaEntertainmentDisplayedOnThePage="//h1[text()='Alexa Entertainment']";



}
