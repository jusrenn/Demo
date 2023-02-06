package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ShoppingCartPage {

    @FindBy(css = "a.sc-1o4yd01-4")
    public List<WebElement> productList;

    public ShoppingCartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
