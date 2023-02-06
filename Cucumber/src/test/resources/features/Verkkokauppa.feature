@wip
Feature: US001 Käyttäjän pitäisi pystyä ostaa verkkokauppa.com:sta tuotteita.
  Scenario Outline: Käyttäjä etsii ja ostaa verkkokauppa.com:ssa tuotteita.
    * Menee verkkokauppa.com nettisivulle.
    * Kirjoita searchbox:lle "<String>" ja paina enter:lle.
    * Klikkaa ensimmäistä tuotetta.
    * Vahvista että onko oikea tuote valittu.
    * Lisää ostoskoriin.
    * Vahvista ostoskorin lisätyt tuotteet.
    * Sulje browser.

    Examples:
    |String                   |
    |Microsoft Xbox Series S  |
    |Apple iPad Air M1        |
    |Apple MacBook Air        |