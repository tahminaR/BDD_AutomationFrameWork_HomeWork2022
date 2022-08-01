Feature: SearchBox Functionality

  Background:
    Given user is landed on amazon homepage

  @RegressionTest @pending1
  Scenario: SearchBox functionality should work with a valid product name
    And user should be able to enter valid product name
    When user should be able to click on search button
    Then user should see the valid product appears


  @pending2
  @RegressionTest
  Scenario: SearchBox functionality should not work with a Invalid product name
    And user should be able to enter invalid product name
    When user should be able to click on search button
    Then user should see the partial matched product appears


  @RegressionTest @pending3
  Scenario Outline: checking Amazon search box functionality using valid products name
    And user should be able to enter valid "<productName>"
    And user should be able to click on search button
    And user should be able to click on Free Shipping by Amazon
    And user should be able to enter Minimum price in price edit field
    And user should be able to enter Maximum price in price edit field
    When users should be able to click on Go button
    Then users should able to see "<productName>" displayed
    Examples:
      | productName                   |
      | Bluetooth earbuds             |
      | air purifier                  |
      | Coffee Gator Espresso Machine |
      | airpods pro case              |
      | speaker home theater system   |


  @RegressionTest @pending4
  Scenario Outline: SearchBox functionality should work with a valid product name using Scenario outline
    And user enter valid "<productName>" products name
    When user should be able to click on search button
    Then user should see the valid "<expectedProduct>" products appears

    Examples:
      | productName | expectedProduct |
      | WATCHES     | WATCHES         |
      | JEWELRY     | JEWELRY         |
      | HANDBAGS    | HANDBAGS        |


  @RegressionTest @pending5
  Scenario Outline:  SearchBox functionality should work with a valid product name
    And user enter "HANDBAGS" valid product name
    When user should be able to click on search button
#    Then user should see "HANDBAGS" the valid product appears
    Then users should able to see "<productName>" displayed
    Examples:
      | productName |
      | HANDBAGS    |


  @RegressionTest
  Scenario: Amazon SearchBox functionality should have menu
    And user should be able to click on "all" drop down list in the searchBox
    And user should be able to click on "Alexa Skills" link
    And user should be able to click on search button
    When user hover the mouse on "Features and Skills" link
    And user can select "Entertainment" from the list
    Then user should see the "Alexa Entertainment" displayed






#    #Scenario outline : To pass multiple set of data in one test case
#  @RegressionTest @pending
#  Scenario Outline: SearchBox functionality should work with a valid product name using Scenario outline
#    And user enter valid "<product Name>" products name
#    When user click on search button
#    Then user should see the valid "<expected Product>" products appears "<age>"
#
#    Examples:
#      | product Name   | expected Product | age |
#      | Mask           | Mask             | 23  |
#      | Hand Sanitizer | Hand Sanitizer   | 45  |
#      | iphone 14      | iphone 14        | 56  |
#
#
#    #Data Table
#  @RegressionTest
#  Scenario: SearchBox functionality should work with a valid products name
#    And user enter valid product name for search
#      | product Name |
#      | T-shirt      |
#    When user click on search button
#    Then user should see the valid product appears after search
#      | Expected product Name |
#      | T-shirt               |
#
#
#  @RegressionTest @pending
#  Scenario: Amazon user should login with valid credential
#    And user enter valid user name & password
#      | user name | password |
#      | mahmud    | Test123  |
#    When user click on signIn button
#    Then user should see profile name
#
#
##  Scenario: Searching a valid product should show us available products qty

