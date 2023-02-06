*** Settings ***
Library    SeleniumLibrary

Variables    ../Locators/Locators.py

*** Keywords ***
Klikkaa ensimmäistä tuotetta.
    Click Link    ${productsListSearchPage}
    Sleep    1