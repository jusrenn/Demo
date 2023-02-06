*** Settings ***
Library    SeleniumLibrary

Variables    ../Locators/Locators.py
Variables    ../TestData/TestData.py

*** Keywords ***
Vahvista ostoskorin lisätyt tuotteet.
    ${productName}    Get Text    ${productsListShoppingCartPage}
    Should Contain    ${productName}    ${testData}