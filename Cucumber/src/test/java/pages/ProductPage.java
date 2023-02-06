package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductPage {

    @FindBy(css = "h1.bMiyvm")
    public WebElement productTitle;

    @FindBy(id = "allow-cookies")
    public WebElement cookiesButton;

    @FindBy(xpath = "(//button[@class='Button-sc-mt7im1-0 ggMRgF sc-1fb8oq9-0 guGhVJ'])[1]")
    public WebElement addToCartButton;

    @FindBy(id = "header-cart-button")
    public WebElement cartButton;

    @FindBy(xpath = "//a[@class='Button-sc-mt7im1-0 sc-1xt0o2a-0 eUDpYN gWbznf']")
    public WebElement shoppingCartButton;

    public ProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
