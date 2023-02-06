package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchPage;
import pages.ShoppingCartPage;
import utilities.*;

public class Verkkokauppa {

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    static String product;

    @Given("Menee verkkokauppa.com nettisivulle.")
    public void menee_verkkokauppa_com_nettisivulle() {
        Driver.getDriver().get(ConfigReader.getProperty("verkkokauppaURL"));
    }
    @Given("Kirjoita searchbox:lle {string} ja paina enter:lle.")
    public void kirjoita_searchbox_lle_ja_paina_enter_lle(String string) {
        homePage.searchBox.sendKeys(string + Keys.ENTER);
        product = string;
    }
    @Given("Klikkaa ensimmäistä tuotetta.")
    public void klikkaa_ensimmäistä_tuotetta() {
        ReusableMethods.waitFor(1);
        searchPage.productsList.get(0).click();
    }
    @Given("Vahvista että onko oikea tuote valittu.")
    public void vahvista_että_onko_oikea_tuote_valittu() {
        ReusableMethods.waitFor(1);
        if(ReusableMethods.elementIsVisible(productPage.cookiesButton)) {
            productPage.cookiesButton.click();
        }
        Assert.assertTrue(productPage.productTitle.getText().contains(product));
    }
    @Given("Lisää ostoskoriin.")
    public void lisää_ostoskoriin() {
        ReusableMethods.waitFor(1);
        productPage.addToCartButton.click();
        productPage.cartButton.click();
        productPage.shoppingCartButton.click();
    }
    @Given("Vahvista ostoskorin lisätyt tuotteet.")
    public void vahvista_ostoskorin_lisätyt_tuotteet() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(shoppingCartPage.productList.get(0).getText().contains(product));
    }
    @Given("Sulje browser.")
    public void sulje_browser() {
        ReusableMethods.waitFor(1);
        Driver.quit();
    }
}
