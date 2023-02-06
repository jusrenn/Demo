*** Settings ***
Library    SeleniumLibrary

Resource    ../Resources/Keywords/HomePage.robot
Resource    ../Resources/Keywords/SearchPage.robot
Resource    ../Resources/Keywords/ProductPage.robot
Resource    ../Resources/Keywords/ShoppingCartPage.robot
Resource    ../Utilities/TestBase.robot

Suite Setup    SetUp
Suite Teardown    TearDown

*** Test Cases ***
US001 Käyttäjän pitäisi pystyä ostaa verkkokauppa.com:sta tuotteita.
    [Documentation]    Käyttäjä etsii ja ostaa verkkokauppa.com:ssa tuotteita.
    Kirjoita searchbox:lle ja paina enter:lle.    ${testData}
    Klikkaa ensimmäistä tuotetta.
    Vahvista että onko oikea tuote valittu.
    Lisää ostoskoriin.
    Vahvista ostoskorin lisätyt tuotteet.