*** Settings ***
Library    SeleniumLibrary

Variables    ../Locators/Locators.py

*** Keywords ***
Kirjoita searchbox:lle ja paina enter:lle.
    [Arguments]    ${product}
    Input Text    ${searchBox}    ${product}
    Press Keys    None    RETURN
    Sleep    2