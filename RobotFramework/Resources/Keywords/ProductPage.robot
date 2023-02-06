*** Settings ***
Library    SeleniumLibrary

Variables    ../Locators/Locators.py
Variables    ../TestData/TestData.py

*** Keywords ***
Vahvista että onko oikea tuote valittu.
    ${productTitle}    Get Text    ${productTitle}
    Should Contain    ${productTitle}    ${testData}

Lisää ostoskoriin.
    Click Button    ${cookiesButton}
    Click Button    ${addToCartButton}
    Sleep    1
    Mouse Over    ${cartButton}
    Click Link    ${shoppingCartButton}
    Sleep    1