*** Settings ***
Library    SeleniumLibrary

Variables    ../Resources/TestData/TestData.py

*** Keywords ***
SetUp
    Open Browser    ${verkkokauppaURL}    chrome
    Maximize Browser Window

TearDown
    Close All Browsers